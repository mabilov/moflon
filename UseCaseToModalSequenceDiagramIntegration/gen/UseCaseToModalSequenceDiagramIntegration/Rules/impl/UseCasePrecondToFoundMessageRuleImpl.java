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
import UseCaseDSL.ActorType;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToMessage;
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
	public boolean isAppropriate_FWD(Match match, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		// initial bindings
		Object[] result1_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_0_1_blackBBBBBB(this,
						match, useCase, actor, packageDeclaration, basicFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_0_2_bindingAndBlackFBBBBBB(
						this, match, useCase, actor, packageDeclaration,
						basicFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_4_blackBBBBB(
							match, useCase, actor, packageDeclaration,
							basicFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_4_greenBBBBBFFF(
							match, useCase, actor, packageDeclaration,
							basicFlow);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result4_green[5];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result4_green[6];
			// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_5_blackBBBBB(
							match, useCase, actor, packageDeclaration,
							basicFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_5_greenBB(
							match, packageDeclaration);

			// register objects to match
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_0_6_expressionBBBBBB(
							this, match, useCase, actor, packageDeclaration,
							basicFlow);
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
				.pattern_UseCasePrecondToFoundMessageRule_1_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCase useCase = (UseCase) result1_bindingAndBlack[0];
		Actor actor = (Actor) result1_bindingAndBlack[1];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[2];
		ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result1_bindingAndBlack[3];
		PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result1_bindingAndBlack[4];
		BasicFlow basicFlow = (BasicFlow) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_1_greenFBFFFBFFBBFB(
						useCase, actor, _package, basicFlow, csp);
		UseCaseToMessage useCaseToMessage = (UseCaseToMessage) result1_green[0];
		Message message = (Message) result1_green[2];
		Interaction interaction = (Interaction) result1_green[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[4];
		Lifeline line = (Lifeline) result1_green[6];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_green[7];
		FlowToInteractionFragment basicFlowToInteraction = (FlowToInteractionFragment) result1_green[10];

		// collect translated elements
		Object[] result2_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_2_blackBBBBBBBBBB(
						useCaseToMessage, useCase, message, interaction,
						messageReceive, actor, line, actorToLine, basicFlow,
						basicFlowToInteraction);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_2_greenFBBBBBBBBBB(
						useCaseToMessage, useCase, message, interaction,
						messageReceive, actor, line, actorToLine, basicFlow,
						basicFlowToInteraction);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_3_blackBBBBBBBBBBBBBB(
						ruleresult, useCaseToMessage, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, _package,
						packageDeclarationToPackage, basicFlow,
						basicFlowToInteraction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, useCaseToMessage, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, _package, basicFlow,
						basicFlowToInteraction);
		// EMoflonEdge useCaseToMessage__useCase____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge useCaseToMessage__message____target = (EMoflonEdge) result3_green[14];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[15];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[16];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[17];
		// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[18];
		// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[19];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[20];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[21];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[22];
		// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[23];
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[24];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[25];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[26];
		// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[27];
		// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[28];
		// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result3_green[29];
		// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[30];
		// EMoflonEdge basicFlowToInteraction__basicFlow____source = (EMoflonEdge) result3_green[31];
		// EMoflonEdge basicFlowToInteraction__interaction____target = (EMoflonEdge) result3_green[32];

		// perform postprocessing story node is empty
		// register objects
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_1_5_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, useCaseToMessage, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, _package,
						packageDeclarationToPackage, basicFlow,
						basicFlowToInteraction);
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
					"Pattern matching in node [prepare return value] failed");
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
			throw new RuntimeException("Binding in node core match failed");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		Actor actor = (Actor) result2_binding[1];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[2];
		BasicFlow basicFlow = (BasicFlow) result2_binding[3];
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_2_2_blackBBBFFBB(
						useCase, actor, packageDeclaration, basicFlow, match)) {
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[3];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_2_3_blackBBBBBB(
							useCase, actor, packageDeclaration, _package,
							packageDeclarationToPackage, basicFlow)) {
				Object[] result3_green = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_2_3_greenBBBBBBFFFFFF(
								useCase, actor, packageDeclaration, _package,
								packageDeclarationToPackage, basicFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[7];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[8];
				// EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge packageDeclarationToPackage___package____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, useCase, actor,
								packageDeclaration, _package,
								packageDeclarationToPackage, basicFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
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
								"Pattern matching in node [add match to rule result] failed");
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
	public void registerObjectsToMatch_FWD(Match match, UseCase useCase,
			Actor actor, PackageDeclaration packageDeclaration,
			BasicFlow basicFlow) {
		match.registerObject("useCase", useCase);
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("basicFlow", basicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UseCase useCase,
			Actor actor, PackageDeclaration packageDeclaration,
			BasicFlow basicFlow) {// Create CSP
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
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("found");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ASYNCH_SIGNAL");
		literal1.setType("");

		// Create attribute variables
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", true, csp);
		var_useCase_preConditions.setValue(useCase.getPreConditions());
		var_useCase_preConditions.setType("String");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("String");
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("String");

		// Create unbound variables
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", csp);
		var_line_name.setType("String");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq_0 = new Eq();
		EqMessageSort eqMessageSort = new EqMessageSort();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_preConditions, var_message_name);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal0);
		eq_0.setRuleName("");
		eq_0.solve(var_actor_name, var_line_name);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal1);
		eq_1.setRuleName("");
		eq_1.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
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
			EObject useCaseToMessage, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject _package, EObject packageDeclarationToPackage,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("useCaseToMessage", useCaseToMessage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("basicFlowToInteraction",
				basicFlowToInteraction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("useCase")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getUseCase())
				&& match.getObject("actor")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getActor())
				&& match.getObject("basicFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getBasicFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		// initial bindings
		Object[] result1_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_10_1_blackBBBBBBB(
						this, match, message, interaction, messageReceive,
						line, _package);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_10_2_bindingAndBlackFBBBBBBB(
						this, match, message, interaction, messageReceive,
						line, _package);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_4_blackBBBBBB(
							match, message, interaction, messageReceive, line,
							_package);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_4_greenBBBBBBFFFFFFFFFFF(
							match, message, interaction, messageReceive, line,
							_package);
			// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result4_green[6];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[7];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[8];
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result4_green[9];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result4_green[10];
			// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result4_green[11];
			// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result4_green[12];
			// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result4_green[13];
			// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result4_green[14];
			// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result4_green[15];
			// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result4_green[16];

			// collect context elements
			Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_5_blackBBBBBB(
							match, message, interaction, messageReceive, line,
							_package);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_5_greenBB(
							match, _package);

			// register objects to match
			UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_10_6_expressionBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package);
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
				.pattern_UseCasePrecondToFoundMessageRule_11_1_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Message message = (Message) result1_bindingAndBlack[0];
		Interaction interaction = (Interaction) result1_bindingAndBlack[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[3];
		Lifeline line = (Lifeline) result1_bindingAndBlack[4];
		ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result1_bindingAndBlack[5];
		PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_1_greenFFBBFBBFFFB(
						message, interaction, packageDeclaration, line, csp);
		UseCaseToMessage useCaseToMessage = (UseCaseToMessage) result1_green[0];
		UseCase useCase = (UseCase) result1_green[1];
		Actor actor = (Actor) result1_green[4];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_green[7];
		BasicFlow basicFlow = (BasicFlow) result1_green[8];
		FlowToInteractionFragment basicFlowToInteraction = (FlowToInteractionFragment) result1_green[9];

		// collect translated elements
		Object[] result2_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_2_blackBBBBBBBBBB(
						useCaseToMessage, useCase, message, interaction,
						messageReceive, actor, line, actorToLine, basicFlow,
						basicFlowToInteraction);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_2_greenFBBBBBBBBBB(
						useCaseToMessage, useCase, message, interaction,
						messageReceive, actor, line, actorToLine, basicFlow,
						basicFlowToInteraction);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_3_blackBBBBBBBBBBBBBB(
						ruleresult, useCaseToMessage, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, _package,
						packageDeclarationToPackage, basicFlow,
						basicFlowToInteraction);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, useCaseToMessage, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, _package, basicFlow,
						basicFlowToInteraction);
		// EMoflonEdge useCaseToMessage__useCase____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge useCaseToMessage__message____target = (EMoflonEdge) result3_green[14];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[15];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[16];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[17];
		// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[18];
		// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[19];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[20];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[21];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[22];
		// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[23];
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[24];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[25];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[26];
		// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[27];
		// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[28];
		// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result3_green[29];
		// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[30];
		// EMoflonEdge basicFlowToInteraction__basicFlow____source = (EMoflonEdge) result3_green[31];
		// EMoflonEdge basicFlowToInteraction__interaction____target = (EMoflonEdge) result3_green[32];

		// perform postprocessing story node is empty
		// register objects
		UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_11_5_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, useCaseToMessage, useCase, message,
						interaction, messageReceive, actor, packageDeclaration,
						line, actorToLine, _package,
						packageDeclarationToPackage, basicFlow,
						basicFlowToInteraction);
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
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Message message = (Message) result2_binding[0];
		Interaction interaction = (Interaction) result2_binding[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[2];
		Lifeline line = (Lifeline) result2_binding[3];
		ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_binding[4];
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_12_2_blackBBBFBBFB(
						message, interaction, messageReceive, line, _package,
						match)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_12_3_blackBBBBBBB(
							message, interaction, messageReceive,
							packageDeclaration, line, _package,
							packageDeclarationToPackage)) {
				Object[] result3_green = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_12_3_greenBBBBBBBFFFFFFFFFFFFFF(
								message, interaction, messageReceive,
								packageDeclaration, line, _package,
								packageDeclarationToPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[8];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[9];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[10];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[11];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[12];
				// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[13];
				// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[14];
				// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[15];
				// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[16];
				// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[17];
				// EMoflonEdge _package__interaction____packagedElement = (EMoflonEdge) result3_green[18];
				// EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge packageDeclarationToPackage___package____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, message, interaction,
								messageReceive, packageDeclaration, line,
								_package, packageDeclarationToPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
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
								"Pattern matching in node [add match to rule result] failed");
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
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		match.registerObject("message", message);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("line", line);
		match.registerObject("_package", _package);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("found");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ASYNCH_SIGNAL");
		literal1.setType("");

		// Create attribute variables
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", true, csp);
		var_message_messageKind.setValue(message.getMessageKind());
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", true, csp);
		var_message_messageSort.setValue(message.getMessageSort());
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");

		// Create unbound variables

		// Create constraints
		EqMessageKind eqMessageKind = new EqMessageKind();
		EqMessageSort eqMessageSort = new EqMessageSort();

		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eqMessageSort);

		// Solve CSP
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal0);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal1);
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
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {// Create CSP
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
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", true, csp);
		var_line_name.setValue(line.getName());
		var_line_name.setType("String");
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", true, csp);
		var_interaction_name.setValue(interaction.getName());
		var_interaction_name.setType("String");

		// Create unbound variables
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", csp);
		var_useCase_preConditions.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		EqActorType eqActorType = new EqActorType();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_preConditions, var_message_name);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eq_0.setRuleName("");
		eq_0.solve(var_actor_name, var_line_name);
		eq_1.setRuleName("");
		eq_1.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
			EObject useCaseToMessage, EObject useCase, EObject message,
			EObject interaction, EObject messageReceive, EObject actor,
			EObject packageDeclaration, EObject line, EObject actorToLine,
			EObject _package, EObject packageDeclarationToPackage,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("useCaseToMessage", useCaseToMessage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("basicFlowToInteraction",
				basicFlowToInteraction);

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
				&& match.getObject("interaction")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteraction())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("line")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getLifeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_81(
			EMoflonEdge _edge_receiveEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_20_2_blackFFFFFB(_edge_receiveEvent)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_20_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_82(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_21_2_blackFFFFFB(_edge_interaction)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_21_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_83(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_22_2_blackFFFFFB(_edge_message)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_22_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_84(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_23_2_blackFFFFFB(_edge_interaction)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_23_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_85(
			EMoflonEdge _edge_lifeline) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_24_2_blackFFFFFB(_edge_lifeline)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_24_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_86(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_25_2_blackFFFFFB(_edge_enclosingInteraction)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_25_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_87(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_26_2_blackFFFFFB(_edge_fragment)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_26_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_88(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_27_2_blackFFFFFB(_edge_message)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_27_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_236(
			EMoflonEdge _edge_useCases) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_28_2_blackFFFFB(_edge_useCases)) {
			UseCase useCase = (UseCase) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			BasicFlow basicFlow = (BasicFlow) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_28_3_expressionFBBBBBB(
							this, match, useCase, actor, packageDeclaration,
							basicFlow)) {
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
								"Pattern matching in node [Add match to rule result] failed");
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_237(
			EMoflonEdge _edge_actors) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_29_2_blackFFFFB(_edge_actors)) {
			UseCase useCase = (UseCase) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			BasicFlow basicFlow = (BasicFlow) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_29_3_expressionFBBBBBB(
							this, match, useCase, actor, packageDeclaration,
							basicFlow)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_89(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_30_2_blackFFFFFB(_edge_coveredBy)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_30_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_90(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_2_blackFFFFFB(_edge_covered)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_31_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_91(
			EMoflonEdge _edge_packagedElement) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_32_2_blackFFFFFB(_edge_packagedElement)) {
			Message message = (Message) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[2];
			Lifeline line = (Lifeline) result2_black[3];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[4];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_32_3_expressionFBBBBBBB(
							this, match, message, interaction, messageReceive,
							line, _package)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_238(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_33_2_blackFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			BasicFlow basicFlow = (BasicFlow) result2_black[3];
			Object[] result2_green = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_33_3_expressionFBBBBBB(
							this, match, useCase, actor, packageDeclaration,
							basicFlow)) {
				// Ensure that the correct types of elements are matched
				if (UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_33_6_expressionFB(__result);
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
			PackageDeclarationToPackage packageDeclarationToPackageParameter) {
		// create result
		Object[] result1_black = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_36_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_36_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_36_2_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList packageDeclarationToPackageList = (RuleEntryList) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result2_black[2];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_36_3_bindingAndBlackFBBBBBB(
							this, isApplicableMatch, packageDeclaration,
							_package, packageDeclarationToPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UseCasePrecondToFoundMessageRuleImpl
					.pattern_UseCasePrecondToFoundMessageRule_36_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = UseCasePrecondToFoundMessageRuleImpl
						.pattern_UseCasePrecondToFoundMessageRule_36_5_blackBBB(
								packageDeclaration, _package,
								packageDeclarationToPackage);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_36_6_blackBBBB(
									packageDeclaration, _package,
									packageDeclarationToPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					UseCasePrecondToFoundMessageRuleImpl
							.pattern_UseCasePrecondToFoundMessageRule_36_6_greenFFFFFFBFFBFFBB(
									packageDeclaration, _package, ruleResult,
									csp);
					// UseCaseToMessage useCaseToMessage = (UseCaseToMessage) result6_green[0];
					// UseCase useCase = (UseCase) result6_green[1];
					// Message message = (Message) result6_green[2];
					// Interaction interaction = (Interaction) result6_green[3];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[4];
					// Actor actor = (Actor) result6_green[5];
					// Lifeline line = (Lifeline) result6_green[7];
					// ActorToLifeline actorToLine = (ActorToLifeline) result6_green[8];
					// BasicFlow basicFlow = (BasicFlow) result6_green[10];
					// FlowToInteractionFragment basicFlowToInteraction = (FlowToInteractionFragment) result6_green[11];

				} else {
				}

			} else {
			}

		}
		return UseCasePrecondToFoundMessageRuleImpl
				.pattern_UseCasePrecondToFoundMessageRule_36_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("found");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("ASYNCH_SIGNAL");
		literal2.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", csp);
		var_useCase_preConditions.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_line_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"line.name", csp);
		var_line_name.setType("String");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("String");
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("String");

		// Create constraints
		EqMessageKind eqMessageKind = new EqMessageKind();
		EqActorType eqActorType = new EqActorType();
		EqMessageSort eqMessageSort = new EqMessageSort();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal0);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal1);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal2);
		eq.setRuleName("");
		eq.solve(var_useCase_preConditions, var_message_name);
		eq_0.setRuleName("");
		eq_0.solve(var_actor_name, var_line_name);
		eq_1.setRuleName("");
		eq_1.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_ACTOR_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_BASICFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(ModalSequenceDiagram.Package) arguments.get(4),
					(PackageDeclarationToPackage) arguments.get(5),
					(BasicFlow) arguments.get(6));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ModalSequenceDiagram.Package) arguments.get(5));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ModalSequenceDiagram.Package) arguments.get(5));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ModalSequenceDiagram.Package) arguments.get(5));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_PACKAGEDECLARATION_LIFELINE_PACKAGE_PACKAGEDECLARATIONTOPACKAGE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Message) arguments.get(1), (Interaction) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(Lifeline) arguments.get(5),
					(ModalSequenceDiagram.Package) arguments.get(6),
					(PackageDeclarationToPackage) arguments.get(7));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_81((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_82((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_83((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_84((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_85__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_85((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_86__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_86((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_87((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_88((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_236__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_236((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_237__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_237((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_89((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_90((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_91((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_238__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_238((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(PackageDeclarationToPackage) arguments.get(1));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_1_blackBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		return new Object[] { _this, match, useCase, actor, packageDeclaration,
				basicFlow };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_2_bindingFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, useCase,
				actor, packageDeclaration, basicFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, actor,
					packageDeclaration, basicFlow };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_2_bindingAndBlackFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_0_2_binding = pattern_UseCasePrecondToFoundMessageRule_0_2_bindingFBBBBBB(
				_this, match, useCase, actor, packageDeclaration, basicFlow);
		if (result_pattern_UseCasePrecondToFoundMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_0_2_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_0_2_black = pattern_UseCasePrecondToFoundMessageRule_0_2_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, useCase, actor,
						packageDeclaration, basicFlow };
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
			Match match, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		return new Object[] { match, useCase, actor, packageDeclaration,
				basicFlow };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_4_greenBBBBBFFF(
			Match match, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(useCase);
		match.getToBeTranslatedNodes().add(actor);
		match.getToBeTranslatedNodes().add(basicFlow);
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String useCase__basicFlow____flows_name_prime = "flows";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getToBeTranslatedEdges().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getToBeTranslatedEdges().add(packageDeclaration__actor____actors);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		match.getToBeTranslatedEdges().add(useCase__basicFlow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		return new Object[] { match, useCase, actor, packageDeclaration,
				basicFlow, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				useCase__basicFlow____flows };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_5_blackBBBBB(
			Match match, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		return new Object[] { match, useCase, actor, packageDeclaration,
				basicFlow };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_0_5_greenBB(
			Match match, PackageDeclaration packageDeclaration) {
		match.getContextNodes().add(packageDeclaration);
		return new Object[] { match, packageDeclaration };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_0_6_expressionBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		_this.registerObjectsToMatch_FWD(match, useCase, actor,
				packageDeclaration, basicFlow);

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_1 = isApplicableMatch.getObject("actor");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("_package");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("packageDeclarationToPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("basicFlow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpActor = _localVariable_1;
		EObject tmpPackageDeclaration = _localVariable_2;
		EObject tmp_package = _localVariable_3;
		EObject tmpPackageDeclarationToPackage = _localVariable_4;
		EObject tmpBasicFlow = _localVariable_5;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (tmpPackageDeclaration instanceof PackageDeclaration) {
					PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
					if (tmp_package instanceof ModalSequenceDiagram.Package) {
						ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
						if (tmpPackageDeclarationToPackage instanceof PackageDeclarationToPackage) {
							PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) tmpPackageDeclarationToPackage;
							if (tmpBasicFlow instanceof BasicFlow) {
								BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
								return new Object[] { useCase, actor,
										packageDeclaration, _package,
										packageDeclarationToPackage, basicFlow,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_blackBBBBBBFBB(
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow, UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCase, actor, packageDeclaration,
						_package, packageDeclarationToPackage, basicFlow, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_bindingAndBlackFFFFFFFBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding = pattern_UseCasePrecondToFoundMessageRule_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding != null) {
			UseCase useCase = (UseCase) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[0];
			Actor actor = (Actor) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[2];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[3];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[4];
			BasicFlow basicFlow = (BasicFlow) result_pattern_UseCasePrecondToFoundMessageRule_1_1_binding[5];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_1_1_black = pattern_UseCasePrecondToFoundMessageRule_1_1_blackBBBBBBFBB(
					useCase, actor, packageDeclaration, _package,
					packageDeclarationToPackage, basicFlow, _this,
					isApplicableMatch);
			if (result_pattern_UseCasePrecondToFoundMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_1_1_black[6];

				return new Object[] { useCase, actor, packageDeclaration,
						_package, packageDeclarationToPackage, basicFlow, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_1_greenFBFFFBFFBBFB(
			UseCase useCase, Actor actor,
			ModalSequenceDiagram.Package _package, BasicFlow basicFlow, CSP csp) {
		UseCaseToMessage useCaseToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCaseToMessage();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		Interaction interaction = ModalSequenceDiagramFactory.eINSTANCE
				.createInteraction();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Lifeline line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		FlowToInteractionFragment basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("message", "name");
		Object _localVariable_1 = csp.getValue("message", "messageKind");
		Object _localVariable_2 = csp.getValue("message", "messageSort");
		Object _localVariable_3 = csp.getValue("interaction", "name");
		Object _localVariable_4 = csp.getValue("line", "name");
		useCaseToMessage.setSource(useCase);
		useCaseToMessage.setTarget(message);
		message.setInteraction(interaction);
		_package.getPackagedElement().add(interaction);
		message.setReceiveEvent(messageReceive);
		messageReceive.setEnclosingInteraction(interaction);
		messageReceive.setMessage(message);
		line.setInteraction(interaction);
		line.getCoveredBy().add(messageReceive);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		basicFlowToInteraction.setSource(basicFlow);
		basicFlowToInteraction.setTarget(interaction);
		String message_name_prime = (String) _localVariable_0;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_1;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_2;
		String interaction_name_prime = (String) _localVariable_3;
		String line_name_prime = (String) _localVariable_4;
		message.setName(message_name_prime);
		message.setMessageKind(message_messageKind_prime);
		message.setMessageSort(message_messageSort_prime);
		interaction.setName(interaction_name_prime);
		line.setName(line_name_prime);
		return new Object[] { useCaseToMessage, useCase, message, interaction,
				messageReceive, actor, line, actorToLine, _package, basicFlow,
				basicFlowToInteraction, csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_2_blackBBBBBBBBBB(
			UseCaseToMessage useCaseToMessage, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			Lifeline line, ActorToLifeline actorToLine, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		return new Object[] { useCaseToMessage, useCase, message, interaction,
				messageReceive, actor, line, actorToLine, basicFlow,
				basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_2_greenFBBBBBBBBBB(
			UseCaseToMessage useCaseToMessage, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			Lifeline line, ActorToLifeline actorToLine, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(useCaseToMessage);
		ruleresult.getTranslatedElements().add(useCase);
		ruleresult.getCreatedElements().add(message);
		ruleresult.getCreatedElements().add(interaction);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(actor);
		ruleresult.getCreatedElements().add(line);
		ruleresult.getCreatedLinkElements().add(actorToLine);
		ruleresult.getTranslatedElements().add(basicFlow);
		ruleresult.getCreatedLinkElements().add(basicFlowToInteraction);
		return new Object[] { ruleresult, useCaseToMessage, useCase, message,
				interaction, messageReceive, actor, line, actorToLine,
				basicFlow, basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject useCaseToMessage,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject packageDeclarationToPackage, EObject basicFlow,
			EObject basicFlowToInteraction) {
		if (!useCase.equals(useCaseToMessage)) {
			if (!message.equals(useCaseToMessage)) {
				if (!message.equals(useCase)) {
					if (!message.equals(messageReceive)) {
						if (!message.equals(packageDeclaration)) {
							if (!message.equals(packageDeclarationToPackage)) {
								if (!interaction.equals(useCaseToMessage)) {
									if (!interaction.equals(useCase)) {
										if (!interaction.equals(message)) {
											if (!interaction
													.equals(messageReceive)) {
												if (!interaction
														.equals(packageDeclaration)) {
													if (!interaction
															.equals(line)) {
														if (!interaction
																.equals(packageDeclarationToPackage)) {
															if (!messageReceive
																	.equals(useCaseToMessage)) {
																if (!messageReceive
																		.equals(useCase)) {
																	if (!messageReceive
																			.equals(packageDeclaration)) {
																		if (!messageReceive
																				.equals(packageDeclarationToPackage)) {
																			if (!actor
																					.equals(useCaseToMessage)) {
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
																													.equals(packageDeclarationToPackage)) {
																												if (!actor
																														.equals(basicFlow)) {
																													if (!actor
																															.equals(basicFlowToInteraction)) {
																														if (!packageDeclaration
																																.equals(useCaseToMessage)) {
																															if (!packageDeclaration
																																	.equals(useCase)) {
																																if (!packageDeclaration
																																		.equals(packageDeclarationToPackage)) {
																																	if (!line
																																			.equals(useCaseToMessage)) {
																																		if (!line
																																				.equals(useCase)) {
																																			if (!line
																																					.equals(message)) {
																																				if (!line
																																						.equals(messageReceive)) {
																																					if (!line
																																							.equals(packageDeclaration)) {
																																						if (!line
																																								.equals(packageDeclarationToPackage)) {
																																							if (!actorToLine
																																									.equals(useCaseToMessage)) {
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
																																																.equals(packageDeclarationToPackage)) {
																																															if (!actorToLine
																																																	.equals(basicFlow)) {
																																																if (!actorToLine
																																																		.equals(basicFlowToInteraction)) {
																																																	if (!_package
																																																			.equals(useCaseToMessage)) {
																																																		if (!_package
																																																				.equals(useCase)) {
																																																			if (!_package
																																																					.equals(message)) {
																																																				if (!_package
																																																						.equals(interaction)) {
																																																					if (!_package
																																																							.equals(messageReceive)) {
																																																						if (!_package
																																																								.equals(actor)) {
																																																							if (!_package
																																																									.equals(packageDeclaration)) {
																																																								if (!_package
																																																										.equals(line)) {
																																																									if (!_package
																																																											.equals(actorToLine)) {
																																																										if (!_package
																																																												.equals(packageDeclarationToPackage)) {
																																																											if (!_package
																																																													.equals(basicFlow)) {
																																																												if (!_package
																																																														.equals(basicFlowToInteraction)) {
																																																													if (!packageDeclarationToPackage
																																																															.equals(useCaseToMessage)) {
																																																														if (!packageDeclarationToPackage
																																																																.equals(useCase)) {
																																																															if (!basicFlow
																																																																	.equals(useCaseToMessage)) {
																																																																if (!basicFlow
																																																																		.equals(useCase)) {
																																																																	if (!basicFlow
																																																																			.equals(message)) {
																																																																		if (!basicFlow
																																																																				.equals(interaction)) {
																																																																			if (!basicFlow
																																																																					.equals(messageReceive)) {
																																																																				if (!basicFlow
																																																																						.equals(packageDeclaration)) {
																																																																					if (!basicFlow
																																																																							.equals(line)) {
																																																																						if (!basicFlow
																																																																								.equals(packageDeclarationToPackage)) {
																																																																							if (!basicFlow
																																																																									.equals(basicFlowToInteraction)) {
																																																																								if (!basicFlowToInteraction
																																																																										.equals(useCaseToMessage)) {
																																																																									if (!basicFlowToInteraction
																																																																											.equals(useCase)) {
																																																																										if (!basicFlowToInteraction
																																																																												.equals(message)) {
																																																																											if (!basicFlowToInteraction
																																																																													.equals(interaction)) {
																																																																												if (!basicFlowToInteraction
																																																																														.equals(messageReceive)) {
																																																																													if (!basicFlowToInteraction
																																																																															.equals(packageDeclaration)) {
																																																																														if (!basicFlowToInteraction
																																																																																.equals(line)) {
																																																																															if (!basicFlowToInteraction
																																																																																	.equals(packageDeclarationToPackage)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		useCaseToMessage,
																																																																																		useCase,
																																																																																		message,
																																																																																		interaction,
																																																																																		messageReceive,
																																																																																		actor,
																																																																																		packageDeclaration,
																																																																																		line,
																																																																																		actorToLine,
																																																																																		_package,
																																																																																		packageDeclarationToPackage,
																																																																																		basicFlow,
																																																																																		basicFlowToInteraction };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject useCaseToMessage,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject basicFlow, EObject basicFlowToInteraction) {
		EMoflonEdge useCaseToMessage__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToMessage__message____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__basicFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UseCasePrecondToFoundMessageRule";
		String useCaseToMessage__useCase____source_name_prime = "source";
		String useCaseToMessage__message____target_name_prime = "target";
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
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		String useCase__basicFlow____flows_name_prime = "flows";
		String basicFlowToInteraction__basicFlow____source_name_prime = "source";
		String basicFlowToInteraction__interaction____target_name_prime = "target";
		useCaseToMessage__useCase____source.setSrc(useCaseToMessage);
		useCaseToMessage__useCase____source.setTrg(useCase);
		ruleresult.getCreatedEdges().add(useCaseToMessage__useCase____source);
		useCaseToMessage__message____target.setSrc(useCaseToMessage);
		useCaseToMessage__message____target.setTrg(message);
		ruleresult.getCreatedEdges().add(useCaseToMessage__message____target);
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
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		ruleresult.getCreatedEdges().add(interaction__line____lifeline);
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
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		ruleresult.getTranslatedEdges().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getTranslatedEdges()
				.add(packageDeclaration__actor____actors);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageReceive__line____covered);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		ruleresult.getCreatedEdges().add(actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		ruleresult.getCreatedEdges().add(actorToLine__line____target);
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				_package__interaction____packagedElement);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		ruleresult.getTranslatedEdges().add(useCase__basicFlow____flows);
		basicFlowToInteraction__basicFlow____source
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__basicFlow____source.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__basicFlow____source);
		basicFlowToInteraction__interaction____target
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__interaction____target.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__interaction____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCaseToMessage__useCase____source
				.setName(useCaseToMessage__useCase____source_name_prime);
		useCaseToMessage__message____target
				.setName(useCaseToMessage__message____target_name_prime);
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
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		basicFlowToInteraction__basicFlow____source
				.setName(basicFlowToInteraction__basicFlow____source_name_prime);
		basicFlowToInteraction__interaction____target
				.setName(basicFlowToInteraction__interaction____target_name_prime);
		return new Object[] { ruleresult, useCaseToMessage, useCase, message,
				interaction, messageReceive, actor, packageDeclaration, line,
				actorToLine, _package, basicFlow, basicFlowToInteraction,
				useCaseToMessage__useCase____source,
				useCaseToMessage__message____target,
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
				actorToLine__line____target,
				_package__interaction____packagedElement,
				useCase__basicFlow____flows,
				basicFlowToInteraction__basicFlow____source,
				basicFlowToInteraction__interaction____target };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_1_5_expressionBBBBBBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			PerformRuleResult ruleresult, EObject useCaseToMessage,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject packageDeclarationToPackage, EObject basicFlow,
			EObject basicFlowToInteraction) {
		_this.registerObjects_FWD(ruleresult, useCaseToMessage, useCase,
				message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine, _package,
				packageDeclarationToPackage, basicFlow, basicFlowToInteraction);

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
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("actor");
		EObject _localVariable_2 = match.getObject("packageDeclaration");
		EObject _localVariable_3 = match.getObject("basicFlow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpActor = _localVariable_1;
		EObject tmpPackageDeclaration = _localVariable_2;
		EObject tmpBasicFlow = _localVariable_3;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (tmpPackageDeclaration instanceof PackageDeclaration) {
					PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
					if (tmpBasicFlow instanceof BasicFlow) {
						BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
						return new Object[] { useCase, actor,
								packageDeclaration, basicFlow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_2_2_blackBBBFFBB(
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						PackageDeclarationToPackage.class, "source")) {
			ModalSequenceDiagram.Package _package = packageDeclarationToPackage
					.getTarget();
			if (_package != null) {
				_result.add(new Object[] { useCase, actor, packageDeclaration,
						_package, packageDeclarationToPackage, basicFlow, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_2_3_blackBBBBBB(
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (packageDeclaration.getUseCases().contains(useCase)) {
			if (packageDeclaration.getActors().contains(actor)) {
				if (packageDeclaration.equals(packageDeclarationToPackage
						.getSource())) {
					if (_package
							.equals(packageDeclarationToPackage.getTarget())) {
						if (useCase.getFlows().contains(basicFlow)) {
							_result.add(new Object[] { useCase, actor,
									packageDeclaration, _package,
									packageDeclarationToPackage, basicFlow });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_3_greenBBBBBBFFFFFF(
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage___package____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclarationToPackage__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToPackage___package____target_name_prime = "target";
		String useCase__basicFlow____flows_name_prime = "flows";
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage);
		isApplicableMatch.getAllContextElements().add(basicFlow);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclarationToPackage__packageDeclaration____source
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__packageDeclaration____source
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage__packageDeclaration____source);
		packageDeclarationToPackage___package____target
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage___package____target.setTrg(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage___package____target);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__basicFlow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclarationToPackage__packageDeclaration____source
				.setName(packageDeclarationToPackage__packageDeclaration____source_name_prime);
		packageDeclarationToPackage___package____target
				.setName(packageDeclarationToPackage___package____target_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		return new Object[] { useCase, actor, packageDeclaration, _package,
				packageDeclarationToPackage, basicFlow, isApplicableMatch,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				packageDeclarationToPackage__packageDeclaration____source,
				packageDeclarationToPackage___package____target,
				useCase__basicFlow____flows };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_4_bindingFBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, useCase, actor, packageDeclaration,
				_package, packageDeclarationToPackage, basicFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					actor, packageDeclaration, _package,
					packageDeclarationToPackage, basicFlow };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_2_4_bindingAndBlackFBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			BasicFlow basicFlow) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_2_4_binding = pattern_UseCasePrecondToFoundMessageRule_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, useCase, actor, packageDeclaration,
				_package, packageDeclarationToPackage, basicFlow);
		if (result_pattern_UseCasePrecondToFoundMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_2_4_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_2_4_black = pattern_UseCasePrecondToFoundMessageRule_2_4_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						actor, packageDeclaration, _package,
						packageDeclarationToPackage, basicFlow };
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_1_blackBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		return new Object[] { _this, match, message, interaction,
				messageReceive, line, _package };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_2_bindingFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, message,
				interaction, messageReceive, line, _package);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, message, interaction,
					messageReceive, line, _package };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_2_bindingAndBlackFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_10_2_binding = pattern_UseCasePrecondToFoundMessageRule_10_2_bindingFBBBBBBB(
				_this, match, message, interaction, messageReceive, line,
				_package);
		if (result_pattern_UseCasePrecondToFoundMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_10_2_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_10_2_black = pattern_UseCasePrecondToFoundMessageRule_10_2_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, message, interaction,
						messageReceive, line, _package };
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_4_blackBBBBBB(
			Match match, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		return new Object[] { match, message, interaction, messageReceive,
				line, _package };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_4_greenBBBBBBFFFFFFFFFFF(
			Match match, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
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
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(message);
		match.getToBeTranslatedNodes().add(interaction);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(line);
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String _package__interaction____packagedElement_name_prime = "packagedElement";
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
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		match.getToBeTranslatedEdges().add(interaction__line____lifeline);
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
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				_package__interaction____packagedElement);
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
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		return new Object[] { match, message, interaction, messageReceive,
				line, _package, message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				line__interaction____interaction,
				interaction__line____lifeline,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				_package__interaction____packagedElement };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_5_blackBBBBBB(
			Match match, Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		return new Object[] { match, message, interaction, messageReceive,
				line, _package };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_10_5_greenBB(
			Match match, ModalSequenceDiagram.Package _package) {
		match.getContextNodes().add(_package);
		return new Object[] { match, _package };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_10_6_expressionBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		_this.registerObjectsToMatch_BWD(match, message, interaction,
				messageReceive, line, _package);

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("message");
		EObject _localVariable_1 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("line");
		EObject _localVariable_5 = isApplicableMatch.getObject("_package");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("packageDeclarationToPackage");
		EObject tmpMessage = _localVariable_0;
		EObject tmpInteraction = _localVariable_1;
		EObject tmpMessageReceive = _localVariable_2;
		EObject tmpPackageDeclaration = _localVariable_3;
		EObject tmpLine = _localVariable_4;
		EObject tmp_package = _localVariable_5;
		EObject tmpPackageDeclarationToPackage = _localVariable_6;
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
					if (tmpPackageDeclaration instanceof PackageDeclaration) {
						PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
						if (tmpLine instanceof Lifeline) {
							Lifeline line = (Lifeline) tmpLine;
							if (tmp_package instanceof ModalSequenceDiagram.Package) {
								ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
								if (tmpPackageDeclarationToPackage instanceof PackageDeclarationToPackage) {
									PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) tmpPackageDeclarationToPackage;
									return new Object[] { message, interaction,
											messageReceive, packageDeclaration,
											line, _package,
											packageDeclarationToPackage,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_blackBBBBBBBFBB(
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { message, interaction, messageReceive,
						packageDeclaration, line, _package,
						packageDeclarationToPackage, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_bindingAndBlackFFFFFFFFBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding = pattern_UseCasePrecondToFoundMessageRule_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding != null) {
			Message message = (Message) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[0];
			Interaction interaction = (Interaction) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[1];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[3];
			Lifeline line = (Lifeline) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[4];
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[5];
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) result_pattern_UseCasePrecondToFoundMessageRule_11_1_binding[6];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_11_1_black = pattern_UseCasePrecondToFoundMessageRule_11_1_blackBBBBBBBFBB(
					message, interaction, messageReceive, packageDeclaration,
					line, _package, packageDeclarationToPackage, _this,
					isApplicableMatch);
			if (result_pattern_UseCasePrecondToFoundMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_11_1_black[7];

				return new Object[] { message, interaction, messageReceive,
						packageDeclaration, line, _package,
						packageDeclarationToPackage, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_1_greenFFBBFBBFFFB(
			Message message, Interaction interaction,
			PackageDeclaration packageDeclaration, Lifeline line, CSP csp) {
		UseCaseToMessage useCaseToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCaseToMessage();
		UseCase useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		BasicFlow basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();
		FlowToInteractionFragment basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("useCase", "preConditions");
		Object _localVariable_1 = csp.getValue("useCase", "name");
		Object _localVariable_2 = csp.getValue("actor", "type");
		Object _localVariable_3 = csp.getValue("actor", "name");
		useCaseToMessage.setTarget(message);
		useCaseToMessage.setSource(useCase);
		packageDeclaration.getUseCases().add(useCase);
		packageDeclaration.getActors().add(actor);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		useCase.getFlows().add(basicFlow);
		basicFlowToInteraction.setSource(basicFlow);
		basicFlowToInteraction.setTarget(interaction);
		String useCase_preConditions_prime = (String) _localVariable_0;
		String useCase_name_prime = (String) _localVariable_1;
		ActorType actor_type_prime = (ActorType) _localVariable_2;
		String actor_name_prime = (String) _localVariable_3;
		useCase.setPreConditions(useCase_preConditions_prime);
		useCase.setName(useCase_name_prime);
		actor.setType(actor_type_prime);
		actor.setName(actor_name_prime);
		return new Object[] { useCaseToMessage, useCase, message, interaction,
				actor, packageDeclaration, line, actorToLine, basicFlow,
				basicFlowToInteraction, csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_2_blackBBBBBBBBBB(
			UseCaseToMessage useCaseToMessage, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			Lifeline line, ActorToLifeline actorToLine, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		return new Object[] { useCaseToMessage, useCase, message, interaction,
				messageReceive, actor, line, actorToLine, basicFlow,
				basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_2_greenFBBBBBBBBBB(
			UseCaseToMessage useCaseToMessage, UseCase useCase,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Actor actor,
			Lifeline line, ActorToLifeline actorToLine, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(useCaseToMessage);
		ruleresult.getCreatedElements().add(useCase);
		ruleresult.getTranslatedElements().add(message);
		ruleresult.getTranslatedElements().add(interaction);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(actor);
		ruleresult.getTranslatedElements().add(line);
		ruleresult.getCreatedLinkElements().add(actorToLine);
		ruleresult.getCreatedElements().add(basicFlow);
		ruleresult.getCreatedLinkElements().add(basicFlowToInteraction);
		return new Object[] { ruleresult, useCaseToMessage, useCase, message,
				interaction, messageReceive, actor, line, actorToLine,
				basicFlow, basicFlowToInteraction };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject useCaseToMessage,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject packageDeclarationToPackage, EObject basicFlow,
			EObject basicFlowToInteraction) {
		if (!useCase.equals(useCaseToMessage)) {
			if (!message.equals(useCaseToMessage)) {
				if (!message.equals(useCase)) {
					if (!message.equals(messageReceive)) {
						if (!message.equals(packageDeclaration)) {
							if (!message.equals(packageDeclarationToPackage)) {
								if (!interaction.equals(useCaseToMessage)) {
									if (!interaction.equals(useCase)) {
										if (!interaction.equals(message)) {
											if (!interaction
													.equals(messageReceive)) {
												if (!interaction
														.equals(packageDeclaration)) {
													if (!interaction
															.equals(line)) {
														if (!interaction
																.equals(packageDeclarationToPackage)) {
															if (!messageReceive
																	.equals(useCaseToMessage)) {
																if (!messageReceive
																		.equals(useCase)) {
																	if (!messageReceive
																			.equals(packageDeclaration)) {
																		if (!messageReceive
																				.equals(packageDeclarationToPackage)) {
																			if (!actor
																					.equals(useCaseToMessage)) {
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
																													.equals(packageDeclarationToPackage)) {
																												if (!actor
																														.equals(basicFlow)) {
																													if (!actor
																															.equals(basicFlowToInteraction)) {
																														if (!packageDeclaration
																																.equals(useCaseToMessage)) {
																															if (!packageDeclaration
																																	.equals(useCase)) {
																																if (!packageDeclaration
																																		.equals(packageDeclarationToPackage)) {
																																	if (!line
																																			.equals(useCaseToMessage)) {
																																		if (!line
																																				.equals(useCase)) {
																																			if (!line
																																					.equals(message)) {
																																				if (!line
																																						.equals(messageReceive)) {
																																					if (!line
																																							.equals(packageDeclaration)) {
																																						if (!line
																																								.equals(packageDeclarationToPackage)) {
																																							if (!actorToLine
																																									.equals(useCaseToMessage)) {
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
																																																.equals(packageDeclarationToPackage)) {
																																															if (!actorToLine
																																																	.equals(basicFlow)) {
																																																if (!actorToLine
																																																		.equals(basicFlowToInteraction)) {
																																																	if (!_package
																																																			.equals(useCaseToMessage)) {
																																																		if (!_package
																																																				.equals(useCase)) {
																																																			if (!_package
																																																					.equals(message)) {
																																																				if (!_package
																																																						.equals(interaction)) {
																																																					if (!_package
																																																							.equals(messageReceive)) {
																																																						if (!_package
																																																								.equals(actor)) {
																																																							if (!_package
																																																									.equals(packageDeclaration)) {
																																																								if (!_package
																																																										.equals(line)) {
																																																									if (!_package
																																																											.equals(actorToLine)) {
																																																										if (!_package
																																																												.equals(packageDeclarationToPackage)) {
																																																											if (!_package
																																																													.equals(basicFlow)) {
																																																												if (!_package
																																																														.equals(basicFlowToInteraction)) {
																																																													if (!packageDeclarationToPackage
																																																															.equals(useCaseToMessage)) {
																																																														if (!packageDeclarationToPackage
																																																																.equals(useCase)) {
																																																															if (!basicFlow
																																																																	.equals(useCaseToMessage)) {
																																																																if (!basicFlow
																																																																		.equals(useCase)) {
																																																																	if (!basicFlow
																																																																			.equals(message)) {
																																																																		if (!basicFlow
																																																																				.equals(interaction)) {
																																																																			if (!basicFlow
																																																																					.equals(messageReceive)) {
																																																																				if (!basicFlow
																																																																						.equals(packageDeclaration)) {
																																																																					if (!basicFlow
																																																																							.equals(line)) {
																																																																						if (!basicFlow
																																																																								.equals(packageDeclarationToPackage)) {
																																																																							if (!basicFlow
																																																																									.equals(basicFlowToInteraction)) {
																																																																								if (!basicFlowToInteraction
																																																																										.equals(useCaseToMessage)) {
																																																																									if (!basicFlowToInteraction
																																																																											.equals(useCase)) {
																																																																										if (!basicFlowToInteraction
																																																																												.equals(message)) {
																																																																											if (!basicFlowToInteraction
																																																																													.equals(interaction)) {
																																																																												if (!basicFlowToInteraction
																																																																														.equals(messageReceive)) {
																																																																													if (!basicFlowToInteraction
																																																																															.equals(packageDeclaration)) {
																																																																														if (!basicFlowToInteraction
																																																																																.equals(line)) {
																																																																															if (!basicFlowToInteraction
																																																																																	.equals(packageDeclarationToPackage)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		useCaseToMessage,
																																																																																		useCase,
																																																																																		message,
																																																																																		interaction,
																																																																																		messageReceive,
																																																																																		actor,
																																																																																		packageDeclaration,
																																																																																		line,
																																																																																		actorToLine,
																																																																																		_package,
																																																																																		packageDeclarationToPackage,
																																																																																		basicFlow,
																																																																																		basicFlowToInteraction };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject useCaseToMessage,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject basicFlow, EObject basicFlowToInteraction) {
		EMoflonEdge useCaseToMessage__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToMessage__message____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__basicFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge basicFlowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UseCasePrecondToFoundMessageRule";
		String useCaseToMessage__useCase____source_name_prime = "source";
		String useCaseToMessage__message____target_name_prime = "target";
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
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		String useCase__basicFlow____flows_name_prime = "flows";
		String basicFlowToInteraction__basicFlow____source_name_prime = "source";
		String basicFlowToInteraction__interaction____target_name_prime = "target";
		useCaseToMessage__useCase____source.setSrc(useCaseToMessage);
		useCaseToMessage__useCase____source.setTrg(useCase);
		ruleresult.getCreatedEdges().add(useCaseToMessage__useCase____source);
		useCaseToMessage__message____target.setSrc(useCaseToMessage);
		useCaseToMessage__message____target.setTrg(message);
		ruleresult.getCreatedEdges().add(useCaseToMessage__message____target);
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
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		ruleresult.getTranslatedEdges().add(interaction__line____lifeline);
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
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		ruleresult.getCreatedEdges().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getCreatedEdges().add(packageDeclaration__actor____actors);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageReceive__line____covered);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		ruleresult.getCreatedEdges().add(actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		ruleresult.getCreatedEdges().add(actorToLine__line____target);
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				_package__interaction____packagedElement);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(useCase__basicFlow____flows);
		basicFlowToInteraction__basicFlow____source
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__basicFlow____source.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__basicFlow____source);
		basicFlowToInteraction__interaction____target
				.setSrc(basicFlowToInteraction);
		basicFlowToInteraction__interaction____target.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				basicFlowToInteraction__interaction____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCaseToMessage__useCase____source
				.setName(useCaseToMessage__useCase____source_name_prime);
		useCaseToMessage__message____target
				.setName(useCaseToMessage__message____target_name_prime);
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
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		basicFlowToInteraction__basicFlow____source
				.setName(basicFlowToInteraction__basicFlow____source_name_prime);
		basicFlowToInteraction__interaction____target
				.setName(basicFlowToInteraction__interaction____target_name_prime);
		return new Object[] { ruleresult, useCaseToMessage, useCase, message,
				interaction, messageReceive, actor, packageDeclaration, line,
				actorToLine, _package, basicFlow, basicFlowToInteraction,
				useCaseToMessage__useCase____source,
				useCaseToMessage__message____target,
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
				actorToLine__line____target,
				_package__interaction____packagedElement,
				useCase__basicFlow____flows,
				basicFlowToInteraction__basicFlow____source,
				basicFlowToInteraction__interaction____target };
	}

	public static final void pattern_UseCasePrecondToFoundMessageRule_11_5_expressionBBBBBBBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			PerformRuleResult ruleresult, EObject useCaseToMessage,
			EObject useCase, EObject message, EObject interaction,
			EObject messageReceive, EObject actor, EObject packageDeclaration,
			EObject line, EObject actorToLine, EObject _package,
			EObject packageDeclarationToPackage, EObject basicFlow,
			EObject basicFlowToInteraction) {
		_this.registerObjects_BWD(ruleresult, useCaseToMessage, useCase,
				message, interaction, messageReceive, actor,
				packageDeclaration, line, actorToLine, _package,
				packageDeclarationToPackage, basicFlow, basicFlowToInteraction);

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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("message");
		EObject _localVariable_1 = match.getObject("interaction");
		EObject _localVariable_2 = match.getObject("messageReceive");
		EObject _localVariable_3 = match.getObject("line");
		EObject _localVariable_4 = match.getObject("_package");
		EObject tmpMessage = _localVariable_0;
		EObject tmpInteraction = _localVariable_1;
		EObject tmpMessageReceive = _localVariable_2;
		EObject tmpLine = _localVariable_3;
		EObject tmp_package = _localVariable_4;
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
					if (tmpLine instanceof Lifeline) {
						Lifeline line = (Lifeline) tmpLine;
						if (tmp_package instanceof ModalSequenceDiagram.Package) {
							ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
							return new Object[] { message, interaction,
									messageReceive, line, _package, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_12_2_blackBBBFBBFB(
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageDeclarationToPackage packageDeclarationToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(_package,
						PackageDeclarationToPackage.class, "target")) {
			PackageDeclaration packageDeclaration = packageDeclarationToPackage
					.getSource();
			if (packageDeclaration != null) {
				_result.add(new Object[] { message, interaction,
						messageReceive, packageDeclaration, line, _package,
						packageDeclarationToPackage, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_12_3_blackBBBBBBB(
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (messageReceive.equals(message.getReceiveEvent())) {
			if (interaction.equals(message.getInteraction())) {
				if (interaction.equals(line.getInteraction())) {
					if (interaction.equals(messageReceive
							.getEnclosingInteraction())) {
						if (message.equals(messageReceive.getMessage())) {
							if (line.getCoveredBy().contains(messageReceive)) {
								if (_package.getPackagedElement().contains(
										interaction)) {
									if (packageDeclaration
											.equals(packageDeclarationToPackage
													.getSource())) {
										if (_package
												.equals(packageDeclarationToPackage
														.getTarget())) {
											_result.add(new Object[] { message,
													interaction,
													messageReceive,
													packageDeclaration, line,
													_package,
													packageDeclarationToPackage });
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_3_greenBBBBBBBFFFFFFFFFFFFFF(
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
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
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _package__interaction____packagedElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage__packageDeclaration____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclarationToPackage___package____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String _package__interaction____packagedElement_name_prime = "packagedElement";
		String packageDeclarationToPackage__packageDeclaration____source_name_prime = "source";
		String packageDeclarationToPackage___package____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage);
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
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__line____covered);
		_package__interaction____packagedElement.setSrc(_package);
		_package__interaction____packagedElement.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				_package__interaction____packagedElement);
		packageDeclarationToPackage__packageDeclaration____source
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage__packageDeclaration____source
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage__packageDeclaration____source);
		packageDeclarationToPackage___package____target
				.setSrc(packageDeclarationToPackage);
		packageDeclarationToPackage___package____target.setTrg(_package);
		isApplicableMatch.getAllContextElements().add(
				packageDeclarationToPackage___package____target);
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
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		_package__interaction____packagedElement
				.setName(_package__interaction____packagedElement_name_prime);
		packageDeclarationToPackage__packageDeclaration____source
				.setName(packageDeclarationToPackage__packageDeclaration____source_name_prime);
		packageDeclarationToPackage___package____target
				.setName(packageDeclarationToPackage___package____target_name_prime);
		return new Object[] { message, interaction, messageReceive,
				packageDeclaration, line, _package,
				packageDeclarationToPackage, isApplicableMatch,
				message__messageReceive____receiveEvent,
				message__interaction____interaction,
				interaction__message____message,
				line__interaction____interaction,
				interaction__line____lifeline,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				_package__interaction____packagedElement,
				packageDeclarationToPackage__packageDeclaration____source,
				packageDeclarationToPackage___package____target };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_4_bindingFBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		CSP _localVariable_0 = _this
				.isApplicable_solveCsp_BWD(isApplicableMatch, message,
						interaction, messageReceive, packageDeclaration, line,
						_package, packageDeclarationToPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, message,
					interaction, messageReceive, packageDeclaration, line,
					_package, packageDeclarationToPackage };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_12_4_bindingAndBlackFBBBBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch, Message message,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive,
			PackageDeclaration packageDeclaration, Lifeline line,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_12_4_binding = pattern_UseCasePrecondToFoundMessageRule_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, message, interaction, messageReceive,
				packageDeclaration, line, _package, packageDeclarationToPackage);
		if (result_pattern_UseCasePrecondToFoundMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_12_4_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_12_4_black = pattern_UseCasePrecondToFoundMessageRule_12_4_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, message,
						interaction, messageReceive, packageDeclaration, line,
						_package, packageDeclarationToPackage };
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
			if (__performOperationname.equals("isApplicable_BWD")) {
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
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_558914 = message.getSendEvent();
		if (__DEC_message_sendEvent_558914 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_558914)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_821554 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_821554)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_621839 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_621839 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_621839)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_20_2_blackFFFFFB(
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
								if (pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_3BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_20_2_black_nac_2B(interaction) == null) {
												for (Lifeline line : messageReceive
														.getCovered()) {
													if (interaction.equals(line
															.getInteraction())) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_20_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_20_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
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
		MessageEnd __DEC_message_sendEvent_714903 = message.getSendEvent();
		if (__DEC_message_sendEvent_714903 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_714903)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_784936 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_784936)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_307335 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_307335 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_307335)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_21_2_blackFFFFFB(
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
								if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_2B(interaction) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_0BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_1BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_21_2_black_nac_3BB(
													message, messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageReceive)) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_21_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
		MessageEnd __DEC_message_sendEvent_239187 = message.getSendEvent();
		if (__DEC_message_sendEvent_239187 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_239187)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_177886 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_177886)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_76134 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_76134 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_76134)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_22_2_blackFFFFFB(
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
								if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_2B(interaction) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_0BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_1BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_22_2_black_nac_3BB(
													message, messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageReceive)) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_22_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
		MessageEnd __DEC_message_sendEvent_344970 = message.getSendEvent();
		if (__DEC_message_sendEvent_344970 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_344970)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_76461 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_76461)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_842782 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_842782 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_842782)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_23_2_blackFFFFFB(
			EMoflonEdge _edge_interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_interaction.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpInteraction = _edge_interaction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(line.getInteraction())) {
					if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_2B(interaction) == null) {
						for (InteractionFragment tmpMessageReceive : line
								.getCoveredBy()) {
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (interaction.equals(messageReceive
										.getEnclosingInteraction())) {
									Message message = messageReceive
											.getMessage();
									if (message != null) {
										if (messageReceive.equals(message
												.getReceiveEvent())) {
											if (interaction.equals(message
													.getInteraction())) {
												if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_0BB(
														message, messageReceive) == null) {
													if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_1BB(
															message,
															messageReceive) == null) {
														if (pattern_UseCasePrecondToFoundMessageRule_23_2_black_nac_3BB(
																message,
																messageReceive) == null) {
															for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			interaction,
																			ModalSequenceDiagram.Package.class,
																			"packagedElement")) {
																_result.add(new Object[] {
																		message,
																		interaction,
																		messageReceive,
																		line,
																		_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_23_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
		MessageEnd __DEC_message_sendEvent_450818 = message.getSendEvent();
		if (__DEC_message_sendEvent_450818 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_450818)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_571020 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_571020)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_91026 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_91026 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_91026)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_24_2_blackFFFFFB(
			EMoflonEdge _edge_lifeline) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_lifeline.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpLine = _edge_lifeline.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (interaction.equals(line.getInteraction())) {
					if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_2B(interaction) == null) {
						for (Message message : interaction.getMessage()) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (interaction.equals(messageReceive
										.getEnclosingInteraction())) {
									if (message.equals(messageReceive
											.getMessage())) {
										if (line.getCoveredBy().contains(
												messageReceive)) {
											if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_0BB(
													message, messageReceive) == null) {
												if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_1BB(
														message, messageReceive) == null) {
													if (pattern_UseCasePrecondToFoundMessageRule_24_2_black_nac_3BB(
															message,
															messageReceive) == null) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
																	_edge_lifeline });
														}
													}
												}
											}
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_24_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
		MessageEnd __DEC_message_sendEvent_130589 = message.getSendEvent();
		if (__DEC_message_sendEvent_130589 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_130589)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_317468 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_317468)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_958832 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_958832 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_958832)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_25_2_blackFFFFFB(
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
								if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_2B(interaction) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_0BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_1BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_25_2_black_nac_3BB(
													message, messageReceive) == null) {
												for (Lifeline line : messageReceive
														.getCovered()) {
													if (interaction.equals(line
															.getInteraction())) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_25_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
		MessageEnd __DEC_message_sendEvent_470398 = message.getSendEvent();
		if (__DEC_message_sendEvent_470398 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_470398)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_859320 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_859320)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_540010 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_540010 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_540010)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_26_2_blackFFFFFB(
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
								if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_2B(interaction) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_0BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_1BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_26_2_black_nac_3BB(
													message, messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageReceive)) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_26_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
		MessageEnd __DEC_message_sendEvent_289662 = message.getSendEvent();
		if (__DEC_message_sendEvent_289662 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_289662)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_708866 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_708866)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_171980 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_171980 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_171980)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_27_2_blackFFFFFB(
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
								if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_0BB(
										message, messageReceive) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_1BB(
											message, messageReceive) == null) {
										if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_3BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_27_2_black_nac_2B(interaction) == null) {
												for (Lifeline line : messageReceive
														.getCovered()) {
													if (interaction.equals(line
															.getInteraction())) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_27_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
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
			if (__performOperationname.equals("isApplicable_FWD")) {
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
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_933250 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_933250)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_1BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_425698 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_425698)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_28_2_blackFFFFB(
			EMoflonEdge _edge_useCases) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_useCases.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpUseCase = _edge_useCases.getTrg();
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (packageDeclaration.getUseCases().contains(useCase)) {
					if (pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_0BB(
							useCase, packageDeclaration) == null) {
						for (Actor actor : packageDeclaration.getActors()) {
							if (pattern_UseCasePrecondToFoundMessageRule_28_2_black_nac_1BB(
									actor, packageDeclaration) == null) {
								for (Flow tmpBasicFlow : useCase.getFlows()) {
									if (tmpBasicFlow instanceof BasicFlow) {
										BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
										_result.add(new Object[] { useCase,
												actor, packageDeclaration,
												basicFlow, _edge_useCases });
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
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, useCase,
				actor, packageDeclaration, basicFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_28_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_29_1_binding = pattern_UseCasePrecondToFoundMessageRule_29_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_29_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_29_1_black = pattern_UseCasePrecondToFoundMessageRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_953791 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_953791)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_2_black_nac_1BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_696850 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_696850)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_29_2_blackFFFFB(
			EMoflonEdge _edge_actors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_actors.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpActor = _edge_actors.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (packageDeclaration.getActors().contains(actor)) {
					if (pattern_UseCasePrecondToFoundMessageRule_29_2_black_nac_1BB(
							actor, packageDeclaration) == null) {
						for (UseCase useCase : packageDeclaration.getUseCases()) {
							if (pattern_UseCasePrecondToFoundMessageRule_29_2_black_nac_0BB(
									useCase, packageDeclaration) == null) {
								for (Flow tmpBasicFlow : useCase.getFlows()) {
									if (tmpBasicFlow instanceof BasicFlow) {
										BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
										_result.add(new Object[] { useCase,
												actor, packageDeclaration,
												basicFlow, _edge_actors });
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_29_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, useCase,
				actor, packageDeclaration, basicFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_29_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_30_1_binding = pattern_UseCasePrecondToFoundMessageRule_30_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_30_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_30_1_black = pattern_UseCasePrecondToFoundMessageRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_65966 = message.getSendEvent();
		if (__DEC_message_sendEvent_65966 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_65966)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_173858 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_173858)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_591769 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_591769 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_591769)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_30_2_blackFFFFFB(
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
										if (pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_2B(interaction) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_0BB(
													message, messageReceive) == null) {
												if (pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_1BB(
														message, messageReceive) == null) {
													if (pattern_UseCasePrecondToFoundMessageRule_30_2_black_nac_3BB(
															message,
															messageReceive) == null) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_30_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_30_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_31_1_binding = pattern_UseCasePrecondToFoundMessageRule_31_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_31_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_31_1_black = pattern_UseCasePrecondToFoundMessageRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_288713 = message.getSendEvent();
		if (__DEC_message_sendEvent_288713 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_288713)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_579108 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_579108)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_357021 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_357021 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_357021)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_31_2_blackFFFFFB(
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
										if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_2B(interaction) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_0BB(
													message, messageReceive) == null) {
												if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_1BB(
														message, messageReceive) == null) {
													if (pattern_UseCasePrecondToFoundMessageRule_31_2_black_nac_3BB(
															message,
															messageReceive) == null) {
														for (ModalSequenceDiagram.Package _package : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		ModalSequenceDiagram.Package.class,
																		"packagedElement")) {
															_result.add(new Object[] {
																	message,
																	interaction,
																	messageReceive,
																	line,
																	_package,
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

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_31_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_31_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_32_1_binding = pattern_UseCasePrecondToFoundMessageRule_32_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_32_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_32_1_black = pattern_UseCasePrecondToFoundMessageRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_0BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		MessageEnd __DEC_message_sendEvent_146168 = message.getSendEvent();
		if (__DEC_message_sendEvent_146168 != null) {
			if (!messageReceive.equals(__DEC_message_sendEvent_146168)) {
				return new Object[] { message, messageReceive };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		for (MessageEnd __DEC_message_message_543255 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(message, MessageEnd.class, "message")) {
			if (!messageReceive.equals(__DEC_message_message_543255)) {
				return new Object[] { message, messageReceive };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_2B(
			Interaction interaction) {
		Interaction __DEC_interaction_enclosingInteraction_469654 = interaction
				.getEnclosingInteraction();
		if (__DEC_interaction_enclosingInteraction_469654 != null) {
			if (!interaction
					.equals(__DEC_interaction_enclosingInteraction_469654)) {
				return new Object[] { interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_3BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_32_2_blackFFFFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmp_package = _edge_packagedElement.getSrc();
		if (tmp_package instanceof ModalSequenceDiagram.Package) {
			ModalSequenceDiagram.Package _package = (ModalSequenceDiagram.Package) tmp_package;
			EObject tmpInteraction = _edge_packagedElement.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (_package.getPackagedElement().contains(interaction)) {
					if (pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_2B(interaction) == null) {
						for (Message message : interaction.getMessage()) {
							MessageEnd tmpMessageReceive = message
									.getReceiveEvent();
							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
								if (interaction.equals(messageReceive
										.getEnclosingInteraction())) {
									if (message.equals(messageReceive
											.getMessage())) {
										if (pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_0BB(
												message, messageReceive) == null) {
											if (pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_1BB(
													message, messageReceive) == null) {
												if (pattern_UseCasePrecondToFoundMessageRule_32_2_black_nac_3BB(
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
																	_package,
																	_edge_packagedElement });
														}
													}
												}
											}
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_32_3_expressionFBBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			Message message, Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Lifeline line,
			ModalSequenceDiagram.Package _package) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, message,
				interaction, messageReceive, line, _package);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_32_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_1_bindingFB(
			UseCasePrecondToFoundMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_1_blackFBB(
			EClass __eClass, UseCasePrecondToFoundMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_1_bindingAndBlackFFB(
			UseCasePrecondToFoundMessageRule _this) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_33_1_binding = pattern_UseCasePrecondToFoundMessageRule_33_1_bindingFB(_this);
		if (result_pattern_UseCasePrecondToFoundMessageRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UseCasePrecondToFoundMessageRule_33_1_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_33_1_black = pattern_UseCasePrecondToFoundMessageRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UseCasePrecondToFoundMessageRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UseCasePrecondToFoundMessageRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_131275 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_131275)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_2_black_nac_1BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_133573 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_133573)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_33_2_blackFFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpBasicFlow = _edge_flows.getTrg();
			if (tmpBasicFlow instanceof BasicFlow) {
				BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
				if (useCase.getFlows().contains(basicFlow)) {
					for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(useCase,
									PackageDeclaration.class, "useCases")) {
						if (pattern_UseCasePrecondToFoundMessageRule_33_2_black_nac_0BB(
								useCase, packageDeclaration) == null) {
							for (Actor actor : packageDeclaration.getActors()) {
								if (pattern_UseCasePrecondToFoundMessageRule_33_2_black_nac_1BB(
										actor, packageDeclaration) == null) {
									_result.add(new Object[] { useCase, actor,
											packageDeclaration, basicFlow,
											_edge_flows });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_33_3_expressionFBBBBBB(
			UseCasePrecondToFoundMessageRule _this, Match match,
			UseCase useCase, Actor actor,
			PackageDeclaration packageDeclaration, BasicFlow basicFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, useCase,
				actor, packageDeclaration, basicFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_33_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UseCasePrecondToFoundMessageRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_1_blackB(
			UseCasePrecondToFoundMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		if (ruleResult.getCorrObjects().contains(packageDeclarationToPackage)) {
			return new Object[] { ruleResult, packageDeclarationToPackage };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			ModalSequenceDiagram.Package _package) {
		if (ruleResult.getTargetObjects().contains(_package)) {
			return new Object[] { ruleResult, _package };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UseCasePrecondToFoundMessageRule_36_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList packageDeclarationToPackageList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpPackageDeclarationToPackage : packageDeclarationToPackageList
					.getEntryObjects()) {
				if (tmpPackageDeclarationToPackage instanceof PackageDeclarationToPackage) {
					PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) tmpPackageDeclarationToPackage;
					PackageDeclaration packageDeclaration = packageDeclarationToPackage
							.getSource();
					if (packageDeclaration != null) {
						ModalSequenceDiagram.Package _package = packageDeclarationToPackage
								.getTarget();
						if (_package != null) {
							if (pattern_UseCasePrecondToFoundMessageRule_36_2_black_nac_1BB(
									ruleResult, packageDeclarationToPackage) == null) {
								if (pattern_UseCasePrecondToFoundMessageRule_36_2_black_nac_0BB(
										ruleResult, packageDeclaration) == null) {
									if (pattern_UseCasePrecondToFoundMessageRule_36_2_black_nac_2BB(
											ruleResult, _package) == null) {
										_result.add(new Object[] {
												packageDeclarationToPackageList,
												packageDeclaration,
												packageDeclarationToPackage,
												_package, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_3_bindingFBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					packageDeclaration, _package, packageDeclarationToPackage,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_3_bindingAndBlackFBBBBBB(
			UseCasePrecondToFoundMessageRule _this,
			IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UseCasePrecondToFoundMessageRule_36_3_binding = pattern_UseCasePrecondToFoundMessageRule_36_3_bindingFBBBBBB(
				_this, isApplicableMatch, packageDeclaration, _package,
				packageDeclarationToPackage, ruleResult);
		if (result_pattern_UseCasePrecondToFoundMessageRule_36_3_binding != null) {
			CSP csp = (CSP) result_pattern_UseCasePrecondToFoundMessageRule_36_3_binding[0];

			Object[] result_pattern_UseCasePrecondToFoundMessageRule_36_3_black = pattern_UseCasePrecondToFoundMessageRule_36_3_blackB(csp);
			if (result_pattern_UseCasePrecondToFoundMessageRule_36_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						packageDeclaration, _package,
						packageDeclarationToPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UseCasePrecondToFoundMessageRule_36_4_expressionFBB(
			UseCasePrecondToFoundMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_5_blackBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage) {
		return new Object[] { packageDeclaration, _package,
				packageDeclarationToPackage };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_6_blackBBBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { packageDeclaration, _package,
				packageDeclarationToPackage, ruleResult };
	}

	public static final Object[] pattern_UseCasePrecondToFoundMessageRule_36_6_greenFFFFFFBFFBFFBB(
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		UseCaseToMessage useCaseToMessage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createUseCaseToMessage();
		UseCase useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		Interaction interaction = ModalSequenceDiagramFactory.eINSTANCE
				.createInteraction();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		Lifeline line = ModalSequenceDiagramFactory.eINSTANCE.createLifeline();
		ActorToLifeline actorToLine = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createActorToLifeline();
		BasicFlow basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();
		FlowToInteractionFragment basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("useCase", "preConditions");
		Object _localVariable_1 = csp.getValue("useCase", "name");
		Object _localVariable_2 = csp.getValue("message", "name");
		Object _localVariable_3 = csp.getValue("message", "messageKind");
		Object _localVariable_4 = csp.getValue("message", "messageSort");
		Object _localVariable_5 = csp.getValue("interaction", "name");
		Object _localVariable_6 = csp.getValue("actor", "type");
		Object _localVariable_7 = csp.getValue("actor", "name");
		Object _localVariable_8 = csp.getValue("line", "name");
		int _localVariable_9 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		ruleResult.getCorrObjects().add(useCaseToMessage);
		useCaseToMessage.setSource(useCase);
		packageDeclaration.getUseCases().add(useCase);
		ruleResult.getSourceObjects().add(useCase);
		useCaseToMessage.setTarget(message);
		ruleResult.getTargetObjects().add(message);
		message.setInteraction(interaction);
		_package.getPackagedElement().add(interaction);
		ruleResult.getTargetObjects().add(interaction);
		message.setReceiveEvent(messageReceive);
		messageReceive.setEnclosingInteraction(interaction);
		messageReceive.setMessage(message);
		ruleResult.getTargetObjects().add(messageReceive);
		packageDeclaration.getActors().add(actor);
		ruleResult.getSourceObjects().add(actor);
		line.setInteraction(interaction);
		line.getCoveredBy().add(messageReceive);
		ruleResult.getTargetObjects().add(line);
		actorToLine.setSource(actor);
		actorToLine.setTarget(line);
		ruleResult.getCorrObjects().add(actorToLine);
		useCase.getFlows().add(basicFlow);
		ruleResult.getSourceObjects().add(basicFlow);
		basicFlowToInteraction.setSource(basicFlow);
		basicFlowToInteraction.setTarget(interaction);
		ruleResult.getCorrObjects().add(basicFlowToInteraction);
		String useCase_preConditions_prime = (String) _localVariable_0;
		String useCase_name_prime = (String) _localVariable_1;
		String message_name_prime = (String) _localVariable_2;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_3;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_4;
		String interaction_name_prime = (String) _localVariable_5;
		ActorType actor_type_prime = (ActorType) _localVariable_6;
		String actor_name_prime = (String) _localVariable_7;
		String line_name_prime = (String) _localVariable_8;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_9);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		useCase.setPreConditions(useCase_preConditions_prime);
		useCase.setName(useCase_name_prime);
		message.setName(message_name_prime);
		message.setMessageKind(message_messageKind_prime);
		message.setMessageSort(message_messageSort_prime);
		interaction.setName(interaction_name_prime);
		actor.setType(actor_type_prime);
		actor.setName(actor_name_prime);
		line.setName(line_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { useCaseToMessage, useCase, message, interaction,
				messageReceive, actor, packageDeclaration, line, actorToLine,
				_package, basicFlow, basicFlowToInteraction, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UseCasePrecondToFoundMessageRule_36_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCasePrecondToFoundMessageRuleImpl
