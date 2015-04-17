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
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule;
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
 * An implementation of the model object '<em><b>Alt Sys Step NF To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltSysStepNFToComboRuleImpl extends AbstractRuleImpl implements
		AltSysStepNFToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltSysStepNFToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltSysStepNFToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, NamedFlow flow,
			UseCase useCase, PackageDeclaration packageDeclaration,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow) {
		// initial bindings
		Object[] result1_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_0_1_blackBBBBBBBBB(this,
						match, actor, flow, useCase, packageDeclaration, step,
						alt, altFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_0_2_bindingAndBlackFBBBBBBBBB(
						this, match, actor, flow, useCase, packageDeclaration,
						step, alt, altFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_4_blackBBBBBBBB(match,
							actor, flow, useCase, packageDeclaration, step,
							alt, altFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_4_greenBBBBBBFFFF(match,
							actor, flow, step, alt, altFlow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[6];
			// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result4_green[7];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[8];
			// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_5_blackBBBBBBBB(match,
							actor, flow, useCase, packageDeclaration, step,
							alt, altFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_5_greenBBBBBFFF(match,
							actor, flow, useCase, packageDeclaration);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[7];

			// register objects to match
			AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_6_expressionBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow);
			return AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_7_expressionF();
		} else {
			return AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		NamedFlow flow = (NamedFlow) result1_bindingAndBlack[2];
		InteractionOperand parentOperand = (InteractionOperand) result1_bindingAndBlack[3];
		FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result1_bindingAndBlack[4];
		CombinedFragment parentCombo = (CombinedFragment) result1_bindingAndBlack[5];
		Interaction interaction = (Interaction) result1_bindingAndBlack[6];
		UseCase useCase = (UseCase) result1_bindingAndBlack[7];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[8];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[9];
		NormalStep step = (NormalStep) result1_bindingAndBlack[10];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[11];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_1_greenBFBFFBBBBFFFFFBFB(
						line, parentOperand, parentCombo, interaction, step,
						alt, altFlow, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[3];
		CombinedFragment combo = (CombinedFragment) result1_green[4];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[9];
		InteractionOperand operand = (InteractionOperand) result1_green[10];
		StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result1_green[11];
		InteractionConstraint guard = (InteractionConstraint) result1_green[12];
		LiteralString spec = (LiteralString) result1_green[13];
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[15];

		// collect translated elements
		Object[] result2_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_2_blackBBBBBBBBBBBB(
						messageSend, messageReceive, combo, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_2_greenFBBBBBBBBBBBB(
						messageSend, messageReceive, combo, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, flow,
						parentOperand, flowToParentOperand, messageReceive,
						combo, parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_3_greenBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, flow,
						parentOperand, messageReceive, combo, parentCombo,
						interaction, step, alt, stepToCombo, operand,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[19];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[20];
		// EMoflonEdge parentOperand__messageSend____fragment = (EMoflonEdge) result3_green[21];
		// EMoflonEdge messageSend__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[22];
		// EMoflonEdge parentOperand__messageReceive____fragment = (EMoflonEdge) result3_green[23];
		// EMoflonEdge messageReceive__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[24];
		// EMoflonEdge line__parentOperand____coveredBy = (EMoflonEdge) result3_green[25];
		// EMoflonEdge parentOperand__line____covered = (EMoflonEdge) result3_green[26];
		// EMoflonEdge parentOperand__combo____fragment = (EMoflonEdge) result3_green[27];
		// EMoflonEdge combo__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[28];
		// EMoflonEdge line__parentCombo____coveredBy = (EMoflonEdge) result3_green[29];
		// EMoflonEdge parentCombo__line____covered = (EMoflonEdge) result3_green[30];
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[31];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[32];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[33];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[34];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[35];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[36];
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[37];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[38];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[39];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[40];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[41];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[42];
		// EMoflonEdge alternative1ToOperand__alt____source = (EMoflonEdge) result3_green[43];
		// EMoflonEdge alternative1ToOperand__operand____target = (EMoflonEdge) result3_green[44];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[45];
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[46];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[47];

		// perform postprocessing story node is empty
		// register objects
		AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend, flow,
						parentOperand, flowToParentOperand, messageReceive,
						combo, parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		NamedFlow flow = (NamedFlow) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[3];
		NormalStep step = (NormalStep) result2_binding[4];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[5];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[6];
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_2_2_blackBBFFFBFBBBBB(actor,
						flow, useCase, packageDeclaration, step, alt, altFlow,
						match)) {
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_2_3_blackBFBBBFBBBBBBB(
							actor, flow, parentOperand, flowToParentOperand,
							interaction, useCase, useCaseToInteraction,
							packageDeclaration, step, alt, altFlow)) {
				Lifeline line = (Lifeline) result3_black[1];
				CombinedFragment parentCombo = (CombinedFragment) result3_black[5];
				Object[] result3_green = AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
								actor, line, flow, parentOperand,
								flowToParentOperand, parentCombo, interaction,
								useCase, useCaseToInteraction,
								packageDeclaration, step, alt, altFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge flowToParentOperand__flow____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flowToParentOperand__parentOperand____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge parentCombo__parentOperand____operand = (EMoflonEdge) result3_green[16];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[17];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[18];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[19];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[22];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[23];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[24];
				// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[25];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[26];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[27];

				// solve CSP
				Object[] result4_bindingAndBlack = AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line, flow,
								parentOperand, flowToParentOperand,
								parentCombo, interaction, useCase,
								useCaseToInteraction, packageDeclaration, step,
								alt, altFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
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
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
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
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
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
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("parentOperand", parentOperand);
		isApplicableMatch.registerObject("flowToParentOperand",
				flowToParentOperand);
		isApplicableMatch.registerObject("parentCombo", parentCombo);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject line, EObject messageSend, EObject flow,
			EObject parentOperand, EObject flowToParentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parentOperand", parentOperand);
		ruleresult.registerObject("flowToParentOperand", flowToParentOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("parentCombo", parentCombo);
		ruleresult.registerObject("interaction", interaction);
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
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		// initial bindings
		Object[] result1_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_10_1_blackBBBBBBBBBBBB(this,
						match, line, messageSend, parentOperand,
						messageReceive, combo, parentCombo, interaction,
						operand, guard, spec);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_10_2_bindingAndBlackFBBBBBBBBBBBB(
						this, match, line, messageSend, parentOperand,
						messageReceive, combo, parentCombo, interaction,
						operand, guard, spec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_4_blackBBBBBBBBBBB(
							match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_4_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
							match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec);
			// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result4_green[11];
			// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result4_green[12];
			// EMoflonEdge parentOperand__messageSend____fragment = (EMoflonEdge) result4_green[13];
			// EMoflonEdge messageSend__parentOperand____enclosingOperand = (EMoflonEdge) result4_green[14];
			// EMoflonEdge parentOperand__messageReceive____fragment = (EMoflonEdge) result4_green[15];
			// EMoflonEdge messageReceive__parentOperand____enclosingOperand = (EMoflonEdge) result4_green[16];
			// EMoflonEdge line__parentOperand____coveredBy = (EMoflonEdge) result4_green[17];
			// EMoflonEdge parentOperand__line____covered = (EMoflonEdge) result4_green[18];
			// EMoflonEdge parentOperand__combo____fragment = (EMoflonEdge) result4_green[19];
			// EMoflonEdge combo__parentOperand____enclosingOperand = (EMoflonEdge) result4_green[20];
			// EMoflonEdge line__parentCombo____coveredBy = (EMoflonEdge) result4_green[21];
			// EMoflonEdge parentCombo__line____covered = (EMoflonEdge) result4_green[22];
			// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result4_green[23];
			// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result4_green[24];
			// EMoflonEdge combo__operand____operand = (EMoflonEdge) result4_green[25];
			// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result4_green[26];
			// EMoflonEdge operand__line____covered = (EMoflonEdge) result4_green[27];
			// EMoflonEdge operand__guard____guard = (EMoflonEdge) result4_green[28];
			// EMoflonEdge guard__spec____specification = (EMoflonEdge) result4_green[29];

			// collect context elements
			Object[] result5_black = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_5_blackBBBBBBBBBBB(
							match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_5_greenBBBBBFFF(match,
							line, parentOperand, parentCombo, interaction);
			// EMoflonEdge parentCombo__parentOperand____operand = (EMoflonEdge) result5_green[5];
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[6];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[7];

			// register objects to match
			AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_6_expressionBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec);
			return AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_7_expressionF();
		} else {
			return AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[2];
		NamedFlow flow = (NamedFlow) result1_bindingAndBlack[3];
		InteractionOperand parentOperand = (InteractionOperand) result1_bindingAndBlack[4];
		FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result1_bindingAndBlack[5];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[6];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[7];
		CombinedFragment parentCombo = (CombinedFragment) result1_bindingAndBlack[8];
		Interaction interaction = (Interaction) result1_bindingAndBlack[9];
		UseCase useCase = (UseCase) result1_bindingAndBlack[10];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[11];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[12];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[13];
		InteractionConstraint guard = (InteractionConstraint) result1_bindingAndBlack[14];
		LiteralString spec = (LiteralString) result1_bindingAndBlack[15];
		CSP csp = (CSP) result1_bindingAndBlack[16];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_1_greenBBBFFFBFFFB(actor,
						flow, combo, operand, csp);
		NormalStep step = (NormalStep) result1_green[3];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_green[4];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[5];
		StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result1_green[7];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[8];
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[9];

		// collect translated elements
		Object[] result2_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_2_blackBBBBBBBBBBBB(
						messageSend, messageReceive, combo, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_2_greenFBBBBBBBBBBBB(
						messageSend, messageReceive, combo, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_3_blackBBBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, flow,
						parentOperand, flowToParentOperand, messageReceive,
						combo, parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_3_greenBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, flow,
						parentOperand, messageReceive, combo, parentCombo,
						interaction, step, alt, stepToCombo, operand,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[19];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[20];
		// EMoflonEdge parentOperand__messageSend____fragment = (EMoflonEdge) result3_green[21];
		// EMoflonEdge messageSend__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[22];
		// EMoflonEdge parentOperand__messageReceive____fragment = (EMoflonEdge) result3_green[23];
		// EMoflonEdge messageReceive__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[24];
		// EMoflonEdge line__parentOperand____coveredBy = (EMoflonEdge) result3_green[25];
		// EMoflonEdge parentOperand__line____covered = (EMoflonEdge) result3_green[26];
		// EMoflonEdge parentOperand__combo____fragment = (EMoflonEdge) result3_green[27];
		// EMoflonEdge combo__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[28];
		// EMoflonEdge line__parentCombo____coveredBy = (EMoflonEdge) result3_green[29];
		// EMoflonEdge parentCombo__line____covered = (EMoflonEdge) result3_green[30];
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[31];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[32];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[33];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[34];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[35];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[36];
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[37];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[38];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[39];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[40];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[41];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[42];
		// EMoflonEdge alternative1ToOperand__alt____source = (EMoflonEdge) result3_green[43];
		// EMoflonEdge alternative1ToOperand__operand____target = (EMoflonEdge) result3_green[44];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[45];
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[46];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[47];

		// perform postprocessing story node is empty
		// register objects
		AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend, flow,
						parentOperand, flowToParentOperand, messageReceive,
						combo, parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_12_2_bindingFFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Lifeline line = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		InteractionOperand parentOperand = (InteractionOperand) result2_binding[2];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[3];
		CombinedFragment combo = (CombinedFragment) result2_binding[4];
		CombinedFragment parentCombo = (CombinedFragment) result2_binding[5];
		Interaction interaction = (Interaction) result2_binding[6];
		InteractionOperand operand = (InteractionOperand) result2_binding[7];
		InteractionConstraint guard = (InteractionConstraint) result2_binding[8];
		LiteralString spec = (LiteralString) result2_binding[9];
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_12_2_blackBBFBFBBBBFFBBBB(
						line, messageSend, parentOperand, messageReceive,
						combo, parentCombo, interaction, operand, guard, spec,
						match)) {
			NamedFlow flow = (NamedFlow) result2_black[2];
			FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result2_black[4];
			UseCase useCase = (UseCase) result2_black[9];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_12_3_blackFBBBBBBBBBBBFBBB(
							line, messageSend, flow, parentOperand,
							flowToParentOperand, messageReceive, combo,
							parentCombo, interaction, useCase,
							useCaseToInteraction, operand, guard, spec)) {
				Actor actor = (Actor) result3_black[0];
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[12];
				Object[] result3_green = AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_12_3_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								actor, line, messageSend, flow, parentOperand,
								flowToParentOperand, messageReceive, combo,
								parentCombo, interaction, useCase,
								useCaseToInteraction, packageDeclaration,
								operand, guard, spec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[17];
				// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[18];
				// EMoflonEdge parentOperand__messageSend____fragment = (EMoflonEdge) result3_green[19];
				// EMoflonEdge messageSend__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[20];
				// EMoflonEdge parentOperand__messageReceive____fragment = (EMoflonEdge) result3_green[21];
				// EMoflonEdge messageReceive__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[22];
				// EMoflonEdge flowToParentOperand__flow____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge flowToParentOperand__parentOperand____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge line__parentOperand____coveredBy = (EMoflonEdge) result3_green[25];
				// EMoflonEdge parentOperand__line____covered = (EMoflonEdge) result3_green[26];
				// EMoflonEdge parentOperand__combo____fragment = (EMoflonEdge) result3_green[27];
				// EMoflonEdge combo__parentOperand____enclosingOperand = (EMoflonEdge) result3_green[28];
				// EMoflonEdge parentCombo__parentOperand____operand = (EMoflonEdge) result3_green[29];
				// EMoflonEdge line__parentCombo____coveredBy = (EMoflonEdge) result3_green[30];
				// EMoflonEdge parentCombo__line____covered = (EMoflonEdge) result3_green[31];
				// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[32];
				// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[33];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[34];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[35];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[36];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[37];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[38];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[39];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[40];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[41];
				// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[42];
				// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[43];
				// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[44];
				// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[45];

				// solve CSP
				Object[] result4_bindingAndBlack = AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line,
								messageSend, flow, parentOperand,
								flowToParentOperand, messageReceive, combo,
								parentCombo, interaction, useCase,
								useCaseToInteraction, packageDeclaration,
								operand, guard, spec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("parentOperand", parentOperand);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("combo", combo);
		match.registerObject("parentCombo", parentCombo);
		match.registerObject("interaction", interaction);
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
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {// Create CSP
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
			MessageOccurrenceSpecification messageSend, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");

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
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("parentOperand", parentOperand);
		isApplicableMatch.registerObject("flowToParentOperand",
				flowToParentOperand);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("parentCombo", parentCombo);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject line, EObject messageSend, EObject flow,
			EObject parentOperand, EObject flowToParentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parentOperand", parentOperand);
		ruleresult.registerObject("flowToParentOperand", flowToParentOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("parentCombo", parentCombo);
		ruleresult.registerObject("interaction", interaction);
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
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("combo")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getCombinedFragment())
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_192(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_20_2_blackFFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_20_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_193(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_21_2_blackFFFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_21_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_194(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_22_2_blackFFFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_22_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_195(
			EMoflonEdge _edge_enclosingOperand) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_23_2_blackFFFFFFFFFFB(_edge_enclosingOperand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_23_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_196(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_24_2_blackFFFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_24_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_197(
			EMoflonEdge _edge_enclosingOperand) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_25_2_blackFFFFFFFFFFB(_edge_enclosingOperand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_25_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_198(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_26_2_blackFFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_26_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_199(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_27_2_blackFFFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_27_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_200(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_28_2_blackFFFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_28_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_201(
			EMoflonEdge _edge_enclosingOperand) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_29_2_blackFFFFFFFFFFB(_edge_enclosingOperand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_29_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_202(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_30_2_blackFFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_30_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_203(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_31_2_blackFFFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_31_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_204(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_32_2_blackFFFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_32_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_205(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_33_2_blackFFFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_33_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_258(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_34_2_blackFFFFFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			NamedFlow flow = (NamedFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_34_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_34_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_34_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_34_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_259(
			EMoflonEdge _edge_stepAlternative) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_35_2_blackFFFFFFFB(_edge_stepAlternative)) {
			Actor actor = (Actor) result2_black[0];
			NamedFlow flow = (NamedFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_35_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_35_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_35_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_35_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_35_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_260(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_36_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_36_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_36_2_blackFFFFFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			NamedFlow flow = (NamedFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_36_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_36_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_36_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_36_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_36_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_36_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_261(
			EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_37_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_37_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_37_2_blackFFFFFFFB(_edge_ref)) {
			Actor actor = (Actor) result2_black[0];
			NamedFlow flow = (NamedFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_37_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_37_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_37_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_37_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_37_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_37_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_206(
			EMoflonEdge _edge_operand) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_38_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_38_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_38_2_blackFFFFFFFFFFB(_edge_operand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_38_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_38_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_38_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_38_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_38_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_38_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_207(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_39_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_39_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_39_2_blackFFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_39_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_39_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_39_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_39_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_39_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_39_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_208(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_40_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_40_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_40_2_blackFFFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_40_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_40_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_40_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_40_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_40_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_40_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_209(
			EMoflonEdge _edge_guard) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_41_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_41_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_41_2_blackFFFFFFFFFFB(_edge_guard)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_41_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_41_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_41_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_41_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_41_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_41_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_210(
			EMoflonEdge _edge_specification) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_42_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_42_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_42_2_blackFFFFFFFFFFB(_edge_specification)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			InteractionOperand operand = (InteractionOperand) result2_black[7];
			InteractionConstraint guard = (InteractionConstraint) result2_black[8];
			LiteralString spec = (LiteralString) result2_black[9];
			Object[] result2_green = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_42_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_42_3_expressionFBBBBBBBBBBBB(
							this, match, line, messageSend, parentOperand,
							messageReceive, combo, parentCombo, interaction,
							operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_42_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_42_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_42_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_42_6_expressionFB(__result);
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
			FlowToInteractionFragment flowToParentOperandParameter) {
		// create result
		Object[] result1_black = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_45_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_45_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_45_2_blackFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList flowToParentOperandList = (RuleEntryList) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			NamedFlow flow = (NamedFlow) result2_black[4];
			FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result2_black[5];
			InteractionOperand parentOperand = (InteractionOperand) result2_black[6];
			CombinedFragment parentCombo = (CombinedFragment) result2_black[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[8];
			Interaction interaction = (Interaction) result2_black[9];
			Lifeline line = (Lifeline) result2_black[10];

			// solve CSP
			Object[] result3_bindingAndBlack = AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_45_3_bindingAndBlackFBBBBBBBBBBBBB(
							this, isApplicableMatch, actor, line, flow,
							parentOperand, flowToParentOperand, parentCombo,
							interaction, useCase, useCaseToInteraction,
							packageDeclaration, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AltSysStepNFToComboRuleImpl
					.pattern_AltSysStepNFToComboRule_45_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = AltSysStepNFToComboRuleImpl
						.pattern_AltSysStepNFToComboRule_45_5_blackBBBBBBBBBB(
								actor, line, flow, parentOperand,
								flowToParentOperand, parentCombo, interaction,
								useCase, useCaseToInteraction,
								packageDeclaration);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_45_6_blackBBBBBBBBBBB(
									actor, line, flow, parentOperand,
									flowToParentOperand, parentCombo,
									interaction, useCase, useCaseToInteraction,
									packageDeclaration, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					AltSysStepNFToComboRuleImpl
							.pattern_AltSysStepNFToComboRule_45_6_greenBBFBBFFBBFFFFFFFFFBB(
									actor, line, flow, parentOperand,
									parentCombo, interaction, ruleResult, csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[5];
					// CombinedFragment combo = (CombinedFragment) result6_green[6];
					// NormalStep step = (NormalStep) result6_green[9];
					// AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result6_green[10];
					// NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result6_green[11];
					// InteractionOperand operand = (InteractionOperand) result6_green[12];
					// StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result6_green[13];
					// InteractionConstraint guard = (InteractionConstraint) result6_green[14];
					// LiteralString spec = (LiteralString) result6_green[15];
					// AlternativeFlow altFlow = (AlternativeFlow) result6_green[16];
					// FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result6_green[17];

				} else {
				}

			} else {
			}

		}
		return AltSysStepNFToComboRuleImpl
				.pattern_AltSysStepNFToComboRule_45_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
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
		literal1.setValue("alt");
		literal1.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables
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
		EqInterOperKind eqInterOperKind = new EqInterOperKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqInterOperKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal1);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("parentOperand", parentOperand);
		isApplicableMatch.registerObject("flowToParentOperand",
				flowToParentOperand);
		isApplicableMatch.registerObject("parentCombo", parentCombo);
		isApplicableMatch.registerObject("interaction", interaction);
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
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
			return null;
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(NamedFlow) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7), (UseCase) arguments.get(8),
					(UseCaseToInteraction) arguments.get(9),
					(PackageDeclaration) arguments.get(10),
					(NormalStep) arguments.get(11),
					(AlternativeFlowAlternative) arguments.get(12),
					(AlternativeFlow) arguments.get(13));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(InteractionConstraint) arguments.get(9),
					(LiteralString) arguments.get(10));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(InteractionConstraint) arguments.get(9),
					(LiteralString) arguments.get(10));
			return null;
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(InteractionConstraint) arguments.get(9),
					(LiteralString) arguments.get(10));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(InteractionOperand) arguments.get(5),
					(FlowToInteractionFragment) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(CombinedFragment) arguments.get(9),
					(Interaction) arguments.get(10),
					(UseCase) arguments.get(11),
					(UseCaseToInteraction) arguments.get(12),
					(PackageDeclaration) arguments.get(13),
					(InteractionOperand) arguments.get(14),
					(InteractionConstraint) arguments.get(15),
					(LiteralString) arguments.get(16));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20),
					(EObject) arguments.get(21), (EObject) arguments.get(22));
			return null;
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_192__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_192((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_193__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_193((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_194__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_194((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_195__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_195((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_196__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_196((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_197__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_197((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_198__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_198((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_199__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_199((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_200__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_200((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_201__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_201((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_202__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_202((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_203__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_203((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_204__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_204((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_205__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_205((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_258__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_258((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_259__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_259((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_260__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_260((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_261__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_261((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_206__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_206((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_207__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_207((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_208__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_208((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_209__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_209((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_210__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_210((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowToInteractionFragment) arguments.get(1));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(NamedFlow) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(Interaction) arguments.get(7), (UseCase) arguments.get(8),
					(UseCaseToInteraction) arguments.get(9),
					(PackageDeclaration) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_0_1_blackBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			return new Object[] { _this, match, actor, flow, useCase,
					packageDeclaration, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_0_2_bindingFBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
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

	public static final Object[] pattern_AltSysStepNFToComboRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_0_2_bindingAndBlackFBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		Object[] result_pattern_AltSysStepNFToComboRule_0_2_binding = pattern_AltSysStepNFToComboRule_0_2_bindingFBBBBBBBBB(
				_this, match, actor, flow, useCase, packageDeclaration, step,
				alt, altFlow);
		if (result_pattern_AltSysStepNFToComboRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_0_2_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_0_2_black = pattern_AltSysStepNFToComboRule_0_2_blackB(csp);
			if (result_pattern_AltSysStepNFToComboRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor, flow, useCase,
						packageDeclaration, step, alt, altFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_0_3_expressionFBB(
			AltSysStepNFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_0_4_blackBBBBBBBB(
			Match match, Actor actor, NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, actor, flow, useCase,
					packageDeclaration, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_0_4_greenBBBBBBFFFF(
			Match match, Actor actor, NamedFlow flow, NormalStep step,
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

	public static final Object[] pattern_AltSysStepNFToComboRule_0_5_blackBBBBBBBB(
			Match match, Actor actor, NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, actor, flow, useCase,
					packageDeclaration, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_0_5_greenBBBBBFFF(
			Match match, Actor actor, NamedFlow flow, UseCase useCase,
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

	public static final void pattern_AltSysStepNFToComboRule_0_6_expressionBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		_this.registerObjectsToMatch_FWD(match, actor, flow, useCase,
				packageDeclaration, step, alt, altFlow);

	}

	public static final boolean pattern_AltSysStepNFToComboRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_1_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("parentOperand");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("flowToParentOperand");
		EObject _localVariable_5 = isApplicableMatch.getObject("parentCombo");
		EObject _localVariable_6 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_7 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_10 = isApplicableMatch.getObject("step");
		EObject _localVariable_11 = isApplicableMatch.getObject("alt");
		EObject _localVariable_12 = isApplicableMatch.getObject("altFlow");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpParentOperand = _localVariable_3;
		EObject tmpFlowToParentOperand = _localVariable_4;
		EObject tmpParentCombo = _localVariable_5;
		EObject tmpInteraction = _localVariable_6;
		EObject tmpUseCase = _localVariable_7;
		EObject tmpUseCaseToInteraction = _localVariable_8;
		EObject tmpPackageDeclaration = _localVariable_9;
		EObject tmpStep = _localVariable_10;
		EObject tmpAlt = _localVariable_11;
		EObject tmpAltFlow = _localVariable_12;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpFlow instanceof NamedFlow) {
					NamedFlow flow = (NamedFlow) tmpFlow;
					if (tmpParentOperand instanceof InteractionOperand) {
						InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
						if (tmpFlowToParentOperand instanceof FlowToInteractionFragment) {
							FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) tmpFlowToParentOperand;
							if (tmpParentCombo instanceof CombinedFragment) {
								CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
								if (tmpInteraction instanceof Interaction) {
									Interaction interaction = (Interaction) tmpInteraction;
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
																	flow,
																	parentOperand,
																	flowToParentOperand,
																	parentCombo,
																	interaction,
																	useCase,
																	useCaseToInteraction,
																	packageDeclaration,
																	step, alt,
																	altFlow,
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

	public static final Object[] pattern_AltSysStepNFToComboRule_1_1_blackBBBBBBBBBBBBBFBB(
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow,
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		if (!altFlow.equals(flow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { actor, line, flow, parentOperand,
							flowToParentOperand, parentCombo, interaction,
							useCase, useCaseToInteraction, packageDeclaration,
							step, alt, altFlow, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltSysStepNFToComboRule_1_1_binding = pattern_AltSysStepNFToComboRule_1_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltSysStepNFToComboRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_AltSysStepNFToComboRule_1_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_AltSysStepNFToComboRule_1_1_binding[1];
			NamedFlow flow = (NamedFlow) result_pattern_AltSysStepNFToComboRule_1_1_binding[2];
			InteractionOperand parentOperand = (InteractionOperand) result_pattern_AltSysStepNFToComboRule_1_1_binding[3];
			FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result_pattern_AltSysStepNFToComboRule_1_1_binding[4];
			CombinedFragment parentCombo = (CombinedFragment) result_pattern_AltSysStepNFToComboRule_1_1_binding[5];
			Interaction interaction = (Interaction) result_pattern_AltSysStepNFToComboRule_1_1_binding[6];
			UseCase useCase = (UseCase) result_pattern_AltSysStepNFToComboRule_1_1_binding[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltSysStepNFToComboRule_1_1_binding[8];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltSysStepNFToComboRule_1_1_binding[9];
			NormalStep step = (NormalStep) result_pattern_AltSysStepNFToComboRule_1_1_binding[10];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_AltSysStepNFToComboRule_1_1_binding[11];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_AltSysStepNFToComboRule_1_1_binding[12];

			Object[] result_pattern_AltSysStepNFToComboRule_1_1_black = pattern_AltSysStepNFToComboRule_1_1_blackBBBBBBBBBBBBBFBB(
					actor, line, flow, parentOperand, flowToParentOperand,
					parentCombo, interaction, useCase, useCaseToInteraction,
					packageDeclaration, step, alt, altFlow, _this,
					isApplicableMatch);
			if (result_pattern_AltSysStepNFToComboRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_1_1_black[13];

				return new Object[] { actor, line, flow, parentOperand,
						flowToParentOperand, parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						altFlow, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_1_1_greenBFBFFBBBBFFFFFBFB(
			Lifeline line, InteractionOperand parentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
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
		line.getCoveredBy().add(parentOperand);
		line.getCoveredBy().add(parentCombo);
		Object _localVariable_0 = csp.getValue("combo", "interactionOperator");
		Object _localVariable_1 = csp.getValue("guard", "name");
		Object _localVariable_2 = csp.getValue("spec", "value");
		line.getCoveredBy().add(messageSend);
		parentOperand.getFragment().add(messageSend);
		parentOperand.getFragment().add(messageReceive);
		parentOperand.getFragment().add(combo);
		combo.setEnclosingInteraction(interaction);
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
		return new Object[] { line, messageSend, parentOperand, messageReceive,
				combo, parentCombo, interaction, step, alt, stepToCombo,
				operand, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand, csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_1_2_blackBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, combo, step,
					alt, stepToCombo, operand, alternative1ToOperand, guard,
					spec, altFlow, altFlowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_1_2_greenFBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(messageSend);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(combo);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		ruleresult.getCreatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(alternative1ToOperand);
		ruleresult.getCreatedElements().add(guard);
		ruleresult.getCreatedElements().add(spec);
		ruleresult.getTranslatedElements().add(altFlow);
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		return new Object[] { ruleresult, messageSend, messageReceive, combo,
				step, alt, stepToCombo, operand, alternative1ToOperand, guard,
				spec, altFlow, altFlowToOperand };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject flow, EObject parentOperand,
			EObject flowToParentOperand, EObject messageReceive, EObject combo,
			EObject parentCombo, EObject interaction, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(flow)) {
					if (!actor.equals(parentOperand)) {
						if (!actor.equals(flowToParentOperand)) {
							if (!actor.equals(messageReceive)) {
								if (!actor.equals(combo)) {
									if (!actor.equals(parentCombo)) {
										if (!actor.equals(interaction)) {
											if (!actor.equals(useCase)) {
												if (!actor
														.equals(useCaseToInteraction)) {
													if (!actor
															.equals(packageDeclaration)) {
														if (!actor.equals(step)) {
															if (!actor
																	.equals(alt)) {
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
																										.equals(parentOperand)) {
																									if (!line
																											.equals(messageReceive)) {
																										if (!line
																												.equals(parentCombo)) {
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
																																				.equals(parentOperand)) {
																																			if (!messageSend
																																					.equals(parentCombo)) {
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
																																											if (!flow
																																													.equals(line)) {
																																												if (!flow
																																														.equals(messageSend)) {
																																													if (!flow
																																															.equals(parentOperand)) {
																																														if (!flow
																																																.equals(flowToParentOperand)) {
																																															if (!flow
																																																	.equals(messageReceive)) {
																																																if (!flow
																																																		.equals(parentCombo)) {
																																																	if (!flow
																																																			.equals(interaction)) {
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
																																																										if (!parentOperand
																																																												.equals(useCase)) {
																																																											if (!parentOperand
																																																													.equals(useCaseToInteraction)) {
																																																												if (!parentOperand
																																																														.equals(step)) {
																																																													if (!parentOperand
																																																															.equals(stepToCombo)) {
																																																														if (!parentOperand
																																																																.equals(spec)) {
																																																															if (!flowToParentOperand
																																																																	.equals(line)) {
																																																																if (!flowToParentOperand
																																																																		.equals(messageSend)) {
																																																																	if (!flowToParentOperand
																																																																			.equals(parentOperand)) {
																																																																		if (!flowToParentOperand
																																																																				.equals(messageReceive)) {
																																																																			if (!flowToParentOperand
																																																																					.equals(parentCombo)) {
																																																																				if (!flowToParentOperand
																																																																						.equals(interaction)) {
																																																																					if (!flowToParentOperand
																																																																							.equals(useCase)) {
																																																																						if (!flowToParentOperand
																																																																								.equals(useCaseToInteraction)) {
																																																																							if (!flowToParentOperand
																																																																									.equals(packageDeclaration)) {
																																																																								if (!flowToParentOperand
																																																																										.equals(step)) {
																																																																									if (!flowToParentOperand
																																																																											.equals(stepToCombo)) {
																																																																										if (!flowToParentOperand
																																																																												.equals(operand)) {
																																																																											if (!flowToParentOperand
																																																																													.equals(guard)) {
																																																																												if (!flowToParentOperand
																																																																														.equals(spec)) {
																																																																													if (!messageReceive
																																																																															.equals(messageSend)) {
																																																																														if (!messageReceive
																																																																																.equals(parentOperand)) {
																																																																															if (!messageReceive
																																																																																	.equals(parentCombo)) {
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
																																																																																							if (!combo
																																																																																									.equals(line)) {
																																																																																								if (!combo
																																																																																										.equals(messageSend)) {
																																																																																									if (!combo
																																																																																											.equals(flow)) {
																																																																																										if (!combo
																																																																																												.equals(parentOperand)) {
																																																																																											if (!combo
																																																																																													.equals(flowToParentOperand)) {
																																																																																												if (!combo
																																																																																														.equals(messageReceive)) {
																																																																																													if (!combo
																																																																																															.equals(parentCombo)) {
																																																																																														if (!combo
																																																																																																.equals(interaction)) {
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
																																																																																																							if (!parentCombo
																																																																																																									.equals(parentOperand)) {
																																																																																																								if (!parentCombo
																																																																																																										.equals(useCase)) {
																																																																																																									if (!parentCombo
																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																										if (!parentCombo
																																																																																																												.equals(step)) {
																																																																																																											if (!parentCombo
																																																																																																													.equals(stepToCombo)) {
																																																																																																												if (!parentCombo
																																																																																																														.equals(spec)) {
																																																																																																													if (!interaction
																																																																																																															.equals(line)) {
																																																																																																														if (!interaction
																																																																																																																.equals(messageSend)) {
																																																																																																															if (!interaction
																																																																																																																	.equals(parentOperand)) {
																																																																																																																if (!interaction
																																																																																																																		.equals(messageReceive)) {
																																																																																																																	if (!interaction
																																																																																																																			.equals(parentCombo)) {
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
																																																																																																																									if (!useCase
																																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																																										if (!packageDeclaration
																																																																																																																												.equals(parentOperand)) {
																																																																																																																											if (!packageDeclaration
																																																																																																																													.equals(parentCombo)) {
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
																																																																																																																																						if (!alt.equals(flow)) {
																																																																																																																																							if (!alt.equals(parentOperand)) {
																																																																																																																																								if (!alt.equals(flowToParentOperand)) {
																																																																																																																																									if (!alt.equals(messageReceive)) {
																																																																																																																																										if (!alt.equals(combo)) {
																																																																																																																																											if (!alt.equals(parentCombo)) {
																																																																																																																																												if (!alt.equals(interaction)) {
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
																																																																																																																																																												.equals(parentOperand)) {
																																																																																																																																																											if (!operand
																																																																																																																																																													.equals(parentCombo)) {
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
																																																																																																																																																																						.equals(flow)) {
																																																																																																																																																																					if (!alternative1ToOperand
																																																																																																																																																																							.equals(parentOperand)) {
																																																																																																																																																																						if (!alternative1ToOperand
																																																																																																																																																																								.equals(flowToParentOperand)) {
																																																																																																																																																																							if (!alternative1ToOperand
																																																																																																																																																																									.equals(messageReceive)) {
																																																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																																																										.equals(combo)) {
																																																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																																																											.equals(parentCombo)) {
																																																																																																																																																																										if (!alternative1ToOperand
																																																																																																																																																																												.equals(interaction)) {
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
																																																																																																																																																																																							.equals(parentOperand)) {
																																																																																																																																																																																						if (!guard
																																																																																																																																																																																								.equals(messageReceive)) {
																																																																																																																																																																																							if (!guard
																																																																																																																																																																																									.equals(parentCombo)) {
																																																																																																																																																																																								if (!guard
																																																																																																																																																																																										.equals(interaction)) {
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
																																																																																																																																																																																																								.equals(flow)) {
																																																																																																																																																																																																							if (!altFlow
																																																																																																																																																																																																									.equals(parentOperand)) {
																																																																																																																																																																																																								if (!altFlow
																																																																																																																																																																																																										.equals(flowToParentOperand)) {
																																																																																																																																																																																																									if (!altFlow
																																																																																																																																																																																																											.equals(messageReceive)) {
																																																																																																																																																																																																										if (!altFlow
																																																																																																																																																																																																												.equals(combo)) {
																																																																																																																																																																																																											if (!altFlow
																																																																																																																																																																																																													.equals(parentCombo)) {
																																																																																																																																																																																																												if (!altFlow
																																																																																																																																																																																																														.equals(interaction)) {
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
																																																																																																																																																																																																																											.equals(flow)) {
																																																																																																																																																																																																																										if (!altFlowToOperand
																																																																																																																																																																																																																												.equals(parentOperand)) {
																																																																																																																																																																																																																											if (!altFlowToOperand
																																																																																																																																																																																																																													.equals(flowToParentOperand)) {
																																																																																																																																																																																																																												if (!altFlowToOperand
																																																																																																																																																																																																																														.equals(messageReceive)) {
																																																																																																																																																																																																																													if (!altFlowToOperand
																																																																																																																																																																																																																															.equals(combo)) {
																																																																																																																																																																																																																														if (!altFlowToOperand
																																																																																																																																																																																																																																.equals(parentCombo)) {
																																																																																																																																																																																																																															if (!altFlowToOperand
																																																																																																																																																																																																																																	.equals(interaction)) {
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
																																																																																																																																																																																																																																											flow,
																																																																																																																																																																																																																																											parentOperand,
																																																																																																																																																																																																																																											flowToParentOperand,
																																																																																																																																																																																																																																											messageReceive,
																																																																																																																																																																																																																																											combo,
																																																																																																																																																																																																																																											parentCombo,
																																																																																																																																																																																																																																											interaction,
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
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_1_3_greenBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject flow, EObject parentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentOperand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentCombo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentCombo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
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
		String ruleresult_ruleName_prime = "AltSysStepNFToComboRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String parentOperand__messageSend____fragment_name_prime = "fragment";
		String messageSend__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String parentOperand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String line__parentOperand____coveredBy_name_prime = "coveredBy";
		String parentOperand__line____covered_name_prime = "covered";
		String parentOperand__combo____fragment_name_prime = "fragment";
		String combo__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String line__parentCombo____coveredBy_name_prime = "coveredBy";
		String parentCombo__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		String combo__operand____operand_name_prime = "operand";
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
		parentOperand__messageSend____fragment.setSrc(parentOperand);
		parentOperand__messageSend____fragment.setTrg(messageSend);
		ruleresult.getCreatedEdges()
				.add(parentOperand__messageSend____fragment);
		messageSend__parentOperand____enclosingOperand.setSrc(messageSend);
		messageSend__parentOperand____enclosingOperand.setTrg(parentOperand);
		ruleresult.getCreatedEdges().add(
				messageSend__parentOperand____enclosingOperand);
		parentOperand__messageReceive____fragment.setSrc(parentOperand);
		parentOperand__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				parentOperand__messageReceive____fragment);
		messageReceive__parentOperand____enclosingOperand
				.setSrc(messageReceive);
		messageReceive__parentOperand____enclosingOperand.setTrg(parentOperand);
		ruleresult.getCreatedEdges().add(
				messageReceive__parentOperand____enclosingOperand);
		line__parentOperand____coveredBy.setSrc(line);
		line__parentOperand____coveredBy.setTrg(parentOperand);
		ruleresult.getCreatedEdges().add(line__parentOperand____coveredBy);
		parentOperand__line____covered.setSrc(parentOperand);
		parentOperand__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(parentOperand__line____covered);
		parentOperand__combo____fragment.setSrc(parentOperand);
		parentOperand__combo____fragment.setTrg(combo);
		ruleresult.getCreatedEdges().add(parentOperand__combo____fragment);
		combo__parentOperand____enclosingOperand.setSrc(combo);
		combo__parentOperand____enclosingOperand.setTrg(parentOperand);
		ruleresult.getCreatedEdges().add(
				combo__parentOperand____enclosingOperand);
		line__parentCombo____coveredBy.setSrc(line);
		line__parentCombo____coveredBy.setTrg(parentCombo);
		ruleresult.getCreatedEdges().add(line__parentCombo____coveredBy);
		parentCombo__line____covered.setSrc(parentCombo);
		parentCombo__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(parentCombo__line____covered);
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
		parentOperand__messageSend____fragment
				.setName(parentOperand__messageSend____fragment_name_prime);
		messageSend__parentOperand____enclosingOperand
				.setName(messageSend__parentOperand____enclosingOperand_name_prime);
		parentOperand__messageReceive____fragment
				.setName(parentOperand__messageReceive____fragment_name_prime);
		messageReceive__parentOperand____enclosingOperand
				.setName(messageReceive__parentOperand____enclosingOperand_name_prime);
		line__parentOperand____coveredBy
				.setName(line__parentOperand____coveredBy_name_prime);
		parentOperand__line____covered
				.setName(parentOperand__line____covered_name_prime);
		parentOperand__combo____fragment
				.setName(parentOperand__combo____fragment_name_prime);
		combo__parentOperand____enclosingOperand
				.setName(combo__parentOperand____enclosingOperand_name_prime);
		line__parentCombo____coveredBy
				.setName(line__parentCombo____coveredBy_name_prime);
		parentCombo__line____covered
				.setName(parentCombo__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
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
		return new Object[] { ruleresult, actor, line, messageSend, flow,
				parentOperand, messageReceive, combo, parentCombo, interaction,
				step, alt, stepToCombo, operand, alternative1ToOperand, guard,
				spec, altFlow, altFlowToOperand,
				line__messageSend____coveredBy, messageSend__line____covered,
				parentOperand__messageSend____fragment,
				messageSend__parentOperand____enclosingOperand,
				parentOperand__messageReceive____fragment,
				messageReceive__parentOperand____enclosingOperand,
				line__parentOperand____coveredBy,
				parentOperand__line____covered,
				parentOperand__combo____fragment,
				combo__parentOperand____enclosingOperand,
				line__parentCombo____coveredBy, parentCombo__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment, flow__step____steps,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref, combo__operand____operand,
				line__operand____coveredBy, operand__line____covered,
				stepToCombo__step____source, stepToCombo__combo____target,
				operand__guard____guard, alternative1ToOperand__alt____source,
				alternative1ToOperand__operand____target,
				guard__spec____specification,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target };
	}

	public static final void pattern_AltSysStepNFToComboRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend, EObject flow,
			EObject parentOperand, EObject flowToParentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		_this.registerObjects_FWD(ruleresult, actor, line, messageSend, flow,
				parentOperand, flowToParentOperand, messageReceive, combo,
				parentCombo, interaction, useCase, useCaseToInteraction,
				packageDeclaration, step, alt, stepToCombo, operand,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand);

	}

	public static final PerformRuleResult pattern_AltSysStepNFToComboRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_1_blackFBB(
			EClass eClass, AltSysStepNFToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_2_1_binding = pattern_AltSysStepNFToComboRule_2_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltSysStepNFToComboRule_2_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_2_1_black = pattern_AltSysStepNFToComboRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltSysStepNFToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_2_bindingFFFFFFFB(
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
			if (tmpFlow instanceof NamedFlow) {
				NamedFlow flow = (NamedFlow) tmpFlow;
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

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_2_2_blackBBFFFBFBBBBB(
			Actor actor, NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			for (FlowToInteractionFragment flowToParentOperand : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(flow,
							FlowToInteractionFragment.class, "source")) {
				InteractionFragment tmpParentOperand = flowToParentOperand
						.getTarget();
				if (tmpParentOperand instanceof InteractionOperand) {
					InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
					for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(useCase,
									UseCaseToInteraction.class, "source")) {
						Interaction interaction = useCaseToInteraction
								.getTarget();
						if (interaction != null) {
							_result.add(new Object[] { actor, flow,
									parentOperand, flowToParentOperand,
									interaction, useCase, useCaseToInteraction,
									packageDeclaration, step, alt, altFlow,
									match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_2_3_blackBFBBBFBBBBBBB(
			Actor actor, NamedFlow flow, InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			if (flow.equals(flowToParentOperand.getSource())) {
				if (parentOperand.equals(flowToParentOperand.getTarget())) {
					if (useCase.getFlows().contains(flow)) {
						if (useCase.equals(useCaseToInteraction.getSource())) {
							if (interaction.equals(useCaseToInteraction
									.getTarget())) {
								if (flow.getSteps().contains(step)) {
									if (packageDeclaration.getUseCases()
											.contains(useCase)) {
										if (packageDeclaration.getActors()
												.contains(actor)) {
											if (step.getStepAlternative()
													.contains(alt)) {
												if (actor.equals(step
														.getActor())) {
													if (altFlow.equals(alt
															.getRef())) {
														for (Lifeline line : interaction
																.getLifeline()) {
															for (CombinedFragment parentCombo : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			parentOperand,
																			CombinedFragment.class,
																			"operand")) {
																_result.add(new Object[] {
																		actor,
																		line,
																		flow,
																		parentOperand,
																		flowToParentOperand,
																		parentCombo,
																		interaction,
																		useCase,
																		useCaseToInteraction,
																		packageDeclaration,
																		step,
																		alt,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge flowToParentOperand__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToParentOperand__parentOperand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentCombo__parentOperand____operand = TGGRuntimeFactory.eINSTANCE
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
		String flowToParentOperand__flow____source_name_prime = "source";
		String flowToParentOperand__parentOperand____target_name_prime = "target";
		String parentCombo__parentOperand____operand_name_prime = "operand";
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
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(parentOperand);
		isApplicableMatch.getAllContextElements().add(flowToParentOperand);
		isApplicableMatch.getAllContextElements().add(parentCombo);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(altFlow);
		flowToParentOperand__flow____source.setSrc(flowToParentOperand);
		flowToParentOperand__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToParentOperand__flow____source);
		flowToParentOperand__parentOperand____target
				.setSrc(flowToParentOperand);
		flowToParentOperand__parentOperand____target.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				flowToParentOperand__parentOperand____target);
		parentCombo__parentOperand____operand.setSrc(parentCombo);
		parentCombo__parentOperand____operand.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				parentCombo__parentOperand____operand);
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
		flowToParentOperand__flow____source
				.setName(flowToParentOperand__flow____source_name_prime);
		flowToParentOperand__parentOperand____target
				.setName(flowToParentOperand__parentOperand____target_name_prime);
		parentCombo__parentOperand____operand
				.setName(parentCombo__parentOperand____operand_name_prime);
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
		return new Object[] { actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration, step, alt, altFlow,
				isApplicableMatch, flowToParentOperand__flow____source,
				flowToParentOperand__parentOperand____target,
				parentCombo__parentOperand____operand,
				line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_4_bindingFBBBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration, step, alt, altFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					flow, parentOperand, flowToParentOperand, parentCombo,
					interaction, useCase, useCaseToInteraction,
					packageDeclaration, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		Object[] result_pattern_AltSysStepNFToComboRule_2_4_binding = pattern_AltSysStepNFToComboRule_2_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration, step, alt, altFlow);
		if (result_pattern_AltSysStepNFToComboRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_2_4_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_2_4_black = pattern_AltSysStepNFToComboRule_2_4_blackB(csp);
			if (result_pattern_AltSysStepNFToComboRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, flow, parentOperand, flowToParentOperand,
						parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						altFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_2_5_expressionFBB(
			AltSysStepNFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltSysStepNFToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltSysStepNFToComboRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_1_blackBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			if (!combo.equals(parentCombo)) {
				if (!operand.equals(parentOperand)) {
					return new Object[] { _this, match, line, messageSend,
							parentOperand, messageReceive, combo, parentCombo,
							interaction, operand, guard, spec };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_2_bindingFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, line, messageSend,
					parentOperand, messageReceive, combo, parentCombo,
					interaction, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_2_bindingAndBlackFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_AltSysStepNFToComboRule_10_2_binding = pattern_AltSysStepNFToComboRule_10_2_bindingFBBBBBBBBBBBB(
				_this, match, line, messageSend, parentOperand, messageReceive,
				combo, parentCombo, interaction, operand, guard, spec);
		if (result_pattern_AltSysStepNFToComboRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_10_2_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_10_2_black = pattern_AltSysStepNFToComboRule_10_2_blackB(csp);
			if (result_pattern_AltSysStepNFToComboRule_10_2_black != null) {

				return new Object[] { csp, _this, match, line, messageSend,
						parentOperand, messageReceive, combo, parentCombo,
						interaction, operand, guard, spec };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_10_3_expressionFBB(
			AltSysStepNFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_4_blackBBBBBBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			if (!combo.equals(parentCombo)) {
				if (!operand.equals(parentOperand)) {
					return new Object[] { match, line, messageSend,
							parentOperand, messageReceive, combo, parentCombo,
							interaction, operand, guard, spec };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_4_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentOperand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentCombo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentCombo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
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
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(combo);
		match.getToBeTranslatedNodes().add(operand);
		match.getToBeTranslatedNodes().add(guard);
		match.getToBeTranslatedNodes().add(spec);
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String parentOperand__messageSend____fragment_name_prime = "fragment";
		String messageSend__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String parentOperand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String line__parentOperand____coveredBy_name_prime = "coveredBy";
		String parentOperand__line____covered_name_prime = "covered";
		String parentOperand__combo____fragment_name_prime = "fragment";
		String combo__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String line__parentCombo____coveredBy_name_prime = "coveredBy";
		String parentCombo__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String combo__operand____operand_name_prime = "operand";
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
		parentOperand__messageSend____fragment.setSrc(parentOperand);
		parentOperand__messageSend____fragment.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(
				parentOperand__messageSend____fragment);
		messageSend__parentOperand____enclosingOperand.setSrc(messageSend);
		messageSend__parentOperand____enclosingOperand.setTrg(parentOperand);
		match.getToBeTranslatedEdges().add(
				messageSend__parentOperand____enclosingOperand);
		parentOperand__messageReceive____fragment.setSrc(parentOperand);
		parentOperand__messageReceive____fragment.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				parentOperand__messageReceive____fragment);
		messageReceive__parentOperand____enclosingOperand
				.setSrc(messageReceive);
		messageReceive__parentOperand____enclosingOperand.setTrg(parentOperand);
		match.getToBeTranslatedEdges().add(
				messageReceive__parentOperand____enclosingOperand);
		line__parentOperand____coveredBy.setSrc(line);
		line__parentOperand____coveredBy.setTrg(parentOperand);
		match.getToBeTranslatedEdges().add(line__parentOperand____coveredBy);
		parentOperand__line____covered.setSrc(parentOperand);
		parentOperand__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(parentOperand__line____covered);
		parentOperand__combo____fragment.setSrc(parentOperand);
		parentOperand__combo____fragment.setTrg(combo);
		match.getToBeTranslatedEdges().add(parentOperand__combo____fragment);
		combo__parentOperand____enclosingOperand.setSrc(combo);
		combo__parentOperand____enclosingOperand.setTrg(parentOperand);
		match.getToBeTranslatedEdges().add(
				combo__parentOperand____enclosingOperand);
		line__parentCombo____coveredBy.setSrc(line);
		line__parentCombo____coveredBy.setTrg(parentCombo);
		match.getToBeTranslatedEdges().add(line__parentCombo____coveredBy);
		parentCombo__line____covered.setSrc(parentCombo);
		parentCombo__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(parentCombo__line____covered);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		match.getToBeTranslatedEdges().add(interaction__combo____fragment);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		match.getToBeTranslatedEdges().add(combo__operand____operand);
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
		parentOperand__messageSend____fragment
				.setName(parentOperand__messageSend____fragment_name_prime);
		messageSend__parentOperand____enclosingOperand
				.setName(messageSend__parentOperand____enclosingOperand_name_prime);
		parentOperand__messageReceive____fragment
				.setName(parentOperand__messageReceive____fragment_name_prime);
		messageReceive__parentOperand____enclosingOperand
				.setName(messageReceive__parentOperand____enclosingOperand_name_prime);
		line__parentOperand____coveredBy
				.setName(line__parentOperand____coveredBy_name_prime);
		parentOperand__line____covered
				.setName(parentOperand__line____covered_name_prime);
		parentOperand__combo____fragment
				.setName(parentOperand__combo____fragment_name_prime);
		combo__parentOperand____enclosingOperand
				.setName(combo__parentOperand____enclosingOperand_name_prime);
		line__parentCombo____coveredBy
				.setName(line__parentCombo____coveredBy_name_prime);
		parentCombo__line____covered
				.setName(parentCombo__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { match, line, messageSend, parentOperand,
				messageReceive, combo, parentCombo, interaction, operand,
				guard, spec, line__messageSend____coveredBy,
				messageSend__line____covered,
				parentOperand__messageSend____fragment,
				messageSend__parentOperand____enclosingOperand,
				parentOperand__messageReceive____fragment,
				messageReceive__parentOperand____enclosingOperand,
				line__parentOperand____coveredBy,
				parentOperand__line____covered,
				parentOperand__combo____fragment,
				combo__parentOperand____enclosingOperand,
				line__parentCombo____coveredBy, parentCombo__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment, combo__operand____operand,
				line__operand____coveredBy, operand__line____covered,
				operand__guard____guard, guard__spec____specification };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_5_blackBBBBBBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			if (!combo.equals(parentCombo)) {
				if (!operand.equals(parentOperand)) {
					return new Object[] { match, line, messageSend,
							parentOperand, messageReceive, combo, parentCombo,
							interaction, operand, guard, spec };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_10_5_greenBBBBBFFF(
			Match match, Lifeline line, InteractionOperand parentOperand,
			CombinedFragment parentCombo, Interaction interaction) {
		EMoflonEdge parentCombo__parentOperand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(line);
		match.getContextNodes().add(parentOperand);
		match.getContextNodes().add(parentCombo);
		match.getContextNodes().add(interaction);
		String parentCombo__parentOperand____operand_name_prime = "operand";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		parentCombo__parentOperand____operand.setSrc(parentCombo);
		parentCombo__parentOperand____operand.setTrg(parentOperand);
		match.getContextEdges().add(parentCombo__parentOperand____operand);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		match.getContextEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		match.getContextEdges().add(interaction__line____lifeline);
		parentCombo__parentOperand____operand
				.setName(parentCombo__parentOperand____operand_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { match, line, parentOperand, parentCombo,
				interaction, parentCombo__parentOperand____operand,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_AltSysStepNFToComboRule_10_6_expressionBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		_this.registerObjectsToMatch_BWD(match, line, messageSend,
				parentOperand, messageReceive, combo, parentCombo, interaction,
				operand, guard, spec);

	}

	public static final boolean pattern_AltSysStepNFToComboRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_1_bindingFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("parentOperand");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("flowToParentOperand");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_7 = isApplicableMatch.getObject("combo");
		EObject _localVariable_8 = isApplicableMatch.getObject("parentCombo");
		EObject _localVariable_9 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_10 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_11 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_12 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_13 = isApplicableMatch.getObject("operand");
		EObject _localVariable_14 = isApplicableMatch.getObject("guard");
		EObject _localVariable_15 = isApplicableMatch.getObject("spec");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpMessageSend = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpParentOperand = _localVariable_4;
		EObject tmpFlowToParentOperand = _localVariable_5;
		EObject tmpMessageReceive = _localVariable_6;
		EObject tmpCombo = _localVariable_7;
		EObject tmpParentCombo = _localVariable_8;
		EObject tmpInteraction = _localVariable_9;
		EObject tmpUseCase = _localVariable_10;
		EObject tmpUseCaseToInteraction = _localVariable_11;
		EObject tmpPackageDeclaration = _localVariable_12;
		EObject tmpOperand = _localVariable_13;
		EObject tmpGuard = _localVariable_14;
		EObject tmpSpec = _localVariable_15;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
					if (tmpFlow instanceof NamedFlow) {
						NamedFlow flow = (NamedFlow) tmpFlow;
						if (tmpParentOperand instanceof InteractionOperand) {
							InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
							if (tmpFlowToParentOperand instanceof FlowToInteractionFragment) {
								FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) tmpFlowToParentOperand;
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (tmpParentCombo instanceof CombinedFragment) {
											CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
											if (tmpInteraction instanceof Interaction) {
												Interaction interaction = (Interaction) tmpInteraction;
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
																				flow,
																				parentOperand,
																				flowToParentOperand,
																				messageReceive,
																				combo,
																				parentCombo,
																				interaction,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_1_blackBBBBBBBBBBBBBBBBFBB(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec,
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		if (!messageReceive.equals(messageSend)) {
			if (!combo.equals(parentCombo)) {
				if (!operand.equals(parentOperand)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { actor, line, messageSend,
									flow, parentOperand, flowToParentOperand,
									messageReceive, combo, parentCombo,
									interaction, useCase, useCaseToInteraction,
									packageDeclaration, operand, guard, spec,
									csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltSysStepNFToComboRule_11_1_binding = pattern_AltSysStepNFToComboRule_11_1_bindingFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltSysStepNFToComboRule_11_1_binding != null) {
			Actor actor = (Actor) result_pattern_AltSysStepNFToComboRule_11_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_AltSysStepNFToComboRule_11_1_binding[1];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_AltSysStepNFToComboRule_11_1_binding[2];
			NamedFlow flow = (NamedFlow) result_pattern_AltSysStepNFToComboRule_11_1_binding[3];
			InteractionOperand parentOperand = (InteractionOperand) result_pattern_AltSysStepNFToComboRule_11_1_binding[4];
			FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) result_pattern_AltSysStepNFToComboRule_11_1_binding[5];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_AltSysStepNFToComboRule_11_1_binding[6];
			CombinedFragment combo = (CombinedFragment) result_pattern_AltSysStepNFToComboRule_11_1_binding[7];
			CombinedFragment parentCombo = (CombinedFragment) result_pattern_AltSysStepNFToComboRule_11_1_binding[8];
			Interaction interaction = (Interaction) result_pattern_AltSysStepNFToComboRule_11_1_binding[9];
			UseCase useCase = (UseCase) result_pattern_AltSysStepNFToComboRule_11_1_binding[10];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltSysStepNFToComboRule_11_1_binding[11];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltSysStepNFToComboRule_11_1_binding[12];
			InteractionOperand operand = (InteractionOperand) result_pattern_AltSysStepNFToComboRule_11_1_binding[13];
			InteractionConstraint guard = (InteractionConstraint) result_pattern_AltSysStepNFToComboRule_11_1_binding[14];
			LiteralString spec = (LiteralString) result_pattern_AltSysStepNFToComboRule_11_1_binding[15];

			Object[] result_pattern_AltSysStepNFToComboRule_11_1_black = pattern_AltSysStepNFToComboRule_11_1_blackBBBBBBBBBBBBBBBBFBB(
					actor, line, messageSend, flow, parentOperand,
					flowToParentOperand, messageReceive, combo, parentCombo,
					interaction, useCase, useCaseToInteraction,
					packageDeclaration, operand, guard, spec, _this,
					isApplicableMatch);
			if (result_pattern_AltSysStepNFToComboRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_11_1_black[16];

				return new Object[] { actor, line, messageSend, flow,
						parentOperand, flowToParentOperand, messageReceive,
						combo, parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, operand,
						guard, spec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_1_greenBBBFFFBFFFB(
			Actor actor, NamedFlow flow, CombinedFragment combo,
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
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("altFlow", "name");
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
		String alt_condition_prime = (String) _localVariable_0;
		String altFlow_name_prime = (String) _localVariable_1;
		alt.setCondition(alt_condition_prime);
		altFlow.setName(altFlow_name_prime);
		return new Object[] { actor, flow, combo, step, alt, stepToCombo,
				operand, alternative1ToOperand, altFlow, altFlowToOperand, csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_2_blackBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, combo, step,
					alt, stepToCombo, operand, alternative1ToOperand, guard,
					spec, altFlow, altFlowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_2_greenFBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(messageSend);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(combo);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		ruleresult.getTranslatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(alternative1ToOperand);
		ruleresult.getTranslatedElements().add(guard);
		ruleresult.getTranslatedElements().add(spec);
		ruleresult.getCreatedElements().add(altFlow);
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		return new Object[] { ruleresult, messageSend, messageReceive, combo,
				step, alt, stepToCombo, operand, alternative1ToOperand, guard,
				spec, altFlow, altFlowToOperand };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_11_3_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject flow, EObject parentOperand,
			EObject flowToParentOperand, EObject messageReceive, EObject combo,
			EObject parentCombo, EObject interaction, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(flow)) {
					if (!actor.equals(parentOperand)) {
						if (!actor.equals(flowToParentOperand)) {
							if (!actor.equals(messageReceive)) {
								if (!actor.equals(combo)) {
									if (!actor.equals(parentCombo)) {
										if (!actor.equals(interaction)) {
											if (!actor.equals(useCase)) {
												if (!actor
														.equals(useCaseToInteraction)) {
													if (!actor
															.equals(packageDeclaration)) {
														if (!actor.equals(step)) {
															if (!actor
																	.equals(alt)) {
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
																										.equals(parentOperand)) {
																									if (!line
																											.equals(messageReceive)) {
																										if (!line
																												.equals(parentCombo)) {
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
																																				.equals(parentOperand)) {
																																			if (!messageSend
																																					.equals(parentCombo)) {
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
																																											if (!flow
																																													.equals(line)) {
																																												if (!flow
																																														.equals(messageSend)) {
																																													if (!flow
																																															.equals(parentOperand)) {
																																														if (!flow
																																																.equals(flowToParentOperand)) {
																																															if (!flow
																																																	.equals(messageReceive)) {
																																																if (!flow
																																																		.equals(parentCombo)) {
																																																	if (!flow
																																																			.equals(interaction)) {
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
																																																										if (!parentOperand
																																																												.equals(useCase)) {
																																																											if (!parentOperand
																																																													.equals(useCaseToInteraction)) {
																																																												if (!parentOperand
																																																														.equals(step)) {
																																																													if (!parentOperand
																																																															.equals(stepToCombo)) {
																																																														if (!parentOperand
																																																																.equals(spec)) {
																																																															if (!flowToParentOperand
																																																																	.equals(line)) {
																																																																if (!flowToParentOperand
																																																																		.equals(messageSend)) {
																																																																	if (!flowToParentOperand
																																																																			.equals(parentOperand)) {
																																																																		if (!flowToParentOperand
																																																																				.equals(messageReceive)) {
																																																																			if (!flowToParentOperand
																																																																					.equals(parentCombo)) {
																																																																				if (!flowToParentOperand
																																																																						.equals(interaction)) {
																																																																					if (!flowToParentOperand
																																																																							.equals(useCase)) {
																																																																						if (!flowToParentOperand
																																																																								.equals(useCaseToInteraction)) {
																																																																							if (!flowToParentOperand
																																																																									.equals(packageDeclaration)) {
																																																																								if (!flowToParentOperand
																																																																										.equals(step)) {
																																																																									if (!flowToParentOperand
																																																																											.equals(stepToCombo)) {
																																																																										if (!flowToParentOperand
																																																																												.equals(operand)) {
																																																																											if (!flowToParentOperand
																																																																													.equals(guard)) {
																																																																												if (!flowToParentOperand
																																																																														.equals(spec)) {
																																																																													if (!messageReceive
																																																																															.equals(messageSend)) {
																																																																														if (!messageReceive
																																																																																.equals(parentOperand)) {
																																																																															if (!messageReceive
																																																																																	.equals(parentCombo)) {
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
																																																																																							if (!combo
																																																																																									.equals(line)) {
																																																																																								if (!combo
																																																																																										.equals(messageSend)) {
																																																																																									if (!combo
																																																																																											.equals(flow)) {
																																																																																										if (!combo
																																																																																												.equals(parentOperand)) {
																																																																																											if (!combo
																																																																																													.equals(flowToParentOperand)) {
																																																																																												if (!combo
																																																																																														.equals(messageReceive)) {
																																																																																													if (!combo
																																																																																															.equals(parentCombo)) {
																																																																																														if (!combo
																																																																																																.equals(interaction)) {
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
																																																																																																							if (!parentCombo
																																																																																																									.equals(parentOperand)) {
																																																																																																								if (!parentCombo
																																																																																																										.equals(useCase)) {
																																																																																																									if (!parentCombo
																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																										if (!parentCombo
																																																																																																												.equals(step)) {
																																																																																																											if (!parentCombo
																																																																																																													.equals(stepToCombo)) {
																																																																																																												if (!parentCombo
																																																																																																														.equals(spec)) {
																																																																																																													if (!interaction
																																																																																																															.equals(line)) {
																																																																																																														if (!interaction
																																																																																																																.equals(messageSend)) {
																																																																																																															if (!interaction
																																																																																																																	.equals(parentOperand)) {
																																																																																																																if (!interaction
																																																																																																																		.equals(messageReceive)) {
																																																																																																																	if (!interaction
																																																																																																																			.equals(parentCombo)) {
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
																																																																																																																									if (!useCase
																																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																																										if (!packageDeclaration
																																																																																																																												.equals(parentOperand)) {
																																																																																																																											if (!packageDeclaration
																																																																																																																													.equals(parentCombo)) {
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
																																																																																																																																						if (!alt.equals(flow)) {
																																																																																																																																							if (!alt.equals(parentOperand)) {
																																																																																																																																								if (!alt.equals(flowToParentOperand)) {
																																																																																																																																									if (!alt.equals(messageReceive)) {
																																																																																																																																										if (!alt.equals(combo)) {
																																																																																																																																											if (!alt.equals(parentCombo)) {
																																																																																																																																												if (!alt.equals(interaction)) {
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
																																																																																																																																																												.equals(parentOperand)) {
																																																																																																																																																											if (!operand
																																																																																																																																																													.equals(parentCombo)) {
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
																																																																																																																																																																						.equals(flow)) {
																																																																																																																																																																					if (!alternative1ToOperand
																																																																																																																																																																							.equals(parentOperand)) {
																																																																																																																																																																						if (!alternative1ToOperand
																																																																																																																																																																								.equals(flowToParentOperand)) {
																																																																																																																																																																							if (!alternative1ToOperand
																																																																																																																																																																									.equals(messageReceive)) {
																																																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																																																										.equals(combo)) {
																																																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																																																											.equals(parentCombo)) {
																																																																																																																																																																										if (!alternative1ToOperand
																																																																																																																																																																												.equals(interaction)) {
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
																																																																																																																																																																																							.equals(parentOperand)) {
																																																																																																																																																																																						if (!guard
																																																																																																																																																																																								.equals(messageReceive)) {
																																																																																																																																																																																							if (!guard
																																																																																																																																																																																									.equals(parentCombo)) {
																																																																																																																																																																																								if (!guard
																																																																																																																																																																																										.equals(interaction)) {
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
																																																																																																																																																																																																								.equals(flow)) {
																																																																																																																																																																																																							if (!altFlow
																																																																																																																																																																																																									.equals(parentOperand)) {
																																																																																																																																																																																																								if (!altFlow
																																																																																																																																																																																																										.equals(flowToParentOperand)) {
																																																																																																																																																																																																									if (!altFlow
																																																																																																																																																																																																											.equals(messageReceive)) {
																																																																																																																																																																																																										if (!altFlow
																																																																																																																																																																																																												.equals(combo)) {
																																																																																																																																																																																																											if (!altFlow
																																																																																																																																																																																																													.equals(parentCombo)) {
																																																																																																																																																																																																												if (!altFlow
																																																																																																																																																																																																														.equals(interaction)) {
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
																																																																																																																																																																																																																											.equals(flow)) {
																																																																																																																																																																																																																										if (!altFlowToOperand
																																																																																																																																																																																																																												.equals(parentOperand)) {
																																																																																																																																																																																																																											if (!altFlowToOperand
																																																																																																																																																																																																																													.equals(flowToParentOperand)) {
																																																																																																																																																																																																																												if (!altFlowToOperand
																																																																																																																																																																																																																														.equals(messageReceive)) {
																																																																																																																																																																																																																													if (!altFlowToOperand
																																																																																																																																																																																																																															.equals(combo)) {
																																																																																																																																																																																																																														if (!altFlowToOperand
																																																																																																																																																																																																																																.equals(parentCombo)) {
																																																																																																																																																																																																																															if (!altFlowToOperand
																																																																																																																																																																																																																																	.equals(interaction)) {
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
																																																																																																																																																																																																																																											flow,
																																																																																																																																																																																																																																											parentOperand,
																																																																																																																																																																																																																																											flowToParentOperand,
																																																																																																																																																																																																																																											messageReceive,
																																																																																																																																																																																																																																											combo,
																																																																																																																																																																																																																																											parentCombo,
																																																																																																																																																																																																																																											interaction,
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
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_11_3_greenBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject flow, EObject parentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentOperand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentCombo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentCombo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
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
		String ruleresult_ruleName_prime = "AltSysStepNFToComboRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String parentOperand__messageSend____fragment_name_prime = "fragment";
		String messageSend__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String parentOperand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String line__parentOperand____coveredBy_name_prime = "coveredBy";
		String parentOperand__line____covered_name_prime = "covered";
		String parentOperand__combo____fragment_name_prime = "fragment";
		String combo__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String line__parentCombo____coveredBy_name_prime = "coveredBy";
		String parentCombo__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		String combo__operand____operand_name_prime = "operand";
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
		parentOperand__messageSend____fragment.setSrc(parentOperand);
		parentOperand__messageSend____fragment.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(
				parentOperand__messageSend____fragment);
		messageSend__parentOperand____enclosingOperand.setSrc(messageSend);
		messageSend__parentOperand____enclosingOperand.setTrg(parentOperand);
		ruleresult.getTranslatedEdges().add(
				messageSend__parentOperand____enclosingOperand);
		parentOperand__messageReceive____fragment.setSrc(parentOperand);
		parentOperand__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				parentOperand__messageReceive____fragment);
		messageReceive__parentOperand____enclosingOperand
				.setSrc(messageReceive);
		messageReceive__parentOperand____enclosingOperand.setTrg(parentOperand);
		ruleresult.getTranslatedEdges().add(
				messageReceive__parentOperand____enclosingOperand);
		line__parentOperand____coveredBy.setSrc(line);
		line__parentOperand____coveredBy.setTrg(parentOperand);
		ruleresult.getTranslatedEdges().add(line__parentOperand____coveredBy);
		parentOperand__line____covered.setSrc(parentOperand);
		parentOperand__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(parentOperand__line____covered);
		parentOperand__combo____fragment.setSrc(parentOperand);
		parentOperand__combo____fragment.setTrg(combo);
		ruleresult.getTranslatedEdges().add(parentOperand__combo____fragment);
		combo__parentOperand____enclosingOperand.setSrc(combo);
		combo__parentOperand____enclosingOperand.setTrg(parentOperand);
		ruleresult.getTranslatedEdges().add(
				combo__parentOperand____enclosingOperand);
		line__parentCombo____coveredBy.setSrc(line);
		line__parentCombo____coveredBy.setTrg(parentCombo);
		ruleresult.getTranslatedEdges().add(line__parentCombo____coveredBy);
		parentCombo__line____covered.setSrc(parentCombo);
		parentCombo__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(parentCombo__line____covered);
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
		parentOperand__messageSend____fragment
				.setName(parentOperand__messageSend____fragment_name_prime);
		messageSend__parentOperand____enclosingOperand
				.setName(messageSend__parentOperand____enclosingOperand_name_prime);
		parentOperand__messageReceive____fragment
				.setName(parentOperand__messageReceive____fragment_name_prime);
		messageReceive__parentOperand____enclosingOperand
				.setName(messageReceive__parentOperand____enclosingOperand_name_prime);
		line__parentOperand____coveredBy
				.setName(line__parentOperand____coveredBy_name_prime);
		parentOperand__line____covered
				.setName(parentOperand__line____covered_name_prime);
		parentOperand__combo____fragment
				.setName(parentOperand__combo____fragment_name_prime);
		combo__parentOperand____enclosingOperand
				.setName(combo__parentOperand____enclosingOperand_name_prime);
		line__parentCombo____coveredBy
				.setName(line__parentCombo____coveredBy_name_prime);
		parentCombo__line____covered
				.setName(parentCombo__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
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
		return new Object[] { ruleresult, actor, line, messageSend, flow,
				parentOperand, messageReceive, combo, parentCombo, interaction,
				step, alt, stepToCombo, operand, alternative1ToOperand, guard,
				spec, altFlow, altFlowToOperand,
				line__messageSend____coveredBy, messageSend__line____covered,
				parentOperand__messageSend____fragment,
				messageSend__parentOperand____enclosingOperand,
				parentOperand__messageReceive____fragment,
				messageReceive__parentOperand____enclosingOperand,
				line__parentOperand____coveredBy,
				parentOperand__line____covered,
				parentOperand__combo____fragment,
				combo__parentOperand____enclosingOperand,
				line__parentCombo____coveredBy, parentCombo__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment, flow__step____steps,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref, combo__operand____operand,
				line__operand____coveredBy, operand__line____covered,
				stepToCombo__step____source, stepToCombo__combo____target,
				operand__guard____guard, alternative1ToOperand__alt____source,
				alternative1ToOperand__operand____target,
				guard__spec____specification,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target };
	}

	public static final void pattern_AltSysStepNFToComboRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend, EObject flow,
			EObject parentOperand, EObject flowToParentOperand,
			EObject messageReceive, EObject combo, EObject parentCombo,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		_this.registerObjects_BWD(ruleresult, actor, line, messageSend, flow,
				parentOperand, flowToParentOperand, messageReceive, combo,
				parentCombo, interaction, useCase, useCaseToInteraction,
				packageDeclaration, step, alt, stepToCombo, operand,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand);

	}

	public static final PerformRuleResult pattern_AltSysStepNFToComboRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_1_blackFBB(
			EClass eClass, AltSysStepNFToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_12_1_binding = pattern_AltSysStepNFToComboRule_12_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltSysStepNFToComboRule_12_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_12_1_black = pattern_AltSysStepNFToComboRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltSysStepNFToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_2_bindingFFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("line");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("parentOperand");
		EObject _localVariable_3 = match.getObject("messageReceive");
		EObject _localVariable_4 = match.getObject("combo");
		EObject _localVariable_5 = match.getObject("parentCombo");
		EObject _localVariable_6 = match.getObject("interaction");
		EObject _localVariable_7 = match.getObject("operand");
		EObject _localVariable_8 = match.getObject("guard");
		EObject _localVariable_9 = match.getObject("spec");
		EObject tmpLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpParentOperand = _localVariable_2;
		EObject tmpMessageReceive = _localVariable_3;
		EObject tmpCombo = _localVariable_4;
		EObject tmpParentCombo = _localVariable_5;
		EObject tmpInteraction = _localVariable_6;
		EObject tmpOperand = _localVariable_7;
		EObject tmpGuard = _localVariable_8;
		EObject tmpSpec = _localVariable_9;
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpParentOperand instanceof InteractionOperand) {
					InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
					if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
						if (tmpCombo instanceof CombinedFragment) {
							CombinedFragment combo = (CombinedFragment) tmpCombo;
							if (tmpParentCombo instanceof CombinedFragment) {
								CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
								if (tmpInteraction instanceof Interaction) {
									Interaction interaction = (Interaction) tmpInteraction;
									if (tmpOperand instanceof InteractionOperand) {
										InteractionOperand operand = (InteractionOperand) tmpOperand;
										if (tmpGuard instanceof InteractionConstraint) {
											InteractionConstraint guard = (InteractionConstraint) tmpGuard;
											if (tmpSpec instanceof LiteralString) {
												LiteralString spec = (LiteralString) tmpSpec;
												return new Object[] { line,
														messageSend,
														parentOperand,
														messageReceive, combo,
														parentCombo,
														interaction, operand,
														guard, spec, match };
											}
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

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_12_2_blackBBFBFBBBBFFBBBB(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (!combo.equals(parentCombo)) {
				if (!operand.equals(parentOperand)) {
					for (FlowToInteractionFragment flowToParentOperand : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(parentOperand,
									FlowToInteractionFragment.class, "target")) {
						Flow tmpFlow = flowToParentOperand.getSource();
						if (tmpFlow instanceof NamedFlow) {
							NamedFlow flow = (NamedFlow) tmpFlow;
							for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(interaction,
											UseCaseToInteraction.class,
											"target")) {
								UseCase useCase = useCaseToInteraction
										.getSource();
								if (useCase != null) {
									_result.add(new Object[] { line,
											messageSend, flow, parentOperand,
											flowToParentOperand,
											messageReceive, combo, parentCombo,
											interaction, useCase,
											useCaseToInteraction, operand,
											guard, spec, match });
								}

							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_12_3_blackFBBBBBBBBBBBFBBB(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			NamedFlow flow, InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (!combo.equals(parentCombo)) {
				if (!operand.equals(parentOperand)) {
					if (line.getCoveredBy().contains(messageSend)) {
						if (parentOperand.getFragment().contains(messageSend)) {
							if (parentOperand.getFragment().contains(
									messageReceive)) {
								if (flow.equals(flowToParentOperand.getSource())) {
									if (parentOperand
											.equals(flowToParentOperand
													.getTarget())) {
										if (line.getCoveredBy().contains(
												parentOperand)) {
											if (parentOperand.getFragment()
													.contains(combo)) {
												if (parentCombo
														.getOperand()
														.contains(parentOperand)) {
													if (line.getCoveredBy()
															.contains(
																	parentCombo)) {
														if (interaction
																.equals(combo
																		.getEnclosingInteraction())) {
															if (interaction
																	.equals(line
																			.getInteraction())) {
																if (useCase
																		.getFlows()
																		.contains(
																				flow)) {
																	if (useCase
																			.equals(useCaseToInteraction
																					.getSource())) {
																		if (interaction
																				.equals(useCaseToInteraction
																						.getTarget())) {
																			if (combo
																					.getOperand()
																					.contains(
																							operand)) {
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
																											flow,
																											parentOperand,
																											flowToParentOperand,
																											messageReceive,
																											combo,
																											parentCombo,
																											interaction,
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
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_3_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToParentOperand__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToParentOperand__parentOperand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentOperand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentOperand__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__parentOperand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentCombo__parentOperand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__parentCombo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentCombo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
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
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
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
		String parentOperand__messageSend____fragment_name_prime = "fragment";
		String messageSend__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String parentOperand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String flowToParentOperand__flow____source_name_prime = "source";
		String flowToParentOperand__parentOperand____target_name_prime = "target";
		String line__parentOperand____coveredBy_name_prime = "coveredBy";
		String parentOperand__line____covered_name_prime = "covered";
		String parentOperand__combo____fragment_name_prime = "fragment";
		String combo__parentOperand____enclosingOperand_name_prime = "enclosingOperand";
		String parentCombo__parentOperand____operand_name_prime = "operand";
		String line__parentCombo____coveredBy_name_prime = "coveredBy";
		String parentCombo__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String combo__operand____operand_name_prime = "operand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(parentOperand);
		isApplicableMatch.getAllContextElements().add(flowToParentOperand);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(parentCombo);
		isApplicableMatch.getAllContextElements().add(interaction);
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
		parentOperand__messageSend____fragment.setSrc(parentOperand);
		parentOperand__messageSend____fragment.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				parentOperand__messageSend____fragment);
		messageSend__parentOperand____enclosingOperand.setSrc(messageSend);
		messageSend__parentOperand____enclosingOperand.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				messageSend__parentOperand____enclosingOperand);
		parentOperand__messageReceive____fragment.setSrc(parentOperand);
		parentOperand__messageReceive____fragment.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				parentOperand__messageReceive____fragment);
		messageReceive__parentOperand____enclosingOperand
				.setSrc(messageReceive);
		messageReceive__parentOperand____enclosingOperand.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__parentOperand____enclosingOperand);
		flowToParentOperand__flow____source.setSrc(flowToParentOperand);
		flowToParentOperand__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToParentOperand__flow____source);
		flowToParentOperand__parentOperand____target
				.setSrc(flowToParentOperand);
		flowToParentOperand__parentOperand____target.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				flowToParentOperand__parentOperand____target);
		line__parentOperand____coveredBy.setSrc(line);
		line__parentOperand____coveredBy.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				line__parentOperand____coveredBy);
		parentOperand__line____covered.setSrc(parentOperand);
		parentOperand__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				parentOperand__line____covered);
		parentOperand__combo____fragment.setSrc(parentOperand);
		parentOperand__combo____fragment.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				parentOperand__combo____fragment);
		combo__parentOperand____enclosingOperand.setSrc(combo);
		combo__parentOperand____enclosingOperand.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				combo__parentOperand____enclosingOperand);
		parentCombo__parentOperand____operand.setSrc(parentCombo);
		parentCombo__parentOperand____operand.setTrg(parentOperand);
		isApplicableMatch.getAllContextElements().add(
				parentCombo__parentOperand____operand);
		line__parentCombo____coveredBy.setSrc(line);
		line__parentCombo____coveredBy.setTrg(parentCombo);
		isApplicableMatch.getAllContextElements().add(
				line__parentCombo____coveredBy);
		parentCombo__line____covered.setSrc(parentCombo);
		parentCombo__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				parentCombo__line____covered);
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
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
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
		parentOperand__messageSend____fragment
				.setName(parentOperand__messageSend____fragment_name_prime);
		messageSend__parentOperand____enclosingOperand
				.setName(messageSend__parentOperand____enclosingOperand_name_prime);
		parentOperand__messageReceive____fragment
				.setName(parentOperand__messageReceive____fragment_name_prime);
		messageReceive__parentOperand____enclosingOperand
				.setName(messageReceive__parentOperand____enclosingOperand_name_prime);
		flowToParentOperand__flow____source
				.setName(flowToParentOperand__flow____source_name_prime);
		flowToParentOperand__parentOperand____target
				.setName(flowToParentOperand__parentOperand____target_name_prime);
		line__parentOperand____coveredBy
				.setName(line__parentOperand____coveredBy_name_prime);
		parentOperand__line____covered
				.setName(parentOperand__line____covered_name_prime);
		parentOperand__combo____fragment
				.setName(parentOperand__combo____fragment_name_prime);
		combo__parentOperand____enclosingOperand
				.setName(combo__parentOperand____enclosingOperand_name_prime);
		parentCombo__parentOperand____operand
				.setName(parentCombo__parentOperand____operand_name_prime);
		line__parentCombo____coveredBy
				.setName(line__parentCombo____coveredBy_name_prime);
		parentCombo__line____covered
				.setName(parentCombo__line____covered_name_prime);
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
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { actor, line, messageSend, flow, parentOperand,
				flowToParentOperand, messageReceive, combo, parentCombo,
				interaction, useCase, useCaseToInteraction, packageDeclaration,
				operand, guard, spec, isApplicableMatch,
				line__messageSend____coveredBy, messageSend__line____covered,
				parentOperand__messageSend____fragment,
				messageSend__parentOperand____enclosingOperand,
				parentOperand__messageReceive____fragment,
				messageReceive__parentOperand____enclosingOperand,
				flowToParentOperand__flow____source,
				flowToParentOperand__parentOperand____target,
				line__parentOperand____coveredBy,
				parentOperand__line____covered,
				parentOperand__combo____fragment,
				combo__parentOperand____enclosingOperand,
				parentCombo__parentOperand____operand,
				line__parentCombo____coveredBy, parentCombo__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors, combo__operand____operand,
				line__operand____coveredBy, operand__line____covered,
				operand__guard____guard, guard__spec____specification };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_4_bindingFBBBBBBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, actor, line, messageSend, flow,
				parentOperand, flowToParentOperand, messageReceive, combo,
				parentCombo, interaction, useCase, useCaseToInteraction,
				packageDeclaration, operand, guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					messageSend, flow, parentOperand, flowToParentOperand,
					messageReceive, combo, parentCombo, interaction, useCase,
					useCaseToInteraction, packageDeclaration, operand, guard,
					spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_AltSysStepNFToComboRule_12_4_binding = pattern_AltSysStepNFToComboRule_12_4_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, messageSend, flow,
				parentOperand, flowToParentOperand, messageReceive, combo,
				parentCombo, interaction, useCase, useCaseToInteraction,
				packageDeclaration, operand, guard, spec);
		if (result_pattern_AltSysStepNFToComboRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_12_4_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_12_4_black = pattern_AltSysStepNFToComboRule_12_4_blackB(csp);
			if (result_pattern_AltSysStepNFToComboRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, messageSend, flow, parentOperand,
						flowToParentOperand, messageReceive, combo,
						parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, operand,
						guard, spec };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_12_5_expressionFBB(
			AltSysStepNFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltSysStepNFToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltSysStepNFToComboRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_20_1_binding = pattern_AltSysStepNFToComboRule_20_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_20_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_20_1_black = pattern_AltSysStepNFToComboRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_439648 = messageSend.getMessage();
		if (__DEC_messageSend_message_439648 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_683042 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_683042 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_683042)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_56709 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_56709 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_193000 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_193000 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_193000)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_918696 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_918696 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_918696)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_160971 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_160971)) {
					if (!parentCombo.equals(__DEC_operand_operand_160971)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_317008 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_317008)) {
					if (!operand.equals(__DEC_guard_guard_317008)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_20_2_blackFFFFFFFFFFB(
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
						InteractionOperand parentOperand = messageSend
								.getEnclosingOperand();
						if (parentOperand != null) {
							if (line.getCoveredBy().contains(parentOperand)) {
								if (pattern_AltSysStepNFToComboRule_20_2_black_nac_0B(messageSend) == null) {
									if (pattern_AltSysStepNFToComboRule_20_2_black_nac_1BB(
											messageSend, interaction) == null) {
										if (pattern_AltSysStepNFToComboRule_20_2_black_nac_7BB(
												messageSend, interaction) == null) {
											for (InteractionFragment tmpParentCombo : line
													.getCoveredBy()) {
												if (tmpParentCombo instanceof CombinedFragment) {
													CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
													if (parentCombo
															.getOperand()
															.contains(
																	parentOperand)) {
														for (InteractionFragment tmpOperand : line
																.getCoveredBy()) {
															if (tmpOperand instanceof InteractionOperand) {
																InteractionOperand operand = (InteractionOperand) tmpOperand;
																if (!operand
																		.equals(parentOperand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepNFToComboRule_20_2_black_nac_4BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepNFToComboRule_20_2_black_nac_8BB(
																						operand,
																						messageSend) == null) {
																					if (pattern_AltSysStepNFToComboRule_20_2_black_nac_12BB(
																							operand,
																							interaction) == null) {
																						if (pattern_AltSysStepNFToComboRule_20_2_black_nac_13BB(
																								parentCombo,
																								operand) == null) {
																							if (pattern_AltSysStepNFToComboRule_20_2_black_nac_14BB(
																									parentOperand,
																									operand) == null) {
																								if (pattern_AltSysStepNFToComboRule_20_2_black_nac_6BBB(
																										guard,
																										parentOperand,
																										operand) == null) {
																									if (pattern_AltSysStepNFToComboRule_20_2_black_nac_15BB(
																											parentOperand,
																											guard) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_20_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_20_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_20_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_20_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_20_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_20_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_20_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_20_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_21_1_binding = pattern_AltSysStepNFToComboRule_21_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_21_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_21_1_black = pattern_AltSysStepNFToComboRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_697819 = messageSend.getMessage();
		if (__DEC_messageSend_message_697819 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_560363 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_560363 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_560363)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_70724 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_70724 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_393893 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_393893 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_393893)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_454419 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_454419 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_454419)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_950189 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_950189)) {
					if (!parentCombo.equals(__DEC_operand_operand_950189)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_718421 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_718421)) {
					if (!operand.equals(__DEC_guard_guard_718421)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_21_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(messageSend)) {
					InteractionOperand parentOperand = messageSend
							.getEnclosingOperand();
					if (parentOperand != null) {
						if (line.getCoveredBy().contains(parentOperand)) {
							Interaction interaction = line.getInteraction();
							if (interaction != null) {
								if (pattern_AltSysStepNFToComboRule_21_2_black_nac_0B(messageSend) == null) {
									if (pattern_AltSysStepNFToComboRule_21_2_black_nac_1BB(
											messageSend, interaction) == null) {
										if (pattern_AltSysStepNFToComboRule_21_2_black_nac_7BB(
												messageSend, interaction) == null) {
											for (InteractionFragment tmpParentCombo : line
													.getCoveredBy()) {
												if (tmpParentCombo instanceof CombinedFragment) {
													CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
													if (parentCombo
															.getOperand()
															.contains(
																	parentOperand)) {
														for (InteractionFragment tmpOperand : line
																.getCoveredBy()) {
															if (tmpOperand instanceof InteractionOperand) {
																InteractionOperand operand = (InteractionOperand) tmpOperand;
																if (!operand
																		.equals(parentOperand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepNFToComboRule_21_2_black_nac_4BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepNFToComboRule_21_2_black_nac_8BB(
																						operand,
																						messageSend) == null) {
																					if (pattern_AltSysStepNFToComboRule_21_2_black_nac_12BB(
																							operand,
																							interaction) == null) {
																						if (pattern_AltSysStepNFToComboRule_21_2_black_nac_13BB(
																								parentCombo,
																								operand) == null) {
																							if (pattern_AltSysStepNFToComboRule_21_2_black_nac_14BB(
																									parentOperand,
																									operand) == null) {
																								if (pattern_AltSysStepNFToComboRule_21_2_black_nac_6BBB(
																										guard,
																										parentOperand,
																										operand) == null) {
																									if (pattern_AltSysStepNFToComboRule_21_2_black_nac_15BB(
																											parentOperand,
																											guard) == null) {
																										for (InteractionFragment tmpMessageReceive : parentOperand
																												.getFragment()) {
																											if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																												MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																												if (!messageReceive
																														.equals(messageSend)) {
																													if (pattern_AltSysStepNFToComboRule_21_2_black_nac_2B(messageReceive) == null) {
																														if (pattern_AltSysStepNFToComboRule_21_2_black_nac_3BB(
																																messageReceive,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_21_2_black_nac_9BB(
																																	messageReceive,
																																	interaction) == null) {
																																if (pattern_AltSysStepNFToComboRule_21_2_black_nac_10BB(
																																		operand,
																																		messageReceive) == null) {
																																	for (InteractionFragment tmpCombo : parentOperand
																																			.getFragment()) {
																																		if (tmpCombo instanceof CombinedFragment) {
																																			CombinedFragment combo = (CombinedFragment) tmpCombo;
																																			if (!combo
																																					.equals(parentCombo)) {
																																				if (interaction
																																						.equals(combo
																																								.getEnclosingInteraction())) {
																																					if (combo
																																							.getOperand()
																																							.contains(
																																									operand)) {
																																						if (pattern_AltSysStepNFToComboRule_21_2_black_nac_5BBB(
																																								operand,
																																								combo,
																																								parentCombo) == null) {
																																							if (pattern_AltSysStepNFToComboRule_21_2_black_nac_11BB(
																																									operand,
																																									combo) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_21_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_21_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_22_1_binding = pattern_AltSysStepNFToComboRule_22_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_22_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_22_1_black = pattern_AltSysStepNFToComboRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_199666 = messageSend.getMessage();
		if (__DEC_messageSend_message_199666 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_238176 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_238176 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_238176)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_937199 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_937199 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_992267 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_992267 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_992267)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_490989 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_490989 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_490989)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_599849 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_599849)) {
					if (!parentCombo.equals(__DEC_operand_operand_599849)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_958384 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_958384)) {
					if (!operand.equals(__DEC_guard_guard_958384)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_22_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParentOperand = _edge_fragment.getSrc();
		if (tmpParentOperand instanceof InteractionOperand) {
			InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
			EObject tmpMessageSend = _edge_fragment.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (parentOperand.getFragment().contains(messageSend)) {
					if (pattern_AltSysStepNFToComboRule_22_2_black_nac_0B(messageSend) == null) {
						for (InteractionFragment tmpMessageReceive : parentOperand
								.getFragment()) {
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (!messageReceive.equals(messageSend)) {
									if (pattern_AltSysStepNFToComboRule_22_2_black_nac_2B(messageReceive) == null) {
										for (Lifeline line : parentOperand
												.getCovered()) {
											if (line.getCoveredBy().contains(
													messageSend)) {
												Interaction interaction = line
														.getInteraction();
												if (interaction != null) {
													if (pattern_AltSysStepNFToComboRule_22_2_black_nac_1BB(
															messageSend,
															interaction) == null) {
														if (pattern_AltSysStepNFToComboRule_22_2_black_nac_3BB(
																messageReceive,
																interaction) == null) {
															if (pattern_AltSysStepNFToComboRule_22_2_black_nac_7BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_AltSysStepNFToComboRule_22_2_black_nac_9BB(
																		messageReceive,
																		interaction) == null) {
																	for (InteractionFragment tmpCombo : parentOperand
																			.getFragment()) {
																		if (tmpCombo instanceof CombinedFragment) {
																			CombinedFragment combo = (CombinedFragment) tmpCombo;
																			if (interaction
																					.equals(combo
																							.getEnclosingInteraction())) {
																				for (InteractionFragment tmpParentCombo : line
																						.getCoveredBy()) {
																					if (tmpParentCombo instanceof CombinedFragment) {
																						CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																						if (!combo
																								.equals(parentCombo)) {
																							if (parentCombo
																									.getOperand()
																									.contains(
																											parentOperand)) {
																								for (InteractionFragment tmpOperand : line
																										.getCoveredBy()) {
																									if (tmpOperand instanceof InteractionOperand) {
																										InteractionOperand operand = (InteractionOperand) tmpOperand;
																										if (!operand
																												.equals(parentOperand)) {
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
																														if (pattern_AltSysStepNFToComboRule_22_2_black_nac_4BB(
																																operand,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_22_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_22_2_black_nac_8BB(
																																		operand,
																																		messageSend) == null) {
																																	if (pattern_AltSysStepNFToComboRule_22_2_black_nac_10BB(
																																			operand,
																																			messageReceive) == null) {
																																		if (pattern_AltSysStepNFToComboRule_22_2_black_nac_11BB(
																																				operand,
																																				combo) == null) {
																																			if (pattern_AltSysStepNFToComboRule_22_2_black_nac_12BB(
																																					operand,
																																					interaction) == null) {
																																				if (pattern_AltSysStepNFToComboRule_22_2_black_nac_13BB(
																																						parentCombo,
																																						operand) == null) {
																																					if (pattern_AltSysStepNFToComboRule_22_2_black_nac_14BB(
																																							parentOperand,
																																							operand) == null) {
																																						if (pattern_AltSysStepNFToComboRule_22_2_black_nac_6BBB(
																																								guard,
																																								parentOperand,
																																								operand) == null) {
																																							if (pattern_AltSysStepNFToComboRule_22_2_black_nac_15BB(
																																									parentOperand,
																																									guard) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_22_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_22_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_23_1_binding = pattern_AltSysStepNFToComboRule_23_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_23_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_23_1_black = pattern_AltSysStepNFToComboRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_588060 = messageSend.getMessage();
		if (__DEC_messageSend_message_588060 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_169211 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_169211 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_169211)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_148654 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_148654 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_366529 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_366529 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_366529)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_980446 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_980446 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_980446)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_348122 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_348122)) {
					if (!parentCombo.equals(__DEC_operand_operand_348122)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_806793 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_806793)) {
					if (!operand.equals(__DEC_guard_guard_806793)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_23_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_enclosingOperand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_enclosingOperand.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpParentOperand = _edge_enclosingOperand.getTrg();
			if (tmpParentOperand instanceof InteractionOperand) {
				InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
				if (parentOperand.getFragment().contains(messageSend)) {
					if (pattern_AltSysStepNFToComboRule_23_2_black_nac_0B(messageSend) == null) {
						for (Lifeline line : messageSend.getCovered()) {
							if (line.getCoveredBy().contains(parentOperand)) {
								Interaction interaction = line.getInteraction();
								if (interaction != null) {
									if (pattern_AltSysStepNFToComboRule_23_2_black_nac_1BB(
											messageSend, interaction) == null) {
										if (pattern_AltSysStepNFToComboRule_23_2_black_nac_7BB(
												messageSend, interaction) == null) {
											for (InteractionFragment tmpMessageReceive : parentOperand
													.getFragment()) {
												if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
													if (!messageReceive
															.equals(messageSend)) {
														if (pattern_AltSysStepNFToComboRule_23_2_black_nac_2B(messageReceive) == null) {
															if (pattern_AltSysStepNFToComboRule_23_2_black_nac_3BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_AltSysStepNFToComboRule_23_2_black_nac_9BB(
																		messageReceive,
																		interaction) == null) {
																	for (InteractionFragment tmpCombo : parentOperand
																			.getFragment()) {
																		if (tmpCombo instanceof CombinedFragment) {
																			CombinedFragment combo = (CombinedFragment) tmpCombo;
																			if (interaction
																					.equals(combo
																							.getEnclosingInteraction())) {
																				for (InteractionFragment tmpParentCombo : line
																						.getCoveredBy()) {
																					if (tmpParentCombo instanceof CombinedFragment) {
																						CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																						if (!combo
																								.equals(parentCombo)) {
																							if (parentCombo
																									.getOperand()
																									.contains(
																											parentOperand)) {
																								for (InteractionFragment tmpOperand : line
																										.getCoveredBy()) {
																									if (tmpOperand instanceof InteractionOperand) {
																										InteractionOperand operand = (InteractionOperand) tmpOperand;
																										if (!operand
																												.equals(parentOperand)) {
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
																														if (pattern_AltSysStepNFToComboRule_23_2_black_nac_4BB(
																																operand,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_23_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_23_2_black_nac_8BB(
																																		operand,
																																		messageSend) == null) {
																																	if (pattern_AltSysStepNFToComboRule_23_2_black_nac_10BB(
																																			operand,
																																			messageReceive) == null) {
																																		if (pattern_AltSysStepNFToComboRule_23_2_black_nac_11BB(
																																				operand,
																																				combo) == null) {
																																			if (pattern_AltSysStepNFToComboRule_23_2_black_nac_12BB(
																																					operand,
																																					interaction) == null) {
																																				if (pattern_AltSysStepNFToComboRule_23_2_black_nac_13BB(
																																						parentCombo,
																																						operand) == null) {
																																					if (pattern_AltSysStepNFToComboRule_23_2_black_nac_14BB(
																																							parentOperand,
																																							operand) == null) {
																																						if (pattern_AltSysStepNFToComboRule_23_2_black_nac_6BBB(
																																								guard,
																																								parentOperand,
																																								operand) == null) {
																																							if (pattern_AltSysStepNFToComboRule_23_2_black_nac_15BB(
																																									parentOperand,
																																									guard) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
																																										operand,
																																										guard,
																																										spec,
																																										_edge_enclosingOperand });
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}

																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_23_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_23_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_24_1_binding = pattern_AltSysStepNFToComboRule_24_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_24_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_24_1_black = pattern_AltSysStepNFToComboRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_413254 = messageSend.getMessage();
		if (__DEC_messageSend_message_413254 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_137816 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_137816 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_137816)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_599042 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_599042 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_136463 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_136463 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_136463)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_693285 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_693285 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_693285)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_549333 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_549333)) {
					if (!parentCombo.equals(__DEC_operand_operand_549333)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_646084 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_646084)) {
					if (!operand.equals(__DEC_guard_guard_646084)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_24_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParentOperand = _edge_fragment.getSrc();
		if (tmpParentOperand instanceof InteractionOperand) {
			InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
			EObject tmpMessageReceive = _edge_fragment.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (parentOperand.getFragment().contains(messageReceive)) {
					if (pattern_AltSysStepNFToComboRule_24_2_black_nac_2B(messageReceive) == null) {
						for (InteractionFragment tmpMessageSend : parentOperand
								.getFragment()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (!messageReceive.equals(messageSend)) {
									if (pattern_AltSysStepNFToComboRule_24_2_black_nac_0B(messageSend) == null) {
										for (Lifeline line : parentOperand
												.getCovered()) {
											if (line.getCoveredBy().contains(
													messageSend)) {
												Interaction interaction = line
														.getInteraction();
												if (interaction != null) {
													if (pattern_AltSysStepNFToComboRule_24_2_black_nac_1BB(
															messageSend,
															interaction) == null) {
														if (pattern_AltSysStepNFToComboRule_24_2_black_nac_3BB(
																messageReceive,
																interaction) == null) {
															if (pattern_AltSysStepNFToComboRule_24_2_black_nac_7BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_AltSysStepNFToComboRule_24_2_black_nac_9BB(
																		messageReceive,
																		interaction) == null) {
																	for (InteractionFragment tmpCombo : parentOperand
																			.getFragment()) {
																		if (tmpCombo instanceof CombinedFragment) {
																			CombinedFragment combo = (CombinedFragment) tmpCombo;
																			if (interaction
																					.equals(combo
																							.getEnclosingInteraction())) {
																				for (InteractionFragment tmpParentCombo : line
																						.getCoveredBy()) {
																					if (tmpParentCombo instanceof CombinedFragment) {
																						CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																						if (!combo
																								.equals(parentCombo)) {
																							if (parentCombo
																									.getOperand()
																									.contains(
																											parentOperand)) {
																								for (InteractionFragment tmpOperand : line
																										.getCoveredBy()) {
																									if (tmpOperand instanceof InteractionOperand) {
																										InteractionOperand operand = (InteractionOperand) tmpOperand;
																										if (!operand
																												.equals(parentOperand)) {
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
																														if (pattern_AltSysStepNFToComboRule_24_2_black_nac_4BB(
																																operand,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_24_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_24_2_black_nac_8BB(
																																		operand,
																																		messageSend) == null) {
																																	if (pattern_AltSysStepNFToComboRule_24_2_black_nac_10BB(
																																			operand,
																																			messageReceive) == null) {
																																		if (pattern_AltSysStepNFToComboRule_24_2_black_nac_11BB(
																																				operand,
																																				combo) == null) {
																																			if (pattern_AltSysStepNFToComboRule_24_2_black_nac_12BB(
																																					operand,
																																					interaction) == null) {
																																				if (pattern_AltSysStepNFToComboRule_24_2_black_nac_13BB(
																																						parentCombo,
																																						operand) == null) {
																																					if (pattern_AltSysStepNFToComboRule_24_2_black_nac_14BB(
																																							parentOperand,
																																							operand) == null) {
																																						if (pattern_AltSysStepNFToComboRule_24_2_black_nac_6BBB(
																																								guard,
																																								parentOperand,
																																								operand) == null) {
																																							if (pattern_AltSysStepNFToComboRule_24_2_black_nac_15BB(
																																									parentOperand,
																																									guard) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_24_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_24_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_25_1_binding = pattern_AltSysStepNFToComboRule_25_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_25_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_25_1_black = pattern_AltSysStepNFToComboRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_505243 = messageSend.getMessage();
		if (__DEC_messageSend_message_505243 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_667040 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_667040 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_667040)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_189347 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_189347 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_505678 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_505678 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_505678)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_48861 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_48861 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_48861)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_32701 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_32701)) {
					if (!parentCombo.equals(__DEC_operand_operand_32701)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_390629 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_390629)) {
					if (!operand.equals(__DEC_guard_guard_390629)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_25_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_enclosingOperand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_enclosingOperand.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpParentOperand = _edge_enclosingOperand.getTrg();
			if (tmpParentOperand instanceof InteractionOperand) {
				InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
				if (parentOperand.getFragment().contains(messageReceive)) {
					if (pattern_AltSysStepNFToComboRule_25_2_black_nac_2B(messageReceive) == null) {
						for (InteractionFragment tmpMessageSend : parentOperand
								.getFragment()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (!messageReceive.equals(messageSend)) {
									if (pattern_AltSysStepNFToComboRule_25_2_black_nac_0B(messageSend) == null) {
										for (Lifeline line : parentOperand
												.getCovered()) {
											if (line.getCoveredBy().contains(
													messageSend)) {
												Interaction interaction = line
														.getInteraction();
												if (interaction != null) {
													if (pattern_AltSysStepNFToComboRule_25_2_black_nac_1BB(
															messageSend,
															interaction) == null) {
														if (pattern_AltSysStepNFToComboRule_25_2_black_nac_3BB(
																messageReceive,
																interaction) == null) {
															if (pattern_AltSysStepNFToComboRule_25_2_black_nac_7BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_AltSysStepNFToComboRule_25_2_black_nac_9BB(
																		messageReceive,
																		interaction) == null) {
																	for (InteractionFragment tmpCombo : parentOperand
																			.getFragment()) {
																		if (tmpCombo instanceof CombinedFragment) {
																			CombinedFragment combo = (CombinedFragment) tmpCombo;
																			if (interaction
																					.equals(combo
																							.getEnclosingInteraction())) {
																				for (InteractionFragment tmpParentCombo : line
																						.getCoveredBy()) {
																					if (tmpParentCombo instanceof CombinedFragment) {
																						CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																						if (!combo
																								.equals(parentCombo)) {
																							if (parentCombo
																									.getOperand()
																									.contains(
																											parentOperand)) {
																								for (InteractionFragment tmpOperand : line
																										.getCoveredBy()) {
																									if (tmpOperand instanceof InteractionOperand) {
																										InteractionOperand operand = (InteractionOperand) tmpOperand;
																										if (!operand
																												.equals(parentOperand)) {
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
																														if (pattern_AltSysStepNFToComboRule_25_2_black_nac_4BB(
																																operand,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_25_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_25_2_black_nac_8BB(
																																		operand,
																																		messageSend) == null) {
																																	if (pattern_AltSysStepNFToComboRule_25_2_black_nac_10BB(
																																			operand,
																																			messageReceive) == null) {
																																		if (pattern_AltSysStepNFToComboRule_25_2_black_nac_11BB(
																																				operand,
																																				combo) == null) {
																																			if (pattern_AltSysStepNFToComboRule_25_2_black_nac_12BB(
																																					operand,
																																					interaction) == null) {
																																				if (pattern_AltSysStepNFToComboRule_25_2_black_nac_13BB(
																																						parentCombo,
																																						operand) == null) {
																																					if (pattern_AltSysStepNFToComboRule_25_2_black_nac_14BB(
																																							parentOperand,
																																							operand) == null) {
																																						if (pattern_AltSysStepNFToComboRule_25_2_black_nac_6BBB(
																																								guard,
																																								parentOperand,
																																								operand) == null) {
																																							if (pattern_AltSysStepNFToComboRule_25_2_black_nac_15BB(
																																									parentOperand,
																																									guard) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
																																										operand,
																																										guard,
																																										spec,
																																										_edge_enclosingOperand });
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}

																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_25_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_25_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_26_1_binding = pattern_AltSysStepNFToComboRule_26_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_26_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_26_1_black = pattern_AltSysStepNFToComboRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_504616 = messageSend.getMessage();
		if (__DEC_messageSend_message_504616 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_288790 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_288790 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_288790)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_852108 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_852108 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_288425 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_288425 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_288425)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_462503 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_462503 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_462503)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_229122 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_229122)) {
					if (!parentCombo.equals(__DEC_operand_operand_229122)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_46955 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_46955)) {
					if (!operand.equals(__DEC_guard_guard_46955)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_26_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpParentOperand = _edge_coveredBy.getTrg();
			if (tmpParentOperand instanceof InteractionOperand) {
				InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
				if (line.getCoveredBy().contains(parentOperand)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						for (InteractionFragment tmpMessageSend : line
								.getCoveredBy()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (parentOperand.getFragment().contains(
										messageSend)) {
									if (pattern_AltSysStepNFToComboRule_26_2_black_nac_0B(messageSend) == null) {
										if (pattern_AltSysStepNFToComboRule_26_2_black_nac_1BB(
												messageSend, interaction) == null) {
											if (pattern_AltSysStepNFToComboRule_26_2_black_nac_7BB(
													messageSend, interaction) == null) {
												for (InteractionFragment tmpParentCombo : line
														.getCoveredBy()) {
													if (tmpParentCombo instanceof CombinedFragment) {
														CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
														if (parentCombo
																.getOperand()
																.contains(
																		parentOperand)) {
															for (InteractionFragment tmpOperand : line
																	.getCoveredBy()) {
																if (tmpOperand instanceof InteractionOperand) {
																	InteractionOperand operand = (InteractionOperand) tmpOperand;
																	if (!operand
																			.equals(parentOperand)) {
																		InteractionConstraint guard = operand
																				.getGuard();
																		if (guard != null) {
																			ValueSpecification tmpSpec = guard
																					.getSpecification();
																			if (tmpSpec instanceof LiteralString) {
																				LiteralString spec = (LiteralString) tmpSpec;
																				if (pattern_AltSysStepNFToComboRule_26_2_black_nac_4BB(
																						operand,
																						interaction) == null) {
																					if (pattern_AltSysStepNFToComboRule_26_2_black_nac_8BB(
																							operand,
																							messageSend) == null) {
																						if (pattern_AltSysStepNFToComboRule_26_2_black_nac_12BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltSysStepNFToComboRule_26_2_black_nac_13BB(
																									parentCombo,
																									operand) == null) {
																								if (pattern_AltSysStepNFToComboRule_26_2_black_nac_14BB(
																										parentOperand,
																										operand) == null) {
																									if (pattern_AltSysStepNFToComboRule_26_2_black_nac_6BBB(
																											guard,
																											parentOperand,
																											operand) == null) {
																										if (pattern_AltSysStepNFToComboRule_26_2_black_nac_15BB(
																												parentOperand,
																												guard) == null) {
																											for (InteractionFragment tmpMessageReceive : parentOperand
																													.getFragment()) {
																												if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																													MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																													if (!messageReceive
																															.equals(messageSend)) {
																														if (pattern_AltSysStepNFToComboRule_26_2_black_nac_2B(messageReceive) == null) {
																															if (pattern_AltSysStepNFToComboRule_26_2_black_nac_3BB(
																																	messageReceive,
																																	interaction) == null) {
																																if (pattern_AltSysStepNFToComboRule_26_2_black_nac_9BB(
																																		messageReceive,
																																		interaction) == null) {
																																	if (pattern_AltSysStepNFToComboRule_26_2_black_nac_10BB(
																																			operand,
																																			messageReceive) == null) {
																																		for (InteractionFragment tmpCombo : parentOperand
																																				.getFragment()) {
																																			if (tmpCombo instanceof CombinedFragment) {
																																				CombinedFragment combo = (CombinedFragment) tmpCombo;
																																				if (!combo
																																						.equals(parentCombo)) {
																																					if (interaction
																																							.equals(combo
																																									.getEnclosingInteraction())) {
																																						if (combo
																																								.getOperand()
																																								.contains(
																																										operand)) {
																																							if (pattern_AltSysStepNFToComboRule_26_2_black_nac_5BBB(
																																									operand,
																																									combo,
																																									parentCombo) == null) {
																																								if (pattern_AltSysStepNFToComboRule_26_2_black_nac_11BB(
																																										operand,
																																										combo) == null) {
																																									_result.add(new Object[] {
																																											line,
																																											messageSend,
																																											parentOperand,
																																											messageReceive,
																																											combo,
																																											parentCombo,
																																											interaction,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_26_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_26_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_27_1_binding = pattern_AltSysStepNFToComboRule_27_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_27_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_27_1_black = pattern_AltSysStepNFToComboRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_717414 = messageSend.getMessage();
		if (__DEC_messageSend_message_717414 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_244518 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_244518 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_244518)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_326499 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_326499 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_848647 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_848647 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_848647)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_146478 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_146478 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_146478)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_20567 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_20567)) {
					if (!parentCombo.equals(__DEC_operand_operand_20567)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_945206 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_945206)) {
					if (!operand.equals(__DEC_guard_guard_945206)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_27_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParentOperand = _edge_covered.getSrc();
		if (tmpParentOperand instanceof InteractionOperand) {
			InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(parentOperand)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						for (InteractionFragment tmpMessageSend : parentOperand
								.getFragment()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (line.getCoveredBy().contains(messageSend)) {
									if (pattern_AltSysStepNFToComboRule_27_2_black_nac_0B(messageSend) == null) {
										if (pattern_AltSysStepNFToComboRule_27_2_black_nac_1BB(
												messageSend, interaction) == null) {
											if (pattern_AltSysStepNFToComboRule_27_2_black_nac_7BB(
													messageSend, interaction) == null) {
												for (InteractionFragment tmpMessageReceive : parentOperand
														.getFragment()) {
													if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
														MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
														if (!messageReceive
																.equals(messageSend)) {
															if (pattern_AltSysStepNFToComboRule_27_2_black_nac_2B(messageReceive) == null) {
																if (pattern_AltSysStepNFToComboRule_27_2_black_nac_3BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_AltSysStepNFToComboRule_27_2_black_nac_9BB(
																			messageReceive,
																			interaction) == null) {
																		for (InteractionFragment tmpCombo : parentOperand
																				.getFragment()) {
																			if (tmpCombo instanceof CombinedFragment) {
																				CombinedFragment combo = (CombinedFragment) tmpCombo;
																				if (interaction
																						.equals(combo
																								.getEnclosingInteraction())) {
																					for (InteractionFragment tmpParentCombo : line
																							.getCoveredBy()) {
																						if (tmpParentCombo instanceof CombinedFragment) {
																							CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																							if (!combo
																									.equals(parentCombo)) {
																								if (parentCombo
																										.getOperand()
																										.contains(
																												parentOperand)) {
																									for (InteractionFragment tmpOperand : line
																											.getCoveredBy()) {
																										if (tmpOperand instanceof InteractionOperand) {
																											InteractionOperand operand = (InteractionOperand) tmpOperand;
																											if (!operand
																													.equals(parentOperand)) {
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
																															if (pattern_AltSysStepNFToComboRule_27_2_black_nac_4BB(
																																	operand,
																																	interaction) == null) {
																																if (pattern_AltSysStepNFToComboRule_27_2_black_nac_5BBB(
																																		operand,
																																		combo,
																																		parentCombo) == null) {
																																	if (pattern_AltSysStepNFToComboRule_27_2_black_nac_8BB(
																																			operand,
																																			messageSend) == null) {
																																		if (pattern_AltSysStepNFToComboRule_27_2_black_nac_10BB(
																																				operand,
																																				messageReceive) == null) {
																																			if (pattern_AltSysStepNFToComboRule_27_2_black_nac_11BB(
																																					operand,
																																					combo) == null) {
																																				if (pattern_AltSysStepNFToComboRule_27_2_black_nac_12BB(
																																						operand,
																																						interaction) == null) {
																																					if (pattern_AltSysStepNFToComboRule_27_2_black_nac_13BB(
																																							parentCombo,
																																							operand) == null) {
																																						if (pattern_AltSysStepNFToComboRule_27_2_black_nac_14BB(
																																								parentOperand,
																																								operand) == null) {
																																							if (pattern_AltSysStepNFToComboRule_27_2_black_nac_6BBB(
																																									guard,
																																									parentOperand,
																																									operand) == null) {
																																								if (pattern_AltSysStepNFToComboRule_27_2_black_nac_15BB(
																																										parentOperand,
																																										guard) == null) {
																																									_result.add(new Object[] {
																																											line,
																																											messageSend,
																																											parentOperand,
																																											messageReceive,
																																											combo,
																																											parentCombo,
																																											interaction,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_27_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_27_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_28_1_binding = pattern_AltSysStepNFToComboRule_28_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_28_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_28_1_black = pattern_AltSysStepNFToComboRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_779266 = messageSend.getMessage();
		if (__DEC_messageSend_message_779266 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_403642 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_403642 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_403642)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_800318 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_800318 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_614058 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_614058 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_614058)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_646712 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_646712 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_646712)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_95095 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_95095)) {
					if (!parentCombo.equals(__DEC_operand_operand_95095)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_641642 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_641642)) {
					if (!operand.equals(__DEC_guard_guard_641642)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_28_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParentOperand = _edge_fragment.getSrc();
		if (tmpParentOperand instanceof InteractionOperand) {
			InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
			EObject tmpCombo = _edge_fragment.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (parentOperand.getFragment().contains(combo)) {
					Interaction interaction = combo.getEnclosingInteraction();
					if (interaction != null) {
						for (InteractionFragment tmpMessageSend : parentOperand
								.getFragment()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (pattern_AltSysStepNFToComboRule_28_2_black_nac_0B(messageSend) == null) {
									if (pattern_AltSysStepNFToComboRule_28_2_black_nac_1BB(
											messageSend, interaction) == null) {
										if (pattern_AltSysStepNFToComboRule_28_2_black_nac_7BB(
												messageSend, interaction) == null) {
											for (InteractionFragment tmpMessageReceive : parentOperand
													.getFragment()) {
												if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
													if (!messageReceive
															.equals(messageSend)) {
														if (pattern_AltSysStepNFToComboRule_28_2_black_nac_2B(messageReceive) == null) {
															if (pattern_AltSysStepNFToComboRule_28_2_black_nac_3BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_AltSysStepNFToComboRule_28_2_black_nac_9BB(
																		messageReceive,
																		interaction) == null) {
																	for (Lifeline line : parentOperand
																			.getCovered()) {
																		if (line.getCoveredBy()
																				.contains(
																						messageSend)) {
																			if (interaction
																					.equals(line
																							.getInteraction())) {
																				for (InteractionOperand operand : combo
																						.getOperand()) {
																					if (!operand
																							.equals(parentOperand)) {
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
																									if (pattern_AltSysStepNFToComboRule_28_2_black_nac_4BB(
																											operand,
																											interaction) == null) {
																										if (pattern_AltSysStepNFToComboRule_28_2_black_nac_8BB(
																												operand,
																												messageSend) == null) {
																											if (pattern_AltSysStepNFToComboRule_28_2_black_nac_10BB(
																													operand,
																													messageReceive) == null) {
																												if (pattern_AltSysStepNFToComboRule_28_2_black_nac_11BB(
																														operand,
																														combo) == null) {
																													if (pattern_AltSysStepNFToComboRule_28_2_black_nac_12BB(
																															operand,
																															interaction) == null) {
																														if (pattern_AltSysStepNFToComboRule_28_2_black_nac_14BB(
																																parentOperand,
																																operand) == null) {
																															if (pattern_AltSysStepNFToComboRule_28_2_black_nac_6BBB(
																																	guard,
																																	parentOperand,
																																	operand) == null) {
																																if (pattern_AltSysStepNFToComboRule_28_2_black_nac_15BB(
																																		parentOperand,
																																		guard) == null) {
																																	for (InteractionFragment tmpParentCombo : line
																																			.getCoveredBy()) {
																																		if (tmpParentCombo instanceof CombinedFragment) {
																																			CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																																			if (!combo
																																					.equals(parentCombo)) {
																																				if (parentCombo
																																						.getOperand()
																																						.contains(
																																								parentOperand)) {
																																					if (pattern_AltSysStepNFToComboRule_28_2_black_nac_5BBB(
																																							operand,
																																							combo,
																																							parentCombo) == null) {
																																						if (pattern_AltSysStepNFToComboRule_28_2_black_nac_13BB(
																																								parentCombo,
																																								operand) == null) {
																																							_result.add(new Object[] {
																																									line,
																																									messageSend,
																																									parentOperand,
																																									messageReceive,
																																									combo,
																																									parentCombo,
																																									interaction,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_28_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_28_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_29_1_binding = pattern_AltSysStepNFToComboRule_29_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_29_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_29_1_black = pattern_AltSysStepNFToComboRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_473744 = messageSend.getMessage();
		if (__DEC_messageSend_message_473744 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_122706 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_122706 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_122706)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_124093 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_124093 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_965949 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_965949 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_965949)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_388739 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_388739 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_388739)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_113092 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_113092)) {
					if (!parentCombo.equals(__DEC_operand_operand_113092)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_58813 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_58813)) {
					if (!operand.equals(__DEC_guard_guard_58813)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_29_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_enclosingOperand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_enclosingOperand.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpParentOperand = _edge_enclosingOperand.getTrg();
			if (tmpParentOperand instanceof InteractionOperand) {
				InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
				if (parentOperand.getFragment().contains(combo)) {
					Interaction interaction = combo.getEnclosingInteraction();
					if (interaction != null) {
						for (InteractionOperand operand : combo.getOperand()) {
							if (!operand.equals(parentOperand)) {
								InteractionConstraint guard = operand
										.getGuard();
								if (guard != null) {
									ValueSpecification tmpSpec = guard
											.getSpecification();
									if (tmpSpec instanceof LiteralString) {
										LiteralString spec = (LiteralString) tmpSpec;
										if (pattern_AltSysStepNFToComboRule_29_2_black_nac_4BB(
												operand, interaction) == null) {
											if (pattern_AltSysStepNFToComboRule_29_2_black_nac_11BB(
													operand, combo) == null) {
												if (pattern_AltSysStepNFToComboRule_29_2_black_nac_12BB(
														operand, interaction) == null) {
													if (pattern_AltSysStepNFToComboRule_29_2_black_nac_14BB(
															parentOperand,
															operand) == null) {
														if (pattern_AltSysStepNFToComboRule_29_2_black_nac_6BBB(
																guard,
																parentOperand,
																operand) == null) {
															if (pattern_AltSysStepNFToComboRule_29_2_black_nac_15BB(
																	parentOperand,
																	guard) == null) {
																for (InteractionFragment tmpMessageSend : parentOperand
																		.getFragment()) {
																	if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																		if (pattern_AltSysStepNFToComboRule_29_2_black_nac_0B(messageSend) == null) {
																			if (pattern_AltSysStepNFToComboRule_29_2_black_nac_1BB(
																					messageSend,
																					interaction) == null) {
																				if (pattern_AltSysStepNFToComboRule_29_2_black_nac_7BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_AltSysStepNFToComboRule_29_2_black_nac_8BB(
																							operand,
																							messageSend) == null) {
																						for (InteractionFragment tmpMessageReceive : parentOperand
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepNFToComboRule_29_2_black_nac_2B(messageReceive) == null) {
																										if (pattern_AltSysStepNFToComboRule_29_2_black_nac_3BB(
																												messageReceive,
																												interaction) == null) {
																											if (pattern_AltSysStepNFToComboRule_29_2_black_nac_9BB(
																													messageReceive,
																													interaction) == null) {
																												if (pattern_AltSysStepNFToComboRule_29_2_black_nac_10BB(
																														operand,
																														messageReceive) == null) {
																													for (Lifeline line : parentOperand
																															.getCovered()) {
																														if (line.getCoveredBy()
																																.contains(
																																		messageSend)) {
																															if (interaction
																																	.equals(line
																																			.getInteraction())) {
																																if (line.getCoveredBy()
																																		.contains(
																																				operand)) {
																																	for (InteractionFragment tmpParentCombo : line
																																			.getCoveredBy()) {
																																		if (tmpParentCombo instanceof CombinedFragment) {
																																			CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																																			if (!combo
																																					.equals(parentCombo)) {
																																				if (parentCombo
																																						.getOperand()
																																						.contains(
																																								parentOperand)) {
																																					if (pattern_AltSysStepNFToComboRule_29_2_black_nac_5BBB(
																																							operand,
																																							combo,
																																							parentCombo) == null) {
																																						if (pattern_AltSysStepNFToComboRule_29_2_black_nac_13BB(
																																								parentCombo,
																																								operand) == null) {
																																							_result.add(new Object[] {
																																									line,
																																									messageSend,
																																									parentOperand,
																																									messageReceive,
																																									combo,
																																									parentCombo,
																																									interaction,
																																									operand,
																																									guard,
																																									spec,
																																									_edge_enclosingOperand });
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_29_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_29_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_30_1_binding = pattern_AltSysStepNFToComboRule_30_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_30_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_30_1_black = pattern_AltSysStepNFToComboRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_172977 = messageSend.getMessage();
		if (__DEC_messageSend_message_172977 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_901724 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_901724 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_901724)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_332970 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_332970 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_604275 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_604275 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_604275)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_391770 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_391770 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_391770)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_649489 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_649489)) {
					if (!parentCombo.equals(__DEC_operand_operand_649489)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_864904 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_864904)) {
					if (!operand.equals(__DEC_guard_guard_864904)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_30_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpParentCombo = _edge_coveredBy.getTrg();
			if (tmpParentCombo instanceof CombinedFragment) {
				CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
				if (line.getCoveredBy().contains(parentCombo)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						for (InteractionFragment tmpMessageSend : line
								.getCoveredBy()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								InteractionOperand parentOperand = messageSend
										.getEnclosingOperand();
								if (parentOperand != null) {
									if (line.getCoveredBy().contains(
											parentOperand)) {
										if (parentCombo.getOperand().contains(
												parentOperand)) {
											if (pattern_AltSysStepNFToComboRule_30_2_black_nac_0B(messageSend) == null) {
												if (pattern_AltSysStepNFToComboRule_30_2_black_nac_1BB(
														messageSend,
														interaction) == null) {
													if (pattern_AltSysStepNFToComboRule_30_2_black_nac_7BB(
															messageSend,
															interaction) == null) {
														for (InteractionFragment tmpOperand : line
																.getCoveredBy()) {
															if (tmpOperand instanceof InteractionOperand) {
																InteractionOperand operand = (InteractionOperand) tmpOperand;
																if (!operand
																		.equals(parentOperand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepNFToComboRule_30_2_black_nac_4BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepNFToComboRule_30_2_black_nac_8BB(
																						operand,
																						messageSend) == null) {
																					if (pattern_AltSysStepNFToComboRule_30_2_black_nac_12BB(
																							operand,
																							interaction) == null) {
																						if (pattern_AltSysStepNFToComboRule_30_2_black_nac_13BB(
																								parentCombo,
																								operand) == null) {
																							if (pattern_AltSysStepNFToComboRule_30_2_black_nac_14BB(
																									parentOperand,
																									operand) == null) {
																								if (pattern_AltSysStepNFToComboRule_30_2_black_nac_6BBB(
																										guard,
																										parentOperand,
																										operand) == null) {
																									if (pattern_AltSysStepNFToComboRule_30_2_black_nac_15BB(
																											parentOperand,
																											guard) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_30_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_30_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_30_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_30_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_30_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_30_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_30_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_30_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_31_1_binding = pattern_AltSysStepNFToComboRule_31_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_31_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_31_1_black = pattern_AltSysStepNFToComboRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_431951 = messageSend.getMessage();
		if (__DEC_messageSend_message_431951 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_584692 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_584692 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_584692)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_900113 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_900113 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_108494 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_108494 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_108494)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_664275 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_664275 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_664275)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_567880 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_567880)) {
					if (!parentCombo.equals(__DEC_operand_operand_567880)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_370156 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_370156)) {
					if (!operand.equals(__DEC_guard_guard_370156)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_31_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParentCombo = _edge_covered.getSrc();
		if (tmpParentCombo instanceof CombinedFragment) {
			CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(parentCombo)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						for (InteractionOperand parentOperand : parentCombo
								.getOperand()) {
							if (line.getCoveredBy().contains(parentOperand)) {
								for (InteractionFragment tmpMessageSend : line
										.getCoveredBy()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (parentOperand.getFragment()
												.contains(messageSend)) {
											if (pattern_AltSysStepNFToComboRule_31_2_black_nac_0B(messageSend) == null) {
												if (pattern_AltSysStepNFToComboRule_31_2_black_nac_1BB(
														messageSend,
														interaction) == null) {
													if (pattern_AltSysStepNFToComboRule_31_2_black_nac_7BB(
															messageSend,
															interaction) == null) {
														for (InteractionFragment tmpOperand : line
																.getCoveredBy()) {
															if (tmpOperand instanceof InteractionOperand) {
																InteractionOperand operand = (InteractionOperand) tmpOperand;
																if (!operand
																		.equals(parentOperand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepNFToComboRule_31_2_black_nac_4BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepNFToComboRule_31_2_black_nac_8BB(
																						operand,
																						messageSend) == null) {
																					if (pattern_AltSysStepNFToComboRule_31_2_black_nac_12BB(
																							operand,
																							interaction) == null) {
																						if (pattern_AltSysStepNFToComboRule_31_2_black_nac_13BB(
																								parentCombo,
																								operand) == null) {
																							if (pattern_AltSysStepNFToComboRule_31_2_black_nac_14BB(
																									parentOperand,
																									operand) == null) {
																								if (pattern_AltSysStepNFToComboRule_31_2_black_nac_6BBB(
																										guard,
																										parentOperand,
																										operand) == null) {
																									if (pattern_AltSysStepNFToComboRule_31_2_black_nac_15BB(
																											parentOperand,
																											guard) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_31_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_31_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_31_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_31_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_31_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_31_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_31_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_31_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_32_1_binding = pattern_AltSysStepNFToComboRule_32_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_32_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_32_1_black = pattern_AltSysStepNFToComboRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_151424 = messageSend.getMessage();
		if (__DEC_messageSend_message_151424 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_386647 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_386647 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_386647)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_534856 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_534856 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_471913 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_471913 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_471913)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_771306 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_771306 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_771306)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_804327 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_804327)) {
					if (!parentCombo.equals(__DEC_operand_operand_804327)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_263126 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_263126)) {
					if (!operand.equals(__DEC_guard_guard_263126)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_32_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_enclosingInteraction.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					InteractionOperand parentOperand = combo
							.getEnclosingOperand();
					if (parentOperand != null) {
						for (InteractionOperand operand : combo.getOperand()) {
							if (!operand.equals(parentOperand)) {
								InteractionConstraint guard = operand
										.getGuard();
								if (guard != null) {
									ValueSpecification tmpSpec = guard
											.getSpecification();
									if (tmpSpec instanceof LiteralString) {
										LiteralString spec = (LiteralString) tmpSpec;
										if (pattern_AltSysStepNFToComboRule_32_2_black_nac_4BB(
												operand, interaction) == null) {
											if (pattern_AltSysStepNFToComboRule_32_2_black_nac_11BB(
													operand, combo) == null) {
												if (pattern_AltSysStepNFToComboRule_32_2_black_nac_12BB(
														operand, interaction) == null) {
													if (pattern_AltSysStepNFToComboRule_32_2_black_nac_14BB(
															parentOperand,
															operand) == null) {
														if (pattern_AltSysStepNFToComboRule_32_2_black_nac_6BBB(
																guard,
																parentOperand,
																operand) == null) {
															if (pattern_AltSysStepNFToComboRule_32_2_black_nac_15BB(
																	parentOperand,
																	guard) == null) {
																for (Lifeline line : interaction
																		.getLifeline()) {
																	if (line.getCoveredBy()
																			.contains(
																					parentOperand)) {
																		if (line.getCoveredBy()
																				.contains(
																						operand)) {
																			for (InteractionFragment tmpMessageSend : parentOperand
																					.getFragment()) {
																				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																					if (line.getCoveredBy()
																							.contains(
																									messageSend)) {
																						if (pattern_AltSysStepNFToComboRule_32_2_black_nac_0B(messageSend) == null) {
																							if (pattern_AltSysStepNFToComboRule_32_2_black_nac_1BB(
																									messageSend,
																									interaction) == null) {
																								if (pattern_AltSysStepNFToComboRule_32_2_black_nac_7BB(
																										messageSend,
																										interaction) == null) {
																									if (pattern_AltSysStepNFToComboRule_32_2_black_nac_8BB(
																											operand,
																											messageSend) == null) {
																										for (InteractionFragment tmpMessageReceive : parentOperand
																												.getFragment()) {
																											if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																												MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																												if (!messageReceive
																														.equals(messageSend)) {
																													if (pattern_AltSysStepNFToComboRule_32_2_black_nac_2B(messageReceive) == null) {
																														if (pattern_AltSysStepNFToComboRule_32_2_black_nac_3BB(
																																messageReceive,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_32_2_black_nac_9BB(
																																	messageReceive,
																																	interaction) == null) {
																																if (pattern_AltSysStepNFToComboRule_32_2_black_nac_10BB(
																																		operand,
																																		messageReceive) == null) {
																																	for (InteractionFragment tmpParentCombo : line
																																			.getCoveredBy()) {
																																		if (tmpParentCombo instanceof CombinedFragment) {
																																			CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																																			if (!combo
																																					.equals(parentCombo)) {
																																				if (parentCombo
																																						.getOperand()
																																						.contains(
																																								parentOperand)) {
																																					if (pattern_AltSysStepNFToComboRule_32_2_black_nac_5BBB(
																																							operand,
																																							combo,
																																							parentCombo) == null) {
																																						if (pattern_AltSysStepNFToComboRule_32_2_black_nac_13BB(
																																								parentCombo,
																																								operand) == null) {
																																							_result.add(new Object[] {
																																									line,
																																									messageSend,
																																									parentOperand,
																																									messageReceive,
																																									combo,
																																									parentCombo,
																																									interaction,
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
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_32_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_32_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_33_1_binding = pattern_AltSysStepNFToComboRule_33_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_33_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_33_1_black = pattern_AltSysStepNFToComboRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_761026 = messageSend.getMessage();
		if (__DEC_messageSend_message_761026 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_675690 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_675690 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_675690)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_551895 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_551895 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_198274 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_198274 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_198274)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_644469 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_644469 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_644469)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_42944 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_42944)) {
					if (!parentCombo.equals(__DEC_operand_operand_42944)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_452596 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_452596)) {
					if (!operand.equals(__DEC_guard_guard_452596)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_33_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpCombo = _edge_fragment.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					InteractionOperand parentOperand = combo
							.getEnclosingOperand();
					if (parentOperand != null) {
						for (Lifeline line : interaction.getLifeline()) {
							if (line.getCoveredBy().contains(parentOperand)) {
								for (InteractionOperand operand : combo
										.getOperand()) {
									if (!operand.equals(parentOperand)) {
										if (line.getCoveredBy().contains(
												operand)) {
											InteractionConstraint guard = operand
													.getGuard();
											if (guard != null) {
												ValueSpecification tmpSpec = guard
														.getSpecification();
												if (tmpSpec instanceof LiteralString) {
													LiteralString spec = (LiteralString) tmpSpec;
													if (pattern_AltSysStepNFToComboRule_33_2_black_nac_4BB(
															operand,
															interaction) == null) {
														if (pattern_AltSysStepNFToComboRule_33_2_black_nac_11BB(
																operand, combo) == null) {
															if (pattern_AltSysStepNFToComboRule_33_2_black_nac_12BB(
																	operand,
																	interaction) == null) {
																if (pattern_AltSysStepNFToComboRule_33_2_black_nac_14BB(
																		parentOperand,
																		operand) == null) {
																	if (pattern_AltSysStepNFToComboRule_33_2_black_nac_6BBB(
																			guard,
																			parentOperand,
																			operand) == null) {
																		if (pattern_AltSysStepNFToComboRule_33_2_black_nac_15BB(
																				parentOperand,
																				guard) == null) {
																			for (InteractionFragment tmpMessageSend : parentOperand
																					.getFragment()) {
																				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																					if (line.getCoveredBy()
																							.contains(
																									messageSend)) {
																						if (pattern_AltSysStepNFToComboRule_33_2_black_nac_0B(messageSend) == null) {
																							if (pattern_AltSysStepNFToComboRule_33_2_black_nac_1BB(
																									messageSend,
																									interaction) == null) {
																								if (pattern_AltSysStepNFToComboRule_33_2_black_nac_7BB(
																										messageSend,
																										interaction) == null) {
																									if (pattern_AltSysStepNFToComboRule_33_2_black_nac_8BB(
																											operand,
																											messageSend) == null) {
																										for (InteractionFragment tmpMessageReceive : parentOperand
																												.getFragment()) {
																											if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																												MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																												if (!messageReceive
																														.equals(messageSend)) {
																													if (pattern_AltSysStepNFToComboRule_33_2_black_nac_2B(messageReceive) == null) {
																														if (pattern_AltSysStepNFToComboRule_33_2_black_nac_3BB(
																																messageReceive,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_33_2_black_nac_9BB(
																																	messageReceive,
																																	interaction) == null) {
																																if (pattern_AltSysStepNFToComboRule_33_2_black_nac_10BB(
																																		operand,
																																		messageReceive) == null) {
																																	for (InteractionFragment tmpParentCombo : line
																																			.getCoveredBy()) {
																																		if (tmpParentCombo instanceof CombinedFragment) {
																																			CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																																			if (!combo
																																					.equals(parentCombo)) {
																																				if (parentCombo
																																						.getOperand()
																																						.contains(
																																								parentOperand)) {
																																					if (pattern_AltSysStepNFToComboRule_33_2_black_nac_5BBB(
																																							operand,
																																							combo,
																																							parentCombo) == null) {
																																						if (pattern_AltSysStepNFToComboRule_33_2_black_nac_13BB(
																																								parentCombo,
																																								operand) == null) {
																																							_result.add(new Object[] {
																																									line,
																																									messageSend,
																																									parentOperand,
																																									messageReceive,
																																									combo,
																																									parentCombo,
																																									interaction,
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
														}
													}
												}

											}

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

	public static final Object[] pattern_AltSysStepNFToComboRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_33_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_33_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_34_1_binding = pattern_AltSysStepNFToComboRule_34_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_34_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_34_1_black = pattern_AltSysStepNFToComboRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_34_2_blackFFFFFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof NamedFlow) {
			NamedFlow flow = (NamedFlow) tmpFlow;
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
									if (!altFlow.equals(flow)) {
										if (pattern_AltSysStepNFToComboRule_34_2_black_nac_0BB(
												altFlow, step) == null) {
											for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															flow,
															UseCase.class,
															"flows")) {
												if (pattern_AltSysStepNFToComboRule_34_2_black_nac_1BB(
														useCase, altFlow) == null) {
													for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	actor,
																	PackageDeclaration.class,
																	"actors")) {
														if (packageDeclaration
																.getUseCases()
																.contains(
																		useCase)) {
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

		}

		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_34_3_expressionFBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_34_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_35_1_binding = pattern_AltSysStepNFToComboRule_35_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_35_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_35_1_black = pattern_AltSysStepNFToComboRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_35_2_blackFFFFFFFB(
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
							if (pattern_AltSysStepNFToComboRule_35_2_black_nac_0BB(
									altFlow, step) == null) {
								for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(step,
												Flow.class, "steps")) {
									if (tmpFlow instanceof NamedFlow) {
										NamedFlow flow = (NamedFlow) tmpFlow;
										if (!altFlow.equals(flow)) {
											for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															actor,
															PackageDeclaration.class,
															"actors")) {
												for (UseCase useCase : packageDeclaration
														.getUseCases()) {
													if (useCase.getFlows()
															.contains(flow)) {
														if (pattern_AltSysStepNFToComboRule_35_2_black_nac_1BB(
																useCase,
																altFlow) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_35_3_expressionFBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_35_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_36_1_binding = pattern_AltSysStepNFToComboRule_36_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_36_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_36_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_36_1_black = pattern_AltSysStepNFToComboRule_36_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_36_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_36_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_36_2_blackFFFFFFFB(
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
								if (pattern_AltSysStepNFToComboRule_36_2_black_nac_0BB(
										altFlow, step) == null) {
									for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(step,
													Flow.class, "steps")) {
										if (tmpFlow instanceof NamedFlow) {
											NamedFlow flow = (NamedFlow) tmpFlow;
											if (!altFlow.equals(flow)) {
												for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																actor,
																PackageDeclaration.class,
																"actors")) {
													for (UseCase useCase : packageDeclaration
															.getUseCases()) {
														if (useCase.getFlows()
																.contains(flow)) {
															if (pattern_AltSysStepNFToComboRule_36_2_black_nac_1BB(
																	useCase,
																	altFlow) == null) {
																_result.add(new Object[] {
																		actor,
																		flow,
																		useCase,
																		packageDeclaration,
																		step,
																		alt,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_36_3_expressionFBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_36_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_36_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_36_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_37_1_binding = pattern_AltSysStepNFToComboRule_37_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_37_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_37_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_37_1_black = pattern_AltSysStepNFToComboRule_37_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_37_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_37_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_37_2_blackFFFFFFFB(
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
							if (pattern_AltSysStepNFToComboRule_37_2_black_nac_0BB(
									altFlow, step) == null) {
								for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(step,
												Flow.class, "steps")) {
									if (tmpFlow instanceof NamedFlow) {
										NamedFlow flow = (NamedFlow) tmpFlow;
										if (!altFlow.equals(flow)) {
											for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															actor,
															PackageDeclaration.class,
															"actors")) {
												for (UseCase useCase : packageDeclaration
														.getUseCases()) {
													if (useCase.getFlows()
															.contains(flow)) {
														if (pattern_AltSysStepNFToComboRule_37_2_black_nac_1BB(
																useCase,
																altFlow) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_37_3_expressionFBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_37_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_37_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_37_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_38_1_binding = pattern_AltSysStepNFToComboRule_38_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_38_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_38_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_38_1_black = pattern_AltSysStepNFToComboRule_38_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_38_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_38_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_534385 = messageSend.getMessage();
		if (__DEC_messageSend_message_534385 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_184059 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_184059 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_184059)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_518740 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_518740 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_157017 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_157017 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_157017)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_568061 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_568061 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_568061)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_504190 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_504190)) {
					if (!parentCombo.equals(__DEC_operand_operand_504190)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_275632 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_275632)) {
					if (!operand.equals(__DEC_guard_guard_275632)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_38_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_operand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_operand.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpOperand = _edge_operand.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (combo.getOperand().contains(operand)) {
					InteractionOperand parentOperand = combo
							.getEnclosingOperand();
					if (parentOperand != null) {
						if (!operand.equals(parentOperand)) {
							Interaction interaction = combo
									.getEnclosingInteraction();
							if (interaction != null) {
								InteractionConstraint guard = operand
										.getGuard();
								if (guard != null) {
									ValueSpecification tmpSpec = guard
											.getSpecification();
									if (tmpSpec instanceof LiteralString) {
										LiteralString spec = (LiteralString) tmpSpec;
										if (pattern_AltSysStepNFToComboRule_38_2_black_nac_11BB(
												operand, combo) == null) {
											if (pattern_AltSysStepNFToComboRule_38_2_black_nac_14BB(
													parentOperand, operand) == null) {
												if (pattern_AltSysStepNFToComboRule_38_2_black_nac_4BB(
														operand, interaction) == null) {
													if (pattern_AltSysStepNFToComboRule_38_2_black_nac_12BB(
															operand,
															interaction) == null) {
														if (pattern_AltSysStepNFToComboRule_38_2_black_nac_6BBB(
																guard,
																parentOperand,
																operand) == null) {
															if (pattern_AltSysStepNFToComboRule_38_2_black_nac_15BB(
																	parentOperand,
																	guard) == null) {
																for (Lifeline line : operand
																		.getCovered()) {
																	if (line.getCoveredBy()
																			.contains(
																					parentOperand)) {
																		if (interaction
																				.equals(line
																						.getInteraction())) {
																			for (InteractionFragment tmpMessageSend : parentOperand
																					.getFragment()) {
																				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																					if (line.getCoveredBy()
																							.contains(
																									messageSend)) {
																						if (pattern_AltSysStepNFToComboRule_38_2_black_nac_0B(messageSend) == null) {
																							if (pattern_AltSysStepNFToComboRule_38_2_black_nac_1BB(
																									messageSend,
																									interaction) == null) {
																								if (pattern_AltSysStepNFToComboRule_38_2_black_nac_7BB(
																										messageSend,
																										interaction) == null) {
																									if (pattern_AltSysStepNFToComboRule_38_2_black_nac_8BB(
																											operand,
																											messageSend) == null) {
																										for (InteractionFragment tmpMessageReceive : parentOperand
																												.getFragment()) {
																											if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																												MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																												if (!messageReceive
																														.equals(messageSend)) {
																													if (pattern_AltSysStepNFToComboRule_38_2_black_nac_2B(messageReceive) == null) {
																														if (pattern_AltSysStepNFToComboRule_38_2_black_nac_3BB(
																																messageReceive,
																																interaction) == null) {
																															if (pattern_AltSysStepNFToComboRule_38_2_black_nac_9BB(
																																	messageReceive,
																																	interaction) == null) {
																																if (pattern_AltSysStepNFToComboRule_38_2_black_nac_10BB(
																																		operand,
																																		messageReceive) == null) {
																																	for (InteractionFragment tmpParentCombo : line
																																			.getCoveredBy()) {
																																		if (tmpParentCombo instanceof CombinedFragment) {
																																			CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																																			if (!combo
																																					.equals(parentCombo)) {
																																				if (parentCombo
																																						.getOperand()
																																						.contains(
																																								parentOperand)) {
																																					if (pattern_AltSysStepNFToComboRule_38_2_black_nac_5BBB(
																																							operand,
																																							combo,
																																							parentCombo) == null) {
																																						if (pattern_AltSysStepNFToComboRule_38_2_black_nac_13BB(
																																								parentCombo,
																																								operand) == null) {
																																							_result.add(new Object[] {
																																									line,
																																									messageSend,
																																									parentOperand,
																																									messageReceive,
																																									combo,
																																									parentCombo,
																																									interaction,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_38_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_38_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_38_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_38_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_38_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_39_1_binding = pattern_AltSysStepNFToComboRule_39_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_39_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_39_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_39_1_black = pattern_AltSysStepNFToComboRule_39_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_39_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_39_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_517110 = messageSend.getMessage();
		if (__DEC_messageSend_message_517110 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_132832 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_132832 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_132832)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_176204 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_176204 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_445635 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_445635 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_445635)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_222401 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_222401 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_222401)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_124905 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_124905)) {
					if (!parentCombo.equals(__DEC_operand_operand_124905)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_581821 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_581821)) {
					if (!operand.equals(__DEC_guard_guard_581821)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_39_2_blackFFFFFFFFFFB(
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
								if (pattern_AltSysStepNFToComboRule_39_2_black_nac_4BB(
										operand, interaction) == null) {
									if (pattern_AltSysStepNFToComboRule_39_2_black_nac_12BB(
											operand, interaction) == null) {
										for (InteractionFragment tmpMessageSend : line
												.getCoveredBy()) {
											if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
												MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
												InteractionOperand parentOperand = messageSend
														.getEnclosingOperand();
												if (parentOperand != null) {
													if (!operand
															.equals(parentOperand)) {
														if (line.getCoveredBy()
																.contains(
																		parentOperand)) {
															if (pattern_AltSysStepNFToComboRule_39_2_black_nac_0B(messageSend) == null) {
																if (pattern_AltSysStepNFToComboRule_39_2_black_nac_1BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_AltSysStepNFToComboRule_39_2_black_nac_7BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_AltSysStepNFToComboRule_39_2_black_nac_8BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepNFToComboRule_39_2_black_nac_6BBB(
																					guard,
																					parentOperand,
																					operand) == null) {
																				if (pattern_AltSysStepNFToComboRule_39_2_black_nac_14BB(
																						parentOperand,
																						operand) == null) {
																					if (pattern_AltSysStepNFToComboRule_39_2_black_nac_15BB(
																							parentOperand,
																							guard) == null) {
																						for (InteractionFragment tmpParentCombo : line
																								.getCoveredBy()) {
																							if (tmpParentCombo instanceof CombinedFragment) {
																								CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																								if (parentCombo
																										.getOperand()
																										.contains(
																												parentOperand)) {
																									if (pattern_AltSysStepNFToComboRule_39_2_black_nac_13BB(
																											parentCombo,
																											operand) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_39_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_39_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_39_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_39_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_39_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_39_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_39_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_39_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_39_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_39_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_39_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_40_1_binding = pattern_AltSysStepNFToComboRule_40_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_40_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_40_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_40_1_black = pattern_AltSysStepNFToComboRule_40_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_40_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_40_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_280348 = messageSend.getMessage();
		if (__DEC_messageSend_message_280348 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_727955 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_727955 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_727955)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_265962 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_265962 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_338835 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_338835 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_338835)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_749906 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_749906 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_749906)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_964692 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_964692)) {
					if (!parentCombo.equals(__DEC_operand_operand_964692)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_306991 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_306991)) {
					if (!operand.equals(__DEC_guard_guard_306991)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_40_2_blackFFFFFFFFFFB(
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
								if (pattern_AltSysStepNFToComboRule_40_2_black_nac_4BB(
										operand, interaction) == null) {
									if (pattern_AltSysStepNFToComboRule_40_2_black_nac_12BB(
											operand, interaction) == null) {
										for (InteractionFragment tmpMessageSend : line
												.getCoveredBy()) {
											if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
												MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
												InteractionOperand parentOperand = messageSend
														.getEnclosingOperand();
												if (parentOperand != null) {
													if (!operand
															.equals(parentOperand)) {
														if (line.getCoveredBy()
																.contains(
																		parentOperand)) {
															if (pattern_AltSysStepNFToComboRule_40_2_black_nac_0B(messageSend) == null) {
																if (pattern_AltSysStepNFToComboRule_40_2_black_nac_1BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_AltSysStepNFToComboRule_40_2_black_nac_7BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_AltSysStepNFToComboRule_40_2_black_nac_8BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepNFToComboRule_40_2_black_nac_6BBB(
																					guard,
																					parentOperand,
																					operand) == null) {
																				if (pattern_AltSysStepNFToComboRule_40_2_black_nac_14BB(
																						parentOperand,
																						operand) == null) {
																					if (pattern_AltSysStepNFToComboRule_40_2_black_nac_15BB(
																							parentOperand,
																							guard) == null) {
																						for (InteractionFragment tmpParentCombo : line
																								.getCoveredBy()) {
																							if (tmpParentCombo instanceof CombinedFragment) {
																								CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																								if (parentCombo
																										.getOperand()
																										.contains(
																												parentOperand)) {
																									if (pattern_AltSysStepNFToComboRule_40_2_black_nac_13BB(
																											parentCombo,
																											operand) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_40_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_40_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_40_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_40_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_40_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_40_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_40_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_40_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_40_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_40_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_40_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_41_1_binding = pattern_AltSysStepNFToComboRule_41_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_41_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_41_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_41_1_black = pattern_AltSysStepNFToComboRule_41_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_41_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_41_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_610211 = messageSend.getMessage();
		if (__DEC_messageSend_message_610211 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_868743 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_868743 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_868743)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_535896 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_535896 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_362080 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_362080 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_362080)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_622477 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_622477 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_622477)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_227967 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_227967)) {
					if (!parentCombo.equals(__DEC_operand_operand_227967)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_445310 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_445310)) {
					if (!operand.equals(__DEC_guard_guard_445310)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_41_2_blackFFFFFFFFFFB(
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
						for (Lifeline line : operand.getCovered()) {
							Interaction interaction = line.getInteraction();
							if (interaction != null) {
								if (pattern_AltSysStepNFToComboRule_41_2_black_nac_4BB(
										operand, interaction) == null) {
									if (pattern_AltSysStepNFToComboRule_41_2_black_nac_12BB(
											operand, interaction) == null) {
										for (InteractionFragment tmpMessageSend : line
												.getCoveredBy()) {
											if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
												MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
												InteractionOperand parentOperand = messageSend
														.getEnclosingOperand();
												if (parentOperand != null) {
													if (!operand
															.equals(parentOperand)) {
														if (line.getCoveredBy()
																.contains(
																		parentOperand)) {
															if (pattern_AltSysStepNFToComboRule_41_2_black_nac_0B(messageSend) == null) {
																if (pattern_AltSysStepNFToComboRule_41_2_black_nac_1BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_AltSysStepNFToComboRule_41_2_black_nac_7BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_AltSysStepNFToComboRule_41_2_black_nac_8BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepNFToComboRule_41_2_black_nac_6BBB(
																					guard,
																					parentOperand,
																					operand) == null) {
																				if (pattern_AltSysStepNFToComboRule_41_2_black_nac_14BB(
																						parentOperand,
																						operand) == null) {
																					if (pattern_AltSysStepNFToComboRule_41_2_black_nac_15BB(
																							parentOperand,
																							guard) == null) {
																						for (InteractionFragment tmpParentCombo : line
																								.getCoveredBy()) {
																							if (tmpParentCombo instanceof CombinedFragment) {
																								CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																								if (parentCombo
																										.getOperand()
																										.contains(
																												parentOperand)) {
																									if (pattern_AltSysStepNFToComboRule_41_2_black_nac_13BB(
																											parentCombo,
																											operand) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_41_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_41_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_41_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_41_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_41_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_41_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_41_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_41_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_41_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_41_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_41_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_1_bindingFB(
			AltSysStepNFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_1_blackFBB(
			EClass __eClass, AltSysStepNFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_1_bindingAndBlackFFB(
			AltSysStepNFToComboRule _this) {
		Object[] result_pattern_AltSysStepNFToComboRule_42_1_binding = pattern_AltSysStepNFToComboRule_42_1_bindingFB(_this);
		if (result_pattern_AltSysStepNFToComboRule_42_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepNFToComboRule_42_1_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_42_1_black = pattern_AltSysStepNFToComboRule_42_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepNFToComboRule_42_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepNFToComboRule_42_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_300921 = messageSend.getMessage();
		if (__DEC_messageSend_message_300921 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_1BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_296812 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_296812 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_296812)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_2B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_364542 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_364542 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_3BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_382187 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_382187 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_382187)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_4BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_763586 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_763586 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_763586)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_5BBB(
			InteractionOperand operand, CombinedFragment combo,
			CombinedFragment parentCombo) {
		if (!combo.equals(parentCombo)) {
			for (CombinedFragment __DEC_operand_operand_163886 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand, CombinedFragment.class,
							"operand")) {
				if (!combo.equals(__DEC_operand_operand_163886)) {
					if (!parentCombo.equals(__DEC_operand_operand_163886)) {
						return new Object[] { operand, combo, parentCombo };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_6BBB(
			InteractionConstraint guard, InteractionOperand parentOperand,
			InteractionOperand operand) {
		if (!operand.equals(parentOperand)) {
			for (InteractionOperand __DEC_guard_guard_567168 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(guard, InteractionOperand.class,
							"guard")) {
				if (!parentOperand.equals(__DEC_guard_guard_567168)) {
					if (!operand.equals(__DEC_guard_guard_567168)) {
						return new Object[] { guard, parentOperand, operand };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_7BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_8BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_9BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_10BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_11BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_12BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_13BB(
			CombinedFragment parentCombo, InteractionOperand operand) {
		if (parentCombo.getOperand().contains(operand)) {
			return new Object[] { parentCombo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_14BB(
			InteractionOperand parentOperand, InteractionOperand operand) {
		if (parentOperand.getFragment().contains(operand)) {
			return new Object[] { parentOperand, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_black_nac_15BB(
			InteractionOperand parentOperand, InteractionConstraint guard) {
		if (guard.equals(parentOperand.getGuard())) {
			return new Object[] { parentOperand, guard };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_42_2_blackFFFFFFFFFFB(
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
						for (Lifeline line : operand.getCovered()) {
							Interaction interaction = line.getInteraction();
							if (interaction != null) {
								if (pattern_AltSysStepNFToComboRule_42_2_black_nac_4BB(
										operand, interaction) == null) {
									if (pattern_AltSysStepNFToComboRule_42_2_black_nac_12BB(
											operand, interaction) == null) {
										for (InteractionFragment tmpMessageSend : line
												.getCoveredBy()) {
											if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
												MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
												InteractionOperand parentOperand = messageSend
														.getEnclosingOperand();
												if (parentOperand != null) {
													if (!operand
															.equals(parentOperand)) {
														if (line.getCoveredBy()
																.contains(
																		parentOperand)) {
															if (pattern_AltSysStepNFToComboRule_42_2_black_nac_0B(messageSend) == null) {
																if (pattern_AltSysStepNFToComboRule_42_2_black_nac_1BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_AltSysStepNFToComboRule_42_2_black_nac_7BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_AltSysStepNFToComboRule_42_2_black_nac_8BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepNFToComboRule_42_2_black_nac_6BBB(
																					guard,
																					parentOperand,
																					operand) == null) {
																				if (pattern_AltSysStepNFToComboRule_42_2_black_nac_14BB(
																						parentOperand,
																						operand) == null) {
																					if (pattern_AltSysStepNFToComboRule_42_2_black_nac_15BB(
																							parentOperand,
																							guard) == null) {
																						for (InteractionFragment tmpParentCombo : line
																								.getCoveredBy()) {
																							if (tmpParentCombo instanceof CombinedFragment) {
																								CombinedFragment parentCombo = (CombinedFragment) tmpParentCombo;
																								if (parentCombo
																										.getOperand()
																										.contains(
																												parentOperand)) {
																									if (pattern_AltSysStepNFToComboRule_42_2_black_nac_13BB(
																											parentCombo,
																											operand) == null) {
																										for (InteractionFragment tmpCombo : interaction
																												.getFragment()) {
																											if (tmpCombo instanceof CombinedFragment) {
																												CombinedFragment combo = (CombinedFragment) tmpCombo;
																												if (!combo
																														.equals(parentCombo)) {
																													if (parentOperand
																															.getFragment()
																															.contains(
																																	combo)) {
																														if (combo
																																.getOperand()
																																.contains(
																																		operand)) {
																															if (pattern_AltSysStepNFToComboRule_42_2_black_nac_5BBB(
																																	operand,
																																	combo,
																																	parentCombo) == null) {
																																if (pattern_AltSysStepNFToComboRule_42_2_black_nac_11BB(
																																		operand,
																																		combo) == null) {
																																	for (InteractionFragment tmpMessageReceive : parentOperand
																																			.getFragment()) {
																																		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																																			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																																			if (!messageReceive
																																					.equals(messageSend)) {
																																				if (pattern_AltSysStepNFToComboRule_42_2_black_nac_2B(messageReceive) == null) {
																																					if (pattern_AltSysStepNFToComboRule_42_2_black_nac_3BB(
																																							messageReceive,
																																							interaction) == null) {
																																						if (pattern_AltSysStepNFToComboRule_42_2_black_nac_9BB(
																																								messageReceive,
																																								interaction) == null) {
																																							if (pattern_AltSysStepNFToComboRule_42_2_black_nac_10BB(
																																									operand,
																																									messageReceive) == null) {
																																								_result.add(new Object[] {
																																										line,
																																										messageSend,
																																										parentOperand,
																																										messageReceive,
																																										combo,
																																										parentCombo,
																																										interaction,
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
														}
													}
												}

											}
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

	public static final Object[] pattern_AltSysStepNFToComboRule_42_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepNFToComboRule_42_3_expressionFBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand parentOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, CombinedFragment parentCombo,
			Interaction interaction, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, parentOperand, messageReceive, combo, parentCombo,
				interaction, operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_42_4_expressionFBB(
			AltSysStepNFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_42_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepNFToComboRule_42_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_1_blackB(
			AltSysStepNFToComboRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, NamedFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToParentOperand) {
		if (ruleResult.getCorrObjects().contains(flowToParentOperand)) {
			return new Object[] { ruleResult, flowToParentOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult,
			InteractionOperand parentOperand) {
		if (ruleResult.getTargetObjects().contains(parentOperand)) {
			return new Object[] { ruleResult, parentOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, CombinedFragment parentCombo) {
		if (ruleResult.getTargetObjects().contains(parentCombo)) {
			return new Object[] { ruleResult, parentCombo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepNFToComboRule_45_2_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList flowToParentOperandList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpFlowToParentOperand : flowToParentOperandList
					.getEntryObjects()) {
				if (tmpFlowToParentOperand instanceof FlowToInteractionFragment) {
					FlowToInteractionFragment flowToParentOperand = (FlowToInteractionFragment) tmpFlowToParentOperand;
					Flow tmpFlow = flowToParentOperand.getSource();
					if (tmpFlow instanceof NamedFlow) {
						NamedFlow flow = (NamedFlow) tmpFlow;
						InteractionFragment tmpParentOperand = flowToParentOperand
								.getTarget();
						if (tmpParentOperand instanceof InteractionOperand) {
							InteractionOperand parentOperand = (InteractionOperand) tmpParentOperand;
							if (pattern_AltSysStepNFToComboRule_45_2_black_nac_4BB(
									ruleResult, flowToParentOperand) == null) {
								if (pattern_AltSysStepNFToComboRule_45_2_black_nac_3BB(
										ruleResult, flow) == null) {
									if (pattern_AltSysStepNFToComboRule_45_2_black_nac_5BB(
											ruleResult, parentOperand) == null) {
										for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														flow, UseCase.class,
														"flows")) {
											if (pattern_AltSysStepNFToComboRule_45_2_black_nac_2BB(
													ruleResult, useCase) == null) {
												for (CombinedFragment parentCombo : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																parentOperand,
																CombinedFragment.class,
																"operand")) {
													if (pattern_AltSysStepNFToComboRule_45_2_black_nac_6BB(
															ruleResult,
															parentCombo) == null) {
														for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		useCase,
																		PackageDeclaration.class,
																		"useCases")) {
															if (pattern_AltSysStepNFToComboRule_45_2_black_nac_1BB(
																	ruleResult,
																	packageDeclaration) == null) {
																for (Actor actor : packageDeclaration
																		.getActors()) {
																	if (pattern_AltSysStepNFToComboRule_45_2_black_nac_0BB(
																			ruleResult,
																			actor) == null) {
																		for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
																				.getOppositeReferenceTyped(
																						useCase,
																						UseCaseToInteraction.class,
																						"source")) {
																			Interaction interaction = useCaseToInteraction
																					.getTarget();
																			if (interaction != null) {
																				if (pattern_AltSysStepNFToComboRule_45_2_black_nac_7BB(
																						ruleResult,
																						useCaseToInteraction) == null) {
																					if (pattern_AltSysStepNFToComboRule_45_2_black_nac_8BB(
																							ruleResult,
																							interaction) == null) {
																						for (Lifeline line : interaction
																								.getLifeline()) {
																							if (pattern_AltSysStepNFToComboRule_45_2_black_nac_9BB(
																									ruleResult,
																									line) == null) {
																								_result.add(new Object[] {
																										flowToParentOperandList,
																										actor,
																										packageDeclaration,
																										useCase,
																										flow,
																										flowToParentOperand,
																										parentOperand,
																										parentCombo,
																										useCaseToInteraction,
																										interaction,
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

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_3_bindingFBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					flow, parentOperand, flowToParentOperand, parentCombo,
					interaction, useCase, useCaseToInteraction,
					packageDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_3_bindingAndBlackFBBBBBBBBBBBBB(
			AltSysStepNFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AltSysStepNFToComboRule_45_3_binding = pattern_AltSysStepNFToComboRule_45_3_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration, ruleResult);
		if (result_pattern_AltSysStepNFToComboRule_45_3_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepNFToComboRule_45_3_binding[0];

			Object[] result_pattern_AltSysStepNFToComboRule_45_3_black = pattern_AltSysStepNFToComboRule_45_3_blackB(csp);
			if (result_pattern_AltSysStepNFToComboRule_45_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, flow, parentOperand, flowToParentOperand,
						parentCombo, interaction, useCase,
						useCaseToInteraction, packageDeclaration, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepNFToComboRule_45_4_expressionFBB(
			AltSysStepNFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_5_blackBBBBBBBBBB(
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		return new Object[] { actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_6_blackBBBBBBBBBBB(
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand,
			FlowToInteractionFragment flowToParentOperand,
			CombinedFragment parentCombo, Interaction interaction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { actor, line, flow, parentOperand,
				flowToParentOperand, parentCombo, interaction, useCase,
				useCaseToInteraction, packageDeclaration, ruleResult };
	}

	public static final Object[] pattern_AltSysStepNFToComboRule_45_6_greenBBFBBFFBBFFFFFFFFFBB(
			Actor actor, Lifeline line, NamedFlow flow,
			InteractionOperand parentOperand, CombinedFragment parentCombo,
			Interaction interaction, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
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
		line.getCoveredBy().add(parentOperand);
		line.getCoveredBy().add(parentCombo);
		Object _localVariable_0 = csp.getValue("combo", "interactionOperator");
		Object _localVariable_1 = csp.getValue("alt", "condition");
		Object _localVariable_2 = csp.getValue("guard", "name");
		Object _localVariable_3 = csp.getValue("spec", "value");
		Object _localVariable_4 = csp.getValue("altFlow", "name");
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		line.getCoveredBy().add(messageSend);
		parentOperand.getFragment().add(messageSend);
		ruleResult.getTargetObjects().add(messageSend);
		parentOperand.getFragment().add(messageReceive);
		ruleResult.getTargetObjects().add(messageReceive);
		parentOperand.getFragment().add(combo);
		combo.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(combo);
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
		String alt_condition_prime = (String) _localVariable_1;
		String guard_name_prime = (String) _localVariable_2;
		String spec_value_prime = (String) _localVariable_3;
		String altFlow_name_prime = (String) _localVariable_4;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		combo.setInteractionOperator(combo_interactionOperator_prime);
		alt.setCondition(alt_condition_prime);
		guard.setName(guard_name_prime);
		spec.setValue(spec_value_prime);
		altFlow.setName(altFlow_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { actor, line, messageSend, flow, parentOperand,
				messageReceive, combo, parentCombo, interaction, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AltSysStepNFToComboRule_45_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltSysStepNFToComboRuleImpl
