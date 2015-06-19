/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageKind;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.MessageSort;
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
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;

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
 * An implementation of the model object '<em><b>User Step Nf To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserStepNfToMessageRuleImpl extends AbstractRuleImpl implements
		UserStepNfToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStepNfToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUserStepNfToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		// initial bindings
		Object[] result1_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_0_1_blackBBBBBBBB(this, match,
						packageDeclaration, sysActor, actor, flow, step,
						useCase);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[useCase] = "
							+ useCase + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_0_2_bindingAndBlackFBBBBBBBB(
						this, match, packageDeclaration, sysActor, actor, flow,
						step, useCase);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[useCase] = "
							+ useCase + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_4_blackBBBBBBB(match,
							packageDeclaration, sysActor, actor, flow, step,
							useCase);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration + ", " + "[sysActor] = "
								+ sysActor + ", " + "[actor] = " + actor + ", "
								+ "[flow] = " + flow + ", " + "[step] = "
								+ step + ", " + "[useCase] = " + useCase + ".");
			}
			UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_4_greenBBBBFF(match,
							actor, flow, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_5_blackBBBBBBB(match,
							packageDeclaration, sysActor, actor, flow, step,
							useCase);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration + ", " + "[sysActor] = "
								+ sysActor + ", " + "[actor] = " + actor + ", "
								+ "[flow] = " + flow + ", " + "[step] = "
								+ step + ", " + "[useCase] = " + useCase + ".");
			}
			UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_5_greenBBBBBBFFFF(match,
							packageDeclaration, sysActor, actor, flow, useCase);
			// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[7];
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[8];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[9];

			// register objects to match
			UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_6_expressionBBBBBBBB(
							this, match, packageDeclaration, sysActor, actor,
							flow, step, useCase);
			return UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_7_expressionF();
		} else {
			return UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		Actor sysActor = (Actor) result1_bindingAndBlack[1];
		Actor actor = (Actor) result1_bindingAndBlack[2];
		Lifeline sysLine = (Lifeline) result1_bindingAndBlack[3];
		ActorToLifeline sysActorToSysLine = (ActorToLifeline) result1_bindingAndBlack[4];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[5];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[6];
		NamedFlow flow = (NamedFlow) result1_bindingAndBlack[7];
		FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result1_bindingAndBlack[8];
		Lifeline line = (Lifeline) result1_bindingAndBlack[9];
		NormalStep step = (NormalStep) result1_bindingAndBlack[10];
		UseCase useCase = (UseCase) result1_bindingAndBlack[11];
		Interaction interaction = (Interaction) result1_bindingAndBlack[12];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[13];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[14];
		CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_1_greenBFBBFBFBB(sysLine,
						operand, combo, line, interaction, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[4];
		Message message = (Message) result1_green[6];

		// collect translated elements
		Object[] result2_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_2_blackBBBB(messageSend,
						messageReceive, step, message);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[messageSend] = " + messageSend
							+ ", " + "[messageReceive] = " + messageReceive
							+ ", " + "[step] = " + step + ", " + "[message] = "
							+ message + ".");
		}
		Object[] result2_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_2_greenFBBBB(messageSend,
						messageReceive, step, message);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_3_blackBBBBBBBBBBBBBBBBBBB(
						ruleresult, packageDeclaration, sysActor, actor,
						sysLine, messageSend, sysActorToSysLine, operand,
						combo, flow, flowToOperand, messageReceive, line, step,
						message, useCase, interaction, useCaseToInteraction,
						actorToLine);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[sysActorToSysLine] = "
							+ sysActorToSysLine
							+ ", "
							+ "[operand] = "
							+ operand
							+ ", "
							+ "[combo] = "
							+ combo
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[flowToOperand] = "
							+ flowToOperand
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine + ".");
		}
		UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, sysLine, messageSend, operand,
						combo, flow, messageReceive, line, step, message,
						interaction);
		// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[12];
		// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[13];
		// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result3_green[14];
		// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result3_green[15];
		// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result3_green[16];
		// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result3_green[17];
		// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result3_green[18];
		// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result3_green[19];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[22];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[23];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[24];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[25];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[26];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[27];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[28];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[29];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[30];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[31];

		// perform postprocessing story node is empty
		// register objects
		UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_5_expressionBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, packageDeclaration, sysActor, actor,
						sysLine, messageSend, sysActorToSysLine, operand,
						combo, flow, flowToOperand, messageReceive, line, step,
						message, useCase, interaction, useCaseToInteraction,
						actorToLine);
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		Actor sysActor = (Actor) result2_binding[1];
		Actor actor = (Actor) result2_binding[2];
		NamedFlow flow = (NamedFlow) result2_binding[3];
		NormalStep step = (NormalStep) result2_binding[4];
		UseCase useCase = (UseCase) result2_binding[5];
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_2_2_blackBBBFFFBFFBBFFFB(
						packageDeclaration, sysActor, actor, flow, step,
						useCase, match)) {
			Lifeline sysLine = (Lifeline) result2_black[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result2_black[7];
			Lifeline line = (Lifeline) result2_black[8];
			Interaction interaction = (Interaction) result2_black[11];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[12];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[13];
			// ForEach find context
			for (Object[] result3_black : UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_2_3_blackBBBBBBFBBBBBBBB(
							packageDeclaration, sysActor, actor, sysLine,
							sysActorToSysLine, operand, flow, flowToOperand,
							line, step, useCase, interaction,
							useCaseToInteraction, actorToLine)) {
				CombinedFragment combo = (CombinedFragment) result3_black[6];
				Object[] result3_green = UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_2_3_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
								packageDeclaration, sysActor, actor, sysLine,
								sysActorToSysLine, operand, combo, flow,
								flowToOperand, line, step, useCase,
								interaction, useCaseToInteraction, actorToLine);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result3_green[16];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sysActorToSysLine__sysActor____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sysActorToSysLine__sysLine____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[20];
				// EMoflonEdge flowToOperand__flow____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge flowToOperand__operand____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[23];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[24];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[25];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[27];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[28];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[29];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[30];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[31];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[32];

				// solve CSP
				Object[] result4_bindingAndBlack = UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								sysActor, actor, sysLine, sysActorToSysLine,
								operand, combo, flow, flowToOperand, line,
								step, useCase, interaction,
								useCaseToInteraction, actorToLine);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[sysActor] = "
									+ sysActor
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[sysLine] = "
									+ sysLine
									+ ", "
									+ "[sysActorToSysLine] = "
									+ sysActorToSysLine
									+ ", "
									+ "[operand] = "
									+ operand
									+ ", "
									+ "[combo] = "
									+ combo
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[flowToOperand] = "
									+ flowToOperand
									+ ", "
									+ "[line] = "
									+ line
									+ ", "
									+ "[step] = "
									+ step
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[actorToLine] = " + actorToLine + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("sysActor", sysActor);
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {// Create CSP
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
		literal2.setValue("PERFORM");
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
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			NormalStep step, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_CALL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("COMPLETE");
		literal1.setType("");

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
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_message__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"message._id", csp);
		var_message__id.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");

		// Create constraints
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject packageDeclaration, EObject sysActor, EObject actor,
			EObject sysLine, EObject messageSend, EObject sysActorToSysLine,
			EObject operand, EObject combo, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject line,
			EObject step, EObject message, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject actorToLine) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);

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
	public boolean isAppropriate_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		// initial bindings
		Object[] result1_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_10_1_blackBBBBBBBBBB(this,
						match, sysLine, messageSend, operand, combo,
						messageReceive, line, message, interaction);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[operand] = "
							+ operand
							+ ", "
							+ "[combo] = "
							+ combo
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[interaction] = " + interaction + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_10_2_bindingAndBlackFBBBBBBBBBB(
						this, match, sysLine, messageSend, operand, combo,
						messageReceive, line, message, interaction);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[operand] = "
							+ operand
							+ ", "
							+ "[combo] = "
							+ combo
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[interaction] = " + interaction + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_4_blackBBBBBBBBB(match,
							sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[sysLine] = "
								+ sysLine
								+ ", "
								+ "[messageSend] = "
								+ messageSend
								+ ", "
								+ "[operand] = "
								+ operand
								+ ", "
								+ "[combo] = "
								+ combo
								+ ", "
								+ "[messageReceive] = "
								+ messageReceive
								+ ", "
								+ "[line] = "
								+ line
								+ ", "
								+ "[message] = "
								+ message
								+ ", "
								+ "[interaction] = "
								+ interaction + ".");
			}
			UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_4_greenBBBBBBBBBFFFFFFFFFFFFFFFFFF(
							match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction);
			// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result4_green[9];
			// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result4_green[10];
			// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result4_green[11];
			// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result4_green[12];
			// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result4_green[13];
			// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result4_green[14];
			// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result4_green[15];
			// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result4_green[16];
			// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result4_green[17];
			// EMoflonEdge operand__line____covered = (EMoflonEdge) result4_green[18];
			// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result4_green[19];
			// EMoflonEdge combo__line____covered = (EMoflonEdge) result4_green[20];
			// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result4_green[21];
			// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result4_green[22];
			// EMoflonEdge messageSend__message____message = (EMoflonEdge) result4_green[23];
			// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result4_green[24];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[25];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[26];

			// collect context elements
			Object[] result5_black = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_5_blackBBBBBBBBB(match,
							sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[sysLine] = "
								+ sysLine
								+ ", "
								+ "[messageSend] = "
								+ messageSend
								+ ", "
								+ "[operand] = "
								+ operand
								+ ", "
								+ "[combo] = "
								+ combo
								+ ", "
								+ "[messageReceive] = "
								+ messageReceive
								+ ", "
								+ "[line] = "
								+ line
								+ ", "
								+ "[message] = "
								+ message
								+ ", "
								+ "[interaction] = "
								+ interaction + ".");
			}
			UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_5_greenBBBBBBFFF(match,
							sysLine, operand, combo, line, interaction);
			// EMoflonEdge combo__operand____operand = (EMoflonEdge) result5_green[6];
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[7];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[8];

			// register objects to match
			UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_6_expressionBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction);
			return UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_7_expressionF();
		} else {
			return UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[0];
		Actor sysActor = (Actor) result1_bindingAndBlack[1];
		Actor actor = (Actor) result1_bindingAndBlack[2];
		Lifeline sysLine = (Lifeline) result1_bindingAndBlack[3];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[4];
		ActorToLifeline sysActorToSysLine = (ActorToLifeline) result1_bindingAndBlack[5];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[6];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[7];
		NamedFlow flow = (NamedFlow) result1_bindingAndBlack[8];
		FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result1_bindingAndBlack[9];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[10];
		Lifeline line = (Lifeline) result1_bindingAndBlack[11];
		Message message = (Message) result1_bindingAndBlack[12];
		UseCase useCase = (UseCase) result1_bindingAndBlack[13];
		Interaction interaction = (Interaction) result1_bindingAndBlack[14];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[15];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[16];
		CSP csp = (CSP) result1_bindingAndBlack[17];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_1_greenBBFB(actor, flow,
						csp);
		NormalStep step = (NormalStep) result1_green[2];

		// collect translated elements
		Object[] result2_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_2_blackBBBB(messageSend,
						messageReceive, step, message);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[messageSend] = " + messageSend
							+ ", " + "[messageReceive] = " + messageReceive
							+ ", " + "[step] = " + step + ", " + "[message] = "
							+ message + ".");
		}
		Object[] result2_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_2_greenFBBBB(messageSend,
						messageReceive, step, message);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_3_blackBBBBBBBBBBBBBBBBBBB(
						ruleresult, packageDeclaration, sysActor, actor,
						sysLine, messageSend, sysActorToSysLine, operand,
						combo, flow, flowToOperand, messageReceive, line, step,
						message, useCase, interaction, useCaseToInteraction,
						actorToLine);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[sysActorToSysLine] = "
							+ sysActorToSysLine
							+ ", "
							+ "[operand] = "
							+ operand
							+ ", "
							+ "[combo] = "
							+ combo
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[flowToOperand] = "
							+ flowToOperand
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine + ".");
		}
		UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, sysLine, messageSend, operand,
						combo, flow, messageReceive, line, step, message,
						interaction);
		// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[12];
		// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[13];
		// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result3_green[14];
		// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result3_green[15];
		// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result3_green[16];
		// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result3_green[17];
		// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result3_green[18];
		// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result3_green[19];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[22];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[23];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[24];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[25];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[26];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[27];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[28];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[29];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[30];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[31];

		// perform postprocessing story node is empty
		// register objects
		UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_5_expressionBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, packageDeclaration, sysActor, actor,
						sysLine, messageSend, sysActorToSysLine, operand,
						combo, flow, flowToOperand, messageReceive, line, step,
						message, useCase, interaction, useCaseToInteraction,
						actorToLine);
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_12_2_bindingFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Lifeline sysLine = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		InteractionOperand operand = (InteractionOperand) result2_binding[2];
		CombinedFragment combo = (CombinedFragment) result2_binding[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[4];
		Lifeline line = (Lifeline) result2_binding[5];
		Message message = (Message) result2_binding[6];
		Interaction interaction = (Interaction) result2_binding[7];
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_12_2_blackFFBBFBBFFBBBFBFFB(
						sysLine, messageSend, operand, combo, messageReceive,
						line, message, interaction, match)) {
			Actor sysActor = (Actor) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[4];
			NamedFlow flow = (NamedFlow) result2_black[7];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result2_black[8];
			UseCase useCase = (UseCase) result2_black[12];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[14];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[15];
			// ForEach find context
			for (Object[] result3_black : UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_12_3_blackFBBBBBBBBBBBBBBBB(
							sysActor, actor, sysLine, messageSend,
							sysActorToSysLine, operand, combo, flow,
							flowToOperand, messageReceive, line, message,
							useCase, interaction, useCaseToInteraction,
							actorToLine)) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[0];
				Object[] result3_green = UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_12_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								packageDeclaration, sysActor, actor, sysLine,
								messageSend, sysActorToSysLine, operand, combo,
								flow, flowToOperand, messageReceive, line,
								message, useCase, interaction,
								useCaseToInteraction, actorToLine);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[17];
				// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result3_green[18];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[20];
				// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sysLine__operand____coveredBy = (EMoflonEdge) result3_green[22];
				// EMoflonEdge operand__sysLine____covered = (EMoflonEdge) result3_green[23];
				// EMoflonEdge sysLine__combo____coveredBy = (EMoflonEdge) result3_green[24];
				// EMoflonEdge combo__sysLine____covered = (EMoflonEdge) result3_green[25];
				// EMoflonEdge sysActorToSysLine__sysActor____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge sysActorToSysLine__sysLine____target = (EMoflonEdge) result3_green[27];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[28];
				// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result3_green[29];
				// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result3_green[30];
				// EMoflonEdge flowToOperand__flow____source = (EMoflonEdge) result3_green[31];
				// EMoflonEdge flowToOperand__operand____target = (EMoflonEdge) result3_green[32];
				// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[33];
				// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[34];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[35];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[36];
				// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[37];
				// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[38];
				// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[39];
				// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[40];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[41];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[42];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[43];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[44];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[45];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[46];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[47];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[48];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[49];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[50];

				// solve CSP
				Object[] result4_bindingAndBlack = UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, packageDeclaration,
								sysActor, actor, sysLine, messageSend,
								sysActorToSysLine, operand, combo, flow,
								flowToOperand, messageReceive, line, message,
								useCase, interaction, useCaseToInteraction,
								actorToLine);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[sysActor] = "
									+ sysActor
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[sysLine] = "
									+ sysLine
									+ ", "
									+ "[messageSend] = "
									+ messageSend
									+ ", "
									+ "[sysActorToSysLine] = "
									+ sysActorToSysLine
									+ ", "
									+ "[operand] = "
									+ operand
									+ ", "
									+ "[combo] = "
									+ combo
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[flowToOperand] = "
									+ flowToOperand
									+ ", "
									+ "[messageReceive] = "
									+ messageReceive
									+ ", "
									+ "[line] = "
									+ line
									+ ", "
									+ "[message] = "
									+ message
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[actorToLine] = " + actorToLine + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		match.registerObject("sysLine", sysLine);
		match.registerObject("messageSend", messageSend);
		match.registerObject("operand", operand);
		match.registerObject("combo", combo);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_CALL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("COMPLETE");
		literal1.setType("");

		// Create attribute variables
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", true, csp);
		var_message_messageSort.setValue(message.getMessageSort());
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", true, csp);
		var_message_messageKind.setValue(message.getMessageKind());
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");

		// Create unbound variables

		// Create constraints
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();

		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);

		// Solve CSP
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);
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
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {// Create CSP
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
		literal2.setValue("PERFORM");
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
		Variable var_message__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"message._id", true, csp);
		var_message__id.setValue(message.get_id());
		var_message__id.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("String");

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
		eq.solve(var_step_name, var_message__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject packageDeclaration, EObject sysActor, EObject actor,
			EObject sysLine, EObject messageSend, EObject sysActorToSysLine,
			EObject operand, EObject combo, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject line,
			EObject step, EObject message, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject actorToLine) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);

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
				&& match.getObject("message")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_951(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_20_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_20_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_952(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_21_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_21_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_953(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_22_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_22_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_954(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_23_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_23_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_955(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_24_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_24_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_956(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_25_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_25_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_957(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_26_2_blackFFFFFFFFB(_edge_fragment)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_26_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_958(
			EMoflonEdge _edge_enclosingOperand) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_27_2_blackFFFFFFFFB(_edge_enclosingOperand)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_27_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_959(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_28_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_28_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_960(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_29_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_29_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_961(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_30_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_30_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_962(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_31_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_31_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_963(
			EMoflonEdge _edge_sendEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_32_2_blackFFFFFFFFB(_edge_sendEvent)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_32_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_964(
			EMoflonEdge _edge_receiveEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_33_2_blackFFFFFFFFB(_edge_receiveEvent)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_33_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_965(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_34_2_blackFFFFFFFFB(_edge_message)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_34_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_34_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_34_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_34_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_966(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_35_2_blackFFFFFFFFB(_edge_message)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_35_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_35_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_35_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_35_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_35_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_967(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_36_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_36_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_36_2_blackFFFFFFFFB(_edge_interaction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_36_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_36_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_36_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_36_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_36_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_36_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_968(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_37_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_37_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_37_2_blackFFFFFFFFB(_edge_message)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Message message = (Message) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_37_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_37_3_expressionFBBBBBBBBBB(
							this, match, sysLine, messageSend, operand, combo,
							messageReceive, line, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_37_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_37_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_37_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_37_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_447(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_38_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_38_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_38_2_blackFFFFFFB(_edge_steps)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor sysActor = (Actor) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			NamedFlow flow = (NamedFlow) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_38_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_38_3_expressionFBBBBBBBB(
							this, match, packageDeclaration, sysActor, actor,
							flow, step, useCase)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_38_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_38_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_38_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_38_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_448(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_39_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_39_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_39_2_blackFFFFFFB(_edge_actor)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			Actor sysActor = (Actor) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			NamedFlow flow = (NamedFlow) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			Object[] result2_green = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_39_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_39_3_expressionFBBBBBBBB(
							this, match, packageDeclaration, sysActor, actor,
							flow, step, useCase)) {
				// Ensure that the correct types of elements are matched
				if (UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_39_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_39_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_39_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_39_6_expressionFB(__result);
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
			ActorToLifeline sysActorToSysLineParameter) {
		// create result
		Object[] result1_black = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_42_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_42_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_42_2_blackFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList sysActorToSysLineList = (RuleEntryList) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			Actor sysActor = (Actor) result2_black[2];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[3];
			Lifeline sysLine = (Lifeline) result2_black[4];
			Actor actor = (Actor) result2_black[5];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[6];
			Lifeline line = (Lifeline) result2_black[7];
			Interaction interaction = (Interaction) result2_black[8];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[9];
			UseCase useCase = (UseCase) result2_black[10];
			NamedFlow flow = (NamedFlow) result2_black[11];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result2_black[12];
			InteractionOperand operand = (InteractionOperand) result2_black[13];
			CombinedFragment combo = (CombinedFragment) result2_black[14];

			// solve CSP
			Object[] result3_bindingAndBlack = UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_42_3_bindingAndBlackFBBBBBBBBBBBBBBBBB(
							this, isApplicableMatch, packageDeclaration,
							sysActor, actor, sysLine, sysActorToSysLine,
							operand, combo, flow, flowToOperand, line, useCase,
							interaction, useCaseToInteraction, actorToLine,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration
								+ ", "
								+ "[sysActor] = "
								+ sysActor
								+ ", "
								+ "[actor] = "
								+ actor
								+ ", "
								+ "[sysLine] = "
								+ sysLine
								+ ", "
								+ "[sysActorToSysLine] = "
								+ sysActorToSysLine
								+ ", "
								+ "[operand] = "
								+ operand
								+ ", "
								+ "[combo] = "
								+ combo
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[flowToOperand] = "
								+ flowToOperand
								+ ", "
								+ "[line] = "
								+ line
								+ ", "
								+ "[useCase] = "
								+ useCase
								+ ", "
								+ "[interaction] = "
								+ interaction
								+ ", "
								+ "[useCaseToInteraction] = "
								+ useCaseToInteraction
								+ ", "
								+ "[actorToLine] = "
								+ actorToLine
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UserStepNfToMessageRuleImpl
					.pattern_UserStepNfToMessageRule_42_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = UserStepNfToMessageRuleImpl
						.pattern_UserStepNfToMessageRule_42_5_blackBBBBBBBBBBBBBB(
								packageDeclaration, sysActor, actor, sysLine,
								sysActorToSysLine, operand, combo, flow,
								flowToOperand, line, useCase, interaction,
								useCaseToInteraction, actorToLine);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_42_6_blackBBBBBBBBBBBBBBB(
									packageDeclaration, sysActor, actor,
									sysLine, sysActorToSysLine, operand, combo,
									flow, flowToOperand, line, useCase,
									interaction, useCaseToInteraction,
									actorToLine, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: "
										+ "[packageDeclaration] = "
										+ packageDeclaration
										+ ", "
										+ "[sysActor] = "
										+ sysActor
										+ ", "
										+ "[actor] = "
										+ actor
										+ ", "
										+ "[sysLine] = "
										+ sysLine
										+ ", "
										+ "[sysActorToSysLine] = "
										+ sysActorToSysLine
										+ ", "
										+ "[operand] = "
										+ operand
										+ ", "
										+ "[combo] = "
										+ combo
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[flowToOperand] = "
										+ flowToOperand
										+ ", "
										+ "[line] = "
										+ line
										+ ", "
										+ "[useCase] = "
										+ useCase
										+ ", "
										+ "[interaction] = "
										+ interaction
										+ ", "
										+ "[useCaseToInteraction] = "
										+ useCaseToInteraction
										+ ", "
										+ "[actorToLine] = "
										+ actorToLine
										+ ", "
										+ "[ruleResult] = "
										+ ruleResult
										+ ".");
					}
					UserStepNfToMessageRuleImpl
							.pattern_UserStepNfToMessageRule_42_6_greenBBFBBBFBFFBBB(
									actor, sysLine, operand, combo, flow, line,
									interaction, ruleResult, csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[6];
					// NormalStep step = (NormalStep) result6_green[8];
					// Message message = (Message) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return UserStepNfToMessageRuleImpl
				.pattern_UserStepNfToMessageRule_42_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		literal2.setValue("PERFORM");
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal3", true, csp);
		literal3.setValue("ASYNCH_CALL");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal4", true, csp);
		literal4.setValue("COMPLETE");
		literal4.setType("");

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
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");
		Variable var_message__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"message._id", csp);
		var_message__id.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", csp);
		var_step_label.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal3);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal4);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(NormalStep) arguments.get(5), (UseCase) arguments.get(6));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(NormalStep) arguments.get(5), (UseCase) arguments.get(6));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(NormalStep) arguments.get(5), (UseCase) arguments.get(6));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_NORMALSTEP_USECASE_INTERACTION_USECASETOINTERACTION_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(CombinedFragment) arguments.get(7),
					(NamedFlow) arguments.get(8),
					(FlowToInteractionFragment) arguments.get(9),
					(Lifeline) arguments.get(10),
					(NormalStep) arguments.get(11),
					(UseCase) arguments.get(12),
					(Interaction) arguments.get(13),
					(UseCaseToInteraction) arguments.get(14),
					(ActorToLifeline) arguments.get(15));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Lifeline) arguments.get(6), (Message) arguments.get(7),
					(Interaction) arguments.get(8));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Lifeline) arguments.get(6), (Message) arguments.get(7),
					(Interaction) arguments.get(8));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Lifeline) arguments.get(6), (Message) arguments.get(7),
					(Interaction) arguments.get(8));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_USECASE_INTERACTION_USECASETOINTERACTION_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(ActorToLifeline) arguments.get(6),
					(InteractionOperand) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(NamedFlow) arguments.get(9),
					(FlowToInteractionFragment) arguments.get(10),
					(MessageOccurrenceSpecification) arguments.get(11),
					(Lifeline) arguments.get(12), (Message) arguments.get(13),
					(UseCase) arguments.get(14),
					(Interaction) arguments.get(15),
					(UseCaseToInteraction) arguments.get(16),
					(ActorToLifeline) arguments.get(17));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18));
			return null;
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_951__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_951((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_952__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_952((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_953__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_953((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_954__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_954((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_955__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_955((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_956__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_956((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_957__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_957((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_958__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_958((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_959__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_959((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_960__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_960((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_961__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_961((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_962__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_962((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_963__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_963((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_964__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_964((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_965__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_965((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_966__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_966((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_967__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_967((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_968__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_968((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_447__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_447((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_448__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_448((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(ActorToLifeline) arguments.get(1));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_ACTORTOLIFELINE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(Actor) arguments.get(2), (Actor) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(CombinedFragment) arguments.get(7),
					(NamedFlow) arguments.get(8),
					(FlowToInteractionFragment) arguments.get(9),
					(Lifeline) arguments.get(10), (UseCase) arguments.get(11),
					(Interaction) arguments.get(12),
					(UseCaseToInteraction) arguments.get(13),
					(ActorToLifeline) arguments.get(14),
					(ModelgeneratorRuleResult) arguments.get(15));
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_1_blackBBBBBBBB(
			UserStepNfToMessageRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		if (!actor.equals(sysActor)) {
			return new Object[] { _this, match, packageDeclaration, sysActor,
					actor, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_2_bindingFBBBBBBBB(
			UserStepNfToMessageRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				packageDeclaration, sysActor, actor, flow, step, useCase);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration,
					sysActor, actor, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_2_bindingAndBlackFBBBBBBBB(
			UserStepNfToMessageRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		Object[] result_pattern_UserStepNfToMessageRule_0_2_binding = pattern_UserStepNfToMessageRule_0_2_bindingFBBBBBBBB(
				_this, match, packageDeclaration, sysActor, actor, flow, step,
				useCase);
		if (result_pattern_UserStepNfToMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_0_2_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_0_2_black = pattern_UserStepNfToMessageRule_0_2_blackB(csp);
			if (result_pattern_UserStepNfToMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						sysActor, actor, flow, step, useCase };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepNfToMessageRule_0_3_expressionFBB(
			UserStepNfToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_4_blackBBBBBBB(
			Match match, PackageDeclaration packageDeclaration, Actor sysActor,
			Actor actor, NamedFlow flow, NormalStep step, UseCase useCase) {
		if (!actor.equals(sysActor)) {
			return new Object[] { match, packageDeclaration, sysActor, actor,
					flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_4_greenBBBBFF(
			Match match, Actor actor, NamedFlow flow, NormalStep step) {
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
		return new Object[] { match, actor, flow, step, flow__step____steps,
				step__actor____actor };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_5_blackBBBBBBB(
			Match match, PackageDeclaration packageDeclaration, Actor sysActor,
			Actor actor, NamedFlow flow, NormalStep step, UseCase useCase) {
		if (!actor.equals(sysActor)) {
			return new Object[] { match, packageDeclaration, sysActor, actor,
					flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_0_5_greenBBBBBBFFFF(
			Match match, PackageDeclaration packageDeclaration, Actor sysActor,
			Actor actor, NamedFlow flow, UseCase useCase) {
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(packageDeclaration);
		match.getContextNodes().add(sysActor);
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String useCase__flow____flows_name_prime = "flows";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		match.getContextEdges().add(packageDeclaration__sysActor____actors);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { match, packageDeclaration, sysActor, actor, flow,
				useCase, packageDeclaration__sysActor____actors,
				packageDeclaration__actor____actors, useCase__flow____flows,
				packageDeclaration__useCase____useCases };
	}

	public static final void pattern_UserStepNfToMessageRule_0_6_expressionBBBBBBBB(
			UserStepNfToMessageRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		_this.registerObjectsToMatch_FWD(match, packageDeclaration, sysActor,
				actor, flow, step, useCase);

	}

	public static final boolean pattern_UserStepNfToMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_1_1_bindingFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("sysActor");
		EObject _localVariable_2 = isApplicableMatch.getObject("actor");
		EObject _localVariable_3 = isApplicableMatch.getObject("sysLine");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("sysActorToSysLine");
		EObject _localVariable_5 = isApplicableMatch.getObject("operand");
		EObject _localVariable_6 = isApplicableMatch.getObject("combo");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("flowToOperand");
		EObject _localVariable_9 = isApplicableMatch.getObject("line");
		EObject _localVariable_10 = isApplicableMatch.getObject("step");
		EObject _localVariable_11 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_12 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_13 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_14 = isApplicableMatch.getObject("actorToLine");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpSysActor = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		EObject tmpSysLine = _localVariable_3;
		EObject tmpSysActorToSysLine = _localVariable_4;
		EObject tmpOperand = _localVariable_5;
		EObject tmpCombo = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpFlowToOperand = _localVariable_8;
		EObject tmpLine = _localVariable_9;
		EObject tmpStep = _localVariable_10;
		EObject tmpUseCase = _localVariable_11;
		EObject tmpInteraction = _localVariable_12;
		EObject tmpUseCaseToInteraction = _localVariable_13;
		EObject tmpActorToLine = _localVariable_14;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpSysActor instanceof Actor) {
				Actor sysActor = (Actor) tmpSysActor;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					if (tmpSysLine instanceof Lifeline) {
						Lifeline sysLine = (Lifeline) tmpSysLine;
						if (tmpSysActorToSysLine instanceof ActorToLifeline) {
							ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
							if (tmpOperand instanceof InteractionOperand) {
								InteractionOperand operand = (InteractionOperand) tmpOperand;
								if (tmpCombo instanceof CombinedFragment) {
									CombinedFragment combo = (CombinedFragment) tmpCombo;
									if (tmpFlow instanceof NamedFlow) {
										NamedFlow flow = (NamedFlow) tmpFlow;
										if (tmpFlowToOperand instanceof FlowToInteractionFragment) {
											FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) tmpFlowToOperand;
											if (tmpLine instanceof Lifeline) {
												Lifeline line = (Lifeline) tmpLine;
												if (tmpStep instanceof NormalStep) {
													NormalStep step = (NormalStep) tmpStep;
													if (tmpUseCase instanceof UseCase) {
														UseCase useCase = (UseCase) tmpUseCase;
														if (tmpInteraction instanceof Interaction) {
															Interaction interaction = (Interaction) tmpInteraction;
															if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
																UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
																if (tmpActorToLine instanceof ActorToLifeline) {
																	ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
																	return new Object[] {
																			packageDeclaration,
																			sysActor,
																			actor,
																			sysLine,
																			sysActorToSysLine,
																			operand,
																			combo,
																			flow,
																			flowToOperand,
																			line,
																			step,
																			useCase,
																			interaction,
																			useCaseToInteraction,
																			actorToLine,
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

	public static final Object[] pattern_UserStepNfToMessageRule_1_1_blackBBBBBBBBBBBBBBBFBB(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			NormalStep step, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, UserStepNfToMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { packageDeclaration, sysActor,
									actor, sysLine, sysActorToSysLine, operand,
									combo, flow, flowToOperand, line, step,
									useCase, interaction, useCaseToInteraction,
									actorToLine, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserStepNfToMessageRule_1_1_binding = pattern_UserStepNfToMessageRule_1_1_bindingFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UserStepNfToMessageRule_1_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UserStepNfToMessageRule_1_1_binding[0];
			Actor sysActor = (Actor) result_pattern_UserStepNfToMessageRule_1_1_binding[1];
			Actor actor = (Actor) result_pattern_UserStepNfToMessageRule_1_1_binding[2];
			Lifeline sysLine = (Lifeline) result_pattern_UserStepNfToMessageRule_1_1_binding[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result_pattern_UserStepNfToMessageRule_1_1_binding[4];
			InteractionOperand operand = (InteractionOperand) result_pattern_UserStepNfToMessageRule_1_1_binding[5];
			CombinedFragment combo = (CombinedFragment) result_pattern_UserStepNfToMessageRule_1_1_binding[6];
			NamedFlow flow = (NamedFlow) result_pattern_UserStepNfToMessageRule_1_1_binding[7];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result_pattern_UserStepNfToMessageRule_1_1_binding[8];
			Lifeline line = (Lifeline) result_pattern_UserStepNfToMessageRule_1_1_binding[9];
			NormalStep step = (NormalStep) result_pattern_UserStepNfToMessageRule_1_1_binding[10];
			UseCase useCase = (UseCase) result_pattern_UserStepNfToMessageRule_1_1_binding[11];
			Interaction interaction = (Interaction) result_pattern_UserStepNfToMessageRule_1_1_binding[12];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_UserStepNfToMessageRule_1_1_binding[13];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_UserStepNfToMessageRule_1_1_binding[14];

			Object[] result_pattern_UserStepNfToMessageRule_1_1_black = pattern_UserStepNfToMessageRule_1_1_blackBBBBBBBBBBBBBBBFBB(
					packageDeclaration, sysActor, actor, sysLine,
					sysActorToSysLine, operand, combo, flow, flowToOperand,
					line, step, useCase, interaction, useCaseToInteraction,
					actorToLine, _this, isApplicableMatch);
			if (result_pattern_UserStepNfToMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_1_1_black[15];

				return new Object[] { packageDeclaration, sysActor, actor,
						sysLine, sysActorToSysLine, operand, combo, flow,
						flowToOperand, line, step, useCase, interaction,
						useCaseToInteraction, actorToLine, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_1_1_greenBFBBFBFBB(
			Lifeline sysLine, InteractionOperand operand,
			CombinedFragment combo, Lifeline line, Interaction interaction,
			CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		sysLine.getCoveredBy().add(operand);
		sysLine.getCoveredBy().add(combo);
		line.getCoveredBy().add(operand);
		line.getCoveredBy().add(combo);
		Object _localVariable_0 = csp.getValue("message", "messageSort");
		Object _localVariable_1 = csp.getValue("message", "messageKind");
		Object _localVariable_2 = csp.getValue("message", "_id");
		Object _localVariable_3 = csp.getValue("message", "name");
		sysLine.getCoveredBy().add(messageSend);
		operand.getFragment().add(messageReceive);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		message.setInteraction(interaction);
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_0;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_1;
		String message__id_prime = (String) _localVariable_2;
		String message_name_prime = (String) _localVariable_3;
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.set_id(message__id_prime);
		message.setName(message_name_prime);
		return new Object[] { sysLine, messageSend, operand, combo,
				messageReceive, line, message, interaction, csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_1_2_blackBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_1_2_greenFBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(messageSend);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(message);
		return new Object[] { ruleresult, messageSend, messageReceive, step,
				message };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_1_3_blackBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject sysActor, EObject actor, EObject sysLine,
			EObject messageSend, EObject sysActorToSysLine, EObject operand,
			EObject combo, EObject flow, EObject flowToOperand,
			EObject messageReceive, EObject line, EObject step,
			EObject message, EObject useCase, EObject interaction,
			EObject useCaseToInteraction, EObject actorToLine) {
		if (!packageDeclaration.equals(sysActor)) {
			if (!packageDeclaration.equals(sysLine)) {
				if (!packageDeclaration.equals(sysActorToSysLine)) {
					if (!packageDeclaration.equals(step)) {
						if (!packageDeclaration.equals(useCase)) {
							if (!packageDeclaration
									.equals(useCaseToInteraction)) {
								if (!sysActor.equals(sysLine)) {
									if (!sysActor.equals(sysActorToSysLine)) {
										if (!sysActor.equals(useCase)) {
											if (!sysActor
													.equals(useCaseToInteraction)) {
												if (!actor
														.equals(packageDeclaration)) {
													if (!actor.equals(sysActor)) {
														if (!actor
																.equals(sysLine)) {
															if (!actor
																	.equals(messageSend)) {
																if (!actor
																		.equals(sysActorToSysLine)) {
																	if (!actor
																			.equals(operand)) {
																		if (!actor
																				.equals(combo)) {
																			if (!actor
																					.equals(flow)) {
																				if (!actor
																						.equals(flowToOperand)) {
																					if (!actor
																							.equals(messageReceive)) {
																						if (!actor
																								.equals(line)) {
																							if (!actor
																									.equals(step)) {
																								if (!actor
																										.equals(message)) {
																									if (!actor
																											.equals(useCase)) {
																										if (!actor
																												.equals(interaction)) {
																											if (!actor
																													.equals(useCaseToInteraction)) {
																												if (!actor
																														.equals(actorToLine)) {
																													if (!sysLine
																															.equals(useCase)) {
																														if (!sysLine
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
																																						.equals(step)) {
																																					if (!messageSend
																																							.equals(useCase)) {
																																						if (!messageSend
																																								.equals(useCaseToInteraction)) {
																																							if (!sysActorToSysLine
																																									.equals(sysLine)) {
																																								if (!sysActorToSysLine
																																										.equals(useCase)) {
																																									if (!sysActorToSysLine
																																											.equals(useCaseToInteraction)) {
																																										if (!operand
																																												.equals(packageDeclaration)) {
																																											if (!operand
																																													.equals(sysActor)) {
																																												if (!operand
																																														.equals(sysLine)) {
																																													if (!operand
																																															.equals(sysActorToSysLine)) {
																																														if (!operand
																																																.equals(step)) {
																																															if (!operand
																																																	.equals(useCase)) {
																																																if (!operand
																																																		.equals(useCaseToInteraction)) {
																																																	if (!combo
																																																			.equals(packageDeclaration)) {
																																																		if (!combo
																																																				.equals(sysActor)) {
																																																			if (!combo
																																																					.equals(sysLine)) {
																																																				if (!combo
																																																						.equals(messageSend)) {
																																																					if (!combo
																																																							.equals(sysActorToSysLine)) {
																																																						if (!combo
																																																								.equals(operand)) {
																																																							if (!combo
																																																									.equals(flow)) {
																																																								if (!combo
																																																										.equals(flowToOperand)) {
																																																									if (!combo
																																																											.equals(messageReceive)) {
																																																										if (!combo
																																																												.equals(line)) {
																																																											if (!combo
																																																													.equals(step)) {
																																																												if (!combo
																																																														.equals(message)) {
																																																													if (!combo
																																																															.equals(useCase)) {
																																																														if (!combo
																																																																.equals(interaction)) {
																																																															if (!combo
																																																																	.equals(useCaseToInteraction)) {
																																																																if (!flow
																																																																		.equals(packageDeclaration)) {
																																																																	if (!flow
																																																																			.equals(sysActor)) {
																																																																		if (!flow
																																																																				.equals(sysLine)) {
																																																																			if (!flow
																																																																					.equals(messageSend)) {
																																																																				if (!flow
																																																																						.equals(sysActorToSysLine)) {
																																																																					if (!flow
																																																																							.equals(operand)) {
																																																																						if (!flow
																																																																								.equals(flowToOperand)) {
																																																																							if (!flow
																																																																									.equals(messageReceive)) {
																																																																								if (!flow
																																																																										.equals(line)) {
																																																																									if (!flow
																																																																											.equals(step)) {
																																																																										if (!flow
																																																																												.equals(message)) {
																																																																											if (!flow
																																																																													.equals(useCase)) {
																																																																												if (!flow
																																																																														.equals(interaction)) {
																																																																													if (!flow
																																																																															.equals(useCaseToInteraction)) {
																																																																														if (!flowToOperand
																																																																																.equals(packageDeclaration)) {
																																																																															if (!flowToOperand
																																																																																	.equals(sysActor)) {
																																																																																if (!flowToOperand
																																																																																		.equals(sysLine)) {
																																																																																	if (!flowToOperand
																																																																																			.equals(messageSend)) {
																																																																																		if (!flowToOperand
																																																																																				.equals(sysActorToSysLine)) {
																																																																																			if (!flowToOperand
																																																																																					.equals(operand)) {
																																																																																				if (!flowToOperand
																																																																																						.equals(messageReceive)) {
																																																																																					if (!flowToOperand
																																																																																							.equals(line)) {
																																																																																						if (!flowToOperand
																																																																																								.equals(step)) {
																																																																																							if (!flowToOperand
																																																																																									.equals(message)) {
																																																																																								if (!flowToOperand
																																																																																										.equals(useCase)) {
																																																																																									if (!flowToOperand
																																																																																											.equals(interaction)) {
																																																																																										if (!flowToOperand
																																																																																												.equals(useCaseToInteraction)) {
																																																																																											if (!messageReceive
																																																																																													.equals(packageDeclaration)) {
																																																																																												if (!messageReceive
																																																																																														.equals(sysActor)) {
																																																																																													if (!messageReceive
																																																																																															.equals(sysLine)) {
																																																																																														if (!messageReceive
																																																																																																.equals(messageSend)) {
																																																																																															if (!messageReceive
																																																																																																	.equals(sysActorToSysLine)) {
																																																																																																if (!messageReceive
																																																																																																		.equals(operand)) {
																																																																																																	if (!messageReceive
																																																																																																			.equals(step)) {
																																																																																																		if (!messageReceive
																																																																																																				.equals(useCase)) {
																																																																																																			if (!messageReceive
																																																																																																					.equals(useCaseToInteraction)) {
																																																																																																				if (!line
																																																																																																						.equals(packageDeclaration)) {
																																																																																																					if (!line
																																																																																																							.equals(sysActor)) {
																																																																																																						if (!line
																																																																																																								.equals(sysLine)) {
																																																																																																							if (!line
																																																																																																									.equals(messageSend)) {
																																																																																																								if (!line
																																																																																																										.equals(sysActorToSysLine)) {
																																																																																																									if (!line
																																																																																																											.equals(operand)) {
																																																																																																										if (!line
																																																																																																												.equals(messageReceive)) {
																																																																																																											if (!line
																																																																																																													.equals(step)) {
																																																																																																												if (!line
																																																																																																														.equals(message)) {
																																																																																																													if (!line
																																																																																																															.equals(useCase)) {
																																																																																																														if (!line
																																																																																																																.equals(useCaseToInteraction)) {
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
																																																																																																																				if (!message
																																																																																																																						.equals(packageDeclaration)) {
																																																																																																																					if (!message
																																																																																																																							.equals(sysActor)) {
																																																																																																																						if (!message
																																																																																																																								.equals(sysLine)) {
																																																																																																																							if (!message
																																																																																																																									.equals(messageSend)) {
																																																																																																																								if (!message
																																																																																																																										.equals(sysActorToSysLine)) {
																																																																																																																									if (!message
																																																																																																																											.equals(operand)) {
																																																																																																																										if (!message
																																																																																																																												.equals(messageReceive)) {
																																																																																																																											if (!message
																																																																																																																													.equals(step)) {
																																																																																																																												if (!message
																																																																																																																														.equals(useCase)) {
																																																																																																																													if (!message
																																																																																																																															.equals(useCaseToInteraction)) {
																																																																																																																														if (!useCase
																																																																																																																																.equals(useCaseToInteraction)) {
																																																																																																																															if (!interaction
																																																																																																																																	.equals(packageDeclaration)) {
																																																																																																																																if (!interaction
																																																																																																																																		.equals(sysActor)) {
																																																																																																																																	if (!interaction
																																																																																																																																			.equals(sysLine)) {
																																																																																																																																		if (!interaction
																																																																																																																																				.equals(messageSend)) {
																																																																																																																																			if (!interaction
																																																																																																																																					.equals(sysActorToSysLine)) {
																																																																																																																																				if (!interaction
																																																																																																																																						.equals(operand)) {
																																																																																																																																					if (!interaction
																																																																																																																																							.equals(messageReceive)) {
																																																																																																																																						if (!interaction
																																																																																																																																								.equals(line)) {
																																																																																																																																							if (!interaction
																																																																																																																																									.equals(step)) {
																																																																																																																																								if (!interaction
																																																																																																																																										.equals(message)) {
																																																																																																																																									if (!interaction
																																																																																																																																											.equals(useCase)) {
																																																																																																																																										if (!interaction
																																																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																																																											if (!actorToLine
																																																																																																																																													.equals(packageDeclaration)) {
																																																																																																																																												if (!actorToLine
																																																																																																																																														.equals(sysActor)) {
																																																																																																																																													if (!actorToLine
																																																																																																																																															.equals(sysLine)) {
																																																																																																																																														if (!actorToLine
																																																																																																																																																.equals(messageSend)) {
																																																																																																																																															if (!actorToLine
																																																																																																																																																	.equals(sysActorToSysLine)) {
																																																																																																																																																if (!actorToLine
																																																																																																																																																		.equals(operand)) {
																																																																																																																																																	if (!actorToLine
																																																																																																																																																			.equals(combo)) {
																																																																																																																																																		if (!actorToLine
																																																																																																																																																				.equals(flow)) {
																																																																																																																																																			if (!actorToLine
																																																																																																																																																					.equals(flowToOperand)) {
																																																																																																																																																				if (!actorToLine
																																																																																																																																																						.equals(messageReceive)) {
																																																																																																																																																					if (!actorToLine
																																																																																																																																																							.equals(line)) {
																																																																																																																																																						if (!actorToLine
																																																																																																																																																								.equals(step)) {
																																																																																																																																																							if (!actorToLine
																																																																																																																																																									.equals(message)) {
																																																																																																																																																								if (!actorToLine
																																																																																																																																																										.equals(useCase)) {
																																																																																																																																																									if (!actorToLine
																																																																																																																																																											.equals(interaction)) {
																																																																																																																																																										if (!actorToLine
																																																																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																																																																											return new Object[] {
																																																																																																																																																													ruleresult,
																																																																																																																																																													packageDeclaration,
																																																																																																																																																													sysActor,
																																																																																																																																																													actor,
																																																																																																																																																													sysLine,
																																																																																																																																																													messageSend,
																																																																																																																																																													sysActorToSysLine,
																																																																																																																																																													operand,
																																																																																																																																																													combo,
																																																																																																																																																													flow,
																																																																																																																																																													flowToOperand,
																																																																																																																																																													messageReceive,
																																																																																																																																																													line,
																																																																																																																																																													step,
																																																																																																																																																													message,
																																																																																																																																																													useCase,
																																																																																																																																																													interaction,
																																																																																																																																																													useCaseToInteraction,
																																																																																																																																																													actorToLine };
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject sysLine,
			EObject messageSend, EObject operand, EObject combo, EObject flow,
			EObject messageReceive, EObject line, EObject step,
			EObject message, EObject interaction) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserStepNfToMessageRule";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(messageSend__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		ruleresult.getCreatedEdges().add(sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(operand__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		ruleresult.getCreatedEdges().add(sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(combo__sysLine____covered);
		operand__messageReceive____fragment.setSrc(operand);
		operand__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(operand__messageReceive____fragment);
		messageReceive__operand____enclosingOperand.setSrc(messageReceive);
		messageReceive__operand____enclosingOperand.setTrg(operand);
		ruleresult.getCreatedEdges().add(
				messageReceive__operand____enclosingOperand);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		ruleresult.getCreatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(operand__line____covered);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		ruleresult.getCreatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(combo__line____covered);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageReceive__message____message);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(interaction__message____message);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(step__actor____actor);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		operand__messageReceive____fragment
				.setName(operand__messageReceive____fragment_name_prime);
		messageReceive__operand____enclosingOperand
				.setName(messageReceive__operand____enclosingOperand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, actor, sysLine, messageSend, operand,
				combo, flow, messageReceive, line, step, message, interaction,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				line__operand____coveredBy, operand__line____covered,
				line__combo____coveredBy, combo__line____covered,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_UserStepNfToMessageRule_1_5_expressionBBBBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject sysActor, EObject actor,
			EObject sysLine, EObject messageSend, EObject sysActorToSysLine,
			EObject operand, EObject combo, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject line,
			EObject step, EObject message, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject actorToLine) {
		_this.registerObjects_FWD(ruleresult, packageDeclaration, sysActor,
				actor, sysLine, messageSend, sysActorToSysLine, operand, combo,
				flow, flowToOperand, messageReceive, line, step, message,
				useCase, interaction, useCaseToInteraction, actorToLine);

	}

	public static final PerformRuleResult pattern_UserStepNfToMessageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_1_blackFBB(
			EClass eClass, UserStepNfToMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_2_1_binding = pattern_UserStepNfToMessageRule_2_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserStepNfToMessageRule_2_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_2_1_black = pattern_UserStepNfToMessageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserStepNfToMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_2_bindingFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("sysActor");
		EObject _localVariable_2 = match.getObject("actor");
		EObject _localVariable_3 = match.getObject("flow");
		EObject _localVariable_4 = match.getObject("step");
		EObject _localVariable_5 = match.getObject("useCase");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpSysActor = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpSysActor instanceof Actor) {
				Actor sysActor = (Actor) tmpSysActor;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					if (tmpFlow instanceof NamedFlow) {
						NamedFlow flow = (NamedFlow) tmpFlow;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								return new Object[] { packageDeclaration,
										sysActor, actor, flow, step, useCase,
										match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_2_2_blackBBBFFFBFFBBFFFB(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			for (ActorToLifeline sysActorToSysLine : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sysActor, ActorToLifeline.class,
							"source")) {
				Lifeline sysLine = sysActorToSysLine.getTarget();
				if (sysLine != null) {
					for (FlowToInteractionFragment flowToOperand : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									FlowToInteractionFragment.class, "source")) {
						InteractionFragment tmpOperand = flowToOperand
								.getTarget();
						if (tmpOperand instanceof InteractionOperand) {
							InteractionOperand operand = (InteractionOperand) tmpOperand;
							for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(useCase,
											UseCaseToInteraction.class,
											"source")) {
								Interaction interaction = useCaseToInteraction
										.getTarget();
								if (interaction != null) {
									for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
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
															sysActor,
															actor,
															sysLine,
															sysActorToSysLine,
															operand,
															flow,
															flowToOperand,
															line,
															step,
															useCase,
															interaction,
															useCaseToInteraction,
															actorToLine, match });
												}
											}

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

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_2_3_blackBBBBBBFBBBBBBBB(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			NormalStep step, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					if (packageDeclaration.getActors().contains(sysActor)) {
						if (packageDeclaration.getActors().contains(actor)) {
							if (sysActor.equals(sysActorToSysLine.getSource())) {
								if (sysLine.equals(sysActorToSysLine
										.getTarget())) {
									if (flow.equals(flowToOperand.getSource())) {
										if (operand.equals(flowToOperand
												.getTarget())) {
											if (useCase.getFlows().contains(
													flow)) {
												if (interaction.equals(line
														.getInteraction())) {
													if (useCase
															.equals(useCaseToInteraction
																	.getSource())) {
														if (interaction
																.equals(useCaseToInteraction
																		.getTarget())) {
															if (flow.getSteps()
																	.contains(
																			step)) {
																if (actor
																		.equals(step
																				.getActor())) {
																	if (actor
																			.equals(actorToLine
																					.getSource())) {
																		if (line.equals(actorToLine
																				.getTarget())) {
																			if (packageDeclaration
																					.getUseCases()
																					.contains(
																							useCase)) {
																				for (CombinedFragment combo : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								operand,
																								CombinedFragment.class,
																								"operand")) {
																					_result.add(new Object[] {
																							packageDeclaration,
																							sysActor,
																							actor,
																							sysLine,
																							sysActorToSysLine,
																							operand,
																							combo,
																							flow,
																							flowToOperand,
																							line,
																							step,
																							useCase,
																							interaction,
																							useCaseToInteraction,
																							actorToLine });
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_2_3_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			NormalStep step, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysActor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysLine____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToOperand__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String sysActorToSysLine__sysActor____source_name_prime = "source";
		String sysActorToSysLine__sysLine____target_name_prime = "target";
		String combo__operand____operand_name_prime = "operand";
		String flowToOperand__flow____source_name_prime = "source";
		String flowToOperand__operand____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(sysActor);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(sysLine);
		isApplicableMatch.getAllContextElements().add(sysActorToSysLine);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToOperand);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__sysActor____actors);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		sysActorToSysLine__sysActor____source.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysActor____source.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysActor____source);
		sysActorToSysLine__sysLine____target.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysLine____target.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysLine____target);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
		flowToOperand__flow____source.setSrc(flowToOperand);
		flowToOperand__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToOperand__flow____source);
		flowToOperand__operand____target.setSrc(flowToOperand);
		flowToOperand__operand____target.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				flowToOperand__operand____target);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
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
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		sysActorToSysLine__sysActor____source
				.setName(sysActorToSysLine__sysActor____source_name_prime);
		sysActorToSysLine__sysLine____target
				.setName(sysActorToSysLine__sysLine____target_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		flowToOperand__flow____source
				.setName(flowToOperand__flow____source_name_prime);
		flowToOperand__operand____target
				.setName(flowToOperand__operand____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { packageDeclaration, sysActor, actor, sysLine,
				sysActorToSysLine, operand, combo, flow, flowToOperand, line,
				step, useCase, interaction, useCaseToInteraction, actorToLine,
				isApplicableMatch, packageDeclaration__sysActor____actors,
				packageDeclaration__actor____actors,
				sysActorToSysLine__sysActor____source,
				sysActorToSysLine__sysLine____target,
				combo__operand____operand, flowToOperand__flow____source,
				flowToOperand__operand____target, useCase__flow____flows,
				line__interaction____interaction,
				interaction__line____lifeline,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, step__actor____actor,
				actorToLine__actor____source, actorToLine__line____target,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_4_bindingFBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			NormalStep step, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, packageDeclaration, sysActor, actor,
				sysLine, sysActorToSysLine, operand, combo, flow,
				flowToOperand, line, step, useCase, interaction,
				useCaseToInteraction, actorToLine);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, sysActor, actor, sysLine,
					sysActorToSysLine, operand, combo, flow, flowToOperand,
					line, step, useCase, interaction, useCaseToInteraction,
					actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			NormalStep step, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		Object[] result_pattern_UserStepNfToMessageRule_2_4_binding = pattern_UserStepNfToMessageRule_2_4_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, sysActor, actor,
				sysLine, sysActorToSysLine, operand, combo, flow,
				flowToOperand, line, step, useCase, interaction,
				useCaseToInteraction, actorToLine);
		if (result_pattern_UserStepNfToMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_2_4_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_2_4_black = pattern_UserStepNfToMessageRule_2_4_blackB(csp);
			if (result_pattern_UserStepNfToMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, sysActor, actor, sysLine,
						sysActorToSysLine, operand, combo, flow, flowToOperand,
						line, step, useCase, interaction, useCaseToInteraction,
						actorToLine };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepNfToMessageRule_2_5_expressionFBB(
			UserStepNfToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserStepNfToMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserStepNfToMessageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_1_blackBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { _this, match, sysLine, messageSend,
						operand, combo, messageReceive, line, message,
						interaction };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_2_bindingFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sysLine, messageSend,
					operand, combo, messageReceive, line, message, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_2_bindingAndBlackFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		Object[] result_pattern_UserStepNfToMessageRule_10_2_binding = pattern_UserStepNfToMessageRule_10_2_bindingFBBBBBBBBBB(
				_this, match, sysLine, messageSend, operand, combo,
				messageReceive, line, message, interaction);
		if (result_pattern_UserStepNfToMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_10_2_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_10_2_black = pattern_UserStepNfToMessageRule_10_2_blackB(csp);
			if (result_pattern_UserStepNfToMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, sysLine, messageSend,
						operand, combo, messageReceive, line, message,
						interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepNfToMessageRule_10_3_expressionFBB(
			UserStepNfToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_4_blackBBBBBBBBB(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { match, sysLine, messageSend, operand,
						combo, messageReceive, line, message, interaction };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_4_greenBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(messageSend);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(message);
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(messageSend__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		match.getToBeTranslatedEdges().add(sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(operand__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		match.getToBeTranslatedEdges().add(sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(combo__sysLine____covered);
		operand__messageReceive____fragment.setSrc(operand);
		operand__messageReceive____fragment.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(operand__messageReceive____fragment);
		messageReceive__operand____enclosingOperand.setSrc(messageReceive);
		messageReceive__operand____enclosingOperand.setTrg(operand);
		match.getToBeTranslatedEdges().add(
				messageReceive__operand____enclosingOperand);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		match.getToBeTranslatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(operand__line____covered);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		match.getToBeTranslatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(combo__line____covered);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageReceive__message____message);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(interaction__message____message);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		operand__messageReceive____fragment
				.setName(operand__messageReceive____fragment_name_prime);
		messageReceive__operand____enclosingOperand
				.setName(messageReceive__operand____enclosingOperand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		return new Object[] { match, sysLine, messageSend, operand, combo,
				messageReceive, line, message, interaction,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				line__operand____coveredBy, operand__line____covered,
				line__combo____coveredBy, combo__line____covered,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				message__interaction____interaction,
				interaction__message____message };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_5_blackBBBBBBBBB(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { match, sysLine, messageSend, operand,
						combo, messageReceive, line, message, interaction };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_10_5_greenBBBBBBFFF(
			Match match, Lifeline sysLine, InteractionOperand operand,
			CombinedFragment combo, Lifeline line, Interaction interaction) {
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(sysLine);
		match.getContextNodes().add(operand);
		match.getContextNodes().add(combo);
		match.getContextNodes().add(line);
		match.getContextNodes().add(interaction);
		String combo__operand____operand_name_prime = "operand";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		match.getContextEdges().add(combo__operand____operand);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		match.getContextEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		match.getContextEdges().add(interaction__line____lifeline);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { match, sysLine, operand, combo, line,
				interaction, combo__operand____operand,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_UserStepNfToMessageRule_10_6_expressionBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		_this.registerObjectsToMatch_BWD(match, sysLine, messageSend, operand,
				combo, messageReceive, line, message, interaction);

	}

	public static final boolean pattern_UserStepNfToMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_1_bindingFFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("sysActor");
		EObject _localVariable_2 = isApplicableMatch.getObject("actor");
		EObject _localVariable_3 = isApplicableMatch.getObject("sysLine");
		EObject _localVariable_4 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("sysActorToSysLine");
		EObject _localVariable_6 = isApplicableMatch.getObject("operand");
		EObject _localVariable_7 = isApplicableMatch.getObject("combo");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject _localVariable_9 = isApplicableMatch.getObject("flowToOperand");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_11 = isApplicableMatch.getObject("line");
		EObject _localVariable_12 = isApplicableMatch.getObject("message");
		EObject _localVariable_13 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_14 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_15 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_16 = isApplicableMatch.getObject("actorToLine");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpSysActor = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		EObject tmpSysLine = _localVariable_3;
		EObject tmpMessageSend = _localVariable_4;
		EObject tmpSysActorToSysLine = _localVariable_5;
		EObject tmpOperand = _localVariable_6;
		EObject tmpCombo = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		EObject tmpFlowToOperand = _localVariable_9;
		EObject tmpMessageReceive = _localVariable_10;
		EObject tmpLine = _localVariable_11;
		EObject tmpMessage = _localVariable_12;
		EObject tmpUseCase = _localVariable_13;
		EObject tmpInteraction = _localVariable_14;
		EObject tmpUseCaseToInteraction = _localVariable_15;
		EObject tmpActorToLine = _localVariable_16;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpSysActor instanceof Actor) {
				Actor sysActor = (Actor) tmpSysActor;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					if (tmpSysLine instanceof Lifeline) {
						Lifeline sysLine = (Lifeline) tmpSysLine;
						if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
							if (tmpSysActorToSysLine instanceof ActorToLifeline) {
								ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
								if (tmpOperand instanceof InteractionOperand) {
									InteractionOperand operand = (InteractionOperand) tmpOperand;
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (tmpFlow instanceof NamedFlow) {
											NamedFlow flow = (NamedFlow) tmpFlow;
											if (tmpFlowToOperand instanceof FlowToInteractionFragment) {
												FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) tmpFlowToOperand;
												if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
													if (tmpLine instanceof Lifeline) {
														Lifeline line = (Lifeline) tmpLine;
														if (tmpMessage instanceof Message) {
															Message message = (Message) tmpMessage;
															if (tmpUseCase instanceof UseCase) {
																UseCase useCase = (UseCase) tmpUseCase;
																if (tmpInteraction instanceof Interaction) {
																	Interaction interaction = (Interaction) tmpInteraction;
																	if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
																		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
																		if (tmpActorToLine instanceof ActorToLifeline) {
																			ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
																			return new Object[] {
																					packageDeclaration,
																					sysActor,
																					actor,
																					sysLine,
																					messageSend,
																					sysActorToSysLine,
																					operand,
																					combo,
																					flow,
																					flowToOperand,
																					messageReceive,
																					line,
																					message,
																					useCase,
																					interaction,
																					useCaseToInteraction,
																					actorToLine,
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
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_1_blackBBBBBBBBBBBBBBBBBFBB(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, UserStepNfToMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!actor.equals(sysActor)) {
			if (!messageReceive.equals(messageSend)) {
				if (!line.equals(sysLine)) {
					if (!actorToLine.equals(sysActorToSysLine)) {
						for (EObject tmpCsp : isApplicableMatch
								.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { packageDeclaration,
										sysActor, actor, sysLine, messageSend,
										sysActorToSysLine, operand, combo,
										flow, flowToOperand, messageReceive,
										line, message, useCase, interaction,
										useCaseToInteraction, actorToLine, csp,
										_this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFFFBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserStepNfToMessageRule_11_1_binding = pattern_UserStepNfToMessageRule_11_1_bindingFFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UserStepNfToMessageRule_11_1_binding != null) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UserStepNfToMessageRule_11_1_binding[0];
			Actor sysActor = (Actor) result_pattern_UserStepNfToMessageRule_11_1_binding[1];
			Actor actor = (Actor) result_pattern_UserStepNfToMessageRule_11_1_binding[2];
			Lifeline sysLine = (Lifeline) result_pattern_UserStepNfToMessageRule_11_1_binding[3];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_UserStepNfToMessageRule_11_1_binding[4];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result_pattern_UserStepNfToMessageRule_11_1_binding[5];
			InteractionOperand operand = (InteractionOperand) result_pattern_UserStepNfToMessageRule_11_1_binding[6];
			CombinedFragment combo = (CombinedFragment) result_pattern_UserStepNfToMessageRule_11_1_binding[7];
			NamedFlow flow = (NamedFlow) result_pattern_UserStepNfToMessageRule_11_1_binding[8];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result_pattern_UserStepNfToMessageRule_11_1_binding[9];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_UserStepNfToMessageRule_11_1_binding[10];
			Lifeline line = (Lifeline) result_pattern_UserStepNfToMessageRule_11_1_binding[11];
			Message message = (Message) result_pattern_UserStepNfToMessageRule_11_1_binding[12];
			UseCase useCase = (UseCase) result_pattern_UserStepNfToMessageRule_11_1_binding[13];
			Interaction interaction = (Interaction) result_pattern_UserStepNfToMessageRule_11_1_binding[14];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_UserStepNfToMessageRule_11_1_binding[15];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_UserStepNfToMessageRule_11_1_binding[16];

			Object[] result_pattern_UserStepNfToMessageRule_11_1_black = pattern_UserStepNfToMessageRule_11_1_blackBBBBBBBBBBBBBBBBBFBB(
					packageDeclaration, sysActor, actor, sysLine, messageSend,
					sysActorToSysLine, operand, combo, flow, flowToOperand,
					messageReceive, line, message, useCase, interaction,
					useCaseToInteraction, actorToLine, _this, isApplicableMatch);
			if (result_pattern_UserStepNfToMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_11_1_black[17];

				return new Object[] { packageDeclaration, sysActor, actor,
						sysLine, messageSend, sysActorToSysLine, operand,
						combo, flow, flowToOperand, messageReceive, line,
						message, useCase, interaction, useCaseToInteraction,
						actorToLine, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_1_greenBBFB(
			Actor actor, NamedFlow flow, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("step", "label");
		flow.getSteps().add(step);
		step.setActor(actor);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		String step_label_prime = (String) _localVariable_2;
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		step.setLabel(step_label_prime);
		return new Object[] { actor, flow, step, csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_2_blackBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_2_greenFBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(messageSend);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(message);
		return new Object[] { ruleresult, messageSend, messageReceive, step,
				message };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_11_3_blackBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject packageDeclaration,
			EObject sysActor, EObject actor, EObject sysLine,
			EObject messageSend, EObject sysActorToSysLine, EObject operand,
			EObject combo, EObject flow, EObject flowToOperand,
			EObject messageReceive, EObject line, EObject step,
			EObject message, EObject useCase, EObject interaction,
			EObject useCaseToInteraction, EObject actorToLine) {
		if (!packageDeclaration.equals(sysActor)) {
			if (!packageDeclaration.equals(sysLine)) {
				if (!packageDeclaration.equals(sysActorToSysLine)) {
					if (!packageDeclaration.equals(step)) {
						if (!packageDeclaration.equals(useCase)) {
							if (!packageDeclaration
									.equals(useCaseToInteraction)) {
								if (!sysActor.equals(sysLine)) {
									if (!sysActor.equals(sysActorToSysLine)) {
										if (!sysActor.equals(useCase)) {
											if (!sysActor
													.equals(useCaseToInteraction)) {
												if (!actor
														.equals(packageDeclaration)) {
													if (!actor.equals(sysActor)) {
														if (!actor
																.equals(sysLine)) {
															if (!actor
																	.equals(messageSend)) {
																if (!actor
																		.equals(sysActorToSysLine)) {
																	if (!actor
																			.equals(operand)) {
																		if (!actor
																				.equals(combo)) {
																			if (!actor
																					.equals(flow)) {
																				if (!actor
																						.equals(flowToOperand)) {
																					if (!actor
																							.equals(messageReceive)) {
																						if (!actor
																								.equals(line)) {
																							if (!actor
																									.equals(step)) {
																								if (!actor
																										.equals(message)) {
																									if (!actor
																											.equals(useCase)) {
																										if (!actor
																												.equals(interaction)) {
																											if (!actor
																													.equals(useCaseToInteraction)) {
																												if (!actor
																														.equals(actorToLine)) {
																													if (!sysLine
																															.equals(useCase)) {
																														if (!sysLine
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
																																						.equals(step)) {
																																					if (!messageSend
																																							.equals(useCase)) {
																																						if (!messageSend
																																								.equals(useCaseToInteraction)) {
																																							if (!sysActorToSysLine
																																									.equals(sysLine)) {
																																								if (!sysActorToSysLine
																																										.equals(useCase)) {
																																									if (!sysActorToSysLine
																																											.equals(useCaseToInteraction)) {
																																										if (!operand
																																												.equals(packageDeclaration)) {
																																											if (!operand
																																													.equals(sysActor)) {
																																												if (!operand
																																														.equals(sysLine)) {
																																													if (!operand
																																															.equals(sysActorToSysLine)) {
																																														if (!operand
																																																.equals(step)) {
																																															if (!operand
																																																	.equals(useCase)) {
																																																if (!operand
																																																		.equals(useCaseToInteraction)) {
																																																	if (!combo
																																																			.equals(packageDeclaration)) {
																																																		if (!combo
																																																				.equals(sysActor)) {
																																																			if (!combo
																																																					.equals(sysLine)) {
																																																				if (!combo
																																																						.equals(messageSend)) {
																																																					if (!combo
																																																							.equals(sysActorToSysLine)) {
																																																						if (!combo
																																																								.equals(operand)) {
																																																							if (!combo
																																																									.equals(flow)) {
																																																								if (!combo
																																																										.equals(flowToOperand)) {
																																																									if (!combo
																																																											.equals(messageReceive)) {
																																																										if (!combo
																																																												.equals(line)) {
																																																											if (!combo
																																																													.equals(step)) {
																																																												if (!combo
																																																														.equals(message)) {
																																																													if (!combo
																																																															.equals(useCase)) {
																																																														if (!combo
																																																																.equals(interaction)) {
																																																															if (!combo
																																																																	.equals(useCaseToInteraction)) {
																																																																if (!flow
																																																																		.equals(packageDeclaration)) {
																																																																	if (!flow
																																																																			.equals(sysActor)) {
																																																																		if (!flow
																																																																				.equals(sysLine)) {
																																																																			if (!flow
																																																																					.equals(messageSend)) {
																																																																				if (!flow
																																																																						.equals(sysActorToSysLine)) {
																																																																					if (!flow
																																																																							.equals(operand)) {
																																																																						if (!flow
																																																																								.equals(flowToOperand)) {
																																																																							if (!flow
																																																																									.equals(messageReceive)) {
																																																																								if (!flow
																																																																										.equals(line)) {
																																																																									if (!flow
																																																																											.equals(step)) {
																																																																										if (!flow
																																																																												.equals(message)) {
																																																																											if (!flow
																																																																													.equals(useCase)) {
																																																																												if (!flow
																																																																														.equals(interaction)) {
																																																																													if (!flow
																																																																															.equals(useCaseToInteraction)) {
																																																																														if (!flowToOperand
																																																																																.equals(packageDeclaration)) {
																																																																															if (!flowToOperand
																																																																																	.equals(sysActor)) {
																																																																																if (!flowToOperand
																																																																																		.equals(sysLine)) {
																																																																																	if (!flowToOperand
																																																																																			.equals(messageSend)) {
																																																																																		if (!flowToOperand
																																																																																				.equals(sysActorToSysLine)) {
																																																																																			if (!flowToOperand
																																																																																					.equals(operand)) {
																																																																																				if (!flowToOperand
																																																																																						.equals(messageReceive)) {
																																																																																					if (!flowToOperand
																																																																																							.equals(line)) {
																																																																																						if (!flowToOperand
																																																																																								.equals(step)) {
																																																																																							if (!flowToOperand
																																																																																									.equals(message)) {
																																																																																								if (!flowToOperand
																																																																																										.equals(useCase)) {
																																																																																									if (!flowToOperand
																																																																																											.equals(interaction)) {
																																																																																										if (!flowToOperand
																																																																																												.equals(useCaseToInteraction)) {
																																																																																											if (!messageReceive
																																																																																													.equals(packageDeclaration)) {
																																																																																												if (!messageReceive
																																																																																														.equals(sysActor)) {
																																																																																													if (!messageReceive
																																																																																															.equals(sysLine)) {
																																																																																														if (!messageReceive
																																																																																																.equals(messageSend)) {
																																																																																															if (!messageReceive
																																																																																																	.equals(sysActorToSysLine)) {
																																																																																																if (!messageReceive
																																																																																																		.equals(operand)) {
																																																																																																	if (!messageReceive
																																																																																																			.equals(step)) {
																																																																																																		if (!messageReceive
																																																																																																				.equals(useCase)) {
																																																																																																			if (!messageReceive
																																																																																																					.equals(useCaseToInteraction)) {
																																																																																																				if (!line
																																																																																																						.equals(packageDeclaration)) {
																																																																																																					if (!line
																																																																																																							.equals(sysActor)) {
																																																																																																						if (!line
																																																																																																								.equals(sysLine)) {
																																																																																																							if (!line
																																																																																																									.equals(messageSend)) {
																																																																																																								if (!line
																																																																																																										.equals(sysActorToSysLine)) {
																																																																																																									if (!line
																																																																																																											.equals(operand)) {
																																																																																																										if (!line
																																																																																																												.equals(messageReceive)) {
																																																																																																											if (!line
																																																																																																													.equals(step)) {
																																																																																																												if (!line
																																																																																																														.equals(message)) {
																																																																																																													if (!line
																																																																																																															.equals(useCase)) {
																																																																																																														if (!line
																																																																																																																.equals(useCaseToInteraction)) {
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
																																																																																																																				if (!message
																																																																																																																						.equals(packageDeclaration)) {
																																																																																																																					if (!message
																																																																																																																							.equals(sysActor)) {
																																																																																																																						if (!message
																																																																																																																								.equals(sysLine)) {
																																																																																																																							if (!message
																																																																																																																									.equals(messageSend)) {
																																																																																																																								if (!message
																																																																																																																										.equals(sysActorToSysLine)) {
																																																																																																																									if (!message
																																																																																																																											.equals(operand)) {
																																																																																																																										if (!message
																																																																																																																												.equals(messageReceive)) {
																																																																																																																											if (!message
																																																																																																																													.equals(step)) {
																																																																																																																												if (!message
																																																																																																																														.equals(useCase)) {
																																																																																																																													if (!message
																																																																																																																															.equals(useCaseToInteraction)) {
																																																																																																																														if (!useCase
																																																																																																																																.equals(useCaseToInteraction)) {
																																																																																																																															if (!interaction
																																																																																																																																	.equals(packageDeclaration)) {
																																																																																																																																if (!interaction
																																																																																																																																		.equals(sysActor)) {
																																																																																																																																	if (!interaction
																																																																																																																																			.equals(sysLine)) {
																																																																																																																																		if (!interaction
																																																																																																																																				.equals(messageSend)) {
																																																																																																																																			if (!interaction
																																																																																																																																					.equals(sysActorToSysLine)) {
																																																																																																																																				if (!interaction
																																																																																																																																						.equals(operand)) {
																																																																																																																																					if (!interaction
																																																																																																																																							.equals(messageReceive)) {
																																																																																																																																						if (!interaction
																																																																																																																																								.equals(line)) {
																																																																																																																																							if (!interaction
																																																																																																																																									.equals(step)) {
																																																																																																																																								if (!interaction
																																																																																																																																										.equals(message)) {
																																																																																																																																									if (!interaction
																																																																																																																																											.equals(useCase)) {
																																																																																																																																										if (!interaction
																																																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																																																											if (!actorToLine
																																																																																																																																													.equals(packageDeclaration)) {
																																																																																																																																												if (!actorToLine
																																																																																																																																														.equals(sysActor)) {
																																																																																																																																													if (!actorToLine
																																																																																																																																															.equals(sysLine)) {
																																																																																																																																														if (!actorToLine
																																																																																																																																																.equals(messageSend)) {
																																																																																																																																															if (!actorToLine
																																																																																																																																																	.equals(sysActorToSysLine)) {
																																																																																																																																																if (!actorToLine
																																																																																																																																																		.equals(operand)) {
																																																																																																																																																	if (!actorToLine
																																																																																																																																																			.equals(combo)) {
																																																																																																																																																		if (!actorToLine
																																																																																																																																																				.equals(flow)) {
																																																																																																																																																			if (!actorToLine
																																																																																																																																																					.equals(flowToOperand)) {
																																																																																																																																																				if (!actorToLine
																																																																																																																																																						.equals(messageReceive)) {
																																																																																																																																																					if (!actorToLine
																																																																																																																																																							.equals(line)) {
																																																																																																																																																						if (!actorToLine
																																																																																																																																																								.equals(step)) {
																																																																																																																																																							if (!actorToLine
																																																																																																																																																									.equals(message)) {
																																																																																																																																																								if (!actorToLine
																																																																																																																																																										.equals(useCase)) {
																																																																																																																																																									if (!actorToLine
																																																																																																																																																											.equals(interaction)) {
																																																																																																																																																										if (!actorToLine
																																																																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																																																																											return new Object[] {
																																																																																																																																																													ruleresult,
																																																																																																																																																													packageDeclaration,
																																																																																																																																																													sysActor,
																																																																																																																																																													actor,
																																																																																																																																																													sysLine,
																																																																																																																																																													messageSend,
																																																																																																																																																													sysActorToSysLine,
																																																																																																																																																													operand,
																																																																																																																																																													combo,
																																																																																																																																																													flow,
																																																																																																																																																													flowToOperand,
																																																																																																																																																													messageReceive,
																																																																																																																																																													line,
																																																																																																																																																													step,
																																																																																																																																																													message,
																																																																																																																																																													useCase,
																																																																																																																																																													interaction,
																																																																																																																																																													useCaseToInteraction,
																																																																																																																																																													actorToLine };
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject sysLine,
			EObject messageSend, EObject operand, EObject combo, EObject flow,
			EObject messageReceive, EObject line, EObject step,
			EObject message, EObject interaction) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserStepNfToMessageRule";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(messageSend__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		ruleresult.getTranslatedEdges().add(sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(operand__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		ruleresult.getTranslatedEdges().add(sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(combo__sysLine____covered);
		operand__messageReceive____fragment.setSrc(operand);
		operand__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getTranslatedEdges()
				.add(operand__messageReceive____fragment);
		messageReceive__operand____enclosingOperand.setSrc(messageReceive);
		messageReceive__operand____enclosingOperand.setTrg(operand);
		ruleresult.getTranslatedEdges().add(
				messageReceive__operand____enclosingOperand);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		ruleresult.getTranslatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(operand__line____covered);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		ruleresult.getTranslatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(combo__line____covered);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageReceive__message____message);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		ruleresult.getTranslatedEdges()
				.add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(interaction__message____message);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(step__actor____actor);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		operand__messageReceive____fragment
				.setName(operand__messageReceive____fragment_name_prime);
		messageReceive__operand____enclosingOperand
				.setName(messageReceive__operand____enclosingOperand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, actor, sysLine, messageSend, operand,
				combo, flow, messageReceive, line, step, message, interaction,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered, operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				line__operand____coveredBy, operand__line____covered,
				line__combo____coveredBy, combo__line____covered,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_UserStepNfToMessageRule_11_5_expressionBBBBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, PerformRuleResult ruleresult,
			EObject packageDeclaration, EObject sysActor, EObject actor,
			EObject sysLine, EObject messageSend, EObject sysActorToSysLine,
			EObject operand, EObject combo, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject line,
			EObject step, EObject message, EObject useCase,
			EObject interaction, EObject useCaseToInteraction,
			EObject actorToLine) {
		_this.registerObjects_BWD(ruleresult, packageDeclaration, sysActor,
				actor, sysLine, messageSend, sysActorToSysLine, operand, combo,
				flow, flowToOperand, messageReceive, line, step, message,
				useCase, interaction, useCaseToInteraction, actorToLine);

	}

	public static final PerformRuleResult pattern_UserStepNfToMessageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_1_blackFBB(
			EClass eClass, UserStepNfToMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_12_1_binding = pattern_UserStepNfToMessageRule_12_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserStepNfToMessageRule_12_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_12_1_black = pattern_UserStepNfToMessageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserStepNfToMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_2_bindingFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("sysLine");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("operand");
		EObject _localVariable_3 = match.getObject("combo");
		EObject _localVariable_4 = match.getObject("messageReceive");
		EObject _localVariable_5 = match.getObject("line");
		EObject _localVariable_6 = match.getObject("message");
		EObject _localVariable_7 = match.getObject("interaction");
		EObject tmpSysLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpOperand = _localVariable_2;
		EObject tmpCombo = _localVariable_3;
		EObject tmpMessageReceive = _localVariable_4;
		EObject tmpLine = _localVariable_5;
		EObject tmpMessage = _localVariable_6;
		EObject tmpInteraction = _localVariable_7;
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpOperand instanceof InteractionOperand) {
					InteractionOperand operand = (InteractionOperand) tmpOperand;
					if (tmpCombo instanceof CombinedFragment) {
						CombinedFragment combo = (CombinedFragment) tmpCombo;
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (tmpLine instanceof Lifeline) {
								Lifeline line = (Lifeline) tmpLine;
								if (tmpMessage instanceof Message) {
									Message message = (Message) tmpMessage;
									if (tmpInteraction instanceof Interaction) {
										Interaction interaction = (Interaction) tmpInteraction;
										return new Object[] { sysLine,
												messageSend, operand, combo,
												messageReceive, line, message,
												interaction, match };
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

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_12_2_blackFFBBFBBFFBBBFBFFB(
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				for (ActorToLifeline sysActorToSysLine : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(sysLine,
								ActorToLifeline.class, "target")) {
					Actor sysActor = sysActorToSysLine.getSource();
					if (sysActor != null) {
						for (FlowToInteractionFragment flowToOperand : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(operand,
										FlowToInteractionFragment.class,
										"target")) {
							Flow tmpFlow = flowToOperand.getSource();
							if (tmpFlow instanceof NamedFlow) {
								NamedFlow flow = (NamedFlow) tmpFlow;
								for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(interaction,
												UseCaseToInteraction.class,
												"target")) {
									UseCase useCase = useCaseToInteraction
											.getSource();
									if (useCase != null) {
										for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
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
																sysActor,
																actor,
																sysLine,
																messageSend,
																sysActorToSysLine,
																operand,
																combo,
																flow,
																flowToOperand,
																messageReceive,
																line,
																message,
																useCase,
																interaction,
																useCaseToInteraction,
																actorToLine,
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
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_12_3_blackFBBBBBBBBBBBBBBBB(
			Actor sysActor, Actor actor, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			if (!messageReceive.equals(messageSend)) {
				if (!line.equals(sysLine)) {
					if (!actorToLine.equals(sysActorToSysLine)) {
						if (sysLine.getCoveredBy().contains(messageSend)) {
							if (sysLine.getCoveredBy().contains(operand)) {
								if (sysLine.getCoveredBy().contains(combo)) {
									if (sysActor.equals(sysActorToSysLine
											.getSource())) {
										if (sysLine.equals(sysActorToSysLine
												.getTarget())) {
											if (combo.getOperand().contains(
													operand)) {
												if (operand.getFragment()
														.contains(
																messageReceive)) {
													if (flow.equals(flowToOperand
															.getSource())) {
														if (operand
																.equals(flowToOperand
																		.getTarget())) {
															if (line.getCoveredBy()
																	.contains(
																			operand)) {
																if (line.getCoveredBy()
																		.contains(
																				combo)) {
																	if (messageSend
																			.equals(message
																					.getSendEvent())) {
																		if (messageReceive
																				.equals(message
																						.getReceiveEvent())) {
																			if (message
																					.equals(messageSend
																							.getMessage())) {
																				if (message
																						.equals(messageReceive
																								.getMessage())) {
																					if (useCase
																							.getFlows()
																							.contains(
																									flow)) {
																						if (interaction
																								.equals(line
																										.getInteraction())) {
																							if (interaction
																									.equals(message
																											.getInteraction())) {
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
																												for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																sysActor,
																																PackageDeclaration.class,
																																"actors")) {
																													if (packageDeclaration
																															.getActors()
																															.contains(
																																	actor)) {
																														if (packageDeclaration
																																.getUseCases()
																																.contains(
																																		useCase)) {
																															_result.add(new Object[] {
																																	packageDeclaration,
																																	sysActor,
																																	actor,
																																	sysLine,
																																	messageSend,
																																	sysActorToSysLine,
																																	operand,
																																	combo,
																																	flow,
																																	flowToOperand,
																																	messageReceive,
																																	line,
																																	message,
																																	useCase,
																																	interaction,
																																	useCaseToInteraction,
																																	actorToLine });
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_12_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysActor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysLine____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToOperand__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysLine__operand____coveredBy_name_prime = "coveredBy";
		String operand__sysLine____covered_name_prime = "covered";
		String sysLine__combo____coveredBy_name_prime = "coveredBy";
		String combo__sysLine____covered_name_prime = "covered";
		String sysActorToSysLine__sysActor____source_name_prime = "source";
		String sysActorToSysLine__sysLine____target_name_prime = "target";
		String combo__operand____operand_name_prime = "operand";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String flowToOperand__flow____source_name_prime = "source";
		String flowToOperand__operand____target_name_prime = "target";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(sysActor);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(sysLine);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(sysActorToSysLine);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToOperand);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__sysActor____actors);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				messageSend__sysLine____covered);
		sysLine__operand____coveredBy.setSrc(sysLine);
		sysLine__operand____coveredBy.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				sysLine__operand____coveredBy);
		operand__sysLine____covered.setSrc(operand);
		operand__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				operand__sysLine____covered);
		sysLine__combo____coveredBy.setSrc(sysLine);
		sysLine__combo____coveredBy.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				sysLine__combo____coveredBy);
		combo__sysLine____covered.setSrc(combo);
		combo__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements()
				.add(combo__sysLine____covered);
		sysActorToSysLine__sysActor____source.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysActor____source.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysActor____source);
		sysActorToSysLine__sysLine____target.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysLine____target.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysLine____target);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
		operand__messageReceive____fragment.setSrc(operand);
		operand__messageReceive____fragment.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				operand__messageReceive____fragment);
		messageReceive__operand____enclosingOperand.setSrc(messageReceive);
		messageReceive__operand____enclosingOperand.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__operand____enclosingOperand);
		flowToOperand__flow____source.setSrc(flowToOperand);
		flowToOperand__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToOperand__flow____source);
		flowToOperand__operand____target.setSrc(flowToOperand);
		flowToOperand__operand____target.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				flowToOperand__operand____target);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(operand__line____covered);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(combo__line____covered);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__message____message);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				interaction__message____message);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysLine__operand____coveredBy
				.setName(sysLine__operand____coveredBy_name_prime);
		operand__sysLine____covered
				.setName(operand__sysLine____covered_name_prime);
		sysLine__combo____coveredBy
				.setName(sysLine__combo____coveredBy_name_prime);
		combo__sysLine____covered.setName(combo__sysLine____covered_name_prime);
		sysActorToSysLine__sysActor____source
				.setName(sysActorToSysLine__sysActor____source_name_prime);
		sysActorToSysLine__sysLine____target
				.setName(sysActorToSysLine__sysLine____target_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		operand__messageReceive____fragment
				.setName(operand__messageReceive____fragment_name_prime);
		messageReceive__operand____enclosingOperand
				.setName(messageReceive__operand____enclosingOperand_name_prime);
		flowToOperand__flow____source
				.setName(flowToOperand__flow____source_name_prime);
		flowToOperand__operand____target
				.setName(flowToOperand__operand____target_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { packageDeclaration, sysActor, actor, sysLine,
				messageSend, sysActorToSysLine, operand, combo, flow,
				flowToOperand, messageReceive, line, message, useCase,
				interaction, useCaseToInteraction, actorToLine,
				isApplicableMatch, packageDeclaration__sysActor____actors,
				packageDeclaration__actor____actors,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered, sysLine__operand____coveredBy,
				operand__sysLine____covered, sysLine__combo____coveredBy,
				combo__sysLine____covered,
				sysActorToSysLine__sysActor____source,
				sysActorToSysLine__sysLine____target,
				combo__operand____operand, operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				flowToOperand__flow____source,
				flowToOperand__operand____target, line__operand____coveredBy,
				operand__line____covered, line__combo____coveredBy,
				combo__line____covered, message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message, useCase__flow____flows,
				line__interaction____interaction,
				interaction__line____lifeline,
				message__interaction____interaction,
				interaction__message____message,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				actorToLine__actor____source, actorToLine__line____target,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_4_bindingFBBBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, sysActor, actor,
				sysLine, messageSend, sysActorToSysLine, operand, combo, flow,
				flowToOperand, messageReceive, line, message, useCase,
				interaction, useCaseToInteraction, actorToLine);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, sysActor, actor, sysLine, messageSend,
					sysActorToSysLine, operand, combo, flow, flowToOperand,
					messageReceive, line, message, useCase, interaction,
					useCaseToInteraction, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			ActorToLifeline sysActorToSysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		Object[] result_pattern_UserStepNfToMessageRule_12_4_binding = pattern_UserStepNfToMessageRule_12_4_bindingFBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, sysActor, actor,
				sysLine, messageSend, sysActorToSysLine, operand, combo, flow,
				flowToOperand, messageReceive, line, message, useCase,
				interaction, useCaseToInteraction, actorToLine);
		if (result_pattern_UserStepNfToMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_12_4_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_12_4_black = pattern_UserStepNfToMessageRule_12_4_blackB(csp);
			if (result_pattern_UserStepNfToMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, sysActor, actor, sysLine,
						messageSend, sysActorToSysLine, operand, combo, flow,
						flowToOperand, messageReceive, line, message, useCase,
						interaction, useCaseToInteraction, actorToLine };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepNfToMessageRule_12_5_expressionFBB(
			UserStepNfToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserStepNfToMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserStepNfToMessageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_20_1_binding = pattern_UserStepNfToMessageRule_20_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_20_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_20_1_black = pattern_UserStepNfToMessageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_734886 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_734886 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_734886)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_204344 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_204344 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_204344)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_229388 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_229388)) {
					if (!messageReceive.equals(__DEC_message_message_229388)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_20_2_blackFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpMessageSend = _edge_coveredBy.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (sysLine.getCoveredBy().contains(messageSend)) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (!messageReceive.equals(messageSend)) {
									if (message.equals(messageReceive
											.getMessage())) {
										Interaction interaction = message
												.getInteraction();
										if (interaction != null) {
											InteractionOperand operand = messageReceive
													.getEnclosingOperand();
											if (operand != null) {
												if (sysLine.getCoveredBy()
														.contains(operand)) {
													if (pattern_UserStepNfToMessageRule_20_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_20_2_black_nac_2BBB(
																message,
																messageSend,
																messageReceive) == null) {
															if (pattern_UserStepNfToMessageRule_20_2_black_nac_7BB(
																	message,
																	messageReceive) == null) {
																if (pattern_UserStepNfToMessageRule_20_2_black_nac_0BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_20_2_black_nac_1BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_20_2_black_nac_3BB(
																				messageSend,
																				interaction) == null) {
																			if (pattern_UserStepNfToMessageRule_20_2_black_nac_6BB(
																					messageReceive,
																					interaction) == null) {
																				if (pattern_UserStepNfToMessageRule_20_2_black_nac_5BB(
																						operand,
																						messageSend) == null) {
																					for (InteractionFragment tmpCombo : sysLine
																							.getCoveredBy()) {
																						if (tmpCombo instanceof CombinedFragment) {
																							CombinedFragment combo = (CombinedFragment) tmpCombo;
																							if (combo
																									.getOperand()
																									.contains(
																											operand)) {
																								for (Lifeline line : interaction
																										.getLifeline()) {
																									if (!line
																											.equals(sysLine)) {
																										if (line.getCoveredBy()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_20_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_20_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_21_1_binding = pattern_UserStepNfToMessageRule_21_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_21_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_21_1_black = pattern_UserStepNfToMessageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_718288 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_718288 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_718288)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_71842 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_71842 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_71842)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_727159 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_727159)) {
					if (!messageReceive.equals(__DEC_message_message_727159)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_21_2_blackFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(messageSend)) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (!messageReceive.equals(messageSend)) {
									if (message.equals(messageReceive
											.getMessage())) {
										Interaction interaction = message
												.getInteraction();
										if (interaction != null) {
											InteractionOperand operand = messageReceive
													.getEnclosingOperand();
											if (operand != null) {
												if (sysLine.getCoveredBy()
														.contains(operand)) {
													if (pattern_UserStepNfToMessageRule_21_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_21_2_black_nac_2BBB(
																message,
																messageSend,
																messageReceive) == null) {
															if (pattern_UserStepNfToMessageRule_21_2_black_nac_7BB(
																	message,
																	messageReceive) == null) {
																if (pattern_UserStepNfToMessageRule_21_2_black_nac_0BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_21_2_black_nac_1BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_21_2_black_nac_3BB(
																				messageSend,
																				interaction) == null) {
																			if (pattern_UserStepNfToMessageRule_21_2_black_nac_6BB(
																					messageReceive,
																					interaction) == null) {
																				if (pattern_UserStepNfToMessageRule_21_2_black_nac_5BB(
																						operand,
																						messageSend) == null) {
																					for (InteractionFragment tmpCombo : sysLine
																							.getCoveredBy()) {
																						if (tmpCombo instanceof CombinedFragment) {
																							CombinedFragment combo = (CombinedFragment) tmpCombo;
																							if (combo
																									.getOperand()
																									.contains(
																											operand)) {
																								for (Lifeline line : interaction
																										.getLifeline()) {
																									if (!line
																											.equals(sysLine)) {
																										if (line.getCoveredBy()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_21_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_21_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_22_1_binding = pattern_UserStepNfToMessageRule_22_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_22_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_22_1_black = pattern_UserStepNfToMessageRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_981105 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_981105 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_981105)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_401803 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_401803 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_401803)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_579788 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_579788)) {
					if (!messageReceive.equals(__DEC_message_message_579788)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_22_2_blackFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpOperand = _edge_coveredBy.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (sysLine.getCoveredBy().contains(operand)) {
					for (InteractionFragment tmpMessageSend : sysLine
							.getCoveredBy()) {
						if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
							Message message = messageSend.getMessage();
							if (message != null) {
								if (messageSend.equals(message.getSendEvent())) {
									MessageEnd tmpMessageReceive = message
											.getReceiveEvent();
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (operand.getFragment().contains(
													messageReceive)) {
												if (message
														.equals(messageReceive
																.getMessage())) {
													Interaction interaction = message
															.getInteraction();
													if (interaction != null) {
														if (pattern_UserStepNfToMessageRule_22_2_black_nac_5BB(
																operand,
																messageSend) == null) {
															if (pattern_UserStepNfToMessageRule_22_2_black_nac_4BB(
																	message,
																	messageSend) == null) {
																if (pattern_UserStepNfToMessageRule_22_2_black_nac_2BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_UserStepNfToMessageRule_22_2_black_nac_7BB(
																			message,
																			messageReceive) == null) {
																		if (pattern_UserStepNfToMessageRule_22_2_black_nac_0BB(
																				messageSend,
																				interaction) == null) {
																			if (pattern_UserStepNfToMessageRule_22_2_black_nac_1BB(
																					messageReceive,
																					interaction) == null) {
																				if (pattern_UserStepNfToMessageRule_22_2_black_nac_3BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_22_2_black_nac_6BB(
																							messageReceive,
																							interaction) == null) {
																						for (InteractionFragment tmpCombo : sysLine
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									for (Lifeline line : operand
																											.getCovered()) {
																										if (!line
																												.equals(sysLine)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												if (interaction
																														.equals(line
																																.getInteraction())) {
																													_result.add(new Object[] {
																															sysLine,
																															messageSend,
																															operand,
																															combo,
																															messageReceive,
																															line,
																															message,
																															interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_22_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_22_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_23_1_binding = pattern_UserStepNfToMessageRule_23_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_23_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_23_1_black = pattern_UserStepNfToMessageRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_384578 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_384578 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_384578)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_392816 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_392816 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_392816)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_326708 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_326708)) {
					if (!messageReceive.equals(__DEC_message_message_326708)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_23_2_blackFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_covered.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(operand)) {
					for (InteractionFragment tmpMessageReceive : operand
							.getFragment()) {
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							Message message = messageReceive.getMessage();
							if (message != null) {
								if (messageReceive.equals(message
										.getReceiveEvent())) {
									MessageEnd tmpMessageSend = message
											.getSendEvent();
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (!messageReceive.equals(messageSend)) {
											if (sysLine.getCoveredBy()
													.contains(messageSend)) {
												if (message.equals(messageSend
														.getMessage())) {
													Interaction interaction = message
															.getInteraction();
													if (interaction != null) {
														if (pattern_UserStepNfToMessageRule_23_2_black_nac_7BB(
																message,
																messageReceive) == null) {
															if (pattern_UserStepNfToMessageRule_23_2_black_nac_2BBB(
																	message,
																	messageSend,
																	messageReceive) == null) {
																if (pattern_UserStepNfToMessageRule_23_2_black_nac_4BB(
																		message,
																		messageSend) == null) {
																	if (pattern_UserStepNfToMessageRule_23_2_black_nac_5BB(
																			operand,
																			messageSend) == null) {
																		if (pattern_UserStepNfToMessageRule_23_2_black_nac_0BB(
																				messageSend,
																				interaction) == null) {
																			if (pattern_UserStepNfToMessageRule_23_2_black_nac_1BB(
																					messageReceive,
																					interaction) == null) {
																				if (pattern_UserStepNfToMessageRule_23_2_black_nac_3BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_23_2_black_nac_6BB(
																							messageReceive,
																							interaction) == null) {
																						for (Lifeline line : operand
																								.getCovered()) {
																							if (!line
																									.equals(sysLine)) {
																								if (interaction
																										.equals(line
																												.getInteraction())) {
																									for (InteractionFragment tmpCombo : sysLine
																											.getCoveredBy()) {
																										if (tmpCombo instanceof CombinedFragment) {
																											CombinedFragment combo = (CombinedFragment) tmpCombo;
																											if (combo
																													.getOperand()
																													.contains(
																															operand)) {
																												if (line.getCoveredBy()
																														.contains(
																																combo)) {
																													_result.add(new Object[] {
																															sysLine,
																															messageSend,
																															operand,
																															combo,
																															messageReceive,
																															line,
																															message,
																															interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_23_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_23_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_24_1_binding = pattern_UserStepNfToMessageRule_24_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_24_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_24_1_black = pattern_UserStepNfToMessageRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_314116 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_314116 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_314116)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_44345 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_44345 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_44345)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_995851 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_995851)) {
					if (!messageReceive.equals(__DEC_message_message_995851)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_24_2_blackFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpCombo = _edge_coveredBy.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (sysLine.getCoveredBy().contains(combo)) {
					for (InteractionFragment tmpMessageSend : sysLine
							.getCoveredBy()) {
						if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
							Message message = messageSend.getMessage();
							if (message != null) {
								if (messageSend.equals(message.getSendEvent())) {
									MessageEnd tmpMessageReceive = message
											.getReceiveEvent();
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (message.equals(messageReceive
													.getMessage())) {
												Interaction interaction = message
														.getInteraction();
												if (interaction != null) {
													InteractionOperand operand = messageReceive
															.getEnclosingOperand();
													if (operand != null) {
														if (sysLine
																.getCoveredBy()
																.contains(
																		operand)) {
															if (combo
																	.getOperand()
																	.contains(
																			operand)) {
																if (pattern_UserStepNfToMessageRule_24_2_black_nac_4BB(
																		message,
																		messageSend) == null) {
																	if (pattern_UserStepNfToMessageRule_24_2_black_nac_2BBB(
																			message,
																			messageSend,
																			messageReceive) == null) {
																		if (pattern_UserStepNfToMessageRule_24_2_black_nac_7BB(
																				message,
																				messageReceive) == null) {
																			if (pattern_UserStepNfToMessageRule_24_2_black_nac_0BB(
																					messageSend,
																					interaction) == null) {
																				if (pattern_UserStepNfToMessageRule_24_2_black_nac_1BB(
																						messageReceive,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_24_2_black_nac_3BB(
																							messageSend,
																							interaction) == null) {
																						if (pattern_UserStepNfToMessageRule_24_2_black_nac_6BB(
																								messageReceive,
																								interaction) == null) {
																							if (pattern_UserStepNfToMessageRule_24_2_black_nac_5BB(
																									operand,
																									messageSend) == null) {
																								for (Lifeline line : combo
																										.getCovered()) {
																									if (!line
																											.equals(sysLine)) {
																										if (line.getCoveredBy()
																												.contains(
																														operand)) {
																											if (interaction
																													.equals(line
																															.getInteraction())) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_24_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_24_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_25_1_binding = pattern_UserStepNfToMessageRule_25_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_25_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_25_1_black = pattern_UserStepNfToMessageRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_864084 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_864084 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_864084)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_469875 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_469875 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_469875)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_326831 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_326831)) {
					if (!messageReceive.equals(__DEC_message_message_326831)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_25_2_blackFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_covered.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(combo)) {
					for (InteractionOperand operand : combo.getOperand()) {
						if (sysLine.getCoveredBy().contains(operand)) {
							for (Lifeline line : combo.getCovered()) {
								if (!line.equals(sysLine)) {
									if (line.getCoveredBy().contains(operand)) {
										Interaction interaction = line
												.getInteraction();
										if (interaction != null) {
											for (InteractionFragment tmpMessageSend : sysLine
													.getCoveredBy()) {
												if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
													Message message = messageSend
															.getMessage();
													if (message != null) {
														if (messageSend
																.equals(message
																		.getSendEvent())) {
															if (interaction
																	.equals(message
																			.getInteraction())) {
																MessageEnd tmpMessageReceive = message
																		.getReceiveEvent();
																if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																	MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																	if (!messageReceive
																			.equals(messageSend)) {
																		if (operand
																				.getFragment()
																				.contains(
																						messageReceive)) {
																			if (message
																					.equals(messageReceive
																							.getMessage())) {
																				if (pattern_UserStepNfToMessageRule_25_2_black_nac_0BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_25_2_black_nac_3BB(
																							messageSend,
																							interaction) == null) {
																						if (pattern_UserStepNfToMessageRule_25_2_black_nac_5BB(
																								operand,
																								messageSend) == null) {
																							if (pattern_UserStepNfToMessageRule_25_2_black_nac_4BB(
																									message,
																									messageSend) == null) {
																								if (pattern_UserStepNfToMessageRule_25_2_black_nac_1BB(
																										messageReceive,
																										interaction) == null) {
																									if (pattern_UserStepNfToMessageRule_25_2_black_nac_2BBB(
																											message,
																											messageSend,
																											messageReceive) == null) {
																										if (pattern_UserStepNfToMessageRule_25_2_black_nac_6BB(
																												messageReceive,
																												interaction) == null) {
																											if (pattern_UserStepNfToMessageRule_25_2_black_nac_7BB(
																													message,
																													messageReceive) == null) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_25_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_25_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_26_1_binding = pattern_UserStepNfToMessageRule_26_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_26_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_26_1_black = pattern_UserStepNfToMessageRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_929175 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_929175 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_929175)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_565623 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_565623 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_565623)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_138636 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_138636)) {
					if (!messageReceive.equals(__DEC_message_message_138636)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_26_2_blackFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_fragment.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpMessageReceive = _edge_fragment.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (operand.getFragment().contains(messageReceive)) {
					Message message = messageReceive.getMessage();
					if (message != null) {
						if (messageReceive.equals(message.getReceiveEvent())) {
							MessageEnd tmpMessageSend = message.getSendEvent();
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (!messageReceive.equals(messageSend)) {
									if (message
											.equals(messageSend.getMessage())) {
										Interaction interaction = message
												.getInteraction();
										if (interaction != null) {
											if (pattern_UserStepNfToMessageRule_26_2_black_nac_7BB(
													message, messageReceive) == null) {
												if (pattern_UserStepNfToMessageRule_26_2_black_nac_2BBB(
														message, messageSend,
														messageReceive) == null) {
													if (pattern_UserStepNfToMessageRule_26_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_26_2_black_nac_5BB(
																operand,
																messageSend) == null) {
															if (pattern_UserStepNfToMessageRule_26_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_UserStepNfToMessageRule_26_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_26_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_26_2_black_nac_6BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline sysLine : operand
																					.getCovered()) {
																				if (sysLine
																						.getCoveredBy()
																						.contains(
																								messageSend)) {
																					for (Lifeline line : operand
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (interaction
																									.equals(line
																											.getInteraction())) {
																								for (InteractionFragment tmpCombo : sysLine
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (combo
																												.getOperand()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_26_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_26_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_27_1_binding = pattern_UserStepNfToMessageRule_27_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_27_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_27_1_black = pattern_UserStepNfToMessageRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_96844 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_96844 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_96844)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_875105 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_875105 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_875105)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_773540 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_773540)) {
					if (!messageReceive.equals(__DEC_message_message_773540)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_27_2_blackFFFFFFFFB(
			EMoflonEdge _edge_enclosingOperand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_enclosingOperand.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpOperand = _edge_enclosingOperand.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (operand.getFragment().contains(messageReceive)) {
					Message message = messageReceive.getMessage();
					if (message != null) {
						if (messageReceive.equals(message.getReceiveEvent())) {
							MessageEnd tmpMessageSend = message.getSendEvent();
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (!messageReceive.equals(messageSend)) {
									if (message
											.equals(messageSend.getMessage())) {
										Interaction interaction = message
												.getInteraction();
										if (interaction != null) {
											if (pattern_UserStepNfToMessageRule_27_2_black_nac_7BB(
													message, messageReceive) == null) {
												if (pattern_UserStepNfToMessageRule_27_2_black_nac_2BBB(
														message, messageSend,
														messageReceive) == null) {
													if (pattern_UserStepNfToMessageRule_27_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_27_2_black_nac_5BB(
																operand,
																messageSend) == null) {
															if (pattern_UserStepNfToMessageRule_27_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_UserStepNfToMessageRule_27_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_27_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_27_2_black_nac_6BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline sysLine : operand
																					.getCovered()) {
																				if (sysLine
																						.getCoveredBy()
																						.contains(
																								messageSend)) {
																					for (Lifeline line : operand
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (interaction
																									.equals(line
																											.getInteraction())) {
																								for (InteractionFragment tmpCombo : sysLine
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (combo
																												.getOperand()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_27_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_27_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_28_1_binding = pattern_UserStepNfToMessageRule_28_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_28_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_28_1_black = pattern_UserStepNfToMessageRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_305482 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_305482 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_305482)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_684937 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_684937 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_684937)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_369308 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_369308)) {
					if (!messageReceive.equals(__DEC_message_message_369308)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_28_2_blackFFFFFFFFB(
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
						for (InteractionFragment tmpCombo : line.getCoveredBy()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								if (combo.getOperand().contains(operand)) {
									for (Lifeline sysLine : operand
											.getCovered()) {
										if (!line.equals(sysLine)) {
											if (sysLine.getCoveredBy()
													.contains(combo)) {
												for (InteractionFragment tmpMessageReceive : operand
														.getFragment()) {
													if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
														MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
														Message message = messageReceive
																.getMessage();
														if (message != null) {
															if (messageReceive
																	.equals(message
																			.getReceiveEvent())) {
																if (interaction
																		.equals(message
																				.getInteraction())) {
																	MessageEnd tmpMessageSend = message
																			.getSendEvent();
																	if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																		if (!messageReceive
																				.equals(messageSend)) {
																			if (sysLine
																					.getCoveredBy()
																					.contains(
																							messageSend)) {
																				if (message
																						.equals(messageSend
																								.getMessage())) {
																					if (pattern_UserStepNfToMessageRule_28_2_black_nac_1BB(
																							messageReceive,
																							interaction) == null) {
																						if (pattern_UserStepNfToMessageRule_28_2_black_nac_6BB(
																								messageReceive,
																								interaction) == null) {
																							if (pattern_UserStepNfToMessageRule_28_2_black_nac_7BB(
																									message,
																									messageReceive) == null) {
																								if (pattern_UserStepNfToMessageRule_28_2_black_nac_0BB(
																										messageSend,
																										interaction) == null) {
																									if (pattern_UserStepNfToMessageRule_28_2_black_nac_2BBB(
																											message,
																											messageSend,
																											messageReceive) == null) {
																										if (pattern_UserStepNfToMessageRule_28_2_black_nac_3BB(
																												messageSend,
																												interaction) == null) {
																											if (pattern_UserStepNfToMessageRule_28_2_black_nac_4BB(
																													message,
																													messageSend) == null) {
																												if (pattern_UserStepNfToMessageRule_28_2_black_nac_5BB(
																														operand,
																														messageSend) == null) {
																													_result.add(new Object[] {
																															sysLine,
																															messageSend,
																															operand,
																															combo,
																															messageReceive,
																															line,
																															message,
																															interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_28_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_28_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_29_1_binding = pattern_UserStepNfToMessageRule_29_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_29_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_29_1_black = pattern_UserStepNfToMessageRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_32702 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_32702 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_32702)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_510264 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_510264 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_510264)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_954283 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_954283)) {
					if (!messageReceive.equals(__DEC_message_message_954283)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_29_2_blackFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_covered.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(operand)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						for (Lifeline sysLine : operand.getCovered()) {
							if (!line.equals(sysLine)) {
								for (InteractionFragment tmpMessageReceive : operand
										.getFragment()) {
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										Message message = messageReceive
												.getMessage();
										if (message != null) {
											if (messageReceive.equals(message
													.getReceiveEvent())) {
												if (interaction.equals(message
														.getInteraction())) {
													MessageEnd tmpMessageSend = message
															.getSendEvent();
													if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
														MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
														if (!messageReceive
																.equals(messageSend)) {
															if (sysLine
																	.getCoveredBy()
																	.contains(
																			messageSend)) {
																if (message
																		.equals(messageSend
																				.getMessage())) {
																	if (pattern_UserStepNfToMessageRule_29_2_black_nac_1BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_29_2_black_nac_6BB(
																				messageReceive,
																				interaction) == null) {
																			if (pattern_UserStepNfToMessageRule_29_2_black_nac_7BB(
																					message,
																					messageReceive) == null) {
																				if (pattern_UserStepNfToMessageRule_29_2_black_nac_0BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_29_2_black_nac_2BBB(
																							message,
																							messageSend,
																							messageReceive) == null) {
																						if (pattern_UserStepNfToMessageRule_29_2_black_nac_3BB(
																								messageSend,
																								interaction) == null) {
																							if (pattern_UserStepNfToMessageRule_29_2_black_nac_4BB(
																									message,
																									messageSend) == null) {
																								if (pattern_UserStepNfToMessageRule_29_2_black_nac_5BB(
																										operand,
																										messageSend) == null) {
																									for (InteractionFragment tmpCombo : line
																											.getCoveredBy()) {
																										if (tmpCombo instanceof CombinedFragment) {
																											CombinedFragment combo = (CombinedFragment) tmpCombo;
																											if (sysLine
																													.getCoveredBy()
																													.contains(
																															combo)) {
																												if (combo
																														.getOperand()
																														.contains(
																																operand)) {
																													_result.add(new Object[] {
																															sysLine,
																															messageSend,
																															operand,
																															combo,
																															messageReceive,
																															line,
																															message,
																															interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_29_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_29_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_30_1_binding = pattern_UserStepNfToMessageRule_30_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_30_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_30_1_black = pattern_UserStepNfToMessageRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_419195 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_419195 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_419195)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_622440 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_622440 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_622440)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_885683 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_885683)) {
					if (!messageReceive.equals(__DEC_message_message_885683)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_30_2_blackFFFFFFFFB(
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
						for (InteractionFragment tmpOperand : line
								.getCoveredBy()) {
							if (tmpOperand instanceof InteractionOperand) {
								InteractionOperand operand = (InteractionOperand) tmpOperand;
								if (combo.getOperand().contains(operand)) {
									for (Lifeline sysLine : combo.getCovered()) {
										if (!line.equals(sysLine)) {
											if (sysLine.getCoveredBy()
													.contains(operand)) {
												for (Message message : interaction
														.getMessage()) {
													MessageEnd tmpMessageSend = message
															.getSendEvent();
													if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
														MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
														if (sysLine
																.getCoveredBy()
																.contains(
																		messageSend)) {
															if (message
																	.equals(messageSend
																			.getMessage())) {
																MessageEnd tmpMessageReceive = message
																		.getReceiveEvent();
																if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																	MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																	if (!messageReceive
																			.equals(messageSend)) {
																		if (operand
																				.getFragment()
																				.contains(
																						messageReceive)) {
																			if (message
																					.equals(messageReceive
																							.getMessage())) {
																				if (pattern_UserStepNfToMessageRule_30_2_black_nac_0BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_30_2_black_nac_3BB(
																							messageSend,
																							interaction) == null) {
																						if (pattern_UserStepNfToMessageRule_30_2_black_nac_4BB(
																								message,
																								messageSend) == null) {
																							if (pattern_UserStepNfToMessageRule_30_2_black_nac_5BB(
																									operand,
																									messageSend) == null) {
																								if (pattern_UserStepNfToMessageRule_30_2_black_nac_1BB(
																										messageReceive,
																										interaction) == null) {
																									if (pattern_UserStepNfToMessageRule_30_2_black_nac_2BBB(
																											message,
																											messageSend,
																											messageReceive) == null) {
																										if (pattern_UserStepNfToMessageRule_30_2_black_nac_6BB(
																												messageReceive,
																												interaction) == null) {
																											if (pattern_UserStepNfToMessageRule_30_2_black_nac_7BB(
																													message,
																													messageReceive) == null) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_30_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_30_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_31_1_binding = pattern_UserStepNfToMessageRule_31_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_31_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_31_1_black = pattern_UserStepNfToMessageRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_946488 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_946488 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_946488)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_242473 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_242473 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_242473)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_629816 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_629816)) {
					if (!messageReceive.equals(__DEC_message_message_629816)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_31_2_blackFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_covered.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(combo)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						for (Lifeline sysLine : combo.getCovered()) {
							if (!line.equals(sysLine)) {
								for (InteractionOperand operand : combo
										.getOperand()) {
									if (sysLine.getCoveredBy()
											.contains(operand)) {
										if (line.getCoveredBy().contains(
												operand)) {
											for (Message message : interaction
													.getMessage()) {
												MessageEnd tmpMessageSend = message
														.getSendEvent();
												if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
													if (sysLine
															.getCoveredBy()
															.contains(
																	messageSend)) {
														if (message
																.equals(messageSend
																		.getMessage())) {
															MessageEnd tmpMessageReceive = message
																	.getReceiveEvent();
															if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																if (!messageReceive
																		.equals(messageSend)) {
																	if (operand
																			.getFragment()
																			.contains(
																					messageReceive)) {
																		if (message
																				.equals(messageReceive
																						.getMessage())) {
																			if (pattern_UserStepNfToMessageRule_31_2_black_nac_0BB(
																					messageSend,
																					interaction) == null) {
																				if (pattern_UserStepNfToMessageRule_31_2_black_nac_3BB(
																						messageSend,
																						interaction) == null) {
																					if (pattern_UserStepNfToMessageRule_31_2_black_nac_4BB(
																							message,
																							messageSend) == null) {
																						if (pattern_UserStepNfToMessageRule_31_2_black_nac_5BB(
																								operand,
																								messageSend) == null) {
																							if (pattern_UserStepNfToMessageRule_31_2_black_nac_1BB(
																									messageReceive,
																									interaction) == null) {
																								if (pattern_UserStepNfToMessageRule_31_2_black_nac_2BBB(
																										message,
																										messageSend,
																										messageReceive) == null) {
																									if (pattern_UserStepNfToMessageRule_31_2_black_nac_6BB(
																											messageReceive,
																											interaction) == null) {
																										if (pattern_UserStepNfToMessageRule_31_2_black_nac_7BB(
																												message,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													sysLine,
																													messageSend,
																													operand,
																													combo,
																													messageReceive,
																													line,
																													message,
																													interaction,
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

	public static final Object[] pattern_UserStepNfToMessageRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_31_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_31_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_32_1_binding = pattern_UserStepNfToMessageRule_32_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_32_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_32_1_black = pattern_UserStepNfToMessageRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_992711 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_992711 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_992711)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_110812 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_110812 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_110812)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_24105 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_24105)) {
					if (!messageReceive.equals(__DEC_message_message_24105)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_32_2_blackFFFFFFFFB(
			EMoflonEdge _edge_sendEvent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_sendEvent.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpMessageSend = _edge_sendEvent.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (messageSend.equals(message.getSendEvent())) {
					if (message.equals(messageSend.getMessage())) {
						MessageEnd tmpMessageReceive = message
								.getReceiveEvent();
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (!messageReceive.equals(messageSend)) {
								if (message.equals(messageReceive.getMessage())) {
									Interaction interaction = message
											.getInteraction();
									if (interaction != null) {
										InteractionOperand operand = messageReceive
												.getEnclosingOperand();
										if (operand != null) {
											if (pattern_UserStepNfToMessageRule_32_2_black_nac_4BB(
													message, messageSend) == null) {
												if (pattern_UserStepNfToMessageRule_32_2_black_nac_2BBB(
														message, messageSend,
														messageReceive) == null) {
													if (pattern_UserStepNfToMessageRule_32_2_black_nac_7BB(
															message,
															messageReceive) == null) {
														if (pattern_UserStepNfToMessageRule_32_2_black_nac_0BB(
																messageSend,
																interaction) == null) {
															if (pattern_UserStepNfToMessageRule_32_2_black_nac_1BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_UserStepNfToMessageRule_32_2_black_nac_3BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_32_2_black_nac_6BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_32_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			for (Lifeline sysLine : messageSend
																					.getCovered()) {
																				if (sysLine
																						.getCoveredBy()
																						.contains(
																								operand)) {
																					for (Lifeline line : interaction
																							.getLifeline()) {
																						if (!line
																								.equals(sysLine)) {
																							if (line.getCoveredBy()
																									.contains(
																											operand)) {
																								for (InteractionFragment tmpCombo : sysLine
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (combo
																												.getOperand()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
																														_edge_sendEvent });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_32_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_32_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_33_1_binding = pattern_UserStepNfToMessageRule_33_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_33_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_33_1_black = pattern_UserStepNfToMessageRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_467786 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_467786 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_467786)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_589190 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_589190 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_589190)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_849217 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_849217)) {
					if (!messageReceive.equals(__DEC_message_message_849217)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_33_2_blackFFFFFFFFB(
			EMoflonEdge _edge_receiveEvent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_receiveEvent.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpMessageReceive = _edge_receiveEvent.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (messageReceive.equals(message.getReceiveEvent())) {
					if (message.equals(messageReceive.getMessage())) {
						MessageEnd tmpMessageSend = message.getSendEvent();
						if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
							if (!messageReceive.equals(messageSend)) {
								if (message.equals(messageSend.getMessage())) {
									Interaction interaction = message
											.getInteraction();
									if (interaction != null) {
										InteractionOperand operand = messageReceive
												.getEnclosingOperand();
										if (operand != null) {
											if (pattern_UserStepNfToMessageRule_33_2_black_nac_7BB(
													message, messageReceive) == null) {
												if (pattern_UserStepNfToMessageRule_33_2_black_nac_2BBB(
														message, messageSend,
														messageReceive) == null) {
													if (pattern_UserStepNfToMessageRule_33_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_33_2_black_nac_0BB(
																messageSend,
																interaction) == null) {
															if (pattern_UserStepNfToMessageRule_33_2_black_nac_1BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_UserStepNfToMessageRule_33_2_black_nac_3BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_33_2_black_nac_6BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_33_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			for (Lifeline sysLine : messageSend
																					.getCovered()) {
																				if (sysLine
																						.getCoveredBy()
																						.contains(
																								operand)) {
																					for (Lifeline line : interaction
																							.getLifeline()) {
																						if (!line
																								.equals(sysLine)) {
																							if (line.getCoveredBy()
																									.contains(
																											operand)) {
																								for (InteractionFragment tmpCombo : sysLine
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (combo
																												.getOperand()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
																														_edge_receiveEvent });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_33_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_33_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_34_1_binding = pattern_UserStepNfToMessageRule_34_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_34_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_34_1_black = pattern_UserStepNfToMessageRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_624111 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_624111 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_624111)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_337470 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_337470 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_337470)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_965592 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_965592)) {
					if (!messageReceive.equals(__DEC_message_message_965592)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_34_2_blackFFFFFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_message.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (messageSend.equals(message.getSendEvent())) {
					if (message.equals(messageSend.getMessage())) {
						MessageEnd tmpMessageReceive = message
								.getReceiveEvent();
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (!messageReceive.equals(messageSend)) {
								if (message.equals(messageReceive.getMessage())) {
									Interaction interaction = message
											.getInteraction();
									if (interaction != null) {
										InteractionOperand operand = messageReceive
												.getEnclosingOperand();
										if (operand != null) {
											if (pattern_UserStepNfToMessageRule_34_2_black_nac_4BB(
													message, messageSend) == null) {
												if (pattern_UserStepNfToMessageRule_34_2_black_nac_2BBB(
														message, messageSend,
														messageReceive) == null) {
													if (pattern_UserStepNfToMessageRule_34_2_black_nac_7BB(
															message,
															messageReceive) == null) {
														if (pattern_UserStepNfToMessageRule_34_2_black_nac_0BB(
																messageSend,
																interaction) == null) {
															if (pattern_UserStepNfToMessageRule_34_2_black_nac_1BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_UserStepNfToMessageRule_34_2_black_nac_3BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_34_2_black_nac_6BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_34_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			for (Lifeline sysLine : messageSend
																					.getCovered()) {
																				if (sysLine
																						.getCoveredBy()
																						.contains(
																								operand)) {
																					for (Lifeline line : interaction
																							.getLifeline()) {
																						if (!line
																								.equals(sysLine)) {
																							if (line.getCoveredBy()
																									.contains(
																											operand)) {
																								for (InteractionFragment tmpCombo : sysLine
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (combo
																												.getOperand()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
																														_edge_message });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_34_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_34_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_35_1_binding = pattern_UserStepNfToMessageRule_35_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_35_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_35_1_black = pattern_UserStepNfToMessageRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_568613 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_568613 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_568613)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_652322 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_652322 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_652322)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_563171 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_563171)) {
					if (!messageReceive.equals(__DEC_message_message_563171)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_35_2_blackFFFFFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_message.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (messageReceive.equals(message.getReceiveEvent())) {
					if (message.equals(messageReceive.getMessage())) {
						InteractionOperand operand = messageReceive
								.getEnclosingOperand();
						if (operand != null) {
							MessageEnd tmpMessageSend = message.getSendEvent();
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (!messageReceive.equals(messageSend)) {
									if (message
											.equals(messageSend.getMessage())) {
										Interaction interaction = message
												.getInteraction();
										if (interaction != null) {
											if (pattern_UserStepNfToMessageRule_35_2_black_nac_7BB(
													message, messageReceive) == null) {
												if (pattern_UserStepNfToMessageRule_35_2_black_nac_2BBB(
														message, messageSend,
														messageReceive) == null) {
													if (pattern_UserStepNfToMessageRule_35_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_35_2_black_nac_5BB(
																operand,
																messageSend) == null) {
															if (pattern_UserStepNfToMessageRule_35_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_UserStepNfToMessageRule_35_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_35_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_UserStepNfToMessageRule_35_2_black_nac_6BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline sysLine : operand
																					.getCovered()) {
																				if (sysLine
																						.getCoveredBy()
																						.contains(
																								messageSend)) {
																					for (Lifeline line : operand
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (interaction
																									.equals(line
																											.getInteraction())) {
																								for (InteractionFragment tmpCombo : sysLine
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (combo
																												.getOperand()
																												.contains(
																														operand)) {
																											if (line.getCoveredBy()
																													.contains(
																															combo)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
																														_edge_message });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_35_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_35_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_36_1_binding = pattern_UserStepNfToMessageRule_36_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_36_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_36_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_36_1_black = pattern_UserStepNfToMessageRule_36_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_36_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_36_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_669289 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_669289 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_669289)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_473296 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_473296 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_473296)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_604277 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_604277)) {
					if (!messageReceive.equals(__DEC_message_message_604277)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_36_2_blackFFFFFFFFB(
			EMoflonEdge _edge_interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_interaction.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpInteraction = _edge_interaction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(message.getInteraction())) {
					MessageEnd tmpMessageSend = message.getSendEvent();
					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
						if (message.equals(messageSend.getMessage())) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (!messageReceive.equals(messageSend)) {
									if (message.equals(messageReceive
											.getMessage())) {
										InteractionOperand operand = messageReceive
												.getEnclosingOperand();
										if (operand != null) {
											if (pattern_UserStepNfToMessageRule_36_2_black_nac_0BB(
													messageSend, interaction) == null) {
												if (pattern_UserStepNfToMessageRule_36_2_black_nac_3BB(
														messageSend,
														interaction) == null) {
													if (pattern_UserStepNfToMessageRule_36_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_36_2_black_nac_1BB(
																messageReceive,
																interaction) == null) {
															if (pattern_UserStepNfToMessageRule_36_2_black_nac_2BBB(
																	message,
																	messageSend,
																	messageReceive) == null) {
																if (pattern_UserStepNfToMessageRule_36_2_black_nac_6BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_36_2_black_nac_7BB(
																			message,
																			messageReceive) == null) {
																		if (pattern_UserStepNfToMessageRule_36_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			for (Lifeline line : interaction
																					.getLifeline()) {
																				if (line.getCoveredBy()
																						.contains(
																								operand)) {
																					for (Lifeline sysLine : messageSend
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (sysLine
																									.getCoveredBy()
																									.contains(
																											operand)) {
																								for (InteractionFragment tmpCombo : line
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (sysLine
																												.getCoveredBy()
																												.contains(
																														combo)) {
																											if (combo
																													.getOperand()
																													.contains(
																															operand)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
																														_edge_interaction });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_36_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_36_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_36_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_36_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_36_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_37_1_binding = pattern_UserStepNfToMessageRule_37_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_37_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_37_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_37_1_black = pattern_UserStepNfToMessageRule_37_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_37_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_37_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_174682 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_174682 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_174682)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_476460 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_476460 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_476460)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_938886 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_938886)) {
					if (!messageReceive.equals(__DEC_message_message_938886)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_6BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_black_nac_7BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_37_2_blackFFFFFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_message.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (interaction.equals(message.getInteraction())) {
					MessageEnd tmpMessageSend = message.getSendEvent();
					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
						if (message.equals(messageSend.getMessage())) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (!messageReceive.equals(messageSend)) {
									if (message.equals(messageReceive
											.getMessage())) {
										InteractionOperand operand = messageReceive
												.getEnclosingOperand();
										if (operand != null) {
											if (pattern_UserStepNfToMessageRule_37_2_black_nac_0BB(
													messageSend, interaction) == null) {
												if (pattern_UserStepNfToMessageRule_37_2_black_nac_3BB(
														messageSend,
														interaction) == null) {
													if (pattern_UserStepNfToMessageRule_37_2_black_nac_4BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepNfToMessageRule_37_2_black_nac_1BB(
																messageReceive,
																interaction) == null) {
															if (pattern_UserStepNfToMessageRule_37_2_black_nac_2BBB(
																	message,
																	messageSend,
																	messageReceive) == null) {
																if (pattern_UserStepNfToMessageRule_37_2_black_nac_6BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_UserStepNfToMessageRule_37_2_black_nac_7BB(
																			message,
																			messageReceive) == null) {
																		if (pattern_UserStepNfToMessageRule_37_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			for (Lifeline line : interaction
																					.getLifeline()) {
																				if (line.getCoveredBy()
																						.contains(
																								operand)) {
																					for (Lifeline sysLine : messageSend
																							.getCovered()) {
																						if (!line
																								.equals(sysLine)) {
																							if (sysLine
																									.getCoveredBy()
																									.contains(
																											operand)) {
																								for (InteractionFragment tmpCombo : line
																										.getCoveredBy()) {
																									if (tmpCombo instanceof CombinedFragment) {
																										CombinedFragment combo = (CombinedFragment) tmpCombo;
																										if (sysLine
																												.getCoveredBy()
																												.contains(
																														combo)) {
																											if (combo
																													.getOperand()
																													.contains(
																															operand)) {
																												_result.add(new Object[] {
																														sysLine,
																														messageSend,
																														operand,
																														combo,
																														messageReceive,
																														line,
																														message,
																														interaction,
																														_edge_message });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepNfToMessageRule_37_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_37_3_expressionFBBBBBBBBBB(
			UserStepNfToMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, operand, combo, messageReceive, line, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_37_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_37_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_37_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_38_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_38_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_38_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_38_1_binding = pattern_UserStepNfToMessageRule_38_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_38_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_38_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_38_1_black = pattern_UserStepNfToMessageRule_38_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_38_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_38_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_38_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_38_2_blackFFFFFFB(
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
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									for (Actor sysActor : packageDeclaration
											.getActors()) {
										if (!actor.equals(sysActor)) {
											_result.add(new Object[] {
													packageDeclaration,
													sysActor, actor, flow,
													step, useCase, _edge_steps });
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

	public static final Object[] pattern_UserStepNfToMessageRule_38_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_38_3_expressionFBBBBBBBB(
			UserStepNfToMessageRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, sysActor, actor, flow, step, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_38_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_38_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_38_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_38_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_1_bindingFB(
			UserStepNfToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_1_blackFBB(
			EClass __eClass, UserStepNfToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_1_bindingAndBlackFFB(
			UserStepNfToMessageRule _this) {
		Object[] result_pattern_UserStepNfToMessageRule_39_1_binding = pattern_UserStepNfToMessageRule_39_1_bindingFB(_this);
		if (result_pattern_UserStepNfToMessageRule_39_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepNfToMessageRule_39_1_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_39_1_black = pattern_UserStepNfToMessageRule_39_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepNfToMessageRule_39_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepNfToMessageRule_39_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_39_2_blackFFFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_actor.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(step.getActor())) {
					for (Flow tmpFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(step, Flow.class,
									"steps")) {
						if (tmpFlow instanceof NamedFlow) {
							NamedFlow flow = (NamedFlow) tmpFlow;
							for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								for (Actor sysActor : packageDeclaration
										.getActors()) {
									if (!actor.equals(sysActor)) {
										for (UseCase useCase : packageDeclaration
												.getUseCases()) {
											if (useCase.getFlows().contains(
													flow)) {
												_result.add(new Object[] {
														packageDeclaration,
														sysActor, actor, flow,
														step, useCase,
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

		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepNfToMessageRule_39_3_expressionFBBBBBBBB(
			UserStepNfToMessageRule _this, Match match,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			NamedFlow flow, NormalStep step, UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				packageDeclaration, sysActor, actor, flow, step, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepNfToMessageRule_39_4_expressionFBB(
			UserStepNfToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_39_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepNfToMessageRule_39_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_1_blackB(
			UserStepNfToMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Actor sysActor) {
		if (ruleResult.getSourceObjects().contains(sysActor)) {
			return new Object[] { ruleResult, sysActor };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			ActorToLifeline sysActorToSysLine) {
		if (ruleResult.getCorrObjects().contains(sysActorToSysLine)) {
			return new Object[] { ruleResult, sysActorToSysLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Lifeline sysLine) {
		if (ruleResult.getTargetObjects().contains(sysLine)) {
			return new Object[] { ruleResult, sysLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, NamedFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToOperand) {
		if (ruleResult.getCorrObjects().contains(flowToOperand)) {
			return new Object[] { ruleResult, flowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult, InteractionOperand operand) {
		if (ruleResult.getTargetObjects().contains(operand)) {
			return new Object[] { ruleResult, operand };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_2_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult, CombinedFragment combo) {
		if (ruleResult.getTargetObjects().contains(combo)) {
			return new Object[] { ruleResult, combo };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepNfToMessageRule_42_2_blackFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList sysActorToSysLineList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpSysActorToSysLine : sysActorToSysLineList
					.getEntryObjects()) {
				if (tmpSysActorToSysLine instanceof ActorToLifeline) {
					ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
					Actor sysActor = sysActorToSysLine.getSource();
					if (sysActor != null) {
						Lifeline sysLine = sysActorToSysLine.getTarget();
						if (sysLine != null) {
							if (pattern_UserStepNfToMessageRule_42_2_black_nac_2BB(
									ruleResult, sysActorToSysLine) == null) {
								if (pattern_UserStepNfToMessageRule_42_2_black_nac_1BB(
										ruleResult, sysActor) == null) {
									if (pattern_UserStepNfToMessageRule_42_2_black_nac_3BB(
											ruleResult, sysLine) == null) {
										for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														sysActor,
														PackageDeclaration.class,
														"actors")) {
											if (pattern_UserStepNfToMessageRule_42_2_black_nac_0BB(
													ruleResult,
													packageDeclaration) == null) {
												for (Actor actor : packageDeclaration
														.getActors()) {
													if (!actor.equals(sysActor)) {
														if (pattern_UserStepNfToMessageRule_42_2_black_nac_4BB(
																ruleResult,
																actor) == null) {
															for (UseCase useCase : packageDeclaration
																	.getUseCases()) {
																if (pattern_UserStepNfToMessageRule_42_2_black_nac_9BB(
																		ruleResult,
																		useCase) == null) {
																	for (Flow tmpFlow : useCase
																			.getFlows()) {
																		if (tmpFlow instanceof NamedFlow) {
																			NamedFlow flow = (NamedFlow) tmpFlow;
																			if (pattern_UserStepNfToMessageRule_42_2_black_nac_10BB(
																					ruleResult,
																					flow) == null) {
																				for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								actor,
																								ActorToLifeline.class,
																								"source")) {
																					if (!actorToLine
																							.equals(sysActorToSysLine)) {
																						Lifeline line = actorToLine
																								.getTarget();
																						if (line != null) {
																							if (!line
																									.equals(sysLine)) {
																								Interaction interaction = line
																										.getInteraction();
																								if (interaction != null) {
																									if (pattern_UserStepNfToMessageRule_42_2_black_nac_5BB(
																											ruleResult,
																											actorToLine) == null) {
																										if (pattern_UserStepNfToMessageRule_42_2_black_nac_6BB(
																												ruleResult,
																												line) == null) {
																											if (pattern_UserStepNfToMessageRule_42_2_black_nac_7BB(
																													ruleResult,
																													interaction) == null) {
																												for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																useCase,
																																UseCaseToInteraction.class,
																																"source")) {
																													if (interaction
																															.equals(useCaseToInteraction
																																	.getTarget())) {
																														if (pattern_UserStepNfToMessageRule_42_2_black_nac_8BB(
																																ruleResult,
																																useCaseToInteraction) == null) {
																															for (FlowToInteractionFragment flowToOperand : org.moflon.core.utilities.eMoflonEMFUtil
																																	.getOppositeReferenceTyped(
																																			flow,
																																			FlowToInteractionFragment.class,
																																			"source")) {
																																InteractionFragment tmpOperand = flowToOperand
																																		.getTarget();
																																if (tmpOperand instanceof InteractionOperand) {
																																	InteractionOperand operand = (InteractionOperand) tmpOperand;
																																	if (pattern_UserStepNfToMessageRule_42_2_black_nac_11BB(
																																			ruleResult,
																																			flowToOperand) == null) {
																																		if (pattern_UserStepNfToMessageRule_42_2_black_nac_12BB(
																																				ruleResult,
																																				operand) == null) {
																																			for (CombinedFragment combo : org.moflon.core.utilities.eMoflonEMFUtil
																																					.getOppositeReferenceTyped(
																																							operand,
																																							CombinedFragment.class,
																																							"operand")) {
																																				if (pattern_UserStepNfToMessageRule_42_2_black_nac_13BB(
																																						ruleResult,
																																						combo) == null) {
																																					_result.add(new Object[] {
																																							sysActorToSysLineList,
																																							packageDeclaration,
																																							sysActor,
																																							sysActorToSysLine,
																																							sysLine,
																																							actor,
																																							actorToLine,
																																							line,
																																							interaction,
																																							useCaseToInteraction,
																																							useCase,
																																							flow,
																																							flowToOperand,
																																							operand,
																																							combo,
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

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_3_bindingFBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, sysActor, actor,
				sysLine, sysActorToSysLine, operand, combo, flow,
				flowToOperand, line, useCase, interaction,
				useCaseToInteraction, actorToLine, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, sysActor, actor, sysLine,
					sysActorToSysLine, operand, combo, flow, flowToOperand,
					line, useCase, interaction, useCaseToInteraction,
					actorToLine, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_3_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			UserStepNfToMessageRule _this, IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UserStepNfToMessageRule_42_3_binding = pattern_UserStepNfToMessageRule_42_3_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, packageDeclaration, sysActor, actor,
				sysLine, sysActorToSysLine, operand, combo, flow,
				flowToOperand, line, useCase, interaction,
				useCaseToInteraction, actorToLine, ruleResult);
		if (result_pattern_UserStepNfToMessageRule_42_3_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepNfToMessageRule_42_3_binding[0];

			Object[] result_pattern_UserStepNfToMessageRule_42_3_black = pattern_UserStepNfToMessageRule_42_3_blackB(csp);
			if (result_pattern_UserStepNfToMessageRule_42_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, sysActor, actor, sysLine,
						sysActorToSysLine, operand, combo, flow, flowToOperand,
						line, useCase, interaction, useCaseToInteraction,
						actorToLine, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepNfToMessageRule_42_4_expressionFBB(
			UserStepNfToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_5_blackBBBBBBBBBBBBBB(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					return new Object[] { packageDeclaration, sysActor, actor,
							sysLine, sysActorToSysLine, operand, combo, flow,
							flowToOperand, line, useCase, interaction,
							useCaseToInteraction, actorToLine };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_6_blackBBBBBBBBBBBBBBB(
			PackageDeclaration packageDeclaration, Actor sysActor, Actor actor,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			InteractionOperand operand, CombinedFragment combo, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					return new Object[] { packageDeclaration, sysActor, actor,
							sysLine, sysActorToSysLine, operand, combo, flow,
							flowToOperand, line, useCase, interaction,
							useCaseToInteraction, actorToLine, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepNfToMessageRule_42_6_greenBBFBBBFBFFBBB(
			Actor actor, Lifeline sysLine, InteractionOperand operand,
			CombinedFragment combo, NamedFlow flow, Lifeline line,
			Interaction interaction, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		sysLine.getCoveredBy().add(operand);
		sysLine.getCoveredBy().add(combo);
		line.getCoveredBy().add(operand);
		line.getCoveredBy().add(combo);
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("step", "label");
		Object _localVariable_3 = csp.getValue("message", "messageSort");
		Object _localVariable_4 = csp.getValue("message", "messageKind");
		Object _localVariable_5 = csp.getValue("message", "_id");
		Object _localVariable_6 = csp.getValue("message", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_7 = ruleResult.getIncrementedPerformCount();
		sysLine.getCoveredBy().add(messageSend);
		ruleResult.getTargetObjects().add(messageSend);
		operand.getFragment().add(messageReceive);
		ruleResult.getTargetObjects().add(messageReceive);
		flow.getSteps().add(step);
		step.setActor(actor);
		ruleResult.getSourceObjects().add(step);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		message.setInteraction(interaction);
		ruleResult.getTargetObjects().add(message);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		String step_label_prime = (String) _localVariable_2;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_3;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_4;
		String message__id_prime = (String) _localVariable_5;
		String message_name_prime = (String) _localVariable_6;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_7);
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		step.setLabel(step_label_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.set_id(message__id_prime);
		message.setName(message_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { actor, sysLine, messageSend, operand, combo,
				flow, messageReceive, line, step, message, interaction,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UserStepNfToMessageRule_42_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserStepNfToMessageRuleImpl
