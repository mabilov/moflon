/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Interaction;
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
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UCCondition;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule;

import UseCaseToModalSequenceDiagramIntegration.UCConditionToMessage;
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
 * An implementation of the model object '<em><b>Use Case Precond To Found Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UseCasePrecondToFoundMessageRuleImpl extends AbstractRuleImpl
		implements UseCasePrecondToFoundMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasePrecondToFoundMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUseCasePrecondToFoundMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UCCondition precond,
			UseCase useCase, Actor actor, PackageDeclaration packageDeclaration) {
		// initial bindings
		Object[] result1_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_0_1_blackBBBBBB(this,
						match, precond, useCase, actor, packageDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[precond] = "
							+ precond + ", " + "[useCase] = " + useCase + ", "
							+ "[actor] = " + actor + ", "
							+ "[packageDeclaration] = " + packageDeclaration
							+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_0_2_bindingAndBlackFBBBBBB(
						this, match, precond, useCase, actor,
						packageDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[precond] = "
							+ precond + ", " + "[useCase] = " + useCase + ", "
							+ "[actor] = " + actor + ", "
							+ "[packageDeclaration] = " + packageDeclaration
							+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_4_blackBBBBB(
							match, precond, useCase, actor, packageDeclaration);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[precond] = " + precond + ", "
								+ "[useCase] = " + useCase + ", "
								+ "[actor] = " + actor + ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration + ".");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_4_greenBBBF(
							match, precond, useCase);
			// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_5_blackBBBBB(
							match, precond, useCase, actor, packageDeclaration);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[precond] = " + precond + ", "
								+ "[useCase] = " + useCase + ", "
								+ "[actor] = " + actor + ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration + ".");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_5_greenBBBBFF(
							match, useCase, actor, packageDeclaration);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[4];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[5];

			// register objects to match
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_6_expressionBBBBBB(
							this, match, precond, useCase, actor,
							packageDeclaration);
			return UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_7_expressionF();
		} else {
			return UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_1_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		UCCondition precond = (UCCondition) result1_bindingAndBlack[0];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		Interaction interaction = (Interaction) result1_bindingAndBlack[3];
		Actor actor = (Actor) result1_bindingAndBlack[4];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[5];
		Lifeline line = (Lifeline) result1_bindingAndBlack[6];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_1_greenBFBFBFB(
						precond, interaction, line, csp);
		Message message = (Message) result1_green[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[3];
		UCConditionToMessage precondToMessage = (UCConditionToMessage) result1_green[5];

		// collect translated elements
		Object[] result2_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_2_blackBBBB(
						precond, message, messageReceive, precondToMessage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[precond] = " + precond + ", "
							+ "[message] = " + message + ", "
							+ "[messageReceive] = " + messageReceive + ", "
							+ "[precondToMessage] = " + precondToMessage + ".");
		}
		Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_2_greenFBBBB(
						precond, message, messageReceive, precondToMessage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_3_blackBBBBBBBBBBBB(
						ruleresult, precond, useCaseToInteraction, useCase,
						message, interaction, messageReceive, actor,
						packageDeclaration, line, actorToLine, precondToMessage);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[precond] = "
							+ precond
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine
							+ ", "
							+ "[precondToMessage] = " + precondToMessage + ".");
		}
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_3_greenBBBBBBBBFFFFFFFFFFF(
						ruleresult, precond, useCase, message, interaction,
						messageReceive, line, precondToMessage);
		// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result3_green[8];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[9];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[10];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[11];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[12];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[13];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[14];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[15];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[16];
		// EMoflonEdge precondToMessage__precond____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge precondToMessage__message____target = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, precond, useCaseToInteraction,
						useCase, message, interaction, messageReceive, actor,
						packageDeclaration, line, actorToLine, precondToMessage);
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		UCCondition precond = (UCCondition) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		Actor actor = (Actor) result2_binding[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[3];
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_2_2_blackBFBFBBFFB(
						precond, useCase, actor, packageDeclaration, match)) {
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[1];
			Interaction interaction = (Interaction) result2_black[3];
			Lifeline line = (Lifeline) result2_black[6];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_2_3_blackBBBBBBBB(
							precond, useCaseToInteraction, useCase,
							interaction, actor, packageDeclaration, line,
							actorToLine)) {
				Object[] result3_green = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_2_3_greenBBBBBBBBFFFFFFFFFF(
								precond, useCaseToInteraction, useCase,
								interaction, actor, packageDeclaration, line,
								actorToLine);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result3_green[11];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[12];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[13];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[14];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[15];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_2_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, precond,
								useCaseToInteraction, useCase, interaction,
								actor, packageDeclaration, line, actorToLine);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[precond] = "
									+ precond
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[line] = "
									+ line
									+ ", "
									+ "[actorToLine] = "
									+ actorToLine + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, UCCondition precond,
			UseCase useCase, Actor actor, PackageDeclaration packageDeclaration) {
		match.registerObject("precond", precond);
		match.registerObject("useCase", useCase);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UCCondition precond,
			UseCase useCase, Actor actor, PackageDeclaration packageDeclaration) {// Create CSP
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
			UCCondition precond, UseCaseToInteraction useCaseToInteraction,
			UseCase useCase, Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_SIGNAL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("found");
		literal1.setType("");

		// Create attribute variables
		Variable var_precond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"precond.name", true, csp);
		var_precond_name.setValue(precond.getName());
		var_precond_name.setType("String");

		// Create unbound variables
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");

		// Create constraints
		Eq eq = new Eq();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_precond_name, var_message_name);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("precond", precond);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("line", line);
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
			EObject precond, EObject useCaseToInteraction, EObject useCase,
			EObject message, EObject interaction, EObject messageReceive,
			EObject actor, EObject packageDeclaration, EObject line,
			EObject actorToLine, EObject precondToMessage) {
		ruleresult.registerObject("precond", precond);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("precondToMessage", precondToMessage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("precond")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getUCCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		// initial bindings
		Object[] result1_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_10_1_blackBBBBBB(
						this, match, message, interaction, messageReceive, line);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[message] = "
							+ message + ", " + "[interaction] = " + interaction
							+ ", " + "[messageReceive] = " + messageReceive
							+ ", " + "[line] = " + line + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_10_2_bindingAndBlackFBBBBBB(
						this, match, message, interaction, messageReceive, line);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[message] = "
							+ message + ", " + "[interaction] = " + interaction
							+ ", " + "[messageReceive] = " + messageReceive
							+ ", " + "[line] = " + line + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_4_blackBBBBB(
							match, message, interaction, messageReceive, line);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[message] = " + message + ", "
								+ "[interaction] = " + interaction + ", "
								+ "[messageReceive] = " + messageReceive + ", "
								+ "[line] = " + line + ".");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_4_greenBBBBBFFFFFFFF(
							match, message, interaction, messageReceive, line);
			// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result4_green[5];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[6];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[7];
			// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result4_green[8];
			// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result4_green[9];
			// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result4_green[10];
			// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result4_green[11];
			// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_5_blackBBBBB(
							match, message, interaction, messageReceive, line);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[message] = " + message + ", "
								+ "[interaction] = " + interaction + ", "
								+ "[messageReceive] = " + messageReceive + ", "
								+ "[line] = " + line + ".");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_5_greenBBBFF(
							match, interaction, line);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[4];

			// register objects to match
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_6_expressionBBBBBB(
							this, match, message, interaction, messageReceive,
							line);
			return UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_7_expressionF();
		} else {
			return UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		Message message = (Message) result1_bindingAndBlack[2];
		Interaction interaction = (Interaction) result1_bindingAndBlack[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[6];
		Lifeline line = (Lifeline) result1_bindingAndBlack[7];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_1_greenFBBFB(
						useCase, message, csp);
		UCCondition precond = (UCCondition) result1_green[0];
		UCConditionToMessage precondToMessage = (UCConditionToMessage) result1_green[3];

		// collect translated elements
		Object[] result2_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_2_blackBBBB(
						precond, message, messageReceive, precondToMessage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[precond] = " + precond + ", "
							+ "[message] = " + message + ", "
							+ "[messageReceive] = " + messageReceive + ", "
							+ "[precondToMessage] = " + precondToMessage + ".");
		}
		Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_2_greenFBBBB(
						precond, message, messageReceive, precondToMessage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_3_blackBBBBBBBBBBBB(
						ruleresult, precond, useCaseToInteraction, useCase,
						message, interaction, messageReceive, actor,
						packageDeclaration, line, actorToLine, precondToMessage);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[precond] = "
							+ precond
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine
							+ ", "
							+ "[precondToMessage] = " + precondToMessage + ".");
		}
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_3_greenBBBBBBBBFFFFFFFFFFF(
						ruleresult, precond, useCase, message, interaction,
						messageReceive, line, precondToMessage);
		// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result3_green[8];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[9];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[10];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[11];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[12];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[13];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[14];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[15];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[16];
		// EMoflonEdge precondToMessage__precond____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge precondToMessage__message____target = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, precond, useCaseToInteraction,
						useCase, message, interaction, messageReceive, actor,
						packageDeclaration, line, actorToLine, precondToMessage);
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Message message = (Message) result2_binding[0];
		Interaction interaction = (Interaction) result2_binding[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[2];
		Lifeline line = (Lifeline) result2_binding[3];
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_2_blackFFBBBFBFB(
						message, interaction, messageReceive, line, match)) {
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Actor actor = (Actor) result2_black[5];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_12_3_blackBBBBBBFBB(
							useCaseToInteraction, useCase, message,
							interaction, messageReceive, actor, line,
							actorToLine)) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[6];
				Object[] result3_green = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_12_3_greenBBBBBBBBBFFFFFFFFFFFFFFFFF(
								useCaseToInteraction, useCase, message,
								interaction, messageReceive, actor,
								packageDeclaration, line, actorToLine);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[12];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[13];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[14];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[15];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[16];
				// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[17];
				// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[18];
				// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[19];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[20];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[21];
				// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[22];
				// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[23];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, useCaseToInteraction,
								useCase, message, interaction, messageReceive,
								actor, packageDeclaration, line, actorToLine);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[message] = "
									+ message
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[messageReceive] = "
									+ messageReceive
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[line] = "
									+ line
									+ ", "
									+ "[actorToLine] = "
									+ actorToLine + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_SIGNAL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("found");
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
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");

		// Create attribute variables
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables
		Variable var_precond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"precond.name", csp);
		var_precond_name.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_precond_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("line", line);
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
			EObject precond, EObject useCaseToInteraction, EObject useCase,
			EObject message, EObject interaction, EObject messageReceive,
			EObject actor, EObject packageDeclaration, EObject line,
			EObject actorToLine, EObject precondToMessage) {
		ruleresult.registerObject("precond", precond);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("precondToMessage", precondToMessage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("message")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessage())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_437(
			EMoflonEdge _edge_preconditions) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_2_blackFFFFB(_edge_preconditions)) {
			UCCondition precond = (UCCondition) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_20_3_expressionFBBBBBB(
							this, match, precond, useCase, actor,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_894(
			EMoflonEdge _edge_receiveEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_2_blackFFFFB(_edge_receiveEvent)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_21_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_895(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_2_blackFFFFB(_edge_interaction)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_22_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_896(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_2_blackFFFFB(_edge_message)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_23_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_897(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_2_blackFFFFB(_edge_enclosingInteraction)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_24_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_898(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_2_blackFFFFB(_edge_fragment)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_25_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_899(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_2_blackFFFFB(_edge_message)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_26_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_900(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_2_blackFFFFB(_edge_coveredBy)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_27_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_901(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_2_blackFFFFB(_edge_covered)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_28_3_expressionFBBBBBB(
							this, match, message, interaction, messageReceive,
							line)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_6_expressionFB(__result);
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
		Object[] result1_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_2_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList useCaseToInteractionList = (RuleEntryList) result2_black[0];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			Actor actor = (Actor) result2_black[4];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[5];
			Lifeline line = (Lifeline) result2_black[6];
			Interaction interaction = (Interaction) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_31_3_bindingAndBlackFBBBBBBBBBB(
							this, isApplicableMatch, useCaseToInteraction,
							useCase, interaction, actor, packageDeclaration,
							line, actorToLine, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[useCaseToInteraction] = "
								+ useCaseToInteraction
								+ ", "
								+ "[useCase] = "
								+ useCase
								+ ", "
								+ "[interaction] = "
								+ interaction
								+ ", "
								+ "[actor] = "
								+ actor
								+ ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration
								+ ", "
								+ "[line] = "
								+ line
								+ ", "
								+ "[actorToLine] = "
								+ actorToLine
								+ ", "
								+ "[ruleResult] = "
								+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_31_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_31_5_blackBBBBBBB(
								useCaseToInteraction, useCase, interaction,
								actor, packageDeclaration, line, actorToLine);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_31_6_blackBBBBBBBB(
									useCaseToInteraction, useCase, interaction,
									actor, packageDeclaration, line,
									actorToLine, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: "
										+ "[useCaseToInteraction] = "
										+ useCaseToInteraction
										+ ", "
										+ "[useCase] = "
										+ useCase
										+ ", "
										+ "[interaction] = "
										+ interaction
										+ ", "
										+ "[actor] = "
										+ actor
										+ ", "
										+ "[packageDeclaration] = "
										+ packageDeclaration
										+ ", "
										+ "[line] = "
										+ line
										+ ", "
										+ "[actorToLine] = "
										+ actorToLine
										+ ", "
										+ "[ruleResult] = "
										+ ruleResult
										+ ".");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_31_6_greenFBFBFBFBB(
									useCase, interaction, line, ruleResult, csp);
					// UCCondition precond = (UCCondition) result6_green[0];
					// Message message = (Message) result6_green[2];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[4];
					// UCConditionToMessage precondToMessage = (UCConditionToMessage) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ASYNCH_SIGNAL");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("found");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables
		Variable var_precond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"precond.name", csp);
		var_precond_name.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal1);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal2);
		eq.setRuleName("");
		eq.solve(var_precond_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("line", line);
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
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_UCCONDITION_USECASE_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UCCondition) arguments.get(1), (UseCase) arguments.get(2),
					(Actor) arguments.get(3),
					(PackageDeclaration) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_UCCONDITION_USECASE_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UCCondition) arguments.get(1), (UseCase) arguments.get(2),
					(Actor) arguments.get(3),
					(PackageDeclaration) arguments.get(4));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_UCCONDITION_USECASE_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UCCondition) arguments.get(1), (UseCase) arguments.get(2),
					(Actor) arguments.get(3),
					(PackageDeclaration) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_UCCONDITION_USECASETOINTERACTION_USECASE_INTERACTION_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UCCondition) arguments.get(1),
					(UseCaseToInteraction) arguments.get(2),
					(UseCase) arguments.get(3), (Interaction) arguments.get(4),
					(Actor) arguments.get(5),
					(PackageDeclaration) arguments.get(6),
					(Lifeline) arguments.get(7),
					(ActorToLifeline) arguments.get(8));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASETOINTERACTION_USECASE_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1),
					(UseCase) arguments.get(2), (Message) arguments.get(3),
					(Interaction) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(Actor) arguments.get(6),
					(PackageDeclaration) arguments.get(7),
					(Lifeline) arguments.get(8),
					(ActorToLifeline) arguments.get(9));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_437__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_437((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_894__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_894((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_895__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_895((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_896__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_896((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_897__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_897((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_898__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_898((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_899__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_899((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_900__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_900((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_901__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_901((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASETOINTERACTION_USECASE_INTERACTION_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1),
					(UseCase) arguments.get(2), (Interaction) arguments.get(3),
					(Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5),
					(Lifeline) arguments.get(6),
					(ActorToLifeline) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_1_blackBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		return new Object[] { _this, match, precond, useCase, actor,
				packageDeclaration };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_2_bindingFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, precond,
				useCase, actor, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, precond, useCase, actor,
					packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_2_bindingAndBlackFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_0_2_binding = pattern_UseCasePrecondToFoundMessageRule_0_2_bindingFBBBBBB(
				_this, match, precond, useCase, actor, packageDeclaration);
		if (result_pattern_UseCasePrecondToFoundMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_0_2_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_0_2_black = pattern_UseCasePrecondToFoundMessageRule_0_2_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, precond, useCase,
						actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_0_3_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_4_blackBBBBB(
			Match match, UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		return new Object[] { match, precond, useCase, actor,
				packageDeclaration };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_4_greenBBBF(
			Match match, UCCondition precond, UseCase useCase) {
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(precond);
		String useCase__precond____preconditions_name_prime = "preconditions";
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		match.getToBeTranslatedEdges().add(useCase__precond____preconditions);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		return new Object[] { match, precond, useCase,
				useCase__precond____preconditions };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_5_blackBBBBB(
			Match match, UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		return new Object[] { match, precond, useCase, actor,
				packageDeclaration };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_5_greenBBBBFF(
			Match match, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(actor);
		match.getContextNodes().add(packageDeclaration);
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		return new Object[] { match, useCase, actor, packageDeclaration,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_0_6_expressionBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		_this.registerObjectsToMatch_FWD(match, precond, useCase, actor,
				packageDeclaration);

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("precond");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_4 = isApplicableMatch.getObject("actor");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_6 = isApplicableMatch.getObject("line");
		EObject _localVariable_7 = isApplicableMatch.getObject("actorToLine");
		EObject tmpPrecond = _localVariable_0;
		EObject tmpUseCaseToInteraction = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		EObject tmpActor = _localVariable_4;
		EObject tmpPackageDeclaration = _localVariable_5;
		EObject tmpLine = _localVariable_6;
		EObject tmpActorToLine = _localVariable_7;
		if (tmpPrecond instanceof UCCondition) {
			UCCondition precond = (UCCondition) tmpPrecond;
			if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
				UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						if (tmpActor instanceof Actor) {
							Actor actor = (Actor) tmpActor;
							if (tmpPackageDeclaration instanceof PackageDeclaration) {
								PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
								if (tmpLine instanceof Lifeline) {
									Lifeline line = (Lifeline) tmpLine;
									if (tmpActorToLine instanceof ActorToLifeline) {
										ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
										return new Object[] { precond,
												useCaseToInteraction, useCase,
												interaction, actor,
												packageDeclaration, line,
												actorToLine, isApplicableMatch };
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_blackBBBBBBBBFBB(
			UCCondition precond, UseCaseToInteraction useCaseToInteraction,
			UseCase useCase, Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine,
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { precond, useCaseToInteraction, useCase,
						interaction, actor, packageDeclaration, line,
						actorToLine, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_bindingAndBlackFFFFFFFFFBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding = pattern_UseCasePrecondToFoundMessageRule_1_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding != null) {
			UCCondition precond = (UCCondition) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[0];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[2];
			Interaction interaction = (Interaction) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[3];
			Actor actor = (Actor) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[4];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[5];
			Lifeline line = (Lifeline) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[6];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[7];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_1_1_black = pattern_UseCasePrecondToFoundMessageRule_1_1_blackBBBBBBBBFBB(
					precond, useCaseToInteraction, useCase, interaction, actor,
					packageDeclaration, line, actorToLine, _this,
					isApplicableMatch);
			if (result_pattern_UseCasePrecondToFoundMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_1_1_black[8];

				return new Object[] { precond, useCaseToInteraction, useCase,
						interaction, actor, packageDeclaration, line,
						actorToLine, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_greenBFBFBFB(
			UCCondition precond, Interaction interaction, Lifeline line, CSP csp) {
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		UCConditionToMessage precondToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUCConditionToMessage();
		Object _localVariable_0 = csp.getValue("message", "name");
		Object _localVariable_1 = csp.getValue("message", "messageSort");
		Object _localVariable_2 = csp.getValue("message", "messageKind");
		message.setInteraction(interaction);
		message.setReceiveEvent(messageReceive);
		messageReceive.setEnclosingInteraction(interaction);
		messageReceive.setMessage(message);
		line.getCoveredBy().add(messageReceive);
		precondToMessage.setSource(precond);
		precondToMessage.setTarget(message);
		String message_name_prime = (String) _localVariable_0;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_1;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_2;
		message.setName(message_name_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		return new Object[] { precond, message, interaction, messageReceive,
				line, precondToMessage, csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_2_blackBBBB(
			UCCondition precond, Message message,
			MessageOccurrenceSpecification messageReceive,
			UCConditionToMessage precondToMessage) {
		return new Object[] { precond, message, messageReceive,
				precondToMessage };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_2_greenFBBBB(
			UCCondition precond, Message message,
			MessageOccurrenceSpecification messageReceive,
			UCConditionToMessage precondToMessage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(precond);
		ruleresult.getCreatedElements().add(message);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getCreatedLinkElements().add(precondToMessage);
		return new Object[] { ruleresult, precond, message, messageReceive,
				precondToMessage };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject precond,
			EObject useCaseToInteraction, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject precondToMessage) {
		if (!precond.equals(useCaseToInteraction)) {
			if (!precond.equals(useCase)) {
				if (!precond.equals(precondToMessage)) {
					if (!useCase.equals(useCaseToInteraction)) {
						if (!message.equals(precond)) {
							if (!message.equals(useCaseToInteraction)) {
								if (!message.equals(useCase)) {
									if (!message.equals(messageReceive)) {
										if (!message.equals(packageDeclaration)) {
											if (!message
													.equals(precondToMessage)) {
												if (!interaction
														.equals(precond)) {
													if (!interaction
															.equals(useCaseToInteraction)) {
														if (!interaction
																.equals(useCase)) {
															if (!interaction
																	.equals(message)) {
																if (!interaction
																		.equals(messageReceive)) {
																	if (!interaction
																			.equals(packageDeclaration)) {
																		if (!interaction
																				.equals(line)) {
																			if (!interaction
																					.equals(precondToMessage)) {
																				if (!messageReceive
																						.equals(precond)) {
																					if (!messageReceive
																							.equals(useCaseToInteraction)) {
																						if (!messageReceive
																								.equals(useCase)) {
																							if (!messageReceive
																									.equals(packageDeclaration)) {
																								if (!messageReceive
																										.equals(precondToMessage)) {
																									if (!actor
																											.equals(precond)) {
																										if (!actor
																												.equals(useCaseToInteraction)) {
																											if (!actor
																													.equals(useCase)) {
																												if (!actor
																														.equals(message)) {
																													if (!actor
																															.equals(interaction)) {
																														if (!actor
																																.equals(messageReceive)) {
																															if (!actor
																																	.equals(packageDeclaration)) {
																																if (!actor
																																		.equals(line)) {
																																	if (!actor
																																			.equals(actorToLine)) {
																																		if (!actor
																																				.equals(precondToMessage)) {
																																			if (!packageDeclaration
																																					.equals(precond)) {
																																				if (!packageDeclaration
																																						.equals(useCaseToInteraction)) {
																																					if (!packageDeclaration
																																							.equals(useCase)) {
																																						if (!packageDeclaration
																																								.equals(precondToMessage)) {
																																							if (!line
																																									.equals(precond)) {
																																								if (!line
																																										.equals(useCaseToInteraction)) {
																																									if (!line
																																											.equals(useCase)) {
																																										if (!line
																																												.equals(message)) {
																																											if (!line
																																													.equals(messageReceive)) {
																																												if (!line
																																														.equals(packageDeclaration)) {
																																													if (!line
																																															.equals(precondToMessage)) {
																																														if (!actorToLine
																																																.equals(precond)) {
																																															if (!actorToLine
																																																	.equals(useCaseToInteraction)) {
																																																if (!actorToLine
																																																		.equals(useCase)) {
																																																	if (!actorToLine
																																																			.equals(message)) {
																																																		if (!actorToLine
																																																				.equals(interaction)) {
																																																			if (!actorToLine
																																																					.equals(messageReceive)) {
																																																				if (!actorToLine
																																																						.equals(packageDeclaration)) {
																																																					if (!actorToLine
																																																							.equals(line)) {
																																																						if (!actorToLine
																																																								.equals(precondToMessage)) {
																																																							if (!precondToMessage
																																																									.equals(useCaseToInteraction)) {
																																																								if (!precondToMessage
																																																										.equals(useCase)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											precond,
																																																											useCaseToInteraction,
																																																											useCase,
																																																											message,
																																																											interaction,
																																																											messageReceive,
																																																											actor,
																																																											packageDeclaration,
																																																											line,
																																																											actorToLine,
																																																											precondToMessage };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_3_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject precond, EObject useCase,
			EObject message, EObject interaction, EObject messageReceive,
			EObject line, EObject precondToMessage) {
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge precondToMessage__precond____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge precondToMessage__message____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UseCasePrecondToFoundMessageRule";
		String useCase__precond____preconditions_name_prime = "preconditions";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String precondToMessage__precond____source_name_prime = "source";
		String precondToMessage__message____target_name_prime = "target";
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		ruleresult.getTranslatedEdges().add(useCase__precond____preconditions);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				message__messageReceive____receiveEvent);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(interaction__message____message);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				interaction__messageReceive____fragment);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageReceive__line____covered);
		precondToMessage__precond____source.setSrc(precondToMessage);
		precondToMessage__precond____source.setTrg(precond);
		ruleresult.getCreatedEdges().add(precondToMessage__precond____source);
		precondToMessage__message____target.setSrc(precondToMessage);
		precondToMessage__message____target.setTrg(message);
		ruleresult.getCreatedEdges().add(precondToMessage__message____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		precondToMessage__precond____source
				.setName(precondToMessage__precond____source_name_prime);
		precondToMessage__message____target
				.setName(precondToMessage__message____target_name_prime);
		return new Object[] { ruleresult, precond, useCase, message,
				interaction, messageReceive, line, precondToMessage,
				useCase__precond____preconditions,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				precondToMessage__precond____source,
				precondToMessage__message____target };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_1_5_expressionBBBBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			PerformRuleResult ruleresult, EObject precond,
			EObject useCaseToInteraction, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject precondToMessage) {
		_this.registerObjects_FWD(ruleresult, precond, useCaseToInteraction,
				useCase, message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine, precondToMessage);

	}

	public static final PerformRuleResult pattern_UseCasePrecondToFoundMessageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_1_blackFBB(
			EClass eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_2_1_binding = pattern_UseCasePrecondToFoundMessageRule_2_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_2_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_2_1_black = pattern_UseCasePrecondToFoundMessageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UseCasePrecondToFoundMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("precond");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("actor");
		EObject _localVariable_3 = match.getObject("packageDeclaration");
		EObject tmpPrecond = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		EObject tmpPackageDeclaration = _localVariable_3;
		if (tmpPrecond instanceof UCCondition) {
			UCCondition precond = (UCCondition) tmpPrecond;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					if (tmpPackageDeclaration instanceof PackageDeclaration) {
						PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
						return new Object[] { precond, useCase, actor,
								packageDeclaration, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_2_2_blackBFBFBBFFB(
			UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, Match match) {
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
						_result.add(new Object[] { precond,
								useCaseToInteraction, useCase, interaction,
								actor, packageDeclaration, line, actorToLine,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_2_3_blackBBBBBBBB(
			UCCondition precond, UseCaseToInteraction useCaseToInteraction,
			UseCase useCase, Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCase.equals(useCaseToInteraction.getSource())) {
			if (interaction.equals(useCaseToInteraction.getTarget())) {
				if (useCase.getPreconditions().contains(precond)) {
					if (interaction.equals(line.getInteraction())) {
						if (packageDeclaration.getUseCases().contains(useCase)) {
							if (packageDeclaration.getActors().contains(actor)) {
								if (actor.equals(actorToLine.getSource())) {
									if (line.equals(actorToLine.getTarget())) {
										_result.add(new Object[] { precond,
												useCaseToInteraction, useCase,
												interaction, actor,
												packageDeclaration, line,
												actorToLine });
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_3_greenBBBBBBBBFFFFFFFFFF(
			UCCondition precond, UseCaseToInteraction useCaseToInteraction,
			UseCase useCase, Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String useCase__precond____preconditions_name_prime = "preconditions";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(precond);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		isApplicableMatch.getAllContextElements().add(
				useCase__precond____preconditions);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
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
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		return new Object[] { precond, useCaseToInteraction, useCase,
				interaction, actor, packageDeclaration, line, actorToLine,
				isApplicableMatch, useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				useCase__precond____preconditions,
				line__interaction____interaction,
				interaction__line____lifeline,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_4_bindingFBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch, UCCondition precond,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, precond, useCaseToInteraction, useCase,
				interaction, actor, packageDeclaration, line, actorToLine);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, precond,
					useCaseToInteraction, useCase, interaction, actor,
					packageDeclaration, line, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_4_bindingAndBlackFBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch, UCCondition precond,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_2_4_binding = pattern_UseCasePrecondToFoundMessageRule_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, precond, useCaseToInteraction,
				useCase, interaction, actor, packageDeclaration, line,
				actorToLine);
		if (result_pattern_UseCasePrecondToFoundMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_2_4_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_2_4_black = pattern_UseCasePrecondToFoundMessageRule_2_4_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, precond,
						useCaseToInteraction, useCase, interaction, actor,
						packageDeclaration, line, actorToLine };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_2_5_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UseCasePrecondToFoundMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UseCasePrecondToFoundMessageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_1_blackBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		return new Object[] { _this, match, message, interaction,
				messageReceive, line };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_2_bindingFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, message,
				interaction, messageReceive, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, message, interaction,
					messageReceive, line };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_2_bindingAndBlackFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_10_2_binding = pattern_UseCasePrecondToFoundMessageRule_10_2_bindingFBBBBBB(
				_this, match, message, interaction, messageReceive, line);
		if (result_pattern_UseCasePrecondToFoundMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_10_2_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_10_2_black = pattern_UseCasePrecondToFoundMessageRule_10_2_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, message, interaction,
						messageReceive, line };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_10_3_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_4_blackBBBBB(
			Match match, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		return new Object[] { match, message, interaction, messageReceive, line };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_4_greenBBBBBFFFFFFFF(
			Match match, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(message);
		match.getToBeTranslatedNodes().add(messageReceive);
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				message__messageReceive____receiveEvent);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(interaction__message____message);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				interaction__messageReceive____fragment);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageReceive__line____covered);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		return new Object[] { match, message, interaction, messageReceive,
				line, message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_5_blackBBBBB(
			Match match, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		return new Object[] { match, message, interaction, messageReceive, line };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_5_greenBBBFF(
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

	public static final void pattern_UseCasePrecondToFoundMessageRule_10_6_expressionBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		_this.registerObjectsToMatch_BWD(match, message, interaction,
				messageReceive, line);

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("message");
		EObject _localVariable_3 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_7 = isApplicableMatch.getObject("line");
		EObject _localVariable_8 = isApplicableMatch.getObject("actorToLine");
		EObject tmpUseCaseToInteraction = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpMessage = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		EObject tmpMessageReceive = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpPackageDeclaration = _localVariable_6;
		EObject tmpLine = _localVariable_7;
		EObject tmpActorToLine = _localVariable_8;
		if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpMessage instanceof Message) {
					Message message = (Message) tmpMessage;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpPackageDeclaration instanceof PackageDeclaration) {
									PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
									if (tmpLine instanceof Lifeline) {
										Lifeline line = (Lifeline) tmpLine;
										if (tmpActorToLine instanceof ActorToLifeline) {
											ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
											return new Object[] {
													useCaseToInteraction,
													useCase, message,
													interaction,
													messageReceive, actor,
													packageDeclaration, line,
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
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_blackBBBBBBBBBFBB(
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine,
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCaseToInteraction, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_bindingAndBlackFFFFFFFFFFBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding = pattern_UseCasePrecondToFoundMessageRule_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding != null) {
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[1];
			Message message = (Message) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[2];
			Interaction interaction = (Interaction) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[4];
			Actor actor = (Actor) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[5];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[6];
			Lifeline line = (Lifeline) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[7];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[8];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_11_1_black = pattern_UseCasePrecondToFoundMessageRule_11_1_blackBBBBBBBBBFBB(
					useCaseToInteraction, useCase, message, interaction,
					messageReceive, actor, packageDeclaration, line,
					actorToLine, _this, isApplicableMatch);
			if (result_pattern_UseCasePrecondToFoundMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_11_1_black[9];

				return new Object[] { useCaseToInteraction, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_greenFBBFB(
			UseCase useCase, Message message, CSP csp) {
		UCCondition precond = UseCaseDSLFactory.eINSTANCE.createUCCondition();
		UCConditionToMessage precondToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUCConditionToMessage();
		Object _localVariable_0 = csp.getValue("precond", "name");
		useCase.getPreconditions().add(precond);
		precondToMessage.setSource(precond);
		precondToMessage.setTarget(message);
		String precond_name_prime = (String) _localVariable_0;
		precond.setName(precond_name_prime);
		return new Object[] { precond, useCase, message, precondToMessage, csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_2_blackBBBB(
			UCCondition precond, Message message,
			MessageOccurrenceSpecification messageReceive,
			UCConditionToMessage precondToMessage) {
		return new Object[] { precond, message, messageReceive,
				precondToMessage };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_2_greenFBBBB(
			UCCondition precond, Message message,
			MessageOccurrenceSpecification messageReceive,
			UCConditionToMessage precondToMessage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(precond);
		ruleresult.getTranslatedElements().add(message);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedLinkElements().add(precondToMessage);
		return new Object[] { ruleresult, precond, message, messageReceive,
				precondToMessage };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject precond,
			EObject useCaseToInteraction, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject precondToMessage) {
		if (!precond.equals(useCaseToInteraction)) {
			if (!precond.equals(useCase)) {
				if (!precond.equals(precondToMessage)) {
					if (!useCase.equals(useCaseToInteraction)) {
						if (!message.equals(precond)) {
							if (!message.equals(useCaseToInteraction)) {
								if (!message.equals(useCase)) {
									if (!message.equals(messageReceive)) {
										if (!message.equals(packageDeclaration)) {
											if (!message
													.equals(precondToMessage)) {
												if (!interaction
														.equals(precond)) {
													if (!interaction
															.equals(useCaseToInteraction)) {
														if (!interaction
																.equals(useCase)) {
															if (!interaction
																	.equals(message)) {
																if (!interaction
																		.equals(messageReceive)) {
																	if (!interaction
																			.equals(packageDeclaration)) {
																		if (!interaction
																				.equals(line)) {
																			if (!interaction
																					.equals(precondToMessage)) {
																				if (!messageReceive
																						.equals(precond)) {
																					if (!messageReceive
																							.equals(useCaseToInteraction)) {
																						if (!messageReceive
																								.equals(useCase)) {
																							if (!messageReceive
																									.equals(packageDeclaration)) {
																								if (!messageReceive
																										.equals(precondToMessage)) {
																									if (!actor
																											.equals(precond)) {
																										if (!actor
																												.equals(useCaseToInteraction)) {
																											if (!actor
																													.equals(useCase)) {
																												if (!actor
																														.equals(message)) {
																													if (!actor
																															.equals(interaction)) {
																														if (!actor
																																.equals(messageReceive)) {
																															if (!actor
																																	.equals(packageDeclaration)) {
																																if (!actor
																																		.equals(line)) {
																																	if (!actor
																																			.equals(actorToLine)) {
																																		if (!actor
																																				.equals(precondToMessage)) {
																																			if (!packageDeclaration
																																					.equals(precond)) {
																																				if (!packageDeclaration
																																						.equals(useCaseToInteraction)) {
																																					if (!packageDeclaration
																																							.equals(useCase)) {
																																						if (!packageDeclaration
																																								.equals(precondToMessage)) {
																																							if (!line
																																									.equals(precond)) {
																																								if (!line
																																										.equals(useCaseToInteraction)) {
																																									if (!line
																																											.equals(useCase)) {
																																										if (!line
																																												.equals(message)) {
																																											if (!line
																																													.equals(messageReceive)) {
																																												if (!line
																																														.equals(packageDeclaration)) {
																																													if (!line
																																															.equals(precondToMessage)) {
																																														if (!actorToLine
																																																.equals(precond)) {
																																															if (!actorToLine
																																																	.equals(useCaseToInteraction)) {
																																																if (!actorToLine
																																																		.equals(useCase)) {
																																																	if (!actorToLine
																																																			.equals(message)) {
																																																		if (!actorToLine
																																																				.equals(interaction)) {
																																																			if (!actorToLine
																																																					.equals(messageReceive)) {
																																																				if (!actorToLine
																																																						.equals(packageDeclaration)) {
																																																					if (!actorToLine
																																																							.equals(line)) {
																																																						if (!actorToLine
																																																								.equals(precondToMessage)) {
																																																							if (!precondToMessage
																																																									.equals(useCaseToInteraction)) {
																																																								if (!precondToMessage
																																																										.equals(useCase)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											precond,
																																																											useCaseToInteraction,
																																																											useCase,
																																																											message,
																																																											interaction,
																																																											messageReceive,
																																																											actor,
																																																											packageDeclaration,
																																																											line,
																																																											actorToLine,
																																																											precondToMessage };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_3_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject precond, EObject useCase,
			EObject message, EObject interaction, EObject messageReceive,
			EObject line, EObject precondToMessage) {
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge precondToMessage__precond____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge precondToMessage__message____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UseCasePrecondToFoundMessageRule";
		String useCase__precond____preconditions_name_prime = "preconditions";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String precondToMessage__precond____source_name_prime = "source";
		String precondToMessage__message____target_name_prime = "target";
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		ruleresult.getCreatedEdges().add(useCase__precond____preconditions);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				message__messageReceive____receiveEvent);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		ruleresult.getTranslatedEdges()
				.add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(interaction__message____message);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				interaction__messageReceive____fragment);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageReceive__line____covered);
		precondToMessage__precond____source.setSrc(precondToMessage);
		precondToMessage__precond____source.setTrg(precond);
		ruleresult.getCreatedEdges().add(precondToMessage__precond____source);
		precondToMessage__message____target.setSrc(precondToMessage);
		precondToMessage__message____target.setTrg(message);
		ruleresult.getCreatedEdges().add(precondToMessage__message____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		precondToMessage__precond____source
				.setName(precondToMessage__precond____source_name_prime);
		precondToMessage__message____target
				.setName(precondToMessage__message____target_name_prime);
		return new Object[] { ruleresult, precond, useCase, message,
				interaction, messageReceive, line, precondToMessage,
				useCase__precond____preconditions,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				precondToMessage__precond____source,
				precondToMessage__message____target };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_11_5_expressionBBBBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			PerformRuleResult ruleresult, EObject precond,
			EObject useCaseToInteraction, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject precondToMessage) {
		_this.registerObjects_BWD(ruleresult, precond, useCaseToInteraction,
				useCase, message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine, precondToMessage);

	}

	public static final PerformRuleResult pattern_UseCasePrecondToFoundMessageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_1_blackFBB(
			EClass eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_12_1_binding = pattern_UseCasePrecondToFoundMessageRule_12_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_12_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_12_1_black = pattern_UseCasePrecondToFoundMessageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UseCasePrecondToFoundMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("message");
		EObject _localVariable_1 = match.getObject("interaction");
		EObject _localVariable_2 = match.getObject("messageReceive");
		EObject _localVariable_3 = match.getObject("line");
		EObject tmpMessage = _localVariable_0;
		EObject tmpInteraction = _localVariable_1;
		EObject tmpMessageReceive = _localVariable_2;
		EObject tmpLine = _localVariable_3;
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
					if (tmpLine instanceof Lifeline) {
						Lifeline line = (Lifeline) tmpLine;
						return new Object[] { message, interaction,
								messageReceive, line, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_12_2_blackFFBBBFBFB(
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
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
						_result.add(new Object[] { useCaseToInteraction,
								useCase, message, interaction, messageReceive,
								actor, line, actorToLine, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_12_3_blackBBBBBBFBB(
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			Lifeline line, ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCase.equals(useCaseToInteraction.getSource())) {
			if (interaction.equals(useCaseToInteraction.getTarget())) {
				if (messageReceive.equals(message.getReceiveEvent())) {
					if (interaction.equals(message.getInteraction())) {
						if (interaction.equals(line.getInteraction())) {
							if (interaction.equals(messageReceive
									.getEnclosingInteraction())) {
								if (message.equals(messageReceive.getMessage())) {
									if (line.getCoveredBy().contains(
											messageReceive)) {
										if (actor.equals(actorToLine
												.getSource())) {
											if (line.equals(actorToLine
													.getTarget())) {
												for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																useCase,
																PackageDeclaration.class,
																"useCases")) {
													if (packageDeclaration
															.getActors()
															.contains(actor)) {
														_result.add(new Object[] {
																useCaseToInteraction,
																useCase,
																message,
																interaction,
																messageReceive,
																actor,
																packageDeclaration,
																line,
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
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_3_greenBBBBBBBBBFFFFFFFFFFFFFFFFF(
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__message____message_name_prime = "message";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				message__messageReceive____receiveEvent);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				interaction__message____message);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				interaction__messageReceive____fragment);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__message____message);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__line____covered);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		return new Object[] { useCaseToInteraction, useCase, message,
				interaction, messageReceive, actor, packageDeclaration, line,
				actorToLine, isApplicableMatch,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				line__interaction____interaction,
				interaction__line____lifeline,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				messageReceive__message____message,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				line__messageReceive____coveredBy,
				messageReceive__line____covered, actorToLine__actor____source,
				actorToLine__line____target };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_4_bindingFBBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, useCaseToInteraction, useCase, message,
				interaction, messageReceive, actor, packageDeclaration, line,
				actorToLine);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					useCaseToInteraction, useCase, message, interaction,
					messageReceive, actor, packageDeclaration, line,
					actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_4_bindingAndBlackFBBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_12_4_binding = pattern_UseCasePrecondToFoundMessageRule_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, useCaseToInteraction, useCase,
				message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine);
		if (result_pattern_UseCasePrecondToFoundMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_12_4_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_12_4_black = pattern_UseCasePrecondToFoundMessageRule_12_4_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCaseToInteraction, useCase, message, interaction,
						messageReceive, actor, packageDeclaration, line,
						actorToLine };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_12_5_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UseCasePrecondToFoundMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UseCasePrecondToFoundMessageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_20_1_binding = pattern_UseCasePrecondToFoundMessageRule_20_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_20_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_20_1_black = pattern_UseCasePrecondToFoundMessageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_0BB(
			UCCondition precond, UseCase useCase) {
		for (UseCase __DEC_precond_preconditions_544138 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(precond, UseCase.class,
						"preconditions")) {
			if (!useCase.equals(__DEC_precond_preconditions_544138)) {
				return new Object[] { precond, useCase };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_20_2_blackFFFFB(
			EMoflonEdge _edge_preconditions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_preconditions.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpPrecond = _edge_preconditions.getTrg();
			if (tmpPrecond instanceof UCCondition) {
				UCCondition precond = (UCCondition) tmpPrecond;
				if (useCase.getPreconditions().contains(precond)) {
					if (pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_0BB(
							precond, useCase) == null) {
						for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(useCase,
										PackageDeclaration.class, "useCases")) {
							for (Actor actor : packageDeclaration.getActors()) {
								_result.add(new Object[] { precond, useCase,
										actor, packageDeclaration,
										_edge_preconditions });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_20_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UCCondition precond, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, precond,
				useCase, actor, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_20_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_21_1_binding = pattern_UseCasePrecondToFoundMessageRule_21_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_21_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_21_1_black = pattern_UseCasePrecondToFoundMessageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_129476 = message.getSendEvent();
		if (__DEC_message_sendEvent_129476 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_129476)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_838611 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_838611)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_21_2_blackFFFFB(
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
						Interaction interaction = message.getInteraction();
						if (interaction != null) {
							if (interaction.equals(messageReceive
									.getEnclosingInteraction())) {
								if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_2BB(
												message, messageReceive) == null) {
											for (Lifeline line : messageReceive
													.getCovered()) {
												if (interaction.equals(line
														.getInteraction())) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line,
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

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_21_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_21_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_22_1_binding = pattern_UseCasePrecondToFoundMessageRule_22_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_22_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_22_1_black = pattern_UseCasePrecondToFoundMessageRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_862524 = message.getSendEvent();
		if (__DEC_message_sendEvent_862524 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_862524)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_801448 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_801448)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_22_2_blackFFFFB(
			EMoflonEdge _edge_interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_interaction.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpInteraction = _edge_interaction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(message.getInteraction())) {
					MessageEnd tmpMessageReceive = message.getReceiveEvent();
					if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
						if (interaction.equals(messageReceive
								.getEnclosingInteraction())) {
							if (message.equals(messageReceive.getMessage())) {
								if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_2BB(
												message, messageReceive) == null) {
											for (Lifeline line : interaction
													.getLifeline()) {
												if (line.getCoveredBy()
														.contains(
																messageReceive)) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line,
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

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_22_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_22_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_23_1_binding = pattern_UseCasePrecondToFoundMessageRule_23_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_23_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_23_1_black = pattern_UseCasePrecondToFoundMessageRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_665512 = message.getSendEvent();
		if (__DEC_message_sendEvent_665512 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_665512)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_157544 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_157544)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_23_2_blackFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_message.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (interaction.equals(message.getInteraction())) {
					MessageEnd tmpMessageReceive = message.getReceiveEvent();
					if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
						if (interaction.equals(messageReceive
								.getEnclosingInteraction())) {
							if (message.equals(messageReceive.getMessage())) {
								if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_2BB(
												message, messageReceive) == null) {
											for (Lifeline line : interaction
													.getLifeline()) {
												if (line.getCoveredBy()
														.contains(
																messageReceive)) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line, _edge_message });
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_23_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_23_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_24_1_binding = pattern_UseCasePrecondToFoundMessageRule_24_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_24_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_24_1_black = pattern_UseCasePrecondToFoundMessageRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_587633 = message.getSendEvent();
		if (__DEC_message_sendEvent_587633 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_587633)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_391797 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_391797)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_24_2_blackFFFFB(
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
					Message message = messageReceive.getMessage();
					if (message != null) {
						if (messageReceive.equals(message.getReceiveEvent())) {
							if (interaction.equals(message.getInteraction())) {
								if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_2BB(
												message, messageReceive) == null) {
											for (Lifeline line : messageReceive
													.getCovered()) {
												if (interaction.equals(line
														.getInteraction())) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line,
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

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_24_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_24_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_25_1_binding = pattern_UseCasePrecondToFoundMessageRule_25_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_25_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_25_1_black = pattern_UseCasePrecondToFoundMessageRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_532869 = message.getSendEvent();
		if (__DEC_message_sendEvent_532869 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_532869)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_790905 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_790905)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_25_2_blackFFFFB(
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
					Message message = messageReceive.getMessage();
					if (message != null) {
						if (messageReceive.equals(message.getReceiveEvent())) {
							if (interaction.equals(message.getInteraction())) {
								if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_2BB(
												message, messageReceive) == null) {
											for (Lifeline line : interaction
													.getLifeline()) {
												if (line.getCoveredBy()
														.contains(
																messageReceive)) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line,
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

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_25_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_25_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_26_1_binding = pattern_UseCasePrecondToFoundMessageRule_26_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_26_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_26_1_black = pattern_UseCasePrecondToFoundMessageRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_74196 = message.getSendEvent();
		if (__DEC_message_sendEvent_74196 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_74196)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_861635 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_861635)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_26_2_blackFFFFB(
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
						Interaction interaction = messageReceive
								.getEnclosingInteraction();
						if (interaction != null) {
							if (interaction.equals(message.getInteraction())) {
								if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_2BB(
												message, messageReceive) == null) {
											for (Lifeline line : messageReceive
													.getCovered()) {
												if (interaction.equals(line
														.getInteraction())) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line, _edge_message });
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_26_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_26_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_27_1_binding = pattern_UseCasePrecondToFoundMessageRule_27_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_27_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_27_1_black = pattern_UseCasePrecondToFoundMessageRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_851381 = message.getSendEvent();
		if (__DEC_message_sendEvent_851381 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_851381)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_98802 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_98802)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_27_2_blackFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpMessageReceive = _edge_coveredBy.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (line.getCoveredBy().contains(messageReceive)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						if (interaction.equals(messageReceive
								.getEnclosingInteraction())) {
							Message message = messageReceive.getMessage();
							if (message != null) {
								if (messageReceive.equals(message
										.getReceiveEvent())) {
									if (interaction.equals(message
											.getInteraction())) {
										if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_0BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_1BB(
													message, messageReceive) == null) {
												if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_2BB(
														message, messageReceive) == null) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line,
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_27_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_27_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_28_1_binding = pattern_UseCasePrecondToFoundMessageRule_28_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_28_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_28_1_black = pattern_UseCasePrecondToFoundMessageRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_356831 = message.getSendEvent();
		if (__DEC_message_sendEvent_356831 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_356831)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_93500 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_93500)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_28_2_blackFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_covered.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(messageReceive)) {
					Interaction interaction = messageReceive
							.getEnclosingInteraction();
					if (interaction != null) {
						if (interaction.equals(line.getInteraction())) {
							Message message = messageReceive.getMessage();
							if (message != null) {
								if (messageReceive.equals(message
										.getReceiveEvent())) {
									if (interaction.equals(message
											.getInteraction())) {
										if (pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_0BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_1BB(
													message, messageReceive) == null) {
												if (pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_2BB(
														message, messageReceive) == null) {
													_result.add(new Object[] {
															message,
															interaction,
															messageReceive,
															line, _edge_covered });
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_28_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_28_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_1_blackB(
			UseCasePrecondToFoundMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_31_2_blackFFFFFFFFBB(
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
							if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_0BB(
									ruleResult, useCaseToInteraction) == null) {
								if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_1BB(
										ruleResult, useCase) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_6BB(
											ruleResult, interaction) == null) {
										for (Lifeline line : interaction
												.getLifeline()) {
											if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_5BB(
													ruleResult, line) == null) {
												for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																useCase,
																PackageDeclaration.class,
																"useCases")) {
													if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_2BB(
															ruleResult,
															packageDeclaration) == null) {
														for (Actor actor : packageDeclaration
																.getActors()) {
															if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_3BB(
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
																		if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_4BB(
																				ruleResult,
																				actorToLine) == null) {
																			_result.add(new Object[] {
																					useCaseToInteractionList,
																					useCaseToInteraction,
																					useCase,
																					packageDeclaration,
																					actor,
																					actorToLine,
																					line,
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
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_3_bindingFBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, useCaseToInteraction, useCase, interaction,
				actor, packageDeclaration, line, actorToLine, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					useCaseToInteraction, useCase, interaction, actor,
					packageDeclaration, line, actorToLine, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_3_bindingAndBlackFBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch,
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_31_3_binding = pattern_UseCasePrecondToFoundMessageRule_31_3_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, useCaseToInteraction, useCase,
				interaction, actor, packageDeclaration, line, actorToLine,
				ruleResult);
		if (result_pattern_UseCasePrecondToFoundMessageRule_31_3_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_31_3_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_31_3_black = pattern_UseCasePrecondToFoundMessageRule_31_3_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_31_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						useCaseToInteraction, useCase, interaction, actor,
						packageDeclaration, line, actorToLine, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_31_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_5_blackBBBBBBB(
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine) {
		return new Object[] { useCaseToInteraction, useCase, interaction,
				actor, packageDeclaration, line, actorToLine };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_6_blackBBBBBBBB(
			UseCaseToInteraction useCaseToInteraction, UseCase useCase,
			Interaction interaction, Actor actor,
			PackageDeclaration packageDeclaration, Lifeline line,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { useCaseToInteraction, useCase, interaction,
				actor, packageDeclaration, line, actorToLine, ruleResult };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_6_greenFBFBFBFBB(
			UseCase useCase, Interaction interaction, Lifeline line,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		UCCondition precond = UseCaseDSLFactory.eINSTANCE.createUCCondition();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		UCConditionToMessage precondToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUCConditionToMessage();
		Object _localVariable_0 = csp.getValue("precond", "name");
		Object _localVariable_1 = csp.getValue("message", "name");
		Object _localVariable_2 = csp.getValue("message", "messageSort");
		Object _localVariable_3 = csp.getValue("message", "messageKind");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		useCase.getPreconditions().add(precond);
		ruleResult.getSourceObjects().add(precond);
		message.setInteraction(interaction);
		ruleResult.getTargetObjects().add(message);
		message.setReceiveEvent(messageReceive);
		messageReceive.setEnclosingInteraction(interaction);
		messageReceive.setMessage(message);
		line.getCoveredBy().add(messageReceive);
		ruleResult.getTargetObjects().add(messageReceive);
		precondToMessage.setSource(precond);
		precondToMessage.setTarget(message);
		ruleResult.getCorrObjects().add(precondToMessage);
		String precond_name_prime = (String) _localVariable_0;
		String message_name_prime = (String) _localVariable_1;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_2;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		precond.setName(precond_name_prime);
		message.setName(message_name_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { precond, useCase, message, interaction,
				messageReceive, line, precondToMessage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UseCasePrecondToFoundMessageRule_31_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCasePrecondToFoundMessageRuleImpl
