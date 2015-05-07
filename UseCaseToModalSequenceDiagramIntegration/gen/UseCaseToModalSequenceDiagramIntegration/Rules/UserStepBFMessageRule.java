/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules;

import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageOccurrenceSpecification;

import TGGLanguage.csp.CSP;

import TGGLanguage.modelgenerator.RuleEntryContainer;

import TGGRuntime.AbstractRule;
import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TripleMatch;

import UseCaseDSL.Actor;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Step BF Message Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage#getUserStepBFMessageRule()
 * @model
 * @generated
 */
public interface UserStepBFMessageRule extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			NormalStep step, UseCase useCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			NormalStep step, UseCase useCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			NormalStep step, UseCase useCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject actor,
			EObject sysActor, EObject packageDeclaration, EObject sysLine,
			EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject actor,
			EObject sysActor, EObject packageDeclaration, EObject sysLine,
			EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_360(
			EMoflonEdge _edge_coveredBy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_361(EMoflonEdge _edge_covered);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_362(
			EMoflonEdge _edge_enclosingInteraction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_363(
			EMoflonEdge _edge_fragment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_364(
			EMoflonEdge _edge_enclosingInteraction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_365(
			EMoflonEdge _edge_fragment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_366(
			EMoflonEdge _edge_sendEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_367(
			EMoflonEdge _edge_receiveEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_368(EMoflonEdge _edge_message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_369(EMoflonEdge _edge_message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_370(
			EMoflonEdge _edge_coveredBy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_371(EMoflonEdge _edge_covered);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_372(
			EMoflonEdge _edge_interaction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_373(EMoflonEdge _edge_message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_506(EMoflonEdge _edge_steps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_507(EMoflonEdge _edge_actor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RuleResult checkAttributes_FWD(TripleMatch tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RuleResult checkAttributes_BWD(TripleMatch tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			ActorToLifeline sysActorToSysLineParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UserStepBFMessageRule
