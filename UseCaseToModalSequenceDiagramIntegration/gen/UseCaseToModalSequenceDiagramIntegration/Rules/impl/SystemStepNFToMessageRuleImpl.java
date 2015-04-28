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
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule;

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
 * An implementation of the model object '<em><b>System Step NF To Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystemStepNFToMessageRuleImpl extends AbstractRuleImpl implements
		SystemStepNFToMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStepNFToMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSystemStepNFToMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, NamedFlow flow,
			UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		// initial bindings
		Object[] result1_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_0_1_blackBBBBBBB(this,
						match, actor, flow, useCase, step, packageDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_0_2_bindingAndBlackFBBBBBBB(
						this, match, actor, flow, useCase, step,
						packageDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_4_blackBBBBBB(match,
							actor, flow, useCase, step, packageDeclaration);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_4_greenBBBBFF(match,
							actor, flow, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_5_blackBBBBBB(match,
							actor, flow, useCase, step, packageDeclaration);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_5_greenBBBBBFFF(match,
							actor, flow, useCase, packageDeclaration);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[7];

			// register objects to match
			SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_6_expressionBBBBBBB(
							this, match, actor, flow, useCase, step,
							packageDeclaration);
			return SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_7_expressionF();
		} else {
			return SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[2];
		NamedFlow flow = (NamedFlow) result1_bindingAndBlack[3];
		FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result1_bindingAndBlack[4];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[5];
		UseCase useCase = (UseCase) result1_bindingAndBlack[6];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[7];
		NormalStep step = (NormalStep) result1_bindingAndBlack[8];
		Interaction interaction = (Interaction) result1_bindingAndBlack[9];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_1_greenBFBFBBFBFB(line,
						operand, combo, step, interaction, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[3];
		Message message = (Message) result1_green[6];
		NormalStepToMessage stepToMessage = (NormalStepToMessage) result1_green[8];

		// collect translated elements
		Object[] result2_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_2_blackBBBBB(messageSend,
						messageReceive, step, message, stepToMessage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_2_greenFBBBBB(messageSend,
						messageReceive, step, message, stepToMessage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_3_blackBBBBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, operand, flow,
						flowToOperand, messageReceive, combo, useCase,
						useCaseToInteraction, step, message, interaction,
						stepToMessage, packageDeclaration);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, operand, flow,
						messageReceive, combo, step, message, interaction,
						stepToMessage);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[12];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[13];
		// EMoflonEdge operand__messageSend____fragment = (EMoflonEdge) result3_green[14];
		// EMoflonEdge messageSend__operand____enclosingOperand = (EMoflonEdge) result3_green[15];
		// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result3_green[16];
		// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result3_green[17];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[18];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[19];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[22];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[23];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[24];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[25];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[26];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[27];
		// EMoflonEdge stepToMessage__step____source = (EMoflonEdge) result3_green[28];
		// EMoflonEdge stepToMessage__message____target = (EMoflonEdge) result3_green[29];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[30];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[31];

		// perform postprocessing story node is empty
		// register objects
		SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_5_expressionBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend, operand,
						flow, flowToOperand, messageReceive, combo, useCase,
						useCaseToInteraction, step, message, interaction,
						stepToMessage, packageDeclaration);
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		NamedFlow flow = (NamedFlow) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		NormalStep step = (NormalStep) result2_binding[3];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[4];
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_2_2_blackBFBFBFBFBB(actor,
						flow, useCase, step, packageDeclaration, match)) {
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result2_black[3];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[5];
			Interaction interaction = (Interaction) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_2_3_blackBFBBBFBBBBB(
							actor, operand, flow, flowToOperand, useCase,
							useCaseToInteraction, step, interaction,
							packageDeclaration)) {
				Lifeline line = (Lifeline) result3_black[1];
				CombinedFragment combo = (CombinedFragment) result3_black[5];
				Object[] result3_green = SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
								actor, line, operand, flow, flowToOperand,
								combo, useCase, useCaseToInteraction, step,
								interaction, packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge flowToOperand__flow____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge flowToOperand__operand____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[19];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[20];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[21];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[22];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line, operand,
								flow, flowToOperand, combo, useCase,
								useCaseToInteraction, step, interaction,
								packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("step", step);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {// Create CSP
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
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Interaction interaction, PackageDeclaration packageDeclaration) {// Create CSP
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
		eq.solve(var_step_name, var_message_name);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject line, EObject messageSend, EObject operand,
			EObject flow, EObject flowToOperand, EObject messageReceive,
			EObject combo, EObject useCase, EObject useCaseToInteraction,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
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
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		// initial bindings
		Object[] result1_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_10_1_blackBBBBBBBBB(this,
						match, line, messageSend, operand, messageReceive,
						combo, message, interaction);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_10_2_bindingAndBlackFBBBBBBBBB(
						this, match, line, messageSend, operand,
						messageReceive, combo, message, interaction);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_4_blackBBBBBBBB(
							match, line, messageSend, operand, messageReceive,
							combo, message, interaction);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_4_greenBBBBBBBBFFFFFFFFFFFFFFFF(
							match, line, messageSend, operand, messageReceive,
							combo, message, interaction);
			// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result4_green[8];
			// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result4_green[9];
			// EMoflonEdge operand__messageSend____fragment = (EMoflonEdge) result4_green[10];
			// EMoflonEdge messageSend__operand____enclosingOperand = (EMoflonEdge) result4_green[11];
			// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result4_green[12];
			// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result4_green[13];
			// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result4_green[14];
			// EMoflonEdge operand__line____covered = (EMoflonEdge) result4_green[15];
			// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result4_green[16];
			// EMoflonEdge combo__line____covered = (EMoflonEdge) result4_green[17];
			// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result4_green[18];
			// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result4_green[19];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[20];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[21];
			// EMoflonEdge messageSend__message____message = (EMoflonEdge) result4_green[22];
			// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result4_green[23];

			// collect context elements
			Object[] result5_black = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_5_blackBBBBBBBB(
							match, line, messageSend, operand, messageReceive,
							combo, message, interaction);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_5_greenBBBBBFFF(
							match, line, operand, combo, interaction);
			// EMoflonEdge combo__operand____operand = (EMoflonEdge) result5_green[5];
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[6];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[7];

			// register objects to match
			SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_6_expressionBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction);
			return SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_7_expressionF();
		} else {
			return SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[2];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[3];
		NamedFlow flow = (NamedFlow) result1_bindingAndBlack[4];
		FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result1_bindingAndBlack[5];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[6];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[7];
		UseCase useCase = (UseCase) result1_bindingAndBlack[8];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[9];
		Message message = (Message) result1_bindingAndBlack[10];
		Interaction interaction = (Interaction) result1_bindingAndBlack[11];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_1_greenBBFBFB(actor,
						flow, message, csp);
		NormalStep step = (NormalStep) result1_green[2];
		NormalStepToMessage stepToMessage = (NormalStepToMessage) result1_green[4];

		// collect translated elements
		Object[] result2_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_2_blackBBBBB(messageSend,
						messageReceive, step, message, stepToMessage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_2_greenFBBBBB(
						messageSend, messageReceive, step, message,
						stepToMessage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_3_blackBBBBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, operand, flow,
						flowToOperand, messageReceive, combo, useCase,
						useCaseToInteraction, step, message, interaction,
						stepToMessage, packageDeclaration);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, operand, flow,
						messageReceive, combo, step, message, interaction,
						stepToMessage);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[12];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[13];
		// EMoflonEdge operand__messageSend____fragment = (EMoflonEdge) result3_green[14];
		// EMoflonEdge messageSend__operand____enclosingOperand = (EMoflonEdge) result3_green[15];
		// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result3_green[16];
		// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result3_green[17];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[18];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[19];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[22];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[23];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[24];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[25];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[26];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[27];
		// EMoflonEdge stepToMessage__step____source = (EMoflonEdge) result3_green[28];
		// EMoflonEdge stepToMessage__message____target = (EMoflonEdge) result3_green[29];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[30];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[31];

		// perform postprocessing story node is empty
		// register objects
		SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_5_expressionBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend, operand,
						flow, flowToOperand, messageReceive, combo, useCase,
						useCaseToInteraction, step, message, interaction,
						stepToMessage, packageDeclaration);
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_12_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Lifeline line = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		InteractionOperand operand = (InteractionOperand) result2_binding[2];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[3];
		CombinedFragment combo = (CombinedFragment) result2_binding[4];
		Message message = (Message) result2_binding[5];
		Interaction interaction = (Interaction) result2_binding[6];
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_12_2_blackBBBFFBBFFBBB(line,
						messageSend, operand, messageReceive, combo, message,
						interaction, match)) {
			NamedFlow flow = (NamedFlow) result2_black[3];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result2_black[4];
			UseCase useCase = (UseCase) result2_black[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_12_3_blackFBBBBBBBBBBBF(
							line, messageSend, operand, flow, flowToOperand,
							messageReceive, combo, useCase,
							useCaseToInteraction, message, interaction)) {
				Actor actor = (Actor) result3_black[0];
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[12];
				Object[] result3_green = SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_12_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								actor, line, messageSend, operand, flow,
								flowToOperand, messageReceive, combo, useCase,
								useCaseToInteraction, message, interaction,
								packageDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[14];
				// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[15];
				// EMoflonEdge operand__messageSend____fragment = (EMoflonEdge) result3_green[16];
				// EMoflonEdge messageSend__operand____enclosingOperand = (EMoflonEdge) result3_green[17];
				// EMoflonEdge operand__messageReceive____fragment = (EMoflonEdge) result3_green[18];
				// EMoflonEdge messageReceive__operand____enclosingOperand = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flowToOperand__flow____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge flowToOperand__operand____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[22];
				// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[23];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[24];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[25];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[26];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[27];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[28];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[29];
				// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[30];
				// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[31];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[32];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[33];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[34];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[35];
				// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[36];
				// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[37];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[38];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[39];

				// solve CSP
				Object[] result4_bindingAndBlack = SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line,
								messageSend, operand, flow, flowToOperand,
								messageReceive, combo, useCase,
								useCaseToInteraction, message, interaction,
								packageDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("operand", operand);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("combo", combo);
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {// Create CSP
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
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction, PackageDeclaration packageDeclaration) {// Create CSP
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
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("String");

		// Create unbound variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		Eq eq = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject actor, EObject line, EObject messageSend, EObject operand,
			EObject flow, EObject flowToOperand, EObject messageReceive,
			EObject combo, EObject useCase, EObject useCaseToInteraction,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject packageDeclaration) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToOperand", flowToOperand);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("stepToMessage", stepToMessage);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_121(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_20_2_blackFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_20_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_122(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_21_2_blackFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_21_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_123(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_22_2_blackFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_22_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_124(
			EMoflonEdge _edge_enclosingOperand) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_23_2_blackFFFFFFFB(_edge_enclosingOperand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_23_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_125(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_24_2_blackFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_24_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_126(
			EMoflonEdge _edge_enclosingOperand) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_25_2_blackFFFFFFFB(_edge_enclosingOperand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_25_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_127(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_26_2_blackFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_26_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_128(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_27_2_blackFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_27_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_129(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_28_2_blackFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_28_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_130(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_29_2_blackFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_29_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_243(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_30_2_blackFFFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			NamedFlow flow = (NamedFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			NormalStep step = (NormalStep) result2_black[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[4];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_30_3_expressionFBBBBBBB(
							this, match, actor, flow, useCase, step,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_244(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_31_2_blackFFFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			NamedFlow flow = (NamedFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			NormalStep step = (NormalStep) result2_black[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[4];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_31_3_expressionFBBBBBBB(
							this, match, actor, flow, useCase, step,
							packageDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_131(
			EMoflonEdge _edge_sendEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_32_2_blackFFFFFFFB(_edge_sendEvent)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_32_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_132(
			EMoflonEdge _edge_receiveEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_33_2_blackFFFFFFFB(_edge_receiveEvent)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_33_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_133(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_34_2_blackFFFFFFFB(_edge_interaction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_34_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_34_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_34_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_34_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_134(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_35_2_blackFFFFFFFB(_edge_message)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_35_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_35_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_35_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_35_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_35_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_135(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_36_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_36_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_36_2_blackFFFFFFFB(_edge_message)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_36_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_36_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_36_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_36_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_36_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_36_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_136(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_37_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_37_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_37_2_blackFFFFFFFB(_edge_message)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			InteractionOperand operand = (InteractionOperand) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			CombinedFragment combo = (CombinedFragment) result2_black[4];
			Message message = (Message) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Object[] result2_green = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_37_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_37_3_expressionFBBBBBBBBB(
							this, match, line, messageSend, operand,
							messageReceive, combo, message, interaction)) {
				// Ensure that the correct types of elements are matched
				if (SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_37_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_37_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_37_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_37_6_expressionFB(__result);
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
			FlowToInteractionFragment flowToOperandParameter) {
		// create result
		Object[] result1_black = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_40_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_40_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_40_2_blackFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList flowToOperandList = (RuleEntryList) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			NamedFlow flow = (NamedFlow) result2_black[4];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result2_black[5];
			InteractionOperand operand = (InteractionOperand) result2_black[6];
			CombinedFragment combo = (CombinedFragment) result2_black[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[8];
			Interaction interaction = (Interaction) result2_black[9];
			Lifeline line = (Lifeline) result2_black[10];

			// solve CSP
			Object[] result3_bindingAndBlack = SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_40_3_bindingAndBlackFBBBBBBBBBBBBB(
							this, isApplicableMatch, actor, line, operand,
							flow, flowToOperand, combo, useCase,
							useCaseToInteraction, interaction,
							packageDeclaration, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SystemStepNFToMessageRuleImpl
					.pattern_SystemStepNFToMessageRule_40_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = SystemStepNFToMessageRuleImpl
						.pattern_SystemStepNFToMessageRule_40_5_blackBBBBBBBBBB(
								actor, line, operand, flow, flowToOperand,
								combo, useCase, useCaseToInteraction,
								interaction, packageDeclaration);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_40_6_blackBBBBBBBBBBB(
									actor, line, operand, flow, flowToOperand,
									combo, useCase, useCaseToInteraction,
									interaction, packageDeclaration, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					SystemStepNFToMessageRuleImpl
							.pattern_SystemStepNFToMessageRule_40_6_greenBBFBBFBFFBFBB(
									actor, line, operand, flow, combo,
									interaction, ruleResult, csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[5];
					// NormalStep step = (NormalStep) result6_green[7];
					// Message message = (Message) result6_green[8];
					// NormalStepToMessage stepToMessage = (NormalStepToMessage) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return SystemStepNFToMessageRuleImpl
				.pattern_SystemStepNFToMessageRule_40_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
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
		literal1.setValue("ASYNCH_CALL");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("COMPLETE");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");
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
		eq.solve(var_step_name, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("flowToOperand", flowToOperand);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("interaction", interaction);
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
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NamedFlow) arguments.get(2),
					(UseCase) arguments.get(3), (NormalStep) arguments.get(4),
					(PackageDeclaration) arguments.get(5));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_INTERACTION_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(UseCase) arguments.get(7),
					(UseCaseToInteraction) arguments.get(8),
					(NormalStep) arguments.get(9),
					(Interaction) arguments.get(10),
					(PackageDeclaration) arguments.get(11));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(Message) arguments.get(6), (Interaction) arguments.get(7));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_INTERACTION_PACKAGEDECLARATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(InteractionOperand) arguments.get(4),
					(NamedFlow) arguments.get(5),
					(FlowToInteractionFragment) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(Message) arguments.get(11),
					(Interaction) arguments.get(12),
					(PackageDeclaration) arguments.get(13));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_121__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_121((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_122((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_123((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_124((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_125__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_125((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_126((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_127((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_128((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_129__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_129((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_130__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_130((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_243__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_243((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_244__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_244((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_131__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_131((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_132__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_132((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_133__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_133((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_134((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_135((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_136__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_136((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowToInteractionFragment) arguments.get(1));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_INTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(InteractionOperand) arguments.get(3),
					(NamedFlow) arguments.get(4),
					(FlowToInteractionFragment) arguments.get(5),
					(CombinedFragment) arguments.get(6),
					(UseCase) arguments.get(7),
					(UseCaseToInteraction) arguments.get(8),
					(Interaction) arguments.get(9),
					(PackageDeclaration) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_1_blackBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		return new Object[] { _this, match, actor, flow, useCase, step,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_2_bindingFBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, actor,
				flow, useCase, step, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, flow, useCase,
					step, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_2_bindingAndBlackFBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SystemStepNFToMessageRule_0_2_binding = pattern_SystemStepNFToMessageRule_0_2_bindingFBBBBBBB(
				_this, match, actor, flow, useCase, step, packageDeclaration);
		if (result_pattern_SystemStepNFToMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_0_2_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_0_2_black = pattern_SystemStepNFToMessageRule_0_2_blackB(csp);
			if (result_pattern_SystemStepNFToMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor, flow, useCase,
						step, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_0_3_expressionFBB(
			SystemStepNFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_4_blackBBBBBB(
			Match match, Actor actor, NamedFlow flow, UseCase useCase,
			NormalStep step, PackageDeclaration packageDeclaration) {
		return new Object[] { match, actor, flow, useCase, step,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_4_greenBBBBFF(
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

	public static final Object[] pattern_SystemStepNFToMessageRule_0_5_blackBBBBBB(
			Match match, Actor actor, NamedFlow flow, UseCase useCase,
			NormalStep step, PackageDeclaration packageDeclaration) {
		return new Object[] { match, actor, flow, useCase, step,
				packageDeclaration };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_0_5_greenBBBBBFFF(
			Match match, Actor actor, NamedFlow flow, UseCase useCase,
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

	public static final void pattern_SystemStepNFToMessageRule_0_6_expressionBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		_this.registerObjectsToMatch_FWD(match, actor, flow, useCase, step,
				packageDeclaration);

	}

	public static final boolean pattern_SystemStepNFToMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_1_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("operand");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flowToOperand");
		EObject _localVariable_5 = isApplicableMatch.getObject("combo");
		EObject _localVariable_6 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpOperand = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpFlowToOperand = _localVariable_4;
		EObject tmpCombo = _localVariable_5;
		EObject tmpUseCase = _localVariable_6;
		EObject tmpUseCaseToInteraction = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpInteraction = _localVariable_9;
		EObject tmpPackageDeclaration = _localVariable_10;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpOperand instanceof InteractionOperand) {
					InteractionOperand operand = (InteractionOperand) tmpOperand;
					if (tmpFlow instanceof NamedFlow) {
						NamedFlow flow = (NamedFlow) tmpFlow;
						if (tmpFlowToOperand instanceof FlowToInteractionFragment) {
							FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) tmpFlowToOperand;
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								if (tmpUseCase instanceof UseCase) {
									UseCase useCase = (UseCase) tmpUseCase;
									if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
										UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
										if (tmpStep instanceof NormalStep) {
											NormalStep step = (NormalStep) tmpStep;
											if (tmpInteraction instanceof Interaction) {
												Interaction interaction = (Interaction) tmpInteraction;
												if (tmpPackageDeclaration instanceof PackageDeclaration) {
													PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
													return new Object[] {
															actor,
															line,
															operand,
															flow,
															flowToOperand,
															combo,
															useCase,
															useCaseToInteraction,
															step, interaction,
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

	public static final Object[] pattern_SystemStepNFToMessageRule_1_1_blackBBBBBBBBBBBFBB(
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Interaction interaction, PackageDeclaration packageDeclaration,
			SystemStepNFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { actor, line, operand, flow,
						flowToOperand, combo, useCase, useCaseToInteraction,
						step, interaction, packageDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
			SystemStepNFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SystemStepNFToMessageRule_1_1_binding = pattern_SystemStepNFToMessageRule_1_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SystemStepNFToMessageRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_SystemStepNFToMessageRule_1_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_SystemStepNFToMessageRule_1_1_binding[1];
			InteractionOperand operand = (InteractionOperand) result_pattern_SystemStepNFToMessageRule_1_1_binding[2];
			NamedFlow flow = (NamedFlow) result_pattern_SystemStepNFToMessageRule_1_1_binding[3];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result_pattern_SystemStepNFToMessageRule_1_1_binding[4];
			CombinedFragment combo = (CombinedFragment) result_pattern_SystemStepNFToMessageRule_1_1_binding[5];
			UseCase useCase = (UseCase) result_pattern_SystemStepNFToMessageRule_1_1_binding[6];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_SystemStepNFToMessageRule_1_1_binding[7];
			NormalStep step = (NormalStep) result_pattern_SystemStepNFToMessageRule_1_1_binding[8];
			Interaction interaction = (Interaction) result_pattern_SystemStepNFToMessageRule_1_1_binding[9];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_SystemStepNFToMessageRule_1_1_binding[10];

			Object[] result_pattern_SystemStepNFToMessageRule_1_1_black = pattern_SystemStepNFToMessageRule_1_1_blackBBBBBBBBBBBFBB(
					actor, line, operand, flow, flowToOperand, combo, useCase,
					useCaseToInteraction, step, interaction,
					packageDeclaration, _this, isApplicableMatch);
			if (result_pattern_SystemStepNFToMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_1_1_black[11];

				return new Object[] { actor, line, operand, flow,
						flowToOperand, combo, useCase, useCaseToInteraction,
						step, interaction, packageDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_1_1_greenBFBFBBFBFB(
			Lifeline line, InteractionOperand operand, CombinedFragment combo,
			NormalStep step, Interaction interaction, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		NormalStepToMessage stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToMessage();
		line.getCoveredBy().add(operand);
		line.getCoveredBy().add(combo);
		Object _localVariable_0 = csp.getValue("message", "name");
		Object _localVariable_1 = csp.getValue("message", "messageSort");
		Object _localVariable_2 = csp.getValue("message", "messageKind");
		line.getCoveredBy().add(messageSend);
		operand.getFragment().add(messageSend);
		operand.getFragment().add(messageReceive);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		message.setInteraction(interaction);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		stepToMessage.setSource(step);
		stepToMessage.setTarget(message);
		String message_name_prime = (String) _localVariable_0;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_1;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_2;
		message.setName(message_name_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		return new Object[] { line, messageSend, operand, messageReceive,
				combo, step, message, interaction, stepToMessage, csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_1_2_blackBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message, NormalStepToMessage stepToMessage) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message,
					stepToMessage };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_1_2_greenFBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message, NormalStepToMessage stepToMessage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(messageSend);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(message);
		ruleresult.getCreatedLinkElements().add(stepToMessage);
		return new Object[] { ruleresult, messageSend, messageReceive, step,
				message, stepToMessage };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_1_3_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject operand, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject combo,
			EObject useCase, EObject useCaseToInteraction, EObject step,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject packageDeclaration) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(operand)) {
					if (!actor.equals(flow)) {
						if (!actor.equals(flowToOperand)) {
							if (!actor.equals(messageReceive)) {
								if (!actor.equals(combo)) {
									if (!actor.equals(useCase)) {
										if (!actor.equals(useCaseToInteraction)) {
											if (!actor.equals(step)) {
												if (!actor.equals(message)) {
													if (!actor
															.equals(interaction)) {
														if (!actor
																.equals(stepToMessage)) {
															if (!actor
																	.equals(packageDeclaration)) {
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
																								.equals(message)) {
																							if (!line
																									.equals(stepToMessage)) {
																								if (!line
																										.equals(packageDeclaration)) {
																									if (!messageSend
																											.equals(operand)) {
																										if (!messageSend
																												.equals(useCase)) {
																											if (!messageSend
																													.equals(useCaseToInteraction)) {
																												if (!messageSend
																														.equals(step)) {
																													if (!messageSend
																															.equals(stepToMessage)) {
																														if (!messageSend
																																.equals(packageDeclaration)) {
																															if (!operand
																																	.equals(useCase)) {
																																if (!operand
																																		.equals(useCaseToInteraction)) {
																																	if (!operand
																																			.equals(step)) {
																																		if (!operand
																																				.equals(stepToMessage)) {
																																			if (!operand
																																					.equals(packageDeclaration)) {
																																				if (!flow
																																						.equals(line)) {
																																					if (!flow
																																							.equals(messageSend)) {
																																						if (!flow
																																								.equals(operand)) {
																																							if (!flow
																																									.equals(flowToOperand)) {
																																								if (!flow
																																										.equals(messageReceive)) {
																																									if (!flow
																																											.equals(useCase)) {
																																										if (!flow
																																												.equals(useCaseToInteraction)) {
																																											if (!flow
																																													.equals(step)) {
																																												if (!flow
																																														.equals(message)) {
																																													if (!flow
																																															.equals(interaction)) {
																																														if (!flow
																																																.equals(stepToMessage)) {
																																															if (!flow
																																																	.equals(packageDeclaration)) {
																																																if (!flowToOperand
																																																		.equals(line)) {
																																																	if (!flowToOperand
																																																			.equals(messageSend)) {
																																																		if (!flowToOperand
																																																				.equals(operand)) {
																																																			if (!flowToOperand
																																																					.equals(messageReceive)) {
																																																				if (!flowToOperand
																																																						.equals(useCase)) {
																																																					if (!flowToOperand
																																																							.equals(useCaseToInteraction)) {
																																																						if (!flowToOperand
																																																								.equals(step)) {
																																																							if (!flowToOperand
																																																									.equals(message)) {
																																																								if (!flowToOperand
																																																										.equals(interaction)) {
																																																									if (!flowToOperand
																																																											.equals(stepToMessage)) {
																																																										if (!flowToOperand
																																																												.equals(packageDeclaration)) {
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
																																																																		.equals(stepToMessage)) {
																																																																	if (!messageReceive
																																																																			.equals(packageDeclaration)) {
																																																																		if (!combo
																																																																				.equals(line)) {
																																																																			if (!combo
																																																																					.equals(messageSend)) {
																																																																				if (!combo
																																																																						.equals(operand)) {
																																																																					if (!combo
																																																																							.equals(flow)) {
																																																																						if (!combo
																																																																								.equals(flowToOperand)) {
																																																																							if (!combo
																																																																									.equals(messageReceive)) {
																																																																								if (!combo
																																																																										.equals(useCase)) {
																																																																									if (!combo
																																																																											.equals(useCaseToInteraction)) {
																																																																										if (!combo
																																																																												.equals(step)) {
																																																																											if (!combo
																																																																													.equals(message)) {
																																																																												if (!combo
																																																																														.equals(interaction)) {
																																																																													if (!combo
																																																																															.equals(stepToMessage)) {
																																																																														if (!combo
																																																																																.equals(packageDeclaration)) {
																																																																															if (!useCase
																																																																																	.equals(useCaseToInteraction)) {
																																																																																if (!step
																																																																																		.equals(useCase)) {
																																																																																	if (!step
																																																																																			.equals(useCaseToInteraction)) {
																																																																																		if (!step
																																																																																				.equals(stepToMessage)) {
																																																																																			if (!message
																																																																																					.equals(messageSend)) {
																																																																																				if (!message
																																																																																						.equals(operand)) {
																																																																																					if (!message
																																																																																							.equals(messageReceive)) {
																																																																																						if (!message
																																																																																								.equals(useCase)) {
																																																																																							if (!message
																																																																																									.equals(useCaseToInteraction)) {
																																																																																								if (!message
																																																																																										.equals(step)) {
																																																																																									if (!message
																																																																																											.equals(stepToMessage)) {
																																																																																										if (!message
																																																																																												.equals(packageDeclaration)) {
																																																																																											if (!interaction
																																																																																													.equals(line)) {
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
																																																																																																				.equals(message)) {
																																																																																																			if (!interaction
																																																																																																					.equals(stepToMessage)) {
																																																																																																				if (!interaction
																																																																																																						.equals(packageDeclaration)) {
																																																																																																					if (!stepToMessage
																																																																																																							.equals(useCase)) {
																																																																																																						if (!stepToMessage
																																																																																																								.equals(useCaseToInteraction)) {
																																																																																																							if (!packageDeclaration
																																																																																																									.equals(useCase)) {
																																																																																																								if (!packageDeclaration
																																																																																																										.equals(useCaseToInteraction)) {
																																																																																																									if (!packageDeclaration
																																																																																																											.equals(step)) {
																																																																																																										if (!packageDeclaration
																																																																																																												.equals(stepToMessage)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													actor,
																																																																																																													line,
																																																																																																													messageSend,
																																																																																																													operand,
																																																																																																													flow,
																																																																																																													flowToOperand,
																																																																																																													messageReceive,
																																																																																																													combo,
																																																																																																													useCase,
																																																																																																													useCaseToInteraction,
																																																																																																													step,
																																																																																																													message,
																																																																																																													interaction,
																																																																																																													stepToMessage,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SystemStepNFToMessageRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject operand, EObject flow,
			EObject messageReceive, EObject combo, EObject step,
			EObject message, EObject interaction, EObject stepToMessage) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToMessage__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToMessage__message____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SystemStepNFToMessageRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String operand__messageSend____fragment_name_prime = "fragment";
		String messageSend__operand____enclosingOperand_name_prime = "enclosingOperand";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String stepToMessage__step____source_name_prime = "source";
		String stepToMessage__message____target_name_prime = "target";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageSend__line____covered);
		operand__messageSend____fragment.setSrc(operand);
		operand__messageSend____fragment.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(operand__messageSend____fragment);
		messageSend__operand____enclosingOperand.setSrc(messageSend);
		messageSend__operand____enclosingOperand.setTrg(operand);
		ruleresult.getCreatedEdges().add(
				messageSend__operand____enclosingOperand);
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
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(step__actor____actor);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(message__messageSend____sendEvent);
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
		stepToMessage__step____source.setSrc(stepToMessage);
		stepToMessage__step____source.setTrg(step);
		ruleresult.getCreatedEdges().add(stepToMessage__step____source);
		stepToMessage__message____target.setSrc(stepToMessage);
		stepToMessage__message____target.setTrg(message);
		ruleresult.getCreatedEdges().add(stepToMessage__message____target);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageReceive__message____message);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		operand__messageSend____fragment
				.setName(operand__messageSend____fragment_name_prime);
		messageSend__operand____enclosingOperand
				.setName(messageSend__operand____enclosingOperand_name_prime);
		operand__messageReceive____fragment
				.setName(operand__messageReceive____fragment_name_prime);
		messageReceive__operand____enclosingOperand
				.setName(messageReceive__operand____enclosingOperand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		stepToMessage__step____source
				.setName(stepToMessage__step____source_name_prime);
		stepToMessage__message____target
				.setName(stepToMessage__message____target_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		return new Object[] { ruleresult, actor, line, messageSend, operand,
				flow, messageReceive, combo, step, message, interaction,
				stepToMessage, line__messageSend____coveredBy,
				messageSend__line____covered, operand__messageSend____fragment,
				messageSend__operand____enclosingOperand,
				operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				line__operand____coveredBy, operand__line____covered,
				line__combo____coveredBy, combo__line____covered,
				flow__step____steps, step__actor____actor,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message, stepToMessage__step____source,
				stepToMessage__message____target,
				messageSend__message____message,
				messageReceive__message____message };
	}

	public static final void pattern_SystemStepNFToMessageRule_1_5_expressionBBBBBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend, EObject operand,
			EObject flow, EObject flowToOperand, EObject messageReceive,
			EObject combo, EObject useCase, EObject useCaseToInteraction,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject packageDeclaration) {
		_this.registerObjects_FWD(ruleresult, actor, line, messageSend,
				operand, flow, flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, step, message, interaction,
				stepToMessage, packageDeclaration);

	}

	public static final PerformRuleResult pattern_SystemStepNFToMessageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_1_blackFBB(
			EClass eClass, SystemStepNFToMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_2_1_binding = pattern_SystemStepNFToMessageRule_2_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SystemStepNFToMessageRule_2_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_2_1_black = pattern_SystemStepNFToMessageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SystemStepNFToMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("useCase");
		EObject _localVariable_3 = match.getObject("step");
		EObject _localVariable_4 = match.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpPackageDeclaration = _localVariable_4;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpFlow instanceof NamedFlow) {
				NamedFlow flow = (NamedFlow) tmpFlow;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						if (tmpPackageDeclaration instanceof PackageDeclaration) {
							PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
							return new Object[] { actor, flow, useCase, step,
									packageDeclaration, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_2_2_blackBFBFBFBFBB(
			Actor actor, NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FlowToInteractionFragment flowToOperand : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow,
						FlowToInteractionFragment.class, "source")) {
			InteractionFragment tmpOperand = flowToOperand.getTarget();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(useCase,
								UseCaseToInteraction.class, "source")) {
					Interaction interaction = useCaseToInteraction.getTarget();
					if (interaction != null) {
						_result.add(new Object[] { actor, operand, flow,
								flowToOperand, useCase, useCaseToInteraction,
								step, interaction, packageDeclaration, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_2_3_blackBFBBBFBBBBB(
			Actor actor, InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Interaction interaction, PackageDeclaration packageDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.equals(flowToOperand.getSource())) {
			if (operand.equals(flowToOperand.getTarget())) {
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
												for (CombinedFragment combo : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																operand,
																CombinedFragment.class,
																"operand")) {
													_result.add(new Object[] {
															actor,
															line,
															operand,
															flow,
															flowToOperand,
															combo,
															useCase,
															useCaseToInteraction,
															step, interaction,
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
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, NormalStep step,
			Interaction interaction, PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge flowToOperand__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String flowToOperand__flow____source_name_prime = "source";
		String flowToOperand__operand____target_name_prime = "target";
		String combo__operand____operand_name_prime = "operand";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToOperand);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		flowToOperand__flow____source.setSrc(flowToOperand);
		flowToOperand__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToOperand__flow____source);
		flowToOperand__operand____target.setSrc(flowToOperand);
		flowToOperand__operand____target.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				flowToOperand__operand____target);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
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
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		flowToOperand__flow____source
				.setName(flowToOperand__flow____source_name_prime);
		flowToOperand__operand____target
				.setName(flowToOperand__operand____target_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { actor, line, operand, flow, flowToOperand, combo,
				useCase, useCaseToInteraction, step, interaction,
				packageDeclaration, isApplicableMatch,
				flowToOperand__flow____source,
				flowToOperand__operand____target, combo__operand____operand,
				useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, step__actor____actor,
				line__interaction____interaction,
				interaction__line____lifeline,
				packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_4_bindingFBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, CombinedFragment combo,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			NormalStep step, Interaction interaction,
			PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, line, operand, flow, flowToOperand,
				combo, useCase, useCaseToInteraction, step, interaction,
				packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					operand, flow, flowToOperand, combo, useCase,
					useCaseToInteraction, step, interaction, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, CombinedFragment combo,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			NormalStep step, Interaction interaction,
			PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SystemStepNFToMessageRule_2_4_binding = pattern_SystemStepNFToMessageRule_2_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, operand, flow,
				flowToOperand, combo, useCase, useCaseToInteraction, step,
				interaction, packageDeclaration);
		if (result_pattern_SystemStepNFToMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_2_4_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_2_4_black = pattern_SystemStepNFToMessageRule_2_4_blackB(csp);
			if (result_pattern_SystemStepNFToMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, operand, flow, flowToOperand, combo, useCase,
						useCaseToInteraction, step, interaction,
						packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_2_5_expressionFBB(
			SystemStepNFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SystemStepNFToMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SystemStepNFToMessageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_1_blackBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { _this, match, line, messageSend, operand,
					messageReceive, combo, message, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_2_bindingFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, line, messageSend,
					operand, messageReceive, combo, message, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_2_bindingAndBlackFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		Object[] result_pattern_SystemStepNFToMessageRule_10_2_binding = pattern_SystemStepNFToMessageRule_10_2_bindingFBBBBBBBBB(
				_this, match, line, messageSend, operand, messageReceive,
				combo, message, interaction);
		if (result_pattern_SystemStepNFToMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_10_2_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_10_2_black = pattern_SystemStepNFToMessageRule_10_2_blackB(csp);
			if (result_pattern_SystemStepNFToMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, line, messageSend,
						operand, messageReceive, combo, message, interaction };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_10_3_expressionFBB(
			SystemStepNFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_4_blackBBBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { match, line, messageSend, operand,
					messageReceive, combo, message, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_4_greenBBBBBBBBFFFFFFFFFFFFFFFF(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(messageSend);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(message);
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String operand__messageSend____fragment_name_prime = "fragment";
		String messageSend__operand____enclosingOperand_name_prime = "enclosingOperand";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageSend__line____covered);
		operand__messageSend____fragment.setSrc(operand);
		operand__messageSend____fragment.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(operand__messageSend____fragment);
		messageSend__operand____enclosingOperand.setSrc(messageSend);
		messageSend__operand____enclosingOperand.setTrg(operand);
		match.getToBeTranslatedEdges().add(
				messageSend__operand____enclosingOperand);
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
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(interaction__message____message);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageReceive__message____message);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		operand__messageSend____fragment
				.setName(operand__messageSend____fragment_name_prime);
		messageSend__operand____enclosingOperand
				.setName(messageSend__operand____enclosingOperand_name_prime);
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
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		return new Object[] { match, line, messageSend, operand,
				messageReceive, combo, message, interaction,
				line__messageSend____coveredBy, messageSend__line____covered,
				operand__messageSend____fragment,
				messageSend__operand____enclosingOperand,
				operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				line__operand____coveredBy, operand__line____covered,
				line__combo____coveredBy, combo__line____covered,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				messageSend__message____message,
				messageReceive__message____message };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_5_blackBBBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { match, line, messageSend, operand,
					messageReceive, combo, message, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_10_5_greenBBBBBFFF(
			Match match, Lifeline line, InteractionOperand operand,
			CombinedFragment combo, Interaction interaction) {
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(line);
		match.getContextNodes().add(operand);
		match.getContextNodes().add(combo);
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
		return new Object[] { match, line, operand, combo, interaction,
				combo__operand____operand, line__interaction____interaction,
				interaction__line____lifeline };
	}

	public static final void pattern_SystemStepNFToMessageRule_10_6_expressionBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		_this.registerObjectsToMatch_BWD(match, line, messageSend, operand,
				messageReceive, combo, message, interaction);

	}

	public static final boolean pattern_SystemStepNFToMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_3 = isApplicableMatch.getObject("operand");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("flowToOperand");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_7 = isApplicableMatch.getObject("combo");
		EObject _localVariable_8 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_10 = isApplicableMatch.getObject("message");
		EObject _localVariable_11 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_12 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpMessageSend = _localVariable_2;
		EObject tmpOperand = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpFlowToOperand = _localVariable_5;
		EObject tmpMessageReceive = _localVariable_6;
		EObject tmpCombo = _localVariable_7;
		EObject tmpUseCase = _localVariable_8;
		EObject tmpUseCaseToInteraction = _localVariable_9;
		EObject tmpMessage = _localVariable_10;
		EObject tmpInteraction = _localVariable_11;
		EObject tmpPackageDeclaration = _localVariable_12;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
					if (tmpOperand instanceof InteractionOperand) {
						InteractionOperand operand = (InteractionOperand) tmpOperand;
						if (tmpFlow instanceof NamedFlow) {
							NamedFlow flow = (NamedFlow) tmpFlow;
							if (tmpFlowToOperand instanceof FlowToInteractionFragment) {
								FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) tmpFlowToOperand;
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (tmpUseCase instanceof UseCase) {
											UseCase useCase = (UseCase) tmpUseCase;
											if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
												UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
												if (tmpMessage instanceof Message) {
													Message message = (Message) tmpMessage;
													if (tmpInteraction instanceof Interaction) {
														Interaction interaction = (Interaction) tmpInteraction;
														if (tmpPackageDeclaration instanceof PackageDeclaration) {
															PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
															return new Object[] {
																	actor,
																	line,
																	messageSend,
																	operand,
																	flow,
																	flowToOperand,
																	messageReceive,
																	combo,
																	useCase,
																	useCaseToInteraction,
																	message,
																	interaction,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_1_blackBBBBBBBBBBBBBFBB(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction, PackageDeclaration packageDeclaration,
			SystemStepNFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		if (!messageReceive.equals(messageSend)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { actor, line, messageSend, operand,
							flow, flowToOperand, messageReceive, combo,
							useCase, useCaseToInteraction, message,
							interaction, packageDeclaration, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			SystemStepNFToMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SystemStepNFToMessageRule_11_1_binding = pattern_SystemStepNFToMessageRule_11_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SystemStepNFToMessageRule_11_1_binding != null) {
			Actor actor = (Actor) result_pattern_SystemStepNFToMessageRule_11_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_SystemStepNFToMessageRule_11_1_binding[1];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_SystemStepNFToMessageRule_11_1_binding[2];
			InteractionOperand operand = (InteractionOperand) result_pattern_SystemStepNFToMessageRule_11_1_binding[3];
			NamedFlow flow = (NamedFlow) result_pattern_SystemStepNFToMessageRule_11_1_binding[4];
			FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) result_pattern_SystemStepNFToMessageRule_11_1_binding[5];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_SystemStepNFToMessageRule_11_1_binding[6];
			CombinedFragment combo = (CombinedFragment) result_pattern_SystemStepNFToMessageRule_11_1_binding[7];
			UseCase useCase = (UseCase) result_pattern_SystemStepNFToMessageRule_11_1_binding[8];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_SystemStepNFToMessageRule_11_1_binding[9];
			Message message = (Message) result_pattern_SystemStepNFToMessageRule_11_1_binding[10];
			Interaction interaction = (Interaction) result_pattern_SystemStepNFToMessageRule_11_1_binding[11];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_SystemStepNFToMessageRule_11_1_binding[12];

			Object[] result_pattern_SystemStepNFToMessageRule_11_1_black = pattern_SystemStepNFToMessageRule_11_1_blackBBBBBBBBBBBBBFBB(
					actor, line, messageSend, operand, flow, flowToOperand,
					messageReceive, combo, useCase, useCaseToInteraction,
					message, interaction, packageDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_SystemStepNFToMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_11_1_black[13];

				return new Object[] { actor, line, messageSend, operand, flow,
						flowToOperand, messageReceive, combo, useCase,
						useCaseToInteraction, message, interaction,
						packageDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_1_greenBBFBFB(
			Actor actor, NamedFlow flow, Message message, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		NormalStepToMessage stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToMessage();
		Object _localVariable_0 = csp.getValue("step", "name");
		flow.getSteps().add(step);
		step.setActor(actor);
		stepToMessage.setSource(step);
		stepToMessage.setTarget(message);
		String step_name_prime = (String) _localVariable_0;
		step.setName(step_name_prime);
		return new Object[] { actor, flow, step, message, stepToMessage, csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_2_blackBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message, NormalStepToMessage stepToMessage) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message,
					stepToMessage };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_2_greenFBBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message, NormalStepToMessage stepToMessage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(messageSend);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(message);
		ruleresult.getCreatedLinkElements().add(stepToMessage);
		return new Object[] { ruleresult, messageSend, messageReceive, step,
				message, stepToMessage };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_11_3_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject operand, EObject flow,
			EObject flowToOperand, EObject messageReceive, EObject combo,
			EObject useCase, EObject useCaseToInteraction, EObject step,
			EObject message, EObject interaction, EObject stepToMessage,
			EObject packageDeclaration) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(operand)) {
					if (!actor.equals(flow)) {
						if (!actor.equals(flowToOperand)) {
							if (!actor.equals(messageReceive)) {
								if (!actor.equals(combo)) {
									if (!actor.equals(useCase)) {
										if (!actor.equals(useCaseToInteraction)) {
											if (!actor.equals(step)) {
												if (!actor.equals(message)) {
													if (!actor
															.equals(interaction)) {
														if (!actor
																.equals(stepToMessage)) {
															if (!actor
																	.equals(packageDeclaration)) {
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
																								.equals(message)) {
																							if (!line
																									.equals(stepToMessage)) {
																								if (!line
																										.equals(packageDeclaration)) {
																									if (!messageSend
																											.equals(operand)) {
																										if (!messageSend
																												.equals(useCase)) {
																											if (!messageSend
																													.equals(useCaseToInteraction)) {
																												if (!messageSend
																														.equals(step)) {
																													if (!messageSend
																															.equals(stepToMessage)) {
																														if (!messageSend
																																.equals(packageDeclaration)) {
																															if (!operand
																																	.equals(useCase)) {
																																if (!operand
																																		.equals(useCaseToInteraction)) {
																																	if (!operand
																																			.equals(step)) {
																																		if (!operand
																																				.equals(stepToMessage)) {
																																			if (!operand
																																					.equals(packageDeclaration)) {
																																				if (!flow
																																						.equals(line)) {
																																					if (!flow
																																							.equals(messageSend)) {
																																						if (!flow
																																								.equals(operand)) {
																																							if (!flow
																																									.equals(flowToOperand)) {
																																								if (!flow
																																										.equals(messageReceive)) {
																																									if (!flow
																																											.equals(useCase)) {
																																										if (!flow
																																												.equals(useCaseToInteraction)) {
																																											if (!flow
																																													.equals(step)) {
																																												if (!flow
																																														.equals(message)) {
																																													if (!flow
																																															.equals(interaction)) {
																																														if (!flow
																																																.equals(stepToMessage)) {
																																															if (!flow
																																																	.equals(packageDeclaration)) {
																																																if (!flowToOperand
																																																		.equals(line)) {
																																																	if (!flowToOperand
																																																			.equals(messageSend)) {
																																																		if (!flowToOperand
																																																				.equals(operand)) {
																																																			if (!flowToOperand
																																																					.equals(messageReceive)) {
																																																				if (!flowToOperand
																																																						.equals(useCase)) {
																																																					if (!flowToOperand
																																																							.equals(useCaseToInteraction)) {
																																																						if (!flowToOperand
																																																								.equals(step)) {
																																																							if (!flowToOperand
																																																									.equals(message)) {
																																																								if (!flowToOperand
																																																										.equals(interaction)) {
																																																									if (!flowToOperand
																																																											.equals(stepToMessage)) {
																																																										if (!flowToOperand
																																																												.equals(packageDeclaration)) {
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
																																																																		.equals(stepToMessage)) {
																																																																	if (!messageReceive
																																																																			.equals(packageDeclaration)) {
																																																																		if (!combo
																																																																				.equals(line)) {
																																																																			if (!combo
																																																																					.equals(messageSend)) {
																																																																				if (!combo
																																																																						.equals(operand)) {
																																																																					if (!combo
																																																																							.equals(flow)) {
																																																																						if (!combo
																																																																								.equals(flowToOperand)) {
																																																																							if (!combo
																																																																									.equals(messageReceive)) {
																																																																								if (!combo
																																																																										.equals(useCase)) {
																																																																									if (!combo
																																																																											.equals(useCaseToInteraction)) {
																																																																										if (!combo
																																																																												.equals(step)) {
																																																																											if (!combo
																																																																													.equals(message)) {
																																																																												if (!combo
																																																																														.equals(interaction)) {
																																																																													if (!combo
																																																																															.equals(stepToMessage)) {
																																																																														if (!combo
																																																																																.equals(packageDeclaration)) {
																																																																															if (!useCase
																																																																																	.equals(useCaseToInteraction)) {
																																																																																if (!step
																																																																																		.equals(useCase)) {
																																																																																	if (!step
																																																																																			.equals(useCaseToInteraction)) {
																																																																																		if (!step
																																																																																				.equals(stepToMessage)) {
																																																																																			if (!message
																																																																																					.equals(messageSend)) {
																																																																																				if (!message
																																																																																						.equals(operand)) {
																																																																																					if (!message
																																																																																							.equals(messageReceive)) {
																																																																																						if (!message
																																																																																								.equals(useCase)) {
																																																																																							if (!message
																																																																																									.equals(useCaseToInteraction)) {
																																																																																								if (!message
																																																																																										.equals(step)) {
																																																																																									if (!message
																																																																																											.equals(stepToMessage)) {
																																																																																										if (!message
																																																																																												.equals(packageDeclaration)) {
																																																																																											if (!interaction
																																																																																													.equals(line)) {
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
																																																																																																				.equals(message)) {
																																																																																																			if (!interaction
																																																																																																					.equals(stepToMessage)) {
																																																																																																				if (!interaction
																																																																																																						.equals(packageDeclaration)) {
																																																																																																					if (!stepToMessage
																																																																																																							.equals(useCase)) {
																																																																																																						if (!stepToMessage
																																																																																																								.equals(useCaseToInteraction)) {
																																																																																																							if (!packageDeclaration
																																																																																																									.equals(useCase)) {
																																																																																																								if (!packageDeclaration
																																																																																																										.equals(useCaseToInteraction)) {
																																																																																																									if (!packageDeclaration
																																																																																																											.equals(step)) {
																																																																																																										if (!packageDeclaration
																																																																																																												.equals(stepToMessage)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													actor,
																																																																																																													line,
																																																																																																													messageSend,
																																																																																																													operand,
																																																																																																													flow,
																																																																																																													flowToOperand,
																																																																																																													messageReceive,
																																																																																																													combo,
																																																																																																													useCase,
																																																																																																													useCaseToInteraction,
																																																																																																													step,
																																																																																																													message,
																																																																																																													interaction,
																																																																																																													stepToMessage,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SystemStepNFToMessageRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject operand, EObject flow,
			EObject messageReceive, EObject combo, EObject step,
			EObject message, EObject interaction, EObject stepToMessage) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToMessage__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToMessage__message____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SystemStepNFToMessageRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String operand__messageSend____fragment_name_prime = "fragment";
		String messageSend__operand____enclosingOperand_name_prime = "enclosingOperand";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String stepToMessage__step____source_name_prime = "source";
		String stepToMessage__message____target_name_prime = "target";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageSend__line____covered);
		operand__messageSend____fragment.setSrc(operand);
		operand__messageSend____fragment.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(operand__messageSend____fragment);
		messageSend__operand____enclosingOperand.setSrc(messageSend);
		messageSend__operand____enclosingOperand.setTrg(operand);
		ruleresult.getTranslatedEdges().add(
				messageSend__operand____enclosingOperand);
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
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(step__actor____actor);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(message__messageSend____sendEvent);
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
		stepToMessage__step____source.setSrc(stepToMessage);
		stepToMessage__step____source.setTrg(step);
		ruleresult.getCreatedEdges().add(stepToMessage__step____source);
		stepToMessage__message____target.setSrc(stepToMessage);
		stepToMessage__message____target.setTrg(message);
		ruleresult.getCreatedEdges().add(stepToMessage__message____target);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageReceive__message____message);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		operand__messageSend____fragment
				.setName(operand__messageSend____fragment_name_prime);
		messageSend__operand____enclosingOperand
				.setName(messageSend__operand____enclosingOperand_name_prime);
		operand__messageReceive____fragment
				.setName(operand__messageReceive____fragment_name_prime);
		messageReceive__operand____enclosingOperand
				.setName(messageReceive__operand____enclosingOperand_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		stepToMessage__step____source
				.setName(stepToMessage__step____source_name_prime);
		stepToMessage__message____target
				.setName(stepToMessage__message____target_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		return new Object[] { ruleresult, actor, line, messageSend, operand,
				flow, messageReceive, combo, step, message, interaction,
				stepToMessage, line__messageSend____coveredBy,
				messageSend__line____covered, operand__messageSend____fragment,
				messageSend__operand____enclosingOperand,
				operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				line__operand____coveredBy, operand__line____covered,
				line__combo____coveredBy, combo__line____covered,
				flow__step____steps, step__actor____actor,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message, stepToMessage__step____source,
				stepToMessage__message____target,
				messageSend__message____message,
				messageReceive__message____message };
	}

	public static final void pattern_SystemStepNFToMessageRule_11_5_expressionBBBBBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend, EObject operand,
			EObject flow, EObject flowToOperand, EObject messageReceive,
			EObject combo, EObject useCase, EObject useCaseToInteraction,
			EObject step, EObject message, EObject interaction,
			EObject stepToMessage, EObject packageDeclaration) {
		_this.registerObjects_BWD(ruleresult, actor, line, messageSend,
				operand, flow, flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, step, message, interaction,
				stepToMessage, packageDeclaration);

	}

	public static final PerformRuleResult pattern_SystemStepNFToMessageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_1_blackFBB(
			EClass eClass, SystemStepNFToMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_12_1_binding = pattern_SystemStepNFToMessageRule_12_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SystemStepNFToMessageRule_12_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_12_1_black = pattern_SystemStepNFToMessageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SystemStepNFToMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_2_bindingFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("line");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("operand");
		EObject _localVariable_3 = match.getObject("messageReceive");
		EObject _localVariable_4 = match.getObject("combo");
		EObject _localVariable_5 = match.getObject("message");
		EObject _localVariable_6 = match.getObject("interaction");
		EObject tmpLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpOperand = _localVariable_2;
		EObject tmpMessageReceive = _localVariable_3;
		EObject tmpCombo = _localVariable_4;
		EObject tmpMessage = _localVariable_5;
		EObject tmpInteraction = _localVariable_6;
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpOperand instanceof InteractionOperand) {
					InteractionOperand operand = (InteractionOperand) tmpOperand;
					if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
						if (tmpCombo instanceof CombinedFragment) {
							CombinedFragment combo = (CombinedFragment) tmpCombo;
							if (tmpMessage instanceof Message) {
								Message message = (Message) tmpMessage;
								if (tmpInteraction instanceof Interaction) {
									Interaction interaction = (Interaction) tmpInteraction;
									return new Object[] { line, messageSend,
											operand, messageReceive, combo,
											message, interaction, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_12_2_blackBBBFFBBFFBBB(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			for (FlowToInteractionFragment flowToOperand : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(operand,
							FlowToInteractionFragment.class, "target")) {
				Flow tmpFlow = flowToOperand.getSource();
				if (tmpFlow instanceof NamedFlow) {
					NamedFlow flow = (NamedFlow) tmpFlow;
					for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(interaction,
									UseCaseToInteraction.class, "target")) {
						UseCase useCase = useCaseToInteraction.getSource();
						if (useCase != null) {
							_result.add(new Object[] { line, messageSend,
									operand, flow, flowToOperand,
									messageReceive, combo, useCase,
									useCaseToInteraction, message, interaction,
									match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_12_3_blackFBBBBBBBBBBBF(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (line.getCoveredBy().contains(messageSend)) {
				if (operand.getFragment().contains(messageSend)) {
					if (operand.getFragment().contains(messageReceive)) {
						if (flow.equals(flowToOperand.getSource())) {
							if (operand.equals(flowToOperand.getTarget())) {
								if (line.getCoveredBy().contains(operand)) {
									if (line.getCoveredBy().contains(combo)) {
										if (combo.getOperand()
												.contains(operand)) {
											if (useCase.getFlows().contains(
													flow)) {
												if (useCase
														.equals(useCaseToInteraction
																.getSource())) {
													if (interaction
															.equals(useCaseToInteraction
																	.getTarget())) {
														if (messageSend
																.equals(message
																		.getSendEvent())) {
															if (messageReceive
																	.equals(message
																			.getReceiveEvent())) {
																if (interaction
																		.equals(message
																				.getInteraction())) {
																	if (interaction
																			.equals(line
																					.getInteraction())) {
																		if (message
																				.equals(messageSend
																						.getMessage())) {
																			if (message
																					.equals(messageReceive
																							.getMessage())) {
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
																								operand,
																								flow,
																								flowToOperand,
																								messageReceive,
																								combo,
																								useCase,
																								useCaseToInteraction,
																								message,
																								interaction,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction, PackageDeclaration packageDeclaration) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__operand____enclosingOperand = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String operand__messageSend____fragment_name_prime = "fragment";
		String messageSend__operand____enclosingOperand_name_prime = "enclosingOperand";
		String operand__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__operand____enclosingOperand_name_prime = "enclosingOperand";
		String flowToOperand__flow____source_name_prime = "source";
		String flowToOperand__operand____target_name_prime = "target";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String combo__operand____operand_name_prime = "operand";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToOperand);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageSend__line____covered);
		operand__messageSend____fragment.setSrc(operand);
		operand__messageSend____fragment.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				operand__messageSend____fragment);
		messageSend__operand____enclosingOperand.setSrc(messageSend);
		messageSend__operand____enclosingOperand.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				messageSend__operand____enclosingOperand);
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
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
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
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				message__messageSend____sendEvent);
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
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__message____message);
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
		operand__messageSend____fragment
				.setName(operand__messageSend____fragment_name_prime);
		messageSend__operand____enclosingOperand
				.setName(messageSend__operand____enclosingOperand_name_prime);
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
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
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
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { actor, line, messageSend, operand, flow,
				flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, message, interaction, packageDeclaration,
				isApplicableMatch, line__messageSend____coveredBy,
				messageSend__line____covered, operand__messageSend____fragment,
				messageSend__operand____enclosingOperand,
				operand__messageReceive____fragment,
				messageReceive__operand____enclosingOperand,
				flowToOperand__flow____source,
				flowToOperand__operand____target, line__operand____coveredBy,
				operand__line____covered, line__combo____coveredBy,
				combo__line____covered, combo__operand____operand,
				useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				line__interaction____interaction,
				interaction__line____lifeline, messageSend__message____message,
				messageReceive__message____message,
				packageDeclaration__actor____actors,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_4_bindingFBBBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction, PackageDeclaration packageDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, actor, line, messageSend, operand, flow,
				flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, message, interaction, packageDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					messageSend, operand, flow, flowToOperand, messageReceive,
					combo, useCase, useCaseToInteraction, message, interaction,
					packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Message message,
			Interaction interaction, PackageDeclaration packageDeclaration) {
		Object[] result_pattern_SystemStepNFToMessageRule_12_4_binding = pattern_SystemStepNFToMessageRule_12_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, messageSend, operand,
				flow, flowToOperand, messageReceive, combo, useCase,
				useCaseToInteraction, message, interaction, packageDeclaration);
		if (result_pattern_SystemStepNFToMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_12_4_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_12_4_black = pattern_SystemStepNFToMessageRule_12_4_blackB(csp);
			if (result_pattern_SystemStepNFToMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, messageSend, operand, flow, flowToOperand,
						messageReceive, combo, useCase, useCaseToInteraction,
						message, interaction, packageDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_12_5_expressionFBB(
			SystemStepNFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SystemStepNFToMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SystemStepNFToMessageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_20_1_binding = pattern_SystemStepNFToMessageRule_20_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_20_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_20_1_black = pattern_SystemStepNFToMessageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_914067 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_914067 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_914067)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_33910 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_33910 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_33910)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_832301 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_832301)) {
					if (!messageReceive.equals(__DEC_message_message_832301)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_20_2_blackFFFFFFFB(
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
						InteractionOperand operand = messageSend
								.getEnclosingOperand();
						if (operand != null) {
							if (line.getCoveredBy().contains(operand)) {
								Message message = messageSend.getMessage();
								if (message != null) {
									if (messageSend.equals(message
											.getSendEvent())) {
										if (interaction.equals(message
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
															if (pattern_SystemStepNFToMessageRule_20_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_20_2_black_nac_3BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_20_2_black_nac_4BB(
																			message,
																			messageSend) == null) {
																		if (pattern_SystemStepNFToMessageRule_20_2_black_nac_1BB(
																				messageReceive,
																				interaction) == null) {
																			if (pattern_SystemStepNFToMessageRule_20_2_black_nac_2BBB(
																					message,
																					messageSend,
																					messageReceive) == null) {
																				if (pattern_SystemStepNFToMessageRule_20_2_black_nac_5BB(
																						messageReceive,
																						interaction) == null) {
																					if (pattern_SystemStepNFToMessageRule_20_2_black_nac_6BB(
																							message,
																							messageReceive) == null) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_20_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_20_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_21_1_binding = pattern_SystemStepNFToMessageRule_21_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_21_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_21_1_black = pattern_SystemStepNFToMessageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_777261 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_777261 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_777261)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_754179 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_754179 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_754179)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_70934 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_70934)) {
					if (!messageReceive.equals(__DEC_message_message_70934)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_21_2_blackFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(messageSend)) {
					InteractionOperand operand = messageSend
							.getEnclosingOperand();
					if (operand != null) {
						if (line.getCoveredBy().contains(operand)) {
							Message message = messageSend.getMessage();
							if (message != null) {
								if (messageSend.equals(message.getSendEvent())) {
									Interaction interaction = line
											.getInteraction();
									if (interaction != null) {
										if (interaction.equals(message
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
															if (pattern_SystemStepNFToMessageRule_21_2_black_nac_4BB(
																	message,
																	messageSend) == null) {
																if (pattern_SystemStepNFToMessageRule_21_2_black_nac_0BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_21_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_21_2_black_nac_1BB(
																				messageReceive,
																				interaction) == null) {
																			if (pattern_SystemStepNFToMessageRule_21_2_black_nac_2BBB(
																					message,
																					messageSend,
																					messageReceive) == null) {
																				if (pattern_SystemStepNFToMessageRule_21_2_black_nac_5BB(
																						messageReceive,
																						interaction) == null) {
																					if (pattern_SystemStepNFToMessageRule_21_2_black_nac_6BB(
																							message,
																							messageReceive) == null) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_21_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_21_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_22_1_binding = pattern_SystemStepNFToMessageRule_22_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_22_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_22_1_black = pattern_SystemStepNFToMessageRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_418425 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_418425 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_418425)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_180677 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_180677 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_180677)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_984555 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_984555)) {
					if (!messageReceive.equals(__DEC_message_message_984555)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_22_2_blackFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_fragment.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpMessageSend = _edge_fragment.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (operand.getFragment().contains(messageSend)) {
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
										if (message.equals(messageReceive
												.getMessage())) {
											Interaction interaction = message
													.getInteraction();
											if (interaction != null) {
												if (pattern_SystemStepNFToMessageRule_22_2_black_nac_4BB(
														message, messageSend) == null) {
													if (pattern_SystemStepNFToMessageRule_22_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_22_2_black_nac_6BB(
																message,
																messageReceive) == null) {
															if (pattern_SystemStepNFToMessageRule_22_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_22_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_22_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_22_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : operand
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								messageSend)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_22_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_22_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_23_1_binding = pattern_SystemStepNFToMessageRule_23_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_23_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_23_1_black = pattern_SystemStepNFToMessageRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_12767 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_12767 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_12767)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_767224 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_767224 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_767224)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_953890 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_953890)) {
					if (!messageReceive.equals(__DEC_message_message_953890)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_23_2_blackFFFFFFFB(
			EMoflonEdge _edge_enclosingOperand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_enclosingOperand.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpOperand = _edge_enclosingOperand.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (operand.getFragment().contains(messageSend)) {
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
										if (message.equals(messageReceive
												.getMessage())) {
											Interaction interaction = message
													.getInteraction();
											if (interaction != null) {
												if (pattern_SystemStepNFToMessageRule_23_2_black_nac_4BB(
														message, messageSend) == null) {
													if (pattern_SystemStepNFToMessageRule_23_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_23_2_black_nac_6BB(
																message,
																messageReceive) == null) {
															if (pattern_SystemStepNFToMessageRule_23_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_23_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_23_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_23_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : messageSend
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								operand)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_23_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_23_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_24_1_binding = pattern_SystemStepNFToMessageRule_24_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_24_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_24_1_black = pattern_SystemStepNFToMessageRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_794952 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_794952 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_794952)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_295651 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_295651 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_295651)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_976133 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_976133)) {
					if (!messageReceive.equals(__DEC_message_message_976133)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_24_2_blackFFFFFFFB(
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
									if (operand.getFragment().contains(
											messageSend)) {
										if (message.equals(messageSend
												.getMessage())) {
											Interaction interaction = message
													.getInteraction();
											if (interaction != null) {
												if (pattern_SystemStepNFToMessageRule_24_2_black_nac_6BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepNFToMessageRule_24_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_24_2_black_nac_4BB(
																message,
																messageSend) == null) {
															if (pattern_SystemStepNFToMessageRule_24_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_24_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_24_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_24_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : operand
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								messageSend)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_24_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_24_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_25_1_binding = pattern_SystemStepNFToMessageRule_25_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_25_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_25_1_black = pattern_SystemStepNFToMessageRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_610457 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_610457 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_610457)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_75705 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_75705 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_75705)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_350808 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_350808)) {
					if (!messageReceive.equals(__DEC_message_message_350808)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_25_2_blackFFFFFFFB(
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
									if (operand.getFragment().contains(
											messageSend)) {
										if (message.equals(messageSend
												.getMessage())) {
											Interaction interaction = message
													.getInteraction();
											if (interaction != null) {
												if (pattern_SystemStepNFToMessageRule_25_2_black_nac_6BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepNFToMessageRule_25_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_25_2_black_nac_4BB(
																message,
																messageSend) == null) {
															if (pattern_SystemStepNFToMessageRule_25_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_25_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_25_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_25_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : operand
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								messageSend)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_25_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_25_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_26_1_binding = pattern_SystemStepNFToMessageRule_26_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_26_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_26_1_black = pattern_SystemStepNFToMessageRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_401059 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_401059 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_401059)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_172792 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_172792 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_172792)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_532699 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_532699)) {
					if (!messageReceive.equals(__DEC_message_message_532699)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_26_2_blackFFFFFFFB(
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
						for (InteractionFragment tmpMessageSend : line
								.getCoveredBy()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (operand.getFragment().contains(messageSend)) {
									Message message = messageSend.getMessage();
									if (message != null) {
										if (messageSend.equals(message
												.getSendEvent())) {
											if (interaction.equals(message
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
																if (pattern_SystemStepNFToMessageRule_26_2_black_nac_0BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_26_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_26_2_black_nac_4BB(
																				message,
																				messageSend) == null) {
																			if (pattern_SystemStepNFToMessageRule_26_2_black_nac_1BB(
																					messageReceive,
																					interaction) == null) {
																				if (pattern_SystemStepNFToMessageRule_26_2_black_nac_2BBB(
																						message,
																						messageSend,
																						messageReceive) == null) {
																					if (pattern_SystemStepNFToMessageRule_26_2_black_nac_5BB(
																							messageReceive,
																							interaction) == null) {
																						if (pattern_SystemStepNFToMessageRule_26_2_black_nac_6BB(
																								message,
																								messageReceive) == null) {
																							for (InteractionFragment tmpCombo : line
																									.getCoveredBy()) {
																								if (tmpCombo instanceof CombinedFragment) {
																									CombinedFragment combo = (CombinedFragment) tmpCombo;
																									if (combo
																											.getOperand()
																											.contains(
																													operand)) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												operand,
																												messageReceive,
																												combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_26_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_26_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_27_1_binding = pattern_SystemStepNFToMessageRule_27_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_27_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_27_1_black = pattern_SystemStepNFToMessageRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_661129 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_661129 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_661129)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_952822 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_952822 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_952822)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_124462 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_124462)) {
					if (!messageReceive.equals(__DEC_message_message_124462)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_27_2_blackFFFFFFFB(
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
						for (InteractionFragment tmpMessageSend : operand
								.getFragment()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (line.getCoveredBy().contains(messageSend)) {
									Message message = messageSend.getMessage();
									if (message != null) {
										if (messageSend.equals(message
												.getSendEvent())) {
											if (interaction.equals(message
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
																if (pattern_SystemStepNFToMessageRule_27_2_black_nac_0BB(
																		messageSend,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_27_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_27_2_black_nac_4BB(
																				message,
																				messageSend) == null) {
																			if (pattern_SystemStepNFToMessageRule_27_2_black_nac_1BB(
																					messageReceive,
																					interaction) == null) {
																				if (pattern_SystemStepNFToMessageRule_27_2_black_nac_2BBB(
																						message,
																						messageSend,
																						messageReceive) == null) {
																					if (pattern_SystemStepNFToMessageRule_27_2_black_nac_5BB(
																							messageReceive,
																							interaction) == null) {
																						if (pattern_SystemStepNFToMessageRule_27_2_black_nac_6BB(
																								message,
																								messageReceive) == null) {
																							for (InteractionFragment tmpCombo : line
																									.getCoveredBy()) {
																								if (tmpCombo instanceof CombinedFragment) {
																									CombinedFragment combo = (CombinedFragment) tmpCombo;
																									if (combo
																											.getOperand()
																											.contains(
																													operand)) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												operand,
																												messageReceive,
																												combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_27_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_27_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_28_1_binding = pattern_SystemStepNFToMessageRule_28_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_28_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_28_1_black = pattern_SystemStepNFToMessageRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_739559 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_739559 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_739559)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_420055 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_420055 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_420055)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_923327 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_923327)) {
					if (!messageReceive.equals(__DEC_message_message_923327)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_28_2_blackFFFFFFFB(
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
						for (InteractionFragment tmpMessageSend : line
								.getCoveredBy()) {
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								InteractionOperand operand = messageSend
										.getEnclosingOperand();
								if (operand != null) {
									if (line.getCoveredBy().contains(operand)) {
										if (combo.getOperand()
												.contains(operand)) {
											Message message = messageSend
													.getMessage();
											if (message != null) {
												if (messageSend.equals(message
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
																		if (pattern_SystemStepNFToMessageRule_28_2_black_nac_0BB(
																				messageSend,
																				interaction) == null) {
																			if (pattern_SystemStepNFToMessageRule_28_2_black_nac_3BB(
																					messageSend,
																					interaction) == null) {
																				if (pattern_SystemStepNFToMessageRule_28_2_black_nac_4BB(
																						message,
																						messageSend) == null) {
																					if (pattern_SystemStepNFToMessageRule_28_2_black_nac_1BB(
																							messageReceive,
																							interaction) == null) {
																						if (pattern_SystemStepNFToMessageRule_28_2_black_nac_2BBB(
																								message,
																								messageSend,
																								messageReceive) == null) {
																							if (pattern_SystemStepNFToMessageRule_28_2_black_nac_5BB(
																									messageReceive,
																									interaction) == null) {
																								if (pattern_SystemStepNFToMessageRule_28_2_black_nac_6BB(
																										message,
																										messageReceive) == null) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_28_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_28_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_29_1_binding = pattern_SystemStepNFToMessageRule_29_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_29_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_29_1_black = pattern_SystemStepNFToMessageRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_433987 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_433987 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_433987)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_13001 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_13001 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_13001)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_695101 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_695101)) {
					if (!messageReceive.equals(__DEC_message_message_695101)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_29_2_blackFFFFFFFB(
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
						for (InteractionOperand operand : combo.getOperand()) {
							if (line.getCoveredBy().contains(operand)) {
								for (InteractionFragment tmpMessageSend : line
										.getCoveredBy()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (operand.getFragment().contains(
												messageSend)) {
											Message message = messageSend
													.getMessage();
											if (message != null) {
												if (messageSend.equals(message
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
																		if (pattern_SystemStepNFToMessageRule_29_2_black_nac_0BB(
																				messageSend,
																				interaction) == null) {
																			if (pattern_SystemStepNFToMessageRule_29_2_black_nac_3BB(
																					messageSend,
																					interaction) == null) {
																				if (pattern_SystemStepNFToMessageRule_29_2_black_nac_4BB(
																						message,
																						messageSend) == null) {
																					if (pattern_SystemStepNFToMessageRule_29_2_black_nac_1BB(
																							messageReceive,
																							interaction) == null) {
																						if (pattern_SystemStepNFToMessageRule_29_2_black_nac_2BBB(
																								message,
																								messageSend,
																								messageReceive) == null) {
																							if (pattern_SystemStepNFToMessageRule_29_2_black_nac_5BB(
																									messageReceive,
																									interaction) == null) {
																								if (pattern_SystemStepNFToMessageRule_29_2_black_nac_6BB(
																										message,
																										messageReceive) == null) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_29_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_29_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_30_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_30_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_30_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_30_1_binding = pattern_SystemStepNFToMessageRule_30_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_30_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_30_1_black = pattern_SystemStepNFToMessageRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_30_2_blackFFFFFB(
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
						for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									_result.add(new Object[] { actor, flow,
											useCase, step, packageDeclaration,
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

	public static final Object[] pattern_SystemStepNFToMessageRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_30_3_expressionFBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, step, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_30_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_31_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_31_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_31_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_31_1_binding = pattern_SystemStepNFToMessageRule_31_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_31_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_31_1_black = pattern_SystemStepNFToMessageRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_31_2_blackFFFFFB(
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
						if (tmpFlow instanceof NamedFlow) {
							NamedFlow flow = (NamedFlow) tmpFlow;
							for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								for (UseCase useCase : packageDeclaration
										.getUseCases()) {
									if (useCase.getFlows().contains(flow)) {
										_result.add(new Object[] { actor, flow,
												useCase, step,
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

	public static final Object[] pattern_SystemStepNFToMessageRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_31_3_expressionFBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Actor actor,
			NamedFlow flow, UseCase useCase, NormalStep step,
			PackageDeclaration packageDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, step, packageDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_31_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_32_1_binding = pattern_SystemStepNFToMessageRule_32_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_32_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_32_1_black = pattern_SystemStepNFToMessageRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_532395 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_532395 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_532395)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_91634 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_91634 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_91634)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_423641 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_423641)) {
					if (!messageReceive.equals(__DEC_message_message_423641)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_32_2_blackFFFFFFFB(
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
										InteractionOperand operand = messageSend
												.getEnclosingOperand();
										if (operand != null) {
											if (operand.getFragment().contains(
													messageReceive)) {
												if (pattern_SystemStepNFToMessageRule_32_2_black_nac_4BB(
														message, messageSend) == null) {
													if (pattern_SystemStepNFToMessageRule_32_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_32_2_black_nac_6BB(
																message,
																messageReceive) == null) {
															if (pattern_SystemStepNFToMessageRule_32_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_32_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_32_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_32_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : messageSend
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								operand)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_32_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_32_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_33_1_binding = pattern_SystemStepNFToMessageRule_33_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_33_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_33_1_black = pattern_SystemStepNFToMessageRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_962188 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_962188 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_962188)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_718191 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_718191 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_718191)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_121416 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_121416)) {
					if (!messageReceive.equals(__DEC_message_message_121416)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_33_2_blackFFFFFFFB(
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
											if (operand.getFragment().contains(
													messageSend)) {
												if (pattern_SystemStepNFToMessageRule_33_2_black_nac_6BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepNFToMessageRule_33_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_33_2_black_nac_4BB(
																message,
																messageSend) == null) {
															if (pattern_SystemStepNFToMessageRule_33_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_33_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_33_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_33_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : messageSend
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								operand)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_33_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_33_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_34_1_binding = pattern_SystemStepNFToMessageRule_34_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_34_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_34_1_black = pattern_SystemStepNFToMessageRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_514156 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_514156 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_514156)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_808738 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_808738 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_808738)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_548554 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_548554)) {
					if (!messageReceive.equals(__DEC_message_message_548554)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_34_2_blackFFFFFFFB(
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
										InteractionOperand operand = messageSend
												.getEnclosingOperand();
										if (operand != null) {
											if (operand.getFragment().contains(
													messageReceive)) {
												if (pattern_SystemStepNFToMessageRule_34_2_black_nac_0BB(
														messageSend,
														interaction) == null) {
													if (pattern_SystemStepNFToMessageRule_34_2_black_nac_3BB(
															messageSend,
															interaction) == null) {
														if (pattern_SystemStepNFToMessageRule_34_2_black_nac_4BB(
																message,
																messageSend) == null) {
															if (pattern_SystemStepNFToMessageRule_34_2_black_nac_1BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_34_2_black_nac_2BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_SystemStepNFToMessageRule_34_2_black_nac_5BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_34_2_black_nac_6BB(
																				message,
																				messageReceive) == null) {
																			for (Lifeline line : interaction
																					.getLifeline()) {
																				if (line.getCoveredBy()
																						.contains(
																								messageSend)) {
																					if (line.getCoveredBy()
																							.contains(
																									operand)) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_34_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_34_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_35_1_binding = pattern_SystemStepNFToMessageRule_35_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_35_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_35_1_black = pattern_SystemStepNFToMessageRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_770586 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_770586 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_770586)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_375508 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_375508 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_375508)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_349421 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_349421)) {
					if (!messageReceive.equals(__DEC_message_message_349421)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_35_2_blackFFFFFFFB(
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
										InteractionOperand operand = messageSend
												.getEnclosingOperand();
										if (operand != null) {
											if (operand.getFragment().contains(
													messageReceive)) {
												if (pattern_SystemStepNFToMessageRule_35_2_black_nac_0BB(
														messageSend,
														interaction) == null) {
													if (pattern_SystemStepNFToMessageRule_35_2_black_nac_3BB(
															messageSend,
															interaction) == null) {
														if (pattern_SystemStepNFToMessageRule_35_2_black_nac_4BB(
																message,
																messageSend) == null) {
															if (pattern_SystemStepNFToMessageRule_35_2_black_nac_1BB(
																	messageReceive,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_35_2_black_nac_2BBB(
																		message,
																		messageSend,
																		messageReceive) == null) {
																	if (pattern_SystemStepNFToMessageRule_35_2_black_nac_5BB(
																			messageReceive,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_35_2_black_nac_6BB(
																				message,
																				messageReceive) == null) {
																			for (Lifeline line : interaction
																					.getLifeline()) {
																				if (line.getCoveredBy()
																						.contains(
																								messageSend)) {
																					if (line.getCoveredBy()
																							.contains(
																									operand)) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_35_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_35_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_36_1_binding = pattern_SystemStepNFToMessageRule_36_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_36_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_36_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_36_1_black = pattern_SystemStepNFToMessageRule_36_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_36_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_36_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_574753 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_574753 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_574753)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_11903 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_11903 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_11903)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_805445 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_805445)) {
					if (!messageReceive.equals(__DEC_message_message_805445)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_36_2_blackFFFFFFFB(
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
						InteractionOperand operand = messageSend
								.getEnclosingOperand();
						if (operand != null) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (!messageReceive.equals(messageSend)) {
									if (operand.getFragment().contains(
											messageReceive)) {
										if (message.equals(messageReceive
												.getMessage())) {
											Interaction interaction = message
													.getInteraction();
											if (interaction != null) {
												if (pattern_SystemStepNFToMessageRule_36_2_black_nac_4BB(
														message, messageSend) == null) {
													if (pattern_SystemStepNFToMessageRule_36_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_36_2_black_nac_6BB(
																message,
																messageReceive) == null) {
															if (pattern_SystemStepNFToMessageRule_36_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_36_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_36_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_36_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : messageSend
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								operand)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_36_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_36_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_36_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_36_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_1_bindingFB(
			SystemStepNFToMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_1_blackFBB(
			EClass __eClass, SystemStepNFToMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_1_bindingAndBlackFFB(
			SystemStepNFToMessageRule _this) {
		Object[] result_pattern_SystemStepNFToMessageRule_37_1_binding = pattern_SystemStepNFToMessageRule_37_1_bindingFB(_this);
		if (result_pattern_SystemStepNFToMessageRule_37_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SystemStepNFToMessageRule_37_1_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_37_1_black = pattern_SystemStepNFToMessageRule_37_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SystemStepNFToMessageRule_37_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SystemStepNFToMessageRule_37_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_0BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		Interaction __DEC_messageSend_enclosingInteraction_572113 = messageSend
				.getEnclosingInteraction();
		if (__DEC_messageSend_enclosingInteraction_572113 != null) {
			if (!interaction
					.equals(__DEC_messageSend_enclosingInteraction_572113)) {
				return new Object[] { messageSend, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_1BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		Interaction __DEC_messageReceive_enclosingInteraction_577683 = messageReceive
				.getEnclosingInteraction();
		if (__DEC_messageReceive_enclosingInteraction_577683 != null) {
			if (!interaction
					.equals(__DEC_messageReceive_enclosingInteraction_577683)) {
				return new Object[] { messageReceive, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_2BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_139381 : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_139381)) {
					if (!messageReceive.equals(__DEC_message_message_139381)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_3BB(
			MessageOccurrenceSpecification messageSend, Interaction interaction) {
		if (interaction.equals(messageSend.getEnclosingInteraction())) {
			return new Object[] { messageSend, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_4BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_5BB(
			MessageOccurrenceSpecification messageReceive,
			Interaction interaction) {
		if (interaction.equals(messageReceive.getEnclosingInteraction())) {
			return new Object[] { messageReceive, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_black_nac_6BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_37_2_blackFFFFFFFB(
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
									if (operand.getFragment().contains(
											messageSend)) {
										if (message.equals(messageSend
												.getMessage())) {
											Interaction interaction = message
													.getInteraction();
											if (interaction != null) {
												if (pattern_SystemStepNFToMessageRule_37_2_black_nac_6BB(
														message, messageReceive) == null) {
													if (pattern_SystemStepNFToMessageRule_37_2_black_nac_2BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_SystemStepNFToMessageRule_37_2_black_nac_4BB(
																message,
																messageSend) == null) {
															if (pattern_SystemStepNFToMessageRule_37_2_black_nac_0BB(
																	messageSend,
																	interaction) == null) {
																if (pattern_SystemStepNFToMessageRule_37_2_black_nac_1BB(
																		messageReceive,
																		interaction) == null) {
																	if (pattern_SystemStepNFToMessageRule_37_2_black_nac_3BB(
																			messageSend,
																			interaction) == null) {
																		if (pattern_SystemStepNFToMessageRule_37_2_black_nac_5BB(
																				messageReceive,
																				interaction) == null) {
																			for (Lifeline line : operand
																					.getCovered()) {
																				if (line.getCoveredBy()
																						.contains(
																								messageSend)) {
																					if (interaction
																							.equals(line
																									.getInteraction())) {
																						for (InteractionFragment tmpCombo : line
																								.getCoveredBy()) {
																							if (tmpCombo instanceof CombinedFragment) {
																								CombinedFragment combo = (CombinedFragment) tmpCombo;
																								if (combo
																										.getOperand()
																										.contains(
																												operand)) {
																									_result.add(new Object[] {
																											line,
																											messageSend,
																											operand,
																											messageReceive,
																											combo,
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

		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SystemStepNFToMessageRule_37_3_expressionFBBBBBBBBB(
			SystemStepNFToMessageRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive,
			CombinedFragment combo, Message message, Interaction interaction) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, operand, messageReceive, combo, message,
				interaction);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_37_4_expressionFBB(
			SystemStepNFToMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_37_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SystemStepNFToMessageRule_37_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_1_blackB(
			SystemStepNFToMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, NamedFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToOperand) {
		if (ruleResult.getCorrObjects().contains(flowToOperand)) {
			return new Object[] { ruleResult, flowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InteractionOperand operand) {
		if (ruleResult.getTargetObjects().contains(operand)) {
			return new Object[] { ruleResult, operand };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, CombinedFragment combo) {
		if (ruleResult.getTargetObjects().contains(combo)) {
			return new Object[] { ruleResult, combo };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SystemStepNFToMessageRule_40_2_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList flowToOperandList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpFlowToOperand : flowToOperandList.getEntryObjects()) {
				if (tmpFlowToOperand instanceof FlowToInteractionFragment) {
					FlowToInteractionFragment flowToOperand = (FlowToInteractionFragment) tmpFlowToOperand;
					Flow tmpFlow = flowToOperand.getSource();
					if (tmpFlow instanceof NamedFlow) {
						NamedFlow flow = (NamedFlow) tmpFlow;
						InteractionFragment tmpOperand = flowToOperand
								.getTarget();
						if (tmpOperand instanceof InteractionOperand) {
							InteractionOperand operand = (InteractionOperand) tmpOperand;
							if (pattern_SystemStepNFToMessageRule_40_2_black_nac_4BB(
									ruleResult, flowToOperand) == null) {
								if (pattern_SystemStepNFToMessageRule_40_2_black_nac_3BB(
										ruleResult, flow) == null) {
									if (pattern_SystemStepNFToMessageRule_40_2_black_nac_5BB(
											ruleResult, operand) == null) {
										for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														flow, UseCase.class,
														"flows")) {
											if (pattern_SystemStepNFToMessageRule_40_2_black_nac_2BB(
													ruleResult, useCase) == null) {
												for (CombinedFragment combo : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																operand,
																CombinedFragment.class,
																"operand")) {
													if (pattern_SystemStepNFToMessageRule_40_2_black_nac_6BB(
															ruleResult, combo) == null) {
														for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		useCase,
																		PackageDeclaration.class,
																		"useCases")) {
															if (pattern_SystemStepNFToMessageRule_40_2_black_nac_1BB(
																	ruleResult,
																	packageDeclaration) == null) {
																for (Actor actor : packageDeclaration
																		.getActors()) {
																	if (pattern_SystemStepNFToMessageRule_40_2_black_nac_0BB(
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
																				if (pattern_SystemStepNFToMessageRule_40_2_black_nac_7BB(
																						ruleResult,
																						useCaseToInteraction) == null) {
																					if (pattern_SystemStepNFToMessageRule_40_2_black_nac_8BB(
																							ruleResult,
																							interaction) == null) {
																						for (Lifeline line : interaction
																								.getLifeline()) {
																							if (pattern_SystemStepNFToMessageRule_40_2_black_nac_9BB(
																									ruleResult,
																									line) == null) {
																								_result.add(new Object[] {
																										flowToOperandList,
																										actor,
																										packageDeclaration,
																										useCase,
																										flow,
																										flowToOperand,
																										operand,
																										combo,
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

	public static final Object[] pattern_SystemStepNFToMessageRule_40_3_bindingFBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, CombinedFragment combo,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, actor, line, operand, flow, flowToOperand,
				combo, useCase, useCaseToInteraction, interaction,
				packageDeclaration, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					operand, flow, flowToOperand, combo, useCase,
					useCaseToInteraction, interaction, packageDeclaration,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_3_bindingAndBlackFBBBBBBBBBBBBB(
			SystemStepNFToMessageRule _this,
			IsApplicableMatch isApplicableMatch, Actor actor, Lifeline line,
			InteractionOperand operand, NamedFlow flow,
			FlowToInteractionFragment flowToOperand, CombinedFragment combo,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			Interaction interaction, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SystemStepNFToMessageRule_40_3_binding = pattern_SystemStepNFToMessageRule_40_3_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, operand, flow,
				flowToOperand, combo, useCase, useCaseToInteraction,
				interaction, packageDeclaration, ruleResult);
		if (result_pattern_SystemStepNFToMessageRule_40_3_binding != null) {
			CSP csp = (CSP) result_pattern_SystemStepNFToMessageRule_40_3_binding[0];

			Object[] result_pattern_SystemStepNFToMessageRule_40_3_black = pattern_SystemStepNFToMessageRule_40_3_blackB(csp);
			if (result_pattern_SystemStepNFToMessageRule_40_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, operand, flow, flowToOperand, combo, useCase,
						useCaseToInteraction, interaction, packageDeclaration,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SystemStepNFToMessageRule_40_4_expressionFBB(
			SystemStepNFToMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_5_blackBBBBBBBBBB(
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
			PackageDeclaration packageDeclaration) {
		return new Object[] { actor, line, operand, flow, flowToOperand, combo,
				useCase, useCaseToInteraction, interaction, packageDeclaration };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_6_blackBBBBBBBBBBB(
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, FlowToInteractionFragment flowToOperand,
			CombinedFragment combo, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Interaction interaction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { actor, line, operand, flow, flowToOperand, combo,
				useCase, useCaseToInteraction, interaction, packageDeclaration,
				ruleResult };
	}

	public static final Object[] pattern_SystemStepNFToMessageRule_40_6_greenBBFBBFBFFBFBB(
			Actor actor, Lifeline line, InteractionOperand operand,
			NamedFlow flow, CombinedFragment combo, Interaction interaction,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		NormalStepToMessage stepToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToMessage();
		line.getCoveredBy().add(operand);
		line.getCoveredBy().add(combo);
		Object _localVariable_0 = csp.getValue("step", "name");
		Object _localVariable_1 = csp.getValue("message", "name");
		Object _localVariable_2 = csp.getValue("message", "messageSort");
		Object _localVariable_3 = csp.getValue("message", "messageKind");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		line.getCoveredBy().add(messageSend);
		operand.getFragment().add(messageSend);
		ruleResult.getTargetObjects().add(messageSend);
		operand.getFragment().add(messageReceive);
		ruleResult.getTargetObjects().add(messageReceive);
		flow.getSteps().add(step);
		step.setActor(actor);
		ruleResult.getSourceObjects().add(step);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		message.setInteraction(interaction);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		ruleResult.getTargetObjects().add(message);
		stepToMessage.setSource(step);
		stepToMessage.setTarget(message);
		ruleResult.getCorrObjects().add(stepToMessage);
		String step_name_prime = (String) _localVariable_0;
		String message_name_prime = (String) _localVariable_1;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_2;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		step.setName(step_name_prime);
		message.setName(message_name_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { actor, line, messageSend, operand, flow,
				messageReceive, combo, step, message, interaction,
				stepToMessage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SystemStepNFToMessageRule_40_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SystemStepNFToMessageRuleImpl
