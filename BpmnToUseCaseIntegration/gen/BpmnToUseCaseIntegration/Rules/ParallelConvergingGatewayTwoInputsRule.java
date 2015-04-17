/**
 */
package BpmnToUseCaseIntegration.Rules;

import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;

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

import UseCaseDSL.Flow;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;

import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Converging Gateway Two Inputs Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage#getParallelConvergingGatewayTwoInputsRule()
 * @model
 * @generated
 */
public interface ParallelConvergingGatewayTwoInputsRule extends AbstractRule,
		ParallelConvergingGatewayRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow);

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
	void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow);

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
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject process,
			EObject inFlow1, EObject parallelConvGateway,
			EObject parallelGateway, EObject divergeFlow1, EObject flow1,
			EObject inFlow1ToFlow1, EObject step1, EObject inFlow1ToStep1,
			EObject parallelStep, EObject divergeFlow1ToFlow1, EObject inFlow,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject divergeFlow, EObject divergeFlowToFlow);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_110(
			EMoflonEdge _edge_targetRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_111(
			EMoflonEdge _edge_incoming);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_112(
			EMoflonEdge _edge_flowElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_113(
			EMoflonEdge _edge_targetRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_114(
			EMoflonEdge _edge_incoming);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_115(
			EMoflonEdge _edge_sourceRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_116(
			EMoflonEdge _edge_outgoing);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_117(
			EMoflonEdge _edge_flowNodeRefs);

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
	ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlow1ToFlow1Parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParallelConvergingGatewayTwoInputsRule
