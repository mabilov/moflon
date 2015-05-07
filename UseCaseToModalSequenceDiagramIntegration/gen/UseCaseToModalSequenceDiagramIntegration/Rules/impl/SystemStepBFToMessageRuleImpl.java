/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
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
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule;

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
 * An implementation of the model object '<em><b>System Step BF To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystemStepBFToMessageRuleImpl extends AbstractRuleImpl implements
		SystemStepBFToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStepBFToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSystemStepBFToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, BasicFlow flow,
			NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		// initial bindings
		Object[] result1_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_0_1_blackBBBBBBB(this,
						match, actor, flow, step, useCase, packageDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_0_2_bindingAndBlackFBBBBBBB(
						this, match, actor, flow, step, useCase,
						packageDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_4_blackBBBBBB(match,
							actor, flow, step, useCase, packageDeclaration);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_4_greenBBBBFF(match,
							actor, flow, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_5_blackBBBBBB(match,
							actor, flow, step, useCase, packageDeclaration);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_5_greenBBBBBFFF(match,
							actor, flow, useCase, packageDeclaration);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[7];

			// register objects to match
			SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_6_expressionBBBBBBB(
							this, match, actor, flow, step, useCase,
							packageDeclaration);
			return SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_7_expressionF();
		} else {
			return SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		Interaction interaction = (Interaction) result1_bindingAndBlack[2];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[3];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[4];
		NormalStep step = (NormalStep) result1_bindingAndBlack[5];
		UseCase useCase = (UseCase) result1_bindingAndBlack[6];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[7];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_1_greenBFBFFB(line,
						interaction, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[3];
		Message message = (Message) result1_green[4];

		// collect translated elements
		Object[] result2_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_2_blackBBBB(messageSend,
						messageReceive, step, message);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_2_greenFBBBB(messageSend,
						messageReceive, step, message);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_3_blackBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, interaction,
						messageReceive, flow, flowToInteraction, step, message,
						useCase, useCaseToInteraction, packageDeclaration);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_3_greenBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, interaction,
						messageReceive, flow, step, message);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[9];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[10];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[11];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[12];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[13];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[14];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[15];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[16];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[17];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[18];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[19];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[20];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[21];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[22];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[23];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_5_expressionBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend,
						interaction, messageReceive, flow, flowToInteraction,
						step, message, useCase, useCaseToInteraction,
						packageDeclaration);
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		BasicFlow flow = (BasicFlow) result2_binding[1];
		NormalStep step = (NormalStep) result2_binding[2];
		UseCase useCase = (UseCase) result2_binding[3];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[4];
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_2_2_blackBFBFBBFBB(actor,
						flow, step, useCase, packageDeclaration, match)) {
			Interaction interaction = (Interaction) result2_black[1];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[3];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_2_3_blackBFBBBBBBB(
							actor, interaction, flow, flowToInteraction, step,
							useCase, useCaseToInteraction, packageDeclaration)) {
				Lifeline line = (Lifeline) result3_black[1];
				Object[] result3_green = SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
								actor, line, interaction, flow,
								flowToInteraction, step, useCase,
								useCaseToInteraction, packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[13];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[18];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[19];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, actor, line,
								interaction, flow, flowToInteraction, step,
								useCase, useCaseToInteraction,
								packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("useCase", useCase);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("PERFORM");
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
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
			NormalStep step, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {// Create CSP
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
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("step", step);
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
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
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
	public boolean isAppropriate_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		// initial bindings
		Object[] result1_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_10_1_blackBBBBBBB(this,
						match, line, messageSend, interaction, messageReceive,
						message);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_10_2_bindingAndBlackFBBBBBBB(
						this, match, line, messageSend, interaction,
						messageReceive, message);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_4_blackBBBBBB(match,
							line, messageSend, interaction, messageReceive,
							message);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_4_greenBBBBBBFFFFFFFFFFFFFF(
							match, line, messageSend, interaction,
							messageReceive, message);
			// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result4_green[6];
			// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result4_green[7];
			// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result4_green[8];
			// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result4_green[9];
			// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result4_green[10];
			// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result4_green[11];
			// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result4_green[12];
			// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result4_green[13];
			// EMoflonEdge messageSend__message____message = (EMoflonEdge) result4_green[14];
			// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result4_green[15];
			// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result4_green[16];
			// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result4_green[17];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[18];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[19];

			// collect context elements
			Object[] result5_black = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_5_blackBBBBBB(match,
							line, messageSend, interaction, messageReceive,
							message);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_5_greenBBBFF(match,
							line, interaction);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[4];

			// register objects to match
			SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_6_expressionBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message);
			return SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_7_expressionF();
		} else {
			return SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[2];
		Interaction interaction = (Interaction) result1_bindingAndBlack[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[4];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[5];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[6];
		Message message = (Message) result1_bindingAndBlack[7];
		UseCase useCase = (UseCase) result1_bindingAndBlack[8];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[9];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_1_greenBBFB(actor, flow,
						csp);
		NormalStep step = (NormalStep) result1_green[2];

		// collect translated elements
		Object[] result2_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_2_blackBBBB(messageSend,
						messageReceive, step, message);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_2_greenFBBBB(messageSend,
						messageReceive, step, message);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_3_blackBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, interaction,
						messageReceive, flow, flowToInteraction, step, message,
						useCase, useCaseToInteraction, packageDeclaration);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_3_greenBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, interaction,
						messageReceive, flow, step, message);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[9];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[10];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[11];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[12];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[13];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[14];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[15];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[16];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[17];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[18];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[19];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[20];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[21];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[22];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[23];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_5_expressionBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend,
						interaction, messageReceive, flow, flowToInteraction,
						step, message, useCase, useCaseToInteraction,
						packageDeclaration);
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Lifeline line = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		Interaction interaction = (Interaction) result2_binding[2];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[3];
		Message message = (Message) result2_binding[4];
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_12_2_blackBBBBFFBFFB(line,
						messageSend, interaction, messageReceive, message,
						match)) {
			BasicFlow flow = (BasicFlow) result2_black[4];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[5];
			UseCase useCase = (UseCase) result2_black[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_12_3_blackFBBBBBBBBBF(
							line, messageSend, interaction, messageReceive,
							flow, flowToInteraction, message, useCase,
							useCaseToInteraction)) {
				Actor actor = (Actor) result3_black[0];
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[10];
				Object[] result3_green = SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFF(
								actor, line, messageSend, interaction,
								messageReceive, flow, flowToInteraction,
								message, useCase, useCaseToInteraction,
								packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[12];
				// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[13];
				// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[14];
				// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[15];
				// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[16];
				// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[20];
				// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[21];
				// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[22];
				// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[23];
				// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[24];
				// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[25];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[26];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[27];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[28];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[29];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[30];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[31];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[32];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[33];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[34];

				// solve CSP
				Object[] result4_bindingAndBlack = SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line,
								messageSend, interaction, messageReceive, flow,
								flowToInteraction, message, useCase,
								useCaseToInteraction, packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("message", message);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {// Create CSP
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
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("PERFORM");
		literal1.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
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
		EqActorType eqActorType = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal1);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("message", message);
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
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_341(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_20_2_blackFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_20_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_342(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_21_2_blackFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_21_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_343(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_22_2_blackFFFFFB(_edge_enclosingInteraction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_22_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_344(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_23_2_blackFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_23_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_345(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_24_2_blackFFFFFB(_edge_enclosingInteraction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_24_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_346(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_25_2_blackFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_25_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_347(
			EMoflonEdge _edge_sendEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_26_2_blackFFFFFB(_edge_sendEvent)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_26_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_348(
			EMoflonEdge _edge_receiveEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_27_2_blackFFFFFB(_edge_receiveEvent)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_27_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_349(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_28_2_blackFFFFFB(_edge_message)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_28_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_350(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_29_2_blackFFFFFB(_edge_message)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_29_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_351(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_30_2_blackFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_30_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_352(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_31_2_blackFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_31_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_353(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_32_2_blackFFFFFB(_edge_interaction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_32_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_354(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_33_2_blackFFFFFB(_edge_message)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_33_3_expressionFBBBBBBB(
							this, match, line, messageSend, interaction,
							messageReceive, message)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_501(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_34_2_blackFFFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_34_3_expressionFBBBBBBB(
							this, match, actor, flow, step, useCase,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_34_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_34_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_34_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_502(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_35_2_blackFFFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[4];
			Object[] result2_green = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_35_3_expressionFBBBBBBB(
							this, match, actor, flow, step, useCase,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_35_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_35_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_35_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_35_6_expressionFB(__result);
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
		Object[] result1_black = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_38_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_38_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_38_2_blackFFFFFFFFFBB(
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
			Object[] result3_bindingAndBlack = SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_38_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, actor, line, interaction,
							flow, flowToInteraction, useCase,
							useCaseToInteraction, packageDeclaration,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SystemStepBFToMessageRuleImpl
					.pattern_SystemStepBFToMessageRule_38_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = SystemStepBFToMessageRuleImpl
						.pattern_SystemStepBFToMessageRule_38_5_blackBBBBBBBB(
								actor, line, interaction, flow,
								flowToInteraction, useCase,
								useCaseToInteraction, packageDeclaration);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_38_6_blackBBBBBBBBB(
									actor, line, interaction, flow,
									flowToInteraction, useCase,
									useCaseToInteraction, packageDeclaration,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					SystemStepBFToMessageRuleImpl
							.pattern_SystemStepBFToMessageRule_38_6_greenBBFBFBFFBB(
									actor, line, interaction, flow, ruleResult,
									csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[4];
					// NormalStep step = (NormalStep) result6_green[6];
					// Message message = (Message) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return SystemStepBFToMessageRuleImpl
				.pattern_SystemStepBFToMessageRule_38_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
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
		literal1.setValue("PERFORM");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("ASYNCH_CALL");
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal3", true, csp);
		literal3.setValue("COMPLETE");
		literal3.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

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
		EqActorType eqActorType = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal1);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal2);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal3);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
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
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (UseCase) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (UseCase) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (UseCase) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_NORMALSTEP_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(Interaction) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(NormalStep) arguments.get(6), (UseCase) arguments.get(7),
					(UseCaseToInteraction) arguments.get(8),
					(PackageDeclaration) arguments.get(9));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGE_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Interaction) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(BasicFlow) arguments.get(6),
					(FlowToInteractionFragment) arguments.get(7),
					(Message) arguments.get(8), (UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(PackageDeclaration) arguments.get(11));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_341__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_341((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_342__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_342((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_343__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_343((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_344__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_344((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_345__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_345((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_346__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_346((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_347__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_347((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_348__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_348((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_349__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_349((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_350__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_350((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_351__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_351((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_352__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_352((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_353__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_353((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_354__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_354((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_501__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_501((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_502__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_502((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowToInteractionFragment) arguments.get(1));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(Interaction) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(PackageDeclaration) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_1_blackBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		return new Object[] { _this, match, actor, flow, step, useCase,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_2_bindingFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, actor,
				flow, step, useCase, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, flow, step,
					useCase, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_2_bindingAndBlackFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SystemStepBFToMessageRule_0_2_binding = pattern_SystemStepBFToMessageRule_0_2_bindingFBBBBBBB(
				_this, match, actor, flow, step, useCase, packageDeclaration);
		if (result_pattern_SystemStepBFToMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_0_2_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_0_2_black = pattern_SystemStepBFToMessageRule_0_2_blackB(csp);
			if (result_pattern_SystemStepBFToMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor, flow, step,
						useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_0_3_expressionFBB(
			SystemStepBFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_4_blackBBBBBB(
			Match match, Actor actor, BasicFlow flow, NormalStep step,
			UseCase useCase, PackageDeclaration packageDeclaration) {
		return new Object[] { match, actor, flow, step, useCase,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_4_greenBBBBFF(
			Match match, Actor actor, BasicFlow flow, NormalStep step) {
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

	public static final Object[] pattern_SystemStepBFToMessageRule_0_5_blackBBBBBB(
			Match match, Actor actor, BasicFlow flow, NormalStep step,
			UseCase useCase, PackageDeclaration packageDeclaration) {
		return new Object[] { match, actor, flow, step, useCase,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_0_5_greenBBBBBFFF(
			Match match, Actor actor, BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
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
		return new Object[] { match, actor, flow, useCase, packageDeclaration,
				useCase__flow____flows, packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final void pattern_SystemStepBFToMessageRule_0_6_expressionBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		_this.registerObjectsToMatch_FWD(match, actor, flow, step, useCase,
				packageDeclaration);

	}

	public static final boolean pattern_SystemStepBFToMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_5 = isApplicableMatch.getObject("step");
		EObject _localVariable_6 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpInteraction = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpFlowToInteraction = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		EObject tmpUseCase = _localVariable_6;
		EObject tmpUseCaseToInteraction = _localVariable_7;
		EObject tmpPackageDeclaration = _localVariable_8;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpInteraction instanceof Interaction) {
					Interaction interaction = (Interaction) tmpInteraction;
					if (tmpFlow instanceof BasicFlow) {
						BasicFlow flow = (BasicFlow) tmpFlow;
						if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
							FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (tmpUseCase instanceof UseCase) {
									UseCase useCase = (UseCase) tmpUseCase;
									if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
										UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
										if (tmpPackageDeclaration instanceof PackageDeclaration) {
											PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
											return new Object[] { actor, line,
													interaction, flow,
													flowToInteraction, step,
													useCase,
													useCaseToInteraction,
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

	public static final Object[] pattern_SystemStepBFToMessageRule_1_1_blackBBBBBBBBBFBB(
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
			NormalStep step, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			SystemStepBFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { actor, line, interaction, flow,
						flowToInteraction, step, useCase, useCaseToInteraction,
						packageDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_1_1_bindingAndBlackFFFFFFFFFFBB(
			SystemStepBFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SystemStepBFToMessageRule_1_1_binding = pattern_SystemStepBFToMessageRule_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SystemStepBFToMessageRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_SystemStepBFToMessageRule_1_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_SystemStepBFToMessageRule_1_1_binding[1];
			Interaction interaction = (Interaction) result_pattern_SystemStepBFToMessageRule_1_1_binding[2];
			BasicFlow flow = (BasicFlow) result_pattern_SystemStepBFToMessageRule_1_1_binding[3];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_SystemStepBFToMessageRule_1_1_binding[4];
			NormalStep step = (NormalStep) result_pattern_SystemStepBFToMessageRule_1_1_binding[5];
			UseCase useCase = (UseCase) result_pattern_SystemStepBFToMessageRule_1_1_binding[6];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_SystemStepBFToMessageRule_1_1_binding[7];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_SystemStepBFToMessageRule_1_1_binding[8];

			Object[] result_pattern_SystemStepBFToMessageRule_1_1_black = pattern_SystemStepBFToMessageRule_1_1_blackBBBBBBBBBFBB(
					actor, line, interaction, flow, flowToInteraction, step,
					useCase, useCaseToInteraction, packageDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_SystemStepBFToMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_1_1_black[9];

				return new Object[] { actor, line, interaction, flow,
						flowToInteraction, step, useCase, useCaseToInteraction,
						packageDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_1_1_greenBFBFFB(
			Lifeline line, Interaction interaction, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		Object _localVariable_0 = csp.getValue("message", "messageSort");
		Object _localVariable_1 = csp.getValue("message", "messageKind");
		Object _localVariable_2 = csp.getValue("message", "name");
		line.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		messageReceive.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(messageReceive);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		message.setInteraction(interaction);
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_0;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_1;
		String message_name_prime = (String) _localVariable_2;
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.setName(message_name_prime);
		return new Object[] { line, messageSend, interaction, messageReceive,
				message, csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_1_2_blackBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_1_2_greenFBBBB(
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

	public static final Object[] pattern_SystemStepBFToMessageRule_1_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject messageReceive,
			EObject flow, EObject flowToInteraction, EObject step,
			EObject message, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(interaction)) {
					if (!actor.equals(messageReceive)) {
						if (!actor.equals(flow)) {
							if (!actor.equals(flowToInteraction)) {
								if (!actor.equals(step)) {
									if (!actor.equals(message)) {
										if (!actor.equals(useCase)) {
											if (!actor
													.equals(useCaseToInteraction)) {
												if (!actor
														.equals(packageDeclaration)) {
													if (!line
															.equals(messageSend)) {
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
																			if (!line
																					.equals(packageDeclaration)) {
																				if (!messageSend
																						.equals(step)) {
																					if (!messageSend
																							.equals(useCase)) {
																						if (!messageSend
																								.equals(useCaseToInteraction)) {
																							if (!messageSend
																									.equals(packageDeclaration)) {
																								if (!interaction
																										.equals(line)) {
																									if (!interaction
																											.equals(messageSend)) {
																										if (!interaction
																												.equals(messageReceive)) {
																											if (!interaction
																													.equals(step)) {
																												if (!interaction
																														.equals(message)) {
																													if (!interaction
																															.equals(useCase)) {
																														if (!interaction
																																.equals(useCaseToInteraction)) {
																															if (!interaction
																																	.equals(packageDeclaration)) {
																																if (!messageReceive
																																		.equals(messageSend)) {
																																	if (!messageReceive
																																			.equals(step)) {
																																		if (!messageReceive
																																				.equals(useCase)) {
																																			if (!messageReceive
																																					.equals(useCaseToInteraction)) {
																																				if (!messageReceive
																																						.equals(packageDeclaration)) {
																																					if (!flow
																																							.equals(line)) {
																																						if (!flow
																																								.equals(messageSend)) {
																																							if (!flow
																																									.equals(interaction)) {
																																								if (!flow
																																										.equals(messageReceive)) {
																																									if (!flow
																																											.equals(flowToInteraction)) {
																																										if (!flow
																																												.equals(step)) {
																																											if (!flow
																																													.equals(message)) {
																																												if (!flow
																																														.equals(useCase)) {
																																													if (!flow
																																															.equals(useCaseToInteraction)) {
																																														if (!flow
																																																.equals(packageDeclaration)) {
																																															if (!flowToInteraction
																																																	.equals(line)) {
																																																if (!flowToInteraction
																																																		.equals(messageSend)) {
																																																	if (!flowToInteraction
																																																			.equals(interaction)) {
																																																		if (!flowToInteraction
																																																				.equals(messageReceive)) {
																																																			if (!flowToInteraction
																																																					.equals(step)) {
																																																				if (!flowToInteraction
																																																						.equals(message)) {
																																																					if (!flowToInteraction
																																																							.equals(useCase)) {
																																																						if (!flowToInteraction
																																																								.equals(useCaseToInteraction)) {
																																																							if (!flowToInteraction
																																																									.equals(packageDeclaration)) {
																																																								if (!step
																																																										.equals(useCase)) {
																																																									if (!step
																																																											.equals(useCaseToInteraction)) {
																																																										if (!message
																																																												.equals(messageSend)) {
																																																											if (!message
																																																													.equals(messageReceive)) {
																																																												if (!message
																																																														.equals(step)) {
																																																													if (!message
																																																															.equals(useCase)) {
																																																														if (!message
																																																																.equals(useCaseToInteraction)) {
																																																															if (!message
																																																																	.equals(packageDeclaration)) {
																																																																if (!useCase
																																																																		.equals(useCaseToInteraction)) {
																																																																	if (!packageDeclaration
																																																																			.equals(step)) {
																																																																		if (!packageDeclaration
																																																																				.equals(useCase)) {
																																																																			if (!packageDeclaration
																																																																					.equals(useCaseToInteraction)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						actor,
																																																																						line,
																																																																						messageSend,
																																																																						interaction,
																																																																						messageReceive,
																																																																						flow,
																																																																						flowToInteraction,
																																																																						step,
																																																																						message,
																																																																						useCase,
																																																																						useCaseToInteraction,
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
												}
											}
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

	public static final Object[] pattern_SystemStepBFToMessageRule_1_3_greenBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject messageReceive,
			EObject flow, EObject step, EObject message) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SystemStepBFToMessageRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageSend__line____covered);
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
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageReceive__line____covered);
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
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, actor, line, messageSend,
				interaction, messageReceive, flow, step, message,
				line__messageSend____coveredBy, messageSend__line____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_SystemStepBFToMessageRule_1_5_expressionBBBBBBBBBBBBBB(
			SystemStepBFToMessageRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration) {
		_this.registerObjects_FWD(ruleresult, actor, line, messageSend,
				interaction, messageReceive, flow, flowToInteraction, step,
				message, useCase, useCaseToInteraction, packageDeclaration);

	}

	public static final PerformRuleResult pattern_SystemStepBFToMessageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_1_blackFBB(
			EClass eClass, SystemStepBFToMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_2_1_binding = pattern_SystemStepBFToMessageRule_2_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SystemStepBFToMessageRule_2_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_2_1_black = pattern_SystemStepBFToMessageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SystemStepBFToMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("step");
		EObject _localVariable_3 = match.getObject("useCase");
		EObject _localVariable_4 = match.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpPackageDeclaration = _localVariable_4;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpStep instanceof NormalStep) {
					NormalStep step = (NormalStep) tmpStep;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpPackageDeclaration instanceof PackageDeclaration) {
							PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
							return new Object[] { actor, flow, step, useCase,
									packageDeclaration, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_2_2_blackBFBFBBFBB(
			Actor actor, BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration, Match match) {
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
						_result.add(new Object[] { actor, interaction, flow,
								flowToInteraction, step, useCase,
								useCaseToInteraction, packageDeclaration, match });
					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_2_3_blackBFBBBBBBB(
			Actor actor, Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.equals(flowToInteraction.getSource())) {
			if (interaction.equals(flowToInteraction.getTarget())) {
				if (useCase.getFlows().contains(flow)) {
					if (useCase.equals(useCaseToInteraction.getSource())) {
						if (interaction
								.equals(useCaseToInteraction.getTarget())) {
							if (flow.getSteps().contains(step)) {
								if (actor.equals(step.getActor())) {
									if (packageDeclaration.getActors()
											.contains(actor)) {
										if (packageDeclaration.getUseCases()
												.contains(useCase)) {
											for (Lifeline line : interaction
													.getLifeline()) {
												_result.add(new Object[] {
														actor, line,
														interaction, flow,
														flowToInteraction,
														step, useCase,
														useCaseToInteraction,
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

	public static final Object[] pattern_SystemStepBFToMessageRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
			NormalStep step, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge flowToInteraction__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		flowToInteraction__flow____source.setSrc(flowToInteraction);
		flowToInteraction__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__flow____source);
		flowToInteraction__interaction____target.setSrc(flowToInteraction);
		flowToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__interaction____target);
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
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		flowToInteraction__flow____source
				.setName(flowToInteraction__flow____source_name_prime);
		flowToInteraction__interaction____target
				.setName(flowToInteraction__interaction____target_name_prime);
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
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { actor, line, interaction, flow,
				flowToInteraction, step, useCase, useCaseToInteraction,
				packageDeclaration, isApplicableMatch,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				useCase__flow____flows, line__interaction____interaction,
				interaction__line____lifeline,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, step__actor____actor,
				packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_4_bindingFBBBBBBBBBBB(
			SystemStepBFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, line, interaction, flow,
				flowToInteraction, step, useCase, useCaseToInteraction,
				packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					interaction, flow, flowToInteraction, step, useCase,
					useCaseToInteraction, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_4_bindingAndBlackFBBBBBBBBBBB(
			SystemStepBFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SystemStepBFToMessageRule_2_4_binding = pattern_SystemStepBFToMessageRule_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, interaction, flow,
				flowToInteraction, step, useCase, useCaseToInteraction,
				packageDeclaration);
		if (result_pattern_SystemStepBFToMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_2_4_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_2_4_black = pattern_SystemStepBFToMessageRule_2_4_blackB(csp);
			if (result_pattern_SystemStepBFToMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, interaction, flow, flowToInteraction, step,
						useCase, useCaseToInteraction, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_2_5_expressionFBB(
			SystemStepBFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SystemStepBFToMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SystemStepBFToMessageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_1_blackBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { _this, match, line, messageSend, interaction,
					messageReceive, message };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_2_bindingFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, line, messageSend,
					interaction, messageReceive, message };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_2_bindingAndBlackFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		Object[] result_pattern_SystemStepBFToMessageRule_10_2_binding = pattern_SystemStepBFToMessageRule_10_2_bindingFBBBBBBB(
				_this, match, line, messageSend, interaction, messageReceive,
				message);
		if (result_pattern_SystemStepBFToMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_10_2_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_10_2_black = pattern_SystemStepBFToMessageRule_10_2_blackB(csp);
			if (result_pattern_SystemStepBFToMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, line, messageSend,
						interaction, messageReceive, message };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_10_3_expressionFBB(
			SystemStepBFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_4_blackBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { match, line, messageSend, interaction,
					messageReceive, message };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_4_greenBBBBBBFFFFFFFFFFFFFF(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(messageSend);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(message);
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageSend__line____covered);
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
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageReceive__line____covered);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(interaction__message____message);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		return new Object[] { match, line, messageSend, interaction,
				messageReceive, message, line__messageSend____coveredBy,
				messageSend__line____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				message__interaction____interaction,
				interaction__message____message };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_5_blackBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { match, line, messageSend, interaction,
					messageReceive, message };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_10_5_greenBBBFF(
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

	public static final void pattern_SystemStepBFToMessageRule_10_6_expressionBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		_this.registerObjectsToMatch_BWD(match, line, messageSend, interaction,
				messageReceive, message);

	}

	public static final boolean pattern_SystemStepBFToMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_11_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_3 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_7 = isApplicableMatch.getObject("message");
		EObject _localVariable_8 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpMessageSend = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		EObject tmpMessageReceive = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpFlowToInteraction = _localVariable_6;
		EObject tmpMessage = _localVariable_7;
		EObject tmpUseCase = _localVariable_8;
		EObject tmpUseCaseToInteraction = _localVariable_9;
		EObject tmpPackageDeclaration = _localVariable_10;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (tmpFlow instanceof BasicFlow) {
								BasicFlow flow = (BasicFlow) tmpFlow;
								if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
									FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
									if (tmpMessage instanceof Message) {
										Message message = (Message) tmpMessage;
										if (tmpUseCase instanceof UseCase) {
											UseCase useCase = (UseCase) tmpUseCase;
											if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
												UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
												if (tmpPackageDeclaration instanceof PackageDeclaration) {
													PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
													return new Object[] {
															actor,
															line,
															messageSend,
															interaction,
															messageReceive,
															flow,
															flowToInteraction,
															message,
															useCase,
															useCaseToInteraction,
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
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_11_1_blackBBBBBBBBBBBFBB(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			SystemStepBFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		if (!messageReceive.equals(messageSend)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { actor, line, messageSend,
							interaction, messageReceive, flow,
							flowToInteraction, message, useCase,
							useCaseToInteraction, packageDeclaration, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
			SystemStepBFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SystemStepBFToMessageRule_11_1_binding = pattern_SystemStepBFToMessageRule_11_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SystemStepBFToMessageRule_11_1_binding != null) {
			Actor actor = (Actor) result_pattern_SystemStepBFToMessageRule_11_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_SystemStepBFToMessageRule_11_1_binding[1];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_SystemStepBFToMessageRule_11_1_binding[2];
			Interaction interaction = (Interaction) result_pattern_SystemStepBFToMessageRule_11_1_binding[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_SystemStepBFToMessageRule_11_1_binding[4];
			BasicFlow flow = (BasicFlow) result_pattern_SystemStepBFToMessageRule_11_1_binding[5];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_SystemStepBFToMessageRule_11_1_binding[6];
			Message message = (Message) result_pattern_SystemStepBFToMessageRule_11_1_binding[7];
			UseCase useCase = (UseCase) result_pattern_SystemStepBFToMessageRule_11_1_binding[8];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_SystemStepBFToMessageRule_11_1_binding[9];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_SystemStepBFToMessageRule_11_1_binding[10];

			Object[] result_pattern_SystemStepBFToMessageRule_11_1_black = pattern_SystemStepBFToMessageRule_11_1_blackBBBBBBBBBBBFBB(
					actor, line, messageSend, interaction, messageReceive,
					flow, flowToInteraction, message, useCase,
					useCaseToInteraction, packageDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_SystemStepBFToMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_11_1_black[11];

				return new Object[] { actor, line, messageSend, interaction,
						messageReceive, flow, flowToInteraction, message,
						useCase, useCaseToInteraction, packageDeclaration, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_11_1_greenBBFB(
			Actor actor, BasicFlow flow, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		flow.getSteps().add(step);
		step.setActor(actor);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		return new Object[] { actor, flow, step, csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_11_2_blackBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_11_2_greenFBBBB(
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

	public static final Object[] pattern_SystemStepBFToMessageRule_11_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject messageReceive,
			EObject flow, EObject flowToInteraction, EObject step,
			EObject message, EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(interaction)) {
					if (!actor.equals(messageReceive)) {
						if (!actor.equals(flow)) {
							if (!actor.equals(flowToInteraction)) {
								if (!actor.equals(step)) {
									if (!actor.equals(message)) {
										if (!actor.equals(useCase)) {
											if (!actor
													.equals(useCaseToInteraction)) {
												if (!actor
														.equals(packageDeclaration)) {
													if (!line
															.equals(messageSend)) {
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
																			if (!line
																					.equals(packageDeclaration)) {
																				if (!messageSend
																						.equals(step)) {
																					if (!messageSend
																							.equals(useCase)) {
																						if (!messageSend
																								.equals(useCaseToInteraction)) {
																							if (!messageSend
																									.equals(packageDeclaration)) {
																								if (!interaction
																										.equals(line)) {
																									if (!interaction
																											.equals(messageSend)) {
																										if (!interaction
																												.equals(messageReceive)) {
																											if (!interaction
																													.equals(step)) {
																												if (!interaction
																														.equals(message)) {
																													if (!interaction
																															.equals(useCase)) {
																														if (!interaction
																																.equals(useCaseToInteraction)) {
																															if (!interaction
																																	.equals(packageDeclaration)) {
																																if (!messageReceive
																																		.equals(messageSend)) {
																																	if (!messageReceive
																																			.equals(step)) {
																																		if (!messageReceive
																																				.equals(useCase)) {
																																			if (!messageReceive
																																					.equals(useCaseToInteraction)) {
																																				if (!messageReceive
																																						.equals(packageDeclaration)) {
																																					if (!flow
																																							.equals(line)) {
																																						if (!flow
																																								.equals(messageSend)) {
																																							if (!flow
																																									.equals(interaction)) {
																																								if (!flow
																																										.equals(messageReceive)) {
																																									if (!flow
																																											.equals(flowToInteraction)) {
																																										if (!flow
																																												.equals(step)) {
																																											if (!flow
																																													.equals(message)) {
																																												if (!flow
																																														.equals(useCase)) {
																																													if (!flow
																																															.equals(useCaseToInteraction)) {
																																														if (!flow
																																																.equals(packageDeclaration)) {
																																															if (!flowToInteraction
																																																	.equals(line)) {
																																																if (!flowToInteraction
																																																		.equals(messageSend)) {
																																																	if (!flowToInteraction
																																																			.equals(interaction)) {
																																																		if (!flowToInteraction
																																																				.equals(messageReceive)) {
																																																			if (!flowToInteraction
																																																					.equals(step)) {
																																																				if (!flowToInteraction
																																																						.equals(message)) {
																																																					if (!flowToInteraction
																																																							.equals(useCase)) {
																																																						if (!flowToInteraction
																																																								.equals(useCaseToInteraction)) {
																																																							if (!flowToInteraction
																																																									.equals(packageDeclaration)) {
																																																								if (!step
																																																										.equals(useCase)) {
																																																									if (!step
																																																											.equals(useCaseToInteraction)) {
																																																										if (!message
																																																												.equals(messageSend)) {
																																																											if (!message
																																																													.equals(messageReceive)) {
																																																												if (!message
																																																														.equals(step)) {
																																																													if (!message
																																																															.equals(useCase)) {
																																																														if (!message
																																																																.equals(useCaseToInteraction)) {
																																																															if (!message
																																																																	.equals(packageDeclaration)) {
																																																																if (!useCase
																																																																		.equals(useCaseToInteraction)) {
																																																																	if (!packageDeclaration
																																																																			.equals(step)) {
																																																																		if (!packageDeclaration
																																																																				.equals(useCase)) {
																																																																			if (!packageDeclaration
																																																																					.equals(useCaseToInteraction)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						actor,
																																																																						line,
																																																																						messageSend,
																																																																						interaction,
																																																																						messageReceive,
																																																																						flow,
																																																																						flowToInteraction,
																																																																						step,
																																																																						message,
																																																																						useCase,
																																																																						useCaseToInteraction,
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
												}
											}
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

	public static final Object[] pattern_SystemStepBFToMessageRule_11_3_greenBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject messageReceive,
			EObject flow, EObject step, EObject message) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SystemStepBFToMessageRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageSend__line____covered);
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
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageReceive__line____covered);
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
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, actor, line, messageSend,
				interaction, messageReceive, flow, step, message,
				line__messageSend____coveredBy, messageSend__line____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_SystemStepBFToMessageRule_11_5_expressionBBBBBBBBBBBBBB(
			SystemStepBFToMessageRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration) {
		_this.registerObjects_BWD(ruleresult, actor, line, messageSend,
				interaction, messageReceive, flow, flowToInteraction, step,
				message, useCase, useCaseToInteraction, packageDeclaration);

	}

	public static final PerformRuleResult pattern_SystemStepBFToMessageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_1_blackFBB(
			EClass eClass, SystemStepBFToMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_12_1_binding = pattern_SystemStepBFToMessageRule_12_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SystemStepBFToMessageRule_12_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_12_1_black = pattern_SystemStepBFToMessageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SystemStepBFToMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("line");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("interaction");
		EObject _localVariable_3 = match.getObject("messageReceive");
		EObject _localVariable_4 = match.getObject("message");
		EObject tmpLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpInteraction = _localVariable_2;
		EObject tmpMessageReceive = _localVariable_3;
		EObject tmpMessage = _localVariable_4;
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpInteraction instanceof Interaction) {
					Interaction interaction = (Interaction) tmpInteraction;
					if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
						if (tmpMessage instanceof Message) {
							Message message = (Message) tmpMessage;
							return new Object[] { line, messageSend,
									interaction, messageReceive, message, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_12_2_blackBBBBFFBFFB(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Match match) {
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
									interaction, messageReceive, flow,
									flowToInteraction, message, useCase,
									useCaseToInteraction, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_12_3_blackFBBBBBBBBBF(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (line.getCoveredBy().contains(messageSend)) {
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					if (interaction.equals(messageReceive
							.getEnclosingInteraction())) {
						if (flow.equals(flowToInteraction.getSource())) {
							if (interaction.equals(flowToInteraction
									.getTarget())) {
								if (messageSend.equals(message.getSendEvent())) {
									if (messageReceive.equals(message
											.getReceiveEvent())) {
										if (message.equals(messageSend
												.getMessage())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (line.getCoveredBy()
														.contains(
																messageReceive)) {
													if (useCase.getFlows()
															.contains(flow)) {
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
																						messageReceive,
																						flow,
																						flowToInteraction,
																						message,
																						useCase,
																						useCaseToInteraction,
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
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFF(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageSend__line____covered);
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
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__line____covered);
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
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
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
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
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
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { actor, line, messageSend, interaction,
				messageReceive, flow, flowToInteraction, message, useCase,
				useCaseToInteraction, packageDeclaration, isApplicableMatch,
				line__messageSend____coveredBy, messageSend__line____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered, useCase__flow____flows,
				line__interaction____interaction,
				interaction__line____lifeline,
				message__interaction____interaction,
				interaction__message____message,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_4_bindingFBBBBBBBBBBBBB(
			SystemStepBFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, actor, line, messageSend, interaction,
				messageReceive, flow, flowToInteraction, message, useCase,
				useCaseToInteraction, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					messageSend, interaction, messageReceive, flow,
					flowToInteraction, message, useCase, useCaseToInteraction,
					packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
			SystemStepBFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SystemStepBFToMessageRule_12_4_binding = pattern_SystemStepBFToMessageRule_12_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, messageSend,
				interaction, messageReceive, flow, flowToInteraction, message,
				useCase, useCaseToInteraction, packageDeclaration);
		if (result_pattern_SystemStepBFToMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_12_4_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_12_4_black = pattern_SystemStepBFToMessageRule_12_4_blackB(csp);
			if (result_pattern_SystemStepBFToMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, messageSend, interaction, messageReceive, flow,
						flowToInteraction, message, useCase,
						useCaseToInteraction, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_12_5_expressionFBB(
			SystemStepBFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SystemStepBFToMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SystemStepBFToMessageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_20_1_binding = pattern_SystemStepBFToMessageRule_20_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_20_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_20_1_black = pattern_SystemStepBFToMessageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_832892 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_832892)) {
					if (!messageReceive.equals(__DEC_message_message_832892)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_20_2_blackFFFFFB(
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
							Message message = messageSend.getMessage();
							if (message != null) {
								if (messageSend.equals(message.getSendEvent())) {
									if (interaction.equals(message
											.getInteraction())) {
										MessageEnd tmpMessageReceive = message
												.getReceiveEvent();
										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
											if (!messageReceive
													.equals(messageSend)) {
												if (interaction
														.equals(messageReceive
																.getEnclosingInteraction())) {
													if (message
															.equals(messageReceive
																	.getMessage())) {
														if (line.getCoveredBy()
																.contains(
																		messageReceive)) {
															if (pattern_SystemStepBFToMessageRule_20_2_black_nac_1BB(
																	message,
																	messageSend) == null) {
																if (pattern_SystemStepBFToMessageRule_20_2_black_nac_0BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_SystemStepBFToMessageRule_20_2_black_nac_2BB(
																			message,
																			messageReceive) == null) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_20_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_20_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_21_1_binding = pattern_SystemStepBFToMessageRule_21_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_21_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_21_1_black = pattern_SystemStepBFToMessageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_495345 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_495345)) {
					if (!messageReceive.equals(__DEC_message_message_495345)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_21_2_blackFFFFFB(
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
							Message message = messageSend.getMessage();
							if (message != null) {
								if (messageSend.equals(message.getSendEvent())) {
									if (interaction.equals(message
											.getInteraction())) {
										MessageEnd tmpMessageReceive = message
												.getReceiveEvent();
										if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
											if (!messageReceive
													.equals(messageSend)) {
												if (interaction
														.equals(messageReceive
																.getEnclosingInteraction())) {
													if (message
															.equals(messageReceive
																	.getMessage())) {
														if (line.getCoveredBy()
																.contains(
																		messageReceive)) {
															if (pattern_SystemStepBFToMessageRule_21_2_black_nac_1BB(
																	message,
																	messageSend) == null) {
																if (pattern_SystemStepBFToMessageRule_21_2_black_nac_0BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_SystemStepBFToMessageRule_21_2_black_nac_2BB(
																			message,
																			messageReceive) == null) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_21_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_21_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_22_1_binding = pattern_SystemStepBFToMessageRule_22_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_22_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_22_1_black = pattern_SystemStepBFToMessageRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_14318 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_14318)) {
					if (!messageReceive.equals(__DEC_message_message_14318)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_22_2_blackFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_enclosingInteraction.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_22_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SystemStepBFToMessageRule_22_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_22_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : messageSend
																	.getCovered()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_22_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_22_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_23_1_binding = pattern_SystemStepBFToMessageRule_23_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_23_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_23_1_black = pattern_SystemStepBFToMessageRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_134040 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_134040)) {
					if (!messageReceive.equals(__DEC_message_message_134040)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_23_2_blackFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessageSend = _edge_fragment.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_23_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SystemStepBFToMessageRule_23_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_23_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (line.getCoveredBy()
																			.contains(
																					messageReceive)) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_23_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_23_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_24_1_binding = pattern_SystemStepBFToMessageRule_24_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_24_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_24_1_black = pattern_SystemStepBFToMessageRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_154217 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_154217)) {
					if (!messageReceive.equals(__DEC_message_message_154217)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_24_2_blackFFFFFB(
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
								MessageEnd tmpMessageSend = message
										.getSendEvent();
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (message.equals(messageSend
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_24_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepBFToMessageRule_24_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_24_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : messageReceive
																	.getCovered()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_24_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_24_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_25_1_binding = pattern_SystemStepBFToMessageRule_25_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_25_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_25_1_black = pattern_SystemStepBFToMessageRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_282881 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_282881)) {
					if (!messageReceive.equals(__DEC_message_message_282881)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_25_2_blackFFFFFB(
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
								MessageEnd tmpMessageSend = message
										.getSendEvent();
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (message.equals(messageSend
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_25_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepBFToMessageRule_25_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_25_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (line.getCoveredBy()
																			.contains(
																					messageReceive)) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_25_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_25_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_26_1_binding = pattern_SystemStepBFToMessageRule_26_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_26_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_26_1_black = pattern_SystemStepBFToMessageRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_298975 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_298975)) {
					if (!messageReceive.equals(__DEC_message_message_298975)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_26_2_blackFFFFFB(
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
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (interaction
													.equals(messageReceive
															.getEnclosingInteraction())) {
												if (pattern_SystemStepBFToMessageRule_26_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SystemStepBFToMessageRule_26_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_26_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : messageSend
																	.getCovered()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_26_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_26_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_27_1_binding = pattern_SystemStepBFToMessageRule_27_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_27_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_27_1_black = pattern_SystemStepBFToMessageRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_958593 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_958593)) {
					if (!messageReceive.equals(__DEC_message_message_958593)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_27_2_blackFFFFFB(
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
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (interaction
													.equals(messageReceive
															.getEnclosingInteraction())) {
												if (pattern_SystemStepBFToMessageRule_27_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepBFToMessageRule_27_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_27_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : messageReceive
																	.getCovered()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_27_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_27_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_28_1_binding = pattern_SystemStepBFToMessageRule_28_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_28_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_28_1_black = pattern_SystemStepBFToMessageRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_297703 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_297703)) {
					if (!messageReceive.equals(__DEC_message_message_297703)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_28_2_blackFFFFFB(
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
						Interaction interaction = messageSend
								.getEnclosingInteraction();
						if (interaction != null) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_28_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SystemStepBFToMessageRule_28_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_28_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : messageSend
																	.getCovered()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_28_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_28_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_29_1_binding = pattern_SystemStepBFToMessageRule_29_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_29_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_29_1_black = pattern_SystemStepBFToMessageRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_661671 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_661671)) {
					if (!messageReceive.equals(__DEC_message_message_661671)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_29_2_blackFFFFFB(
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
								MessageEnd tmpMessageSend = message
										.getSendEvent();
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (message.equals(messageSend
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_29_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepBFToMessageRule_29_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_29_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : messageReceive
																	.getCovered()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_29_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_29_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_30_1_binding = pattern_SystemStepBFToMessageRule_30_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_30_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_30_1_black = pattern_SystemStepBFToMessageRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_526695 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_526695)) {
					if (!messageReceive.equals(__DEC_message_message_526695)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_30_2_blackFFFFFB(
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
										MessageEnd tmpMessageSend = message
												.getSendEvent();
										if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
											if (!messageReceive
													.equals(messageSend)) {
												if (line.getCoveredBy()
														.contains(messageSend)) {
													if (interaction
															.equals(messageSend
																	.getEnclosingInteraction())) {
														if (message
																.equals(messageSend
																		.getMessage())) {
															if (pattern_SystemStepBFToMessageRule_30_2_black_nac_2BB(
																	message,
																	messageReceive) == null) {
																if (pattern_SystemStepBFToMessageRule_30_2_black_nac_0BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_SystemStepBFToMessageRule_30_2_black_nac_1BB(
																			message,
																			messageSend) == null) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_30_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_30_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_31_1_binding = pattern_SystemStepBFToMessageRule_31_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_31_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_31_1_black = pattern_SystemStepBFToMessageRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_951927 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_951927)) {
					if (!messageReceive.equals(__DEC_message_message_951927)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_31_2_blackFFFFFB(
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
										MessageEnd tmpMessageSend = message
												.getSendEvent();
										if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
											if (!messageReceive
													.equals(messageSend)) {
												if (line.getCoveredBy()
														.contains(messageSend)) {
													if (interaction
															.equals(messageSend
																	.getEnclosingInteraction())) {
														if (message
																.equals(messageSend
																		.getMessage())) {
															if (pattern_SystemStepBFToMessageRule_31_2_black_nac_2BB(
																	message,
																	messageReceive) == null) {
																if (pattern_SystemStepBFToMessageRule_31_2_black_nac_0BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_SystemStepBFToMessageRule_31_2_black_nac_1BB(
																			message,
																			messageSend) == null) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_31_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_31_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_32_1_binding = pattern_SystemStepBFToMessageRule_32_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_32_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_32_1_black = pattern_SystemStepBFToMessageRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_85781 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_85781)) {
					if (!messageReceive.equals(__DEC_message_message_85781)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_32_2_blackFFFFFB(
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
						if (interaction.equals(messageSend
								.getEnclosingInteraction())) {
							if (message.equals(messageSend.getMessage())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_32_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SystemStepBFToMessageRule_32_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_32_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (line.getCoveredBy()
																			.contains(
																					messageReceive)) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_32_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_32_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_33_1_binding = pattern_SystemStepBFToMessageRule_33_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_33_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_33_1_black = pattern_SystemStepBFToMessageRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_746402 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_746402)) {
					if (!messageReceive.equals(__DEC_message_message_746402)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_33_2_blackFFFFFB(
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
						if (interaction.equals(messageSend
								.getEnclosingInteraction())) {
							if (message.equals(messageSend.getMessage())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_SystemStepBFToMessageRule_33_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_SystemStepBFToMessageRule_33_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepBFToMessageRule_33_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageSend)) {
																	if (line.getCoveredBy()
																			.contains(
																					messageReceive)) {
																		_result.add(new Object[] {
																				line,
																				messageSend,
																				interaction,
																				messageReceive,
																				message,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_33_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, messageReceive, message);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_33_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_34_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_34_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_34_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_34_1_binding = pattern_SystemStepBFToMessageRule_34_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_34_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_34_1_black = pattern_SystemStepBFToMessageRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_34_2_blackFFFFFB(
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
						for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									_result.add(new Object[] { actor, flow,
											step, useCase, packageDeclaration,
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

	public static final Object[] pattern_SystemStepBFToMessageRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_34_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				step, useCase, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_34_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_35_1_bindingFB(
			SystemStepBFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_35_1_blackFBB(
			EClass __eClass, SystemStepBFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_35_1_bindingAndBlackFFB(
			SystemStepBFToMessageRule _this) {
		Object[] result_pattern_SystemStepBFToMessageRule_35_1_binding = pattern_SystemStepBFToMessageRule_35_1_bindingFB(_this);
		if (result_pattern_SystemStepBFToMessageRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepBFToMessageRule_35_1_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_35_1_black = pattern_SystemStepBFToMessageRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepBFToMessageRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepBFToMessageRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_35_2_blackFFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_actor.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(step.getActor())) {
					for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(step, Flow.class,
									"steps")) {
						if (tmpFlow instanceof BasicFlow) {
							BasicFlow flow = (BasicFlow) tmpFlow;
							for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								for (UseCase useCase : packageDeclaration
										.getUseCases()) {
									if (useCase.getFlows().contains(flow)) {
										_result.add(new Object[] { actor, flow,
												step, useCase,
												packageDeclaration, _edge_actor });
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

	public static final Object[] pattern_SystemStepBFToMessageRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepBFToMessageRule_35_3_expressionFBBBBBBB(
			SystemStepBFToMessageRule _this, Match match, Actor actor,
			BasicFlow flow, NormalStep step, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				step, useCase, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_35_4_expressionFBB(
			SystemStepBFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepBFToMessageRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_1_blackB(
			SystemStepBFToMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToInteraction) {
		if (ruleResult.getCorrObjects().contains(flowToInteraction)) {
			return new Object[] { ruleResult, flowToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepBFToMessageRule_38_2_blackFFFFFFFFFBB(
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
							if (pattern_SystemStepBFToMessageRule_38_2_black_nac_4BB(
									ruleResult, flowToInteraction) == null) {
								if (pattern_SystemStepBFToMessageRule_38_2_black_nac_3BB(
										ruleResult, flow) == null) {
									if (pattern_SystemStepBFToMessageRule_38_2_black_nac_5BB(
											ruleResult, interaction) == null) {
										for (Lifeline line : interaction
												.getLifeline()) {
											if (pattern_SystemStepBFToMessageRule_38_2_black_nac_6BB(
													ruleResult, line) == null) {
												for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																flow,
																UseCase.class,
																"flows")) {
													if (pattern_SystemStepBFToMessageRule_38_2_black_nac_2BB(
															ruleResult, useCase) == null) {
														for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		UseCaseToInteraction.class,
																		"target")) {
															if (useCase
																	.equals(useCaseToInteraction
																			.getSource())) {
																if (pattern_SystemStepBFToMessageRule_38_2_black_nac_7BB(
																		ruleResult,
																		useCaseToInteraction) == null) {
																	for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					useCase,
																					PackageDeclaration.class,
																					"useCases")) {
																		if (pattern_SystemStepBFToMessageRule_38_2_black_nac_1BB(
																				ruleResult,
																				packageDeclaration) == null) {
																			for (Actor actor : packageDeclaration
																					.getActors()) {
																				if (pattern_SystemStepBFToMessageRule_38_2_black_nac_0BB(
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

	public static final Object[] pattern_SystemStepBFToMessageRule_38_3_bindingFBBBBBBBBBBB(
			SystemStepBFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, actor, line, interaction, flow,
				flowToInteraction, useCase, useCaseToInteraction,
				packageDeclaration, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					interaction, flow, flowToInteraction, useCase,
					useCaseToInteraction, packageDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_3_bindingAndBlackFBBBBBBBBBBB(
			SystemStepBFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SystemStepBFToMessageRule_38_3_binding = pattern_SystemStepBFToMessageRule_38_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, interaction, flow,
				flowToInteraction, useCase, useCaseToInteraction,
				packageDeclaration, ruleResult);
		if (result_pattern_SystemStepBFToMessageRule_38_3_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepBFToMessageRule_38_3_binding[0];

			Object[] result_pattern_SystemStepBFToMessageRule_38_3_black = pattern_SystemStepBFToMessageRule_38_3_blackB(csp);
			if (result_pattern_SystemStepBFToMessageRule_38_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, interaction, flow, flowToInteraction, useCase,
						useCaseToInteraction, packageDeclaration, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepBFToMessageRule_38_4_expressionFBB(
			SystemStepBFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_5_blackBBBBBBBB(
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		return new Object[] { actor, line, interaction, flow,
				flowToInteraction, useCase, useCaseToInteraction,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_6_blackBBBBBBBBB(
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, FlowToInteractionFragment flowToInteraction,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { actor, line, interaction, flow,
				flowToInteraction, useCase, useCaseToInteraction,
				packageDeclaration, ruleResult };
	}

	public static final Object[] pattern_SystemStepBFToMessageRule_38_6_greenBBFBFBFFBB(
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("message", "messageSort");
		Object _localVariable_3 = csp.getValue("message", "messageKind");
		Object _localVariable_4 = csp.getValue("message", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		line.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(messageSend);
		messageReceive.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(messageReceive);
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
		return new Object[] { actor, line, messageSend, interaction,
				messageReceive, flow, step, message, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SystemStepBFToMessageRule_38_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SystemStepBFToMessageRuleImpl
