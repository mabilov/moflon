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

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule;
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
 * An implementation of the model object '<em><b>Alt User Step BF To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltUserStepBFToComboRuleImpl extends AbstractRuleImpl implements
		AltUserStepBFToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltUserStepBFToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltUserStepBFToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		// initial bindings
		Object[] result1_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_0_1_blackBBBBBBBBBB(this,
						match, packageDeclaration, actor, sysActor, flow,
						useCase, step, alt, altFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_0_2_bindingAndBlackFBBBBBBBBBB(
						this, match, packageDeclaration, actor, sysActor, flow,
						useCase, step, alt, altFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_4_blackBBBBBBBBB(match,
							packageDeclaration, actor, sysActor, flow, useCase,
							step, alt, altFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_4_greenBBBBBBFFFF(
							match, actor, flow, step, alt, altFlow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[6];
			// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result4_green[7];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[8];
			// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_5_blackBBBBBBBBB(match,
							packageDeclaration, actor, sysActor, flow, useCase,
							step, alt, altFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_5_greenBBBBBBFFFF(
							match, packageDeclaration, actor, sysActor, flow,
							useCase);
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result5_green[7];
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[8];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[9];

			// register objects to match
			AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_6_expressionBBBBBBBBBB(
							this, match, packageDeclaration, actor, sysActor,
							flow, useCase, step, alt, altFlow);
			return AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_7_expressionF();
		} else {
			return AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		Actor actor = (Actor) result1_bindingAndBlack[1];
		Actor sysActor = (Actor) result1_bindingAndBlack[2];
		Lifeline sysLine = (Lifeline) result1_bindingAndBlack[3];
		ActorToLifeline sysActorToSysLine = (ActorToLifeline) result1_bindingAndBlack[4];
		Interaction interaction = (Interaction) result1_bindingAndBlack[5];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[6];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[7];
		UseCase useCase = (UseCase) result1_bindingAndBlack[8];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[9];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[10];
		NormalStep step = (NormalStep) result1_bindingAndBlack[11];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[12];
		Lifeline line = (Lifeline) result1_bindingAndBlack[13];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[14];
		CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_1_greenBFFFBFBBBFFFFBFB(
						sysLine, interaction, step, alt, line, altFlow, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		CombinedFragment combo = (CombinedFragment) result1_green[2];
		InteractionOperand operand = (InteractionOperand) result1_green[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[5];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[9];
		StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result1_green[10];
		InteractionConstraint guard = (InteractionConstraint) result1_green[11];
		LiteralString spec = (LiteralString) result1_green[12];
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[14];

		// collect translated elements
		Object[] result2_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_2_blackBBBBBBBBBBBB(
						messageSend, combo, operand, messageReceive, step, alt,
						stepToCombo, alternative1ToOperand, guard, spec,
						altFlow, altFlowToOperand);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_2_greenFBBBBBBBBBBBB(
						messageSend, combo, operand, messageReceive, step, alt,
						stepToCombo, alternative1ToOperand, guard, spec,
						altFlow, altFlowToOperand);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, packageDeclaration, actor, sysActor,
						sysLine, sysActorToSysLine, messageSend, combo,
						operand, interaction, flowToInteraction,
						messageReceive, flow, useCase, useCaseToInteraction,
						actorToLine, step, alt, line, stepToCombo,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_3_greenBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, sysLine, messageSend, combo,
						operand, interaction, messageReceive, flow, step, alt,
						line, stepToCombo, alternative1ToOperand, guard, spec,
						altFlow, altFlowToOperand);
		// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[18];
		// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[19];
		// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result3_green[22];
		// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result3_green[23];
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[24];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[25];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[26];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[27];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[28];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[29];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[30];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[31];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[32];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[33];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[34];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[35];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[36];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[37];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[38];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[39];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[40];
		// EMoflonEdge alternative1ToOperand__alt____source = (EMoflonEdge) result3_green[41];
		// EMoflonEdge alternative1ToOperand__operand____target = (EMoflonEdge) result3_green[42];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[43];
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[44];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[45];

		// perform postprocessing story node is empty
		// register objects
		AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, packageDeclaration, actor, sysActor,
						sysLine, sysActorToSysLine, messageSend, combo,
						operand, interaction, flowToInteraction,
						messageReceive, flow, useCase, useCaseToInteraction,
						actorToLine, step, alt, line, stepToCombo,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_2_2_bindingFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		Actor actor = (Actor) result2_binding[1];
		Actor sysActor = (Actor) result2_binding[2];
		BasicFlow flow = (BasicFlow) result2_binding[3];
		UseCase useCase = (UseCase) result2_binding[4];
		NormalStep step = (NormalStep) result2_binding[5];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[6];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[7];
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_2_2_blackBBBFFFFBBFFBBFBB(
						packageDeclaration, actor, sysActor, flow, useCase,
						step, alt, altFlow, match)) {
			Lifeline sysLine = (Lifeline) result2_black[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[4];
			Interaction interaction = (Interaction) result2_black[5];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[6];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[9];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[10];
			Lifeline line = (Lifeline) result2_black[13];
			// ForEach find context
			for (Object[] result3_black : AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_2_3_blackBBBBBBBBBBBBBBB(
							packageDeclaration, actor, sysActor, sysLine,
							sysActorToSysLine, interaction, flowToInteraction,
							flow, useCase, useCaseToInteraction, actorToLine,
							step, alt, line, altFlow)) {
				Object[] result3_green = AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_2_3_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
								packageDeclaration, actor, sysActor, sysLine,
								sysActorToSysLine, interaction,
								flowToInteraction, flow, useCase,
								useCaseToInteraction, actorToLine, step, alt,
								line, altFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[16];
				// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sysActorToSysLine__sysActor____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sysActorToSysLine__sysLine____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[22];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[23];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[24];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[26];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[27];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[28];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[29];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[30];
				// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[31];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[32];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[33];

				// solve CSP
				Object[] result4_bindingAndBlack = AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								actor, sysActor, sysLine, sysActorToSysLine,
								interaction, flowToInteraction, flow, useCase,
								useCaseToInteraction, actorToLine, step, alt,
								line, altFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("actor", actor);
		match.registerObject("sysActor", sysActor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("ALT");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("UseCaseDSL.ActorType");
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", true, csp);
		var_step_type.setValue(step.getType());
		var_step_type.setType("UseCaseDSL.StepType");

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
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
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow) {// Create CSP
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
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("line", line);
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
			EObject packageDeclaration, EObject actor, EObject sysActor,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject combo, EObject operand, EObject interaction,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction, EObject actorToLine,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);
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
	public boolean isAppropriate_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		// initial bindings
		Object[] result1_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_10_1_blackBBBBBBBBBBB(this,
						match, sysLine, messageSend, combo, operand,
						interaction, messageReceive, line, guard, spec);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_10_2_bindingAndBlackFBBBBBBBBBBB(
						this, match, sysLine, messageSend, combo, operand,
						interaction, messageReceive, line, guard, spec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_4_blackBBBBBBBBBB(
							match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_4_greenBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
							match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec);
			// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result4_green[10];
			// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result4_green[11];
			// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result4_green[12];
			// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result4_green[13];
			// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result4_green[14];
			// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result4_green[15];
			// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result4_green[16];
			// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result4_green[17];
			// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result4_green[18];
			// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result4_green[19];
			// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result4_green[20];
			// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result4_green[21];
			// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result4_green[22];
			// EMoflonEdge combo__line____covered = (EMoflonEdge) result4_green[23];
			// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result4_green[24];
			// EMoflonEdge operand__line____covered = (EMoflonEdge) result4_green[25];
			// EMoflonEdge operand__guard____guard = (EMoflonEdge) result4_green[26];
			// EMoflonEdge guard__spec____specification = (EMoflonEdge) result4_green[27];

			// collect context elements
			Object[] result5_black = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_5_blackBBBBBBBBBB(
							match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_5_greenBBBBFF(match,
							sysLine, interaction, line);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[4];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[5];

			// register objects to match
			AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_6_expressionBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec);
			return AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_7_expressionF();
		} else {
			return AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		Actor actor = (Actor) result1_bindingAndBlack[1];
		Actor sysActor = (Actor) result1_bindingAndBlack[2];
		Lifeline sysLine = (Lifeline) result1_bindingAndBlack[3];
		ActorToLifeline sysActorToSysLine = (ActorToLifeline) result1_bindingAndBlack[4];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[5];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[6];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[7];
		Interaction interaction = (Interaction) result1_bindingAndBlack[8];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[9];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[10];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[11];
		UseCase useCase = (UseCase) result1_bindingAndBlack[12];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[13];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[14];
		Lifeline line = (Lifeline) result1_bindingAndBlack[15];
		InteractionConstraint guard = (InteractionConstraint) result1_bindingAndBlack[16];
		LiteralString spec = (LiteralString) result1_bindingAndBlack[17];
		CSP csp = (CSP) result1_bindingAndBlack[18];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_1_greenBBBBFFFFFFB(actor,
						combo, operand, flow, csp);
		NormalStep step = (NormalStep) result1_green[4];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_green[5];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[6];
		StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result1_green[7];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[8];
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[9];

		// collect translated elements
		Object[] result2_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_2_blackBBBBBBBBBBBB(
						messageSend, combo, operand, messageReceive, step, alt,
						stepToCombo, alternative1ToOperand, guard, spec,
						altFlow, altFlowToOperand);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_2_greenFBBBBBBBBBBBB(
						messageSend, combo, operand, messageReceive, step, alt,
						stepToCombo, alternative1ToOperand, guard, spec,
						altFlow, altFlowToOperand);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_3_blackBBBBBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, packageDeclaration, actor, sysActor,
						sysLine, sysActorToSysLine, messageSend, combo,
						operand, interaction, flowToInteraction,
						messageReceive, flow, useCase, useCaseToInteraction,
						actorToLine, step, alt, line, stepToCombo,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_3_greenBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, sysLine, messageSend, combo,
						operand, interaction, messageReceive, flow, step, alt,
						line, stepToCombo, alternative1ToOperand, guard, spec,
						altFlow, altFlowToOperand);
		// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[18];
		// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[19];
		// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result3_green[22];
		// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result3_green[23];
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[24];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[25];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[26];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[27];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[28];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[29];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[30];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[31];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[32];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[33];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[34];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[35];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[36];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[37];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[38];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[39];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[40];
		// EMoflonEdge alternative1ToOperand__alt____source = (EMoflonEdge) result3_green[41];
		// EMoflonEdge alternative1ToOperand__operand____target = (EMoflonEdge) result3_green[42];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[43];
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[44];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[45];

		// perform postprocessing story node is empty
		// register objects
		AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, packageDeclaration, actor, sysActor,
						sysLine, sysActorToSysLine, messageSend, combo,
						operand, interaction, flowToInteraction,
						messageReceive, flow, useCase, useCaseToInteraction,
						actorToLine, step, alt, line, stepToCombo,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_12_2_bindingFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Lifeline sysLine = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		CombinedFragment combo = (CombinedFragment) result2_binding[2];
		InteractionOperand operand = (InteractionOperand) result2_binding[3];
		Interaction interaction = (Interaction) result2_binding[4];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[5];
		Lifeline line = (Lifeline) result2_binding[6];
		InteractionConstraint guard = (InteractionConstraint) result2_binding[7];
		LiteralString spec = (LiteralString) result2_binding[8];
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_12_2_blackFFBFBBBBFBFFFFBBBB(
						sysLine, messageSend, combo, operand, interaction,
						messageReceive, line, guard, spec, match)) {
			Actor actor = (Actor) result2_black[0];
			Actor sysActor = (Actor) result2_black[1];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[3];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[8];
			BasicFlow flow = (BasicFlow) result2_black[10];
			UseCase useCase = (UseCase) result2_black[11];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[12];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[13];
			// ForEach find context
			for (Object[] result3_black : AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_12_3_blackFBBBBBBBBBBBBBBBBB(
							actor, sysActor, sysLine, sysActorToSysLine,
							messageSend, combo, operand, interaction,
							flowToInteraction, messageReceive, flow, useCase,
							useCaseToInteraction, actorToLine, line, guard,
							spec)) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[0];
				Object[] result3_green = AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_12_3_greenBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								packageDeclaration, actor, sysActor, sysLine,
								sysActorToSysLine, messageSend, combo, operand,
								interaction, flowToInteraction, messageReceive,
								flow, useCase, useCaseToInteraction,
								actorToLine, line, guard, spec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[18];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[19];
				// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[21];
				// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result3_green[23];
				// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result3_green[24];
				// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result3_green[25];
				// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result3_green[26];
				// EMoflonEdge sysActorToSysLine__sysActor____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge sysActorToSysLine__sysLine____target = (EMoflonEdge) result3_green[28];
				// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[29];
				// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[30];
				// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[31];
				// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[32];
				// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[33];
				// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[34];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[35];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[36];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[37];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[38];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[39];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[40];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[41];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[42];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[43];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[44];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[45];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[46];
				// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[47];
				// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[48];
				// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[49];
				// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[50];

				// solve CSP
				Object[] result4_bindingAndBlack = AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								actor, sysActor, sysLine, sysActorToSysLine,
								messageSend, combo, operand, interaction,
								flowToInteraction, messageReceive, flow,
								useCase, useCaseToInteraction, actorToLine,
								line, guard, spec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		match.registerObject("sysLine", sysLine);
		match.registerObject("messageSend", messageSend);
		match.registerObject("combo", combo);
		match.registerObject("operand", operand);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
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
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("ALT");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("UseCaseDSL.ActorType");
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
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("line", line);
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
			EObject packageDeclaration, EObject actor, EObject sysActor,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject combo, EObject operand, EObject interaction,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction, EObject actorToLine,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);
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
				&& match.getObject("operand")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionOperand())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_249(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_20_2_blackFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_20_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_250(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_21_2_blackFFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_21_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_251(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_22_2_blackFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_22_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_252(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_23_2_blackFFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_23_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_253(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_24_2_blackFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_24_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_254(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_25_2_blackFFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_25_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_255(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_26_2_blackFFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_26_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_256(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_27_2_blackFFFFFFFFFB(_edge_fragment)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_27_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_257(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_28_2_blackFFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_28_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_258(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_29_2_blackFFFFFFFFFB(_edge_fragment)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_29_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_259(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_30_2_blackFFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_30_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_260(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_31_2_blackFFFFFFFFFB(_edge_fragment)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_31_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_475(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_32_2_blackFFFFFFFFB(_edge_steps)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			Actor sysActor = (Actor) result2_black[2];
			BasicFlow flow = (BasicFlow) result2_black[3];
			UseCase useCase = (UseCase) result2_black[4];
			NormalStep step = (NormalStep) result2_black[5];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[6];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[7];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_32_3_expressionFBBBBBBBBBB(
							this, match, packageDeclaration, actor, sysActor,
							flow, useCase, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_476(
			EMoflonEdge _edge_stepAlternative) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_33_2_blackFFFFFFFFB(_edge_stepAlternative)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			Actor sysActor = (Actor) result2_black[2];
			BasicFlow flow = (BasicFlow) result2_black[3];
			UseCase useCase = (UseCase) result2_black[4];
			NormalStep step = (NormalStep) result2_black[5];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[6];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[7];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_33_3_expressionFBBBBBBBBBB(
							this, match, packageDeclaration, actor, sysActor,
							flow, useCase, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_477(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_34_2_blackFFFFFFFFB(_edge_actor)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			Actor sysActor = (Actor) result2_black[2];
			BasicFlow flow = (BasicFlow) result2_black[3];
			UseCase useCase = (UseCase) result2_black[4];
			NormalStep step = (NormalStep) result2_black[5];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[6];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[7];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_34_3_expressionFBBBBBBBBBB(
							this, match, packageDeclaration, actor, sysActor,
							flow, useCase, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_34_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_34_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_34_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_478(
			EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_35_2_blackFFFFFFFFB(_edge_ref)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			Actor sysActor = (Actor) result2_black[2];
			BasicFlow flow = (BasicFlow) result2_black[3];
			UseCase useCase = (UseCase) result2_black[4];
			NormalStep step = (NormalStep) result2_black[5];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[6];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[7];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_35_3_expressionFBBBBBBBBBB(
							this, match, packageDeclaration, actor, sysActor,
							flow, useCase, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_35_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_35_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_35_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_35_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_261(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_36_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_36_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_36_2_blackFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_36_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_36_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_36_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_36_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_36_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_36_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_262(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_37_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_37_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_37_2_blackFFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_37_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_37_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_37_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_37_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_37_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_37_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_263(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_38_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_38_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_38_2_blackFFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_38_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_38_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_38_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_38_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_38_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_38_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_264(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_39_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_39_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_39_2_blackFFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_39_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_39_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_39_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_39_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_39_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_39_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_265(
			EMoflonEdge _edge_guard) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_40_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_40_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_40_2_blackFFFFFFFFFB(_edge_guard)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_40_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_40_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_40_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_40_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_40_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_40_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_266(
			EMoflonEdge _edge_specification) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_41_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_41_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_41_2_blackFFFFFFFFFB(_edge_specification)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			CombinedFragment combo = (CombinedFragment) result2_black[2];
			InteractionOperand operand = (InteractionOperand) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			InteractionConstraint guard = (InteractionConstraint) result2_black[7];
			LiteralString spec = (LiteralString) result2_black[8];
			Object[] result2_green = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_41_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_41_3_expressionFBBBBBBBBBBB(
							this, match, sysLine, messageSend, combo, operand,
							interaction, messageReceive, line, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_41_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_41_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_41_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_41_6_expressionFB(__result);
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
			ActorToLifeline actorToLineParameter) {
		// create result
		Object[] result1_black = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_44_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_44_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_44_2_blackFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList actorToLineList = (RuleEntryList) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[3];
			Lifeline line = (Lifeline) result2_black[4];
			Interaction interaction = (Interaction) result2_black[5];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[6];
			BasicFlow flow = (BasicFlow) result2_black[7];
			UseCase useCase = (UseCase) result2_black[8];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[9];
			Actor sysActor = (Actor) result2_black[10];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[11];
			Lifeline sysLine = (Lifeline) result2_black[12];

			// solve CSP
			Object[] result3_bindingAndBlack = AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_44_3_bindingAndBlackFBBBBBBBBBBBBBBB(
							this, isApplicableMatch, packageDeclaration, actor,
							sysActor, sysLine, sysActorToSysLine, interaction,
							flowToInteraction, flow, useCase,
							useCaseToInteraction, actorToLine, line, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AltUserStepBFToComboRuleImpl
					.pattern_AltUserStepBFToComboRule_44_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = AltUserStepBFToComboRuleImpl
						.pattern_AltUserStepBFToComboRule_44_5_blackBBBBBBBBBBBB(
								packageDeclaration, actor, sysActor, sysLine,
								sysActorToSysLine, interaction,
								flowToInteraction, flow, useCase,
								useCaseToInteraction, actorToLine, line);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_44_6_blackBBBBBBBBBBBBB(
									packageDeclaration, actor, sysActor,
									sysLine, sysActorToSysLine, interaction,
									flowToInteraction, flow, useCase,
									useCaseToInteraction, actorToLine, line,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					AltUserStepBFToComboRuleImpl
							.pattern_AltUserStepBFToComboRule_44_6_greenBBFFFBFBFFBFFFFFFBB(
									actor, sysLine, interaction, flow, line,
									ruleResult, csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// CombinedFragment combo = (CombinedFragment) result6_green[3];
					// InteractionOperand operand = (InteractionOperand) result6_green[4];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[6];
					// NormalStep step = (NormalStep) result6_green[8];
					// AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result6_green[9];
					// NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result6_green[11];
					// StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result6_green[12];
					// InteractionConstraint guard = (InteractionConstraint) result6_green[13];
					// LiteralString spec = (LiteralString) result6_green[14];
					// AlternativeFlow altFlow = (AlternativeFlow) result6_green[15];
					// FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result6_green[16];

				} else {
				}

			} else {
			}

		}
		return AltUserStepBFToComboRuleImpl
				.pattern_AltUserStepBFToComboRule_44_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("ALT");
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal3", true, csp);
		literal3.setValue("alt");
		literal3.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("UseCaseDSL.ActorType");

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
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		EqInterOperKind eqInterOperKind = new EqInterOperKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqInterOperKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal3);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
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
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(BasicFlow) arguments.get(4), (UseCase) arguments.get(5),
					(NormalStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_LIFELINE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(Interaction) arguments.get(6),
					(FlowToInteractionFragment) arguments.get(7),
					(BasicFlow) arguments.get(8), (UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(ActorToLifeline) arguments.get(11),
					(NormalStep) arguments.get(12),
					(AlternativeFlowAlternative) arguments.get(13),
					(Lifeline) arguments.get(14),
					(AlternativeFlow) arguments.get(15));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23), (EObject) arguments.get(24));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(CombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Lifeline) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(CombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Lifeline) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(CombinedFragment) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(Interaction) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Lifeline) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(CombinedFragment) arguments.get(7),
					(InteractionOperand) arguments.get(8),
					(Interaction) arguments.get(9),
					(FlowToInteractionFragment) arguments.get(10),
					(MessageOccurrenceSpecification) arguments.get(11),
					(BasicFlow) arguments.get(12), (UseCase) arguments.get(13),
					(UseCaseToInteraction) arguments.get(14),
					(ActorToLifeline) arguments.get(15),
					(Lifeline) arguments.get(16),
					(InteractionConstraint) arguments.get(17),
					(LiteralString) arguments.get(18));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23), (EObject) arguments.get(24));
			return null;
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_249__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_249((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_250__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_250((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_251__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_251((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_252__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_252((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_253__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_253((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_254__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_254((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_255__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_255((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_256__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_256((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_257__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_257((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_258__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_258((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_259__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_259((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_260__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_260((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_475__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_475((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_476__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_476((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_477__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_477((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_478__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_478((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_261__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_261((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_262__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_262((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_263__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_263((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_264__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_264((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_265__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_265((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_266__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_266((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(ActorToLifeline) arguments.get(1));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_LIFELINE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(Interaction) arguments.get(6),
					(FlowToInteractionFragment) arguments.get(7),
					(BasicFlow) arguments.get(8), (UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(ActorToLifeline) arguments.get(11),
					(Lifeline) arguments.get(12),
					(ModelgeneratorRuleResult) arguments.get(13));
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_1_blackBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		if (!actor.equals(sysActor)) {
			return new Object[] { _this, match, packageDeclaration, actor,
					sysActor, flow, useCase, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_2_bindingFBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				packageDeclaration, actor, sysActor, flow, useCase, step, alt,
				altFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration, actor,
					sysActor, flow, useCase, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_2_bindingAndBlackFBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		Object[] result_pattern_AltUserStepBFToComboRule_0_2_binding = pattern_AltUserStepBFToComboRule_0_2_bindingFBBBBBBBBBB(
				_this, match, packageDeclaration, actor, sysActor, flow,
				useCase, step, alt, altFlow);
		if (result_pattern_AltUserStepBFToComboRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_0_2_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_0_2_black = pattern_AltUserStepBFToComboRule_0_2_blackB(csp);
			if (result_pattern_AltUserStepBFToComboRule_0_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						actor, sysActor, flow, useCase, step, alt, altFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_0_3_expressionFBB(
			AltUserStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_4_blackBBBBBBBBB(
			Match match, PackageDeclaration packageDeclaration, Actor actor,
			Actor sysActor, BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		if (!actor.equals(sysActor)) {
			return new Object[] { match, packageDeclaration, actor, sysActor,
					flow, useCase, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_4_greenBBBBBBFFFF(
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

	public static final Object[] pattern_AltUserStepBFToComboRule_0_5_blackBBBBBBBBB(
			Match match, PackageDeclaration packageDeclaration, Actor actor,
			Actor sysActor, BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		if (!actor.equals(sysActor)) {
			return new Object[] { match, packageDeclaration, actor, sysActor,
					flow, useCase, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_0_5_greenBBBBBBFFFF(
			Match match, PackageDeclaration packageDeclaration, Actor actor,
			Actor sysActor, BasicFlow flow, UseCase useCase) {
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(packageDeclaration);
		match.getContextNodes().add(actor);
		match.getContextNodes().add(sysActor);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String useCase__flow____flows_name_prime = "flows";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		match.getContextEdges().add(packageDeclaration__sysActor____actors);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { match, packageDeclaration, actor, sysActor, flow,
				useCase, packageDeclaration__actor____actors,
				packageDeclaration__sysActor____actors, useCase__flow____flows,
				packageDeclaration__useCase____useCases };
	}

	public static final void pattern_AltUserStepBFToComboRule_0_6_expressionBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		_this.registerObjectsToMatch_FWD(match, packageDeclaration, actor,
				sysActor, flow, useCase, step, alt, altFlow);

	}

	public static final boolean pattern_AltUserStepBFToComboRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_1_bindingFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("actor");
		EObject _localVariable_2 = isApplicableMatch.getObject("sysActor");
		EObject _localVariable_3 = isApplicableMatch.getObject("sysLine");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("sysActorToSysLine");
		EObject _localVariable_5 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_10 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_11 = isApplicableMatch.getObject("step");
		EObject _localVariable_12 = isApplicableMatch.getObject("alt");
		EObject _localVariable_13 = isApplicableMatch.getObject("line");
		EObject _localVariable_14 = isApplicableMatch.getObject("altFlow");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpActor = _localVariable_1;
		EObject tmpSysActor = _localVariable_2;
		EObject tmpSysLine = _localVariable_3;
		EObject tmpSysActorToSysLine = _localVariable_4;
		EObject tmpInteraction = _localVariable_5;
		EObject tmpFlowToInteraction = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpUseCase = _localVariable_8;
		EObject tmpUseCaseToInteraction = _localVariable_9;
		EObject tmpActorToLine = _localVariable_10;
		EObject tmpStep = _localVariable_11;
		EObject tmpAlt = _localVariable_12;
		EObject tmpLine = _localVariable_13;
		EObject tmpAltFlow = _localVariable_14;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (tmpSysActor instanceof Actor) {
					Actor sysActor = (Actor) tmpSysActor;
					if (tmpSysLine instanceof Lifeline) {
						Lifeline sysLine = (Lifeline) tmpSysLine;
						if (tmpSysActorToSysLine instanceof ActorToLifeline) {
							ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
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
												if (tmpActorToLine instanceof ActorToLifeline) {
													ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
													if (tmpStep instanceof NormalStep) {
														NormalStep step = (NormalStep) tmpStep;
														if (tmpAlt instanceof AlternativeFlowAlternative) {
															AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
															if (tmpLine instanceof Lifeline) {
																Lifeline line = (Lifeline) tmpLine;
																if (tmpAltFlow instanceof AlternativeFlow) {
																	AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
																	return new Object[] {
																			packageDeclaration,
																			actor,
																			sysActor,
																			sysLine,
																			sysActorToSysLine,
																			interaction,
																			flowToInteraction,
																			flow,
																			useCase,
																			useCaseToInteraction,
																			actorToLine,
																			step,
																			alt,
																			line,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_1_blackBBBBBBBBBBBBBBBFBB(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow, AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!actor.equals(sysActor)) {
			if (!actorToLine.equals(sysActorToSysLine)) {
				if (!line.equals(sysLine)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { packageDeclaration, actor,
									sysActor, sysLine, sysActorToSysLine,
									interaction, flowToInteraction, flow,
									useCase, useCaseToInteraction, actorToLine,
									step, alt, line, altFlow, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFBB(
			AltUserStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltUserStepBFToComboRule_1_1_binding = pattern_AltUserStepBFToComboRule_1_1_bindingFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltUserStepBFToComboRule_1_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltUserStepBFToComboRule_1_1_binding[0];
			Actor actor = (Actor) result_pattern_AltUserStepBFToComboRule_1_1_binding[1];
			Actor sysActor = (Actor) result_pattern_AltUserStepBFToComboRule_1_1_binding[2];
			Lifeline sysLine = (Lifeline) result_pattern_AltUserStepBFToComboRule_1_1_binding[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result_pattern_AltUserStepBFToComboRule_1_1_binding[4];
			Interaction interaction = (Interaction) result_pattern_AltUserStepBFToComboRule_1_1_binding[5];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_AltUserStepBFToComboRule_1_1_binding[6];
			BasicFlow flow = (BasicFlow) result_pattern_AltUserStepBFToComboRule_1_1_binding[7];
			UseCase useCase = (UseCase) result_pattern_AltUserStepBFToComboRule_1_1_binding[8];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltUserStepBFToComboRule_1_1_binding[9];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_AltUserStepBFToComboRule_1_1_binding[10];
			NormalStep step = (NormalStep) result_pattern_AltUserStepBFToComboRule_1_1_binding[11];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_AltUserStepBFToComboRule_1_1_binding[12];
			Lifeline line = (Lifeline) result_pattern_AltUserStepBFToComboRule_1_1_binding[13];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_AltUserStepBFToComboRule_1_1_binding[14];

			Object[] result_pattern_AltUserStepBFToComboRule_1_1_black = pattern_AltUserStepBFToComboRule_1_1_blackBBBBBBBBBBBBBBBFBB(
					packageDeclaration, actor, sysActor, sysLine,
					sysActorToSysLine, interaction, flowToInteraction, flow,
					useCase, useCaseToInteraction, actorToLine, step, alt,
					line, altFlow, _this, isApplicableMatch);
			if (result_pattern_AltUserStepBFToComboRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_1_1_black[15];

				return new Object[] { packageDeclaration, actor, sysActor,
						sysLine, sysActorToSysLine, interaction,
						flowToInteraction, flow, useCase, useCaseToInteraction,
						actorToLine, step, alt, line, altFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_1_greenBFFFBFBBBFFFFBFB(
			Lifeline sysLine, Interaction interaction, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
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
		sysLine.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		sysLine.getCoveredBy().add(combo);
		combo.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(combo);
		sysLine.getCoveredBy().add(operand);
		line.getCoveredBy().add(operand);
		messageReceive.setEnclosingInteraction(interaction);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
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
		return new Object[] { sysLine, messageSend, combo, operand,
				interaction, messageReceive, step, alt, line, stepToCombo,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand,
				csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_2_blackBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, combo, operand, messageReceive,
					step, alt, stepToCombo, alternative1ToOperand, guard, spec,
					altFlow, altFlowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_2_greenFBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(messageSend);
		ruleresult.getCreatedElements().add(combo);
		ruleresult.getCreatedElements().add(operand);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		ruleresult.getCreatedLinkElements().add(alternative1ToOperand);
		ruleresult.getCreatedElements().add(guard);
		ruleresult.getCreatedElements().add(spec);
		ruleresult.getTranslatedElements().add(altFlow);
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		return new Object[] { ruleresult, messageSend, combo, operand,
				messageReceive, step, alt, stepToCombo, alternative1ToOperand,
				guard, spec, altFlow, altFlowToOperand };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject actor, EObject sysActor, EObject sysLine,
			EObject sysActorToSysLine, EObject messageSend, EObject combo,
			EObject operand, EObject interaction, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject actorToLine, EObject step,
			EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		if (!packageDeclaration.equals(sysActor)) {
			if (!packageDeclaration.equals(sysLine)) {
				if (!packageDeclaration.equals(sysActorToSysLine)) {
					if (!packageDeclaration.equals(useCase)) {
						if (!packageDeclaration.equals(useCaseToInteraction)) {
							if (!packageDeclaration.equals(step)) {
								if (!packageDeclaration.equals(stepToCombo)) {
									if (!packageDeclaration.equals(spec)) {
										if (!actor.equals(packageDeclaration)) {
											if (!actor.equals(sysActor)) {
												if (!actor.equals(sysLine)) {
													if (!actor
															.equals(sysActorToSysLine)) {
														if (!actor
																.equals(messageSend)) {
															if (!actor
																	.equals(combo)) {
																if (!actor
																		.equals(operand)) {
																	if (!actor
																			.equals(interaction)) {
																		if (!actor
																				.equals(flowToInteraction)) {
																			if (!actor
																					.equals(messageReceive)) {
																				if (!actor
																						.equals(flow)) {
																					if (!actor
																							.equals(useCase)) {
																						if (!actor
																								.equals(useCaseToInteraction)) {
																							if (!actor
																									.equals(actorToLine)) {
																								if (!actor
																										.equals(step)) {
																									if (!actor
																											.equals(alt)) {
																										if (!actor
																												.equals(line)) {
																											if (!actor
																													.equals(stepToCombo)) {
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
																																	if (!sysActor
																																			.equals(sysLine)) {
																																		if (!sysActor
																																				.equals(sysActorToSysLine)) {
																																			if (!sysActor
																																					.equals(useCase)) {
																																				if (!sysActor
																																						.equals(useCaseToInteraction)) {
																																					if (!sysLine
																																							.equals(useCase)) {
																																						if (!sysLine
																																								.equals(useCaseToInteraction)) {
																																							if (!sysActorToSysLine
																																									.equals(sysLine)) {
																																								if (!sysActorToSysLine
																																										.equals(useCase)) {
																																									if (!sysActorToSysLine
																																											.equals(useCaseToInteraction)) {
																																										if (!messageSend
																																												.equals(packageDeclaration)) {
																																											if (!messageSend
																																													.equals(sysActor)) {
																																												if (!messageSend
																																														.equals(sysLine)) {
																																													if (!messageSend
																																															.equals(sysActorToSysLine)) {
																																														if (!messageSend
																																																.equals(operand)) {
																																															if (!messageSend
																																																	.equals(useCase)) {
																																																if (!messageSend
																																																		.equals(useCaseToInteraction)) {
																																																	if (!messageSend
																																																			.equals(step)) {
																																																		if (!messageSend
																																																				.equals(stepToCombo)) {
																																																			if (!messageSend
																																																					.equals(spec)) {
																																																				if (!combo
																																																						.equals(packageDeclaration)) {
																																																					if (!combo
																																																							.equals(sysActor)) {
																																																						if (!combo
																																																								.equals(sysLine)) {
																																																							if (!combo
																																																									.equals(sysActorToSysLine)) {
																																																								if (!combo
																																																										.equals(messageSend)) {
																																																									if (!combo
																																																											.equals(operand)) {
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
																																																																		.equals(step)) {
																																																																	if (!combo
																																																																			.equals(line)) {
																																																																		if (!combo
																																																																				.equals(stepToCombo)) {
																																																																			if (!combo
																																																																					.equals(guard)) {
																																																																				if (!combo
																																																																						.equals(spec)) {
																																																																					if (!operand
																																																																							.equals(packageDeclaration)) {
																																																																						if (!operand
																																																																								.equals(sysActor)) {
																																																																							if (!operand
																																																																									.equals(sysLine)) {
																																																																								if (!operand
																																																																										.equals(sysActorToSysLine)) {
																																																																									if (!operand
																																																																											.equals(useCase)) {
																																																																										if (!operand
																																																																												.equals(useCaseToInteraction)) {
																																																																											if (!operand
																																																																													.equals(step)) {
																																																																												if (!operand
																																																																														.equals(stepToCombo)) {
																																																																													if (!operand
																																																																															.equals(spec)) {
																																																																														if (!interaction
																																																																																.equals(packageDeclaration)) {
																																																																															if (!interaction
																																																																																	.equals(sysActor)) {
																																																																																if (!interaction
																																																																																		.equals(sysLine)) {
																																																																																	if (!interaction
																																																																																			.equals(sysActorToSysLine)) {
																																																																																		if (!interaction
																																																																																				.equals(messageSend)) {
																																																																																			if (!interaction
																																																																																					.equals(operand)) {
																																																																																				if (!interaction
																																																																																						.equals(messageReceive)) {
																																																																																					if (!interaction
																																																																																							.equals(useCase)) {
																																																																																						if (!interaction
																																																																																								.equals(useCaseToInteraction)) {
																																																																																							if (!interaction
																																																																																									.equals(step)) {
																																																																																								if (!interaction
																																																																																										.equals(line)) {
																																																																																									if (!interaction
																																																																																											.equals(stepToCombo)) {
																																																																																										if (!interaction
																																																																																												.equals(spec)) {
																																																																																											if (!flowToInteraction
																																																																																													.equals(packageDeclaration)) {
																																																																																												if (!flowToInteraction
																																																																																														.equals(sysActor)) {
																																																																																													if (!flowToInteraction
																																																																																															.equals(sysLine)) {
																																																																																														if (!flowToInteraction
																																																																																																.equals(sysActorToSysLine)) {
																																																																																															if (!flowToInteraction
																																																																																																	.equals(messageSend)) {
																																																																																																if (!flowToInteraction
																																																																																																		.equals(operand)) {
																																																																																																	if (!flowToInteraction
																																																																																																			.equals(interaction)) {
																																																																																																		if (!flowToInteraction
																																																																																																				.equals(messageReceive)) {
																																																																																																			if (!flowToInteraction
																																																																																																					.equals(useCase)) {
																																																																																																				if (!flowToInteraction
																																																																																																						.equals(useCaseToInteraction)) {
																																																																																																					if (!flowToInteraction
																																																																																																							.equals(step)) {
																																																																																																						if (!flowToInteraction
																																																																																																								.equals(line)) {
																																																																																																							if (!flowToInteraction
																																																																																																									.equals(stepToCombo)) {
																																																																																																								if (!flowToInteraction
																																																																																																										.equals(guard)) {
																																																																																																									if (!flowToInteraction
																																																																																																											.equals(spec)) {
																																																																																																										if (!messageReceive
																																																																																																												.equals(packageDeclaration)) {
																																																																																																											if (!messageReceive
																																																																																																													.equals(sysActor)) {
																																																																																																												if (!messageReceive
																																																																																																														.equals(sysLine)) {
																																																																																																													if (!messageReceive
																																																																																																															.equals(sysActorToSysLine)) {
																																																																																																														if (!messageReceive
																																																																																																																.equals(messageSend)) {
																																																																																																															if (!messageReceive
																																																																																																																	.equals(operand)) {
																																																																																																																if (!messageReceive
																																																																																																																		.equals(useCase)) {
																																																																																																																	if (!messageReceive
																																																																																																																			.equals(useCaseToInteraction)) {
																																																																																																																		if (!messageReceive
																																																																																																																				.equals(step)) {
																																																																																																																			if (!messageReceive
																																																																																																																					.equals(stepToCombo)) {
																																																																																																																				if (!messageReceive
																																																																																																																						.equals(spec)) {
																																																																																																																					if (!flow
																																																																																																																							.equals(packageDeclaration)) {
																																																																																																																						if (!flow
																																																																																																																								.equals(sysActor)) {
																																																																																																																							if (!flow
																																																																																																																									.equals(sysLine)) {
																																																																																																																								if (!flow
																																																																																																																										.equals(sysActorToSysLine)) {
																																																																																																																									if (!flow
																																																																																																																											.equals(messageSend)) {
																																																																																																																										if (!flow
																																																																																																																												.equals(operand)) {
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
																																																																																																																																		.equals(step)) {
																																																																																																																																	if (!flow
																																																																																																																																			.equals(line)) {
																																																																																																																																		if (!flow
																																																																																																																																				.equals(stepToCombo)) {
																																																																																																																																			if (!flow
																																																																																																																																					.equals(guard)) {
																																																																																																																																				if (!flow
																																																																																																																																						.equals(spec)) {
																																																																																																																																					if (!useCase
																																																																																																																																							.equals(useCaseToInteraction)) {
																																																																																																																																						if (!actorToLine
																																																																																																																																								.equals(packageDeclaration)) {
																																																																																																																																							if (!actorToLine
																																																																																																																																									.equals(sysActor)) {
																																																																																																																																								if (!actorToLine
																																																																																																																																										.equals(sysLine)) {
																																																																																																																																									if (!actorToLine
																																																																																																																																											.equals(sysActorToSysLine)) {
																																																																																																																																										if (!actorToLine
																																																																																																																																												.equals(messageSend)) {
																																																																																																																																											if (!actorToLine
																																																																																																																																													.equals(combo)) {
																																																																																																																																												if (!actorToLine
																																																																																																																																														.equals(operand)) {
																																																																																																																																													if (!actorToLine
																																																																																																																																															.equals(interaction)) {
																																																																																																																																														if (!actorToLine
																																																																																																																																																.equals(flowToInteraction)) {
																																																																																																																																															if (!actorToLine
																																																																																																																																																	.equals(messageReceive)) {
																																																																																																																																																if (!actorToLine
																																																																																																																																																		.equals(flow)) {
																																																																																																																																																	if (!actorToLine
																																																																																																																																																			.equals(useCase)) {
																																																																																																																																																		if (!actorToLine
																																																																																																																																																				.equals(useCaseToInteraction)) {
																																																																																																																																																			if (!actorToLine
																																																																																																																																																					.equals(step)) {
																																																																																																																																																				if (!actorToLine
																																																																																																																																																						.equals(alt)) {
																																																																																																																																																					if (!actorToLine
																																																																																																																																																							.equals(line)) {
																																																																																																																																																						if (!actorToLine
																																																																																																																																																								.equals(stepToCombo)) {
																																																																																																																																																							if (!actorToLine
																																																																																																																																																									.equals(alternative1ToOperand)) {
																																																																																																																																																								if (!actorToLine
																																																																																																																																																										.equals(guard)) {
																																																																																																																																																									if (!actorToLine
																																																																																																																																																											.equals(spec)) {
																																																																																																																																																										if (!actorToLine
																																																																																																																																																												.equals(altFlow)) {
																																																																																																																																																											if (!actorToLine
																																																																																																																																																													.equals(altFlowToOperand)) {
																																																																																																																																																												if (!step
																																																																																																																																																														.equals(sysActor)) {
																																																																																																																																																													if (!step
																																																																																																																																																															.equals(sysLine)) {
																																																																																																																																																														if (!step
																																																																																																																																																																.equals(sysActorToSysLine)) {
																																																																																																																																																															if (!step
																																																																																																																																																																	.equals(useCase)) {
																																																																																																																																																																if (!step
																																																																																																																																																																		.equals(useCaseToInteraction)) {
																																																																																																																																																																	if (!step
																																																																																																																																																																			.equals(stepToCombo)) {
																																																																																																																																																																		if (!alt.equals(packageDeclaration)) {
																																																																																																																																																																			if (!alt.equals(sysActor)) {
																																																																																																																																																																				if (!alt.equals(sysLine)) {
																																																																																																																																																																					if (!alt.equals(sysActorToSysLine)) {
																																																																																																																																																																						if (!alt.equals(messageSend)) {
																																																																																																																																																																							if (!alt.equals(combo)) {
																																																																																																																																																																								if (!alt.equals(operand)) {
																																																																																																																																																																									if (!alt.equals(interaction)) {
																																																																																																																																																																										if (!alt.equals(flowToInteraction)) {
																																																																																																																																																																											if (!alt.equals(messageReceive)) {
																																																																																																																																																																												if (!alt.equals(flow)) {
																																																																																																																																																																													if (!alt.equals(useCase)) {
																																																																																																																																																																														if (!alt.equals(useCaseToInteraction)) {
																																																																																																																																																																															if (!alt.equals(step)) {
																																																																																																																																																																																if (!alt.equals(line)) {
																																																																																																																																																																																	if (!alt.equals(stepToCombo)) {
																																																																																																																																																																																		if (!alt.equals(alternative1ToOperand)) {
																																																																																																																																																																																			if (!alt.equals(guard)) {
																																																																																																																																																																																				if (!alt.equals(spec)) {
																																																																																																																																																																																					if (!alt.equals(altFlow)) {
																																																																																																																																																																																						if (!alt.equals(altFlowToOperand)) {
																																																																																																																																																																																							if (!line
																																																																																																																																																																																									.equals(packageDeclaration)) {
																																																																																																																																																																																								if (!line
																																																																																																																																																																																										.equals(sysActor)) {
																																																																																																																																																																																									if (!line
																																																																																																																																																																																											.equals(sysLine)) {
																																																																																																																																																																																										if (!line
																																																																																																																																																																																												.equals(sysActorToSysLine)) {
																																																																																																																																																																																											if (!line
																																																																																																																																																																																													.equals(messageSend)) {
																																																																																																																																																																																												if (!line
																																																																																																																																																																																														.equals(operand)) {
																																																																																																																																																																																													if (!line
																																																																																																																																																																																															.equals(messageReceive)) {
																																																																																																																																																																																														if (!line
																																																																																																																																																																																																.equals(useCase)) {
																																																																																																																																																																																															if (!line
																																																																																																																																																																																																	.equals(useCaseToInteraction)) {
																																																																																																																																																																																																if (!line
																																																																																																																																																																																																		.equals(step)) {
																																																																																																																																																																																																	if (!line
																																																																																																																																																																																																			.equals(stepToCombo)) {
																																																																																																																																																																																																		if (!line
																																																																																																																																																																																																				.equals(spec)) {
																																																																																																																																																																																																			if (!stepToCombo
																																																																																																																																																																																																					.equals(sysActor)) {
																																																																																																																																																																																																				if (!stepToCombo
																																																																																																																																																																																																						.equals(sysLine)) {
																																																																																																																																																																																																					if (!stepToCombo
																																																																																																																																																																																																							.equals(sysActorToSysLine)) {
																																																																																																																																																																																																						if (!stepToCombo
																																																																																																																																																																																																								.equals(useCase)) {
																																																																																																																																																																																																							if (!stepToCombo
																																																																																																																																																																																																									.equals(useCaseToInteraction)) {
																																																																																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																																																																																										.equals(packageDeclaration)) {
																																																																																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																																																																																											.equals(sysActor)) {
																																																																																																																																																																																																										if (!alternative1ToOperand
																																																																																																																																																																																																												.equals(sysLine)) {
																																																																																																																																																																																																											if (!alternative1ToOperand
																																																																																																																																																																																																													.equals(sysActorToSysLine)) {
																																																																																																																																																																																																												if (!alternative1ToOperand
																																																																																																																																																																																																														.equals(messageSend)) {
																																																																																																																																																																																																													if (!alternative1ToOperand
																																																																																																																																																																																																															.equals(combo)) {
																																																																																																																																																																																																														if (!alternative1ToOperand
																																																																																																																																																																																																																.equals(operand)) {
																																																																																																																																																																																																															if (!alternative1ToOperand
																																																																																																																																																																																																																	.equals(interaction)) {
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
																																																																																																																																																																																																																							.equals(step)) {
																																																																																																																																																																																																																						if (!alternative1ToOperand
																																																																																																																																																																																																																								.equals(line)) {
																																																																																																																																																																																																																							if (!alternative1ToOperand
																																																																																																																																																																																																																									.equals(stepToCombo)) {
																																																																																																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																																																																																																										.equals(guard)) {
																																																																																																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																																																																																																											.equals(spec)) {
																																																																																																																																																																																																																										if (!guard
																																																																																																																																																																																																																												.equals(packageDeclaration)) {
																																																																																																																																																																																																																											if (!guard
																																																																																																																																																																																																																													.equals(sysActor)) {
																																																																																																																																																																																																																												if (!guard
																																																																																																																																																																																																																														.equals(sysLine)) {
																																																																																																																																																																																																																													if (!guard
																																																																																																																																																																																																																															.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																														if (!guard
																																																																																																																																																																																																																																.equals(messageSend)) {
																																																																																																																																																																																																																															if (!guard
																																																																																																																																																																																																																																	.equals(operand)) {
																																																																																																																																																																																																																																if (!guard
																																																																																																																																																																																																																																		.equals(interaction)) {
																																																																																																																																																																																																																																	if (!guard
																																																																																																																																																																																																																																			.equals(messageReceive)) {
																																																																																																																																																																																																																																		if (!guard
																																																																																																																																																																																																																																				.equals(useCase)) {
																																																																																																																																																																																																																																			if (!guard
																																																																																																																																																																																																																																					.equals(useCaseToInteraction)) {
																																																																																																																																																																																																																																				if (!guard
																																																																																																																																																																																																																																						.equals(step)) {
																																																																																																																																																																																																																																					if (!guard
																																																																																																																																																																																																																																							.equals(line)) {
																																																																																																																																																																																																																																						if (!guard
																																																																																																																																																																																																																																								.equals(stepToCombo)) {
																																																																																																																																																																																																																																							if (!guard
																																																																																																																																																																																																																																									.equals(spec)) {
																																																																																																																																																																																																																																								if (!spec
																																																																																																																																																																																																																																										.equals(sysActor)) {
																																																																																																																																																																																																																																									if (!spec
																																																																																																																																																																																																																																											.equals(sysLine)) {
																																																																																																																																																																																																																																										if (!spec
																																																																																																																																																																																																																																												.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																																											if (!spec
																																																																																																																																																																																																																																													.equals(useCase)) {
																																																																																																																																																																																																																																												if (!spec
																																																																																																																																																																																																																																														.equals(useCaseToInteraction)) {
																																																																																																																																																																																																																																													if (!spec
																																																																																																																																																																																																																																															.equals(step)) {
																																																																																																																																																																																																																																														if (!spec
																																																																																																																																																																																																																																																.equals(stepToCombo)) {
																																																																																																																																																																																																																																															if (!altFlow
																																																																																																																																																																																																																																																	.equals(packageDeclaration)) {
																																																																																																																																																																																																																																																if (!altFlow
																																																																																																																																																																																																																																																		.equals(sysActor)) {
																																																																																																																																																																																																																																																	if (!altFlow
																																																																																																																																																																																																																																																			.equals(sysLine)) {
																																																																																																																																																																																																																																																		if (!altFlow
																																																																																																																																																																																																																																																				.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																																																			if (!altFlow
																																																																																																																																																																																																																																																					.equals(messageSend)) {
																																																																																																																																																																																																																																																				if (!altFlow
																																																																																																																																																																																																																																																						.equals(combo)) {
																																																																																																																																																																																																																																																					if (!altFlow
																																																																																																																																																																																																																																																							.equals(operand)) {
																																																																																																																																																																																																																																																						if (!altFlow
																																																																																																																																																																																																																																																								.equals(interaction)) {
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
																																																																																																																																																																																																																																																														.equals(step)) {
																																																																																																																																																																																																																																																													if (!altFlow
																																																																																																																																																																																																																																																															.equals(line)) {
																																																																																																																																																																																																																																																														if (!altFlow
																																																																																																																																																																																																																																																																.equals(stepToCombo)) {
																																																																																																																																																																																																																																																															if (!altFlow
																																																																																																																																																																																																																																																																	.equals(alternative1ToOperand)) {
																																																																																																																																																																																																																																																																if (!altFlow
																																																																																																																																																																																																																																																																		.equals(guard)) {
																																																																																																																																																																																																																																																																	if (!altFlow
																																																																																																																																																																																																																																																																			.equals(spec)) {
																																																																																																																																																																																																																																																																		if (!altFlow
																																																																																																																																																																																																																																																																				.equals(altFlowToOperand)) {
																																																																																																																																																																																																																																																																			if (!altFlowToOperand
																																																																																																																																																																																																																																																																					.equals(packageDeclaration)) {
																																																																																																																																																																																																																																																																				if (!altFlowToOperand
																																																																																																																																																																																																																																																																						.equals(sysActor)) {
																																																																																																																																																																																																																																																																					if (!altFlowToOperand
																																																																																																																																																																																																																																																																							.equals(sysLine)) {
																																																																																																																																																																																																																																																																						if (!altFlowToOperand
																																																																																																																																																																																																																																																																								.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																																																																							if (!altFlowToOperand
																																																																																																																																																																																																																																																																									.equals(messageSend)) {
																																																																																																																																																																																																																																																																								if (!altFlowToOperand
																																																																																																																																																																																																																																																																										.equals(combo)) {
																																																																																																																																																																																																																																																																									if (!altFlowToOperand
																																																																																																																																																																																																																																																																											.equals(operand)) {
																																																																																																																																																																																																																																																																										if (!altFlowToOperand
																																																																																																																																																																																																																																																																												.equals(interaction)) {
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
																																																																																																																																																																																																																																																																																		.equals(step)) {
																																																																																																																																																																																																																																																																																	if (!altFlowToOperand
																																																																																																																																																																																																																																																																																			.equals(line)) {
																																																																																																																																																																																																																																																																																		if (!altFlowToOperand
																																																																																																																																																																																																																																																																																				.equals(stepToCombo)) {
																																																																																																																																																																																																																																																																																			if (!altFlowToOperand
																																																																																																																																																																																																																																																																																					.equals(alternative1ToOperand)) {
																																																																																																																																																																																																																																																																																				if (!altFlowToOperand
																																																																																																																																																																																																																																																																																						.equals(guard)) {
																																																																																																																																																																																																																																																																																					if (!altFlowToOperand
																																																																																																																																																																																																																																																																																							.equals(spec)) {
																																																																																																																																																																																																																																																																																						return new Object[] {
																																																																																																																																																																																																																																																																																								ruleresult,
																																																																																																																																																																																																																																																																																								packageDeclaration,
																																																																																																																																																																																																																																																																																								actor,
																																																																																																																																																																																																																																																																																								sysActor,
																																																																																																																																																																																																																																																																																								sysLine,
																																																																																																																																																																																																																																																																																								sysActorToSysLine,
																																																																																																																																																																																																																																																																																								messageSend,
																																																																																																																																																																																																																																																																																								combo,
																																																																																																																																																																																																																																																																																								operand,
																																																																																																																																																																																																																																																																																								interaction,
																																																																																																																																																																																																																																																																																								flowToInteraction,
																																																																																																																																																																																																																																																																																								messageReceive,
																																																																																																																																																																																																																																																																																								flow,
																																																																																																																																																																																																																																																																																								useCase,
																																																																																																																																																																																																																																																																																								useCaseToInteraction,
																																																																																																																																																																																																																																																																																								actorToLine,
																																																																																																																																																																																																																																																																																								step,
																																																																																																																																																																																																																																																																																								alt,
																																																																																																																																																																																																																																																																																								line,
																																																																																																																																																																																																																																																																																								stepToCombo,
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
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltUserStepBFToComboRule_1_3_greenBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject sysLine,
			EObject messageSend, EObject combo, EObject operand,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
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
		String ruleresult_ruleName_prime = "AltUserStepBFToComboRule";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
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
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(messageSend__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		ruleresult.getCreatedEdges().add(sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(combo__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		ruleresult.getCreatedEdges().add(sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(operand__sysLine____covered);
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
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
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
		return new Object[] { ruleresult, actor, sysLine, messageSend, combo,
				operand, interaction, messageReceive, flow, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand, sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment, flow__step____steps,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref, line__combo____coveredBy,
				combo__line____covered, line__operand____coveredBy,
				operand__line____covered, stepToCombo__step____source,
				stepToCombo__combo____target, operand__guard____guard,
				alternative1ToOperand__alt____source,
				alternative1ToOperand__operand____target,
				guard__spec____specification,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target };
	}

	public static final void pattern_AltUserStepBFToComboRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject actor, EObject sysActor,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject combo, EObject operand, EObject interaction,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction, EObject actorToLine,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		_this.registerObjects_FWD(ruleresult, packageDeclaration, actor,
				sysActor, sysLine, sysActorToSysLine, messageSend, combo,
				operand, interaction, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, actorToLine, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand);

	}

	public static final PerformRuleResult pattern_AltUserStepBFToComboRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_1_blackFBB(
			EClass eClass, AltUserStepBFToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_2_1_binding = pattern_AltUserStepBFToComboRule_2_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltUserStepBFToComboRule_2_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_2_1_black = pattern_AltUserStepBFToComboRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltUserStepBFToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_2_bindingFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("actor");
		EObject _localVariable_2 = match.getObject("sysActor");
		EObject _localVariable_3 = match.getObject("flow");
		EObject _localVariable_4 = match.getObject("useCase");
		EObject _localVariable_5 = match.getObject("step");
		EObject _localVariable_6 = match.getObject("alt");
		EObject _localVariable_7 = match.getObject("altFlow");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpActor = _localVariable_1;
		EObject tmpSysActor = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		EObject tmpAlt = _localVariable_6;
		EObject tmpAltFlow = _localVariable_7;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (tmpSysActor instanceof Actor) {
					Actor sysActor = (Actor) tmpSysActor;
					if (tmpFlow instanceof BasicFlow) {
						BasicFlow flow = (BasicFlow) tmpFlow;
						if (tmpUseCase instanceof UseCase) {
							UseCase useCase = (UseCase) tmpUseCase;
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (tmpAlt instanceof AlternativeFlowAlternative) {
									AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
									if (tmpAltFlow instanceof AlternativeFlow) {
										AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
										return new Object[] {
												packageDeclaration, actor,
												sysActor, flow, useCase, step,
												alt, altFlow, match };
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

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_2_2_blackBBBFFFFBBFFBBFBB(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			for (ActorToLifeline sysActorToSysLine : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(sysActor, ActorToLifeline.class,
							"source")) {
				Lifeline sysLine = sysActorToSysLine.getTarget();
				if (sysLine != null) {
					for (FlowToInteractionFragment flowToInteraction : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									FlowToInteractionFragment.class, "source")) {
						InteractionFragment tmpInteraction = flowToInteraction
								.getTarget();
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(useCase,
											UseCaseToInteraction.class,
											"source")) {
								if (interaction.equals(useCaseToInteraction
										.getTarget())) {
									for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(actor,
													ActorToLifeline.class,
													"source")) {
										if (!actorToLine
												.equals(sysActorToSysLine)) {
											Lifeline line = actorToLine
													.getTarget();
											if (line != null) {
												if (!line.equals(sysLine)) {
													_result.add(new Object[] {
															packageDeclaration,
															actor,
															sysActor,
															sysLine,
															sysActorToSysLine,
															interaction,
															flowToInteraction,
															flow,
															useCase,
															useCaseToInteraction,
															actorToLine, step,
															alt, line, altFlow,
															match });
												}
											}

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

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_2_3_blackBBBBBBBBBBBBBBB(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			if (!actorToLine.equals(sysActorToSysLine)) {
				if (!line.equals(sysLine)) {
					if (packageDeclaration.getActors().contains(actor)) {
						if (packageDeclaration.getActors().contains(sysActor)) {
							if (sysActor.equals(sysActorToSysLine.getSource())) {
								if (sysLine.equals(sysActorToSysLine
										.getTarget())) {
									if (flow.equals(flowToInteraction
											.getSource())) {
										if (interaction
												.equals(flowToInteraction
														.getTarget())) {
											if (interaction.equals(line
													.getInteraction())) {
												if (useCase.getFlows()
														.contains(flow)) {
													if (useCase
															.equals(useCaseToInteraction
																	.getSource())) {
														if (interaction
																.equals(useCaseToInteraction
																		.getTarget())) {
															if (flow.getSteps()
																	.contains(
																			step)) {
																if (packageDeclaration
																		.getUseCases()
																		.contains(
																				useCase)) {
																	if (actor
																			.equals(actorToLine
																					.getSource())) {
																		if (line.equals(actorToLine
																				.getTarget())) {
																			if (step.getStepAlternative()
																					.contains(
																							alt)) {
																				if (actor
																						.equals(step
																								.getActor())) {
																					if (altFlow
																							.equals(alt
																									.getRef())) {
																						_result.add(new Object[] {
																								packageDeclaration,
																								actor,
																								sysActor,
																								sysLine,
																								sysActorToSysLine,
																								interaction,
																								flowToInteraction,
																								flow,
																								useCase,
																								useCaseToInteraction,
																								actorToLine,
																								step,
																								alt,
																								line,
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
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_3_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysActor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysLine____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String sysActorToSysLine__sysActor____source_name_prime = "source";
		String sysActorToSysLine__sysLine____target_name_prime = "target";
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(sysActor);
		isApplicableMatch.getAllContextElements().add(sysLine);
		isApplicableMatch.getAllContextElements().add(sysActorToSysLine);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(altFlow);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__sysActor____actors);
		sysActorToSysLine__sysActor____source.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysActor____source.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysActor____source);
		sysActorToSysLine__sysLine____target.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysLine____target.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysLine____target);
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
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
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
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		sysActorToSysLine__sysActor____source
				.setName(sysActorToSysLine__sysActor____source_name_prime);
		sysActorToSysLine__sysLine____target
				.setName(sysActorToSysLine__sysLine____target_name_prime);
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
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		return new Object[] { packageDeclaration, actor, sysActor, sysLine,
				sysActorToSysLine, interaction, flowToInteraction, flow,
				useCase, useCaseToInteraction, actorToLine, step, alt, line,
				altFlow, isApplicableMatch,
				packageDeclaration__actor____actors,
				packageDeclaration__sysActor____actors,
				sysActorToSysLine__sysActor____source,
				sysActorToSysLine__sysLine____target,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, packageDeclaration__useCase____useCases,
				actorToLine__actor____source, actorToLine__line____target,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_4_bindingFBBBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, packageDeclaration, actor, sysActor,
				sysLine, sysActorToSysLine, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, actorToLine, step, alt,
				line, altFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, actor, sysActor, sysLine,
					sysActorToSysLine, interaction, flowToInteraction, flow,
					useCase, useCaseToInteraction, actorToLine, step, alt,
					line, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, NormalStep step,
			AlternativeFlowAlternative alt, Lifeline line,
			AlternativeFlow altFlow) {
		Object[] result_pattern_AltUserStepBFToComboRule_2_4_binding = pattern_AltUserStepBFToComboRule_2_4_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, actor, sysActor,
				sysLine, sysActorToSysLine, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, actorToLine, step, alt,
				line, altFlow);
		if (result_pattern_AltUserStepBFToComboRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_2_4_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_2_4_black = pattern_AltUserStepBFToComboRule_2_4_blackB(csp);
			if (result_pattern_AltUserStepBFToComboRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, actor, sysActor, sysLine,
						sysActorToSysLine, interaction, flowToInteraction,
						flow, useCase, useCaseToInteraction, actorToLine, step,
						alt, line, altFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_2_5_expressionFBB(
			AltUserStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltUserStepBFToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltUserStepBFToComboRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_1_blackBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { _this, match, sysLine, messageSend,
						combo, operand, interaction, messageReceive, line,
						guard, spec };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_2_bindingFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sysLine, messageSend,
					combo, operand, interaction, messageReceive, line, guard,
					spec };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_2_bindingAndBlackFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_AltUserStepBFToComboRule_10_2_binding = pattern_AltUserStepBFToComboRule_10_2_bindingFBBBBBBBBBBB(
				_this, match, sysLine, messageSend, combo, operand,
				interaction, messageReceive, line, guard, spec);
		if (result_pattern_AltUserStepBFToComboRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_10_2_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_10_2_black = pattern_AltUserStepBFToComboRule_10_2_blackB(csp);
			if (result_pattern_AltUserStepBFToComboRule_10_2_black != null) {

				return new Object[] { csp, _this, match, sysLine, messageSend,
						combo, operand, interaction, messageReceive, line,
						guard, spec };
			}
		}
		return null;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_10_3_expressionFBB(
			AltUserStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_4_blackBBBBBBBBBB(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { match, sysLine, messageSend, combo,
						operand, interaction, messageReceive, line, guard, spec };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_4_greenBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
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
		match.getToBeTranslatedNodes().add(operand);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(guard);
		match.getToBeTranslatedNodes().add(spec);
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(messageSend__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		match.getToBeTranslatedEdges().add(sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(combo__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		match.getToBeTranslatedEdges().add(sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(operand__sysLine____covered);
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
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
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
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { match, sysLine, messageSend, combo, operand,
				interaction, messageReceive, line, guard, spec,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				line__combo____coveredBy, combo__line____covered,
				line__operand____coveredBy, operand__line____covered,
				operand__guard____guard, guard__spec____specification };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_5_blackBBBBBBBBBB(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { match, sysLine, messageSend, combo,
						operand, interaction, messageReceive, line, guard, spec };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_10_5_greenBBBBFF(
			Match match, Lifeline sysLine, Interaction interaction,
			Lifeline line) {
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(sysLine);
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
		return new Object[] { match, sysLine, interaction, line,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_AltUserStepBFToComboRule_10_6_expressionBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		_this.registerObjectsToMatch_BWD(match, sysLine, messageSend, combo,
				operand, interaction, messageReceive, line, guard, spec);

	}

	public static final boolean pattern_AltUserStepBFToComboRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_1_bindingFFFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("actor");
		EObject _localVariable_2 = isApplicableMatch.getObject("sysActor");
		EObject _localVariable_3 = isApplicableMatch.getObject("sysLine");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("sysActorToSysLine");
		EObject _localVariable_5 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_6 = isApplicableMatch.getObject("combo");
		EObject _localVariable_7 = isApplicableMatch.getObject("operand");
		EObject _localVariable_8 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_11 = isApplicableMatch.getObject("flow");
		EObject _localVariable_12 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_13 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_14 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_15 = isApplicableMatch.getObject("line");
		EObject _localVariable_16 = isApplicableMatch.getObject("guard");
		EObject _localVariable_17 = isApplicableMatch.getObject("spec");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpActor = _localVariable_1;
		EObject tmpSysActor = _localVariable_2;
		EObject tmpSysLine = _localVariable_3;
		EObject tmpSysActorToSysLine = _localVariable_4;
		EObject tmpMessageSend = _localVariable_5;
		EObject tmpCombo = _localVariable_6;
		EObject tmpOperand = _localVariable_7;
		EObject tmpInteraction = _localVariable_8;
		EObject tmpFlowToInteraction = _localVariable_9;
		EObject tmpMessageReceive = _localVariable_10;
		EObject tmpFlow = _localVariable_11;
		EObject tmpUseCase = _localVariable_12;
		EObject tmpUseCaseToInteraction = _localVariable_13;
		EObject tmpActorToLine = _localVariable_14;
		EObject tmpLine = _localVariable_15;
		EObject tmpGuard = _localVariable_16;
		EObject tmpSpec = _localVariable_17;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (tmpSysActor instanceof Actor) {
					Actor sysActor = (Actor) tmpSysActor;
					if (tmpSysLine instanceof Lifeline) {
						Lifeline sysLine = (Lifeline) tmpSysLine;
						if (tmpSysActorToSysLine instanceof ActorToLifeline) {
							ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (tmpCombo instanceof CombinedFragment) {
									CombinedFragment combo = (CombinedFragment) tmpCombo;
									if (tmpOperand instanceof InteractionOperand) {
										InteractionOperand operand = (InteractionOperand) tmpOperand;
										if (tmpInteraction instanceof Interaction) {
											Interaction interaction = (Interaction) tmpInteraction;
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
																if (tmpActorToLine instanceof ActorToLifeline) {
																	ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
																	if (tmpLine instanceof Lifeline) {
																		Lifeline line = (Lifeline) tmpLine;
																		if (tmpGuard instanceof InteractionConstraint) {
																			InteractionConstraint guard = (InteractionConstraint) tmpGuard;
																			if (tmpSpec instanceof LiteralString) {
																				LiteralString spec = (LiteralString) tmpSpec;
																				return new Object[] {
																						packageDeclaration,
																						actor,
																						sysActor,
																						sysLine,
																						sysActorToSysLine,
																						messageSend,
																						combo,
																						operand,
																						interaction,
																						flowToInteraction,
																						messageReceive,
																						flow,
																						useCase,
																						useCaseToInteraction,
																						actorToLine,
																						line,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_1_blackBBBBBBBBBBBBBBBBBBFBB(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec,
			AltUserStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		if (!actor.equals(sysActor)) {
			if (!messageReceive.equals(messageSend)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					if (!line.equals(sysLine)) {
						for (EObject tmpCsp : isApplicableMatch
								.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { packageDeclaration,
										actor, sysActor, sysLine,
										sysActorToSysLine, messageSend, combo,
										operand, interaction,
										flowToInteraction, messageReceive,
										flow, useCase, useCaseToInteraction,
										actorToLine, line, guard, spec, csp,
										_this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFFFFBB(
			AltUserStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltUserStepBFToComboRule_11_1_binding = pattern_AltUserStepBFToComboRule_11_1_bindingFFFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltUserStepBFToComboRule_11_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltUserStepBFToComboRule_11_1_binding[0];
			Actor actor = (Actor) result_pattern_AltUserStepBFToComboRule_11_1_binding[1];
			Actor sysActor = (Actor) result_pattern_AltUserStepBFToComboRule_11_1_binding[2];
			Lifeline sysLine = (Lifeline) result_pattern_AltUserStepBFToComboRule_11_1_binding[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result_pattern_AltUserStepBFToComboRule_11_1_binding[4];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_AltUserStepBFToComboRule_11_1_binding[5];
			CombinedFragment combo = (CombinedFragment) result_pattern_AltUserStepBFToComboRule_11_1_binding[6];
			InteractionOperand operand = (InteractionOperand) result_pattern_AltUserStepBFToComboRule_11_1_binding[7];
			Interaction interaction = (Interaction) result_pattern_AltUserStepBFToComboRule_11_1_binding[8];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_AltUserStepBFToComboRule_11_1_binding[9];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_AltUserStepBFToComboRule_11_1_binding[10];
			BasicFlow flow = (BasicFlow) result_pattern_AltUserStepBFToComboRule_11_1_binding[11];
			UseCase useCase = (UseCase) result_pattern_AltUserStepBFToComboRule_11_1_binding[12];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltUserStepBFToComboRule_11_1_binding[13];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_AltUserStepBFToComboRule_11_1_binding[14];
			Lifeline line = (Lifeline) result_pattern_AltUserStepBFToComboRule_11_1_binding[15];
			InteractionConstraint guard = (InteractionConstraint) result_pattern_AltUserStepBFToComboRule_11_1_binding[16];
			LiteralString spec = (LiteralString) result_pattern_AltUserStepBFToComboRule_11_1_binding[17];

			Object[] result_pattern_AltUserStepBFToComboRule_11_1_black = pattern_AltUserStepBFToComboRule_11_1_blackBBBBBBBBBBBBBBBBBBFBB(
					packageDeclaration, actor, sysActor, sysLine,
					sysActorToSysLine, messageSend, combo, operand,
					interaction, flowToInteraction, messageReceive, flow,
					useCase, useCaseToInteraction, actorToLine, line, guard,
					spec, _this, isApplicableMatch);
			if (result_pattern_AltUserStepBFToComboRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_11_1_black[18];

				return new Object[] { packageDeclaration, actor, sysActor,
						sysLine, sysActorToSysLine, messageSend, combo,
						operand, interaction, flowToInteraction,
						messageReceive, flow, useCase, useCaseToInteraction,
						actorToLine, line, guard, spec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_1_greenBBBBFFFFFFB(
			Actor actor, CombinedFragment combo, InteractionOperand operand,
			BasicFlow flow, CSP csp) {
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
		return new Object[] { actor, combo, operand, flow, step, alt,
				stepToCombo, alternative1ToOperand, altFlow, altFlowToOperand,
				csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_2_blackBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, combo, operand, messageReceive,
					step, alt, stepToCombo, alternative1ToOperand, guard, spec,
					altFlow, altFlowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_2_greenFBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(messageSend);
		ruleresult.getTranslatedElements().add(combo);
		ruleresult.getTranslatedElements().add(operand);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		ruleresult.getCreatedLinkElements().add(alternative1ToOperand);
		ruleresult.getTranslatedElements().add(guard);
		ruleresult.getTranslatedElements().add(spec);
		ruleresult.getCreatedElements().add(altFlow);
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		return new Object[] { ruleresult, messageSend, combo, operand,
				messageReceive, step, alt, stepToCombo, alternative1ToOperand,
				guard, spec, altFlow, altFlowToOperand };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_11_3_blackBBBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject actor, EObject sysActor, EObject sysLine,
			EObject sysActorToSysLine, EObject messageSend, EObject combo,
			EObject operand, EObject interaction, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject actorToLine, EObject step,
			EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		if (!packageDeclaration.equals(sysActor)) {
			if (!packageDeclaration.equals(sysLine)) {
				if (!packageDeclaration.equals(sysActorToSysLine)) {
					if (!packageDeclaration.equals(useCase)) {
						if (!packageDeclaration.equals(useCaseToInteraction)) {
							if (!packageDeclaration.equals(step)) {
								if (!packageDeclaration.equals(stepToCombo)) {
									if (!packageDeclaration.equals(spec)) {
										if (!actor.equals(packageDeclaration)) {
											if (!actor.equals(sysActor)) {
												if (!actor.equals(sysLine)) {
													if (!actor
															.equals(sysActorToSysLine)) {
														if (!actor
																.equals(messageSend)) {
															if (!actor
																	.equals(combo)) {
																if (!actor
																		.equals(operand)) {
																	if (!actor
																			.equals(interaction)) {
																		if (!actor
																				.equals(flowToInteraction)) {
																			if (!actor
																					.equals(messageReceive)) {
																				if (!actor
																						.equals(flow)) {
																					if (!actor
																							.equals(useCase)) {
																						if (!actor
																								.equals(useCaseToInteraction)) {
																							if (!actor
																									.equals(actorToLine)) {
																								if (!actor
																										.equals(step)) {
																									if (!actor
																											.equals(alt)) {
																										if (!actor
																												.equals(line)) {
																											if (!actor
																													.equals(stepToCombo)) {
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
																																	if (!sysActor
																																			.equals(sysLine)) {
																																		if (!sysActor
																																				.equals(sysActorToSysLine)) {
																																			if (!sysActor
																																					.equals(useCase)) {
																																				if (!sysActor
																																						.equals(useCaseToInteraction)) {
																																					if (!sysLine
																																							.equals(useCase)) {
																																						if (!sysLine
																																								.equals(useCaseToInteraction)) {
																																							if (!sysActorToSysLine
																																									.equals(sysLine)) {
																																								if (!sysActorToSysLine
																																										.equals(useCase)) {
																																									if (!sysActorToSysLine
																																											.equals(useCaseToInteraction)) {
																																										if (!messageSend
																																												.equals(packageDeclaration)) {
																																											if (!messageSend
																																													.equals(sysActor)) {
																																												if (!messageSend
																																														.equals(sysLine)) {
																																													if (!messageSend
																																															.equals(sysActorToSysLine)) {
																																														if (!messageSend
																																																.equals(operand)) {
																																															if (!messageSend
																																																	.equals(useCase)) {
																																																if (!messageSend
																																																		.equals(useCaseToInteraction)) {
																																																	if (!messageSend
																																																			.equals(step)) {
																																																		if (!messageSend
																																																				.equals(stepToCombo)) {
																																																			if (!messageSend
																																																					.equals(spec)) {
																																																				if (!combo
																																																						.equals(packageDeclaration)) {
																																																					if (!combo
																																																							.equals(sysActor)) {
																																																						if (!combo
																																																								.equals(sysLine)) {
																																																							if (!combo
																																																									.equals(sysActorToSysLine)) {
																																																								if (!combo
																																																										.equals(messageSend)) {
																																																									if (!combo
																																																											.equals(operand)) {
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
																																																																		.equals(step)) {
																																																																	if (!combo
																																																																			.equals(line)) {
																																																																		if (!combo
																																																																				.equals(stepToCombo)) {
																																																																			if (!combo
																																																																					.equals(guard)) {
																																																																				if (!combo
																																																																						.equals(spec)) {
																																																																					if (!operand
																																																																							.equals(packageDeclaration)) {
																																																																						if (!operand
																																																																								.equals(sysActor)) {
																																																																							if (!operand
																																																																									.equals(sysLine)) {
																																																																								if (!operand
																																																																										.equals(sysActorToSysLine)) {
																																																																									if (!operand
																																																																											.equals(useCase)) {
																																																																										if (!operand
																																																																												.equals(useCaseToInteraction)) {
																																																																											if (!operand
																																																																													.equals(step)) {
																																																																												if (!operand
																																																																														.equals(stepToCombo)) {
																																																																													if (!operand
																																																																															.equals(spec)) {
																																																																														if (!interaction
																																																																																.equals(packageDeclaration)) {
																																																																															if (!interaction
																																																																																	.equals(sysActor)) {
																																																																																if (!interaction
																																																																																		.equals(sysLine)) {
																																																																																	if (!interaction
																																																																																			.equals(sysActorToSysLine)) {
																																																																																		if (!interaction
																																																																																				.equals(messageSend)) {
																																																																																			if (!interaction
																																																																																					.equals(operand)) {
																																																																																				if (!interaction
																																																																																						.equals(messageReceive)) {
																																																																																					if (!interaction
																																																																																							.equals(useCase)) {
																																																																																						if (!interaction
																																																																																								.equals(useCaseToInteraction)) {
																																																																																							if (!interaction
																																																																																									.equals(step)) {
																																																																																								if (!interaction
																																																																																										.equals(line)) {
																																																																																									if (!interaction
																																																																																											.equals(stepToCombo)) {
																																																																																										if (!interaction
																																																																																												.equals(spec)) {
																																																																																											if (!flowToInteraction
																																																																																													.equals(packageDeclaration)) {
																																																																																												if (!flowToInteraction
																																																																																														.equals(sysActor)) {
																																																																																													if (!flowToInteraction
																																																																																															.equals(sysLine)) {
																																																																																														if (!flowToInteraction
																																																																																																.equals(sysActorToSysLine)) {
																																																																																															if (!flowToInteraction
																																																																																																	.equals(messageSend)) {
																																																																																																if (!flowToInteraction
																																																																																																		.equals(operand)) {
																																																																																																	if (!flowToInteraction
																																																																																																			.equals(interaction)) {
																																																																																																		if (!flowToInteraction
																																																																																																				.equals(messageReceive)) {
																																																																																																			if (!flowToInteraction
																																																																																																					.equals(useCase)) {
																																																																																																				if (!flowToInteraction
																																																																																																						.equals(useCaseToInteraction)) {
																																																																																																					if (!flowToInteraction
																																																																																																							.equals(step)) {
																																																																																																						if (!flowToInteraction
																																																																																																								.equals(line)) {
																																																																																																							if (!flowToInteraction
																																																																																																									.equals(stepToCombo)) {
																																																																																																								if (!flowToInteraction
																																																																																																										.equals(guard)) {
																																																																																																									if (!flowToInteraction
																																																																																																											.equals(spec)) {
																																																																																																										if (!messageReceive
																																																																																																												.equals(packageDeclaration)) {
																																																																																																											if (!messageReceive
																																																																																																													.equals(sysActor)) {
																																																																																																												if (!messageReceive
																																																																																																														.equals(sysLine)) {
																																																																																																													if (!messageReceive
																																																																																																															.equals(sysActorToSysLine)) {
																																																																																																														if (!messageReceive
																																																																																																																.equals(messageSend)) {
																																																																																																															if (!messageReceive
																																																																																																																	.equals(operand)) {
																																																																																																																if (!messageReceive
																																																																																																																		.equals(useCase)) {
																																																																																																																	if (!messageReceive
																																																																																																																			.equals(useCaseToInteraction)) {
																																																																																																																		if (!messageReceive
																																																																																																																				.equals(step)) {
																																																																																																																			if (!messageReceive
																																																																																																																					.equals(stepToCombo)) {
																																																																																																																				if (!messageReceive
																																																																																																																						.equals(spec)) {
																																																																																																																					if (!flow
																																																																																																																							.equals(packageDeclaration)) {
																																																																																																																						if (!flow
																																																																																																																								.equals(sysActor)) {
																																																																																																																							if (!flow
																																																																																																																									.equals(sysLine)) {
																																																																																																																								if (!flow
																																																																																																																										.equals(sysActorToSysLine)) {
																																																																																																																									if (!flow
																																																																																																																											.equals(messageSend)) {
																																																																																																																										if (!flow
																																																																																																																												.equals(operand)) {
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
																																																																																																																																		.equals(step)) {
																																																																																																																																	if (!flow
																																																																																																																																			.equals(line)) {
																																																																																																																																		if (!flow
																																																																																																																																				.equals(stepToCombo)) {
																																																																																																																																			if (!flow
																																																																																																																																					.equals(guard)) {
																																																																																																																																				if (!flow
																																																																																																																																						.equals(spec)) {
																																																																																																																																					if (!useCase
																																																																																																																																							.equals(useCaseToInteraction)) {
																																																																																																																																						if (!actorToLine
																																																																																																																																								.equals(packageDeclaration)) {
																																																																																																																																							if (!actorToLine
																																																																																																																																									.equals(sysActor)) {
																																																																																																																																								if (!actorToLine
																																																																																																																																										.equals(sysLine)) {
																																																																																																																																									if (!actorToLine
																																																																																																																																											.equals(sysActorToSysLine)) {
																																																																																																																																										if (!actorToLine
																																																																																																																																												.equals(messageSend)) {
																																																																																																																																											if (!actorToLine
																																																																																																																																													.equals(combo)) {
																																																																																																																																												if (!actorToLine
																																																																																																																																														.equals(operand)) {
																																																																																																																																													if (!actorToLine
																																																																																																																																															.equals(interaction)) {
																																																																																																																																														if (!actorToLine
																																																																																																																																																.equals(flowToInteraction)) {
																																																																																																																																															if (!actorToLine
																																																																																																																																																	.equals(messageReceive)) {
																																																																																																																																																if (!actorToLine
																																																																																																																																																		.equals(flow)) {
																																																																																																																																																	if (!actorToLine
																																																																																																																																																			.equals(useCase)) {
																																																																																																																																																		if (!actorToLine
																																																																																																																																																				.equals(useCaseToInteraction)) {
																																																																																																																																																			if (!actorToLine
																																																																																																																																																					.equals(step)) {
																																																																																																																																																				if (!actorToLine
																																																																																																																																																						.equals(alt)) {
																																																																																																																																																					if (!actorToLine
																																																																																																																																																							.equals(line)) {
																																																																																																																																																						if (!actorToLine
																																																																																																																																																								.equals(stepToCombo)) {
																																																																																																																																																							if (!actorToLine
																																																																																																																																																									.equals(alternative1ToOperand)) {
																																																																																																																																																								if (!actorToLine
																																																																																																																																																										.equals(guard)) {
																																																																																																																																																									if (!actorToLine
																																																																																																																																																											.equals(spec)) {
																																																																																																																																																										if (!actorToLine
																																																																																																																																																												.equals(altFlow)) {
																																																																																																																																																											if (!actorToLine
																																																																																																																																																													.equals(altFlowToOperand)) {
																																																																																																																																																												if (!step
																																																																																																																																																														.equals(sysActor)) {
																																																																																																																																																													if (!step
																																																																																																																																																															.equals(sysLine)) {
																																																																																																																																																														if (!step
																																																																																																																																																																.equals(sysActorToSysLine)) {
																																																																																																																																																															if (!step
																																																																																																																																																																	.equals(useCase)) {
																																																																																																																																																																if (!step
																																																																																																																																																																		.equals(useCaseToInteraction)) {
																																																																																																																																																																	if (!step
																																																																																																																																																																			.equals(stepToCombo)) {
																																																																																																																																																																		if (!alt.equals(packageDeclaration)) {
																																																																																																																																																																			if (!alt.equals(sysActor)) {
																																																																																																																																																																				if (!alt.equals(sysLine)) {
																																																																																																																																																																					if (!alt.equals(sysActorToSysLine)) {
																																																																																																																																																																						if (!alt.equals(messageSend)) {
																																																																																																																																																																							if (!alt.equals(combo)) {
																																																																																																																																																																								if (!alt.equals(operand)) {
																																																																																																																																																																									if (!alt.equals(interaction)) {
																																																																																																																																																																										if (!alt.equals(flowToInteraction)) {
																																																																																																																																																																											if (!alt.equals(messageReceive)) {
																																																																																																																																																																												if (!alt.equals(flow)) {
																																																																																																																																																																													if (!alt.equals(useCase)) {
																																																																																																																																																																														if (!alt.equals(useCaseToInteraction)) {
																																																																																																																																																																															if (!alt.equals(step)) {
																																																																																																																																																																																if (!alt.equals(line)) {
																																																																																																																																																																																	if (!alt.equals(stepToCombo)) {
																																																																																																																																																																																		if (!alt.equals(alternative1ToOperand)) {
																																																																																																																																																																																			if (!alt.equals(guard)) {
																																																																																																																																																																																				if (!alt.equals(spec)) {
																																																																																																																																																																																					if (!alt.equals(altFlow)) {
																																																																																																																																																																																						if (!alt.equals(altFlowToOperand)) {
																																																																																																																																																																																							if (!line
																																																																																																																																																																																									.equals(packageDeclaration)) {
																																																																																																																																																																																								if (!line
																																																																																																																																																																																										.equals(sysActor)) {
																																																																																																																																																																																									if (!line
																																																																																																																																																																																											.equals(sysLine)) {
																																																																																																																																																																																										if (!line
																																																																																																																																																																																												.equals(sysActorToSysLine)) {
																																																																																																																																																																																											if (!line
																																																																																																																																																																																													.equals(messageSend)) {
																																																																																																																																																																																												if (!line
																																																																																																																																																																																														.equals(operand)) {
																																																																																																																																																																																													if (!line
																																																																																																																																																																																															.equals(messageReceive)) {
																																																																																																																																																																																														if (!line
																																																																																																																																																																																																.equals(useCase)) {
																																																																																																																																																																																															if (!line
																																																																																																																																																																																																	.equals(useCaseToInteraction)) {
																																																																																																																																																																																																if (!line
																																																																																																																																																																																																		.equals(step)) {
																																																																																																																																																																																																	if (!line
																																																																																																																																																																																																			.equals(stepToCombo)) {
																																																																																																																																																																																																		if (!line
																																																																																																																																																																																																				.equals(spec)) {
																																																																																																																																																																																																			if (!stepToCombo
																																																																																																																																																																																																					.equals(sysActor)) {
																																																																																																																																																																																																				if (!stepToCombo
																																																																																																																																																																																																						.equals(sysLine)) {
																																																																																																																																																																																																					if (!stepToCombo
																																																																																																																																																																																																							.equals(sysActorToSysLine)) {
																																																																																																																																																																																																						if (!stepToCombo
																																																																																																																																																																																																								.equals(useCase)) {
																																																																																																																																																																																																							if (!stepToCombo
																																																																																																																																																																																																									.equals(useCaseToInteraction)) {
																																																																																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																																																																																										.equals(packageDeclaration)) {
																																																																																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																																																																																											.equals(sysActor)) {
																																																																																																																																																																																																										if (!alternative1ToOperand
																																																																																																																																																																																																												.equals(sysLine)) {
																																																																																																																																																																																																											if (!alternative1ToOperand
																																																																																																																																																																																																													.equals(sysActorToSysLine)) {
																																																																																																																																																																																																												if (!alternative1ToOperand
																																																																																																																																																																																																														.equals(messageSend)) {
																																																																																																																																																																																																													if (!alternative1ToOperand
																																																																																																																																																																																																															.equals(combo)) {
																																																																																																																																																																																																														if (!alternative1ToOperand
																																																																																																																																																																																																																.equals(operand)) {
																																																																																																																																																																																																															if (!alternative1ToOperand
																																																																																																																																																																																																																	.equals(interaction)) {
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
																																																																																																																																																																																																																							.equals(step)) {
																																																																																																																																																																																																																						if (!alternative1ToOperand
																																																																																																																																																																																																																								.equals(line)) {
																																																																																																																																																																																																																							if (!alternative1ToOperand
																																																																																																																																																																																																																									.equals(stepToCombo)) {
																																																																																																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																																																																																																										.equals(guard)) {
																																																																																																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																																																																																																											.equals(spec)) {
																																																																																																																																																																																																																										if (!guard
																																																																																																																																																																																																																												.equals(packageDeclaration)) {
																																																																																																																																																																																																																											if (!guard
																																																																																																																																																																																																																													.equals(sysActor)) {
																																																																																																																																																																																																																												if (!guard
																																																																																																																																																																																																																														.equals(sysLine)) {
																																																																																																																																																																																																																													if (!guard
																																																																																																																																																																																																																															.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																														if (!guard
																																																																																																																																																																																																																																.equals(messageSend)) {
																																																																																																																																																																																																																															if (!guard
																																																																																																																																																																																																																																	.equals(operand)) {
																																																																																																																																																																																																																																if (!guard
																																																																																																																																																																																																																																		.equals(interaction)) {
																																																																																																																																																																																																																																	if (!guard
																																																																																																																																																																																																																																			.equals(messageReceive)) {
																																																																																																																																																																																																																																		if (!guard
																																																																																																																																																																																																																																				.equals(useCase)) {
																																																																																																																																																																																																																																			if (!guard
																																																																																																																																																																																																																																					.equals(useCaseToInteraction)) {
																																																																																																																																																																																																																																				if (!guard
																																																																																																																																																																																																																																						.equals(step)) {
																																																																																																																																																																																																																																					if (!guard
																																																																																																																																																																																																																																							.equals(line)) {
																																																																																																																																																																																																																																						if (!guard
																																																																																																																																																																																																																																								.equals(stepToCombo)) {
																																																																																																																																																																																																																																							if (!guard
																																																																																																																																																																																																																																									.equals(spec)) {
																																																																																																																																																																																																																																								if (!spec
																																																																																																																																																																																																																																										.equals(sysActor)) {
																																																																																																																																																																																																																																									if (!spec
																																																																																																																																																																																																																																											.equals(sysLine)) {
																																																																																																																																																																																																																																										if (!spec
																																																																																																																																																																																																																																												.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																																											if (!spec
																																																																																																																																																																																																																																													.equals(useCase)) {
																																																																																																																																																																																																																																												if (!spec
																																																																																																																																																																																																																																														.equals(useCaseToInteraction)) {
																																																																																																																																																																																																																																													if (!spec
																																																																																																																																																																																																																																															.equals(step)) {
																																																																																																																																																																																																																																														if (!spec
																																																																																																																																																																																																																																																.equals(stepToCombo)) {
																																																																																																																																																																																																																																															if (!altFlow
																																																																																																																																																																																																																																																	.equals(packageDeclaration)) {
																																																																																																																																																																																																																																																if (!altFlow
																																																																																																																																																																																																																																																		.equals(sysActor)) {
																																																																																																																																																																																																																																																	if (!altFlow
																																																																																																																																																																																																																																																			.equals(sysLine)) {
																																																																																																																																																																																																																																																		if (!altFlow
																																																																																																																																																																																																																																																				.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																																																			if (!altFlow
																																																																																																																																																																																																																																																					.equals(messageSend)) {
																																																																																																																																																																																																																																																				if (!altFlow
																																																																																																																																																																																																																																																						.equals(combo)) {
																																																																																																																																																																																																																																																					if (!altFlow
																																																																																																																																																																																																																																																							.equals(operand)) {
																																																																																																																																																																																																																																																						if (!altFlow
																																																																																																																																																																																																																																																								.equals(interaction)) {
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
																																																																																																																																																																																																																																																														.equals(step)) {
																																																																																																																																																																																																																																																													if (!altFlow
																																																																																																																																																																																																																																																															.equals(line)) {
																																																																																																																																																																																																																																																														if (!altFlow
																																																																																																																																																																																																																																																																.equals(stepToCombo)) {
																																																																																																																																																																																																																																																															if (!altFlow
																																																																																																																																																																																																																																																																	.equals(alternative1ToOperand)) {
																																																																																																																																																																																																																																																																if (!altFlow
																																																																																																																																																																																																																																																																		.equals(guard)) {
																																																																																																																																																																																																																																																																	if (!altFlow
																																																																																																																																																																																																																																																																			.equals(spec)) {
																																																																																																																																																																																																																																																																		if (!altFlow
																																																																																																																																																																																																																																																																				.equals(altFlowToOperand)) {
																																																																																																																																																																																																																																																																			if (!altFlowToOperand
																																																																																																																																																																																																																																																																					.equals(packageDeclaration)) {
																																																																																																																																																																																																																																																																				if (!altFlowToOperand
																																																																																																																																																																																																																																																																						.equals(sysActor)) {
																																																																																																																																																																																																																																																																					if (!altFlowToOperand
																																																																																																																																																																																																																																																																							.equals(sysLine)) {
																																																																																																																																																																																																																																																																						if (!altFlowToOperand
																																																																																																																																																																																																																																																																								.equals(sysActorToSysLine)) {
																																																																																																																																																																																																																																																																							if (!altFlowToOperand
																																																																																																																																																																																																																																																																									.equals(messageSend)) {
																																																																																																																																																																																																																																																																								if (!altFlowToOperand
																																																																																																																																																																																																																																																																										.equals(combo)) {
																																																																																																																																																																																																																																																																									if (!altFlowToOperand
																																																																																																																																																																																																																																																																											.equals(operand)) {
																																																																																																																																																																																																																																																																										if (!altFlowToOperand
																																																																																																																																																																																																																																																																												.equals(interaction)) {
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
																																																																																																																																																																																																																																																																																		.equals(step)) {
																																																																																																																																																																																																																																																																																	if (!altFlowToOperand
																																																																																																																																																																																																																																																																																			.equals(line)) {
																																																																																																																																																																																																																																																																																		if (!altFlowToOperand
																																																																																																																																																																																																																																																																																				.equals(stepToCombo)) {
																																																																																																																																																																																																																																																																																			if (!altFlowToOperand
																																																																																																																																																																																																																																																																																					.equals(alternative1ToOperand)) {
																																																																																																																																																																																																																																																																																				if (!altFlowToOperand
																																																																																																																																																																																																																																																																																						.equals(guard)) {
																																																																																																																																																																																																																																																																																					if (!altFlowToOperand
																																																																																																																																																																																																																																																																																							.equals(spec)) {
																																																																																																																																																																																																																																																																																						return new Object[] {
																																																																																																																																																																																																																																																																																								ruleresult,
																																																																																																																																																																																																																																																																																								packageDeclaration,
																																																																																																																																																																																																																																																																																								actor,
																																																																																																																																																																																																																																																																																								sysActor,
																																																																																																																																																																																																																																																																																								sysLine,
																																																																																																																																																																																																																																																																																								sysActorToSysLine,
																																																																																																																																																																																																																																																																																								messageSend,
																																																																																																																																																																																																																																																																																								combo,
																																																																																																																																																																																																																																																																																								operand,
																																																																																																																																																																																																																																																																																								interaction,
																																																																																																																																																																																																																																																																																								flowToInteraction,
																																																																																																																																																																																																																																																																																								messageReceive,
																																																																																																																																																																																																																																																																																								flow,
																																																																																																																																																																																																																																																																																								useCase,
																																																																																																																																																																																																																																																																																								useCaseToInteraction,
																																																																																																																																																																																																																																																																																								actorToLine,
																																																																																																																																																																																																																																																																																								step,
																																																																																																																																																																																																																																																																																								alt,
																																																																																																																																																																																																																																																																																								line,
																																																																																																																																																																																																																																																																																								stepToCombo,
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
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltUserStepBFToComboRule_11_3_greenBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject sysLine,
			EObject messageSend, EObject combo, EObject operand,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
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
		String ruleresult_ruleName_prime = "AltUserStepBFToComboRule";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
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
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(messageSend__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		ruleresult.getTranslatedEdges().add(sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(combo__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		ruleresult.getTranslatedEdges().add(sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(operand__sysLine____covered);
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
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
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
		return new Object[] { ruleresult, actor, sysLine, messageSend, combo,
				operand, interaction, messageReceive, flow, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand, sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment, flow__step____steps,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref, line__combo____coveredBy,
				combo__line____covered, line__operand____coveredBy,
				operand__line____covered, stepToCombo__step____source,
				stepToCombo__combo____target, operand__guard____guard,
				alternative1ToOperand__alt____source,
				alternative1ToOperand__operand____target,
				guard__spec____specification,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target };
	}

	public static final void pattern_AltUserStepBFToComboRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject actor, EObject sysActor,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject combo, EObject operand, EObject interaction,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction, EObject actorToLine,
			EObject step, EObject alt, EObject line, EObject stepToCombo,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		_this.registerObjects_BWD(ruleresult, packageDeclaration, actor,
				sysActor, sysLine, sysActorToSysLine, messageSend, combo,
				operand, interaction, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, actorToLine, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand);

	}

	public static final PerformRuleResult pattern_AltUserStepBFToComboRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_1_blackFBB(
			EClass eClass, AltUserStepBFToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_12_1_binding = pattern_AltUserStepBFToComboRule_12_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltUserStepBFToComboRule_12_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_12_1_black = pattern_AltUserStepBFToComboRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltUserStepBFToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_2_bindingFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("sysLine");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("combo");
		EObject _localVariable_3 = match.getObject("operand");
		EObject _localVariable_4 = match.getObject("interaction");
		EObject _localVariable_5 = match.getObject("messageReceive");
		EObject _localVariable_6 = match.getObject("line");
		EObject _localVariable_7 = match.getObject("guard");
		EObject _localVariable_8 = match.getObject("spec");
		EObject tmpSysLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpCombo = _localVariable_2;
		EObject tmpOperand = _localVariable_3;
		EObject tmpInteraction = _localVariable_4;
		EObject tmpMessageReceive = _localVariable_5;
		EObject tmpLine = _localVariable_6;
		EObject tmpGuard = _localVariable_7;
		EObject tmpSpec = _localVariable_8;
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpCombo instanceof CombinedFragment) {
					CombinedFragment combo = (CombinedFragment) tmpCombo;
					if (tmpOperand instanceof InteractionOperand) {
						InteractionOperand operand = (InteractionOperand) tmpOperand;
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (tmpLine instanceof Lifeline) {
									Lifeline line = (Lifeline) tmpLine;
									if (tmpGuard instanceof InteractionConstraint) {
										InteractionConstraint guard = (InteractionConstraint) tmpGuard;
										if (tmpSpec instanceof LiteralString) {
											LiteralString spec = (LiteralString) tmpSpec;
											return new Object[] { sysLine,
													messageSend, combo,
													operand, interaction,
													messageReceive, line,
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
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_12_2_blackFFBFBBBBFBFFFFBBBB(
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			CombinedFragment combo, InteractionOperand operand,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				for (ActorToLifeline sysActorToSysLine : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(sysLine,
								ActorToLifeline.class, "target")) {
					Actor sysActor = sysActorToSysLine.getSource();
					if (sysActor != null) {
						for (FlowToInteractionFragment flowToInteraction : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(interaction,
										FlowToInteractionFragment.class,
										"target")) {
							Flow tmpFlow = flowToInteraction.getSource();
							if (tmpFlow instanceof BasicFlow) {
								BasicFlow flow = (BasicFlow) tmpFlow;
								for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(interaction,
												UseCaseToInteraction.class,
												"target")) {
									UseCase useCase = useCaseToInteraction
											.getSource();
									if (useCase != null) {
										for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														line,
														ActorToLifeline.class,
														"target")) {
											if (!actorToLine
													.equals(sysActorToSysLine)) {
												Actor actor = actorToLine
														.getSource();
												if (actor != null) {
													if (!actor.equals(sysActor)) {
														_result.add(new Object[] {
																actor,
																sysActor,
																sysLine,
																sysActorToSysLine,
																messageSend,
																combo,
																operand,
																interaction,
																flowToInteraction,
																messageReceive,
																flow,
																useCase,
																useCaseToInteraction,
																actorToLine,
																line, guard,
																spec, match });
													}
												}

											}
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

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_12_3_blackFBBBBBBBBBBBBBBBBB(
			Actor actor, Actor sysActor, Lifeline sysLine,
			ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			if (!messageReceive.equals(messageSend)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					if (!line.equals(sysLine)) {
						if (sysLine.getCoveredBy().contains(messageSend)) {
							if (sysLine.getCoveredBy().contains(combo)) {
								if (sysLine.getCoveredBy().contains(operand)) {
									if (sysActor.equals(sysActorToSysLine
											.getSource())) {
										if (sysLine.equals(sysActorToSysLine
												.getTarget())) {
											if (interaction.equals(combo
													.getEnclosingInteraction())) {
												if (interaction
														.equals(messageSend
																.getEnclosingInteraction())) {
													if (interaction
															.equals(messageReceive
																	.getEnclosingInteraction())) {
														if (flow.equals(flowToInteraction
																.getSource())) {
															if (interaction
																	.equals(flowToInteraction
																			.getTarget())) {
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
																				if (actor
																						.equals(actorToLine
																								.getSource())) {
																					if (line.equals(actorToLine
																							.getTarget())) {
																						if (line.getCoveredBy()
																								.contains(
																										combo)) {
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
																														actor,
																														PackageDeclaration.class,
																														"actors")) {
																											if (packageDeclaration
																													.getActors()
																													.contains(
																															sysActor)) {
																												if (packageDeclaration
																														.getUseCases()
																														.contains(
																																useCase)) {
																													_result.add(new Object[] {
																															packageDeclaration,
																															actor,
																															sysActor,
																															sysLine,
																															sysActorToSysLine,
																															messageSend,
																															combo,
																															operand,
																															interaction,
																															flowToInteraction,
																															messageReceive,
																															flow,
																															useCase,
																															useCaseToInteraction,
																															actorToLine,
																															line,
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
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_3_greenBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysActor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysLine____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
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
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
		String sysActorToSysLine__sysActor____source_name_prime = "source";
		String sysActorToSysLine__sysLine____target_name_prime = "target";
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
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(sysActor);
		isApplicableMatch.getAllContextElements().add(sysLine);
		isApplicableMatch.getAllContextElements().add(sysActorToSysLine);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(guard);
		isApplicableMatch.getAllContextElements().add(spec);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__sysActor____actors);
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				messageSend__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements()
				.add(combo__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				operand__sysLine____covered);
		sysActorToSysLine__sysActor____source.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysActor____source.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysActor____source);
		sysActorToSysLine__sysLine____target.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysLine____target.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysLine____target);
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
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
		sysActorToSysLine__sysActor____source
				.setName(sysActorToSysLine__sysActor____source_name_prime);
		sysActorToSysLine__sysLine____target
				.setName(sysActorToSysLine__sysLine____target_name_prime);
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
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { packageDeclaration, actor, sysActor, sysLine,
				sysActorToSysLine, messageSend, combo, operand, interaction,
				flowToInteraction, messageReceive, flow, useCase,
				useCaseToInteraction, actorToLine, line, guard, spec,
				isApplicableMatch, packageDeclaration__actor____actors,
				packageDeclaration__sysActor____actors,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered,
				sysActorToSysLine__sysActor____source,
				sysActorToSysLine__sysLine____target,
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
				actorToLine__actor____source, actorToLine__line____target,
				line__combo____coveredBy, combo__line____covered,
				line__operand____coveredBy, operand__line____covered,
				operand__guard____guard, guard__spec____specification };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_4_bindingFBBBBBBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, actor, sysActor,
				sysLine, sysActorToSysLine, messageSend, combo, operand,
				interaction, flowToInteraction, messageReceive, flow, useCase,
				useCaseToInteraction, actorToLine, line, guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, actor, sysActor, sysLine,
					sysActorToSysLine, messageSend, combo, operand,
					interaction, flowToInteraction, messageReceive, flow,
					useCase, useCaseToInteraction, actorToLine, line, guard,
					spec };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_AltUserStepBFToComboRule_12_4_binding = pattern_AltUserStepBFToComboRule_12_4_bindingFBBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, actor, sysActor,
				sysLine, sysActorToSysLine, messageSend, combo, operand,
				interaction, flowToInteraction, messageReceive, flow, useCase,
				useCaseToInteraction, actorToLine, line, guard, spec);
		if (result_pattern_AltUserStepBFToComboRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_12_4_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_12_4_black = pattern_AltUserStepBFToComboRule_12_4_blackB(csp);
			if (result_pattern_AltUserStepBFToComboRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, actor, sysActor, sysLine,
						sysActorToSysLine, messageSend, combo, operand,
						interaction, flowToInteraction, messageReceive, flow,
						useCase, useCaseToInteraction, actorToLine, line,
						guard, spec };
			}
		}
		return null;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_12_5_expressionFBB(
			AltUserStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltUserStepBFToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltUserStepBFToComboRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_20_1_binding = pattern_AltUserStepBFToComboRule_20_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_20_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_20_1_black = pattern_AltUserStepBFToComboRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_39002 = messageSend.getMessage();
		if (__DEC_messageSend_message_39002 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_585317 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_585317 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_585317)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_153826 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_153826)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_717237 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_717237 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_765393 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_765393)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_20_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpMessageSend = _edge_coveredBy.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (sysLine.getCoveredBy().contains(messageSend)) {
					Interaction interaction = messageSend
							.getEnclosingInteraction();
					if (interaction != null) {
						if (pattern_AltUserStepBFToComboRule_20_2_black_nac_0B(messageSend) == null) {
							for (InteractionFragment tmpCombo : sysLine
									.getCoveredBy()) {
								if (tmpCombo instanceof CombinedFragment) {
									CombinedFragment combo = (CombinedFragment) tmpCombo;
									if (interaction.equals(combo
											.getEnclosingInteraction())) {
										for (InteractionFragment tmpOperand : sysLine
												.getCoveredBy()) {
											if (tmpOperand instanceof InteractionOperand) {
												InteractionOperand operand = (InteractionOperand) tmpOperand;
												InteractionConstraint guard = operand
														.getGuard();
												if (guard != null) {
													ValueSpecification tmpSpec = guard
															.getSpecification();
													if (tmpSpec instanceof LiteralString) {
														LiteralString spec = (LiteralString) tmpSpec;
														if (pattern_AltUserStepBFToComboRule_20_2_black_nac_1BB(
																operand,
																interaction) == null) {
															if (pattern_AltUserStepBFToComboRule_20_2_black_nac_2BB(
																	operand,
																	combo) == null) {
																if (pattern_AltUserStepBFToComboRule_20_2_black_nac_5BB(
																		operand,
																		messageSend) == null) {
																	if (pattern_AltUserStepBFToComboRule_20_2_black_nac_6BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltUserStepBFToComboRule_20_2_black_nac_7BB(
																				operand,
																				interaction) == null) {
																			if (pattern_AltUserStepBFToComboRule_20_2_black_nac_8BB(
																					combo,
																					operand) == null) {
																				if (pattern_AltUserStepBFToComboRule_20_2_black_nac_4BB(
																						guard,
																						operand) == null) {
																					for (InteractionFragment tmpMessageReceive : interaction
																							.getFragment()) {
																						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																							if (!messageReceive
																									.equals(messageSend)) {
																								if (pattern_AltUserStepBFToComboRule_20_2_black_nac_3B(messageReceive) == null) {
																									if (pattern_AltUserStepBFToComboRule_20_2_black_nac_9BB(
																											operand,
																											messageReceive) == null) {
																										for (Lifeline line : interaction
																												.getLifeline()) {
																											if (!line
																													.equals(sysLine)) {
																												if (line.getCoveredBy()
																														.contains(
																																combo)) {
																													if (line.getCoveredBy()
																															.contains(
																																	operand)) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_20_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_20_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_21_1_binding = pattern_AltUserStepBFToComboRule_21_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_21_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_21_1_black = pattern_AltUserStepBFToComboRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_34813 = messageSend.getMessage();
		if (__DEC_messageSend_message_34813 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_389872 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_389872 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_389872)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_274844 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_274844)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_493179 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_493179 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_551135 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_551135)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_21_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(messageSend)) {
					Interaction interaction = messageSend
							.getEnclosingInteraction();
					if (interaction != null) {
						if (pattern_AltUserStepBFToComboRule_21_2_black_nac_0B(messageSend) == null) {
							for (InteractionFragment tmpCombo : sysLine
									.getCoveredBy()) {
								if (tmpCombo instanceof CombinedFragment) {
									CombinedFragment combo = (CombinedFragment) tmpCombo;
									if (interaction.equals(combo
											.getEnclosingInteraction())) {
										for (InteractionFragment tmpOperand : sysLine
												.getCoveredBy()) {
											if (tmpOperand instanceof InteractionOperand) {
												InteractionOperand operand = (InteractionOperand) tmpOperand;
												InteractionConstraint guard = operand
														.getGuard();
												if (guard != null) {
													ValueSpecification tmpSpec = guard
															.getSpecification();
													if (tmpSpec instanceof LiteralString) {
														LiteralString spec = (LiteralString) tmpSpec;
														if (pattern_AltUserStepBFToComboRule_21_2_black_nac_1BB(
																operand,
																interaction) == null) {
															if (pattern_AltUserStepBFToComboRule_21_2_black_nac_2BB(
																	operand,
																	combo) == null) {
																if (pattern_AltUserStepBFToComboRule_21_2_black_nac_5BB(
																		operand,
																		messageSend) == null) {
																	if (pattern_AltUserStepBFToComboRule_21_2_black_nac_6BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltUserStepBFToComboRule_21_2_black_nac_7BB(
																				operand,
																				interaction) == null) {
																			if (pattern_AltUserStepBFToComboRule_21_2_black_nac_8BB(
																					combo,
																					operand) == null) {
																				if (pattern_AltUserStepBFToComboRule_21_2_black_nac_4BB(
																						guard,
																						operand) == null) {
																					for (InteractionFragment tmpMessageReceive : interaction
																							.getFragment()) {
																						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																							if (!messageReceive
																									.equals(messageSend)) {
																								if (pattern_AltUserStepBFToComboRule_21_2_black_nac_3B(messageReceive) == null) {
																									if (pattern_AltUserStepBFToComboRule_21_2_black_nac_9BB(
																											operand,
																											messageReceive) == null) {
																										for (Lifeline line : interaction
																												.getLifeline()) {
																											if (!line
																													.equals(sysLine)) {
																												if (line.getCoveredBy()
																														.contains(
																																combo)) {
																													if (line.getCoveredBy()
																															.contains(
																																	operand)) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_21_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_21_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_22_1_binding = pattern_AltUserStepBFToComboRule_22_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_22_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_22_1_black = pattern_AltUserStepBFToComboRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_125767 = messageSend.getMessage();
		if (__DEC_messageSend_message_125767 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_952773 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_952773 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_952773)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_604323 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_604323)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_2661 = messageReceive.getMessage();
		if (__DEC_messageReceive_message_2661 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_119697 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_119697)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_22_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpCombo = _edge_coveredBy.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (sysLine.getCoveredBy().contains(combo)) {
					Interaction interaction = combo.getEnclosingInteraction();
					if (interaction != null) {
						for (InteractionFragment tmpMessageSend : sysLine
								.getCoveredBy()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (interaction.equals(messageSend
										.getEnclosingInteraction())) {
									if (pattern_AltUserStepBFToComboRule_22_2_black_nac_0B(messageSend) == null) {
										for (InteractionFragment tmpOperand : sysLine
												.getCoveredBy()) {
											if (tmpOperand instanceof InteractionOperand) {
												InteractionOperand operand = (InteractionOperand) tmpOperand;
												InteractionConstraint guard = operand
														.getGuard();
												if (guard != null) {
													ValueSpecification tmpSpec = guard
															.getSpecification();
													if (tmpSpec instanceof LiteralString) {
														LiteralString spec = (LiteralString) tmpSpec;
														if (pattern_AltUserStepBFToComboRule_22_2_black_nac_1BB(
																operand,
																interaction) == null) {
															if (pattern_AltUserStepBFToComboRule_22_2_black_nac_2BB(
																	operand,
																	combo) == null) {
																if (pattern_AltUserStepBFToComboRule_22_2_black_nac_5BB(
																		operand,
																		messageSend) == null) {
																	if (pattern_AltUserStepBFToComboRule_22_2_black_nac_6BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltUserStepBFToComboRule_22_2_black_nac_7BB(
																				operand,
																				interaction) == null) {
																			if (pattern_AltUserStepBFToComboRule_22_2_black_nac_8BB(
																					combo,
																					operand) == null) {
																				if (pattern_AltUserStepBFToComboRule_22_2_black_nac_4BB(
																						guard,
																						operand) == null) {
																					for (Lifeline line : combo
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (interaction
																									.equals(line
																											.getInteraction())) {
																								if (line.getCoveredBy()
																										.contains(
																												operand)) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_22_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_22_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_22_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_22_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_23_1_binding = pattern_AltUserStepBFToComboRule_23_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_23_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_23_1_black = pattern_AltUserStepBFToComboRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_675275 = messageSend.getMessage();
		if (__DEC_messageSend_message_675275 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_604504 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_604504 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_604504)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_170063 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_170063)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_2427 = messageReceive.getMessage();
		if (__DEC_messageReceive_message_2427 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_427755 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_427755)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_23_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_covered.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(combo)) {
					Interaction interaction = combo.getEnclosingInteraction();
					if (interaction != null) {
						for (Lifeline line : combo.getCovered()) {
							if (!line.equals(sysLine)) {
								if (interaction.equals(line.getInteraction())) {
									for (InteractionFragment tmpMessageSend : sysLine
											.getCoveredBy()) {
										if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
											if (interaction.equals(messageSend
													.getEnclosingInteraction())) {
												if (pattern_AltUserStepBFToComboRule_23_2_black_nac_0B(messageSend) == null) {
													for (InteractionFragment tmpOperand : sysLine
															.getCoveredBy()) {
														if (tmpOperand instanceof InteractionOperand) {
															InteractionOperand operand = (InteractionOperand) tmpOperand;
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
																		if (pattern_AltUserStepBFToComboRule_23_2_black_nac_1BB(
																				operand,
																				interaction) == null) {
																			if (pattern_AltUserStepBFToComboRule_23_2_black_nac_2BB(
																					operand,
																					combo) == null) {
																				if (pattern_AltUserStepBFToComboRule_23_2_black_nac_5BB(
																						operand,
																						messageSend) == null) {
																					if (pattern_AltUserStepBFToComboRule_23_2_black_nac_6BB(
																							operand,
																							combo) == null) {
																						if (pattern_AltUserStepBFToComboRule_23_2_black_nac_7BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_23_2_black_nac_8BB(
																									combo,
																									operand) == null) {
																								if (pattern_AltUserStepBFToComboRule_23_2_black_nac_4BB(
																										guard,
																										operand) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_23_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_23_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_23_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_23_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_24_1_binding = pattern_AltUserStepBFToComboRule_24_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_24_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_24_1_black = pattern_AltUserStepBFToComboRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_49241 = messageSend.getMessage();
		if (__DEC_messageSend_message_49241 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_600969 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_600969 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_600969)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_751906 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_751906)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_262 = messageReceive.getMessage();
		if (__DEC_messageReceive_message_262 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_146540 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_146540)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_24_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpOperand = _edge_coveredBy.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (sysLine.getCoveredBy().contains(operand)) {
					InteractionConstraint guard = operand.getGuard();
					if (guard != null) {
						ValueSpecification tmpSpec = guard.getSpecification();
						if (tmpSpec instanceof LiteralString) {
							LiteralString spec = (LiteralString) tmpSpec;
							if (pattern_AltUserStepBFToComboRule_24_2_black_nac_4BB(
									guard, operand) == null) {
								for (InteractionFragment tmpMessageSend : sysLine
										.getCoveredBy()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										Interaction interaction = messageSend
												.getEnclosingInteraction();
										if (interaction != null) {
											if (pattern_AltUserStepBFToComboRule_24_2_black_nac_0B(messageSend) == null) {
												if (pattern_AltUserStepBFToComboRule_24_2_black_nac_5BB(
														operand, messageSend) == null) {
													if (pattern_AltUserStepBFToComboRule_24_2_black_nac_1BB(
															operand,
															interaction) == null) {
														if (pattern_AltUserStepBFToComboRule_24_2_black_nac_7BB(
																operand,
																interaction) == null) {
															for (InteractionFragment tmpCombo : sysLine
																	.getCoveredBy()) {
																if (tmpCombo instanceof CombinedFragment) {
																	CombinedFragment combo = (CombinedFragment) tmpCombo;
																	if (interaction
																			.equals(combo
																					.getEnclosingInteraction())) {
																		if (pattern_AltUserStepBFToComboRule_24_2_black_nac_2BB(
																				operand,
																				combo) == null) {
																			if (pattern_AltUserStepBFToComboRule_24_2_black_nac_6BB(
																					operand,
																					combo) == null) {
																				if (pattern_AltUserStepBFToComboRule_24_2_black_nac_8BB(
																						combo,
																						operand) == null) {
																					for (Lifeline line : operand
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (interaction
																									.equals(line
																											.getInteraction())) {
																								if (line.getCoveredBy()
																										.contains(
																												combo)) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_24_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_24_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_24_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_24_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_25_1_binding = pattern_AltUserStepBFToComboRule_25_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_25_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_25_1_black = pattern_AltUserStepBFToComboRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_278201 = messageSend.getMessage();
		if (__DEC_messageSend_message_278201 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_946036 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_946036 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_946036)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_951601 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_951601)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_309715 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_309715 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_709716 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_709716)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_25_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_covered.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(operand)) {
					InteractionConstraint guard = operand.getGuard();
					if (guard != null) {
						ValueSpecification tmpSpec = guard.getSpecification();
						if (tmpSpec instanceof LiteralString) {
							LiteralString spec = (LiteralString) tmpSpec;
							if (pattern_AltUserStepBFToComboRule_25_2_black_nac_4BB(
									guard, operand) == null) {
								for (Lifeline line : operand.getCovered()) {
									if (!line.equals(sysLine)) {
										Interaction interaction = line
												.getInteraction();
										if (interaction != null) {
											if (pattern_AltUserStepBFToComboRule_25_2_black_nac_1BB(
													operand, interaction) == null) {
												if (pattern_AltUserStepBFToComboRule_25_2_black_nac_7BB(
														operand, interaction) == null) {
													for (InteractionFragment tmpMessageSend : sysLine
															.getCoveredBy()) {
														if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
															MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
															if (interaction
																	.equals(messageSend
																			.getEnclosingInteraction())) {
																if (pattern_AltUserStepBFToComboRule_25_2_black_nac_0B(messageSend) == null) {
																	if (pattern_AltUserStepBFToComboRule_25_2_black_nac_5BB(
																			operand,
																			messageSend) == null) {
																		for (InteractionFragment tmpCombo : sysLine
																				.getCoveredBy()) {
																			if (tmpCombo instanceof CombinedFragment) {
																				CombinedFragment combo = (CombinedFragment) tmpCombo;
																				if (interaction
																						.equals(combo
																								.getEnclosingInteraction())) {
																					if (line.getCoveredBy()
																							.contains(
																									combo)) {
																						if (pattern_AltUserStepBFToComboRule_25_2_black_nac_2BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltUserStepBFToComboRule_25_2_black_nac_6BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_25_2_black_nac_8BB(
																										combo,
																										operand) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_25_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_25_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_25_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_25_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_26_1_binding = pattern_AltUserStepBFToComboRule_26_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_26_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_26_1_black = pattern_AltUserStepBFToComboRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_629622 = messageSend.getMessage();
		if (__DEC_messageSend_message_629622 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_905484 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_905484 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_905484)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_860305 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_860305)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_264970 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_264970 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_646418 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_646418)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_26_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_enclosingInteraction.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					for (Lifeline sysLine : combo.getCovered()) {
						for (Lifeline line : combo.getCovered()) {
							if (!line.equals(sysLine)) {
								if (interaction.equals(line.getInteraction())) {
									for (InteractionFragment tmpMessageSend : interaction
											.getFragment()) {
										if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
											if (sysLine.getCoveredBy()
													.contains(messageSend)) {
												if (pattern_AltUserStepBFToComboRule_26_2_black_nac_0B(messageSend) == null) {
													for (InteractionFragment tmpMessageReceive : interaction
															.getFragment()) {
														if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
															MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
															if (!messageReceive
																	.equals(messageSend)) {
																if (pattern_AltUserStepBFToComboRule_26_2_black_nac_3B(messageReceive) == null) {
																	for (InteractionFragment tmpOperand : sysLine
																			.getCoveredBy()) {
																		if (tmpOperand instanceof InteractionOperand) {
																			InteractionOperand operand = (InteractionOperand) tmpOperand;
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
																						if (pattern_AltUserStepBFToComboRule_26_2_black_nac_1BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_26_2_black_nac_2BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_26_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									if (pattern_AltUserStepBFToComboRule_26_2_black_nac_6BB(
																											operand,
																											combo) == null) {
																										if (pattern_AltUserStepBFToComboRule_26_2_black_nac_7BB(
																												operand,
																												interaction) == null) {
																											if (pattern_AltUserStepBFToComboRule_26_2_black_nac_8BB(
																													combo,
																													operand) == null) {
																												if (pattern_AltUserStepBFToComboRule_26_2_black_nac_9BB(
																														operand,
																														messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_26_2_black_nac_4BB(
																															guard,
																															operand) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_26_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_26_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_27_1_binding = pattern_AltUserStepBFToComboRule_27_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_27_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_27_1_black = pattern_AltUserStepBFToComboRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_590351 = messageSend.getMessage();
		if (__DEC_messageSend_message_590351 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_712353 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_712353 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_712353)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_823757 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_823757)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_95878 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_95878 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_699452 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_699452)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_27_2_blackFFFFFFFFFB(
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
							if (pattern_AltUserStepBFToComboRule_27_2_black_nac_0B(messageSend) == null) {
								for (InteractionFragment tmpMessageReceive : interaction
										.getFragment()) {
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltUserStepBFToComboRule_27_2_black_nac_3B(messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(combo)) {
														for (Lifeline sysLine : combo
																.getCovered()) {
															if (!line
																	.equals(sysLine)) {
																if (sysLine
																		.getCoveredBy()
																		.contains(
																				messageSend)) {
																	for (InteractionFragment tmpOperand : line
																			.getCoveredBy()) {
																		if (tmpOperand instanceof InteractionOperand) {
																			InteractionOperand operand = (InteractionOperand) tmpOperand;
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							operand)) {
																				InteractionConstraint guard = operand
																						.getGuard();
																				if (guard != null) {
																					ValueSpecification tmpSpec = guard
																							.getSpecification();
																					if (tmpSpec instanceof LiteralString) {
																						LiteralString spec = (LiteralString) tmpSpec;
																						if (pattern_AltUserStepBFToComboRule_27_2_black_nac_1BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_27_2_black_nac_2BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_27_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									if (pattern_AltUserStepBFToComboRule_27_2_black_nac_6BB(
																											operand,
																											combo) == null) {
																										if (pattern_AltUserStepBFToComboRule_27_2_black_nac_7BB(
																												operand,
																												interaction) == null) {
																											if (pattern_AltUserStepBFToComboRule_27_2_black_nac_8BB(
																													combo,
																													operand) == null) {
																												if (pattern_AltUserStepBFToComboRule_27_2_black_nac_9BB(
																														operand,
																														messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_27_2_black_nac_4BB(
																															guard,
																															operand) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_27_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_27_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_28_1_binding = pattern_AltUserStepBFToComboRule_28_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_28_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_28_1_black = pattern_AltUserStepBFToComboRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_759226 = messageSend.getMessage();
		if (__DEC_messageSend_message_759226 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_963704 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_963704 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_963704)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_805099 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_805099)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_963142 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_963142 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_228639 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_228639)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_28_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_enclosingInteraction.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					if (pattern_AltUserStepBFToComboRule_28_2_black_nac_0B(messageSend) == null) {
						for (Lifeline sysLine : messageSend.getCovered()) {
							for (InteractionFragment tmpCombo : interaction
									.getFragment()) {
								if (tmpCombo instanceof CombinedFragment) {
									CombinedFragment combo = (CombinedFragment) tmpCombo;
									if (sysLine.getCoveredBy().contains(combo)) {
										for (InteractionFragment tmpMessageReceive : interaction
												.getFragment()) {
											if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
												MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
												if (!messageReceive
														.equals(messageSend)) {
													if (pattern_AltUserStepBFToComboRule_28_2_black_nac_3B(messageReceive) == null) {
														for (Lifeline line : interaction
																.getLifeline()) {
															if (!line
																	.equals(sysLine)) {
																if (line.getCoveredBy()
																		.contains(
																				combo)) {
																	for (InteractionFragment tmpOperand : sysLine
																			.getCoveredBy()) {
																		if (tmpOperand instanceof InteractionOperand) {
																			InteractionOperand operand = (InteractionOperand) tmpOperand;
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
																						if (pattern_AltUserStepBFToComboRule_28_2_black_nac_1BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_28_2_black_nac_2BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_28_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									if (pattern_AltUserStepBFToComboRule_28_2_black_nac_6BB(
																											operand,
																											combo) == null) {
																										if (pattern_AltUserStepBFToComboRule_28_2_black_nac_7BB(
																												operand,
																												interaction) == null) {
																											if (pattern_AltUserStepBFToComboRule_28_2_black_nac_8BB(
																													combo,
																													operand) == null) {
																												if (pattern_AltUserStepBFToComboRule_28_2_black_nac_9BB(
																														operand,
																														messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_28_2_black_nac_4BB(
																															guard,
																															operand) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_28_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_28_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_29_1_binding = pattern_AltUserStepBFToComboRule_29_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_29_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_29_1_black = pattern_AltUserStepBFToComboRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_149839 = messageSend.getMessage();
		if (__DEC_messageSend_message_149839 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_208787 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_208787 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_208787)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_845356 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_845356)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_653663 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_653663 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_399325 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_399325)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_29_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessageSend = _edge_fragment.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					if (pattern_AltUserStepBFToComboRule_29_2_black_nac_0B(messageSend) == null) {
						for (InteractionFragment tmpCombo : interaction
								.getFragment()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								for (InteractionFragment tmpMessageReceive : interaction
										.getFragment()) {
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltUserStepBFToComboRule_29_2_black_nac_3B(messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(combo)) {
														for (Lifeline sysLine : messageSend
																.getCovered()) {
															if (!line
																	.equals(sysLine)) {
																if (sysLine
																		.getCoveredBy()
																		.contains(
																				combo)) {
																	for (InteractionFragment tmpOperand : line
																			.getCoveredBy()) {
																		if (tmpOperand instanceof InteractionOperand) {
																			InteractionOperand operand = (InteractionOperand) tmpOperand;
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							operand)) {
																				InteractionConstraint guard = operand
																						.getGuard();
																				if (guard != null) {
																					ValueSpecification tmpSpec = guard
																							.getSpecification();
																					if (tmpSpec instanceof LiteralString) {
																						LiteralString spec = (LiteralString) tmpSpec;
																						if (pattern_AltUserStepBFToComboRule_29_2_black_nac_1BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_29_2_black_nac_2BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_29_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									if (pattern_AltUserStepBFToComboRule_29_2_black_nac_6BB(
																											operand,
																											combo) == null) {
																										if (pattern_AltUserStepBFToComboRule_29_2_black_nac_7BB(
																												operand,
																												interaction) == null) {
																											if (pattern_AltUserStepBFToComboRule_29_2_black_nac_8BB(
																													combo,
																													operand) == null) {
																												if (pattern_AltUserStepBFToComboRule_29_2_black_nac_9BB(
																														operand,
																														messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_29_2_black_nac_4BB(
																															guard,
																															operand) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_29_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_29_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_30_1_binding = pattern_AltUserStepBFToComboRule_30_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_30_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_30_1_black = pattern_AltUserStepBFToComboRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_403460 = messageSend.getMessage();
		if (__DEC_messageSend_message_403460 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_228608 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_228608 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_228608)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_121572 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_121572)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_436034 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_436034 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_656047 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_656047)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_30_2_blackFFFFFFFFFB(
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
					if (pattern_AltUserStepBFToComboRule_30_2_black_nac_3B(messageReceive) == null) {
						for (InteractionFragment tmpCombo : interaction
								.getFragment()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								for (InteractionFragment tmpMessageSend : interaction
										.getFragment()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltUserStepBFToComboRule_30_2_black_nac_0B(messageSend) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(combo)) {
														for (Lifeline sysLine : combo
																.getCovered()) {
															if (!line
																	.equals(sysLine)) {
																if (sysLine
																		.getCoveredBy()
																		.contains(
																				messageSend)) {
																	for (InteractionFragment tmpOperand : line
																			.getCoveredBy()) {
																		if (tmpOperand instanceof InteractionOperand) {
																			InteractionOperand operand = (InteractionOperand) tmpOperand;
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							operand)) {
																				InteractionConstraint guard = operand
																						.getGuard();
																				if (guard != null) {
																					ValueSpecification tmpSpec = guard
																							.getSpecification();
																					if (tmpSpec instanceof LiteralString) {
																						LiteralString spec = (LiteralString) tmpSpec;
																						if (pattern_AltUserStepBFToComboRule_30_2_black_nac_1BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_30_2_black_nac_2BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_30_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									if (pattern_AltUserStepBFToComboRule_30_2_black_nac_6BB(
																											operand,
																											combo) == null) {
																										if (pattern_AltUserStepBFToComboRule_30_2_black_nac_7BB(
																												operand,
																												interaction) == null) {
																											if (pattern_AltUserStepBFToComboRule_30_2_black_nac_8BB(
																													combo,
																													operand) == null) {
																												if (pattern_AltUserStepBFToComboRule_30_2_black_nac_9BB(
																														operand,
																														messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_30_2_black_nac_4BB(
																															guard,
																															operand) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_30_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_30_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_31_1_binding = pattern_AltUserStepBFToComboRule_31_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_31_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_31_1_black = pattern_AltUserStepBFToComboRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_412110 = messageSend.getMessage();
		if (__DEC_messageSend_message_412110 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_506912 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_506912 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_506912)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_102601 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_102601)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_576203 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_576203 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_981347 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_981347)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_31_2_blackFFFFFFFFFB(
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
					if (pattern_AltUserStepBFToComboRule_31_2_black_nac_3B(messageReceive) == null) {
						for (InteractionFragment tmpCombo : interaction
								.getFragment()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								for (InteractionFragment tmpMessageSend : interaction
										.getFragment()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltUserStepBFToComboRule_31_2_black_nac_0B(messageSend) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(combo)) {
														for (Lifeline sysLine : combo
																.getCovered()) {
															if (!line
																	.equals(sysLine)) {
																if (sysLine
																		.getCoveredBy()
																		.contains(
																				messageSend)) {
																	for (InteractionFragment tmpOperand : line
																			.getCoveredBy()) {
																		if (tmpOperand instanceof InteractionOperand) {
																			InteractionOperand operand = (InteractionOperand) tmpOperand;
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							operand)) {
																				InteractionConstraint guard = operand
																						.getGuard();
																				if (guard != null) {
																					ValueSpecification tmpSpec = guard
																							.getSpecification();
																					if (tmpSpec instanceof LiteralString) {
																						LiteralString spec = (LiteralString) tmpSpec;
																						if (pattern_AltUserStepBFToComboRule_31_2_black_nac_1BB(
																								operand,
																								interaction) == null) {
																							if (pattern_AltUserStepBFToComboRule_31_2_black_nac_2BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_31_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									if (pattern_AltUserStepBFToComboRule_31_2_black_nac_6BB(
																											operand,
																											combo) == null) {
																										if (pattern_AltUserStepBFToComboRule_31_2_black_nac_7BB(
																												operand,
																												interaction) == null) {
																											if (pattern_AltUserStepBFToComboRule_31_2_black_nac_8BB(
																													combo,
																													operand) == null) {
																												if (pattern_AltUserStepBFToComboRule_31_2_black_nac_9BB(
																														operand,
																														messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_31_2_black_nac_4BB(
																															guard,
																															operand) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_31_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_31_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_32_1_binding = pattern_AltUserStepBFToComboRule_32_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_32_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_32_1_black = pattern_AltUserStepBFToComboRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_32_2_blackFFFFFFFFB(
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
									if (pattern_AltUserStepBFToComboRule_32_2_black_nac_0BB(
											altFlow, step) == null) {
										for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														flow, UseCase.class,
														"flows")) {
											if (pattern_AltUserStepBFToComboRule_32_2_black_nac_1BB(
													useCase, altFlow) == null) {
												for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																actor,
																PackageDeclaration.class,
																"actors")) {
													if (packageDeclaration
															.getUseCases()
															.contains(useCase)) {
														for (Actor sysActor : packageDeclaration
																.getActors()) {
															if (!actor
																	.equals(sysActor)) {
																_result.add(new Object[] {
																		packageDeclaration,
																		actor,
																		sysActor,
																		flow,
																		useCase,
																		step,
																		alt,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_32_3_expressionFBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, actor, sysActor, flow, useCase, step, alt,
				altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_32_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_33_1_binding = pattern_AltUserStepBFToComboRule_33_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_33_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_33_1_black = pattern_AltUserStepBFToComboRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_33_2_blackFFFFFFFFB(
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
							if (pattern_AltUserStepBFToComboRule_33_2_black_nac_0BB(
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
											for (Actor sysActor : packageDeclaration
													.getActors()) {
												if (!actor.equals(sysActor)) {
													for (UseCase useCase : packageDeclaration
															.getUseCases()) {
														if (useCase.getFlows()
																.contains(flow)) {
															if (pattern_AltUserStepBFToComboRule_33_2_black_nac_1BB(
																	useCase,
																	altFlow) == null) {
																_result.add(new Object[] {
																		packageDeclaration,
																		actor,
																		sysActor,
																		flow,
																		useCase,
																		step,
																		alt,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_33_3_expressionFBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, actor, sysActor, flow, useCase, step, alt,
				altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_33_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_34_1_binding = pattern_AltUserStepBFToComboRule_34_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_34_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_34_1_black = pattern_AltUserStepBFToComboRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_34_2_blackFFFFFFFFB(
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
								if (pattern_AltUserStepBFToComboRule_34_2_black_nac_0BB(
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
												for (Actor sysActor : packageDeclaration
														.getActors()) {
													if (!actor.equals(sysActor)) {
														for (UseCase useCase : packageDeclaration
																.getUseCases()) {
															if (useCase
																	.getFlows()
																	.contains(
																			flow)) {
																if (pattern_AltUserStepBFToComboRule_34_2_black_nac_1BB(
																		useCase,
																		altFlow) == null) {
																	_result.add(new Object[] {
																			packageDeclaration,
																			actor,
																			sysActor,
																			flow,
																			useCase,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_34_3_expressionFBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, actor, sysActor, flow, useCase, step, alt,
				altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_34_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_35_1_binding = pattern_AltUserStepBFToComboRule_35_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_35_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_35_1_black = pattern_AltUserStepBFToComboRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_35_2_blackFFFFFFFFB(
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
							if (pattern_AltUserStepBFToComboRule_35_2_black_nac_0BB(
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
											for (Actor sysActor : packageDeclaration
													.getActors()) {
												if (!actor.equals(sysActor)) {
													for (UseCase useCase : packageDeclaration
															.getUseCases()) {
														if (useCase.getFlows()
																.contains(flow)) {
															if (pattern_AltUserStepBFToComboRule_35_2_black_nac_1BB(
																	useCase,
																	altFlow) == null) {
																_result.add(new Object[] {
																		packageDeclaration,
																		actor,
																		sysActor,
																		flow,
																		useCase,
																		step,
																		alt,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_35_3_expressionFBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			BasicFlow flow, UseCase useCase, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, actor, sysActor, flow, useCase, step, alt,
				altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_35_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_36_1_binding = pattern_AltUserStepBFToComboRule_36_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_36_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_36_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_36_1_black = pattern_AltUserStepBFToComboRule_36_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_36_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_36_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_125920 = messageSend.getMessage();
		if (__DEC_messageSend_message_125920 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_453330 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_453330 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_453330)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_131925 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_131925)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_695499 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_695499 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_506906 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_506906)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_36_2_blackFFFFFFFFFB(
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
							for (InteractionFragment tmpOperand : line
									.getCoveredBy()) {
								if (tmpOperand instanceof InteractionOperand) {
									InteractionOperand operand = (InteractionOperand) tmpOperand;
									InteractionConstraint guard = operand
											.getGuard();
									if (guard != null) {
										ValueSpecification tmpSpec = guard
												.getSpecification();
										if (tmpSpec instanceof LiteralString) {
											LiteralString spec = (LiteralString) tmpSpec;
											if (pattern_AltUserStepBFToComboRule_36_2_black_nac_1BB(
													operand, interaction) == null) {
												if (pattern_AltUserStepBFToComboRule_36_2_black_nac_2BB(
														operand, combo) == null) {
													if (pattern_AltUserStepBFToComboRule_36_2_black_nac_6BB(
															operand, combo) == null) {
														if (pattern_AltUserStepBFToComboRule_36_2_black_nac_7BB(
																operand,
																interaction) == null) {
															if (pattern_AltUserStepBFToComboRule_36_2_black_nac_8BB(
																	combo,
																	operand) == null) {
																if (pattern_AltUserStepBFToComboRule_36_2_black_nac_4BB(
																		guard,
																		operand) == null) {
																	for (Lifeline sysLine : combo
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							operand)) {
																				for (InteractionFragment tmpMessageSend : interaction
																						.getFragment()) {
																					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																						if (sysLine
																								.getCoveredBy()
																								.contains(
																										messageSend)) {
																							if (pattern_AltUserStepBFToComboRule_36_2_black_nac_0B(messageSend) == null) {
																								if (pattern_AltUserStepBFToComboRule_36_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_36_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_36_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_36_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_36_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_36_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_36_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_37_1_binding = pattern_AltUserStepBFToComboRule_37_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_37_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_37_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_37_1_black = pattern_AltUserStepBFToComboRule_37_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_37_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_37_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_218776 = messageSend.getMessage();
		if (__DEC_messageSend_message_218776 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_521099 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_521099 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_521099)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_346304 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_346304)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_76360 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_76360 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_683856 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_683856)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_37_2_blackFFFFFFFFFB(
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
							for (Lifeline sysLine : combo.getCovered()) {
								if (!line.equals(sysLine)) {
									for (InteractionFragment tmpOperand : line
											.getCoveredBy()) {
										if (tmpOperand instanceof InteractionOperand) {
											InteractionOperand operand = (InteractionOperand) tmpOperand;
											if (sysLine.getCoveredBy()
													.contains(operand)) {
												InteractionConstraint guard = operand
														.getGuard();
												if (guard != null) {
													ValueSpecification tmpSpec = guard
															.getSpecification();
													if (tmpSpec instanceof LiteralString) {
														LiteralString spec = (LiteralString) tmpSpec;
														if (pattern_AltUserStepBFToComboRule_37_2_black_nac_1BB(
																operand,
																interaction) == null) {
															if (pattern_AltUserStepBFToComboRule_37_2_black_nac_2BB(
																	operand,
																	combo) == null) {
																if (pattern_AltUserStepBFToComboRule_37_2_black_nac_6BB(
																		operand,
																		combo) == null) {
																	if (pattern_AltUserStepBFToComboRule_37_2_black_nac_7BB(
																			operand,
																			interaction) == null) {
																		if (pattern_AltUserStepBFToComboRule_37_2_black_nac_8BB(
																				combo,
																				operand) == null) {
																			if (pattern_AltUserStepBFToComboRule_37_2_black_nac_4BB(
																					guard,
																					operand) == null) {
																				for (InteractionFragment tmpMessageSend : interaction
																						.getFragment()) {
																					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																						if (sysLine
																								.getCoveredBy()
																								.contains(
																										messageSend)) {
																							if (pattern_AltUserStepBFToComboRule_37_2_black_nac_0B(messageSend) == null) {
																								if (pattern_AltUserStepBFToComboRule_37_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_37_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_37_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_37_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_37_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_37_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_37_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_38_1_binding = pattern_AltUserStepBFToComboRule_38_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_38_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_38_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_38_1_black = pattern_AltUserStepBFToComboRule_38_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_38_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_38_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_959307 = messageSend.getMessage();
		if (__DEC_messageSend_message_959307 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_928459 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_928459 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_928459)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_592842 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_592842)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_270891 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_270891 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_896497 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_896497)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_38_2_blackFFFFFFFFFB(
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
								if (pattern_AltUserStepBFToComboRule_38_2_black_nac_1BB(
										operand, interaction) == null) {
									if (pattern_AltUserStepBFToComboRule_38_2_black_nac_7BB(
											operand, interaction) == null) {
										if (pattern_AltUserStepBFToComboRule_38_2_black_nac_4BB(
												guard, operand) == null) {
											for (InteractionFragment tmpCombo : line
													.getCoveredBy()) {
												if (tmpCombo instanceof CombinedFragment) {
													CombinedFragment combo = (CombinedFragment) tmpCombo;
													if (interaction
															.equals(combo
																	.getEnclosingInteraction())) {
														if (pattern_AltUserStepBFToComboRule_38_2_black_nac_2BB(
																operand, combo) == null) {
															if (pattern_AltUserStepBFToComboRule_38_2_black_nac_6BB(
																	operand,
																	combo) == null) {
																if (pattern_AltUserStepBFToComboRule_38_2_black_nac_8BB(
																		combo,
																		operand) == null) {
																	for (Lifeline sysLine : operand
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							combo)) {
																				for (InteractionFragment tmpMessageSend : interaction
																						.getFragment()) {
																					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																						if (sysLine
																								.getCoveredBy()
																								.contains(
																										messageSend)) {
																							if (pattern_AltUserStepBFToComboRule_38_2_black_nac_0B(messageSend) == null) {
																								if (pattern_AltUserStepBFToComboRule_38_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_38_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_38_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_38_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_38_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_38_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_38_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_39_1_binding = pattern_AltUserStepBFToComboRule_39_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_39_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_39_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_39_1_black = pattern_AltUserStepBFToComboRule_39_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_39_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_39_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_194932 = messageSend.getMessage();
		if (__DEC_messageSend_message_194932 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_436719 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_436719 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_436719)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_554304 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_554304)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_372095 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_372095 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_180175 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_180175)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_39_2_blackFFFFFFFFFB(
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
								if (pattern_AltUserStepBFToComboRule_39_2_black_nac_4BB(
										guard, operand) == null) {
									if (pattern_AltUserStepBFToComboRule_39_2_black_nac_1BB(
											operand, interaction) == null) {
										if (pattern_AltUserStepBFToComboRule_39_2_black_nac_7BB(
												operand, interaction) == null) {
											for (Lifeline sysLine : operand
													.getCovered()) {
												if (!line.equals(sysLine)) {
													for (InteractionFragment tmpCombo : line
															.getCoveredBy()) {
														if (tmpCombo instanceof CombinedFragment) {
															CombinedFragment combo = (CombinedFragment) tmpCombo;
															if (sysLine
																	.getCoveredBy()
																	.contains(
																			combo)) {
																if (interaction
																		.equals(combo
																				.getEnclosingInteraction())) {
																	if (pattern_AltUserStepBFToComboRule_39_2_black_nac_2BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltUserStepBFToComboRule_39_2_black_nac_6BB(
																				operand,
																				combo) == null) {
																			if (pattern_AltUserStepBFToComboRule_39_2_black_nac_8BB(
																					combo,
																					operand) == null) {
																				for (InteractionFragment tmpMessageSend : interaction
																						.getFragment()) {
																					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																						if (sysLine
																								.getCoveredBy()
																								.contains(
																										messageSend)) {
																							if (pattern_AltUserStepBFToComboRule_39_2_black_nac_0B(messageSend) == null) {
																								if (pattern_AltUserStepBFToComboRule_39_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_39_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_39_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_39_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_39_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_39_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_39_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_40_1_binding = pattern_AltUserStepBFToComboRule_40_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_40_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_40_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_40_1_black = pattern_AltUserStepBFToComboRule_40_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_40_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_40_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_375572 = messageSend.getMessage();
		if (__DEC_messageSend_message_375572 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_355324 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_355324 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_355324)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_190799 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_190799)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_427539 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_427539 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_149442 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_149442)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_40_2_blackFFFFFFFFFB(
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
						if (pattern_AltUserStepBFToComboRule_40_2_black_nac_4BB(
								guard, operand) == null) {
							for (Lifeline sysLine : operand.getCovered()) {
								for (Lifeline line : operand.getCovered()) {
									if (!line.equals(sysLine)) {
										Interaction interaction = line
												.getInteraction();
										if (interaction != null) {
											if (pattern_AltUserStepBFToComboRule_40_2_black_nac_1BB(
													operand, interaction) == null) {
												if (pattern_AltUserStepBFToComboRule_40_2_black_nac_7BB(
														operand, interaction) == null) {
													for (InteractionFragment tmpMessageSend : sysLine
															.getCoveredBy()) {
														if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
															MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
															if (interaction
																	.equals(messageSend
																			.getEnclosingInteraction())) {
																if (pattern_AltUserStepBFToComboRule_40_2_black_nac_0B(messageSend) == null) {
																	if (pattern_AltUserStepBFToComboRule_40_2_black_nac_5BB(
																			operand,
																			messageSend) == null) {
																		for (InteractionFragment tmpCombo : sysLine
																				.getCoveredBy()) {
																			if (tmpCombo instanceof CombinedFragment) {
																				CombinedFragment combo = (CombinedFragment) tmpCombo;
																				if (interaction
																						.equals(combo
																								.getEnclosingInteraction())) {
																					if (line.getCoveredBy()
																							.contains(
																									combo)) {
																						if (pattern_AltUserStepBFToComboRule_40_2_black_nac_2BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltUserStepBFToComboRule_40_2_black_nac_6BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_40_2_black_nac_8BB(
																										combo,
																										operand) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_40_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_40_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_40_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_40_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_40_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_40_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_1_bindingFB(
			AltUserStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_1_blackFBB(
			EClass __eClass, AltUserStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_1_bindingAndBlackFFB(
			AltUserStepBFToComboRule _this) {
		Object[] result_pattern_AltUserStepBFToComboRule_41_1_binding = pattern_AltUserStepBFToComboRule_41_1_bindingFB(_this);
		if (result_pattern_AltUserStepBFToComboRule_41_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltUserStepBFToComboRule_41_1_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_41_1_black = pattern_AltUserStepBFToComboRule_41_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltUserStepBFToComboRule_41_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltUserStepBFToComboRule_41_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_47816 = messageSend.getMessage();
		if (__DEC_messageSend_message_47816 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_1BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_352672 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_352672 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_352672)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_2BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_579168 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_579168)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_3B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_576106 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_576106 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_752971 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_752971)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_7BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_8BB(
			CombinedFragment combo, InteractionOperand operand) {
		if (combo.getOperand().contains(operand)) {
			return new Object[] { combo, operand };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_black_nac_9BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_41_2_blackFFFFFFFFFB(
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
						if (pattern_AltUserStepBFToComboRule_41_2_black_nac_4BB(
								guard, operand) == null) {
							for (Lifeline sysLine : operand.getCovered()) {
								for (Lifeline line : operand.getCovered()) {
									if (!line.equals(sysLine)) {
										Interaction interaction = line
												.getInteraction();
										if (interaction != null) {
											if (pattern_AltUserStepBFToComboRule_41_2_black_nac_1BB(
													operand, interaction) == null) {
												if (pattern_AltUserStepBFToComboRule_41_2_black_nac_7BB(
														operand, interaction) == null) {
													for (InteractionFragment tmpMessageSend : sysLine
															.getCoveredBy()) {
														if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
															MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
															if (interaction
																	.equals(messageSend
																			.getEnclosingInteraction())) {
																if (pattern_AltUserStepBFToComboRule_41_2_black_nac_0B(messageSend) == null) {
																	if (pattern_AltUserStepBFToComboRule_41_2_black_nac_5BB(
																			operand,
																			messageSend) == null) {
																		for (InteractionFragment tmpCombo : sysLine
																				.getCoveredBy()) {
																			if (tmpCombo instanceof CombinedFragment) {
																				CombinedFragment combo = (CombinedFragment) tmpCombo;
																				if (interaction
																						.equals(combo
																								.getEnclosingInteraction())) {
																					if (line.getCoveredBy()
																							.contains(
																									combo)) {
																						if (pattern_AltUserStepBFToComboRule_41_2_black_nac_2BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltUserStepBFToComboRule_41_2_black_nac_6BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltUserStepBFToComboRule_41_2_black_nac_8BB(
																										combo,
																										operand) == null) {
																									for (InteractionFragment tmpMessageReceive : interaction
																											.getFragment()) {
																										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																											if (!messageReceive
																													.equals(messageSend)) {
																												if (pattern_AltUserStepBFToComboRule_41_2_black_nac_3B(messageReceive) == null) {
																													if (pattern_AltUserStepBFToComboRule_41_2_black_nac_9BB(
																															operand,
																															messageReceive) == null) {
																														_result.add(new Object[] {
																																sysLine,
																																messageSend,
																																combo,
																																operand,
																																interaction,
																																messageReceive,
																																line,
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

		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltUserStepBFToComboRule_41_3_expressionFBBBBBBBBBBB(
			AltUserStepBFToComboRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			InteractionOperand operand, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, combo, operand, interaction, messageReceive, line,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_41_4_expressionFBB(
			AltUserStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_41_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltUserStepBFToComboRule_41_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_1_blackB(
			AltUserStepBFToComboRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToInteraction) {
		if (ruleResult.getCorrObjects().contains(flowToInteraction)) {
			return new Object[] { ruleResult, flowToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Actor sysActor) {
		if (ruleResult.getSourceObjects().contains(sysActor)) {
			return new Object[] { ruleResult, sysActor };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult,
			ActorToLifeline sysActorToSysLine) {
		if (ruleResult.getCorrObjects().contains(sysActorToSysLine)) {
			return new Object[] { ruleResult, sysActorToSysLine };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult, Lifeline sysLine) {
		if (ruleResult.getTargetObjects().contains(sysLine)) {
			return new Object[] { ruleResult, sysLine };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltUserStepBFToComboRule_44_2_blackFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList actorToLineList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpActorToLine : actorToLineList.getEntryObjects()) {
				if (tmpActorToLine instanceof ActorToLifeline) {
					ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
					Actor actor = actorToLine.getSource();
					if (actor != null) {
						Lifeline line = actorToLine.getTarget();
						if (line != null) {
							Interaction interaction = line.getInteraction();
							if (interaction != null) {
								if (pattern_AltUserStepBFToComboRule_44_2_black_nac_2BB(
										ruleResult, actorToLine) == null) {
									if (pattern_AltUserStepBFToComboRule_44_2_black_nac_1BB(
											ruleResult, actor) == null) {
										if (pattern_AltUserStepBFToComboRule_44_2_black_nac_3BB(
												ruleResult, line) == null) {
											if (pattern_AltUserStepBFToComboRule_44_2_black_nac_4BB(
													ruleResult, interaction) == null) {
												for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																actor,
																PackageDeclaration.class,
																"actors")) {
													if (pattern_AltUserStepBFToComboRule_44_2_black_nac_0BB(
															ruleResult,
															packageDeclaration) == null) {
														for (UseCase useCase : packageDeclaration
																.getUseCases()) {
															if (pattern_AltUserStepBFToComboRule_44_2_black_nac_7BB(
																	ruleResult,
																	useCase) == null) {
																for (Actor sysActor : packageDeclaration
																		.getActors()) {
																	if (!actor
																			.equals(sysActor)) {
																		if (pattern_AltUserStepBFToComboRule_44_2_black_nac_9BB(
																				ruleResult,
																				sysActor) == null) {
																			for (Flow tmpFlow : useCase
																					.getFlows()) {
																				if (tmpFlow instanceof BasicFlow) {
																					BasicFlow flow = (BasicFlow) tmpFlow;
																					if (pattern_AltUserStepBFToComboRule_44_2_black_nac_6BB(
																							ruleResult,
																							flow) == null) {
																						for (FlowToInteractionFragment flowToInteraction : org.moflon.util.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										interaction,
																										FlowToInteractionFragment.class,
																										"target")) {
																							if (flow.equals(flowToInteraction
																									.getSource())) {
																								if (pattern_AltUserStepBFToComboRule_44_2_black_nac_5BB(
																										ruleResult,
																										flowToInteraction) == null) {
																									for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													interaction,
																													UseCaseToInteraction.class,
																													"target")) {
																										if (useCase
																												.equals(useCaseToInteraction
																														.getSource())) {
																											if (pattern_AltUserStepBFToComboRule_44_2_black_nac_8BB(
																													ruleResult,
																													useCaseToInteraction) == null) {
																												for (ActorToLifeline sysActorToSysLine : org.moflon.util.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																sysActor,
																																ActorToLifeline.class,
																																"source")) {
																													if (!actorToLine
																															.equals(sysActorToSysLine)) {
																														Lifeline sysLine = sysActorToSysLine
																																.getTarget();
																														if (sysLine != null) {
																															if (!line
																																	.equals(sysLine)) {
																																if (pattern_AltUserStepBFToComboRule_44_2_black_nac_10BB(
																																		ruleResult,
																																		sysActorToSysLine) == null) {
																																	if (pattern_AltUserStepBFToComboRule_44_2_black_nac_11BB(
																																			ruleResult,
																																			sysLine) == null) {
																																		_result.add(new Object[] {
																																				actorToLineList,
																																				packageDeclaration,
																																				actor,
																																				actorToLine,
																																				line,
																																				interaction,
																																				flowToInteraction,
																																				flow,
																																				useCase,
																																				useCaseToInteraction,
																																				sysActor,
																																				sysActorToSysLine,
																																				sysLine,
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
		}
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_3_bindingFBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, actor, sysActor,
				sysLine, sysActorToSysLine, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, actorToLine, line,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, actor, sysActor, sysLine,
					sysActorToSysLine, interaction, flowToInteraction, flow,
					useCase, useCaseToInteraction, actorToLine, line,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_3_bindingAndBlackFBBBBBBBBBBBBBBB(
			AltUserStepBFToComboRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AltUserStepBFToComboRule_44_3_binding = pattern_AltUserStepBFToComboRule_44_3_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, actor, sysActor,
				sysLine, sysActorToSysLine, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, actorToLine, line,
				ruleResult);
		if (result_pattern_AltUserStepBFToComboRule_44_3_binding != null) {
			CSP csp = (CSP) result_pattern_AltUserStepBFToComboRule_44_3_binding[0];

			Object[] result_pattern_AltUserStepBFToComboRule_44_3_black = pattern_AltUserStepBFToComboRule_44_3_blackB(csp);
			if (result_pattern_AltUserStepBFToComboRule_44_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, actor, sysActor, sysLine,
						sysActorToSysLine, interaction, flowToInteraction,
						flow, useCase, useCaseToInteraction, actorToLine, line,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AltUserStepBFToComboRule_44_4_expressionFBB(
			AltUserStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_5_blackBBBBBBBBBBBB(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line) {
		if (!actor.equals(sysActor)) {
			if (!actorToLine.equals(sysActorToSysLine)) {
				if (!line.equals(sysLine)) {
					return new Object[] { packageDeclaration, actor, sysActor,
							sysLine, sysActorToSysLine, interaction,
							flowToInteraction, flow, useCase,
							useCaseToInteraction, actorToLine, line };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_6_blackBBBBBBBBBBBBB(
			PackageDeclaration packageDeclaration, Actor actor, Actor sysActor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		if (!actor.equals(sysActor)) {
			if (!actorToLine.equals(sysActorToSysLine)) {
				if (!line.equals(sysLine)) {
					return new Object[] { packageDeclaration, actor, sysActor,
							sysLine, sysActorToSysLine, interaction,
							flowToInteraction, flow, useCase,
							useCaseToInteraction, actorToLine, line, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltUserStepBFToComboRule_44_6_greenBBFFFBFBFFBFFFFFFBB(
			Actor actor, Lifeline sysLine, Interaction interaction,
			BasicFlow flow, Lifeline line, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
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
		sysLine.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(messageSend);
		sysLine.getCoveredBy().add(combo);
		combo.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(combo);
		ruleResult.getTargetObjects().add(combo);
		sysLine.getCoveredBy().add(operand);
		line.getCoveredBy().add(operand);
		ruleResult.getTargetObjects().add(operand);
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
		return new Object[] { actor, sysLine, messageSend, combo, operand,
				interaction, messageReceive, flow, step, alt, line,
				stepToCombo, alternative1ToOperand, guard, spec, altFlow,
				altFlowToOperand, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AltUserStepBFToComboRule_44_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltUserStepBFToComboRuleImpl
