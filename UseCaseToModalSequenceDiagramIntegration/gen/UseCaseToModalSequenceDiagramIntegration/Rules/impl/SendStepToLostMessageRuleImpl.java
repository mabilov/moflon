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
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule;

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
 * An implementation of the model object '<em><b>Send Step To Lost Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SendStepToLostMessageRuleImpl extends AbstractRuleImpl implements
		SendStepToLostMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendStepToLostMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSendStepToLostMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		// initial bindings
		Object[] result1_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_0_1_blackBBBBBBB(this,
						match, step, useCase, flow, actor, packageDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_0_2_bindingAndBlackFBBBBBBB(
						this, match, step, useCase, flow, actor,
						packageDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_4_blackBBBBBB(match,
							step, useCase, flow, actor, packageDeclaration);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_4_greenBBBBFF(match,
							step, flow, actor);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_5_blackBBBBBB(match,
							step, useCase, flow, actor, packageDeclaration);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_5_greenBBBBBFFF(match,
							useCase, flow, actor, packageDeclaration);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[7];

			// register objects to match
			SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_6_expressionBBBBBBB(
							this, match, step, useCase, flow, actor,
							packageDeclaration);
			return SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_7_expressionF();
		} else {
			return SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		NormalStep step = (NormalStep) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		Interaction interaction = (Interaction) result1_bindingAndBlack[3];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		Actor actor = (Actor) result1_bindingAndBlack[6];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[7];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_1_greenFFBBB(line,
						interaction, csp);
		Message message = (Message) result1_green[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];

		// collect translated elements
		Object[] result2_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_2_blackBBB(step, message,
						messageSend);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_2_greenFBBB(step, message,
						messageSend);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_3_blackBBBBBBBBBBBB(
						ruleresult, step, message, messageSend, line, useCase,
						interaction, useCaseToInteraction, flow, actor,
						actorToLine, packageDeclaration);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_3_greenBBBBBBBBFFFFFFFF(
						ruleresult, step, message, messageSend, line,
						interaction, flow, actor);
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[8];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[9];
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[10];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[11];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[12];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[13];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[14];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, step, message, messageSend, line,
						useCase, interaction, useCaseToInteraction, flow,
						actor, actorToLine, packageDeclaration);
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		Actor actor = (Actor) result2_binding[3];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[4];
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_2_2_blackBFBFFBBFBB(step,
						useCase, flow, actor, packageDeclaration, match)) {
			Lifeline line = (Lifeline) result2_black[1];
			Interaction interaction = (Interaction) result2_black[3];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[4];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_2_3_blackBBBBBBBBB(step,
							line, useCase, interaction, useCaseToInteraction,
							flow, actor, actorToLine, packageDeclaration)) {
				Object[] result3_green = SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
								step, line, useCase, interaction,
								useCaseToInteraction, flow, actor, actorToLine,
								packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[11];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[16];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[19];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, step, line, useCase,
								interaction, useCaseToInteraction, flow, actor,
								actorToLine, packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		match.registerObject("step", step);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("SEND");
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
			NormalStep step, Lifeline line, UseCase useCase,
			Interaction interaction, UseCaseToInteraction useCaseToInteraction,
			Flow flow, Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_SIGNAL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("LOST");
		literal1.setType("");

		// Create attribute variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", true, csp);
		var_step_name.setValue(step.getName());
		var_step_name.setType("String");

		// Create unbound variables
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");

		// Create constraints
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();

		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject step,
			EObject message, EObject messageSend, EObject line,
			EObject useCase, EObject interaction, EObject useCaseToInteraction,
			EObject flow, EObject actor, EObject actorToLine,
			EObject packageDeclaration) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
	public boolean isAppropriate_BWD(Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		// initial bindings
		Object[] result1_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_10_1_blackBBBBBB(this,
						match, message, messageSend, line, interaction);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_10_2_bindingAndBlackFBBBBBB(
						this, match, message, messageSend, line, interaction);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_4_blackBBBBB(match,
							message, messageSend, line, interaction);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_4_greenBBBBBFFFFFF(
							match, message, messageSend, line, interaction);
			// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result4_green[5];
			// EMoflonEdge messageSend__message____message = (EMoflonEdge) result4_green[6];
			// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result4_green[7];
			// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result4_green[8];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[9];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_5_blackBBBBB(match,
							message, messageSend, line, interaction);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_5_greenBBBFF(match,
							line, interaction);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[4];

			// register objects to match
			SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_6_expressionBBBBBB(
							this, match, message, messageSend, line,
							interaction);
			return SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_7_expressionF();
		} else {
			return SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_1_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Message message = (Message) result1_bindingAndBlack[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[1];
		Lifeline line = (Lifeline) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		Interaction interaction = (Interaction) result1_bindingAndBlack[4];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[5];
		Flow flow = (Flow) result1_bindingAndBlack[6];
		Actor actor = (Actor) result1_bindingAndBlack[7];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[8];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_1_greenFBBB(flow, actor,
						csp);
		NormalStep step = (NormalStep) result1_green[0];

		// collect translated elements
		Object[] result2_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_2_blackBBB(step, message,
						messageSend);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_2_greenFBBB(step,
						message, messageSend);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_3_blackBBBBBBBBBBBB(
						ruleresult, step, message, messageSend, line, useCase,
						interaction, useCaseToInteraction, flow, actor,
						actorToLine, packageDeclaration);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_3_greenBBBBBBBBFFFFFFFF(
						ruleresult, step, message, messageSend, line,
						interaction, flow, actor);
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[8];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[9];
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[10];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[11];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[12];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[13];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[14];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, step, message, messageSend, line,
						useCase, interaction, useCaseToInteraction, flow,
						actor, actorToLine, packageDeclaration);
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Message message = (Message) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		Lifeline line = (Lifeline) result2_binding[2];
		Interaction interaction = (Interaction) result2_binding[3];
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_12_2_blackBBBFBFFFB(message,
						messageSend, line, interaction, match)) {
			UseCase useCase = (UseCase) result2_black[3];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[5];
			Actor actor = (Actor) result2_black[6];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_12_3_blackBBBBBBFBBF(
							message, messageSend, line, useCase, interaction,
							useCaseToInteraction, actor, actorToLine)) {
				Flow flow = (Flow) result3_black[6];
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[9];
				Object[] result3_green = SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
								message, messageSend, line, useCase,
								interaction, useCaseToInteraction, flow, actor,
								actorToLine, packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[11];
				// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[12];
				// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[13];
				// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[16];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[17];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[18];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[19];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[24];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, message, messageSend,
								line, useCase, interaction,
								useCaseToInteraction, flow, actor, actorToLine,
								packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		match.registerObject("message", message);
		match.registerObject("messageSend", messageSend);
		match.registerObject("line", line);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_SIGNAL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("LOST");
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
			Message message, MessageOccurrenceSpecification messageSend,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("SEND");
		literal0.setType("");

		// Create attribute variables
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

		// Create constraints
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal0);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject step,
			EObject message, EObject messageSend, EObject line,
			EObject useCase, EObject interaction, EObject useCaseToInteraction,
			EObject flow, EObject actor, EObject actorToLine,
			EObject packageDeclaration) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
				&& match.getObject("messageSend")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_144(
			EMoflonEdge _edge_sendEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_20_2_blackFFFFB(_edge_sendEvent)) {
			Message message = (Message) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Interaction interaction = (Interaction) result2_black[3];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_20_3_expressionFBBBBBB(
							this, match, message, messageSend, line,
							interaction)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_145(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_21_2_blackFFFFB(_edge_message)) {
			Message message = (Message) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Interaction interaction = (Interaction) result2_black[3];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_21_3_expressionFBBBBBB(
							this, match, message, messageSend, line,
							interaction)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_146(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_22_2_blackFFFFB(_edge_coveredBy)) {
			Message message = (Message) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Interaction interaction = (Interaction) result2_black[3];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_22_3_expressionFBBBBBB(
							this, match, message, messageSend, line,
							interaction)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_147(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_23_2_blackFFFFB(_edge_covered)) {
			Message message = (Message) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Interaction interaction = (Interaction) result2_black[3];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_23_3_expressionFBBBBBB(
							this, match, message, messageSend, line,
							interaction)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_148(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_24_2_blackFFFFB(_edge_interaction)) {
			Message message = (Message) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Interaction interaction = (Interaction) result2_black[3];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_24_3_expressionFBBBBBB(
							this, match, message, messageSend, line,
							interaction)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_149(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_25_2_blackFFFFB(_edge_message)) {
			Message message = (Message) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Interaction interaction = (Interaction) result2_black[3];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_25_3_expressionFBBBBBB(
							this, match, message, messageSend, line,
							interaction)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_450(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_26_2_blackFFFFFB(_edge_steps)) {
			NormalStep step = (NormalStep) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[4];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_26_3_expressionFBBBBBBB(
							this, match, step, useCase, flow, actor,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_451(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_27_2_blackFFFFFB(_edge_actor)) {
			NormalStep step = (NormalStep) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[4];
			Object[] result2_green = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_27_3_expressionFBBBBBBB(
							this, match, step, useCase, flow, actor,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_27_6_expressionFB(__result);
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
		Object[] result1_black = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_30_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_30_2_blackFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList useCaseToInteractionList = (RuleEntryList) result2_black[0];
			Lifeline line = (Lifeline) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[3];
			UseCase useCase = (UseCase) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[6];
			Actor actor = (Actor) result2_black[7];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_30_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, line, useCase,
							interaction, useCaseToInteraction, flow, actor,
							actorToLine, packageDeclaration, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SendStepToLostMessageRuleImpl
					.pattern_SendStepToLostMessageRule_30_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = SendStepToLostMessageRuleImpl
						.pattern_SendStepToLostMessageRule_30_5_blackBBBBBBBB(
								line, useCase, interaction,
								useCaseToInteraction, flow, actor, actorToLine,
								packageDeclaration);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_30_6_blackBBBBBBBBB(
									line, useCase, interaction,
									useCaseToInteraction, flow, actor,
									actorToLine, packageDeclaration, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					SendStepToLostMessageRuleImpl
							.pattern_SendStepToLostMessageRule_30_6_greenFFFBBBBBB(
									line, interaction, flow, actor, ruleResult,
									csp);
					// NormalStep step = (NormalStep) result6_green[0];
					// Message message = (Message) result6_green[1];
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return SendStepToLostMessageRuleImpl
				.pattern_SendStepToLostMessageRule_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("SEND");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ASYNCH_SIGNAL");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("LOST");
		literal2.setType("");

		// Create attribute variables

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
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");

		// Create constraints
		EqStepType eqStepType = new EqStepType();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();

		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal0);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal1);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal2);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (UseCase) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (UseCase) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (UseCase) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NORMALSTEP_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(NormalStep) arguments.get(1), (Lifeline) arguments.get(2),
					(UseCase) arguments.get(3), (Interaction) arguments.get(4),
					(UseCaseToInteraction) arguments.get(5),
					(Flow) arguments.get(6), (Actor) arguments.get(7),
					(ActorToLifeline) arguments.get(8),
					(PackageDeclaration) arguments.get(9));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Lifeline) arguments.get(3), (Interaction) arguments.get(4));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Lifeline) arguments.get(3), (Interaction) arguments.get(4));
			return null;
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Lifeline) arguments.get(3), (Interaction) arguments.get(4));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Message) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Lifeline) arguments.get(3), (UseCase) arguments.get(4),
					(Interaction) arguments.get(5),
					(UseCaseToInteraction) arguments.get(6),
					(Flow) arguments.get(7), (Actor) arguments.get(8),
					(ActorToLifeline) arguments.get(9),
					(PackageDeclaration) arguments.get(10));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_144__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_144((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_145__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_145((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_146__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_146((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_147__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_147((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_148__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_148((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_149__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_149((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_450__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_450((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_451__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_451((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Lifeline) arguments.get(1), (UseCase) arguments.get(2),
					(Interaction) arguments.get(3),
					(UseCaseToInteraction) arguments.get(4),
					(Flow) arguments.get(5), (Actor) arguments.get(6),
					(ActorToLifeline) arguments.get(7),
					(PackageDeclaration) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_1_blackBBBBBBB(
			SendStepToLostMessageRule _this, Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		return new Object[] { _this, match, step, useCase, flow, actor,
				packageDeclaration };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_2_bindingFBBBBBBB(
			SendStepToLostMessageRule _this, Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, step,
				useCase, flow, actor, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, useCase, flow,
					actor, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_2_bindingAndBlackFBBBBBBB(
			SendStepToLostMessageRule _this, Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SendStepToLostMessageRule_0_2_binding = pattern_SendStepToLostMessageRule_0_2_bindingFBBBBBBB(
				_this, match, step, useCase, flow, actor, packageDeclaration);
		if (result_pattern_SendStepToLostMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_0_2_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_0_2_black = pattern_SendStepToLostMessageRule_0_2_blackB(csp);
			if (result_pattern_SendStepToLostMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, step, useCase, flow,
						actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SendStepToLostMessageRule_0_3_expressionFBB(
			SendStepToLostMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_4_blackBBBBBB(
			Match match, NormalStep step, UseCase useCase, Flow flow,
			Actor actor, PackageDeclaration packageDeclaration) {
		return new Object[] { match, step, useCase, flow, actor,
				packageDeclaration };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_4_greenBBBBFF(
			Match match, NormalStep step, Flow flow, Actor actor) {
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
		return new Object[] { match, step, flow, actor, flow__step____steps,
				step__actor____actor };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_5_blackBBBBBB(
			Match match, NormalStep step, UseCase useCase, Flow flow,
			Actor actor, PackageDeclaration packageDeclaration) {
		return new Object[] { match, step, useCase, flow, actor,
				packageDeclaration };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_0_5_greenBBBBBFFF(
			Match match, UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(actor);
		match.getContextNodes().add(packageDeclaration);
		String useCase__flow____flows_name_prime = "flows";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { match, useCase, flow, actor, packageDeclaration,
				useCase__flow____flows, packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final void pattern_SendStepToLostMessageRule_0_6_expressionBBBBBBB(
			SendStepToLostMessageRule _this, Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		_this.registerObjectsToMatch_FWD(match, step, useCase, flow, actor,
				packageDeclaration);

	}

	public static final boolean pattern_SendStepToLostMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("step");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("actor");
		EObject _localVariable_7 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpStep = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		EObject tmpUseCaseToInteraction = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpActor = _localVariable_6;
		EObject tmpActorToLine = _localVariable_7;
		EObject tmpPackageDeclaration = _localVariable_8;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
							UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpActor instanceof Actor) {
									Actor actor = (Actor) tmpActor;
									if (tmpActorToLine instanceof ActorToLifeline) {
										ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
										if (tmpPackageDeclaration instanceof PackageDeclaration) {
											PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
											return new Object[] { step, line,
													useCase, interaction,
													useCaseToInteraction, flow,
													actor, actorToLine,
													packageDeclaration,
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

	public static final Object[] pattern_SendStepToLostMessageRule_1_1_blackBBBBBBBBBFBB(
			NormalStep step, Lifeline line, UseCase useCase,
			Interaction interaction, UseCaseToInteraction useCaseToInteraction,
			Flow flow, Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration,
			SendStepToLostMessageRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { step, line, useCase, interaction,
						useCaseToInteraction, flow, actor, actorToLine,
						packageDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_1_1_bindingAndBlackFFFFFFFFFFBB(
			SendStepToLostMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SendStepToLostMessageRule_1_1_binding = pattern_SendStepToLostMessageRule_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SendStepToLostMessageRule_1_1_binding != null) {
			NormalStep step = (NormalStep) result_pattern_SendStepToLostMessageRule_1_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_SendStepToLostMessageRule_1_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_SendStepToLostMessageRule_1_1_binding[2];
			Interaction interaction = (Interaction) result_pattern_SendStepToLostMessageRule_1_1_binding[3];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_SendStepToLostMessageRule_1_1_binding[4];
			Flow flow = (Flow) result_pattern_SendStepToLostMessageRule_1_1_binding[5];
			Actor actor = (Actor) result_pattern_SendStepToLostMessageRule_1_1_binding[6];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_SendStepToLostMessageRule_1_1_binding[7];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_SendStepToLostMessageRule_1_1_binding[8];

			Object[] result_pattern_SendStepToLostMessageRule_1_1_black = pattern_SendStepToLostMessageRule_1_1_blackBBBBBBBBBFBB(
					step, line, useCase, interaction, useCaseToInteraction,
					flow, actor, actorToLine, packageDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_SendStepToLostMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_1_1_black[9];

				return new Object[] { step, line, useCase, interaction,
						useCaseToInteraction, flow, actor, actorToLine,
						packageDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_1_1_greenFFBBB(
			Lifeline line, Interaction interaction, CSP csp) {
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Object _localVariable_0 = csp.getValue("message", "messageSort");
		Object _localVariable_1 = csp.getValue("message", "messageKind");
		Object _localVariable_2 = csp.getValue("message", "name");
		message.setInteraction(interaction);
		message.setSendEvent(messageSend);
		messageSend.setMessage(message);
		line.getCoveredBy().add(messageSend);
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_0;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_1;
		String message_name_prime = (String) _localVariable_2;
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.setName(message_name_prime);
		return new Object[] { message, messageSend, line, interaction, csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_1_2_blackBBB(
			NormalStep step, Message message,
			MessageOccurrenceSpecification messageSend) {
		return new Object[] { step, message, messageSend };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_1_2_greenFBBB(
			NormalStep step, Message message,
			MessageOccurrenceSpecification messageSend) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(message);
		ruleresult.getCreatedElements().add(messageSend);
		return new Object[] { ruleresult, step, message, messageSend };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject step, EObject message,
			EObject messageSend, EObject line, EObject useCase,
			EObject interaction, EObject useCaseToInteraction, EObject flow,
			EObject actor, EObject actorToLine, EObject packageDeclaration) {
		if (!step.equals(useCase)) {
			if (!step.equals(useCaseToInteraction)) {
				if (!message.equals(step)) {
					if (!message.equals(messageSend)) {
						if (!message.equals(useCase)) {
							if (!message.equals(useCaseToInteraction)) {
								if (!message.equals(packageDeclaration)) {
									if (!messageSend.equals(step)) {
										if (!messageSend.equals(useCase)) {
											if (!messageSend
													.equals(useCaseToInteraction)) {
												if (!messageSend
														.equals(packageDeclaration)) {
													if (!line.equals(step)) {
														if (!line
																.equals(message)) {
															if (!line
																	.equals(messageSend)) {
																if (!line
																		.equals(useCase)) {
																	if (!line
																			.equals(useCaseToInteraction)) {
																		if (!line
																				.equals(packageDeclaration)) {
																			if (!useCase
																					.equals(useCaseToInteraction)) {
																				if (!interaction
																						.equals(step)) {
																					if (!interaction
																							.equals(message)) {
																						if (!interaction
																								.equals(messageSend)) {
																							if (!interaction
																									.equals(line)) {
																								if (!interaction
																										.equals(useCase)) {
																									if (!interaction
																											.equals(useCaseToInteraction)) {
																										if (!interaction
																												.equals(packageDeclaration)) {
																											if (!flow
																													.equals(step)) {
																												if (!flow
																														.equals(message)) {
																													if (!flow
																															.equals(messageSend)) {
																														if (!flow
																																.equals(line)) {
																															if (!flow
																																	.equals(useCase)) {
																																if (!flow
																																		.equals(interaction)) {
																																	if (!flow
																																			.equals(useCaseToInteraction)) {
																																		if (!flow
																																				.equals(packageDeclaration)) {
																																			if (!actor
																																					.equals(step)) {
																																				if (!actor
																																						.equals(message)) {
																																					if (!actor
																																							.equals(messageSend)) {
																																						if (!actor
																																								.equals(line)) {
																																							if (!actor
																																									.equals(useCase)) {
																																								if (!actor
																																										.equals(interaction)) {
																																									if (!actor
																																											.equals(useCaseToInteraction)) {
																																										if (!actor
																																												.equals(flow)) {
																																											if (!actor
																																													.equals(actorToLine)) {
																																												if (!actor
																																														.equals(packageDeclaration)) {
																																													if (!actorToLine
																																															.equals(step)) {
																																														if (!actorToLine
																																																.equals(message)) {
																																															if (!actorToLine
																																																	.equals(messageSend)) {
																																																if (!actorToLine
																																																		.equals(line)) {
																																																	if (!actorToLine
																																																			.equals(useCase)) {
																																																		if (!actorToLine
																																																				.equals(interaction)) {
																																																			if (!actorToLine
																																																					.equals(useCaseToInteraction)) {
																																																				if (!actorToLine
																																																						.equals(flow)) {
																																																					if (!actorToLine
																																																							.equals(packageDeclaration)) {
																																																						if (!packageDeclaration
																																																								.equals(step)) {
																																																							if (!packageDeclaration
																																																									.equals(useCase)) {
																																																								if (!packageDeclaration
																																																										.equals(useCaseToInteraction)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											step,
																																																											message,
																																																											messageSend,
																																																											line,
																																																											useCase,
																																																											interaction,
																																																											useCaseToInteraction,
																																																											flow,
																																																											actor,
																																																											actorToLine,
																																																											packageDeclaration };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SendStepToLostMessageRule_1_3_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject step, EObject message,
			EObject messageSend, EObject line, EObject interaction,
			EObject flow, EObject actor) {
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SendStepToLostMessageRule";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String messageSend__message____message_name_prime = "message";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(message__messageSend____sendEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageSend__message____message);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageSend__line____covered);
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
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, step, message, messageSend, line,
				interaction, flow, actor, message__messageSend____sendEvent,
				messageSend__message____message,
				line__messageSend____coveredBy, messageSend__line____covered,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_SendStepToLostMessageRule_1_5_expressionBBBBBBBBBBBBB(
			SendStepToLostMessageRule _this, PerformRuleResult ruleresult,
			EObject step, EObject message, EObject messageSend, EObject line,
			EObject useCase, EObject interaction, EObject useCaseToInteraction,
			EObject flow, EObject actor, EObject actorToLine,
			EObject packageDeclaration) {
		_this.registerObjects_FWD(ruleresult, step, message, messageSend, line,
				useCase, interaction, useCaseToInteraction, flow, actor,
				actorToLine, packageDeclaration);

	}

	public static final PerformRuleResult pattern_SendStepToLostMessageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_1_blackFBB(
			EClass eClass, SendStepToLostMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_2_1_binding = pattern_SendStepToLostMessageRule_2_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SendStepToLostMessageRule_2_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_2_1_black = pattern_SendStepToLostMessageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SendStepToLostMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("flow");
		EObject _localVariable_3 = match.getObject("actor");
		EObject _localVariable_4 = match.getObject("packageDeclaration");
		EObject tmpStep = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpActor = _localVariable_3;
		EObject tmpPackageDeclaration = _localVariable_4;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpActor instanceof Actor) {
						Actor actor = (Actor) tmpActor;
						if (tmpPackageDeclaration instanceof PackageDeclaration) {
							PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
							return new Object[] { step, useCase, flow, actor,
									packageDeclaration, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_2_2_blackBFBFFBBFBB(
			NormalStep step, UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, UseCaseToInteraction.class,
						"source")) {
			Interaction interaction = useCaseToInteraction.getTarget();
			if (interaction != null) {
				for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(actor,
								ActorToLifeline.class, "source")) {
					Lifeline line = actorToLine.getTarget();
					if (line != null) {
						_result.add(new Object[] { step, line, useCase,
								interaction, useCaseToInteraction, flow, actor,
								actorToLine, packageDeclaration, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_2_3_blackBBBBBBBBB(
			NormalStep step, Lifeline line, UseCase useCase,
			Interaction interaction, UseCaseToInteraction useCaseToInteraction,
			Flow flow, Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCase.getFlows().contains(flow)) {
			if (interaction.equals(line.getInteraction())) {
				if (useCase.equals(useCaseToInteraction.getSource())) {
					if (interaction.equals(useCaseToInteraction.getTarget())) {
						if (flow.getSteps().contains(step)) {
							if (actor.equals(step.getActor())) {
								if (actor.equals(actorToLine.getSource())) {
									if (line.equals(actorToLine.getTarget())) {
										if (packageDeclaration.getActors()
												.contains(actor)) {
											if (packageDeclaration
													.getUseCases().contains(
															useCase)) {
												_result.add(new Object[] {
														step, line, useCase,
														interaction,
														useCaseToInteraction,
														flow, actor,
														actorToLine,
														packageDeclaration });
											}
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

	public static final Object[] pattern_SendStepToLostMessageRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
			NormalStep step, Lifeline line, UseCase useCase,
			Interaction interaction, UseCaseToInteraction useCaseToInteraction,
			Flow flow, Actor actor, ActorToLifeline actorToLine,
			PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
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
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
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
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
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
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { step, line, useCase, interaction,
				useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration, isApplicableMatch, useCase__flow____flows,
				line__interaction____interaction,
				interaction__line____lifeline,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, step__actor____actor,
				actorToLine__actor____source, actorToLine__line____target,
				packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_4_bindingFBBBBBBBBBBB(
			SendStepToLostMessageRule _this,
			IsApplicableMatch isApplicableMatch, NormalStep step,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, step, line, useCase, interaction,
				useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, step, line,
					useCase, interaction, useCaseToInteraction, flow, actor,
					actorToLine, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_4_bindingAndBlackFBBBBBBBBBBB(
			SendStepToLostMessageRule _this,
			IsApplicableMatch isApplicableMatch, NormalStep step,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SendStepToLostMessageRule_2_4_binding = pattern_SendStepToLostMessageRule_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, step, line, useCase, interaction,
				useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration);
		if (result_pattern_SendStepToLostMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_2_4_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_2_4_black = pattern_SendStepToLostMessageRule_2_4_blackB(csp);
			if (result_pattern_SendStepToLostMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, step,
						line, useCase, interaction, useCaseToInteraction, flow,
						actor, actorToLine, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SendStepToLostMessageRule_2_5_expressionFBB(
			SendStepToLostMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SendStepToLostMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SendStepToLostMessageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_1_blackBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		return new Object[] { _this, match, message, messageSend, line,
				interaction };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_2_bindingFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, message,
				messageSend, line, interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, message, messageSend,
					line, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_2_bindingAndBlackFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		Object[] result_pattern_SendStepToLostMessageRule_10_2_binding = pattern_SendStepToLostMessageRule_10_2_bindingFBBBBBB(
				_this, match, message, messageSend, line, interaction);
		if (result_pattern_SendStepToLostMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_10_2_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_10_2_black = pattern_SendStepToLostMessageRule_10_2_blackB(csp);
			if (result_pattern_SendStepToLostMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, message, messageSend,
						line, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_SendStepToLostMessageRule_10_3_expressionFBB(
			SendStepToLostMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_4_blackBBBBB(
			Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		return new Object[] { match, message, messageSend, line, interaction };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_4_greenBBBBBFFFFFF(
			Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(message);
		match.getToBeTranslatedNodes().add(messageSend);
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String messageSend__message____message_name_prime = "message";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(message__messageSend____sendEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageSend__message____message);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageSend__line____covered);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(interaction__message____message);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		return new Object[] { match, message, messageSend, line, interaction,
				message__messageSend____sendEvent,
				messageSend__message____message,
				line__messageSend____coveredBy, messageSend__line____covered,
				message__interaction____interaction,
				interaction__message____message };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_5_blackBBBBB(
			Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		return new Object[] { match, message, messageSend, line, interaction };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_10_5_greenBBBFF(
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

	public static final void pattern_SendStepToLostMessageRule_10_6_expressionBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		_this.registerObjectsToMatch_BWD(match, message, messageSend, line,
				interaction);

	}

	public static final boolean pattern_SendStepToLostMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("message");
		EObject _localVariable_1 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_2 = isApplicableMatch.getObject("line");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_6 = isApplicableMatch.getObject("flow");
		EObject _localVariable_7 = isApplicableMatch.getObject("actor");
		EObject _localVariable_8 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpMessage = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpLine = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpInteraction = _localVariable_4;
		EObject tmpUseCaseToInteraction = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		EObject tmpActor = _localVariable_7;
		EObject tmpActorToLine = _localVariable_8;
		EObject tmpPackageDeclaration = _localVariable_9;
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpLine instanceof Lifeline) {
					Lifeline line = (Lifeline) tmpLine;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
								UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
								if (tmpFlow instanceof Flow) {
									Flow flow = (Flow) tmpFlow;
									if (tmpActor instanceof Actor) {
										Actor actor = (Actor) tmpActor;
										if (tmpActorToLine instanceof ActorToLifeline) {
											ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
											if (tmpPackageDeclaration instanceof PackageDeclaration) {
												PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
												return new Object[] { message,
														messageSend, line,
														useCase, interaction,
														useCaseToInteraction,
														flow, actor,
														actorToLine,
														packageDeclaration,
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
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_1_blackBBBBBBBBBBFBB(
			Message message, MessageOccurrenceSpecification messageSend,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration,
			SendStepToLostMessageRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { message, messageSend, line, useCase,
						interaction, useCaseToInteraction, flow, actor,
						actorToLine, packageDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_1_bindingAndBlackFFFFFFFFFFFBB(
			SendStepToLostMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SendStepToLostMessageRule_11_1_binding = pattern_SendStepToLostMessageRule_11_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SendStepToLostMessageRule_11_1_binding != null) {
			Message message = (Message) result_pattern_SendStepToLostMessageRule_11_1_binding[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_SendStepToLostMessageRule_11_1_binding[1];
			Lifeline line = (Lifeline) result_pattern_SendStepToLostMessageRule_11_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_SendStepToLostMessageRule_11_1_binding[3];
			Interaction interaction = (Interaction) result_pattern_SendStepToLostMessageRule_11_1_binding[4];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_SendStepToLostMessageRule_11_1_binding[5];
			Flow flow = (Flow) result_pattern_SendStepToLostMessageRule_11_1_binding[6];
			Actor actor = (Actor) result_pattern_SendStepToLostMessageRule_11_1_binding[7];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_SendStepToLostMessageRule_11_1_binding[8];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_SendStepToLostMessageRule_11_1_binding[9];

			Object[] result_pattern_SendStepToLostMessageRule_11_1_black = pattern_SendStepToLostMessageRule_11_1_blackBBBBBBBBBBFBB(
					message, messageSend, line, useCase, interaction,
					useCaseToInteraction, flow, actor, actorToLine,
					packageDeclaration, _this, isApplicableMatch);
			if (result_pattern_SendStepToLostMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_11_1_black[10];

				return new Object[] { message, messageSend, line, useCase,
						interaction, useCaseToInteraction, flow, actor,
						actorToLine, packageDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_1_greenFBBB(
			Flow flow, Actor actor, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		flow.getSteps().add(step);
		step.setActor(actor);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		return new Object[] { step, flow, actor, csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_2_blackBBB(
			NormalStep step, Message message,
			MessageOccurrenceSpecification messageSend) {
		return new Object[] { step, message, messageSend };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_2_greenFBBB(
			NormalStep step, Message message,
			MessageOccurrenceSpecification messageSend) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(message);
		ruleresult.getTranslatedElements().add(messageSend);
		return new Object[] { ruleresult, step, message, messageSend };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject step, EObject message,
			EObject messageSend, EObject line, EObject useCase,
			EObject interaction, EObject useCaseToInteraction, EObject flow,
			EObject actor, EObject actorToLine, EObject packageDeclaration) {
		if (!step.equals(useCase)) {
			if (!step.equals(useCaseToInteraction)) {
				if (!message.equals(step)) {
					if (!message.equals(messageSend)) {
						if (!message.equals(useCase)) {
							if (!message.equals(useCaseToInteraction)) {
								if (!message.equals(packageDeclaration)) {
									if (!messageSend.equals(step)) {
										if (!messageSend.equals(useCase)) {
											if (!messageSend
													.equals(useCaseToInteraction)) {
												if (!messageSend
														.equals(packageDeclaration)) {
													if (!line.equals(step)) {
														if (!line
																.equals(message)) {
															if (!line
																	.equals(messageSend)) {
																if (!line
																		.equals(useCase)) {
																	if (!line
																			.equals(useCaseToInteraction)) {
																		if (!line
																				.equals(packageDeclaration)) {
																			if (!useCase
																					.equals(useCaseToInteraction)) {
																				if (!interaction
																						.equals(step)) {
																					if (!interaction
																							.equals(message)) {
																						if (!interaction
																								.equals(messageSend)) {
																							if (!interaction
																									.equals(line)) {
																								if (!interaction
																										.equals(useCase)) {
																									if (!interaction
																											.equals(useCaseToInteraction)) {
																										if (!interaction
																												.equals(packageDeclaration)) {
																											if (!flow
																													.equals(step)) {
																												if (!flow
																														.equals(message)) {
																													if (!flow
																															.equals(messageSend)) {
																														if (!flow
																																.equals(line)) {
																															if (!flow
																																	.equals(useCase)) {
																																if (!flow
																																		.equals(interaction)) {
																																	if (!flow
																																			.equals(useCaseToInteraction)) {
																																		if (!flow
																																				.equals(packageDeclaration)) {
																																			if (!actor
																																					.equals(step)) {
																																				if (!actor
																																						.equals(message)) {
																																					if (!actor
																																							.equals(messageSend)) {
																																						if (!actor
																																								.equals(line)) {
																																							if (!actor
																																									.equals(useCase)) {
																																								if (!actor
																																										.equals(interaction)) {
																																									if (!actor
																																											.equals(useCaseToInteraction)) {
																																										if (!actor
																																												.equals(flow)) {
																																											if (!actor
																																													.equals(actorToLine)) {
																																												if (!actor
																																														.equals(packageDeclaration)) {
																																													if (!actorToLine
																																															.equals(step)) {
																																														if (!actorToLine
																																																.equals(message)) {
																																															if (!actorToLine
																																																	.equals(messageSend)) {
																																																if (!actorToLine
																																																		.equals(line)) {
																																																	if (!actorToLine
																																																			.equals(useCase)) {
																																																		if (!actorToLine
																																																				.equals(interaction)) {
																																																			if (!actorToLine
																																																					.equals(useCaseToInteraction)) {
																																																				if (!actorToLine
																																																						.equals(flow)) {
																																																					if (!actorToLine
																																																							.equals(packageDeclaration)) {
																																																						if (!packageDeclaration
																																																								.equals(step)) {
																																																							if (!packageDeclaration
																																																									.equals(useCase)) {
																																																								if (!packageDeclaration
																																																										.equals(useCaseToInteraction)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											step,
																																																											message,
																																																											messageSend,
																																																											line,
																																																											useCase,
																																																											interaction,
																																																											useCaseToInteraction,
																																																											flow,
																																																											actor,
																																																											actorToLine,
																																																											packageDeclaration };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SendStepToLostMessageRule_11_3_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject step, EObject message,
			EObject messageSend, EObject line, EObject interaction,
			EObject flow, EObject actor) {
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SendStepToLostMessageRule";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String messageSend__message____message_name_prime = "message";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(message__messageSend____sendEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageSend__message____message);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageSend__line____covered);
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
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, step, message, messageSend, line,
				interaction, flow, actor, message__messageSend____sendEvent,
				messageSend__message____message,
				line__messageSend____coveredBy, messageSend__line____covered,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_SendStepToLostMessageRule_11_5_expressionBBBBBBBBBBBBB(
			SendStepToLostMessageRule _this, PerformRuleResult ruleresult,
			EObject step, EObject message, EObject messageSend, EObject line,
			EObject useCase, EObject interaction, EObject useCaseToInteraction,
			EObject flow, EObject actor, EObject actorToLine,
			EObject packageDeclaration) {
		_this.registerObjects_BWD(ruleresult, step, message, messageSend, line,
				useCase, interaction, useCaseToInteraction, flow, actor,
				actorToLine, packageDeclaration);

	}

	public static final PerformRuleResult pattern_SendStepToLostMessageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_1_blackFBB(
			EClass eClass, SendStepToLostMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_12_1_binding = pattern_SendStepToLostMessageRule_12_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SendStepToLostMessageRule_12_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_12_1_black = pattern_SendStepToLostMessageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SendStepToLostMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("message");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("line");
		EObject _localVariable_3 = match.getObject("interaction");
		EObject tmpMessage = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpLine = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpLine instanceof Lifeline) {
					Lifeline line = (Lifeline) tmpLine;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						return new Object[] { message, messageSend, line,
								interaction, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_12_2_blackBBBFBFFFB(
			Message message, MessageOccurrenceSpecification messageSend,
			Lifeline line, Interaction interaction, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(interaction,
						UseCaseToInteraction.class, "target")) {
			UseCase useCase = useCaseToInteraction.getSource();
			if (useCase != null) {
				for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(line, ActorToLifeline.class,
								"target")) {
					Actor actor = actorToLine.getSource();
					if (actor != null) {
						_result.add(new Object[] { message, messageSend, line,
								useCase, interaction, useCaseToInteraction,
								actor, actorToLine, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_12_3_blackBBBBBBFBBF(
			Message message, MessageOccurrenceSpecification messageSend,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Actor actor,
			ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (messageSend.equals(message.getSendEvent())) {
			if (message.equals(messageSend.getMessage())) {
				if (line.getCoveredBy().contains(messageSend)) {
					if (interaction.equals(line.getInteraction())) {
						if (interaction.equals(message.getInteraction())) {
							if (useCase
									.equals(useCaseToInteraction.getSource())) {
								if (interaction.equals(useCaseToInteraction
										.getTarget())) {
									if (actor.equals(actorToLine.getSource())) {
										if (line.equals(actorToLine.getTarget())) {
											for (Flow flow : useCase.getFlows()) {
												for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																actor,
																PackageDeclaration.class,
																"actors")) {
													if (packageDeclaration
															.getUseCases()
															.contains(useCase)) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
																useCase,
																interaction,
																useCaseToInteraction,
																flow, actor,
																actorToLine,
																packageDeclaration });
													}
												}
											}
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

	public static final Object[] pattern_SendStepToLostMessageRule_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			Message message, MessageOccurrenceSpecification messageSend,
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String messageSend__message____message_name_prime = "message";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				message__messageSend____sendEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageSend__message____message);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageSend__line____covered);
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
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
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
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { message, messageSend, line, useCase, interaction,
				useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration, isApplicableMatch,
				message__messageSend____sendEvent,
				messageSend__message____message,
				line__messageSend____coveredBy, messageSend__line____covered,
				useCase__flow____flows, line__interaction____interaction,
				interaction__line____lifeline,
				message__interaction____interaction,
				interaction__message____message,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				actorToLine__actor____source, actorToLine__line____target,
				packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_4_bindingFBBBBBBBBBBBB(
			SendStepToLostMessageRule _this,
			IsApplicableMatch isApplicableMatch, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, message, messageSend, line, useCase,
				interaction, useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, message,
					messageSend, line, useCase, interaction,
					useCaseToInteraction, flow, actor, actorToLine,
					packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBB(
			SendStepToLostMessageRule _this,
			IsApplicableMatch isApplicableMatch, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SendStepToLostMessageRule_12_4_binding = pattern_SendStepToLostMessageRule_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, message, messageSend, line, useCase,
				interaction, useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration);
		if (result_pattern_SendStepToLostMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_12_4_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_12_4_black = pattern_SendStepToLostMessageRule_12_4_blackB(csp);
			if (result_pattern_SendStepToLostMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, message,
						messageSend, line, useCase, interaction,
						useCaseToInteraction, flow, actor, actorToLine,
						packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SendStepToLostMessageRule_12_5_expressionFBB(
			SendStepToLostMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SendStepToLostMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SendStepToLostMessageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_20_1_binding = pattern_SendStepToLostMessageRule_20_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_20_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_20_1_black = pattern_SendStepToLostMessageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		MessageEnd __DEC_message_receiveEvent_813138 = message
				.getReceiveEvent();
		if (__DEC_message_receiveEvent_813138 != null) {
			if (!messageSend.equals(__DEC_message_receiveEvent_813138)) {
				return new Object[] { message, messageSend };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		for (MessageEnd __DEC_message_message_250791 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageSend.equals(__DEC_message_message_250791)) {
				return new Object[] { message, messageSend };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_2_black_nac_2BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_472225 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_472225 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_472225)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_2_black_nac_4BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_20_2_blackFFFFB(
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
						Interaction interaction = message.getInteraction();
						if (interaction != null) {
							if (pattern_SendStepToLostMessageRule_20_2_black_nac_0BB(
									message, messageSend) == null) {
								if (pattern_SendStepToLostMessageRule_20_2_black_nac_1BB(
										message, messageSend) == null) {
									if (pattern_SendStepToLostMessageRule_20_2_black_nac_3BB(
											message, messageSend) == null) {
										if (pattern_SendStepToLostMessageRule_20_2_black_nac_2BB(
												messageSend, interaction) == null) {
											if (pattern_SendStepToLostMessageRule_20_2_black_nac_4BB(
													messageSend, interaction) == null) {
												for (Lifeline line : messageSend
														.getCovered()) {
													if (interaction.equals(line
															.getInteraction())) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
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

		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_20_3_expressionFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				messageSend, line, interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_20_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_21_1_binding = pattern_SendStepToLostMessageRule_21_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_21_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_21_1_black = pattern_SendStepToLostMessageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		MessageEnd __DEC_message_receiveEvent_987434 = message
				.getReceiveEvent();
		if (__DEC_message_receiveEvent_987434 != null) {
			if (!messageSend.equals(__DEC_message_receiveEvent_987434)) {
				return new Object[] { message, messageSend };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		for (MessageEnd __DEC_message_message_111412 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageSend.equals(__DEC_message_message_111412)) {
				return new Object[] { message, messageSend };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_2_black_nac_2BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_90344 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_90344 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_90344)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_2_black_nac_4BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_21_2_blackFFFFB(
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
						Interaction interaction = message.getInteraction();
						if (interaction != null) {
							if (pattern_SendStepToLostMessageRule_21_2_black_nac_0BB(
									message, messageSend) == null) {
								if (pattern_SendStepToLostMessageRule_21_2_black_nac_1BB(
										message, messageSend) == null) {
									if (pattern_SendStepToLostMessageRule_21_2_black_nac_3BB(
											message, messageSend) == null) {
										if (pattern_SendStepToLostMessageRule_21_2_black_nac_2BB(
												messageSend, interaction) == null) {
											if (pattern_SendStepToLostMessageRule_21_2_black_nac_4BB(
													messageSend, interaction) == null) {
												for (Lifeline line : messageSend
														.getCovered()) {
													if (interaction.equals(line
															.getInteraction())) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
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

		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_21_3_expressionFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				messageSend, line, interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_21_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_22_1_binding = pattern_SendStepToLostMessageRule_22_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_22_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_22_1_black = pattern_SendStepToLostMessageRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		MessageEnd __DEC_message_receiveEvent_581762 = message
				.getReceiveEvent();
		if (__DEC_message_receiveEvent_581762 != null) {
			if (!messageSend.equals(__DEC_message_receiveEvent_581762)) {
				return new Object[] { message, messageSend };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		for (MessageEnd __DEC_message_message_640595 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageSend.equals(__DEC_message_message_640595)) {
				return new Object[] { message, messageSend };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_2_black_nac_2BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_703219 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_703219 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_703219)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_2_black_nac_4BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_22_2_blackFFFFB(
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
						Message message = messageSend.getMessage();
						if (message != null) {
							if (messageSend.equals(message.getSendEvent())) {
								if (interaction
										.equals(message.getInteraction())) {
									if (pattern_SendStepToLostMessageRule_22_2_black_nac_2BB(
											messageSend, interaction) == null) {
										if (pattern_SendStepToLostMessageRule_22_2_black_nac_4BB(
												messageSend, interaction) == null) {
											if (pattern_SendStepToLostMessageRule_22_2_black_nac_0BB(
													message, messageSend) == null) {
												if (pattern_SendStepToLostMessageRule_22_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SendStepToLostMessageRule_22_2_black_nac_3BB(
															message,
															messageSend) == null) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
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

		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_22_3_expressionFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				messageSend, line, interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_22_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_23_1_binding = pattern_SendStepToLostMessageRule_23_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_23_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_23_1_black = pattern_SendStepToLostMessageRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		MessageEnd __DEC_message_receiveEvent_278187 = message
				.getReceiveEvent();
		if (__DEC_message_receiveEvent_278187 != null) {
			if (!messageSend.equals(__DEC_message_receiveEvent_278187)) {
				return new Object[] { message, messageSend };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		for (MessageEnd __DEC_message_message_235407 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageSend.equals(__DEC_message_message_235407)) {
				return new Object[] { message, messageSend };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_2_black_nac_2BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_525209 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_525209 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_525209)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_2_black_nac_4BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_23_2_blackFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(messageSend)) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							Interaction interaction = line.getInteraction();
							if (interaction != null) {
								if (interaction
										.equals(message.getInteraction())) {
									if (pattern_SendStepToLostMessageRule_23_2_black_nac_0BB(
											message, messageSend) == null) {
										if (pattern_SendStepToLostMessageRule_23_2_black_nac_1BB(
												message, messageSend) == null) {
											if (pattern_SendStepToLostMessageRule_23_2_black_nac_3BB(
													message, messageSend) == null) {
												if (pattern_SendStepToLostMessageRule_23_2_black_nac_2BB(
														messageSend,
														interaction) == null) {
													if (pattern_SendStepToLostMessageRule_23_2_black_nac_4BB(
															messageSend,
															interaction) == null) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
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

		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_23_3_expressionFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				messageSend, line, interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_23_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_24_1_binding = pattern_SendStepToLostMessageRule_24_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_24_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_24_1_black = pattern_SendStepToLostMessageRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		MessageEnd __DEC_message_receiveEvent_94427 = message.getReceiveEvent();
		if (__DEC_message_receiveEvent_94427 != null) {
			if (!messageSend.equals(__DEC_message_receiveEvent_94427)) {
				return new Object[] { message, messageSend };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		for (MessageEnd __DEC_message_message_595242 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageSend.equals(__DEC_message_message_595242)) {
				return new Object[] { message, messageSend };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_2_black_nac_2BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_475480 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_475480 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_475480)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_2_black_nac_4BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_24_2_blackFFFFB(
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
							if (pattern_SendStepToLostMessageRule_24_2_black_nac_0BB(
									message, messageSend) == null) {
								if (pattern_SendStepToLostMessageRule_24_2_black_nac_1BB(
										message, messageSend) == null) {
									if (pattern_SendStepToLostMessageRule_24_2_black_nac_2BB(
											messageSend, interaction) == null) {
										if (pattern_SendStepToLostMessageRule_24_2_black_nac_3BB(
												message, messageSend) == null) {
											if (pattern_SendStepToLostMessageRule_24_2_black_nac_4BB(
													messageSend, interaction) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageSend)) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
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

		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_24_3_expressionFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				messageSend, line, interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_24_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_25_1_binding = pattern_SendStepToLostMessageRule_25_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_25_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_25_1_black = pattern_SendStepToLostMessageRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		MessageEnd __DEC_message_receiveEvent_665600 = message
				.getReceiveEvent();
		if (__DEC_message_receiveEvent_665600 != null) {
			if (!messageSend.equals(__DEC_message_receiveEvent_665600)) {
				return new Object[] { message, messageSend };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		for (MessageEnd __DEC_message_message_579786 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageSend.equals(__DEC_message_message_579786)) {
				return new Object[] { message, messageSend };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_2_black_nac_2BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_508420 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_508420 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_508420)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_2_black_nac_4BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_25_2_blackFFFFB(
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
							if (pattern_SendStepToLostMessageRule_25_2_black_nac_0BB(
									message, messageSend) == null) {
								if (pattern_SendStepToLostMessageRule_25_2_black_nac_1BB(
										message, messageSend) == null) {
									if (pattern_SendStepToLostMessageRule_25_2_black_nac_2BB(
											messageSend, interaction) == null) {
										if (pattern_SendStepToLostMessageRule_25_2_black_nac_3BB(
												message, messageSend) == null) {
											if (pattern_SendStepToLostMessageRule_25_2_black_nac_4BB(
													messageSend, interaction) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageSend)) {
														_result.add(new Object[] {
																message,
																messageSend,
																line,
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

		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_25_3_expressionFBBBBBB(
			SendStepToLostMessageRule _this, Match match, Message message,
			MessageOccurrenceSpecification messageSend, Lifeline line,
			Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				messageSend, line, interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_25_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_26_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_26_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_26_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_26_1_binding = pattern_SendStepToLostMessageRule_26_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_26_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_26_1_black = pattern_SendStepToLostMessageRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_26_2_blackFFFFFB(
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
						for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									_result.add(new Object[] { step, useCase,
											flow, actor, packageDeclaration,
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

	public static final Object[] pattern_SendStepToLostMessageRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_26_3_expressionFBBBBBBB(
			SendStepToLostMessageRule _this, Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, step,
				useCase, flow, actor, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_26_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_27_1_bindingFB(
			SendStepToLostMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_27_1_blackFBB(
			EClass __eClass, SendStepToLostMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_27_1_bindingAndBlackFFB(
			SendStepToLostMessageRule _this) {
		Object[] result_pattern_SendStepToLostMessageRule_27_1_binding = pattern_SendStepToLostMessageRule_27_1_bindingFB(_this);
		if (result_pattern_SendStepToLostMessageRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SendStepToLostMessageRule_27_1_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_27_1_black = pattern_SendStepToLostMessageRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SendStepToLostMessageRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SendStepToLostMessageRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_27_2_blackFFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_actor.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(step.getActor())) {
					for (Flow flow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(step, Flow.class,
									"steps")) {
						for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(actor,
										PackageDeclaration.class, "actors")) {
							for (UseCase useCase : packageDeclaration
									.getUseCases()) {
								if (useCase.getFlows().contains(flow)) {
									_result.add(new Object[] { step, useCase,
											flow, actor, packageDeclaration,
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

	public static final Object[] pattern_SendStepToLostMessageRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SendStepToLostMessageRule_27_3_expressionFBBBBBBB(
			SendStepToLostMessageRule _this, Match match, NormalStep step,
			UseCase useCase, Flow flow, Actor actor,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, step,
				useCase, flow, actor, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SendStepToLostMessageRule_27_4_expressionFBB(
			SendStepToLostMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SendStepToLostMessageRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_1_blackB(
			SendStepToLostMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SendStepToLostMessageRule_30_2_blackFFFFFFFFFBB(
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
							if (pattern_SendStepToLostMessageRule_30_2_black_nac_2BB(
									ruleResult, useCaseToInteraction) == null) {
								if (pattern_SendStepToLostMessageRule_30_2_black_nac_1BB(
										ruleResult, interaction) == null) {
									if (pattern_SendStepToLostMessageRule_30_2_black_nac_3BB(
											ruleResult, useCase) == null) {
										for (Lifeline line : interaction
												.getLifeline()) {
											if (pattern_SendStepToLostMessageRule_30_2_black_nac_0BB(
													ruleResult, line) == null) {
												for (Flow flow : useCase
														.getFlows()) {
													if (pattern_SendStepToLostMessageRule_30_2_black_nac_4BB(
															ruleResult, flow) == null) {
														for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		useCase,
																		PackageDeclaration.class,
																		"useCases")) {
															if (pattern_SendStepToLostMessageRule_30_2_black_nac_5BB(
																	ruleResult,
																	packageDeclaration) == null) {
																for (Actor actor : packageDeclaration
																		.getActors()) {
																	if (pattern_SendStepToLostMessageRule_30_2_black_nac_6BB(
																			ruleResult,
																			actor) == null) {
																		for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
																				.getOppositeReferenceTyped(
																						line,
																						ActorToLifeline.class,
																						"target")) {
																			if (actor
																					.equals(actorToLine
																							.getSource())) {
																				if (pattern_SendStepToLostMessageRule_30_2_black_nac_7BB(
																						ruleResult,
																						actorToLine) == null) {
																					_result.add(new Object[] {
																							useCaseToInteractionList,
																							line,
																							interaction,
																							useCaseToInteraction,
																							useCase,
																							flow,
																							packageDeclaration,
																							actor,
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
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_3_bindingFBBBBBBBBBBB(
			SendStepToLostMessageRule _this,
			IsApplicableMatch isApplicableMatch, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, line, useCase, interaction,
				useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, line, useCase,
					interaction, useCaseToInteraction, flow, actor,
					actorToLine, packageDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_3_bindingAndBlackFBBBBBBBBBBB(
			SendStepToLostMessageRule _this,
			IsApplicableMatch isApplicableMatch, Lifeline line,
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SendStepToLostMessageRule_30_3_binding = pattern_SendStepToLostMessageRule_30_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, line, useCase, interaction,
				useCaseToInteraction, flow, actor, actorToLine,
				packageDeclaration, ruleResult);
		if (result_pattern_SendStepToLostMessageRule_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_SendStepToLostMessageRule_30_3_binding[0];

			Object[] result_pattern_SendStepToLostMessageRule_30_3_black = pattern_SendStepToLostMessageRule_30_3_blackB(csp);
			if (result_pattern_SendStepToLostMessageRule_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, line,
						useCase, interaction, useCaseToInteraction, flow,
						actor, actorToLine, packageDeclaration, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SendStepToLostMessageRule_30_4_expressionFBB(
			SendStepToLostMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_5_blackBBBBBBBB(
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration) {
		return new Object[] { line, useCase, interaction, useCaseToInteraction,
				flow, actor, actorToLine, packageDeclaration };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_6_blackBBBBBBBBB(
			Lifeline line, UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, Flow flow, Actor actor,
			ActorToLifeline actorToLine, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { line, useCase, interaction, useCaseToInteraction,
				flow, actor, actorToLine, packageDeclaration, ruleResult };
	}

	public static final Object[] pattern_SendStepToLostMessageRule_30_6_greenFFFBBBBBB(
			Lifeline line, Interaction interaction, Flow flow, Actor actor,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("message", "messageSort");
		Object _localVariable_3 = csp.getValue("message", "messageKind");
		Object _localVariable_4 = csp.getValue("message", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		flow.getSteps().add(step);
		step.setActor(actor);
		ruleResult.getSourceObjects().add(step);
		message.setInteraction(interaction);
		ruleResult.getTargetObjects().add(message);
		message.setSendEvent(messageSend);
		messageSend.setMessage(message);
		line.getCoveredBy().add(messageSend);
		ruleResult.getTargetObjects().add(messageSend);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_2;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_3;
		String message_name_prime = (String) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.setName(message_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { step, message, messageSend, line, interaction,
				flow, actor, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SendStepToLostMessageRule_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SendStepToLostMessageRuleImpl
