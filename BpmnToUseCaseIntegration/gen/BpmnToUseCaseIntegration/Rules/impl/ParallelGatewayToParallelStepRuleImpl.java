/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;

import BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule;
import BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule;
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
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
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
 * An implementation of the model object '<em><b>Parallel Gateway To Parallel Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelGatewayToParallelStepRuleImpl extends AbstractRuleImpl
		implements ParallelGatewayToParallelStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGatewayToParallelStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelGatewayToParallelStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ParallelGateway parallelGateway,
			LaneSet laneSet, Lane lane) {
		// initial bindings
		Object[] result1_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_0_1_blackBBBBBBB(
						this, match, inFlow, process, parallelGateway, laneSet,
						lane);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_0_2_bindingAndBlackFBBBBBBB(
						this, match, inFlow, process, parallelGateway, laneSet,
						lane);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_4_blackBBBBBB(
							match, inFlow, process, parallelGateway, laneSet,
							lane);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_4_greenBBBBBFFFF(
							match, inFlow, process, parallelGateway, lane);
			// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result4_green[7];
			// EMoflonEdge lane__parallelGateway____flowNodeRefs = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_5_blackBBBBBB(
							match, inFlow, process, parallelGateway, laneSet,
							lane);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_5_greenBBBBBFFF(
							match, inFlow, process, laneSet, lane);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_6_expressionBBBBBBB(
							this, match, inFlow, process, parallelGateway,
							laneSet, lane);
			return ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_7_expressionF();
		} else {
			return ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step step = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[3];
		ParallelGateway parallelGateway = (ParallelGateway) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[6];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[7];
		Lane lane = (Lane) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_1_greenBFBBFB(
						step, parallelGateway, flow, csp);
		ParallelStep parallelStep = (ParallelStep) result1_green[1];
		FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result1_green[4];

		// collect translated elements
		Object[] result2_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_2_blackBBB(
						parallelStep, parallelGateway,
						parallelGatewayToParallelStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_2_greenFBBB(
						parallelStep, parallelGateway,
						parallelGatewayToParallelStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_3_blackBBBBBBBBBBBB(
						ruleresult, inFlow, step, inFlowToStep, parallelStep,
						process, parallelGateway, flow,
						parallelGatewayToParallelStep, inFlowToFlow, laneSet,
						lane);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_3_greenBBBBBBBBBFFFFFFFF(
						ruleresult, inFlow, step, parallelStep, process,
						parallelGateway, flow, parallelGatewayToParallelStep,
						lane);
		// EMoflonEdge step__parallelStep____next = (EMoflonEdge) result3_green[9];
		// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result3_green[11];
		// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result3_green[12];
		// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result3_green[13];
		// EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge lane__parallelGateway____flowNodeRefs = (EMoflonEdge) result3_green[16];

		// perform postprocessing story node is empty
		// register objects
		ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, inFlow, step, inFlowToStep,
						parallelStep, process, parallelGateway, flow,
						parallelGatewayToParallelStep, inFlowToFlow, laneSet,
						lane);
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result2_binding[0];
		bpmn2.Process process = (bpmn2.Process) result2_binding[1];
		ParallelGateway parallelGateway = (ParallelGateway) result2_binding[2];
		LaneSet laneSet = (LaneSet) result2_binding[3];
		Lane lane = (Lane) result2_binding[4];
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_2_2_blackBFFBBFFBBB(
						inFlow, process, parallelGateway, laneSet, lane, match)) {
			Step step = (Step) result2_black[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[2];
			Flow flow = (Flow) result2_black[5];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_2_3_blackBBBBBBBBB(
							inFlow, step, inFlowToStep, process,
							parallelGateway, flow, inFlowToFlow, laneSet, lane)) {
				Object[] result3_green = ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
								inFlow, step, inFlowToStep, process,
								parallelGateway, flow, inFlowToFlow, laneSet,
								lane);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge inFlowToStep__inFlow____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge inFlowToStep__step____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[19];
				// EMoflonEdge lane__parallelGateway____flowNodeRefs = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, step,
								inFlowToStep, process, parallelGateway, flow,
								inFlowToFlow, laneSet, lane);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ParallelGateway parallelGateway,
			LaneSet laneSet, Lane lane) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("laneSet", laneSet);
		match.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ParallelGateway parallelGateway,
			LaneSet laneSet, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
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
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", true, csp);
		var_parallelGateway_id.setValue(parallelGateway.getId());
		var_parallelGateway_id.setType("String");
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", true, csp);
		var_parallelGateway_name.setValue(parallelGateway.getName());
		var_parallelGateway_name.setType("String");

		// Create unbound variables
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", csp);
		var_parallelStep_name.setType("String");
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", csp);
		var_parallelStep_label.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
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
			EObject inFlow, EObject step, EObject inFlowToStep,
			EObject parallelStep, EObject process, EObject parallelGateway,
			EObject flow, EObject parallelGatewayToParallelStep,
			EObject inFlowToFlow, EObject laneSet, EObject lane) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("parallelGateway").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getParallelGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		// initial bindings
		Object[] result1_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_10_1_blackBBBBB(
						this, match, step, parallelStep, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_10_2_bindingAndBlackFBBBBB(
						this, match, step, parallelStep, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_4_blackBBBB(
							match, step, parallelStep, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_4_greenBBBBFF(
							match, step, parallelStep, flow);
			// EMoflonEdge step__parallelStep____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_5_blackBBBB(
							match, step, parallelStep, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_5_greenBBB(
							match, step, flow);

			// register objects to match
			ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_6_expressionBBBBB(
							this, match, step, parallelStep, flow);
			return ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_7_expressionF();
		} else {
			return ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step step = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		ParallelStep parallelStep = (ParallelStep) result1_bindingAndBlack[3];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[6];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[7];
		Lane lane = (Lane) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_1_greenBBBFFBB(
						inFlow, parallelStep, process, lane, csp);
		ParallelGateway parallelGateway = (ParallelGateway) result1_green[3];
		FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result1_green[4];

		// collect translated elements
		Object[] result2_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_2_blackBBB(
						parallelStep, parallelGateway,
						parallelGatewayToParallelStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_2_greenFBBB(
						parallelStep, parallelGateway,
						parallelGatewayToParallelStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_3_blackBBBBBBBBBBBB(
						ruleresult, inFlow, step, inFlowToStep, parallelStep,
						process, parallelGateway, flow,
						parallelGatewayToParallelStep, inFlowToFlow, laneSet,
						lane);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_3_greenBBBBBBBBBFFFFFFFF(
						ruleresult, inFlow, step, parallelStep, process,
						parallelGateway, flow, parallelGatewayToParallelStep,
						lane);
		// EMoflonEdge step__parallelStep____next = (EMoflonEdge) result3_green[9];
		// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result3_green[11];
		// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result3_green[12];
		// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result3_green[13];
		// EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge lane__parallelGateway____flowNodeRefs = (EMoflonEdge) result3_green[16];

		// perform postprocessing story node is empty
		// register objects
		ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, inFlow, step, inFlowToStep,
						parallelStep, process, parallelGateway, flow,
						parallelGatewayToParallelStep, inFlowToFlow, laneSet,
						lane);
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Step step = (Step) result2_binding[0];
		ParallelStep parallelStep = (ParallelStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_12_2_blackFBFBBFB(
						step, parallelStep, flow, match)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_12_3_blackBBBBFBBFF(
							inFlow, step, inFlowToStep, parallelStep, flow,
							inFlowToFlow)) {
				bpmn2.Process process = (bpmn2.Process) result3_black[4];
				LaneSet laneSet = (LaneSet) result3_black[7];
				Lane lane = (Lane) result3_black[8];
				Object[] result3_green = ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_12_3_greenBBBBBBBBBFFFFFFFFFF(
								inFlow, step, inFlowToStep, parallelStep,
								process, flow, inFlowToFlow, laneSet, lane);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge step__parallelStep____next = (EMoflonEdge) result3_green[10];
				// EMoflonEdge inFlowToStep__inFlow____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlowToStep__step____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, step,
								inFlowToStep, parallelStep, process, flow,
								inFlowToFlow, laneSet, lane);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		match.registerObject("step", step);
		match.registerObject("parallelStep", parallelStep);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step step,
			ParallelStep parallelStep, Flow flow) {// Create CSP
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
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			ParallelStep parallelStep, bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", true, csp);
		var_parallelStep_name.setValue(parallelStep.getName());
		var_parallelStep_name.setType("String");
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", true, csp);
		var_parallelStep_label.setValue(parallelStep.getLabel());
		var_parallelStep_label.setType("String");

		// Create unbound variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", csp);
		var_parallelGateway_id.setType("String");
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", csp);
		var_parallelGateway_name.setType("String");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
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
			EObject inFlow, EObject step, EObject inFlowToStep,
			EObject parallelStep, EObject process, EObject parallelGateway,
			EObject flow, EObject parallelGatewayToParallelStep,
			EObject inFlowToFlow, EObject laneSet, EObject lane) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("parallelStep")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_32(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_20_2_blackFFFB(_edge_next)) {
			Step step = (Step) result2_black[0];
			ParallelStep parallelStep = (ParallelStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_20_3_expressionFBBBBB(
							this, match, step, parallelStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_85(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_21_2_blackFFFFFB(_edge_flowElements)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_21_3_expressionFBBBBBBB(
							this, match, inFlow, process, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_86(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_22_2_blackFFFFFB(_edge_targetRef)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_22_3_expressionFBBBBBBB(
							this, match, inFlow, process, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_87(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_23_2_blackFFFFFB(_edge_incoming)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_23_3_expressionFBBBBBBB(
							this, match, inFlow, process, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_33(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_24_2_blackFFFB(_edge_steps)) {
			Step step = (Step) result2_black[0];
			ParallelStep parallelStep = (ParallelStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_24_3_expressionFBBBBB(
							this, match, step, parallelStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_88(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_25_2_blackFFFFFB(_edge_flowNodeRefs)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_25_3_expressionFBBBBBBB(
							this, match, inFlow, process, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_25_6_expressionFB(__result);
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
			SequenceFlowToStep inFlowToStepParameter) {
		// create result
		Object[] result1_black = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_28_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_28_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_28_2_blackFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToStepList = (RuleEntryList) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[2];
			Step step = (Step) result2_black[3];
			bpmn2.Process process = (bpmn2.Process) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Lane lane = (Lane) result2_black[6];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[7];
			Flow flow = (Flow) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_28_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, inFlow, step,
							inFlowToStep, process, flow, inFlowToFlow, laneSet,
							lane, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelGatewayToParallelStepRuleImpl
					.pattern_ParallelGatewayToParallelStepRule_28_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ParallelGatewayToParallelStepRuleImpl
						.pattern_ParallelGatewayToParallelStepRule_28_5_blackBBBBBBBB(
								inFlow, step, inFlowToStep, process, flow,
								inFlowToFlow, laneSet, lane);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_28_6_blackBBBBBBBBB(
									inFlow, step, inFlowToStep, process, flow,
									inFlowToFlow, laneSet, lane, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ParallelGatewayToParallelStepRuleImpl
							.pattern_ParallelGatewayToParallelStepRule_28_6_greenBBFBFBFBBB(
									inFlow, step, process, flow, lane,
									ruleResult, csp);
					// ParallelStep parallelStep = (ParallelStep) result6_green[2];
					// ParallelGateway parallelGateway = (ParallelGateway) result6_green[4];
					// FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepRuleImpl
				.pattern_ParallelGatewayToParallelStepRule_28_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane,
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
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", csp);
		var_parallelGateway_id.setType("String");
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", csp);
		var_parallelStep_name.setType("String");
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", csp);
		var_parallelGateway_name.setType("String");
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", csp);
		var_parallelStep_label.setType("String");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
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
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway,
			LaneSet laneSet, Lane lane) {
		// initial bindings
		Object[] result1_black = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_0_1_blackBBBBBBB(
						this, match, process, inFlow, parallelGateway, laneSet,
						lane);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_0_2_bindingAndBlackFBBBBBBB(
						this, match, process, inFlow, parallelGateway, laneSet,
						lane);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_4_blackBBBBBB(
							match, process, inFlow, parallelGateway, laneSet,
							lane);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_4_greenBBBBBFFFF(
							match, process, inFlow, parallelGateway, lane);
			// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result4_green[7];
			// EMoflonEdge lane__parallelGateway____flowNodeRefs = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_5_blackBBBBBB(
							match, process, inFlow, parallelGateway, laneSet,
							lane);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_5_greenBBBBBFFF(
							match, process, inFlow, laneSet, lane);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_6_expressionBBBBBBB(
							this, match, process, inFlow, parallelGateway,
							laneSet, lane);
			return ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_7_expressionF();
		} else {
			return ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway,
			LaneSet laneSet, Lane lane) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("laneSet", laneSet);
		match.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway,
			LaneSet laneSet, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", true, csp);
		var_parallelGateway_id.setValue(parallelGateway.getId());
		var_parallelGateway_id.setType("String");
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", true, csp);
		var_parallelGateway_name.setValue(parallelGateway.getName());
		var_parallelGateway_name.setType("String");

		// Create unbound variables
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", csp);
		var_parallelStep_name.setType("String");
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", csp);
		var_parallelStep_label.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject parallelGateway,
			EObject parallelStep, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow,
			EObject laneSet, EObject lane) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ParallelStep parallelStep,
			Flow flow) {
		// initial bindings
		Object[] result1_black = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_10_1_blackBBBB(
						this, match, parallelStep, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_10_2_bindingAndBlackFBBBB(
						this, match, parallelStep, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_4_blackBBB(
							match, parallelStep, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_4_greenBBBF(
							match, parallelStep, flow);
			// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_5_blackBBB(
							match, parallelStep, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_5_greenBB(
							match, flow);

			// register objects to match
			ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_6_expressionBBBB(
							this, match, parallelStep, flow);
			return ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_7_expressionF();
		} else {
			return ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			ParallelStep parallelStep, Flow flow) {
		match.registerObject("parallelStep", parallelStep);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			ParallelStep parallelStep, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelStep parallelStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", true, csp);
		var_parallelStep_name.setValue(parallelStep.getName());
		var_parallelStep_name.setType("String");
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", true, csp);
		var_parallelStep_label.setValue(parallelStep.getLabel());
		var_parallelStep_label.setType("String");

		// Create unbound variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", csp);
		var_parallelGateway_id.setType("String");
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", csp);
		var_parallelGateway_name.setType("String");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject parallelGateway,
			EObject parallelStep, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow,
			EObject laneSet, EObject lane) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_46(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_20_2_blackFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_20_3_expressionFBBBBBBB(
							this, match, process, inFlow, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepCoreRuleImpl
						.pattern_ParallelGatewayToParallelStepCoreRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_47(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_21_2_blackFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_21_3_expressionFBBBBBBB(
							this, match, process, inFlow, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepCoreRuleImpl
						.pattern_ParallelGatewayToParallelStepCoreRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_48(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_22_2_blackFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_22_3_expressionFBBBBBBB(
							this, match, process, inFlow, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepCoreRuleImpl
						.pattern_ParallelGatewayToParallelStepCoreRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_18(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_23_2_blackFFB(_edge_steps)) {
			ParallelStep parallelStep = (ParallelStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			Object[] result2_green = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_23_3_expressionFBBBB(
							this, match, parallelStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepCoreRuleImpl
						.pattern_ParallelGatewayToParallelStepCoreRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_49(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_24_2_blackFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			Object[] result2_green = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_24_3_expressionFBBBBBBB(
							this, match, process, inFlow, parallelGateway,
							laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGatewayToParallelStepCoreRuleImpl
						.pattern_ParallelGatewayToParallelStepCoreRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_24_6_expressionFB(__result);
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
		Object[] result1_black = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_27_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_27_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_27_2_blackFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToFlowList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			LaneSet laneSet = (LaneSet) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			SequenceFlow inFlow = (SequenceFlow) result2_black[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			Flow flow = (Flow) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_27_3_bindingAndBlackFBBBBBBBBB(
							this, isApplicableMatch, process, inFlow, flow,
							inFlowToFlow, laneSet, lane, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelGatewayToParallelStepCoreRuleImpl
					.pattern_ParallelGatewayToParallelStepCoreRule_27_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ParallelGatewayToParallelStepCoreRuleImpl
						.pattern_ParallelGatewayToParallelStepCoreRule_27_5_blackBBBBBB(
								process, inFlow, flow, inFlowToFlow, laneSet,
								lane);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_27_6_blackBBBBBBB(
									process, inFlow, flow, inFlowToFlow,
									laneSet, lane, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ParallelGatewayToParallelStepCoreRuleImpl
							.pattern_ParallelGatewayToParallelStepCoreRule_27_6_greenBBFFBFBBB(
									process, inFlow, flow, lane, ruleResult,
									csp);
					// ParallelGateway parallelGateway = (ParallelGateway) result6_green[2];
					// ParallelStep parallelStep = (ParallelStep) result6_green[3];
					// FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParallelGatewayToParallelStepCoreRuleImpl
				.pattern_ParallelGatewayToParallelStepCoreRule_27_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane,
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
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", csp);
		var_parallelGateway_id.setType("String");
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", csp);
		var_parallelStep_name.setType("String");
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", csp);
		var_parallelGateway_name.setType("String");
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", csp);
		var_parallelStep_label.setType("String");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParallelGatewayToParallelStepCoreRule.class) {
			switch (baseOperationID) {
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_47__EMOFLONEDGE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_47__EMOFLONEDGE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_48__EMOFLONEDGE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_48__EMOFLONEDGE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_49__EMOFLONEDGE:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_49__EMOFLONEDGE;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE_MODELGENERATORRULERESULT:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE_MODELGENERATORRULERESULT;
			case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_LANESET_LANE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(LaneSet) arguments.get(4), (Lane) arguments.get(5));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_LANESET_LANE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(LaneSet) arguments.get(4), (Lane) arguments.get(5));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_LANESET_LANE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(LaneSet) arguments.get(4), (Lane) arguments.get(5));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(ParallelGateway) arguments.get(5),
					(Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(LaneSet) arguments.get(8), (Lane) arguments.get(9));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (ParallelStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (ParallelStep) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (ParallelStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(ParallelStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(LaneSet) arguments.get(8), (Lane) arguments.get(9));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_85__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_85((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_86__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_86((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_87((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_33((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_88((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4), (Flow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(LaneSet) arguments.get(7), (Lane) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(LaneSet) arguments.get(4), (Lane) arguments.get(5));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(LaneSet) arguments.get(4), (Lane) arguments.get(5));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_LANESET_LANE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(LaneSet) arguments.get(4), (Lane) arguments.get(5));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(LaneSet) arguments.get(6), (Lane) arguments.get(7));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1), (Flow) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1), (Flow) arguments.get(2));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1), (Flow) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelStep) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(LaneSet) arguments.get(6), (Lane) arguments.get(7));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_46((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_47((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_48__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_48((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_18((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_49((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_LANESET_LANE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Flow) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(LaneSet) arguments.get(5), (Lane) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_1_blackBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		return new Object[] { _this, match, inFlow, process, parallelGateway,
				laneSet, lane };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_2_bindingFBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, inFlow,
				process, parallelGateway, laneSet, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, inFlow, process,
					parallelGateway, laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_2_bindingAndBlackFBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_0_2_binding = pattern_ParallelGatewayToParallelStepRule_0_2_bindingFBBBBBBB(
				_this, match, inFlow, process, parallelGateway, laneSet, lane);
		if (result_pattern_ParallelGatewayToParallelStepRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_0_2_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_0_2_black = pattern_ParallelGatewayToParallelStepRule_0_2_blackB(csp);
			if (result_pattern_ParallelGatewayToParallelStepRule_0_2_black != null) {

				return new Object[] { csp, _this, match, inFlow, process,
						parallelGateway, laneSet, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_0_3_expressionFBB(
			ParallelGatewayToParallelStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_4_blackBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		return new Object[] { match, inFlow, process, parallelGateway, laneSet,
				lane };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_4_greenBBBBBFFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, Lane lane) {
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parallelGateway);
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		String lane__parallelGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		match.getToBeTranslatedEdges().add(
				process__parallelGateway____flowElements);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		match.getToBeTranslatedEdges()
				.add(inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(parallelGateway__inFlow____incoming);
		lane__parallelGateway____flowNodeRefs.setSrc(lane);
		lane__parallelGateway____flowNodeRefs.setTrg(parallelGateway);
		match.getToBeTranslatedEdges().add(
				lane__parallelGateway____flowNodeRefs);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		lane__parallelGateway____flowNodeRefs
				.setName(lane__parallelGateway____flowNodeRefs_name_prime);
		return new Object[] { match, inFlow, process, parallelGateway, lane,
				process__parallelGateway____flowElements,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming,
				lane__parallelGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_5_blackBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		return new Object[] { match, inFlow, process, parallelGateway, laneSet,
				lane };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_0_5_greenBBBBBFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			LaneSet laneSet, Lane lane) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
		match.getContextNodes().add(laneSet);
		match.getContextNodes().add(lane);
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
		return new Object[] { match, inFlow, process, laneSet, lane,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes };
	}

	public static final void pattern_ParallelGatewayToParallelStepRule_0_6_expressionBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		_this.registerObjectsToMatch_FWD(match, inFlow, process,
				parallelGateway, laneSet, lane);

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlowToStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("parallelGateway");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_8 = isApplicableMatch.getObject("lane");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpInFlowToStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpParallelGateway = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpInFlowToFlow = _localVariable_6;
		EObject tmpLaneSet = _localVariable_7;
		EObject tmpLane = _localVariable_8;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpInFlowToStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpParallelGateway instanceof ParallelGateway) {
							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
									SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
									if (tmpLaneSet instanceof LaneSet) {
										LaneSet laneSet = (LaneSet) tmpLaneSet;
										if (tmpLane instanceof Lane) {
											Lane lane = (Lane) tmpLane;
											return new Object[] { inFlow, step,
													inFlowToStep, process,
													parallelGateway, flow,
													inFlowToFlow, laneSet,
													lane, isApplicableMatch };
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_1_blackBBBBBBBBBFBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane,
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { inFlow, step, inFlowToStep, process,
						parallelGateway, flow, inFlowToFlow, laneSet, lane,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_1_bindingAndBlackFFFFFFFFFFBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_1_1_binding = pattern_ParallelGatewayToParallelStepRule_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelGatewayToParallelStepRule_1_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[0];
			Step step = (Step) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[2];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[3];
			ParallelGateway parallelGateway = (ParallelGateway) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[4];
			Flow flow = (Flow) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[5];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[6];
			LaneSet laneSet = (LaneSet) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[7];
			Lane lane = (Lane) result_pattern_ParallelGatewayToParallelStepRule_1_1_binding[8];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_1_1_black = pattern_ParallelGatewayToParallelStepRule_1_1_blackBBBBBBBBBFBB(
					inFlow, step, inFlowToStep, process, parallelGateway, flow,
					inFlowToFlow, laneSet, lane, _this, isApplicableMatch);
			if (result_pattern_ParallelGatewayToParallelStepRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_1_1_black[9];

				return new Object[] { inFlow, step, inFlowToStep, process,
						parallelGateway, flow, inFlowToFlow, laneSet, lane,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_1_greenBFBBFB(
			Step step, ParallelGateway parallelGateway, Flow flow, CSP csp) {
		ParallelStep parallelStep = UseCaseDSLFactory.eINSTANCE
				.createParallelStep();
		FlowNodeToStep parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		Object _localVariable_0 = csp.getValue("parallelStep", "name");
		Object _localVariable_1 = csp.getValue("parallelStep", "label");
		step.setNext(parallelStep);
		flow.getSteps().add(parallelStep);
		parallelGatewayToParallelStep.setSource(parallelGateway);
		parallelGatewayToParallelStep.setTarget(parallelStep);
		String parallelStep_name_prime = (String) _localVariable_0;
		String parallelStep_label_prime = (String) _localVariable_1;
		parallelStep.setName(parallelStep_name_prime);
		parallelStep.setLabel(parallelStep_label_prime);
		return new Object[] { step, parallelStep, parallelGateway, flow,
				parallelGatewayToParallelStep, csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_2_blackBBB(
			ParallelStep parallelStep, ParallelGateway parallelGateway,
			FlowNodeToStep parallelGatewayToParallelStep) {
		return new Object[] { parallelStep, parallelGateway,
				parallelGatewayToParallelStep };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_2_greenFBBB(
			ParallelStep parallelStep, ParallelGateway parallelGateway,
			FlowNodeToStep parallelGatewayToParallelStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(parallelStep);
		ruleresult.getTranslatedElements().add(parallelGateway);
		ruleresult.getCreatedLinkElements().add(parallelGatewayToParallelStep);
		return new Object[] { ruleresult, parallelStep, parallelGateway,
				parallelGatewayToParallelStep };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject inFlowToStep, EObject parallelStep, EObject process,
			EObject parallelGateway, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow,
			EObject laneSet, EObject lane) {
		if (!inFlow.equals(step)) {
			if (!inFlow.equals(inFlowToStep)) {
				if (!inFlow.equals(parallelStep)) {
					if (!inFlow.equals(process)) {
						if (!inFlow.equals(parallelGateway)) {
							if (!inFlow.equals(parallelGatewayToParallelStep)) {
								if (!inFlow.equals(inFlowToFlow)) {
									if (!inFlow.equals(laneSet)) {
										if (!inFlow.equals(lane)) {
											if (!inFlowToStep.equals(step)) {
												if (!inFlowToStep
														.equals(parallelStep)) {
													if (!inFlowToStep
															.equals(process)) {
														if (!inFlowToStep
																.equals(parallelGateway)) {
															if (!inFlowToStep
																	.equals(parallelGatewayToParallelStep)) {
																if (!inFlowToStep
																		.equals(laneSet)) {
																	if (!inFlowToStep
																			.equals(lane)) {
																		if (!parallelStep
																				.equals(step)) {
																			if (!parallelStep
																					.equals(process)) {
																				if (!process
																						.equals(step)) {
																					if (!parallelGateway
																							.equals(step)) {
																						if (!parallelGateway
																								.equals(parallelStep)) {
																							if (!parallelGateway
																									.equals(process)) {
																								if (!parallelGateway
																										.equals(parallelGatewayToParallelStep)) {
																									if (!flow
																											.equals(inFlow)) {
																										if (!flow
																												.equals(step)) {
																											if (!flow
																													.equals(inFlowToStep)) {
																												if (!flow
																														.equals(parallelStep)) {
																													if (!flow
																															.equals(process)) {
																														if (!flow
																																.equals(parallelGateway)) {
																															if (!flow
																																	.equals(parallelGatewayToParallelStep)) {
																																if (!flow
																																		.equals(inFlowToFlow)) {
																																	if (!flow
																																			.equals(laneSet)) {
																																		if (!flow
																																				.equals(lane)) {
																																			if (!parallelGatewayToParallelStep
																																					.equals(step)) {
																																				if (!parallelGatewayToParallelStep
																																						.equals(parallelStep)) {
																																					if (!parallelGatewayToParallelStep
																																							.equals(process)) {
																																						if (!inFlowToFlow
																																								.equals(step)) {
																																							if (!inFlowToFlow
																																									.equals(inFlowToStep)) {
																																								if (!inFlowToFlow
																																										.equals(parallelStep)) {
																																									if (!inFlowToFlow
																																											.equals(process)) {
																																										if (!inFlowToFlow
																																												.equals(parallelGateway)) {
																																											if (!inFlowToFlow
																																													.equals(parallelGatewayToParallelStep)) {
																																												if (!inFlowToFlow
																																														.equals(laneSet)) {
																																													if (!inFlowToFlow
																																															.equals(lane)) {
																																														if (!laneSet
																																																.equals(step)) {
																																															if (!laneSet
																																																	.equals(parallelStep)) {
																																																if (!laneSet
																																																		.equals(process)) {
																																																	if (!laneSet
																																																			.equals(parallelGateway)) {
																																																		if (!laneSet
																																																				.equals(parallelGatewayToParallelStep)) {
																																																			if (!lane
																																																					.equals(step)) {
																																																				if (!lane
																																																						.equals(parallelStep)) {
																																																					if (!lane
																																																							.equals(process)) {
																																																						if (!lane
																																																								.equals(parallelGateway)) {
																																																							if (!lane
																																																									.equals(parallelGatewayToParallelStep)) {
																																																								if (!lane
																																																										.equals(laneSet)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											inFlow,
																																																											step,
																																																											inFlowToStep,
																																																											parallelStep,
																																																											process,
																																																											parallelGateway,
																																																											flow,
																																																											parallelGatewayToParallelStep,
																																																											inFlowToFlow,
																																																											laneSet,
																																																											lane };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_1_3_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject parallelStep, EObject process, EObject parallelGateway,
			EObject flow, EObject parallelGatewayToParallelStep, EObject lane) {
		EMoflonEdge step__parallelStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGatewayToParallelStepRule";
		String step__parallelStep____next_name_prime = "next";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		String flow__parallelStep____steps_name_prime = "steps";
		String parallelGatewayToParallelStep__parallelGateway____source_name_prime = "source";
		String parallelGatewayToParallelStep__parallelStep____target_name_prime = "target";
		String lane__parallelGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		step__parallelStep____next.setSrc(step);
		step__parallelStep____next.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(step__parallelStep____next);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		ruleresult.getTranslatedEdges().add(
				process__parallelGateway____flowElements);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges()
				.add(parallelGateway__inFlow____incoming);
		flow__parallelStep____steps.setSrc(flow);
		flow__parallelStep____steps.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(flow__parallelStep____steps);
		parallelGatewayToParallelStep__parallelGateway____source
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelGateway____source
				.setTrg(parallelGateway);
		ruleresult.getCreatedEdges().add(
				parallelGatewayToParallelStep__parallelGateway____source);
		parallelGatewayToParallelStep__parallelStep____target
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelStep____target
				.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(
				parallelGatewayToParallelStep__parallelStep____target);
		lane__parallelGateway____flowNodeRefs.setSrc(lane);
		lane__parallelGateway____flowNodeRefs.setTrg(parallelGateway);
		ruleresult.getTranslatedEdges().add(
				lane__parallelGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		step__parallelStep____next
				.setName(step__parallelStep____next_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		parallelGatewayToParallelStep__parallelGateway____source
				.setName(parallelGatewayToParallelStep__parallelGateway____source_name_prime);
		parallelGatewayToParallelStep__parallelStep____target
				.setName(parallelGatewayToParallelStep__parallelStep____target_name_prime);
		lane__parallelGateway____flowNodeRefs
				.setName(lane__parallelGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, step, parallelStep, process,
				parallelGateway, flow, parallelGatewayToParallelStep, lane,
				step__parallelStep____next,
				process__parallelGateway____flowElements,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming,
				flow__parallelStep____steps,
				parallelGatewayToParallelStep__parallelGateway____source,
				parallelGatewayToParallelStep__parallelStep____target,
				lane__parallelGateway____flowNodeRefs };
	}

	public static final void pattern_ParallelGatewayToParallelStepRule_1_5_expressionBBBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject inFlowToStep, EObject parallelStep, EObject process,
			EObject parallelGateway, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow,
			EObject laneSet, EObject lane) {
		_this.registerObjects_FWD(ruleresult, inFlow, step, inFlowToStep,
				parallelStep, process, parallelGateway, flow,
				parallelGatewayToParallelStep, inFlowToFlow, laneSet, lane);

	}

	public static final PerformRuleResult pattern_ParallelGatewayToParallelStepRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_1_blackFBB(
			EClass eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_2_1_binding = pattern_ParallelGatewayToParallelStepRule_2_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_2_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_2_1_black = pattern_ParallelGatewayToParallelStepRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGatewayToParallelStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("inFlow");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("parallelGateway");
		EObject _localVariable_3 = match.getObject("laneSet");
		EObject _localVariable_4 = match.getObject("lane");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpParallelGateway = _localVariable_2;
		EObject tmpLaneSet = _localVariable_3;
		EObject tmpLane = _localVariable_4;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpParallelGateway instanceof ParallelGateway) {
					ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
					if (tmpLaneSet instanceof LaneSet) {
						LaneSet laneSet = (LaneSet) tmpLaneSet;
						if (tmpLane instanceof Lane) {
							Lane lane = (Lane) tmpLane;
							return new Object[] { inFlow, process,
									parallelGateway, laneSet, lane, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_2_2_blackBFFBBFFBBB(
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SequenceFlowToStep inFlowToStep : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SequenceFlowToStep.class,
						"source")) {
			Step step = inFlowToStep.getTarget();
			if (step != null) {
				for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(inFlow,
								SequenceFlowToUCFlow.class, "source")) {
					Flow flow = inFlowToFlow.getTarget();
					if (flow != null) {
						_result.add(new Object[] { inFlow, step, inFlowToStep,
								process, parallelGateway, flow, inFlowToFlow,
								laneSet, lane, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_2_3_blackBBBBBBBBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (inFlow.equals(inFlowToStep.getSource())) {
			if (step.equals(inFlowToStep.getTarget())) {
				if (process.getLaneSets().contains(laneSet)) {
					if (process.getFlowElements().contains(inFlow)) {
						if (process.getFlowElements().contains(parallelGateway)) {
							if (parallelGateway.equals(inFlow.getTargetRef())) {
								if (inFlow.equals(inFlowToFlow.getSource())) {
									if (flow.equals(inFlowToFlow.getTarget())) {
										if (laneSet.getLanes().contains(lane)) {
											if (lane.getFlowNodeRefs()
													.contains(parallelGateway)) {
												_result.add(new Object[] {
														inFlow, step,
														inFlowToStep, process,
														parallelGateway, flow,
														inFlowToFlow, laneSet,
														lane });
											}
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlowToStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlowToStep__inFlow____source_name_prime = "source";
		String inFlowToStep__step____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		String lane__parallelGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(inFlowToStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(parallelGateway);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(lane);
		inFlowToStep__inFlow____source.setSrc(inFlowToStep);
		inFlowToStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__inFlow____source);
		inFlowToStep__step____target.setSrc(inFlowToStep);
		inFlowToStep__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__step____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelGateway____flowElements);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__inFlow____incoming);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		lane__parallelGateway____flowNodeRefs.setSrc(lane);
		lane__parallelGateway____flowNodeRefs.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__parallelGateway____flowNodeRefs);
		inFlowToStep__inFlow____source
				.setName(inFlowToStep__inFlow____source_name_prime);
		inFlowToStep__step____target
				.setName(inFlowToStep__step____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		lane__parallelGateway____flowNodeRefs
				.setName(lane__parallelGateway____flowNodeRefs_name_prime);
		return new Object[] { inFlow, step, inFlowToStep, process,
				parallelGateway, flow, inFlowToFlow, laneSet, lane,
				isApplicableMatch, inFlowToStep__inFlow____source,
				inFlowToStep__step____target, process__laneSet____laneSets,
				process__inFlow____flowElements,
				process__parallelGateway____flowElements,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				laneSet__lane____lanes, lane__parallelGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_4_bindingFBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, inFlow, step, inFlowToStep, process,
				parallelGateway, flow, inFlowToFlow, laneSet, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow, step,
					inFlowToStep, process, parallelGateway, flow, inFlowToFlow,
					laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_4_bindingAndBlackFBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_2_4_binding = pattern_ParallelGatewayToParallelStepRule_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, step, inFlowToStep, process,
				parallelGateway, flow, inFlowToFlow, laneSet, lane);
		if (result_pattern_ParallelGatewayToParallelStepRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_2_4_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_2_4_black = pattern_ParallelGatewayToParallelStepRule_2_4_blackB(csp);
			if (result_pattern_ParallelGatewayToParallelStepRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						step, inFlowToStep, process, parallelGateway, flow,
						inFlowToFlow, laneSet, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_2_5_expressionFBB(
			ParallelGatewayToParallelStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGatewayToParallelStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGatewayToParallelStepRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_1_blackBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		if (!parallelStep.equals(step)) {
			return new Object[] { _this, match, step, parallelStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_2_bindingFBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step,
				parallelStep, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, parallelStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_2_bindingAndBlackFBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_10_2_binding = pattern_ParallelGatewayToParallelStepRule_10_2_bindingFBBBBB(
				_this, match, step, parallelStep, flow);
		if (result_pattern_ParallelGatewayToParallelStepRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_10_2_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_10_2_black = pattern_ParallelGatewayToParallelStepRule_10_2_blackB(csp);
			if (result_pattern_ParallelGatewayToParallelStepRule_10_2_black != null) {

				return new Object[] { csp, _this, match, step, parallelStep,
						flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_10_3_expressionFBB(
			ParallelGatewayToParallelStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_4_blackBBBB(
			Match match, Step step, ParallelStep parallelStep, Flow flow) {
		if (!parallelStep.equals(step)) {
			return new Object[] { match, step, parallelStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_4_greenBBBBFF(
			Match match, Step step, ParallelStep parallelStep, Flow flow) {
		EMoflonEdge step__parallelStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parallelStep);
		String step__parallelStep____next_name_prime = "next";
		String flow__parallelStep____steps_name_prime = "steps";
		step__parallelStep____next.setSrc(step);
		step__parallelStep____next.setTrg(parallelStep);
		match.getToBeTranslatedEdges().add(step__parallelStep____next);
		flow__parallelStep____steps.setSrc(flow);
		flow__parallelStep____steps.setTrg(parallelStep);
		match.getToBeTranslatedEdges().add(flow__parallelStep____steps);
		step__parallelStep____next
				.setName(step__parallelStep____next_name_prime);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		return new Object[] { match, step, parallelStep, flow,
				step__parallelStep____next, flow__parallelStep____steps };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_5_blackBBBB(
			Match match, Step step, ParallelStep parallelStep, Flow flow) {
		if (!parallelStep.equals(step)) {
			return new Object[] { match, step, parallelStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_10_5_greenBBB(
			Match match, Step step, Flow flow) {
		match.getContextNodes().add(step);
		match.getContextNodes().add(flow);
		return new Object[] { match, step, flow };
	}

	public static final void pattern_ParallelGatewayToParallelStepRule_10_6_expressionBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, step, parallelStep, flow);

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlowToStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("parallelStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_8 = isApplicableMatch.getObject("lane");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpInFlowToStep = _localVariable_2;
		EObject tmpParallelStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpInFlowToFlow = _localVariable_6;
		EObject tmpLaneSet = _localVariable_7;
		EObject tmpLane = _localVariable_8;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpInFlowToStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
					if (tmpParallelStep instanceof ParallelStep) {
						ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
									SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
									if (tmpLaneSet instanceof LaneSet) {
										LaneSet laneSet = (LaneSet) tmpLaneSet;
										if (tmpLane instanceof Lane) {
											Lane lane = (Lane) tmpLane;
											return new Object[] { inFlow, step,
													inFlowToStep, parallelStep,
													process, flow,
													inFlowToFlow, laneSet,
													lane, isApplicableMatch };
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_1_blackBBBBBBBBBFBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			ParallelStep parallelStep, bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane,
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!parallelStep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { inFlow, step, inFlowToStep,
							parallelStep, process, flow, inFlowToFlow, laneSet,
							lane, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_1_bindingAndBlackFFFFFFFFFFBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_11_1_binding = pattern_ParallelGatewayToParallelStepRule_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelGatewayToParallelStepRule_11_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[0];
			Step step = (Step) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[2];
			ParallelStep parallelStep = (ParallelStep) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[3];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[4];
			Flow flow = (Flow) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[5];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[6];
			LaneSet laneSet = (LaneSet) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[7];
			Lane lane = (Lane) result_pattern_ParallelGatewayToParallelStepRule_11_1_binding[8];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_11_1_black = pattern_ParallelGatewayToParallelStepRule_11_1_blackBBBBBBBBBFBB(
					inFlow, step, inFlowToStep, parallelStep, process, flow,
					inFlowToFlow, laneSet, lane, _this, isApplicableMatch);
			if (result_pattern_ParallelGatewayToParallelStepRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_11_1_black[9];

				return new Object[] { inFlow, step, inFlowToStep, parallelStep,
						process, flow, inFlowToFlow, laneSet, lane, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_1_greenBBBFFBB(
			SequenceFlow inFlow, ParallelStep parallelStep,
			bpmn2.Process process, Lane lane, CSP csp) {
		ParallelGateway parallelGateway = Bpmn2Factory.eINSTANCE
				.createParallelGateway();
		FlowNodeToStep parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		Object _localVariable_0 = csp.getValue("parallelGateway", "id");
		Object _localVariable_1 = csp.getValue("parallelGateway", "name");
		Object _localVariable_2 = csp.getValue("parallelGateway",
				"gatewayDirection");
		process.getFlowElements().add(parallelGateway);
		inFlow.setTargetRef(parallelGateway);
		lane.getFlowNodeRefs().add(parallelGateway);
		parallelGatewayToParallelStep.setSource(parallelGateway);
		parallelGatewayToParallelStep.setTarget(parallelStep);
		String parallelGateway_id_prime = (String) _localVariable_0;
		String parallelGateway_name_prime = (String) _localVariable_1;
		GatewayDirection parallelGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_2;
		parallelGateway.setId(parallelGateway_id_prime);
		parallelGateway.setName(parallelGateway_name_prime);
		parallelGateway
				.setGatewayDirection(parallelGateway_gatewayDirection_prime);
		return new Object[] { inFlow, parallelStep, process, parallelGateway,
				parallelGatewayToParallelStep, lane, csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_2_blackBBB(
			ParallelStep parallelStep, ParallelGateway parallelGateway,
			FlowNodeToStep parallelGatewayToParallelStep) {
		return new Object[] { parallelStep, parallelGateway,
				parallelGatewayToParallelStep };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_2_greenFBBB(
			ParallelStep parallelStep, ParallelGateway parallelGateway,
			FlowNodeToStep parallelGatewayToParallelStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(parallelStep);
		ruleresult.getCreatedElements().add(parallelGateway);
		ruleresult.getCreatedLinkElements().add(parallelGatewayToParallelStep);
		return new Object[] { ruleresult, parallelStep, parallelGateway,
				parallelGatewayToParallelStep };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject inFlowToStep, EObject parallelStep, EObject process,
			EObject parallelGateway, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow,
			EObject laneSet, EObject lane) {
		if (!inFlow.equals(step)) {
			if (!inFlow.equals(inFlowToStep)) {
				if (!inFlow.equals(parallelStep)) {
					if (!inFlow.equals(process)) {
						if (!inFlow.equals(parallelGateway)) {
							if (!inFlow.equals(parallelGatewayToParallelStep)) {
								if (!inFlow.equals(inFlowToFlow)) {
									if (!inFlow.equals(laneSet)) {
										if (!inFlow.equals(lane)) {
											if (!inFlowToStep.equals(step)) {
												if (!inFlowToStep
														.equals(parallelStep)) {
													if (!inFlowToStep
															.equals(process)) {
														if (!inFlowToStep
																.equals(parallelGateway)) {
															if (!inFlowToStep
																	.equals(parallelGatewayToParallelStep)) {
																if (!inFlowToStep
																		.equals(laneSet)) {
																	if (!inFlowToStep
																			.equals(lane)) {
																		if (!parallelStep
																				.equals(step)) {
																			if (!parallelStep
																					.equals(process)) {
																				if (!process
																						.equals(step)) {
																					if (!parallelGateway
																							.equals(step)) {
																						if (!parallelGateway
																								.equals(parallelStep)) {
																							if (!parallelGateway
																									.equals(process)) {
																								if (!parallelGateway
																										.equals(parallelGatewayToParallelStep)) {
																									if (!flow
																											.equals(inFlow)) {
																										if (!flow
																												.equals(step)) {
																											if (!flow
																													.equals(inFlowToStep)) {
																												if (!flow
																														.equals(parallelStep)) {
																													if (!flow
																															.equals(process)) {
																														if (!flow
																																.equals(parallelGateway)) {
																															if (!flow
																																	.equals(parallelGatewayToParallelStep)) {
																																if (!flow
																																		.equals(inFlowToFlow)) {
																																	if (!flow
																																			.equals(laneSet)) {
																																		if (!flow
																																				.equals(lane)) {
																																			if (!parallelGatewayToParallelStep
																																					.equals(step)) {
																																				if (!parallelGatewayToParallelStep
																																						.equals(parallelStep)) {
																																					if (!parallelGatewayToParallelStep
																																							.equals(process)) {
																																						if (!inFlowToFlow
																																								.equals(step)) {
																																							if (!inFlowToFlow
																																									.equals(inFlowToStep)) {
																																								if (!inFlowToFlow
																																										.equals(parallelStep)) {
																																									if (!inFlowToFlow
																																											.equals(process)) {
																																										if (!inFlowToFlow
																																												.equals(parallelGateway)) {
																																											if (!inFlowToFlow
																																													.equals(parallelGatewayToParallelStep)) {
																																												if (!inFlowToFlow
																																														.equals(laneSet)) {
																																													if (!inFlowToFlow
																																															.equals(lane)) {
																																														if (!laneSet
																																																.equals(step)) {
																																															if (!laneSet
																																																	.equals(parallelStep)) {
																																																if (!laneSet
																																																		.equals(process)) {
																																																	if (!laneSet
																																																			.equals(parallelGateway)) {
																																																		if (!laneSet
																																																				.equals(parallelGatewayToParallelStep)) {
																																																			if (!lane
																																																					.equals(step)) {
																																																				if (!lane
																																																						.equals(parallelStep)) {
																																																					if (!lane
																																																							.equals(process)) {
																																																						if (!lane
																																																								.equals(parallelGateway)) {
																																																							if (!lane
																																																									.equals(parallelGatewayToParallelStep)) {
																																																								if (!lane
																																																										.equals(laneSet)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											inFlow,
																																																											step,
																																																											inFlowToStep,
																																																											parallelStep,
																																																											process,
																																																											parallelGateway,
																																																											flow,
																																																											parallelGatewayToParallelStep,
																																																											inFlowToFlow,
																																																											laneSet,
																																																											lane };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_11_3_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject parallelStep, EObject process, EObject parallelGateway,
			EObject flow, EObject parallelGatewayToParallelStep, EObject lane) {
		EMoflonEdge step__parallelStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGatewayToParallelStepRule";
		String step__parallelStep____next_name_prime = "next";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		String flow__parallelStep____steps_name_prime = "steps";
		String parallelGatewayToParallelStep__parallelGateway____source_name_prime = "source";
		String parallelGatewayToParallelStep__parallelStep____target_name_prime = "target";
		String lane__parallelGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		step__parallelStep____next.setSrc(step);
		step__parallelStep____next.setTrg(parallelStep);
		ruleresult.getTranslatedEdges().add(step__parallelStep____next);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		ruleresult.getCreatedEdges().add(
				process__parallelGateway____flowElements);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		ruleresult.getCreatedEdges().add(inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(parallelGateway__inFlow____incoming);
		flow__parallelStep____steps.setSrc(flow);
		flow__parallelStep____steps.setTrg(parallelStep);
		ruleresult.getTranslatedEdges().add(flow__parallelStep____steps);
		parallelGatewayToParallelStep__parallelGateway____source
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelGateway____source
				.setTrg(parallelGateway);
		ruleresult.getCreatedEdges().add(
				parallelGatewayToParallelStep__parallelGateway____source);
		parallelGatewayToParallelStep__parallelStep____target
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelStep____target
				.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(
				parallelGatewayToParallelStep__parallelStep____target);
		lane__parallelGateway____flowNodeRefs.setSrc(lane);
		lane__parallelGateway____flowNodeRefs.setTrg(parallelGateway);
		ruleresult.getCreatedEdges().add(lane__parallelGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		step__parallelStep____next
				.setName(step__parallelStep____next_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		parallelGatewayToParallelStep__parallelGateway____source
				.setName(parallelGatewayToParallelStep__parallelGateway____source_name_prime);
		parallelGatewayToParallelStep__parallelStep____target
				.setName(parallelGatewayToParallelStep__parallelStep____target_name_prime);
		lane__parallelGateway____flowNodeRefs
				.setName(lane__parallelGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, step, parallelStep, process,
				parallelGateway, flow, parallelGatewayToParallelStep, lane,
				step__parallelStep____next,
				process__parallelGateway____flowElements,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming,
				flow__parallelStep____steps,
				parallelGatewayToParallelStep__parallelGateway____source,
				parallelGatewayToParallelStep__parallelStep____target,
				lane__parallelGateway____flowNodeRefs };
	}

	public static final void pattern_ParallelGatewayToParallelStepRule_11_5_expressionBBBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject inFlowToStep, EObject parallelStep, EObject process,
			EObject parallelGateway, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow,
			EObject laneSet, EObject lane) {
		_this.registerObjects_BWD(ruleresult, inFlow, step, inFlowToStep,
				parallelStep, process, parallelGateway, flow,
				parallelGatewayToParallelStep, inFlowToFlow, laneSet, lane);

	}

	public static final PerformRuleResult pattern_ParallelGatewayToParallelStepRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_1_blackFBB(
			EClass eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_12_1_binding = pattern_ParallelGatewayToParallelStepRule_12_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_12_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_12_1_black = pattern_ParallelGatewayToParallelStepRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGatewayToParallelStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("parallelStep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpParallelStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpStep instanceof Step) {
			Step step = (Step) tmpStep;
			if (tmpParallelStep instanceof ParallelStep) {
				ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { step, parallelStep, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_12_2_blackFBFBBFB(
			Step step, ParallelStep parallelStep, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!parallelStep.equals(step)) {
			for (SequenceFlowToStep inFlowToStep : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(step, SequenceFlowToStep.class,
							"target")) {
				SequenceFlow inFlow = inFlowToStep.getSource();
				if (inFlow != null) {
					for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									SequenceFlowToUCFlow.class, "target")) {
						if (inFlow.equals(inFlowToFlow.getSource())) {
							_result.add(new Object[] { inFlow, step,
									inFlowToStep, parallelStep, flow,
									inFlowToFlow, match });
						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_12_3_blackBBBBFBBFF(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			ParallelStep parallelStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!parallelStep.equals(step)) {
			if (parallelStep.equals(step.getNext())) {
				if (inFlow.equals(inFlowToStep.getSource())) {
					if (step.equals(inFlowToStep.getTarget())) {
						if (flow.getSteps().contains(parallelStep)) {
							if (inFlow.equals(inFlowToFlow.getSource())) {
								if (flow.equals(inFlowToFlow.getTarget())) {
									for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													inFlow,
													FlowElementsContainer.class,
													"flowElements")) {
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											for (LaneSet laneSet : process
													.getLaneSets()) {
												for (Lane lane : laneSet
														.getLanes()) {
													_result.add(new Object[] {
															inFlow, step,
															inFlowToStep,
															parallelStep,
															process, flow,
															inFlowToFlow,
															laneSet, lane });
												}
											}
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_3_greenBBBBBBBBBFFFFFFFFFF(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			ParallelStep parallelStep, bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge step__parallelStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String step__parallelStep____next_name_prime = "next";
		String inFlowToStep__inFlow____source_name_prime = "source";
		String inFlowToStep__step____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String flow__parallelStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(inFlowToStep);
		isApplicableMatch.getAllContextElements().add(parallelStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(lane);
		step__parallelStep____next.setSrc(step);
		step__parallelStep____next.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				step__parallelStep____next);
		inFlowToStep__inFlow____source.setSrc(inFlowToStep);
		inFlowToStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__inFlow____source);
		inFlowToStep__step____target.setSrc(inFlowToStep);
		inFlowToStep__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__step____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		flow__parallelStep____steps.setSrc(flow);
		flow__parallelStep____steps.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				flow__parallelStep____steps);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		step__parallelStep____next
				.setName(step__parallelStep____next_name_prime);
		inFlowToStep__inFlow____source
				.setName(inFlowToStep__inFlow____source_name_prime);
		inFlowToStep__step____target
				.setName(inFlowToStep__step____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlow, step, inFlowToStep, parallelStep,
				process, flow, inFlowToFlow, laneSet, lane, isApplicableMatch,
				step__parallelStep____next, inFlowToStep__inFlow____source,
				inFlowToStep__step____target, process__laneSet____laneSets,
				process__inFlow____flowElements, flow__parallelStep____steps,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				laneSet__lane____lanes };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_4_bindingFBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep,
			ParallelStep parallelStep, bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, inFlow, step, inFlowToStep, parallelStep,
				process, flow, inFlowToFlow, laneSet, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow, step,
					inFlowToStep, parallelStep, process, flow, inFlowToFlow,
					laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_4_bindingAndBlackFBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep,
			ParallelStep parallelStep, bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_12_4_binding = pattern_ParallelGatewayToParallelStepRule_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, step, inFlowToStep,
				parallelStep, process, flow, inFlowToFlow, laneSet, lane);
		if (result_pattern_ParallelGatewayToParallelStepRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_12_4_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_12_4_black = pattern_ParallelGatewayToParallelStepRule_12_4_blackB(csp);
			if (result_pattern_ParallelGatewayToParallelStepRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						step, inFlowToStep, parallelStep, process, flow,
						inFlowToFlow, laneSet, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_12_5_expressionFBB(
			ParallelGatewayToParallelStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGatewayToParallelStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGatewayToParallelStepRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_1_blackFBB(
			EClass __eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_20_1_binding = pattern_ParallelGatewayToParallelStepRule_20_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_20_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_20_1_black = pattern_ParallelGatewayToParallelStepRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_20_2_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_next.getSrc();
		if (tmpStep instanceof Step) {
			Step step = (Step) tmpStep;
			EObject tmpParallelStep = _edge_next.getTrg();
			if (tmpParallelStep instanceof ParallelStep) {
				ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
				if (!parallelStep.equals(step)) {
					if (parallelStep.equals(step.getNext())) {
						for (Flow flow : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(parallelStep,
										Flow.class, "steps")) {
							_result.add(new Object[] { step, parallelStep,
									flow, _edge_next });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_20_3_expressionFBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step,
				parallelStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_20_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGatewayToParallelStepRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_1_blackFBB(
			EClass __eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_21_1_binding = pattern_ParallelGatewayToParallelStepRule_21_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_21_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_21_1_black = pattern_ParallelGatewayToParallelStepRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_21_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpParallelGateway = _edge_flowElements.getTrg();
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (process.getFlowElements().contains(parallelGateway)) {
					for (LaneSet laneSet : process.getLaneSets()) {
						for (FlowElement tmpInFlow : process.getFlowElements()) {
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (parallelGateway.equals(inFlow
										.getTargetRef())) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												parallelGateway)) {
											_result.add(new Object[] { inFlow,
													process, parallelGateway,
													laneSet, lane,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_21_3_expressionFBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, parallelGateway, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_21_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGatewayToParallelStepRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_1_blackFBB(
			EClass __eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_22_1_binding = pattern_ParallelGatewayToParallelStepRule_22_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_22_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_22_1_black = pattern_ParallelGatewayToParallelStepRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_22_2_blackFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpParallelGateway = _edge_targetRef.getTrg();
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (parallelGateway.equals(inFlow.getTargetRef())) {
					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(inFlow,
									FlowElementsContainer.class, "flowElements")) {
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (process.getFlowElements().contains(
									parallelGateway)) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												parallelGateway)) {
											_result.add(new Object[] { inFlow,
													process, parallelGateway,
													laneSet, lane,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_22_3_expressionFBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, parallelGateway, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_22_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGatewayToParallelStepRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_1_blackFBB(
			EClass __eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_23_1_binding = pattern_ParallelGatewayToParallelStepRule_23_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_23_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_23_1_black = pattern_ParallelGatewayToParallelStepRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_23_2_blackFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelGateway = _edge_incoming.getSrc();
		if (tmpParallelGateway instanceof ParallelGateway) {
			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (parallelGateway.equals(inFlow.getTargetRef())) {
					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(parallelGateway,
									FlowElementsContainer.class, "flowElements")) {
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (process.getFlowElements().contains(inFlow)) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												parallelGateway)) {
											_result.add(new Object[] { inFlow,
													process, parallelGateway,
													laneSet, lane,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_23_3_expressionFBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, parallelGateway, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_23_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGatewayToParallelStepRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_1_blackFBB(
			EClass __eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_24_1_binding = pattern_ParallelGatewayToParallelStepRule_24_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_24_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_24_1_black = pattern_ParallelGatewayToParallelStepRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_24_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpParallelStep = _edge_steps.getTrg();
			if (tmpParallelStep instanceof ParallelStep) {
				ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
				if (flow.getSteps().contains(parallelStep)) {
					for (Step step : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(parallelStep,
									Step.class, "next")) {
						if (!parallelStep.equals(step)) {
							_result.add(new Object[] { step, parallelStep,
									flow, _edge_steps });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_24_3_expressionFBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match, Step step,
			ParallelStep parallelStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step,
				parallelStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_24_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGatewayToParallelStepRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_1_bindingFB(
			ParallelGatewayToParallelStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_1_blackFBB(
			EClass __eClass, ParallelGatewayToParallelStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_1_bindingAndBlackFFB(
			ParallelGatewayToParallelStepRule _this) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_25_1_binding = pattern_ParallelGatewayToParallelStepRule_25_1_bindingFB(_this);
		if (result_pattern_ParallelGatewayToParallelStepRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGatewayToParallelStepRule_25_1_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_25_1_black = pattern_ParallelGatewayToParallelStepRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGatewayToParallelStepRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGatewayToParallelStepRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_25_2_blackFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpParallelGateway = _edge_flowNodeRefs.getTrg();
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (lane.getFlowNodeRefs().contains(parallelGateway)) {
					for (SequenceFlow inFlow : parallelGateway.getIncoming()) {
						for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(lane, LaneSet.class,
										"lanes")) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(parallelGateway,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getLaneSets().contains(laneSet)) {
										if (process.getFlowElements().contains(
												inFlow)) {
											_result.add(new Object[] { inFlow,
													process, parallelGateway,
													laneSet, lane,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_25_3_expressionFBBBBBBB(
			ParallelGatewayToParallelStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			ParallelGateway parallelGateway, LaneSet laneSet, Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, parallelGateway, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_25_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGatewayToParallelStepRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_1_blackB(
			ParallelGatewayToParallelStepRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlowToStep inFlowToStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToStep)) {
			return new Object[] { ruleResult, inFlowToStep };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGatewayToParallelStepRule_28_2_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlowToStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlowToStep : inFlowToStepList.getEntryObjects()) {
				if (tmpInFlowToStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
					SequenceFlow inFlow = inFlowToStep.getSource();
					if (inFlow != null) {
						Step step = inFlowToStep.getTarget();
						if (step != null) {
							if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_1BB(
									ruleResult, inFlowToStep) == null) {
								if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_0BB(
										ruleResult, inFlow) == null) {
									if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_2BB(
											ruleResult, step) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_3BB(
														ruleResult, process) == null) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_4BB(
																ruleResult,
																laneSet) == null) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_5BB(
																		ruleResult,
																		lane) == null) {
																	for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					inFlow,
																					SequenceFlowToUCFlow.class,
																					"source")) {
																		Flow flow = inFlowToFlow
																				.getTarget();
																		if (flow != null) {
																			if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_6BB(
																					ruleResult,
																					inFlowToFlow) == null) {
																				if (pattern_ParallelGatewayToParallelStepRule_28_2_black_nac_7BB(
																						ruleResult,
																						flow) == null) {
																					_result.add(new Object[] {
																							inFlowToStepList,
																							inFlow,
																							inFlowToStep,
																							step,
																							process,
																							laneSet,
																							lane,
																							inFlowToFlow,
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

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_3_bindingFBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet,
			Lane lane, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, inFlow, step, inFlowToStep, process, flow,
				inFlowToFlow, laneSet, lane, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow, step,
					inFlowToStep, process, flow, inFlowToFlow, laneSet, lane,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_3_bindingAndBlackFBBBBBBBBBBB(
			ParallelGatewayToParallelStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet,
			Lane lane, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelGatewayToParallelStepRule_28_3_binding = pattern_ParallelGatewayToParallelStepRule_28_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, step, inFlowToStep, process,
				flow, inFlowToFlow, laneSet, lane, ruleResult);
		if (result_pattern_ParallelGatewayToParallelStepRule_28_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGatewayToParallelStepRule_28_3_binding[0];

			Object[] result_pattern_ParallelGatewayToParallelStepRule_28_3_black = pattern_ParallelGatewayToParallelStepRule_28_3_blackB(csp);
			if (result_pattern_ParallelGatewayToParallelStepRule_28_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						step, inFlowToStep, process, flow, inFlowToFlow,
						laneSet, lane, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGatewayToParallelStepRule_28_4_expressionFBB(
			ParallelGatewayToParallelStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_5_blackBBBBBBBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane) {
		return new Object[] { inFlow, step, inFlowToStep, process, flow,
				inFlowToFlow, laneSet, lane };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_6_blackBBBBBBBBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, LaneSet laneSet, Lane lane,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { inFlow, step, inFlowToStep, process, flow,
				inFlowToFlow, laneSet, lane, ruleResult };
	}

	public static final Object[] pattern_ParallelGatewayToParallelStepRule_28_6_greenBBFBFBFBBB(
			SequenceFlow inFlow, Step step, bpmn2.Process process, Flow flow,
			Lane lane, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelStep parallelStep = UseCaseDSLFactory.eINSTANCE
				.createParallelStep();
		ParallelGateway parallelGateway = Bpmn2Factory.eINSTANCE
				.createParallelGateway();
		FlowNodeToStep parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		Object _localVariable_0 = csp.getValue("parallelStep", "name");
		Object _localVariable_1 = csp.getValue("parallelStep", "label");
		Object _localVariable_2 = csp.getValue("parallelGateway", "id");
		Object _localVariable_3 = csp.getValue("parallelGateway", "name");
		Object _localVariable_4 = csp.getValue("parallelGateway",
				"gatewayDirection");
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		step.setNext(parallelStep);
		flow.getSteps().add(parallelStep);
		ruleResult.getTargetObjects().add(parallelStep);
		process.getFlowElements().add(parallelGateway);
		inFlow.setTargetRef(parallelGateway);
		lane.getFlowNodeRefs().add(parallelGateway);
		ruleResult.getSourceObjects().add(parallelGateway);
		parallelGatewayToParallelStep.setSource(parallelGateway);
		parallelGatewayToParallelStep.setTarget(parallelStep);
		ruleResult.getCorrObjects().add(parallelGatewayToParallelStep);
		String parallelStep_name_prime = (String) _localVariable_0;
		String parallelStep_label_prime = (String) _localVariable_1;
		String parallelGateway_id_prime = (String) _localVariable_2;
		String parallelGateway_name_prime = (String) _localVariable_3;
		GatewayDirection parallelGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_4;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		parallelStep.setName(parallelStep_name_prime);
		parallelStep.setLabel(parallelStep_label_prime);
		parallelGateway.setId(parallelGateway_id_prime);
		parallelGateway.setName(parallelGateway_name_prime);
		parallelGateway
				.setGatewayDirection(parallelGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { inFlow, step, parallelStep, process,
				parallelGateway, flow, parallelGatewayToParallelStep, lane,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelGatewayToParallelStepRule_28_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelGatewayToParallelStepRuleImpl
