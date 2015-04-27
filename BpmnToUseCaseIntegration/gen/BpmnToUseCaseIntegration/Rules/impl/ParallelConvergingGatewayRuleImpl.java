/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;

import BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;

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

import UseCaseDSL.Flow;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.GatewayDirection;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;

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
 * An implementation of the model object '<em><b>Parallel Converging Gateway Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelConvergingGatewayRuleImpl extends AbstractRuleImpl
		implements ParallelConvergingGatewayRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelConvergingGatewayRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelConvergingGatewayRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow) {
		// initial bindings
		Object[] result1_black = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_0_1_blackBBBBBBBBBB(
						this, match, process, inFlow, parallelConvGateway,
						outFlow, lane, laneSet, parallelGateway, divergeFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_0_2_bindingAndBlackFBBBBBBBBBB(
						this, match, process, inFlow, parallelConvGateway,
						outFlow, lane, laneSet, parallelGateway, divergeFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_4_blackBBBBBBBBB(
							match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_4_greenBBBBBBFFFFFFF(
							match, process, inFlow, parallelConvGateway,
							outFlow, lane);
			// EMoflonEdge process__parallelConvGateway____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow__parallelConvGateway____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge parallelConvGateway__inFlow____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__parallelConvGateway____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge parallelConvGateway__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge lane__parallelConvGateway____flowNodeRefs = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_5_blackBBBBBBBBB(
							match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_5_greenBBBBBBBFFFFFFF(
							match, process, inFlow, lane, laneSet,
							parallelGateway, divergeFlow);
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[8];
			// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result5_green[9];
			// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result5_green[10];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[11];
			// EMoflonEdge divergeFlow__parallelGateway____sourceRef = (EMoflonEdge) result5_green[12];
			// EMoflonEdge parallelGateway__divergeFlow____outgoing = (EMoflonEdge) result5_green[13];

			// register objects to match
			ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_6_expressionBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow);
			return ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_7_expressionF();
		} else {
			return ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[1];
		ParallelGateway parallelConvGateway = (ParallelGateway) result1_bindingAndBlack[2];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[3];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[4];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[5];
		Step step = (Step) result1_bindingAndBlack[6];
		SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result1_bindingAndBlack[7];
		Flow initFlow = (Flow) result1_bindingAndBlack[8];
		ParallelStep parallelStep = (ParallelStep) result1_bindingAndBlack[9];
		Lane lane = (Lane) result1_bindingAndBlack[10];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[11];
		ParallelGateway parallelGateway = (ParallelGateway) result1_bindingAndBlack[12];
		FlowNodeToStep pgwToParallelStep = (FlowNodeToStep) result1_bindingAndBlack[13];
		SequenceFlow divergeFlow = (SequenceFlow) result1_bindingAndBlack[14];
		SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[15];
		// CSP csp = (CSP) result1_bindingAndBlack[16];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_1_greenBBBBFFF(
						parallelConvGateway, outFlow, initFlow, parallelStep);
		FlowNodeToStep pcgwToParStep = (FlowNodeToStep) result1_green[4];
		SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result1_green[5];
		SequenceFlowToStep outFlowToParallelStep = (SequenceFlowToStep) result1_green[6];

		// collect translated elements
		Object[] result2_black = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_2_blackBBBBB(
						parallelConvGateway, outFlow, pcgwToParStep,
						outFlowToInitFlow, outFlowToParallelStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_2_greenFBBBBB(
						parallelConvGateway, outFlow, pcgwToParStep,
						outFlowToInitFlow, outFlowToParallelStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_3_blackBBBBBBBBBBBBBBBBBBBB(
						ruleresult, process, inFlow, parallelConvGateway,
						outFlow, flow, inFlowToFlow, step, inFlowToStep,
						initFlow, parallelStep, pcgwToParStep,
						outFlowToInitFlow, outFlowToParallelStep, lane,
						laneSet, parallelGateway, pgwToParallelStep,
						divergeFlow, divergeFlowToFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
						ruleresult, process, inFlow, parallelConvGateway,
						outFlow, initFlow, parallelStep, pcgwToParStep,
						outFlowToInitFlow, outFlowToParallelStep, lane);
		// EMoflonEdge process__parallelConvGateway____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__parallelConvGateway____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge parallelConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlow__parallelConvGateway____sourceRef = (EMoflonEdge) result3_green[15];
		// EMoflonEdge parallelConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[16];
		// EMoflonEdge pcgwToParStep__parallelConvGateway____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge pcgwToParStep__parallelStep____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlowToInitFlow__outFlow____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge outFlowToInitFlow__initFlow____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToParallelStep__outFlow____source = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge lane__parallelConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, process, inFlow, parallelConvGateway,
						outFlow, flow, inFlowToFlow, step, inFlowToStep,
						initFlow, parallelStep, pcgwToParStep,
						outFlowToInitFlow, outFlowToParallelStep, lane,
						laneSet, parallelGateway, pgwToParallelStep,
						divergeFlow, divergeFlowToFlow);
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_2_2_bindingFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[1];
		ParallelGateway parallelConvGateway = (ParallelGateway) result2_binding[2];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[3];
		Lane lane = (Lane) result2_binding[4];
		LaneSet laneSet = (LaneSet) result2_binding[5];
		ParallelGateway parallelGateway = (ParallelGateway) result2_binding[6];
		SequenceFlow divergeFlow = (SequenceFlow) result2_binding[7];
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_2_2_blackBBBBFFFFFBBBFBFB(
						process, inFlow, parallelConvGateway, outFlow, lane,
						laneSet, parallelGateway, divergeFlow, match)) {
			ParallelFlow flow = (ParallelFlow) result2_black[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			Step step = (Step) result2_black[6];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[7];
			ParallelStep parallelStep = (ParallelStep) result2_black[8];
			FlowNodeToStep pgwToParallelStep = (FlowNodeToStep) result2_black[12];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result2_black[14];
			// ForEach find context
			for (Object[] result3_black : ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_2_3_blackBBBBBBBBFBBBBBBB(
							process, inFlow, parallelConvGateway, outFlow,
							flow, inFlowToFlow, step, inFlowToStep,
							parallelStep, lane, laneSet, parallelGateway,
							pgwToParallelStep, divergeFlow, divergeFlowToFlow)) {
				Flow initFlow = (Flow) result3_black[8];
				Object[] result3_green = ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_2_3_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFF(
								process, inFlow, parallelConvGateway, outFlow,
								flow, inFlowToFlow, step, inFlowToStep,
								initFlow, parallelStep, lane, laneSet,
								parallelGateway, pgwToParallelStep,
								divergeFlow, divergeFlowToFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__parallelConvGateway____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge inFlow__parallelConvGateway____targetRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge parallelConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[24];
				// EMoflonEdge outFlow__parallelConvGateway____sourceRef = (EMoflonEdge) result3_green[25];
				// EMoflonEdge parallelConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[26];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[27];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[28];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[29];
				// EMoflonEdge inFlowToStep__inFlow____source = (EMoflonEdge) result3_green[30];
				// EMoflonEdge inFlowToStep__step____target = (EMoflonEdge) result3_green[31];
				// EMoflonEdge initFlow__parallelStep____steps = (EMoflonEdge) result3_green[32];
				// EMoflonEdge parallelStep__flow____invokedFlows = (EMoflonEdge) result3_green[33];
				// EMoflonEdge lane__parallelConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[34];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[35];
				// EMoflonEdge divergeFlow__parallelGateway____sourceRef = (EMoflonEdge) result3_green[36];
				// EMoflonEdge parallelGateway__divergeFlow____outgoing = (EMoflonEdge) result3_green[37];
				// EMoflonEdge pgwToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[38];
				// EMoflonEdge pgwToParallelStep__parallelGateway____source = (EMoflonEdge) result3_green[39];
				// EMoflonEdge divergeFlowToFlow__divergeFlow____source = (EMoflonEdge) result3_green[40];
				// EMoflonEdge divergeFlowToFlow__flow____target = (EMoflonEdge) result3_green[41];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, process, inFlow,
								parallelConvGateway, outFlow, flow,
								inFlowToFlow, step, inFlowToStep, initFlow,
								parallelStep, lane, laneSet, parallelGateway,
								pgwToParallelStep, divergeFlow,
								divergeFlowToFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("parallelConvGateway", parallelConvGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("divergeFlow", divergeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");
		literal1.setType("");

		// Create attribute variables
		Variable var_parallelConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelConvGateway.gatewayDirection", true,
						csp);
		var_parallelConvGateway_gatewayDirection.setValue(parallelConvGateway
				.getGatewayDirection());
		var_parallelConvGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_parallelConvGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_parallelGateway_gatewayDirection,
				literal1);
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
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("parallelConvGateway",
				parallelConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch
				.registerObject("pgwToParallelStep", pgwToParallelStep);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
			EObject process, EObject inFlow, EObject parallelConvGateway,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject parallelStep,
			EObject pcgwToParStep, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject parallelGateway, EObject pgwToParallelStep,
			EObject divergeFlow, EObject divergeFlowToFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelConvGateway", parallelConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("pcgwToParStep", pcgwToParStep);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToParallelStep",
				outFlowToParallelStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("pgwToParallelStep", pgwToParallelStep);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("divergeFlowToFlow", divergeFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("parallelConvGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getParallelGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_44(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_10_2_blackFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_10_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_10_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_10_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_10_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_11_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_11_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_11_2_blackFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_11_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_11_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_11_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_11_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_11_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_11_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_46(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_12_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_12_2_blackFFFFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_12_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_12_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_12_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_12_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_12_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_12_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_47(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_13_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_13_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_13_2_blackFFFFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_13_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_13_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_13_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_13_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_13_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_13_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_48(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_14_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_14_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_14_2_blackFFFFFFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_14_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_14_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_14_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_14_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_14_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_14_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_49(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_15_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_15_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_15_2_blackFFFFFFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_15_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_15_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_15_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_15_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_15_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_15_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_50(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_16_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_16_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_16_2_blackFFFFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[6];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_16_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_16_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, parallelConvGateway,
							outFlow, lane, laneSet, parallelGateway,
							divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_16_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_16_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_16_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_16_6_expressionFB(__result);
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowParameter) {
		// create result
		Object[] result1_black = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_18_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_18_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_18_2_blackFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToFlowList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[3];
			ParallelFlow flow = (ParallelFlow) result2_black[4];
			Step step = (Step) result2_black[5];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[6];
			ParallelStep parallelStep = (ParallelStep) result2_black[7];
			Flow initFlow = (Flow) result2_black[8];
			FlowNodeToStep pgwToParallelStep = (FlowNodeToStep) result2_black[9];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[10];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[11];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result2_black[12];
			LaneSet laneSet = (LaneSet) result2_black[13];
			Lane lane = (Lane) result2_black[14];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_18_3_bindingAndBlackFBBBBBBBBBBBBBBBBB(
							this, isApplicableMatch, process, inFlow, flow,
							inFlowToFlow, step, inFlowToStep, initFlow,
							parallelStep, lane, laneSet, parallelGateway,
							pgwToParallelStep, divergeFlow, divergeFlowToFlow,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelConvergingGatewayRuleImpl
					.pattern_ParallelConvergingGatewayRule_18_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ParallelConvergingGatewayRuleImpl
						.pattern_ParallelConvergingGatewayRule_18_5_blackBBBBBBBBBBBBBB(
								step, process, inFlow, flow, inFlowToFlow,
								inFlowToStep, initFlow, parallelStep, lane,
								laneSet, parallelGateway, pgwToParallelStep,
								divergeFlow, divergeFlowToFlow);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_18_6_blackBBBBBBBBBBBBBBB(
									process, inFlow, flow, inFlowToFlow, step,
									inFlowToStep, initFlow, parallelStep, lane,
									laneSet, parallelGateway,
									pgwToParallelStep, divergeFlow,
									divergeFlowToFlow, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ParallelConvergingGatewayRuleImpl
							.pattern_ParallelConvergingGatewayRule_18_6_greenBBFFBBFFFBBB(
									process, inFlow, initFlow, parallelStep,
									lane, ruleResult, csp);
					// ParallelGateway parallelConvGateway = (ParallelGateway) result6_green[2];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[3];
					// FlowNodeToStep pcgwToParStep = (FlowNodeToStep) result6_green[6];
					// SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result6_green[7];
					// SequenceFlowToStep outFlowToParallelStep = (SequenceFlowToStep) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayRuleImpl
				.pattern_ParallelConvergingGatewayRule_18_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");
		literal1.setType("");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_parallelConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelConvGateway.gatewayDirection", csp);
		var_parallelConvGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal1);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_parallelConvGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch
				.registerObject("pgwToParallelStep", pgwToParallelStep);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_LANE_LANESET_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6),
					(ParallelGateway) arguments.get(7),
					(SequenceFlow) arguments.get(8));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_LANE_LANESET_PARALLELGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6),
					(ParallelGateway) arguments.get(7),
					(SequenceFlow) arguments.get(8));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_LANE_LANESET_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6),
					(ParallelGateway) arguments.get(7),
					(SequenceFlow) arguments.get(8));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP_LANE_LANESET_PARALLELGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(Step) arguments.get(7),
					(SequenceFlowToStep) arguments.get(8),
					(Flow) arguments.get(9), (ParallelStep) arguments.get(10),
					(Lane) arguments.get(11), (LaneSet) arguments.get(12),
					(ParallelGateway) arguments.get(13),
					(FlowNodeToStep) arguments.get(14),
					(SequenceFlow) arguments.get(15),
					(SequenceFlowToUCFlow) arguments.get(16));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_44((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_46((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_47((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_48__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_48((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_49((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_50((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP_LANE_LANESET_PARALLELGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelFlow) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(Step) arguments.get(5),
					(SequenceFlowToStep) arguments.get(6),
					(Flow) arguments.get(7), (ParallelStep) arguments.get(8),
					(Lane) arguments.get(9), (LaneSet) arguments.get(10),
					(ParallelGateway) arguments.get(11),
					(FlowNodeToStep) arguments.get(12),
					(SequenceFlow) arguments.get(13),
					(SequenceFlowToUCFlow) arguments.get(14),
					(ModelgeneratorRuleResult) arguments.get(15));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_1_blackBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!divergeFlow.equals(outFlow)) {
						return new Object[] { _this, match, process, inFlow,
								parallelConvGateway, outFlow, lane, laneSet,
								parallelGateway, divergeFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_2_bindingFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, inFlow,
					parallelConvGateway, outFlow, lane, laneSet,
					parallelGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_2_bindingAndBlackFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		Object[] result_pattern_ParallelConvergingGatewayRule_0_2_binding = pattern_ParallelConvergingGatewayRule_0_2_bindingFBBBBBBBBBB(
				_this, match, process, inFlow, parallelConvGateway, outFlow,
				lane, laneSet, parallelGateway, divergeFlow);
		if (result_pattern_ParallelConvergingGatewayRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelConvergingGatewayRule_0_2_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_0_2_black = pattern_ParallelConvergingGatewayRule_0_2_blackB(csp);
			if (result_pattern_ParallelConvergingGatewayRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process, inFlow,
						parallelConvGateway, outFlow, lane, laneSet,
						parallelGateway, divergeFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_0_3_expressionFBB(
			ParallelConvergingGatewayRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_4_blackBBBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!divergeFlow.equals(outFlow)) {
						return new Object[] { match, process, inFlow,
								parallelConvGateway, outFlow, lane, laneSet,
								parallelGateway, divergeFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_4_greenBBBBBBFFFFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__parallelConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__parallelConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parallelConvGateway);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__parallelConvGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__parallelConvGateway____sourceRef_name_prime = "sourceRef";
		String parallelConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String lane__parallelConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__parallelConvGateway____flowElements.setSrc(process);
		process__parallelConvGateway____flowElements
				.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				process__parallelConvGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__parallelConvGateway____targetRef.setSrc(inFlow);
		inFlow__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				inFlow__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(
				parallelConvGateway__inFlow____incoming);
		outFlow__parallelConvGateway____sourceRef.setSrc(outFlow);
		outFlow__parallelConvGateway____sourceRef.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				outFlow__parallelConvGateway____sourceRef);
		parallelConvGateway__outFlow____outgoing.setSrc(parallelConvGateway);
		parallelConvGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				parallelConvGateway__outFlow____outgoing);
		lane__parallelConvGateway____flowNodeRefs.setSrc(lane);
		lane__parallelConvGateway____flowNodeRefs.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				lane__parallelConvGateway____flowNodeRefs);
		process__parallelConvGateway____flowElements
				.setName(process__parallelConvGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__parallelConvGateway____targetRef
				.setName(inFlow__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow____incoming
				.setName(parallelConvGateway__inFlow____incoming_name_prime);
		outFlow__parallelConvGateway____sourceRef
				.setName(outFlow__parallelConvGateway____sourceRef_name_prime);
		parallelConvGateway__outFlow____outgoing
				.setName(parallelConvGateway__outFlow____outgoing_name_prime);
		lane__parallelConvGateway____flowNodeRefs
				.setName(lane__parallelConvGateway____flowNodeRefs_name_prime);
		return new Object[] { match, process, inFlow, parallelConvGateway,
				outFlow, lane, process__parallelConvGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow____incoming,
				outFlow__parallelConvGateway____sourceRef,
				parallelConvGateway__outFlow____outgoing,
				lane__parallelConvGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_5_blackBBBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!divergeFlow.equals(outFlow)) {
						return new Object[] { match, process, inFlow,
								parallelConvGateway, outFlow, lane, laneSet,
								parallelGateway, divergeFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_0_5_greenBBBBBBBFFFFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow, Lane lane,
			LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		match.getContextNodes().add(parallelGateway);
		match.getContextNodes().add(divergeFlow);
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		String divergeFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__divergeFlow____outgoing_name_prime = "outgoing";
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		match.getContextEdges().add(process__divergeFlow____flowElements);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		match.getContextEdges().add(process__parallelGateway____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		divergeFlow__parallelGateway____sourceRef.setSrc(divergeFlow);
		divergeFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		match.getContextEdges().add(divergeFlow__parallelGateway____sourceRef);
		parallelGateway__divergeFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__divergeFlow____outgoing.setTrg(divergeFlow);
		match.getContextEdges().add(parallelGateway__divergeFlow____outgoing);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		divergeFlow__parallelGateway____sourceRef
				.setName(divergeFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__divergeFlow____outgoing
				.setName(parallelGateway__divergeFlow____outgoing_name_prime);
		return new Object[] { match, process, inFlow, lane, laneSet,
				parallelGateway, divergeFlow, process__inFlow____flowElements,
				process__laneSet____laneSets,
				process__divergeFlow____flowElements,
				process__parallelGateway____flowElements,
				laneSet__lane____lanes,
				divergeFlow__parallelGateway____sourceRef,
				parallelGateway__divergeFlow____outgoing };
	}

	public static final void pattern_ParallelConvergingGatewayRule_0_6_expressionBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		_this.registerObjectsToMatch_FWD(match, process, inFlow,
				parallelConvGateway, outFlow, lane, laneSet, parallelGateway,
				divergeFlow);

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_1_bindingFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("parallelConvGateway");
		EObject _localVariable_3 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_6 = isApplicableMatch.getObject("step");
		EObject _localVariable_7 = isApplicableMatch.getObject("inFlowToStep");
		EObject _localVariable_8 = isApplicableMatch.getObject("initFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("parallelStep");
		EObject _localVariable_10 = isApplicableMatch.getObject("lane");
		EObject _localVariable_11 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_12 = isApplicableMatch
				.getObject("parallelGateway");
		EObject _localVariable_13 = isApplicableMatch
				.getObject("pgwToParallelStep");
		EObject _localVariable_14 = isApplicableMatch.getObject("divergeFlow");
		EObject _localVariable_15 = isApplicableMatch
				.getObject("divergeFlowToFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpParallelConvGateway = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpInFlowToFlow = _localVariable_5;
		EObject tmpStep = _localVariable_6;
		EObject tmpInFlowToStep = _localVariable_7;
		EObject tmpInitFlow = _localVariable_8;
		EObject tmpParallelStep = _localVariable_9;
		EObject tmpLane = _localVariable_10;
		EObject tmpLaneSet = _localVariable_11;
		EObject tmpParallelGateway = _localVariable_12;
		EObject tmpPgwToParallelStep = _localVariable_13;
		EObject tmpDivergeFlow = _localVariable_14;
		EObject tmpDivergeFlowToFlow = _localVariable_15;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpParallelConvGateway instanceof ParallelGateway) {
					ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						if (tmpFlow instanceof ParallelFlow) {
							ParallelFlow flow = (ParallelFlow) tmpFlow;
							if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
								SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
								if (tmpStep instanceof Step) {
									Step step = (Step) tmpStep;
									if (tmpInFlowToStep instanceof SequenceFlowToStep) {
										SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
										if (tmpInitFlow instanceof Flow) {
											Flow initFlow = (Flow) tmpInitFlow;
											if (tmpParallelStep instanceof ParallelStep) {
												ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
												if (tmpLane instanceof Lane) {
													Lane lane = (Lane) tmpLane;
													if (tmpLaneSet instanceof LaneSet) {
														LaneSet laneSet = (LaneSet) tmpLaneSet;
														if (tmpParallelGateway instanceof ParallelGateway) {
															ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
															if (tmpPgwToParallelStep instanceof FlowNodeToStep) {
																FlowNodeToStep pgwToParallelStep = (FlowNodeToStep) tmpPgwToParallelStep;
																if (tmpDivergeFlow instanceof SequenceFlow) {
																	SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																	if (tmpDivergeFlowToFlow instanceof SequenceFlowToUCFlow) {
																		SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) tmpDivergeFlowToFlow;
																		return new Object[] {
																				process,
																				inFlow,
																				parallelConvGateway,
																				outFlow,
																				flow,
																				inFlowToFlow,
																				step,
																				inFlowToStep,
																				initFlow,
																				parallelStep,
																				lane,
																				laneSet,
																				parallelGateway,
																				pgwToParallelStep,
																				divergeFlow,
																				divergeFlowToFlow,
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
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_1_blackBBBBBBBBBBBBBBBBFBB(
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow,
			ParallelConvergingGatewayRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!flow.equals(initFlow)) {
					if (!parallelStep.equals(step)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!divergeFlowToFlow.equals(inFlowToFlow)) {
									for (EObject tmpCsp : isApplicableMatch
											.getAttributeInfo()) {
										if (tmpCsp instanceof CSP) {
											CSP csp = (CSP) tmpCsp;
											return new Object[] { process,
													inFlow,
													parallelConvGateway,
													outFlow, flow,
													inFlowToFlow, step,
													inFlowToStep, initFlow,
													parallelStep, lane,
													laneSet, parallelGateway,
													pgwToParallelStep,
													divergeFlow,
													divergeFlowToFlow, csp,
													_this, isApplicableMatch };
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
			ParallelConvergingGatewayRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelConvergingGatewayRule_1_1_binding = pattern_ParallelConvergingGatewayRule_1_1_bindingFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelConvergingGatewayRule_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_ParallelConvergingGatewayRule_1_1_binding[0];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result_pattern_ParallelConvergingGatewayRule_1_1_binding[2];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[3];
			ParallelFlow flow = (ParallelFlow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[5];
			Step step = (Step) result_pattern_ParallelConvergingGatewayRule_1_1_binding[6];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result_pattern_ParallelConvergingGatewayRule_1_1_binding[7];
			Flow initFlow = (Flow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[8];
			ParallelStep parallelStep = (ParallelStep) result_pattern_ParallelConvergingGatewayRule_1_1_binding[9];
			Lane lane = (Lane) result_pattern_ParallelConvergingGatewayRule_1_1_binding[10];
			LaneSet laneSet = (LaneSet) result_pattern_ParallelConvergingGatewayRule_1_1_binding[11];
			ParallelGateway parallelGateway = (ParallelGateway) result_pattern_ParallelConvergingGatewayRule_1_1_binding[12];
			FlowNodeToStep pgwToParallelStep = (FlowNodeToStep) result_pattern_ParallelConvergingGatewayRule_1_1_binding[13];
			SequenceFlow divergeFlow = (SequenceFlow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[14];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ParallelConvergingGatewayRule_1_1_binding[15];

			Object[] result_pattern_ParallelConvergingGatewayRule_1_1_black = pattern_ParallelConvergingGatewayRule_1_1_blackBBBBBBBBBBBBBBBBFBB(
					process, inFlow, parallelConvGateway, outFlow, flow,
					inFlowToFlow, step, inFlowToStep, initFlow, parallelStep,
					lane, laneSet, parallelGateway, pgwToParallelStep,
					divergeFlow, divergeFlowToFlow, _this, isApplicableMatch);
			if (result_pattern_ParallelConvergingGatewayRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelConvergingGatewayRule_1_1_black[16];

				return new Object[] { process, inFlow, parallelConvGateway,
						outFlow, flow, inFlowToFlow, step, inFlowToStep,
						initFlow, parallelStep, lane, laneSet, parallelGateway,
						pgwToParallelStep, divergeFlow, divergeFlowToFlow, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_1_greenBBBBFFF(
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Flow initFlow, ParallelStep parallelStep) {
		FlowNodeToStep pcgwToParStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		pcgwToParStep.setSource(parallelConvGateway);
		pcgwToParStep.setTarget(parallelStep);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		outFlowToParallelStep.setSource(outFlow);
		outFlowToParallelStep.setTarget(parallelStep);
		return new Object[] { parallelConvGateway, outFlow, initFlow,
				parallelStep, pcgwToParStep, outFlowToInitFlow,
				outFlowToParallelStep };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_2_blackBBBBB(
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			FlowNodeToStep pcgwToParStep,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToParallelStep) {
		return new Object[] { parallelConvGateway, outFlow, pcgwToParStep,
				outFlowToInitFlow, outFlowToParallelStep };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_2_greenFBBBBB(
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			FlowNodeToStep pcgwToParStep,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToParallelStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(parallelConvGateway);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(pcgwToParStep);
		ruleresult.getCreatedLinkElements().add(outFlowToInitFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToParallelStep);
		return new Object[] { ruleresult, parallelConvGateway, outFlow,
				pcgwToParStep, outFlowToInitFlow, outFlowToParallelStep };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_3_blackBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject parallelConvGateway, EObject outFlow, EObject flow,
			EObject inFlowToFlow, EObject step, EObject inFlowToStep,
			EObject initFlow, EObject parallelStep, EObject pcgwToParStep,
			EObject outFlowToInitFlow, EObject outFlowToParallelStep,
			EObject lane, EObject laneSet, EObject parallelGateway,
			EObject pgwToParallelStep, EObject divergeFlow,
			EObject divergeFlowToFlow) {
		if (!process.equals(step)) {
			if (!inFlow.equals(process)) {
				if (!inFlow.equals(parallelConvGateway)) {
					if (!inFlow.equals(outFlow)) {
						if (!inFlow.equals(inFlowToFlow)) {
							if (!inFlow.equals(step)) {
								if (!inFlow.equals(inFlowToStep)) {
									if (!inFlow.equals(initFlow)) {
										if (!inFlow.equals(parallelStep)) {
											if (!inFlow.equals(pcgwToParStep)) {
												if (!inFlow
														.equals(outFlowToInitFlow)) {
													if (!inFlow
															.equals(outFlowToParallelStep)) {
														if (!inFlow
																.equals(lane)) {
															if (!inFlow
																	.equals(laneSet)) {
																if (!inFlow
																		.equals(parallelGateway)) {
																	if (!inFlow
																			.equals(pgwToParallelStep)) {
																		if (!parallelConvGateway
																				.equals(process)) {
																			if (!parallelConvGateway
																					.equals(step)) {
																				if (!parallelConvGateway
																						.equals(parallelStep)) {
																					if (!parallelConvGateway
																							.equals(pcgwToParStep)) {
																						if (!parallelConvGateway
																								.equals(parallelGateway)) {
																							if (!parallelConvGateway
																									.equals(pgwToParallelStep)) {
																								if (!outFlow
																										.equals(process)) {
																									if (!outFlow
																											.equals(parallelConvGateway)) {
																										if (!outFlow
																												.equals(step)) {
																											if (!outFlow
																													.equals(parallelStep)) {
																												if (!outFlow
																														.equals(pcgwToParStep)) {
																													if (!outFlow
																															.equals(outFlowToInitFlow)) {
																														if (!outFlow
																																.equals(outFlowToParallelStep)) {
																															if (!outFlow
																																	.equals(parallelGateway)) {
																																if (!outFlow
																																		.equals(pgwToParallelStep)) {
																																	if (!flow
																																			.equals(process)) {
																																		if (!flow
																																				.equals(inFlow)) {
																																			if (!flow
																																					.equals(parallelConvGateway)) {
																																				if (!flow
																																						.equals(outFlow)) {
																																					if (!flow
																																							.equals(inFlowToFlow)) {
																																						if (!flow
																																								.equals(step)) {
																																							if (!flow
																																									.equals(inFlowToStep)) {
																																								if (!flow
																																										.equals(initFlow)) {
																																									if (!flow
																																											.equals(parallelStep)) {
																																										if (!flow
																																												.equals(pcgwToParStep)) {
																																											if (!flow
																																													.equals(outFlowToInitFlow)) {
																																												if (!flow
																																														.equals(outFlowToParallelStep)) {
																																													if (!flow
																																															.equals(lane)) {
																																														if (!flow
																																																.equals(laneSet)) {
																																															if (!flow
																																																	.equals(parallelGateway)) {
																																																if (!flow
																																																		.equals(pgwToParallelStep)) {
																																																	if (!inFlowToFlow
																																																			.equals(process)) {
																																																		if (!inFlowToFlow
																																																				.equals(parallelConvGateway)) {
																																																			if (!inFlowToFlow
																																																					.equals(outFlow)) {
																																																				if (!inFlowToFlow
																																																						.equals(step)) {
																																																					if (!inFlowToFlow
																																																							.equals(inFlowToStep)) {
																																																						if (!inFlowToFlow
																																																								.equals(initFlow)) {
																																																							if (!inFlowToFlow
																																																									.equals(parallelStep)) {
																																																								if (!inFlowToFlow
																																																										.equals(pcgwToParStep)) {
																																																									if (!inFlowToFlow
																																																											.equals(outFlowToInitFlow)) {
																																																										if (!inFlowToFlow
																																																												.equals(outFlowToParallelStep)) {
																																																											if (!inFlowToFlow
																																																													.equals(lane)) {
																																																												if (!inFlowToFlow
																																																														.equals(laneSet)) {
																																																													if (!inFlowToFlow
																																																															.equals(parallelGateway)) {
																																																														if (!inFlowToFlow
																																																																.equals(pgwToParallelStep)) {
																																																															if (!inFlowToStep
																																																																	.equals(process)) {
																																																																if (!inFlowToStep
																																																																		.equals(parallelConvGateway)) {
																																																																	if (!inFlowToStep
																																																																			.equals(outFlow)) {
																																																																		if (!inFlowToStep
																																																																				.equals(step)) {
																																																																			if (!inFlowToStep
																																																																					.equals(initFlow)) {
																																																																				if (!inFlowToStep
																																																																						.equals(parallelStep)) {
																																																																					if (!inFlowToStep
																																																																							.equals(pcgwToParStep)) {
																																																																						if (!inFlowToStep
																																																																								.equals(outFlowToInitFlow)) {
																																																																							if (!inFlowToStep
																																																																									.equals(outFlowToParallelStep)) {
																																																																								if (!inFlowToStep
																																																																										.equals(lane)) {
																																																																									if (!inFlowToStep
																																																																											.equals(laneSet)) {
																																																																										if (!inFlowToStep
																																																																												.equals(parallelGateway)) {
																																																																											if (!inFlowToStep
																																																																													.equals(pgwToParallelStep)) {
																																																																												if (!initFlow
																																																																														.equals(process)) {
																																																																													if (!initFlow
																																																																															.equals(parallelConvGateway)) {
																																																																														if (!initFlow
																																																																																.equals(outFlow)) {
																																																																															if (!initFlow
																																																																																	.equals(step)) {
																																																																																if (!initFlow
																																																																																		.equals(parallelStep)) {
																																																																																	if (!initFlow
																																																																																			.equals(pcgwToParStep)) {
																																																																																		if (!initFlow
																																																																																				.equals(outFlowToInitFlow)) {
																																																																																			if (!initFlow
																																																																																					.equals(outFlowToParallelStep)) {
																																																																																				if (!initFlow
																																																																																						.equals(lane)) {
																																																																																					if (!initFlow
																																																																																							.equals(laneSet)) {
																																																																																						if (!initFlow
																																																																																								.equals(parallelGateway)) {
																																																																																							if (!initFlow
																																																																																									.equals(pgwToParallelStep)) {
																																																																																								if (!parallelStep
																																																																																										.equals(process)) {
																																																																																									if (!parallelStep
																																																																																											.equals(step)) {
																																																																																										if (!parallelStep
																																																																																												.equals(pcgwToParStep)) {
																																																																																											if (!parallelStep
																																																																																													.equals(pgwToParallelStep)) {
																																																																																												if (!pcgwToParStep
																																																																																														.equals(process)) {
																																																																																													if (!pcgwToParStep
																																																																																															.equals(step)) {
																																																																																														if (!pcgwToParStep
																																																																																																.equals(pgwToParallelStep)) {
																																																																																															if (!outFlowToInitFlow
																																																																																																	.equals(process)) {
																																																																																																if (!outFlowToInitFlow
																																																																																																		.equals(parallelConvGateway)) {
																																																																																																	if (!outFlowToInitFlow
																																																																																																			.equals(step)) {
																																																																																																		if (!outFlowToInitFlow
																																																																																																				.equals(parallelStep)) {
																																																																																																			if (!outFlowToInitFlow
																																																																																																					.equals(pcgwToParStep)) {
																																																																																																				if (!outFlowToInitFlow
																																																																																																						.equals(outFlowToParallelStep)) {
																																																																																																					if (!outFlowToInitFlow
																																																																																																							.equals(parallelGateway)) {
																																																																																																						if (!outFlowToInitFlow
																																																																																																								.equals(pgwToParallelStep)) {
																																																																																																							if (!outFlowToParallelStep
																																																																																																									.equals(process)) {
																																																																																																								if (!outFlowToParallelStep
																																																																																																										.equals(parallelConvGateway)) {
																																																																																																									if (!outFlowToParallelStep
																																																																																																											.equals(step)) {
																																																																																																										if (!outFlowToParallelStep
																																																																																																												.equals(parallelStep)) {
																																																																																																											if (!outFlowToParallelStep
																																																																																																													.equals(pcgwToParStep)) {
																																																																																																												if (!outFlowToParallelStep
																																																																																																														.equals(parallelGateway)) {
																																																																																																													if (!outFlowToParallelStep
																																																																																																															.equals(pgwToParallelStep)) {
																																																																																																														if (!lane
																																																																																																																.equals(process)) {
																																																																																																															if (!lane
																																																																																																																	.equals(parallelConvGateway)) {
																																																																																																																if (!lane
																																																																																																																		.equals(outFlow)) {
																																																																																																																	if (!lane
																																																																																																																			.equals(step)) {
																																																																																																																		if (!lane
																																																																																																																				.equals(parallelStep)) {
																																																																																																																			if (!lane
																																																																																																																					.equals(pcgwToParStep)) {
																																																																																																																				if (!lane
																																																																																																																						.equals(outFlowToInitFlow)) {
																																																																																																																					if (!lane
																																																																																																																							.equals(outFlowToParallelStep)) {
																																																																																																																						if (!lane
																																																																																																																								.equals(laneSet)) {
																																																																																																																							if (!lane
																																																																																																																									.equals(parallelGateway)) {
																																																																																																																								if (!lane
																																																																																																																										.equals(pgwToParallelStep)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(process)) {
																																																																																																																										if (!laneSet
																																																																																																																												.equals(parallelConvGateway)) {
																																																																																																																											if (!laneSet
																																																																																																																													.equals(outFlow)) {
																																																																																																																												if (!laneSet
																																																																																																																														.equals(step)) {
																																																																																																																													if (!laneSet
																																																																																																																															.equals(parallelStep)) {
																																																																																																																														if (!laneSet
																																																																																																																																.equals(pcgwToParStep)) {
																																																																																																																															if (!laneSet
																																																																																																																																	.equals(outFlowToInitFlow)) {
																																																																																																																																if (!laneSet
																																																																																																																																		.equals(outFlowToParallelStep)) {
																																																																																																																																	if (!laneSet
																																																																																																																																			.equals(parallelGateway)) {
																																																																																																																																		if (!laneSet
																																																																																																																																				.equals(pgwToParallelStep)) {
																																																																																																																																			if (!parallelGateway
																																																																																																																																					.equals(process)) {
																																																																																																																																				if (!parallelGateway
																																																																																																																																						.equals(step)) {
																																																																																																																																					if (!parallelGateway
																																																																																																																																							.equals(parallelStep)) {
																																																																																																																																						if (!parallelGateway
																																																																																																																																								.equals(pcgwToParStep)) {
																																																																																																																																							if (!parallelGateway
																																																																																																																																									.equals(pgwToParallelStep)) {
																																																																																																																																								if (!pgwToParallelStep
																																																																																																																																										.equals(process)) {
																																																																																																																																									if (!pgwToParallelStep
																																																																																																																																											.equals(step)) {
																																																																																																																																										if (!divergeFlow
																																																																																																																																												.equals(process)) {
																																																																																																																																											if (!divergeFlow
																																																																																																																																													.equals(inFlow)) {
																																																																																																																																												if (!divergeFlow
																																																																																																																																														.equals(parallelConvGateway)) {
																																																																																																																																													if (!divergeFlow
																																																																																																																																															.equals(outFlow)) {
																																																																																																																																														if (!divergeFlow
																																																																																																																																																.equals(flow)) {
																																																																																																																																															if (!divergeFlow
																																																																																																																																																	.equals(inFlowToFlow)) {
																																																																																																																																																if (!divergeFlow
																																																																																																																																																		.equals(step)) {
																																																																																																																																																	if (!divergeFlow
																																																																																																																																																			.equals(inFlowToStep)) {
																																																																																																																																																		if (!divergeFlow
																																																																																																																																																				.equals(initFlow)) {
																																																																																																																																																			if (!divergeFlow
																																																																																																																																																					.equals(parallelStep)) {
																																																																																																																																																				if (!divergeFlow
																																																																																																																																																						.equals(pcgwToParStep)) {
																																																																																																																																																					if (!divergeFlow
																																																																																																																																																							.equals(outFlowToInitFlow)) {
																																																																																																																																																						if (!divergeFlow
																																																																																																																																																								.equals(outFlowToParallelStep)) {
																																																																																																																																																							if (!divergeFlow
																																																																																																																																																									.equals(lane)) {
																																																																																																																																																								if (!divergeFlow
																																																																																																																																																										.equals(laneSet)) {
																																																																																																																																																									if (!divergeFlow
																																																																																																																																																											.equals(parallelGateway)) {
																																																																																																																																																										if (!divergeFlow
																																																																																																																																																												.equals(pgwToParallelStep)) {
																																																																																																																																																											if (!divergeFlow
																																																																																																																																																													.equals(divergeFlowToFlow)) {
																																																																																																																																																												if (!divergeFlowToFlow
																																																																																																																																																														.equals(process)) {
																																																																																																																																																													if (!divergeFlowToFlow
																																																																																																																																																															.equals(inFlow)) {
																																																																																																																																																														if (!divergeFlowToFlow
																																																																																																																																																																.equals(parallelConvGateway)) {
																																																																																																																																																															if (!divergeFlowToFlow
																																																																																																																																																																	.equals(outFlow)) {
																																																																																																																																																																if (!divergeFlowToFlow
																																																																																																																																																																		.equals(flow)) {
																																																																																																																																																																	if (!divergeFlowToFlow
																																																																																																																																																																			.equals(inFlowToFlow)) {
																																																																																																																																																																		if (!divergeFlowToFlow
																																																																																																																																																																				.equals(step)) {
																																																																																																																																																																			if (!divergeFlowToFlow
																																																																																																																																																																					.equals(inFlowToStep)) {
																																																																																																																																																																				if (!divergeFlowToFlow
																																																																																																																																																																						.equals(initFlow)) {
																																																																																																																																																																					if (!divergeFlowToFlow
																																																																																																																																																																							.equals(parallelStep)) {
																																																																																																																																																																						if (!divergeFlowToFlow
																																																																																																																																																																								.equals(pcgwToParStep)) {
																																																																																																																																																																							if (!divergeFlowToFlow
																																																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																																																								if (!divergeFlowToFlow
																																																																																																																																																																										.equals(outFlowToParallelStep)) {
																																																																																																																																																																									if (!divergeFlowToFlow
																																																																																																																																																																											.equals(lane)) {
																																																																																																																																																																										if (!divergeFlowToFlow
																																																																																																																																																																												.equals(laneSet)) {
																																																																																																																																																																											if (!divergeFlowToFlow
																																																																																																																																																																													.equals(parallelGateway)) {
																																																																																																																																																																												if (!divergeFlowToFlow
																																																																																																																																																																														.equals(pgwToParallelStep)) {
																																																																																																																																																																													return new Object[] {
																																																																																																																																																																															ruleresult,
																																																																																																																																																																															process,
																																																																																																																																																																															inFlow,
																																																																																																																																																																															parallelConvGateway,
																																																																																																																																																																															outFlow,
																																																																																																																																																																															flow,
																																																																																																																																																																															inFlowToFlow,
																																																																																																																																																																															step,
																																																																																																																																																																															inFlowToStep,
																																																																																																																																																																															initFlow,
																																																																																																																																																																															parallelStep,
																																																																																																																																																																															pcgwToParStep,
																																																																																																																																																																															outFlowToInitFlow,
																																																																																																																																																																															outFlowToParallelStep,
																																																																																																																																																																															lane,
																																																																																																																																																																															laneSet,
																																																																																																																																																																															parallelGateway,
																																																																																																																																																																															pgwToParallelStep,
																																																																																																																																																																															divergeFlow,
																																																																																																																																																																															divergeFlowToFlow };
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject parallelConvGateway, EObject outFlow, EObject initFlow,
			EObject parallelStep, EObject pcgwToParStep,
			EObject outFlowToInitFlow, EObject outFlowToParallelStep,
			EObject lane) {
		EMoflonEdge process__parallelConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__parallelConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pcgwToParStep__parallelConvGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pcgwToParStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__initFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToParallelStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelConvergingGatewayRule";
		String process__parallelConvGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__parallelConvGateway____sourceRef_name_prime = "sourceRef";
		String parallelConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String pcgwToParStep__parallelConvGateway____source_name_prime = "source";
		String pcgwToParStep__parallelStep____target_name_prime = "target";
		String outFlowToInitFlow__outFlow____source_name_prime = "source";
		String outFlowToInitFlow__initFlow____target_name_prime = "target";
		String outFlowToParallelStep__outFlow____source_name_prime = "source";
		String outFlowToParallelStep__parallelStep____target_name_prime = "target";
		String lane__parallelConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__parallelConvGateway____flowElements.setSrc(process);
		process__parallelConvGateway____flowElements
				.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				process__parallelConvGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__parallelConvGateway____targetRef.setSrc(inFlow);
		inFlow__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(
				parallelConvGateway__inFlow____incoming);
		outFlow__parallelConvGateway____sourceRef.setSrc(outFlow);
		outFlow__parallelConvGateway____sourceRef.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				outFlow__parallelConvGateway____sourceRef);
		parallelConvGateway__outFlow____outgoing.setSrc(parallelConvGateway);
		parallelConvGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				parallelConvGateway__outFlow____outgoing);
		pcgwToParStep__parallelConvGateway____source.setSrc(pcgwToParStep);
		pcgwToParStep__parallelConvGateway____source
				.setTrg(parallelConvGateway);
		ruleresult.getCreatedEdges().add(
				pcgwToParStep__parallelConvGateway____source);
		pcgwToParStep__parallelStep____target.setSrc(pcgwToParStep);
		pcgwToParStep__parallelStep____target.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(pcgwToParStep__parallelStep____target);
		outFlowToInitFlow__outFlow____source.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__outFlow____source);
		outFlowToInitFlow__initFlow____target.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__initFlow____target.setTrg(initFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__initFlow____target);
		outFlowToParallelStep__outFlow____source.setSrc(outFlowToParallelStep);
		outFlowToParallelStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(
				outFlowToParallelStep__outFlow____source);
		outFlowToParallelStep__parallelStep____target
				.setSrc(outFlowToParallelStep);
		outFlowToParallelStep__parallelStep____target.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(
				outFlowToParallelStep__parallelStep____target);
		lane__parallelConvGateway____flowNodeRefs.setSrc(lane);
		lane__parallelConvGateway____flowNodeRefs.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				lane__parallelConvGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__parallelConvGateway____flowElements
				.setName(process__parallelConvGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__parallelConvGateway____targetRef
				.setName(inFlow__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow____incoming
				.setName(parallelConvGateway__inFlow____incoming_name_prime);
		outFlow__parallelConvGateway____sourceRef
				.setName(outFlow__parallelConvGateway____sourceRef_name_prime);
		parallelConvGateway__outFlow____outgoing
				.setName(parallelConvGateway__outFlow____outgoing_name_prime);
		pcgwToParStep__parallelConvGateway____source
				.setName(pcgwToParStep__parallelConvGateway____source_name_prime);
		pcgwToParStep__parallelStep____target
				.setName(pcgwToParStep__parallelStep____target_name_prime);
		outFlowToInitFlow__outFlow____source
				.setName(outFlowToInitFlow__outFlow____source_name_prime);
		outFlowToInitFlow__initFlow____target
				.setName(outFlowToInitFlow__initFlow____target_name_prime);
		outFlowToParallelStep__outFlow____source
				.setName(outFlowToParallelStep__outFlow____source_name_prime);
		outFlowToParallelStep__parallelStep____target
				.setName(outFlowToParallelStep__parallelStep____target_name_prime);
		lane__parallelConvGateway____flowNodeRefs
				.setName(lane__parallelConvGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, process, inFlow, parallelConvGateway,
				outFlow, initFlow, parallelStep, pcgwToParStep,
				outFlowToInitFlow, outFlowToParallelStep, lane,
				process__parallelConvGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow____incoming,
				outFlow__parallelConvGateway____sourceRef,
				parallelConvGateway__outFlow____outgoing,
				pcgwToParStep__parallelConvGateway____source,
				pcgwToParStep__parallelStep____target,
				outFlowToInitFlow__outFlow____source,
				outFlowToInitFlow__initFlow____target,
				outFlowToParallelStep__outFlow____source,
				outFlowToParallelStep__parallelStep____target,
				lane__parallelConvGateway____flowNodeRefs };
	}

	public static final void pattern_ParallelConvergingGatewayRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject parallelConvGateway,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject parallelStep,
			EObject pcgwToParStep, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject parallelGateway, EObject pgwToParallelStep,
			EObject divergeFlow, EObject divergeFlowToFlow) {
		_this.registerObjects_FWD(ruleresult, process, inFlow,
				parallelConvGateway, outFlow, flow, inFlowToFlow, step,
				inFlowToStep, initFlow, parallelStep, pcgwToParStep,
				outFlowToInitFlow, outFlowToParallelStep, lane, laneSet,
				parallelGateway, pgwToParallelStep, divergeFlow,
				divergeFlowToFlow);

	}

	public static final PerformRuleResult pattern_ParallelConvergingGatewayRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_1_blackFBB(
			EClass eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_2_1_binding = pattern_ParallelConvergingGatewayRule_2_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_2_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_2_1_black = pattern_ParallelConvergingGatewayRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelConvergingGatewayRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_2_bindingFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("inFlow");
		EObject _localVariable_2 = match.getObject("parallelConvGateway");
		EObject _localVariable_3 = match.getObject("outFlow");
		EObject _localVariable_4 = match.getObject("lane");
		EObject _localVariable_5 = match.getObject("laneSet");
		EObject _localVariable_6 = match.getObject("parallelGateway");
		EObject _localVariable_7 = match.getObject("divergeFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpParallelConvGateway = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		EObject tmpLane = _localVariable_4;
		EObject tmpLaneSet = _localVariable_5;
		EObject tmpParallelGateway = _localVariable_6;
		EObject tmpDivergeFlow = _localVariable_7;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpParallelConvGateway instanceof ParallelGateway) {
					ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						if (tmpLane instanceof Lane) {
							Lane lane = (Lane) tmpLane;
							if (tmpLaneSet instanceof LaneSet) {
								LaneSet laneSet = (LaneSet) tmpLaneSet;
								if (tmpParallelGateway instanceof ParallelGateway) {
									ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
									if (tmpDivergeFlow instanceof SequenceFlow) {
										SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
										return new Object[] { process, inFlow,
												parallelConvGateway, outFlow,
												lane, laneSet, parallelGateway,
												divergeFlow, match };
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

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_2_2_blackBBBBFFFFFBBBFBFB(
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!divergeFlow.equals(outFlow)) {
						for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(inFlow,
										SequenceFlowToUCFlow.class, "source")) {
							Flow tmpFlow = inFlowToFlow.getTarget();
							if (tmpFlow instanceof ParallelFlow) {
								ParallelFlow flow = (ParallelFlow) tmpFlow;
								for (SequenceFlowToStep inFlowToStep : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(inFlow,
												SequenceFlowToStep.class,
												"source")) {
									Step step = inFlowToStep.getTarget();
									if (step != null) {
										for (FlowNodeToStep pgwToParallelStep : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														parallelGateway,
														FlowNodeToStep.class,
														"source")) {
											Step tmpParallelStep = pgwToParallelStep
													.getTarget();
											if (tmpParallelStep instanceof ParallelStep) {
												ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
												if (!parallelStep.equals(step)) {
													for (SequenceFlowToUCFlow divergeFlowToFlow : org.moflon.util.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	divergeFlow,
																	SequenceFlowToUCFlow.class,
																	"source")) {
														if (!divergeFlowToFlow
																.equals(inFlowToFlow)) {
															if (flow.equals(divergeFlowToFlow
																	.getTarget())) {
																_result.add(new Object[] {
																		process,
																		inFlow,
																		parallelConvGateway,
																		outFlow,
																		flow,
																		inFlowToFlow,
																		step,
																		inFlowToStep,
																		parallelStep,
																		lane,
																		laneSet,
																		parallelGateway,
																		pgwToParallelStep,
																		divergeFlow,
																		divergeFlowToFlow,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_3_black_nac_0BB(
			Step step, ParallelStep parallelStep) {
		if (!parallelStep.equals(step)) {
			Step nextStep = step.getNext();
			if (nextStep != null) {
				if (!step.equals(nextStep)) {
					if (!parallelStep.equals(nextStep)) {
						return new Object[] { step, parallelStep };
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_2_3_blackBBBBBBBBFBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, ParallelStep parallelStep,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			FlowNodeToStep pgwToParallelStep, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!parallelStep.equals(step)) {
					if (!divergeFlow.equals(inFlow)) {
						if (!divergeFlow.equals(outFlow)) {
							if (!divergeFlowToFlow.equals(inFlowToFlow)) {
								if (process.getFlowElements().contains(inFlow)) {
									if (process.getLaneSets().contains(laneSet)) {
										if (process.getFlowElements().contains(
												parallelConvGateway)) {
											if (process.getFlowElements()
													.contains(outFlow)) {
												if (process.getFlowElements()
														.contains(divergeFlow)) {
													if (process
															.getFlowElements()
															.contains(
																	parallelGateway)) {
														if (parallelConvGateway
																.equals(inFlow
																		.getTargetRef())) {
															if (parallelConvGateway
																	.equals(outFlow
																			.getSourceRef())) {
																if (flow.getSteps()
																		.contains(
																				step)) {
																	if (inFlow
																			.equals(inFlowToFlow
																					.getSource())) {
																		if (flow.equals(inFlowToFlow
																				.getTarget())) {
																			if (inFlow
																					.equals(inFlowToStep
																							.getSource())) {
																				if (step.equals(inFlowToStep
																						.getTarget())) {
																					if (parallelStep
																							.getInvokedFlows()
																							.contains(
																									flow)) {
																						if (lane.getFlowNodeRefs()
																								.contains(
																										parallelConvGateway)) {
																							if (laneSet
																									.getLanes()
																									.contains(
																											lane)) {
																								if (parallelGateway
																										.equals(divergeFlow
																												.getSourceRef())) {
																									if (parallelStep
																											.equals(pgwToParallelStep
																													.getTarget())) {
																										if (parallelGateway
																												.equals(pgwToParallelStep
																														.getSource())) {
																											if (divergeFlow
																													.equals(divergeFlowToFlow
																															.getSource())) {
																												if (flow.equals(divergeFlowToFlow
																														.getTarget())) {
																													if (pattern_ParallelConvergingGatewayRule_2_3_black_nac_0BB(
																															step,
																															parallelStep) == null) {
																														for (Flow initFlow : org.moflon.util.eMoflonEMFUtil
																																.getOppositeReferenceTyped(
																																		parallelStep,
																																		Flow.class,
																																		"steps")) {
																															if (!flow
																																	.equals(initFlow)) {
																																_result.add(new Object[] {
																																		process,
																																		inFlow,
																																		parallelConvGateway,
																																		outFlow,
																																		flow,
																																		inFlowToFlow,
																																		step,
																																		inFlowToStep,
																																		initFlow,
																																		parallelStep,
																																		lane,
																																		laneSet,
																																		parallelGateway,
																																		pgwToParallelStep,
																																		divergeFlow,
																																		divergeFlowToFlow });
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_3_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFF(
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__parallelConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge initFlow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pgwToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pgwToParallelStep__parallelGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToFlow__divergeFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__parallelConvGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String inFlow__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__parallelConvGateway____sourceRef_name_prime = "sourceRef";
		String parallelConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String flow__step____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String inFlowToStep__inFlow____source_name_prime = "source";
		String inFlowToStep__step____target_name_prime = "target";
		String initFlow__parallelStep____steps_name_prime = "steps";
		String parallelStep__flow____invokedFlows_name_prime = "invokedFlows";
		String lane__parallelConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		String divergeFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__divergeFlow____outgoing_name_prime = "outgoing";
		String pgwToParallelStep__parallelStep____target_name_prime = "target";
		String pgwToParallelStep__parallelGateway____source_name_prime = "source";
		String divergeFlowToFlow__divergeFlow____source_name_prime = "source";
		String divergeFlowToFlow__flow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(inFlowToStep);
		isApplicableMatch.getAllContextElements().add(initFlow);
		isApplicableMatch.getAllContextElements().add(parallelStep);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(parallelGateway);
		isApplicableMatch.getAllContextElements().add(pgwToParallelStep);
		isApplicableMatch.getAllContextElements().add(divergeFlow);
		isApplicableMatch.getAllContextElements().add(divergeFlowToFlow);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__parallelConvGateway____flowElements.setSrc(process);
		process__parallelConvGateway____flowElements
				.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelConvGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				process__divergeFlow____flowElements);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelGateway____flowElements);
		inFlow__parallelConvGateway____targetRef.setSrc(inFlow);
		inFlow__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelConvGateway__inFlow____incoming);
		outFlow__parallelConvGateway____sourceRef.setSrc(outFlow);
		outFlow__parallelConvGateway____sourceRef.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__parallelConvGateway____sourceRef);
		parallelConvGateway__outFlow____outgoing.setSrc(parallelConvGateway);
		parallelConvGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelConvGateway__outFlow____outgoing);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		inFlowToStep__inFlow____source.setSrc(inFlowToStep);
		inFlowToStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__inFlow____source);
		inFlowToStep__step____target.setSrc(inFlowToStep);
		inFlowToStep__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__step____target);
		initFlow__parallelStep____steps.setSrc(initFlow);
		initFlow__parallelStep____steps.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				initFlow__parallelStep____steps);
		parallelStep__flow____invokedFlows.setSrc(parallelStep);
		parallelStep__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				parallelStep__flow____invokedFlows);
		lane__parallelConvGateway____flowNodeRefs.setSrc(lane);
		lane__parallelConvGateway____flowNodeRefs.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__parallelConvGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		divergeFlow__parallelGateway____sourceRef.setSrc(divergeFlow);
		divergeFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow__parallelGateway____sourceRef);
		parallelGateway__divergeFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__divergeFlow____outgoing.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__divergeFlow____outgoing);
		pgwToParallelStep__parallelStep____target.setSrc(pgwToParallelStep);
		pgwToParallelStep__parallelStep____target.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				pgwToParallelStep__parallelStep____target);
		pgwToParallelStep__parallelGateway____source.setSrc(pgwToParallelStep);
		pgwToParallelStep__parallelGateway____source.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				pgwToParallelStep__parallelGateway____source);
		divergeFlowToFlow__divergeFlow____source.setSrc(divergeFlowToFlow);
		divergeFlowToFlow__divergeFlow____source.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToFlow__divergeFlow____source);
		divergeFlowToFlow__flow____target.setSrc(divergeFlowToFlow);
		divergeFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToFlow__flow____target);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__parallelConvGateway____flowElements
				.setName(process__parallelConvGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		inFlow__parallelConvGateway____targetRef
				.setName(inFlow__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow____incoming
				.setName(parallelConvGateway__inFlow____incoming_name_prime);
		outFlow__parallelConvGateway____sourceRef
				.setName(outFlow__parallelConvGateway____sourceRef_name_prime);
		parallelConvGateway__outFlow____outgoing
				.setName(parallelConvGateway__outFlow____outgoing_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		inFlowToStep__inFlow____source
				.setName(inFlowToStep__inFlow____source_name_prime);
		inFlowToStep__step____target
				.setName(inFlowToStep__step____target_name_prime);
		initFlow__parallelStep____steps
				.setName(initFlow__parallelStep____steps_name_prime);
		parallelStep__flow____invokedFlows
				.setName(parallelStep__flow____invokedFlows_name_prime);
		lane__parallelConvGateway____flowNodeRefs
				.setName(lane__parallelConvGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		divergeFlow__parallelGateway____sourceRef
				.setName(divergeFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__divergeFlow____outgoing
				.setName(parallelGateway__divergeFlow____outgoing_name_prime);
		pgwToParallelStep__parallelStep____target
				.setName(pgwToParallelStep__parallelStep____target_name_prime);
		pgwToParallelStep__parallelGateway____source
				.setName(pgwToParallelStep__parallelGateway____source_name_prime);
		divergeFlowToFlow__divergeFlow____source
				.setName(divergeFlowToFlow__divergeFlow____source_name_prime);
		divergeFlowToFlow__flow____target
				.setName(divergeFlowToFlow__flow____target_name_prime);
		return new Object[] { process, inFlow, parallelConvGateway, outFlow,
				flow, inFlowToFlow, step, inFlowToStep, initFlow, parallelStep,
				lane, laneSet, parallelGateway, pgwToParallelStep, divergeFlow,
				divergeFlowToFlow, isApplicableMatch,
				process__inFlow____flowElements, process__laneSet____laneSets,
				process__parallelConvGateway____flowElements,
				process__outFlow____flowElements,
				process__divergeFlow____flowElements,
				process__parallelGateway____flowElements,
				inFlow__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow____incoming,
				outFlow__parallelConvGateway____sourceRef,
				parallelConvGateway__outFlow____outgoing, flow__step____steps,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				inFlowToStep__inFlow____source, inFlowToStep__step____target,
				initFlow__parallelStep____steps,
				parallelStep__flow____invokedFlows,
				lane__parallelConvGateway____flowNodeRefs,
				laneSet__lane____lanes,
				divergeFlow__parallelGateway____sourceRef,
				parallelGateway__divergeFlow____outgoing,
				pgwToParallelStep__parallelStep____target,
				pgwToParallelStep__parallelGateway____source,
				divergeFlowToFlow__divergeFlow____source,
				divergeFlowToFlow__flow____target };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_4_bindingFBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, inFlow, parallelConvGateway,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, initFlow,
				parallelStep, lane, laneSet, parallelGateway,
				pgwToParallelStep, divergeFlow, divergeFlowToFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, parallelConvGateway, outFlow, flow, inFlowToFlow,
					step, inFlowToStep, initFlow, parallelStep, lane, laneSet,
					parallelGateway, pgwToParallelStep, divergeFlow,
					divergeFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {
		Object[] result_pattern_ParallelConvergingGatewayRule_2_4_binding = pattern_ParallelConvergingGatewayRule_2_4_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, parallelConvGateway,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, initFlow,
				parallelStep, lane, laneSet, parallelGateway,
				pgwToParallelStep, divergeFlow, divergeFlowToFlow);
		if (result_pattern_ParallelConvergingGatewayRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelConvergingGatewayRule_2_4_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_2_4_black = pattern_ParallelConvergingGatewayRule_2_4_blackB(csp);
			if (result_pattern_ParallelConvergingGatewayRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, parallelConvGateway, outFlow, flow,
						inFlowToFlow, step, inFlowToStep, initFlow,
						parallelStep, lane, laneSet, parallelGateway,
						pgwToParallelStep, divergeFlow, divergeFlowToFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_2_5_expressionFBB(
			ParallelConvergingGatewayRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelConvergingGatewayRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelConvergingGatewayRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_10_1_binding = pattern_ParallelConvergingGatewayRule_10_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_10_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_10_1_black = pattern_ParallelConvergingGatewayRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_262326 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_10_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpParallelConvGateway = _edge_flowElements.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (process.getFlowElements().contains(parallelConvGateway)) {
					for (FlowElement tmpInFlow : process.getFlowElements()) {
						if (tmpInFlow instanceof SequenceFlow) {
							SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
							if (parallelConvGateway.equals(inFlow
									.getTargetRef())) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (FlowElement tmpOutFlow : process
											.getFlowElements()) {
										if (tmpOutFlow instanceof SequenceFlow) {
											SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
											if (!inFlow.equals(outFlow)) {
												if (parallelConvGateway
														.equals(outFlow
																.getSourceRef())) {
													if (pattern_ParallelConvergingGatewayRule_10_2_black_nac_0B(outFlow) == null) {
														if (pattern_ParallelConvergingGatewayRule_10_2_black_nac_1BB(
																outFlow,
																parallelConvGateway) == null) {
															for (FlowElement tmpDivergeFlow : process
																	.getFlowElements()) {
																if (tmpDivergeFlow instanceof SequenceFlow) {
																	SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																	if (!divergeFlow
																			.equals(inFlow)) {
																		if (!divergeFlow
																				.equals(outFlow)) {
																			FlowNode tmpParallelGateway = divergeFlow
																					.getSourceRef();
																			if (tmpParallelGateway instanceof ParallelGateway) {
																				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																				if (!parallelConvGateway
																						.equals(parallelGateway)) {
																					if (process
																							.getFlowElements()
																							.contains(
																									parallelGateway)) {
																						if (pattern_ParallelConvergingGatewayRule_10_2_black_nac_2BB(
																								divergeFlow,
																								parallelConvGateway) == null) {
																							for (Lane lane : laneSet
																									.getLanes()) {
																								if (lane.getFlowNodeRefs()
																										.contains(
																												parallelConvGateway)) {
																									_result.add(new Object[] {
																											process,
																											inFlow,
																											parallelConvGateway,
																											outFlow,
																											lane,
																											laneSet,
																											parallelGateway,
																											divergeFlow,
																											_edge_flowElements });
																								}
																							}
																						}
																					}
																				}
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_10_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_10_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_11_1_binding = pattern_ParallelConvergingGatewayRule_11_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_11_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_11_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_11_1_black = pattern_ParallelConvergingGatewayRule_11_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_11_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_11_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_778129 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_11_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpParallelConvGateway = outFlow.getSourceRef();
					if (tmpParallelConvGateway instanceof ParallelGateway) {
						ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
						if (process.getFlowElements().contains(
								parallelConvGateway)) {
							if (pattern_ParallelConvergingGatewayRule_11_2_black_nac_0B(outFlow) == null) {
								if (pattern_ParallelConvergingGatewayRule_11_2_black_nac_1BB(
										outFlow, parallelConvGateway) == null) {
									for (FlowElement tmpInFlow : process
											.getFlowElements()) {
										if (tmpInFlow instanceof SequenceFlow) {
											SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
											if (!inFlow.equals(outFlow)) {
												if (parallelConvGateway
														.equals(inFlow
																.getTargetRef())) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (FlowElement tmpDivergeFlow : process
																.getFlowElements()) {
															if (tmpDivergeFlow instanceof SequenceFlow) {
																SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																if (!divergeFlow
																		.equals(inFlow)) {
																	if (!divergeFlow
																			.equals(outFlow)) {
																		FlowNode tmpParallelGateway = divergeFlow
																				.getSourceRef();
																		if (tmpParallelGateway instanceof ParallelGateway) {
																			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																			if (!parallelConvGateway
																					.equals(parallelGateway)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								parallelGateway)) {
																					if (pattern_ParallelConvergingGatewayRule_11_2_black_nac_2BB(
																							divergeFlow,
																							parallelConvGateway) == null) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											parallelConvGateway)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										lane,
																										laneSet,
																										parallelGateway,
																										divergeFlow,
																										_edge_flowElements });
																							}
																						}
																					}
																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_11_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_11_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_11_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_11_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_12_1_binding = pattern_ParallelConvergingGatewayRule_12_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_12_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_12_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_12_1_black = pattern_ParallelConvergingGatewayRule_12_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_12_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_12_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_350825 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_12_2_blackFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpParallelConvGateway = _edge_targetRef.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (parallelConvGateway.equals(inFlow.getTargetRef())) {
					for (SequenceFlow outFlow : parallelConvGateway
							.getOutgoing()) {
						if (!inFlow.equals(outFlow)) {
							if (pattern_ParallelConvergingGatewayRule_12_2_black_nac_0B(outFlow) == null) {
								if (pattern_ParallelConvergingGatewayRule_12_2_black_nac_1BB(
										outFlow, parallelConvGateway) == null) {
									for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													inFlow,
													FlowElementsContainer.class,
													"flowElements")) {
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											if (process
													.getFlowElements()
													.contains(
															parallelConvGateway)) {
												if (process.getFlowElements()
														.contains(outFlow)) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (FlowElement tmpDivergeFlow : process
																.getFlowElements()) {
															if (tmpDivergeFlow instanceof SequenceFlow) {
																SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																if (!divergeFlow
																		.equals(inFlow)) {
																	if (!divergeFlow
																			.equals(outFlow)) {
																		FlowNode tmpParallelGateway = divergeFlow
																				.getSourceRef();
																		if (tmpParallelGateway instanceof ParallelGateway) {
																			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																			if (!parallelConvGateway
																					.equals(parallelGateway)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								parallelGateway)) {
																					if (pattern_ParallelConvergingGatewayRule_12_2_black_nac_2BB(
																							divergeFlow,
																							parallelConvGateway) == null) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											parallelConvGateway)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										lane,
																										laneSet,
																										parallelGateway,
																										divergeFlow,
																										_edge_targetRef });
																							}
																						}
																					}
																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_12_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_12_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_12_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_12_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_13_1_binding = pattern_ParallelConvergingGatewayRule_13_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_13_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_13_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_13_1_black = pattern_ParallelConvergingGatewayRule_13_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_13_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_13_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_139727 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_13_2_blackFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelConvGateway = _edge_incoming.getSrc();
		if (tmpParallelConvGateway instanceof ParallelGateway) {
			ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (parallelConvGateway.equals(inFlow.getTargetRef())) {
					for (SequenceFlow outFlow : parallelConvGateway
							.getOutgoing()) {
						if (!inFlow.equals(outFlow)) {
							if (pattern_ParallelConvergingGatewayRule_13_2_black_nac_0B(outFlow) == null) {
								if (pattern_ParallelConvergingGatewayRule_13_2_black_nac_1BB(
										outFlow, parallelConvGateway) == null) {
									for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													parallelConvGateway,
													FlowElementsContainer.class,
													"flowElements")) {
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											if (process.getFlowElements()
													.contains(inFlow)) {
												if (process.getFlowElements()
														.contains(outFlow)) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (FlowElement tmpDivergeFlow : process
																.getFlowElements()) {
															if (tmpDivergeFlow instanceof SequenceFlow) {
																SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																if (!divergeFlow
																		.equals(inFlow)) {
																	if (!divergeFlow
																			.equals(outFlow)) {
																		FlowNode tmpParallelGateway = divergeFlow
																				.getSourceRef();
																		if (tmpParallelGateway instanceof ParallelGateway) {
																			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																			if (!parallelConvGateway
																					.equals(parallelGateway)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								parallelGateway)) {
																					if (pattern_ParallelConvergingGatewayRule_13_2_black_nac_2BB(
																							divergeFlow,
																							parallelConvGateway) == null) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											parallelConvGateway)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										lane,
																										laneSet,
																										parallelGateway,
																										divergeFlow,
																										_edge_incoming });
																							}
																						}
																					}
																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_13_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_13_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_13_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_13_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_14_1_binding = pattern_ParallelConvergingGatewayRule_14_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_14_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_14_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_14_1_black = pattern_ParallelConvergingGatewayRule_14_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_14_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_14_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_721175 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_14_2_blackFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpParallelConvGateway = _edge_sourceRef.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (parallelConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ParallelConvergingGatewayRule_14_2_black_nac_0B(outFlow) == null) {
						if (pattern_ParallelConvergingGatewayRule_14_2_black_nac_1BB(
								outFlow, parallelConvGateway) == null) {
							for (SequenceFlow inFlow : parallelConvGateway
									.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													outFlow,
													FlowElementsContainer.class,
													"flowElements")) {
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											if (process.getFlowElements()
													.contains(inFlow)) {
												if (process
														.getFlowElements()
														.contains(
																parallelConvGateway)) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (FlowElement tmpDivergeFlow : process
																.getFlowElements()) {
															if (tmpDivergeFlow instanceof SequenceFlow) {
																SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																if (!divergeFlow
																		.equals(inFlow)) {
																	if (!divergeFlow
																			.equals(outFlow)) {
																		FlowNode tmpParallelGateway = divergeFlow
																				.getSourceRef();
																		if (tmpParallelGateway instanceof ParallelGateway) {
																			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																			if (!parallelConvGateway
																					.equals(parallelGateway)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								parallelGateway)) {
																					if (pattern_ParallelConvergingGatewayRule_14_2_black_nac_2BB(
																							divergeFlow,
																							parallelConvGateway) == null) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											parallelConvGateway)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										lane,
																										laneSet,
																										parallelGateway,
																										divergeFlow,
																										_edge_sourceRef });
																							}
																						}
																					}
																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_14_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_14_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_14_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_14_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_15_1_binding = pattern_ParallelConvergingGatewayRule_15_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_15_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_15_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_15_1_black = pattern_ParallelConvergingGatewayRule_15_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_15_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_15_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_346548 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_15_2_blackFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelConvGateway = _edge_outgoing.getSrc();
		if (tmpParallelConvGateway instanceof ParallelGateway) {
			ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (parallelConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ParallelConvergingGatewayRule_15_2_black_nac_0B(outFlow) == null) {
						if (pattern_ParallelConvergingGatewayRule_15_2_black_nac_1BB(
								outFlow, parallelConvGateway) == null) {
							for (SequenceFlow inFlow : parallelConvGateway
									.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													parallelConvGateway,
													FlowElementsContainer.class,
													"flowElements")) {
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											if (process.getFlowElements()
													.contains(inFlow)) {
												if (process.getFlowElements()
														.contains(outFlow)) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (FlowElement tmpDivergeFlow : process
																.getFlowElements()) {
															if (tmpDivergeFlow instanceof SequenceFlow) {
																SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																if (!divergeFlow
																		.equals(inFlow)) {
																	if (!divergeFlow
																			.equals(outFlow)) {
																		FlowNode tmpParallelGateway = divergeFlow
																				.getSourceRef();
																		if (tmpParallelGateway instanceof ParallelGateway) {
																			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																			if (!parallelConvGateway
																					.equals(parallelGateway)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								parallelGateway)) {
																					if (pattern_ParallelConvergingGatewayRule_15_2_black_nac_2BB(
																							divergeFlow,
																							parallelConvGateway) == null) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											parallelConvGateway)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										lane,
																										laneSet,
																										parallelGateway,
																										divergeFlow,
																										_edge_outgoing });
																							}
																						}
																					}
																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_15_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_15_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_15_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_15_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_1_bindingFB(
			ParallelConvergingGatewayRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_1_bindingAndBlackFFB(
			ParallelConvergingGatewayRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayRule_16_1_binding = pattern_ParallelConvergingGatewayRule_16_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayRule_16_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayRule_16_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_16_1_black = pattern_ParallelConvergingGatewayRule_16_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayRule_16_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayRule_16_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_742830 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_2_black_nac_1BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_2_black_nac_2BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_16_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpParallelConvGateway = _edge_flowNodeRefs.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (lane.getFlowNodeRefs().contains(parallelConvGateway)) {
					for (SequenceFlow inFlow : parallelConvGateway
							.getIncoming()) {
						for (SequenceFlow outFlow : parallelConvGateway
								.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ParallelConvergingGatewayRule_16_2_black_nac_0B(outFlow) == null) {
									if (pattern_ParallelConvergingGatewayRule_16_2_black_nac_1BB(
											outFlow, parallelConvGateway) == null) {
										for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														lane, LaneSet.class,
														"lanes")) {
											for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															parallelConvGateway,
															FlowElementsContainer.class,
															"flowElements")) {
												if (tmpProcess instanceof bpmn2.Process) {
													bpmn2.Process process = (bpmn2.Process) tmpProcess;
													if (process
															.getFlowElements()
															.contains(inFlow)) {
														if (process
																.getLaneSets()
																.contains(
																		laneSet)) {
															if (process
																	.getFlowElements()
																	.contains(
																			outFlow)) {
																for (FlowElement tmpDivergeFlow : process
																		.getFlowElements()) {
																	if (tmpDivergeFlow instanceof SequenceFlow) {
																		SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																		if (!divergeFlow
																				.equals(inFlow)) {
																			if (!divergeFlow
																					.equals(outFlow)) {
																				FlowNode tmpParallelGateway = divergeFlow
																						.getSourceRef();
																				if (tmpParallelGateway instanceof ParallelGateway) {
																					ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																					if (!parallelConvGateway
																							.equals(parallelGateway)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										parallelGateway)) {
																							if (pattern_ParallelConvergingGatewayRule_16_2_black_nac_2BB(
																									divergeFlow,
																									parallelConvGateway) == null) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										lane,
																										laneSet,
																										parallelGateway,
																										divergeFlow,
																										_edge_flowNodeRefs });
																							}
																						}
																					}
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayRule_16_3_expressionFBBBBBBBBBB(
			ParallelConvergingGatewayRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, parallelConvGateway, outFlow, lane, laneSet,
				parallelGateway, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_16_4_expressionFBB(
			ParallelConvergingGatewayRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_16_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayRule_16_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_1_blackB(
			ParallelConvergingGatewayRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ParallelFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlowToStep inFlowToStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToStep)) {
			return new Object[] { ruleResult, inFlowToStep };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ParallelStep parallelStep) {
		if (ruleResult.getTargetObjects().contains(parallelStep)) {
			return new Object[] { ruleResult, parallelStep };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Flow initFlow) {
		if (ruleResult.getTargetObjects().contains(initFlow)) {
			return new Object[] { ruleResult, initFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			FlowNodeToStep pgwToParallelStep) {
		if (ruleResult.getCorrObjects().contains(pgwToParallelStep)) {
			return new Object[] { ruleResult, pgwToParallelStep };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, ParallelGateway parallelGateway) {
		if (ruleResult.getSourceObjects().contains(parallelGateway)) {
			return new Object[] { ruleResult, parallelGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow divergeFlow) {
		if (ruleResult.getSourceObjects().contains(divergeFlow)) {
			return new Object[] { ruleResult, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(divergeFlowToFlow)) {
			return new Object[] { ruleResult, divergeFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_2_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayRule_18_2_blackFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlowToFlowList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlowToFlow : inFlowToFlowList.getEntryObjects()) {
				if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
					SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
					SequenceFlow inFlow = inFlowToFlow.getSource();
					if (inFlow != null) {
						Flow tmpFlow = inFlowToFlow.getTarget();
						if (tmpFlow instanceof ParallelFlow) {
							ParallelFlow flow = (ParallelFlow) tmpFlow;
							if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_2BB(
									ruleResult, inFlowToFlow) == null) {
								if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_1BB(
										ruleResult, inFlow) == null) {
									if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_3BB(
											ruleResult, flow) == null) {
										for (Step step : flow.getSteps()) {
											if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_4BB(
													ruleResult, step) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																inFlow,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_0BB(
																ruleResult,
																process) == null) {
															for (FlowElement tmpParallelGateway : process
																	.getFlowElements()) {
																if (tmpParallelGateway instanceof ParallelGateway) {
																	ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																	if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_9BB(
																			ruleResult,
																			parallelGateway) == null) {
																		for (FlowElement tmpDivergeFlow : process
																				.getFlowElements()) {
																			if (tmpDivergeFlow instanceof SequenceFlow) {
																				SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																				if (!divergeFlow
																						.equals(inFlow)) {
																					if (parallelGateway
																							.equals(divergeFlow
																									.getSourceRef())) {
																						if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_10BB(
																								ruleResult,
																								divergeFlow) == null) {
																							for (LaneSet laneSet : process
																									.getLaneSets()) {
																								if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_12BB(
																										ruleResult,
																										laneSet) == null) {
																									for (Lane lane : laneSet
																											.getLanes()) {
																										if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_13BB(
																												ruleResult,
																												lane) == null) {
																											for (SequenceFlowToStep inFlowToStep : org.moflon.util.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															inFlow,
																															SequenceFlowToStep.class,
																															"source")) {
																												if (step.equals(inFlowToStep
																														.getTarget())) {
																													if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_5BB(
																															ruleResult,
																															inFlowToStep) == null) {
																														for (ParallelStep parallelStep : org.moflon.util.eMoflonEMFUtil
																																.getOppositeReferenceTyped(
																																		flow,
																																		ParallelStep.class,
																																		"invokedFlows")) {
																															if (!parallelStep
																																	.equals(step)) {
																																if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_6BB(
																																		ruleResult,
																																		parallelStep) == null) {
																																	for (SequenceFlowToUCFlow divergeFlowToFlow : org.moflon.util.eMoflonEMFUtil
																																			.getOppositeReferenceTyped(
																																					flow,
																																					SequenceFlowToUCFlow.class,
																																					"target")) {
																																		if (!divergeFlowToFlow
																																				.equals(inFlowToFlow)) {
																																			if (divergeFlow
																																					.equals(divergeFlowToFlow
																																							.getSource())) {
																																				if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_11BB(
																																						ruleResult,
																																						divergeFlowToFlow) == null) {
																																					for (FlowNodeToStep pgwToParallelStep : org.moflon.util.eMoflonEMFUtil
																																							.getOppositeReferenceTyped(
																																									parallelGateway,
																																									FlowNodeToStep.class,
																																									"source")) {
																																						if (parallelStep
																																								.equals(pgwToParallelStep
																																										.getTarget())) {
																																							if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_8BB(
																																									ruleResult,
																																									pgwToParallelStep) == null) {
																																								for (Flow initFlow : org.moflon.util.eMoflonEMFUtil
																																										.getOppositeReferenceTyped(
																																												parallelStep,
																																												Flow.class,
																																												"steps")) {
																																									if (!flow
																																											.equals(initFlow)) {
																																										if (pattern_ParallelConvergingGatewayRule_18_2_black_nac_7BB(
																																												ruleResult,
																																												initFlow) == null) {
																																											_result.add(new Object[] {
																																													inFlowToFlowList,
																																													process,
																																													inFlow,
																																													inFlowToFlow,
																																													flow,
																																													step,
																																													inFlowToStep,
																																													parallelStep,
																																													initFlow,
																																													pgwToParallelStep,
																																													parallelGateway,
																																													divergeFlow,
																																													divergeFlowToFlow,
																																													laneSet,
																																													lane,
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
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_3_bindingFBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, inFlow, flow, inFlowToFlow, step,
				inFlowToStep, initFlow, parallelStep, lane, laneSet,
				parallelGateway, pgwToParallelStep, divergeFlow,
				divergeFlowToFlow, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, flow, inFlowToFlow, step, inFlowToStep, initFlow,
					parallelStep, lane, laneSet, parallelGateway,
					pgwToParallelStep, divergeFlow, divergeFlowToFlow,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_3_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelConvergingGatewayRule_18_3_binding = pattern_ParallelConvergingGatewayRule_18_3_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, flow, inFlowToFlow,
				step, inFlowToStep, initFlow, parallelStep, lane, laneSet,
				parallelGateway, pgwToParallelStep, divergeFlow,
				divergeFlowToFlow, ruleResult);
		if (result_pattern_ParallelConvergingGatewayRule_18_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelConvergingGatewayRule_18_3_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayRule_18_3_black = pattern_ParallelConvergingGatewayRule_18_3_blackB(csp);
			if (result_pattern_ParallelConvergingGatewayRule_18_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, flow, inFlowToFlow, step, inFlowToStep,
						initFlow, parallelStep, lane, laneSet, parallelGateway,
						pgwToParallelStep, divergeFlow, divergeFlowToFlow,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelConvergingGatewayRule_18_4_expressionFBB(
			ParallelConvergingGatewayRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_5_black_nac_0BB(
			Step step, ParallelStep parallelStep) {
		if (!parallelStep.equals(step)) {
			Step nextStep = step.getNext();
			if (nextStep != null) {
				if (!step.equals(nextStep)) {
					if (!parallelStep.equals(nextStep)) {
						return new Object[] { step, parallelStep };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_5_blackBBBBBBBBBBBBBB(
			Step step, bpmn2.Process process, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {
		if (!flow.equals(initFlow)) {
			if (!parallelStep.equals(step)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!divergeFlowToFlow.equals(inFlowToFlow)) {
						if (pattern_ParallelConvergingGatewayRule_18_5_black_nac_0BB(
								step, parallelStep) == null) {
							return new Object[] { step, process, inFlow, flow,
									inFlowToFlow, inFlowToStep, initFlow,
									parallelStep, lane, laneSet,
									parallelGateway, pgwToParallelStep,
									divergeFlow, divergeFlowToFlow };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_6_blackBBBBBBBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		if (!flow.equals(initFlow)) {
			if (!parallelStep.equals(step)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!divergeFlowToFlow.equals(inFlowToFlow)) {
						return new Object[] { process, inFlow, flow,
								inFlowToFlow, step, inFlowToStep, initFlow,
								parallelStep, lane, laneSet, parallelGateway,
								pgwToParallelStep, divergeFlow,
								divergeFlowToFlow, ruleResult };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayRule_18_6_greenBBFFBBFFFBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow initFlow,
			ParallelStep parallelStep, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelGateway parallelConvGateway = Bpmn2Factory.eINSTANCE
				.createParallelGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep pcgwToParStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("parallelConvGateway",
				"gatewayDirection");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(parallelConvGateway);
		inFlow.setTargetRef(parallelConvGateway);
		lane.getFlowNodeRefs().add(parallelConvGateway);
		ruleResult.getSourceObjects().add(parallelConvGateway);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(parallelConvGateway);
		ruleResult.getSourceObjects().add(outFlow);
		pcgwToParStep.setSource(parallelConvGateway);
		pcgwToParStep.setTarget(parallelStep);
		ruleResult.getCorrObjects().add(pcgwToParStep);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		ruleResult.getCorrObjects().add(outFlowToInitFlow);
		outFlowToParallelStep.setSource(outFlow);
		outFlowToParallelStep.setTarget(parallelStep);
		ruleResult.getCorrObjects().add(outFlowToParallelStep);
		GatewayDirection parallelConvGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		parallelConvGateway
				.setGatewayDirection(parallelConvGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, inFlow, parallelConvGateway, outFlow,
				initFlow, parallelStep, pcgwToParStep, outFlowToInitFlow,
				outFlowToParallelStep, lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelConvergingGatewayRule_18_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelConvergingGatewayRuleImpl
