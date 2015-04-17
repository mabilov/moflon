/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ProcessToActor;

import BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule;
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

import UseCaseDSL.Actor;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.GatewayDirection;
import bpmn2.Lane;
import bpmn2.LaneSet;
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
 * An implementation of the model object '<em><b>Exclusive Gateway To Step Core Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExclusiveGatewayToStepCoreRuleImpl extends AbstractRuleImpl
		implements ExclusiveGatewayToStepCoreRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveGatewayToStepCoreRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExclusiveGatewayToStepCoreRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_0_1_blackBBBBBBBB(this,
						match, process, inFlow, exclusiveGateway, outFlow,
						lane, laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_0_2_bindingAndBlackFBBBBBBBB(
						this, match, process, inFlow, exclusiveGateway,
						outFlow, lane, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_4_blackBBBBBBB(
							match, process, inFlow, exclusiveGateway, outFlow,
							lane, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_4_greenBBBBBBFFFFFFFF(
							match, process, inFlow, exclusiveGateway, outFlow,
							lane);
			// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result4_green[12];
			// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_5_blackBBBBBBB(
							match, process, inFlow, exclusiveGateway, outFlow,
							lane, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_5_greenBBBBBFFF(
							match, process, inFlow, lane, laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_6_expressionBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet);
			return ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_7_expressionF();
		} else {
			return ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_1_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[0];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[1];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[2];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_bindingAndBlack[3];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		Actor actor = (Actor) result1_bindingAndBlack[6];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[7];
		Lane lane = (Lane) result1_bindingAndBlack[8];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_1_greenFFBBFFBBB(
						exclusiveGateway, outFlow, flow, actor, csp);
		NormalStep normalStep = (NormalStep) result1_green[0];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[1];
		FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result1_green[4];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[5];

		// collect translated elements
		Object[] result2_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_2_blackBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_2_greenFBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_3_blackBBBBBBBBBBBBBBB(
						ruleresult, normalStep, outFlowToFlow, inFlowToFlow,
						process, inFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, processToActor, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, normalStep, outFlowToFlow, process, inFlow,
						exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, lane);
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[12];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[19];
		// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[20];
		// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result3_green[21];
		// EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[26];
		// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result3_green[27];

		// perform postprocessing story node is empty
		// register objects
		ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_5_expressionBBBBBBBBBBBBBBBB(
						this, ruleresult, normalStep, outFlowToFlow,
						inFlowToFlow, process, inFlow, exclusiveGateway,
						outFlow, exclusiveGatewayToNormalStep,
						outFlowToNormalStep, flow, actor, processToActor, lane,
						laneSet);
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[1];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_binding[2];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[3];
		Lane lane = (Lane) result2_binding[4];
		LaneSet laneSet = (LaneSet) result2_binding[5];
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_2_2_blackFBBBBFFFBBB(
						process, inFlow, exclusiveGateway, outFlow, lane,
						laneSet, match)) {
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[0];
			Flow flow = (Flow) result2_black[5];
			Actor actor = (Actor) result2_black[6];
			ProcessToActor processToActor = (ProcessToActor) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_2_3_blackBBBBBBBBBB(
							inFlowToFlow, process, inFlow, exclusiveGateway,
							outFlow, flow, actor, processToActor, lane, laneSet)) {
				Object[] result3_green = ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
								inFlowToFlow, process, inFlow,
								exclusiveGateway, outFlow, flow, actor,
								processToActor, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result3_green[18];
				// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result3_green[21];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result3_green[24];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_2_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, inFlowToFlow, process,
								inFlow, exclusiveGateway, outFlow, flow, actor,
								processToActor, lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
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
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", true, csp);
		var_exclusiveGateway_id.setValue(exclusiveGateway.getId());
		var_exclusiveGateway_id.setType("String");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", true, csp);
		var_exclusiveGateway_name.setValue(exclusiveGateway.getName());
		var_exclusiveGateway_name.setType("String");

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor, EObject lane, EObject laneSet) {
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("exclusiveGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getExclusiveGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
		// initial bindings
		Object[] result1_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_10_1_blackBBBBB(this,
						match, normalStep, flow, actor);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_10_2_bindingAndBlackFBBBBB(
						this, match, normalStep, flow, actor);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_4_blackBBBB(
							match, normalStep, flow, actor);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_4_greenBBBBFF(
							match, normalStep, flow, actor);
			// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_5_blackBBBB(
							match, normalStep, flow, actor);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_5_greenBBB(
							match, flow, actor);

			// register objects to match
			ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_6_expressionBBBBB(
							this, match, normalStep, flow, actor);
			return ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_7_expressionF();
		} else {
			return ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[0];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[1];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[2];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[6];
		Lane lane = (Lane) result1_bindingAndBlack[7];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_1_greenBFBBFFFFBBB(
						normalStep, process, inFlow, flow, lane, csp);
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[1];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_green[4];
		SequenceFlow outFlow = (SequenceFlow) result1_green[5];
		FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result1_green[6];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[7];

		// collect translated elements
		Object[] result2_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_2_blackBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_2_greenFBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_3_blackBBBBBBBBBBBBBBB(
						ruleresult, normalStep, outFlowToFlow, inFlowToFlow,
						process, inFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, processToActor, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, normalStep, outFlowToFlow, process, inFlow,
						exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, lane);
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[12];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[19];
		// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[20];
		// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result3_green[21];
		// EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[26];
		// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result3_green[27];

		// perform postprocessing story node is empty
		// register objects
		ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_5_expressionBBBBBBBBBBBBBBBB(
						this, ruleresult, normalStep, outFlowToFlow,
						inFlowToFlow, process, inFlow, exclusiveGateway,
						outFlow, exclusiveGatewayToNormalStep,
						outFlowToNormalStep, flow, actor, processToActor, lane,
						laneSet);
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		NormalStep normalStep = (NormalStep) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		Actor actor = (Actor) result2_binding[2];
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_12_2_blackBFFFBBFB(
						normalStep, flow, actor, match)) {
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			ProcessToActor processToActor = (ProcessToActor) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_12_3_blackBBBBBBBFF(
							normalStep, inFlowToFlow, process, inFlow, flow,
							actor, processToActor)) {
				Lane lane = (Lane) result3_black[7];
				LaneSet laneSet = (LaneSet) result3_black[8];
				Object[] result3_green = ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_12_3_greenBBBBBBBBBFFFFFFFFFF(
								normalStep, inFlowToFlow, process, inFlow,
								flow, actor, processToActor, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[10];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, normalStep,
								inFlowToFlow, process, inFlow, flow, actor,
								processToActor, lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
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
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		var_normalStep_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());
		var_normalStep_label.setType("String");

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		var_exclusiveGateway_id.setType("String");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		var_exclusiveGateway_name.setType("String");
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor, EObject lane, EObject laneSet) {
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("normalStep").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_14(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_20_2_blackFFFB(_edge_actor)) {
			NormalStep normalStep = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_20_3_expressionFBBBBB(
							this, match, normalStep, flow, actor)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_31(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_21_2_blackFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_21_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_32(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_22_2_blackFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_22_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_33(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_23_2_blackFFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_23_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_34(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_24_2_blackFFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_24_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_35(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_25_2_blackFFFFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_25_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_36(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_26_2_blackFFFFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_26_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(
			EMoflonEdge _edge_default) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_27_2_blackFFFFFFB(_edge_default)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_27_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_15(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_28_2_blackFFFB(_edge_steps)) {
			NormalStep normalStep = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_28_3_expressionFBBBBB(
							this, match, normalStep, flow, actor)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_29_2_blackFFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_29_3_expressionFBBBBBBBB(
							this, match, process, inFlow, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_29_6_expressionFB(__result);
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
			SequenceFlowToUCFlow inFlowToFlowParameter) {
		// create result
		Object[] result1_black = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_32_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_32_2_blackFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToFlowList = (RuleEntryList) result2_black[0];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			ProcessToActor processToActor = (ProcessToActor) result2_black[6];
			Actor actor = (Actor) result2_black[7];
			Flow flow = (Flow) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_32_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, inFlowToFlow, process,
							inFlow, flow, actor, processToActor, lane, laneSet,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ExclusiveGatewayToStepCoreRuleImpl
					.pattern_ExclusiveGatewayToStepCoreRule_32_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ExclusiveGatewayToStepCoreRuleImpl
						.pattern_ExclusiveGatewayToStepCoreRule_32_5_blackBBBBBBBB(
								inFlowToFlow, process, inFlow, flow, actor,
								processToActor, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_32_6_blackBBBBBBBBB(
									inFlowToFlow, process, inFlow, flow, actor,
									processToActor, lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ExclusiveGatewayToStepCoreRuleImpl
							.pattern_ExclusiveGatewayToStepCoreRule_32_6_greenFFBBFFFFBBBBB(
									process, inFlow, flow, actor, lane,
									ruleResult, csp);
					// NormalStep normalStep = (NormalStep) result6_green[0];
					// SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result6_green[1];
					// ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result6_green[4];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[5];
					// FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result6_green[6];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepCoreRuleImpl
				.pattern_ExclusiveGatewayToStepCoreRule_32_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		var_exclusiveGateway_id.setType("String");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		var_exclusiveGateway_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Flow) arguments.get(6),
					(Actor) arguments.get(7),
					(ProcessToActor) arguments.get(8), (Lane) arguments.get(9),
					(LaneSet) arguments.get(10));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(NormalStep) arguments.get(1),
					(SequenceFlowToUCFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_14((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_33((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_34((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_35((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_36((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_15((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(Actor) arguments.get(5),
					(ProcessToActor) arguments.get(6), (Lane) arguments.get(7),
					(LaneSet) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_1_blackBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { _this, match, process, inFlow,
					exclusiveGateway, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_2_bindingFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, inFlow,
					exclusiveGateway, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_2_bindingAndBlackFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_0_2_binding = pattern_ExclusiveGatewayToStepCoreRule_0_2_bindingFBBBBBBBB(
				_this, match, process, inFlow, exclusiveGateway, outFlow, lane,
				laneSet);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_0_2_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_0_2_black = pattern_ExclusiveGatewayToStepCoreRule_0_2_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process, inFlow,
						exclusiveGateway, outFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_0_3_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_4_blackBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { match, process, inFlow, exclusiveGateway,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_4_greenBBBBBBFFFFFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(exclusiveGateway);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges()
				.add(exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		match.getToBeTranslatedEdges()
				.add(exclusiveGateway__outFlow____default);
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				lane__exclusiveGateway____flowNodeRefs);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		return new Object[] { match, process, inFlow, exclusiveGateway,
				outFlow, lane, process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				lane__exclusiveGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_5_blackBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { match, process, inFlow, exclusiveGateway,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_0_5_greenBBBBBFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow, Lane lane,
			LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, process, inFlow, lane, laneSet,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes };
	}

	public static final void pattern_ExclusiveGatewayToStepCoreRule_0_6_expressionBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, process, inFlow,
				exclusiveGateway, outFlow, lane, laneSet);

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("exclusiveGateway");
		EObject _localVariable_4 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("actor");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_8 = isApplicableMatch.getObject("lane");
		EObject _localVariable_9 = isApplicableMatch.getObject("laneSet");
		EObject tmpInFlowToFlow = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpExclusiveGateway = _localVariable_3;
		EObject tmpOutFlow = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpActor = _localVariable_6;
		EObject tmpProcessToActor = _localVariable_7;
		EObject tmpLane = _localVariable_8;
		EObject tmpLaneSet = _localVariable_9;
		if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpExclusiveGateway instanceof ExclusiveGateway) {
						ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
						if (tmpOutFlow instanceof SequenceFlow) {
							SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpActor instanceof Actor) {
									Actor actor = (Actor) tmpActor;
									if (tmpProcessToActor instanceof ProcessToActor) {
										ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
										if (tmpLane instanceof Lane) {
											Lane lane = (Lane) tmpLane;
											if (tmpLaneSet instanceof LaneSet) {
												LaneSet laneSet = (LaneSet) tmpLaneSet;
												return new Object[] {
														inFlowToFlow, process,
														inFlow,
														exclusiveGateway,
														outFlow, flow, actor,
														processToActor, lane,
														laneSet,
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_1_blackBBBBBBBBBBFBB(
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet,
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { inFlowToFlow, process, inFlow,
							exclusiveGateway, outFlow, flow, actor,
							processToActor, lane, laneSet, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_1_bindingAndBlackFFFFFFFFFFFBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding = pattern_ExclusiveGatewayToStepCoreRule_1_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding != null) {
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[0];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[1];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[3];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[4];
			Flow flow = (Flow) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[5];
			Actor actor = (Actor) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[6];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[7];
			Lane lane = (Lane) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[8];
			LaneSet laneSet = (LaneSet) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_binding[9];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_1_1_black = pattern_ExclusiveGatewayToStepCoreRule_1_1_blackBBBBBBBBBBFBB(
					inFlowToFlow, process, inFlow, exclusiveGateway, outFlow,
					flow, actor, processToActor, lane, laneSet, _this,
					isApplicableMatch);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_1_1_black[10];

				return new Object[] { inFlowToFlow, process, inFlow,
						exclusiveGateway, outFlow, flow, actor, processToActor,
						lane, laneSet, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_1_greenFFBBFFBBB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		FlowNodeToStep exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		exclusiveGatewayToNormalStep.setSource(exclusiveGateway);
		exclusiveGatewayToNormalStep.setTarget(normalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		return new Object[] { normalStep, outFlowToFlow, exclusiveGateway,
				outFlow, exclusiveGatewayToNormalStep, outFlowToNormalStep,
				flow, actor, csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_2_blackBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { normalStep, outFlowToFlow, exclusiveGateway,
				outFlow, exclusiveGatewayToNormalStep, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_2_greenFBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(normalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		ruleresult.getTranslatedElements().add(exclusiveGateway);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(exclusiveGatewayToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, normalStep, outFlowToFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_3_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject normalStep,
			EObject outFlowToFlow, EObject inFlowToFlow, EObject process,
			EObject inFlow, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		if (!normalStep.equals(outFlowToFlow)) {
			if (!normalStep.equals(process)) {
				if (!normalStep.equals(outFlow)) {
					if (!normalStep.equals(outFlowToNormalStep)) {
						if (!normalStep.equals(processToActor)) {
							if (!outFlowToFlow.equals(process)) {
								if (!outFlowToFlow.equals(outFlowToNormalStep)) {
									if (!outFlowToFlow.equals(processToActor)) {
										if (!inFlowToFlow.equals(normalStep)) {
											if (!inFlowToFlow
													.equals(outFlowToFlow)) {
												if (!inFlowToFlow
														.equals(process)) {
													if (!inFlowToFlow
															.equals(outFlow)) {
														if (!inFlowToFlow
																.equals(outFlowToNormalStep)) {
															if (!inFlowToFlow
																	.equals(processToActor)) {
																if (!inFlowToFlow
																		.equals(lane)) {
																	if (!inFlowToFlow
																			.equals(laneSet)) {
																		if (!process
																				.equals(processToActor)) {
																			if (!inFlow
																					.equals(normalStep)) {
																				if (!inFlow
																						.equals(outFlowToFlow)) {
																					if (!inFlow
																							.equals(inFlowToFlow)) {
																						if (!inFlow
																								.equals(process)) {
																							if (!inFlow
																									.equals(outFlow)) {
																								if (!inFlow
																										.equals(outFlowToNormalStep)) {
																									if (!inFlow
																											.equals(processToActor)) {
																										if (!inFlow
																												.equals(lane)) {
																											if (!inFlow
																													.equals(laneSet)) {
																												if (!exclusiveGateway
																														.equals(normalStep)) {
																													if (!exclusiveGateway
																															.equals(outFlowToFlow)) {
																														if (!exclusiveGateway
																																.equals(inFlowToFlow)) {
																															if (!exclusiveGateway
																																	.equals(process)) {
																																if (!exclusiveGateway
																																		.equals(inFlow)) {
																																	if (!exclusiveGateway
																																			.equals(outFlow)) {
																																		if (!exclusiveGateway
																																				.equals(exclusiveGatewayToNormalStep)) {
																																			if (!exclusiveGateway
																																					.equals(outFlowToNormalStep)) {
																																				if (!exclusiveGateway
																																						.equals(flow)) {
																																					if (!exclusiveGateway
																																							.equals(processToActor)) {
																																						if (!exclusiveGateway
																																								.equals(lane)) {
																																							if (!exclusiveGateway
																																									.equals(laneSet)) {
																																								if (!outFlow
																																										.equals(outFlowToFlow)) {
																																									if (!outFlow
																																											.equals(process)) {
																																										if (!outFlow
																																												.equals(outFlowToNormalStep)) {
																																											if (!outFlow
																																													.equals(processToActor)) {
																																												if (!exclusiveGatewayToNormalStep
																																														.equals(normalStep)) {
																																													if (!exclusiveGatewayToNormalStep
																																															.equals(outFlowToFlow)) {
																																														if (!exclusiveGatewayToNormalStep
																																																.equals(inFlowToFlow)) {
																																															if (!exclusiveGatewayToNormalStep
																																																	.equals(process)) {
																																																if (!exclusiveGatewayToNormalStep
																																																		.equals(inFlow)) {
																																																	if (!exclusiveGatewayToNormalStep
																																																			.equals(outFlow)) {
																																																		if (!exclusiveGatewayToNormalStep
																																																				.equals(outFlowToNormalStep)) {
																																																			if (!exclusiveGatewayToNormalStep
																																																					.equals(flow)) {
																																																				if (!exclusiveGatewayToNormalStep
																																																						.equals(processToActor)) {
																																																					if (!exclusiveGatewayToNormalStep
																																																							.equals(lane)) {
																																																						if (!exclusiveGatewayToNormalStep
																																																								.equals(laneSet)) {
																																																							if (!outFlowToNormalStep
																																																									.equals(process)) {
																																																								if (!outFlowToNormalStep
																																																										.equals(processToActor)) {
																																																									if (!flow
																																																											.equals(normalStep)) {
																																																										if (!flow
																																																												.equals(outFlowToFlow)) {
																																																											if (!flow
																																																													.equals(inFlowToFlow)) {
																																																												if (!flow
																																																														.equals(process)) {
																																																													if (!flow
																																																															.equals(inFlow)) {
																																																														if (!flow
																																																																.equals(outFlow)) {
																																																															if (!flow
																																																																	.equals(outFlowToNormalStep)) {
																																																																if (!flow
																																																																		.equals(processToActor)) {
																																																																	if (!flow
																																																																			.equals(lane)) {
																																																																		if (!flow
																																																																				.equals(laneSet)) {
																																																																			if (!actor
																																																																					.equals(normalStep)) {
																																																																				if (!actor
																																																																						.equals(outFlowToFlow)) {
																																																																					if (!actor
																																																																							.equals(inFlowToFlow)) {
																																																																						if (!actor
																																																																								.equals(process)) {
																																																																							if (!actor
																																																																									.equals(inFlow)) {
																																																																								if (!actor
																																																																										.equals(exclusiveGateway)) {
																																																																									if (!actor
																																																																											.equals(outFlow)) {
																																																																										if (!actor
																																																																												.equals(exclusiveGatewayToNormalStep)) {
																																																																											if (!actor
																																																																													.equals(outFlowToNormalStep)) {
																																																																												if (!actor
																																																																														.equals(flow)) {
																																																																													if (!actor
																																																																															.equals(processToActor)) {
																																																																														if (!actor
																																																																																.equals(lane)) {
																																																																															if (!actor
																																																																																	.equals(laneSet)) {
																																																																																if (!lane
																																																																																		.equals(normalStep)) {
																																																																																	if (!lane
																																																																																			.equals(outFlowToFlow)) {
																																																																																		if (!lane
																																																																																				.equals(process)) {
																																																																																			if (!lane
																																																																																					.equals(outFlow)) {
																																																																																				if (!lane
																																																																																						.equals(outFlowToNormalStep)) {
																																																																																					if (!lane
																																																																																							.equals(processToActor)) {
																																																																																						if (!lane
																																																																																								.equals(laneSet)) {
																																																																																							if (!laneSet
																																																																																									.equals(normalStep)) {
																																																																																								if (!laneSet
																																																																																										.equals(outFlowToFlow)) {
																																																																																									if (!laneSet
																																																																																											.equals(process)) {
																																																																																										if (!laneSet
																																																																																												.equals(outFlow)) {
																																																																																											if (!laneSet
																																																																																													.equals(outFlowToNormalStep)) {
																																																																																												if (!laneSet
																																																																																														.equals(processToActor)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															normalStep,
																																																																																															outFlowToFlow,
																																																																																															inFlowToFlow,
																																																																																															process,
																																																																																															inFlow,
																																																																																															exclusiveGateway,
																																																																																															outFlow,
																																																																																															exclusiveGatewayToNormalStep,
																																																																																															outFlowToNormalStep,
																																																																																															flow,
																																																																																															actor,
																																																																																															processToActor,
																																																																																															lane,
																																																																																															laneSet };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject normalStep,
			EObject outFlowToFlow, EObject process, EObject inFlow,
			EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject lane) {
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ExclusiveGatewayToStepCoreRule";
		String normalStep__actor____actor_name_prime = "actor";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime = "source";
		String exclusiveGatewayToNormalStep__normalStep____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(normalStep__actor____actor);
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__outFlow____default);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__exclusiveGateway____source);
		exclusiveGatewayToNormalStep__normalStep____target
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__normalStep____target);
		outFlowToNormalStep__outFlow____source.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(outFlowToNormalStep__outFlow____source);
		outFlowToNormalStep__normalStep____target.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				outFlowToNormalStep__normalStep____target);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(flow__normalStep____steps);
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				lane__exclusiveGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setName(exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime);
		exclusiveGatewayToNormalStep__normalStep____target
				.setName(exclusiveGatewayToNormalStep__normalStep____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, normalStep, outFlowToFlow, process,
				inFlow, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				lane, normalStep__actor____actor,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				exclusiveGatewayToNormalStep__exclusiveGateway____source,
				exclusiveGatewayToNormalStep__normalStep____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps,
				lane__exclusiveGateway____flowNodeRefs };
	}

	public static final void pattern_ExclusiveGatewayToStepCoreRule_1_5_expressionBBBBBBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, PerformRuleResult ruleresult,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor, EObject lane, EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, normalStep, outFlowToFlow,
				inFlowToFlow, process, inFlow, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ExclusiveGatewayToStepCoreRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_1_blackFBB(
			EClass eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_2_1_binding = pattern_ExclusiveGatewayToStepCoreRule_2_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_2_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_2_1_black = pattern_ExclusiveGatewayToStepCoreRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ExclusiveGatewayToStepCoreRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_2_bindingFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("inFlow");
		EObject _localVariable_2 = match.getObject("exclusiveGateway");
		EObject _localVariable_3 = match.getObject("outFlow");
		EObject _localVariable_4 = match.getObject("lane");
		EObject _localVariable_5 = match.getObject("laneSet");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpExclusiveGateway = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		EObject tmpLane = _localVariable_4;
		EObject tmpLaneSet = _localVariable_5;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpExclusiveGateway instanceof ExclusiveGateway) {
					ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						if (tmpLane instanceof Lane) {
							Lane lane = (Lane) tmpLane;
							if (tmpLaneSet instanceof LaneSet) {
								LaneSet laneSet = (LaneSet) tmpLaneSet;
								return new Object[] { process, inFlow,
										exclusiveGateway, outFlow, lane,
										laneSet, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_2_2_blackFBBBBFFFBBB(
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(inFlow,
							SequenceFlowToUCFlow.class, "source")) {
				Flow flow = inFlowToFlow.getTarget();
				if (flow != null) {
					for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(process,
									ProcessToActor.class, "source")) {
						Actor actor = processToActor.getTarget();
						if (actor != null) {
							_result.add(new Object[] { inFlowToFlow, process,
									inFlow, exclusiveGateway, outFlow, flow,
									actor, processToActor, lane, laneSet, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_2_3_blackBBBBBBBBBB(
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (inFlow.equals(inFlowToFlow.getSource())) {
				if (flow.equals(inFlowToFlow.getTarget())) {
					if (process.getLaneSets().contains(laneSet)) {
						if (process.getFlowElements().contains(inFlow)) {
							if (process.getFlowElements().contains(
									exclusiveGateway)) {
								if (process.getFlowElements().contains(outFlow)) {
									if (exclusiveGateway.equals(inFlow
											.getTargetRef())) {
										if (exclusiveGateway.equals(outFlow
												.getSourceRef())) {
											if (outFlow.equals(exclusiveGateway
													.getDefault())) {
												if (process
														.equals(processToActor
																.getSource())) {
													if (actor
															.equals(processToActor
																	.getTarget())) {
														if (lane.getFlowNodeRefs()
																.contains(
																		exclusiveGateway)) {
															if (laneSet
																	.getLanes()
																	.contains(
																			lane)) {
																_result.add(new Object[] {
																		inFlowToFlow,
																		process,
																		inFlow,
																		exclusiveGateway,
																		outFlow,
																		flow,
																		actor,
																		processToActor,
																		lane,
																		laneSet });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__outFlow____default);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__exclusiveGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlowToFlow, process, inFlow, exclusiveGateway,
				outFlow, flow, actor, processToActor, lane, laneSet,
				isApplicableMatch, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, process__laneSet____laneSets,
				process__inFlow____flowElements,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				processToActor__process____source,
				processToActor__actor____target,
				lane__exclusiveGateway____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_4_bindingFBBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, inFlowToFlow, process, inFlow,
				exclusiveGateway, outFlow, flow, actor, processToActor, lane,
				laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlowToFlow,
					process, inFlow, exclusiveGateway, outFlow, flow, actor,
					processToActor, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_4_bindingAndBlackFBBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_2_4_binding = pattern_ExclusiveGatewayToStepCoreRule_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlowToFlow, process, inFlow,
				exclusiveGateway, outFlow, flow, actor, processToActor, lane,
				laneSet);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_2_4_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_2_4_black = pattern_ExclusiveGatewayToStepCoreRule_2_4_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						inFlowToFlow, process, inFlow, exclusiveGateway,
						outFlow, flow, actor, processToActor, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_2_5_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ExclusiveGatewayToStepCoreRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ExclusiveGatewayToStepCoreRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_1_blackBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			NormalStep normalStep, Flow flow, Actor actor) {
		return new Object[] { _this, match, normalStep, flow, actor };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_2_bindingFBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			NormalStep normalStep, Flow flow, Actor actor) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				normalStep, flow, actor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, normalStep, flow, actor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_2_bindingAndBlackFBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			NormalStep normalStep, Flow flow, Actor actor) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_10_2_binding = pattern_ExclusiveGatewayToStepCoreRule_10_2_bindingFBBBBB(
				_this, match, normalStep, flow, actor);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_10_2_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_10_2_black = pattern_ExclusiveGatewayToStepCoreRule_10_2_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_10_2_black != null) {

				return new Object[] { csp, _this, match, normalStep, flow,
						actor };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_10_3_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_4_blackBBBB(
			Match match, NormalStep normalStep, Flow flow, Actor actor) {
		return new Object[] { match, normalStep, flow, actor };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_4_greenBBBBFF(
			Match match, NormalStep normalStep, Flow flow, Actor actor) {
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(normalStep);
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		match.getToBeTranslatedEdges().add(flow__normalStep____steps);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { match, normalStep, flow, actor,
				normalStep__actor____actor, flow__normalStep____steps };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_5_blackBBBB(
			Match match, NormalStep normalStep, Flow flow, Actor actor) {
		return new Object[] { match, normalStep, flow, actor };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_10_5_greenBBB(
			Match match, Flow flow, Actor actor) {
		match.getContextNodes().add(flow);
		match.getContextNodes().add(actor);
		return new Object[] { match, flow, actor };
	}

	public static final void pattern_ExclusiveGatewayToStepCoreRule_10_6_expressionBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			NormalStep normalStep, Flow flow, Actor actor) {
		_this.registerObjectsToMatch_BWD(match, normalStep, flow, actor);

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_7 = isApplicableMatch.getObject("lane");
		EObject _localVariable_8 = isApplicableMatch.getObject("laneSet");
		EObject tmpNormalStep = _localVariable_0;
		EObject tmpInFlowToFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpProcessToActor = _localVariable_6;
		EObject tmpLane = _localVariable_7;
		EObject tmpLaneSet = _localVariable_8;
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
				SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpProcessToActor instanceof ProcessToActor) {
									ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
									if (tmpLane instanceof Lane) {
										Lane lane = (Lane) tmpLane;
										if (tmpLaneSet instanceof LaneSet) {
											LaneSet laneSet = (LaneSet) tmpLaneSet;
											return new Object[] { normalStep,
													inFlowToFlow, process,
													inFlow, flow, actor,
													processToActor, lane,
													laneSet, isApplicableMatch };
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_1_blackBBBBBBBBBFBB(
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet,
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { normalStep, inFlowToFlow, process,
						inFlow, flow, actor, processToActor, lane, laneSet,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_1_bindingAndBlackFFFFFFFFFFBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding = pattern_ExclusiveGatewayToStepCoreRule_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding != null) {
			NormalStep normalStep = (NormalStep) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[0];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[1];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[3];
			Flow flow = (Flow) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[4];
			Actor actor = (Actor) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[5];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[6];
			Lane lane = (Lane) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[7];
			LaneSet laneSet = (LaneSet) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_binding[8];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_11_1_black = pattern_ExclusiveGatewayToStepCoreRule_11_1_blackBBBBBBBBBFBB(
					normalStep, inFlowToFlow, process, inFlow, flow, actor,
					processToActor, lane, laneSet, _this, isApplicableMatch);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_11_1_black[9];

				return new Object[] { normalStep, inFlowToFlow, process,
						inFlow, flow, actor, processToActor, lane, laneSet,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_1_greenBFBBFFFFBBB(
			NormalStep normalStep, bpmn2.Process process, SequenceFlow inFlow,
			Flow flow, Lane lane, CSP csp) {
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		ExclusiveGateway exclusiveGateway = Bpmn2Factory.eINSTANCE
				.createExclusiveGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("exclusiveGateway", "id");
		Object _localVariable_1 = csp.getValue("exclusiveGateway", "name");
		Object _localVariable_2 = csp.getValue("exclusiveGateway",
				"gatewayDirection");
		outFlowToFlow.setTarget(flow);
		process.getFlowElements().add(exclusiveGateway);
		inFlow.setTargetRef(exclusiveGateway);
		lane.getFlowNodeRefs().add(exclusiveGateway);
		outFlowToFlow.setSource(outFlow);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(exclusiveGateway);
		exclusiveGateway.setDefault(outFlow);
		exclusiveGatewayToNormalStep.setSource(exclusiveGateway);
		exclusiveGatewayToNormalStep.setTarget(normalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		String exclusiveGateway_id_prime = (String) _localVariable_0;
		String exclusiveGateway_name_prime = (String) _localVariable_1;
		GatewayDirection exclusiveGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_2;
		exclusiveGateway.setId(exclusiveGateway_id_prime);
		exclusiveGateway.setName(exclusiveGateway_name_prime);
		exclusiveGateway
				.setGatewayDirection(exclusiveGateway_gatewayDirection_prime);
		return new Object[] { normalStep, outFlowToFlow, process, inFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep, flow, lane, csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_2_blackBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { normalStep, outFlowToFlow, exclusiveGateway,
				outFlow, exclusiveGatewayToNormalStep, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_2_greenFBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(normalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		ruleresult.getCreatedElements().add(exclusiveGateway);
		ruleresult.getCreatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(exclusiveGatewayToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, normalStep, outFlowToFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_3_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject normalStep,
			EObject outFlowToFlow, EObject inFlowToFlow, EObject process,
			EObject inFlow, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		if (!normalStep.equals(outFlowToFlow)) {
			if (!normalStep.equals(process)) {
				if (!normalStep.equals(outFlow)) {
					if (!normalStep.equals(outFlowToNormalStep)) {
						if (!normalStep.equals(processToActor)) {
							if (!outFlowToFlow.equals(process)) {
								if (!outFlowToFlow.equals(outFlowToNormalStep)) {
									if (!outFlowToFlow.equals(processToActor)) {
										if (!inFlowToFlow.equals(normalStep)) {
											if (!inFlowToFlow
													.equals(outFlowToFlow)) {
												if (!inFlowToFlow
														.equals(process)) {
													if (!inFlowToFlow
															.equals(outFlow)) {
														if (!inFlowToFlow
																.equals(outFlowToNormalStep)) {
															if (!inFlowToFlow
																	.equals(processToActor)) {
																if (!inFlowToFlow
																		.equals(lane)) {
																	if (!inFlowToFlow
																			.equals(laneSet)) {
																		if (!process
																				.equals(processToActor)) {
																			if (!inFlow
																					.equals(normalStep)) {
																				if (!inFlow
																						.equals(outFlowToFlow)) {
																					if (!inFlow
																							.equals(inFlowToFlow)) {
																						if (!inFlow
																								.equals(process)) {
																							if (!inFlow
																									.equals(outFlow)) {
																								if (!inFlow
																										.equals(outFlowToNormalStep)) {
																									if (!inFlow
																											.equals(processToActor)) {
																										if (!inFlow
																												.equals(lane)) {
																											if (!inFlow
																													.equals(laneSet)) {
																												if (!exclusiveGateway
																														.equals(normalStep)) {
																													if (!exclusiveGateway
																															.equals(outFlowToFlow)) {
																														if (!exclusiveGateway
																																.equals(inFlowToFlow)) {
																															if (!exclusiveGateway
																																	.equals(process)) {
																																if (!exclusiveGateway
																																		.equals(inFlow)) {
																																	if (!exclusiveGateway
																																			.equals(outFlow)) {
																																		if (!exclusiveGateway
																																				.equals(exclusiveGatewayToNormalStep)) {
																																			if (!exclusiveGateway
																																					.equals(outFlowToNormalStep)) {
																																				if (!exclusiveGateway
																																						.equals(flow)) {
																																					if (!exclusiveGateway
																																							.equals(processToActor)) {
																																						if (!exclusiveGateway
																																								.equals(lane)) {
																																							if (!exclusiveGateway
																																									.equals(laneSet)) {
																																								if (!outFlow
																																										.equals(outFlowToFlow)) {
																																									if (!outFlow
																																											.equals(process)) {
																																										if (!outFlow
																																												.equals(outFlowToNormalStep)) {
																																											if (!outFlow
																																													.equals(processToActor)) {
																																												if (!exclusiveGatewayToNormalStep
																																														.equals(normalStep)) {
																																													if (!exclusiveGatewayToNormalStep
																																															.equals(outFlowToFlow)) {
																																														if (!exclusiveGatewayToNormalStep
																																																.equals(inFlowToFlow)) {
																																															if (!exclusiveGatewayToNormalStep
																																																	.equals(process)) {
																																																if (!exclusiveGatewayToNormalStep
																																																		.equals(inFlow)) {
																																																	if (!exclusiveGatewayToNormalStep
																																																			.equals(outFlow)) {
																																																		if (!exclusiveGatewayToNormalStep
																																																				.equals(outFlowToNormalStep)) {
																																																			if (!exclusiveGatewayToNormalStep
																																																					.equals(flow)) {
																																																				if (!exclusiveGatewayToNormalStep
																																																						.equals(processToActor)) {
																																																					if (!exclusiveGatewayToNormalStep
																																																							.equals(lane)) {
																																																						if (!exclusiveGatewayToNormalStep
																																																								.equals(laneSet)) {
																																																							if (!outFlowToNormalStep
																																																									.equals(process)) {
																																																								if (!outFlowToNormalStep
																																																										.equals(processToActor)) {
																																																									if (!flow
																																																											.equals(normalStep)) {
																																																										if (!flow
																																																												.equals(outFlowToFlow)) {
																																																											if (!flow
																																																													.equals(inFlowToFlow)) {
																																																												if (!flow
																																																														.equals(process)) {
																																																													if (!flow
																																																															.equals(inFlow)) {
																																																														if (!flow
																																																																.equals(outFlow)) {
																																																															if (!flow
																																																																	.equals(outFlowToNormalStep)) {
																																																																if (!flow
																																																																		.equals(processToActor)) {
																																																																	if (!flow
																																																																			.equals(lane)) {
																																																																		if (!flow
																																																																				.equals(laneSet)) {
																																																																			if (!actor
																																																																					.equals(normalStep)) {
																																																																				if (!actor
																																																																						.equals(outFlowToFlow)) {
																																																																					if (!actor
																																																																							.equals(inFlowToFlow)) {
																																																																						if (!actor
																																																																								.equals(process)) {
																																																																							if (!actor
																																																																									.equals(inFlow)) {
																																																																								if (!actor
																																																																										.equals(exclusiveGateway)) {
																																																																									if (!actor
																																																																											.equals(outFlow)) {
																																																																										if (!actor
																																																																												.equals(exclusiveGatewayToNormalStep)) {
																																																																											if (!actor
																																																																													.equals(outFlowToNormalStep)) {
																																																																												if (!actor
																																																																														.equals(flow)) {
																																																																													if (!actor
																																																																															.equals(processToActor)) {
																																																																														if (!actor
																																																																																.equals(lane)) {
																																																																															if (!actor
																																																																																	.equals(laneSet)) {
																																																																																if (!lane
																																																																																		.equals(normalStep)) {
																																																																																	if (!lane
																																																																																			.equals(outFlowToFlow)) {
																																																																																		if (!lane
																																																																																				.equals(process)) {
																																																																																			if (!lane
																																																																																					.equals(outFlow)) {
																																																																																				if (!lane
																																																																																						.equals(outFlowToNormalStep)) {
																																																																																					if (!lane
																																																																																							.equals(processToActor)) {
																																																																																						if (!lane
																																																																																								.equals(laneSet)) {
																																																																																							if (!laneSet
																																																																																									.equals(normalStep)) {
																																																																																								if (!laneSet
																																																																																										.equals(outFlowToFlow)) {
																																																																																									if (!laneSet
																																																																																											.equals(process)) {
																																																																																										if (!laneSet
																																																																																												.equals(outFlow)) {
																																																																																											if (!laneSet
																																																																																													.equals(outFlowToNormalStep)) {
																																																																																												if (!laneSet
																																																																																														.equals(processToActor)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															normalStep,
																																																																																															outFlowToFlow,
																																																																																															inFlowToFlow,
																																																																																															process,
																																																																																															inFlow,
																																																																																															exclusiveGateway,
																																																																																															outFlow,
																																																																																															exclusiveGatewayToNormalStep,
																																																																																															outFlowToNormalStep,
																																																																																															flow,
																																																																																															actor,
																																																																																															processToActor,
																																																																																															lane,
																																																																																															laneSet };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject normalStep,
			EObject outFlowToFlow, EObject process, EObject inFlow,
			EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject lane) {
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ExclusiveGatewayToStepCoreRule";
		String normalStep__actor____actor_name_prime = "actor";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime = "source";
		String exclusiveGatewayToNormalStep__normalStep____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(normalStep__actor____actor);
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges()
				.add(outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__outFlow____default);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__exclusiveGateway____source);
		exclusiveGatewayToNormalStep__normalStep____target
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__normalStep____target);
		outFlowToNormalStep__outFlow____source.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(outFlowToNormalStep__outFlow____source);
		outFlowToNormalStep__normalStep____target.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				outFlowToNormalStep__normalStep____target);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		ruleresult.getTranslatedEdges().add(flow__normalStep____steps);
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges()
				.add(lane__exclusiveGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setName(exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime);
		exclusiveGatewayToNormalStep__normalStep____target
				.setName(exclusiveGatewayToNormalStep__normalStep____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, normalStep, outFlowToFlow, process,
				inFlow, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				lane, normalStep__actor____actor,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				exclusiveGatewayToNormalStep__exclusiveGateway____source,
				exclusiveGatewayToNormalStep__normalStep____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps,
				lane__exclusiveGateway____flowNodeRefs };
	}

	public static final void pattern_ExclusiveGatewayToStepCoreRule_11_5_expressionBBBBBBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, PerformRuleResult ruleresult,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor, EObject lane, EObject laneSet) {
		_this.registerObjects_BWD(ruleresult, normalStep, outFlowToFlow,
				inFlowToFlow, process, inFlow, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ExclusiveGatewayToStepCoreRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_1_blackFBB(
			EClass eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_12_1_binding = pattern_ExclusiveGatewayToStepCoreRule_12_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_12_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_12_1_black = pattern_ExclusiveGatewayToStepCoreRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ExclusiveGatewayToStepCoreRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("normalStep");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("actor");
		EObject tmpNormalStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					return new Object[] { normalStep, flow, actor, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_12_2_blackBFFFBBFB(
			NormalStep normalStep, Flow flow, Actor actor, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, SequenceFlowToUCFlow.class,
						"target")) {
			SequenceFlow inFlow = inFlowToFlow.getSource();
			if (inFlow != null) {
				for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(actor, ProcessToActor.class,
								"target")) {
					bpmn2.Process process = processToActor.getSource();
					if (process != null) {
						_result.add(new Object[] { normalStep, inFlowToFlow,
								process, inFlow, flow, actor, processToActor,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_12_3_blackBBBBBBBFF(
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (actor.equals(normalStep.getActor())) {
			if (inFlow.equals(inFlowToFlow.getSource())) {
				if (flow.equals(inFlowToFlow.getTarget())) {
					if (process.getFlowElements().contains(inFlow)) {
						if (flow.getSteps().contains(normalStep)) {
							if (process.equals(processToActor.getSource())) {
								if (actor.equals(processToActor.getTarget())) {
									for (LaneSet laneSet : process
											.getLaneSets()) {
										for (Lane lane : laneSet.getLanes()) {
											_result.add(new Object[] {
													normalStep, inFlowToFlow,
													process, inFlow, flow,
													actor, processToActor,
													lane, laneSet });
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_3_greenBBBBBBBBBFFFFFFFFFF(
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String normalStep__actor____actor_name_prime = "actor";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String flow__normalStep____steps_name_prime = "steps";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				normalStep__actor____actor);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { normalStep, inFlowToFlow, process, inFlow, flow,
				actor, processToActor, lane, laneSet, isApplicableMatch,
				normalStep__actor____actor, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, process__laneSet____laneSets,
				process__inFlow____flowElements, flow__normalStep____steps,
				processToActor__process____source,
				processToActor__actor____target, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_4_bindingFBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, normalStep, inFlowToFlow, process, inFlow,
				flow, actor, processToActor, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, normalStep,
					inFlowToFlow, process, inFlow, flow, actor, processToActor,
					lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_4_bindingAndBlackFBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_12_4_binding = pattern_ExclusiveGatewayToStepCoreRule_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, normalStep, inFlowToFlow, process,
				inFlow, flow, actor, processToActor, lane, laneSet);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_12_4_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_12_4_black = pattern_ExclusiveGatewayToStepCoreRule_12_4_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						normalStep, inFlowToFlow, process, inFlow, flow, actor,
						processToActor, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_12_5_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ExclusiveGatewayToStepCoreRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ExclusiveGatewayToStepCoreRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_20_1_binding = pattern_ExclusiveGatewayToStepCoreRule_20_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_20_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_20_1_black = pattern_ExclusiveGatewayToStepCoreRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_20_2_blackFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_actor.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(normalStep.getActor())) {
					for (Flow flow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(normalStep, Flow.class,
									"steps")) {
						_result.add(new Object[] { normalStep, flow, actor,
								_edge_actor });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_20_3_expressionFBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			NormalStep normalStep, Flow flow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, normalStep,
				flow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_20_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_21_1_binding = pattern_ExclusiveGatewayToStepCoreRule_21_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_21_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_21_1_black = pattern_ExclusiveGatewayToStepCoreRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_402590 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_402590)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_21_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpExclusiveGateway = _edge_flowElements.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (process.getFlowElements().contains(exclusiveGateway)) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (process.getFlowElements().contains(outFlow)) {
							if (exclusiveGateway.equals(outFlow.getSourceRef())) {
								if (pattern_ExclusiveGatewayToStepCoreRule_21_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepCoreRule_21_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (LaneSet laneSet : process
												.getLaneSets()) {
											for (FlowElement tmpInFlow : process
													.getFlowElements()) {
												if (tmpInFlow instanceof SequenceFlow) {
													SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
													if (!inFlow.equals(outFlow)) {
														if (exclusiveGateway
																.equals(inFlow
																		.getTargetRef())) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_21_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_21_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_22_1_binding = pattern_ExclusiveGatewayToStepCoreRule_22_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_22_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_22_1_black = pattern_ExclusiveGatewayToStepCoreRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_118618 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_118618)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_22_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpExclusiveGateway = outFlow.getSourceRef();
					if (tmpExclusiveGateway instanceof ExclusiveGateway) {
						ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
						if (process.getFlowElements()
								.contains(exclusiveGateway)) {
							if (outFlow.equals(exclusiveGateway.getDefault())) {
								if (pattern_ExclusiveGatewayToStepCoreRule_22_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepCoreRule_22_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (LaneSet laneSet : process
												.getLaneSets()) {
											for (FlowElement tmpInFlow : process
													.getFlowElements()) {
												if (tmpInFlow instanceof SequenceFlow) {
													SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
													if (!inFlow.equals(outFlow)) {
														if (exclusiveGateway
																.equals(inFlow
																		.getTargetRef())) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_22_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_22_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_23_1_binding = pattern_ExclusiveGatewayToStepCoreRule_23_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_23_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_23_1_black = pattern_ExclusiveGatewayToStepCoreRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_252173 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_252173)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_23_2_blackFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpExclusiveGateway = _edge_targetRef.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (exclusiveGateway.equals(inFlow.getTargetRef())) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (!inFlow.equals(outFlow)) {
							if (exclusiveGateway.equals(outFlow.getSourceRef())) {
								if (pattern_ExclusiveGatewayToStepCoreRule_23_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepCoreRule_23_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
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
																exclusiveGateway)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_23_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_23_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_24_1_binding = pattern_ExclusiveGatewayToStepCoreRule_24_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_24_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_24_1_black = pattern_ExclusiveGatewayToStepCoreRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_375120 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_375120)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_24_2_blackFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_incoming.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (exclusiveGateway.equals(inFlow.getTargetRef())) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (!inFlow.equals(outFlow)) {
							if (exclusiveGateway.equals(outFlow.getSourceRef())) {
								if (pattern_ExclusiveGatewayToStepCoreRule_24_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepCoreRule_24_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_24_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_24_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_25_1_binding = pattern_ExclusiveGatewayToStepCoreRule_25_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_25_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_25_1_black = pattern_ExclusiveGatewayToStepCoreRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_94050 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_94050)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_25_2_blackFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpExclusiveGateway = _edge_sourceRef.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					if (outFlow.equals(exclusiveGateway.getDefault())) {
						if (pattern_ExclusiveGatewayToStepCoreRule_25_2_black_nac_0BB(
								outFlow, exclusiveGateway) == null) {
							if (pattern_ExclusiveGatewayToStepCoreRule_25_2_black_nac_1BB(
									outFlow, exclusiveGateway) == null) {
								for (SequenceFlow inFlow : exclusiveGateway
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
																	exclusiveGateway)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_25_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_25_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_26_1_binding = pattern_ExclusiveGatewayToStepCoreRule_26_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_26_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_26_1_black = pattern_ExclusiveGatewayToStepCoreRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_893961 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_893961)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_26_2_blackFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_outgoing.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					if (outFlow.equals(exclusiveGateway.getDefault())) {
						if (pattern_ExclusiveGatewayToStepCoreRule_26_2_black_nac_0BB(
								outFlow, exclusiveGateway) == null) {
							if (pattern_ExclusiveGatewayToStepCoreRule_26_2_black_nac_1BB(
									outFlow, exclusiveGateway) == null) {
								for (SequenceFlow inFlow : exclusiveGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_26_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_26_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_27_1_binding = pattern_ExclusiveGatewayToStepCoreRule_27_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_27_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_27_1_black = pattern_ExclusiveGatewayToStepCoreRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_437351 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_437351)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_27_2_blackFFFFFFB(
			EMoflonEdge _edge_default) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_default.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpOutFlow = _edge_default.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					if (outFlow.equals(exclusiveGateway.getDefault())) {
						if (pattern_ExclusiveGatewayToStepCoreRule_27_2_black_nac_0BB(
								outFlow, exclusiveGateway) == null) {
							if (pattern_ExclusiveGatewayToStepCoreRule_27_2_black_nac_1BB(
									outFlow, exclusiveGateway) == null) {
								for (SequenceFlow inFlow : exclusiveGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
																			_edge_default });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_27_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_27_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_28_1_binding = pattern_ExclusiveGatewayToStepCoreRule_28_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_28_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_28_1_black = pattern_ExclusiveGatewayToStepCoreRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_28_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpNormalStep = _edge_steps.getTrg();
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (flow.getSteps().contains(normalStep)) {
					Actor actor = normalStep.getActor();
					if (actor != null) {
						_result.add(new Object[] { normalStep, flow, actor,
								_edge_steps });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_28_3_expressionFBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			NormalStep normalStep, Flow flow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, normalStep,
				flow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_28_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_1_bindingFB(
			ExclusiveGatewayToStepCoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepCoreRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepCoreRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_29_1_binding = pattern_ExclusiveGatewayToStepCoreRule_29_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepCoreRule_29_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_29_1_black = pattern_ExclusiveGatewayToStepCoreRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepCoreRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_73535 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_73535)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_29_2_blackFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpExclusiveGateway = _edge_flowNodeRefs.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (lane.getFlowNodeRefs().contains(exclusiveGateway)) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (exclusiveGateway.equals(outFlow.getSourceRef())) {
							if (pattern_ExclusiveGatewayToStepCoreRule_29_2_black_nac_0BB(
									outFlow, exclusiveGateway) == null) {
								if (pattern_ExclusiveGatewayToStepCoreRule_29_2_black_nac_1BB(
										outFlow, exclusiveGateway) == null) {
									for (SequenceFlow inFlow : exclusiveGateway
											.getIncoming()) {
										if (!inFlow.equals(outFlow)) {
											for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															lane,
															LaneSet.class,
															"lanes")) {
												for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																exclusiveGateway,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getLaneSets()
																.contains(
																		laneSet)) {
															if (process
																	.getFlowElements()
																	.contains(
																			inFlow)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	_result.add(new Object[] {
																			process,
																			inFlow,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_29_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_29_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepCoreRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_1_blackB(
			ExclusiveGatewayToStepCoreRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ProcessToActor processToActor) {
		if (ruleResult.getCorrObjects().contains(processToActor)) {
			return new Object[] { ruleResult, processToActor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getTargetObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepCoreRule_32_2_blackFFFFFFFFFBB(
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
						Flow flow = inFlowToFlow.getTarget();
						if (flow != null) {
							if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_0BB(
									ruleResult, inFlowToFlow) == null) {
								if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_1BB(
										ruleResult, inFlow) == null) {
									if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_7BB(
											ruleResult, flow) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_2BB(
														ruleResult, process) == null) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_3BB(
																ruleResult,
																laneSet) == null) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_4BB(
																		ruleResult,
																		lane) == null) {
																	for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					process,
																					ProcessToActor.class,
																					"source")) {
																		Actor actor = processToActor
																				.getTarget();
																		if (actor != null) {
																			if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_5BB(
																					ruleResult,
																					processToActor) == null) {
																				if (pattern_ExclusiveGatewayToStepCoreRule_32_2_black_nac_6BB(
																						ruleResult,
																						actor) == null) {
																					_result.add(new Object[] {
																							inFlowToFlowList,
																							inFlowToFlow,
																							inFlow,
																							process,
																							laneSet,
																							lane,
																							processToActor,
																							actor,
																							flow,
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

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_3_bindingFBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, inFlowToFlow, process, inFlow, flow, actor,
				processToActor, lane, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlowToFlow,
					process, inFlow, flow, actor, processToActor, lane,
					laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_3_bindingAndBlackFBBBBBBBBBBB(
			ExclusiveGatewayToStepCoreRule _this,
			IsApplicableMatch isApplicableMatch,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ExclusiveGatewayToStepCoreRule_32_3_binding = pattern_ExclusiveGatewayToStepCoreRule_32_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, inFlowToFlow, process, inFlow, flow,
				actor, processToActor, lane, laneSet, ruleResult);
		if (result_pattern_ExclusiveGatewayToStepCoreRule_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepCoreRule_32_3_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepCoreRule_32_3_black = pattern_ExclusiveGatewayToStepCoreRule_32_3_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepCoreRule_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						inFlowToFlow, process, inFlow, flow, actor,
						processToActor, lane, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepCoreRule_32_4_expressionFBB(
			ExclusiveGatewayToStepCoreRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_5_blackBBBBBBBB(
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		return new Object[] { inFlowToFlow, process, inFlow, flow, actor,
				processToActor, lane, laneSet };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_6_blackBBBBBBBBB(
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { inFlowToFlow, process, inFlow, flow, actor,
				processToActor, lane, laneSet, ruleResult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepCoreRule_32_6_greenFFBBFFFFBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			Lane lane, ModelgeneratorRuleResult ruleResult, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		ExclusiveGateway exclusiveGateway = Bpmn2Factory.eINSTANCE
				.createExclusiveGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		Object _localVariable_2 = csp.getValue("exclusiveGateway", "id");
		Object _localVariable_3 = csp.getValue("exclusiveGateway", "name");
		Object _localVariable_4 = csp.getValue("exclusiveGateway",
				"gatewayDirection");
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		ruleResult.getTargetObjects().add(normalStep);
		outFlowToFlow.setTarget(flow);
		ruleResult.getCorrObjects().add(outFlowToFlow);
		process.getFlowElements().add(exclusiveGateway);
		inFlow.setTargetRef(exclusiveGateway);
		lane.getFlowNodeRefs().add(exclusiveGateway);
		ruleResult.getSourceObjects().add(exclusiveGateway);
		outFlowToFlow.setSource(outFlow);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(exclusiveGateway);
		exclusiveGateway.setDefault(outFlow);
		ruleResult.getSourceObjects().add(outFlow);
		exclusiveGatewayToNormalStep.setSource(exclusiveGateway);
		exclusiveGatewayToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(exclusiveGatewayToNormalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(outFlowToNormalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		String exclusiveGateway_id_prime = (String) _localVariable_2;
		String exclusiveGateway_name_prime = (String) _localVariable_3;
		GatewayDirection exclusiveGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_4;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		exclusiveGateway.setId(exclusiveGateway_id_prime);
		exclusiveGateway.setName(exclusiveGateway_name_prime);
		exclusiveGateway
				.setGatewayDirection(exclusiveGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { normalStep, outFlowToFlow, process, inFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep, flow, actor, lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ExclusiveGatewayToStepCoreRule_32_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExclusiveGatewayToStepCoreRuleImpl
