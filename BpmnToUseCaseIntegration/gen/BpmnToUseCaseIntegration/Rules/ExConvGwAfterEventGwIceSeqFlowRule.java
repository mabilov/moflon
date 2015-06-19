/**
 */
package BpmnToUseCaseIntegration.Rules;

import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;
import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
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

import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;

import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.IntermediateCatchEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.SequenceFlow;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex Conv Gw After Event Gw Ice Seq Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage#getExConvGwAfterEventGwIceSeqFlowRule()
 * @model
 * @generated
 */
public interface ExConvGwAfterEventGwIceSeqFlowRule extends EObject,
		AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet);

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
	void registerObjectsToMatch_FWD(Match match, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet);

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
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject ice,
			EObject inFlow, EObject process, EObject eventGw,
			EObject divergeFlow, EObject normalStep,
			EObject eventGwToNormalStep, EObject alt, EObject divergeFlowToAlt,
			EObject flow, EObject iceToFlow, EObject exConvGateway,
			EObject outFlow, EObject inFlowToFlow, EObject ecgwToStep,
			EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane, EObject laneSet);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_312(
			EMoflonEdge _edge_flowElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_313(
			EMoflonEdge _edge_flowElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_314(
			EMoflonEdge _edge_targetRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_315(
			EMoflonEdge _edge_incoming);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_316(
			EMoflonEdge _edge_sourceRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_317(
			EMoflonEdge _edge_outgoing);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_318(
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
			FlowNodeToStep eventGwToNormalStepParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet,
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
} // ExConvGwAfterEventGwIceSeqFlowRule
