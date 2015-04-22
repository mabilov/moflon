/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule;

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
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
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
 * An implementation of the model object '<em><b>Seq Flow After PG To Parallel Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeqFlowAfterPGToParallelFlowRuleImpl extends AbstractRuleImpl
		implements SeqFlowAfterPGToParallelFlowRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqFlowAfterPGToParallelFlowRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSeqFlowAfterPGToParallelFlowRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		// initial bindings
		Object[] result1_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_0_1_blackBBBBBB(this,
						match, process, parallelGateway, sequenceFlow, inFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_0_2_bindingAndBlackFBBBBBB(
						this, match, process, parallelGateway, sequenceFlow,
						inFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_4_blackBBBBB(
							match, process, parallelGateway, sequenceFlow,
							inFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_4_greenBBBBFFF(
							match, process, parallelGateway, sequenceFlow);
			// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result4_green[4];
			// EMoflonEdge sequenceFlow__parallelGateway____sourceRef = (EMoflonEdge) result4_green[5];
			// EMoflonEdge parallelGateway__sequenceFlow____outgoing = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_5_blackBBBBB(
							match, process, parallelGateway, sequenceFlow,
							inFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_5_greenBBBBFFFF(
							match, process, parallelGateway, inFlow);
			// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result5_green[4];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[5];
			// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result5_green[6];
			// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result5_green[7];

			// register objects to match
			SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_6_expressionBBBBBB(
							this, match, process, parallelGateway,
							sequenceFlow, inFlow);
			return SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_7_expressionF();
		} else {
			return SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_1_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		ParallelGateway parallelGateway = (ParallelGateway) result1_bindingAndBlack[1];
		SequenceFlow sequenceFlow = (SequenceFlow) result1_bindingAndBlack[2];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[5];
		UseCase useCase = (UseCase) result1_bindingAndBlack[6];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[7];
		ParallelStep parallelStep = (ParallelStep) result1_bindingAndBlack[8];
		FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_1_greenBBBFFB(
						sequenceFlow, useCase, parallelStep, csp);
		ParallelFlow parallelFlow = (ParallelFlow) result1_green[3];
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = (SequenceFlowToUCFlow) result1_green[4];

		// collect translated elements
		Object[] result2_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_2_blackBBB(
						sequenceFlow, parallelFlow, sequenceFlowToParallelFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_2_greenFBBB(
						sequenceFlow, parallelFlow, sequenceFlowToParallelFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_3_blackBBBBBBBBBBBBB(
						ruleresult, process, parallelGateway, sequenceFlow,
						inFlow, flow, inFlowToFlow, useCase, processToUseCase,
						parallelStep, parallelGatewayToParallelStep,
						parallelFlow, sequenceFlowToParallelFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_3_greenBBBBBBBBFFFFFFF(
						ruleresult, process, parallelGateway, sequenceFlow,
						useCase, parallelStep, parallelFlow,
						sequenceFlowToParallelFlow);
		// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result3_green[8];
		// EMoflonEdge sequenceFlow__parallelGateway____sourceRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge parallelGateway__sequenceFlow____outgoing = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCase__parallelFlow____flows = (EMoflonEdge) result3_green[11];
		// EMoflonEdge parallelStep__parallelFlow____invokedFlows = (EMoflonEdge) result3_green[12];
		// EMoflonEdge sequenceFlowToParallelFlow__sequenceFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge sequenceFlowToParallelFlow__parallelFlow____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_5_expressionBBBBBBBBBBBBBB(
						this, ruleresult, process, parallelGateway,
						sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
						processToUseCase, parallelStep,
						parallelGatewayToParallelStep, parallelFlow,
						sequenceFlowToParallelFlow);
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		ParallelGateway parallelGateway = (ParallelGateway) result2_binding[1];
		SequenceFlow sequenceFlow = (SequenceFlow) result2_binding[2];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[3];
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_2_2_blackBBBBFFFFFFB(
						process, parallelGateway, sequenceFlow, inFlow, match)) {
			Flow flow = (Flow) result2_black[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[7];
			ParallelStep parallelStep = (ParallelStep) result2_black[8];
			FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_2_3_blackBBBBBBBBBB(
							process, parallelGateway, sequenceFlow, inFlow,
							flow, inFlowToFlow, useCase, processToUseCase,
							parallelStep, parallelGatewayToParallelStep)) {
				Object[] result3_green = SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
								process, parallelGateway, sequenceFlow, inFlow,
								flow, inFlowToFlow, useCase, processToUseCase,
								parallelStep, parallelGatewayToParallelStep);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sequenceFlow__parallelGateway____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge parallelGateway__sequenceFlow____outgoing = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[21];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_2_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, process,
								parallelGateway, sequenceFlow, inFlow, flow,
								inFlowToFlow, useCase, processToUseCase,
								parallelStep, parallelGatewayToParallelStep);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		match.registerObject("process", process);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("sequenceFlow", sequenceFlow);
		match.registerObject("inFlow", inFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {// Create CSP
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
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sequenceFlow_id = CSPFactoryHelper.eINSTANCE
				.createVariable("sequenceFlow.id", true, csp);
		var_sequenceFlow_id.setValue(sequenceFlow.getId());
		var_sequenceFlow_id.setType("String");

		// Create unbound variables
		Variable var_parallelFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelFlow.name", csp);
		var_parallelFlow_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sequenceFlow_id, var_parallelFlow_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("sequenceFlow", sequenceFlow);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
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
			EObject process, EObject parallelGateway, EObject sequenceFlow,
			EObject inFlow, EObject flow, EObject inFlowToFlow,
			EObject useCase, EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("parallelFlow", parallelFlow);
		ruleresult.registerObject("sequenceFlowToParallelFlow",
				sequenceFlowToParallelFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("sequenceFlow").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Flow flow, UseCase useCase,
			ParallelStep parallelStep, ParallelFlow parallelFlow) {
		// initial bindings
		Object[] result1_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_10_1_blackBBBBBB(
						this, match, flow, useCase, parallelStep, parallelFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_10_2_bindingAndBlackFBBBBBB(
						this, match, flow, useCase, parallelStep, parallelFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_4_blackBBBBB(
							match, flow, useCase, parallelStep, parallelFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_4_greenBBBBFF(
							match, useCase, parallelStep, parallelFlow);
			// EMoflonEdge useCase__parallelFlow____flows = (EMoflonEdge) result4_green[4];
			// EMoflonEdge parallelStep__parallelFlow____invokedFlows = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_5_blackBBBBB(
							match, flow, useCase, parallelStep, parallelFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_5_greenBBBBFF(
							match, flow, useCase, parallelStep);
			// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result5_green[4];
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];

			// register objects to match
			SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_6_expressionBBBBBB(
							this, match, flow, useCase, parallelStep,
							parallelFlow);
			return SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_7_expressionF();
		} else {
			return SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_1_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		ParallelGateway parallelGateway = (ParallelGateway) result1_bindingAndBlack[1];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[6];
		ParallelStep parallelStep = (ParallelStep) result1_bindingAndBlack[7];
		FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result1_bindingAndBlack[8];
		ParallelFlow parallelFlow = (ParallelFlow) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_1_greenBBFBFB(
						process, parallelGateway, parallelFlow, csp);
		SequenceFlow sequenceFlow = (SequenceFlow) result1_green[2];
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = (SequenceFlowToUCFlow) result1_green[4];

		// collect translated elements
		Object[] result2_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_2_blackBBB(
						sequenceFlow, parallelFlow, sequenceFlowToParallelFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_2_greenFBBB(
						sequenceFlow, parallelFlow, sequenceFlowToParallelFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_3_blackBBBBBBBBBBBBB(
						ruleresult, process, parallelGateway, sequenceFlow,
						inFlow, flow, inFlowToFlow, useCase, processToUseCase,
						parallelStep, parallelGatewayToParallelStep,
						parallelFlow, sequenceFlowToParallelFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_3_greenBBBBBBBBFFFFFFF(
						ruleresult, process, parallelGateway, sequenceFlow,
						useCase, parallelStep, parallelFlow,
						sequenceFlowToParallelFlow);
		// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result3_green[8];
		// EMoflonEdge sequenceFlow__parallelGateway____sourceRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge parallelGateway__sequenceFlow____outgoing = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCase__parallelFlow____flows = (EMoflonEdge) result3_green[11];
		// EMoflonEdge parallelStep__parallelFlow____invokedFlows = (EMoflonEdge) result3_green[12];
		// EMoflonEdge sequenceFlowToParallelFlow__sequenceFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge sequenceFlowToParallelFlow__parallelFlow____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_5_expressionBBBBBBBBBBBBBB(
						this, ruleresult, process, parallelGateway,
						sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
						processToUseCase, parallelStep,
						parallelGatewayToParallelStep, parallelFlow,
						sequenceFlowToParallelFlow);
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Flow flow = (Flow) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		ParallelStep parallelStep = (ParallelStep) result2_binding[2];
		ParallelFlow parallelFlow = (ParallelFlow) result2_binding[3];
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_12_2_blackFFFBFBFBFBB(
						flow, useCase, parallelStep, parallelFlow, match)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[6];
			FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_12_3_blackBBBBBBBBBB(
							process, parallelGateway, inFlow, flow,
							inFlowToFlow, useCase, processToUseCase,
							parallelStep, parallelGatewayToParallelStep,
							parallelFlow)) {
				Object[] result3_green = SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
								process, parallelGateway, inFlow, flow,
								inFlowToFlow, useCase, processToUseCase,
								parallelStep, parallelGatewayToParallelStep,
								parallelFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlow__parallelGateway____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge parallelGateway__inFlow____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__parallelStep____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[18];
				// EMoflonEdge useCase__parallelFlow____flows = (EMoflonEdge) result3_green[19];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge parallelStep__parallelFlow____invokedFlows = (EMoflonEdge) result3_green[22];
				// EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_12_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, process,
								parallelGateway, inFlow, flow, inFlowToFlow,
								useCase, processToUseCase, parallelStep,
								parallelGatewayToParallelStep, parallelFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("parallelStep", parallelStep);
		match.registerObject("parallelFlow", parallelFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {// Create CSP
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
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_parallelFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelFlow.name", true, csp);
		var_parallelFlow_name.setValue(parallelFlow.getName());
		var_parallelFlow_name.setType("String");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_sequenceFlow_id = CSPFactoryHelper.eINSTANCE
				.createVariable("sequenceFlow.id", csp);
		var_sequenceFlow_id.setType("String");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		eq.setRuleName("");
		eq.solve(var_sequenceFlow_id, var_parallelFlow_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		isApplicableMatch.registerObject("parallelFlow", parallelFlow);
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
			EObject process, EObject parallelGateway, EObject sequenceFlow,
			EObject inFlow, EObject flow, EObject inFlowToFlow,
			EObject useCase, EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("parallelFlow", parallelFlow);
		ruleresult.registerObject("sequenceFlowToParallelFlow",
				sequenceFlowToParallelFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("parallelFlow")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_66(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_20_2_blackFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[1];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_20_3_expressionFBBBBBB(
							this, match, process, parallelGateway,
							sequenceFlow, inFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_67(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_21_2_blackFFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[1];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_21_3_expressionFBBBBBB(
							this, match, process, parallelGateway,
							sequenceFlow, inFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_68(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_22_2_blackFFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[1];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_22_3_expressionFBBBBBB(
							this, match, process, parallelGateway,
							sequenceFlow, inFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_24(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_23_2_blackFFFFB(_edge_flows)) {
			Flow flow = (Flow) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			ParallelStep parallelStep = (ParallelStep) result2_black[2];
			ParallelFlow parallelFlow = (ParallelFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_23_3_expressionFBBBBBB(
							this, match, flow, useCase, parallelStep,
							parallelFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_25(
			EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_24_2_blackFFFFB(_edge_invokedFlows)) {
			Flow flow = (Flow) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			ParallelStep parallelStep = (ParallelStep) result2_black[2];
			ParallelFlow parallelFlow = (ParallelFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_24_3_expressionFBBBBBB(
							this, match, flow, useCase, parallelStep,
							parallelFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_24_6_expressionFB(__result);
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
		Object[] result1_black = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_27_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_27_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_27_2_blackFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToFlowList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			ParallelStep parallelStep = (ParallelStep) result2_black[6];
			FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result2_black[7];
			UseCase useCase = (UseCase) result2_black[8];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[9];

			// solve CSP
			Object[] result3_bindingAndBlack = SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_27_3_bindingAndBlackFBBBBBBBBBBBB(
							this, isApplicableMatch, process, parallelGateway,
							inFlow, flow, inFlowToFlow, useCase,
							processToUseCase, parallelStep,
							parallelGatewayToParallelStep, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SeqFlowAfterPGToParallelFlowRuleImpl
					.pattern_SeqFlowAfterPGToParallelFlowRule_27_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = SeqFlowAfterPGToParallelFlowRuleImpl
						.pattern_SeqFlowAfterPGToParallelFlowRule_27_5_blackBBBBBBBBB(
								process, parallelGateway, inFlow, flow,
								inFlowToFlow, useCase, processToUseCase,
								parallelStep, parallelGatewayToParallelStep);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_27_6_blackBBBBBBBBBB(
									process, parallelGateway, inFlow, flow,
									inFlowToFlow, useCase, processToUseCase,
									parallelStep,
									parallelGatewayToParallelStep, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					SeqFlowAfterPGToParallelFlowRuleImpl
							.pattern_SeqFlowAfterPGToParallelFlowRule_27_6_greenBBFBBFFBB(
									process, parallelGateway, useCase,
									parallelStep, ruleResult, csp);
					// SequenceFlow sequenceFlow = (SequenceFlow) result6_green[2];
					// ParallelFlow parallelFlow = (ParallelFlow) result6_green[5];
					// SequenceFlowToUCFlow sequenceFlowToParallelFlow = (SequenceFlowToUCFlow) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterPGToParallelFlowRuleImpl
				.pattern_SeqFlowAfterPGToParallelFlowRule_27_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

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
		Variable var_sequenceFlow_id = CSPFactoryHelper.eINSTANCE
				.createVariable("sequenceFlow.id", csp);
		var_sequenceFlow_id.setType("String");
		Variable var_parallelFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelFlow.name", csp);
		var_parallelFlow_name.setType("String");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		eq.setRuleName("");
		eq.solve(var_sequenceFlow_id, var_parallelFlow_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
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
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(UseCase) arguments.get(7),
					(ProcessToUseCase) arguments.get(8),
					(ParallelStep) arguments.get(9),
					(FlowNodeToStep) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(ParallelStep) arguments.get(3),
					(ParallelFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(ParallelStep) arguments.get(3),
					(ParallelFlow) arguments.get(4));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(ParallelStep) arguments.get(3),
					(ParallelFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP_PARALLELFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(ParallelStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(ParallelFlow) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_66((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_67__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_67((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_68__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_68((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_24((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(ParallelStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_1_blackBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		if (!inFlow.equals(sequenceFlow)) {
			return new Object[] { _this, match, process, parallelGateway,
					sequenceFlow, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_2_bindingFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				parallelGateway, sequenceFlow, inFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, parallelGateway,
					sequenceFlow, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_2_bindingAndBlackFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_0_2_binding = pattern_SeqFlowAfterPGToParallelFlowRule_0_2_bindingFBBBBBB(
				_this, match, process, parallelGateway, sequenceFlow, inFlow);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_0_2_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_0_2_black = pattern_SeqFlowAfterPGToParallelFlowRule_0_2_blackB(csp);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process,
						parallelGateway, sequenceFlow, inFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_0_3_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_4_blackBBBBB(
			Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		if (!inFlow.equals(sequenceFlow)) {
			return new Object[] { match, process, parallelGateway,
					sequenceFlow, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_4_greenBBBBFFF(
			Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow) {
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sequenceFlow);
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String sequenceFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__sequenceFlow____outgoing_name_prime = "outgoing";
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		match.getToBeTranslatedEdges().add(
				process__sequenceFlow____flowElements);
		sequenceFlow__parallelGateway____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		match.getToBeTranslatedEdges().add(
				sequenceFlow__parallelGateway____sourceRef);
		parallelGateway__sequenceFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__sequenceFlow____outgoing.setTrg(sequenceFlow);
		match.getToBeTranslatedEdges().add(
				parallelGateway__sequenceFlow____outgoing);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		sequenceFlow__parallelGateway____sourceRef
				.setName(sequenceFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__sequenceFlow____outgoing
				.setName(parallelGateway__sequenceFlow____outgoing_name_prime);
		return new Object[] { match, process, parallelGateway, sequenceFlow,
				process__sequenceFlow____flowElements,
				sequenceFlow__parallelGateway____sourceRef,
				parallelGateway__sequenceFlow____outgoing };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_5_blackBBBBB(
			Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow) {
		if (!inFlow.equals(sequenceFlow)) {
			return new Object[] { match, process, parallelGateway,
					sequenceFlow, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_0_5_greenBBBBFFFF(
			Match match, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow inFlow) {
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(parallelGateway);
		match.getContextNodes().add(inFlow);
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		match.getContextEdges().add(process__parallelGateway____flowElements);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		match.getContextEdges().add(inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		match.getContextEdges().add(parallelGateway__inFlow____incoming);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		return new Object[] { match, process, parallelGateway, inFlow,
				process__parallelGateway____flowElements,
				process__inFlow____flowElements,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming };
	}

	public static final void pattern_SeqFlowAfterPGToParallelFlowRule_0_6_expressionBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		_this.registerObjectsToMatch_FWD(match, process, parallelGateway,
				sequenceFlow, inFlow);

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("parallelGateway");
		EObject _localVariable_2 = isApplicableMatch.getObject("sequenceFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_6 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_8 = isApplicableMatch.getObject("parallelStep");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("parallelGatewayToParallelStep");
		EObject tmpProcess = _localVariable_0;
		EObject tmpParallelGateway = _localVariable_1;
		EObject tmpSequenceFlow = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpInFlowToFlow = _localVariable_5;
		EObject tmpUseCase = _localVariable_6;
		EObject tmpProcessToUseCase = _localVariable_7;
		EObject tmpParallelStep = _localVariable_8;
		EObject tmpParallelGatewayToParallelStep = _localVariable_9;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (tmpSequenceFlow instanceof SequenceFlow) {
					SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
								SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
								if (tmpUseCase instanceof UseCase) {
									UseCase useCase = (UseCase) tmpUseCase;
									if (tmpProcessToUseCase instanceof ProcessToUseCase) {
										ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
										if (tmpParallelStep instanceof ParallelStep) {
											ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
											if (tmpParallelGatewayToParallelStep instanceof FlowNodeToStep) {
												FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) tmpParallelGatewayToParallelStep;
												return new Object[] {
														process,
														parallelGateway,
														sequenceFlow,
														inFlow,
														flow,
														inFlowToFlow,
														useCase,
														processToUseCase,
														parallelStep,
														parallelGatewayToParallelStep,
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_1_blackBBBBBBBBBBFBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(sequenceFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, parallelGateway,
							sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
							processToUseCase, parallelStep,
							parallelGatewayToParallelStep, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_1_bindingAndBlackFFFFFFFFFFFBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_1_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[0];
			ParallelGateway parallelGateway = (ParallelGateway) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[1];
			SequenceFlow sequenceFlow = (SequenceFlow) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[3];
			Flow flow = (Flow) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[5];
			UseCase useCase = (UseCase) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[6];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[7];
			ParallelStep parallelStep = (ParallelStep) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[8];
			FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_binding[9];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_1_1_blackBBBBBBBBBBFBB(
					process, parallelGateway, sequenceFlow, inFlow, flow,
					inFlowToFlow, useCase, processToUseCase, parallelStep,
					parallelGatewayToParallelStep, _this, isApplicableMatch);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_1_1_black[10];

				return new Object[] { process, parallelGateway, sequenceFlow,
						inFlow, flow, inFlowToFlow, useCase, processToUseCase,
						parallelStep, parallelGatewayToParallelStep, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_1_greenBBBFFB(
			SequenceFlow sequenceFlow, UseCase useCase,
			ParallelStep parallelStep, CSP csp) {
		ParallelFlow parallelFlow = UseCaseDSLFactory.eINSTANCE
				.createParallelFlow();
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("parallelFlow", "name");
		useCase.getFlows().add(parallelFlow);
		parallelStep.getInvokedFlows().add(parallelFlow);
		sequenceFlowToParallelFlow.setSource(sequenceFlow);
		sequenceFlowToParallelFlow.setTarget(parallelFlow);
		String parallelFlow_name_prime = (String) _localVariable_0;
		parallelFlow.setName(parallelFlow_name_prime);
		return new Object[] { sequenceFlow, useCase, parallelStep,
				parallelFlow, sequenceFlowToParallelFlow, csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_2_blackBBB(
			SequenceFlow sequenceFlow, ParallelFlow parallelFlow,
			SequenceFlowToUCFlow sequenceFlowToParallelFlow) {
		return new Object[] { sequenceFlow, parallelFlow,
				sequenceFlowToParallelFlow };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_2_greenFBBB(
			SequenceFlow sequenceFlow, ParallelFlow parallelFlow,
			SequenceFlowToUCFlow sequenceFlowToParallelFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sequenceFlow);
		ruleresult.getCreatedElements().add(parallelFlow);
		ruleresult.getCreatedLinkElements().add(sequenceFlowToParallelFlow);
		return new Object[] { ruleresult, sequenceFlow, parallelFlow,
				sequenceFlowToParallelFlow };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process,
			EObject parallelGateway, EObject sequenceFlow, EObject inFlow,
			EObject flow, EObject inFlowToFlow, EObject useCase,
			EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		if (!process.equals(sequenceFlow)) {
			if (!process.equals(useCase)) {
				if (!process.equals(processToUseCase)) {
					if (!process.equals(sequenceFlowToParallelFlow)) {
						if (!parallelGateway.equals(process)) {
							if (!parallelGateway.equals(sequenceFlow)) {
								if (!parallelGateway.equals(useCase)) {
									if (!parallelGateway
											.equals(processToUseCase)) {
										if (!parallelGateway
												.equals(parallelStep)) {
											if (!parallelGateway
													.equals(parallelGatewayToParallelStep)) {
												if (!parallelGateway
														.equals(sequenceFlowToParallelFlow)) {
													if (!sequenceFlow
															.equals(useCase)) {
														if (!sequenceFlow
																.equals(sequenceFlowToParallelFlow)) {
															if (!inFlow
																	.equals(process)) {
																if (!inFlow
																		.equals(parallelGateway)) {
																	if (!inFlow
																			.equals(sequenceFlow)) {
																		if (!inFlow
																				.equals(inFlowToFlow)) {
																			if (!inFlow
																					.equals(useCase)) {
																				if (!inFlow
																						.equals(processToUseCase)) {
																					if (!inFlow
																							.equals(parallelStep)) {
																						if (!inFlow
																								.equals(parallelGatewayToParallelStep)) {
																							if (!inFlow
																									.equals(parallelFlow)) {
																								if (!inFlow
																										.equals(sequenceFlowToParallelFlow)) {
																									if (!flow
																											.equals(process)) {
																										if (!flow
																												.equals(parallelGateway)) {
																											if (!flow
																													.equals(sequenceFlow)) {
																												if (!flow
																														.equals(inFlow)) {
																													if (!flow
																															.equals(inFlowToFlow)) {
																														if (!flow
																																.equals(useCase)) {
																															if (!flow
																																	.equals(processToUseCase)) {
																																if (!flow
																																		.equals(parallelStep)) {
																																	if (!flow
																																			.equals(parallelGatewayToParallelStep)) {
																																		if (!flow
																																				.equals(parallelFlow)) {
																																			if (!flow
																																					.equals(sequenceFlowToParallelFlow)) {
																																				if (!inFlowToFlow
																																						.equals(process)) {
																																					if (!inFlowToFlow
																																							.equals(parallelGateway)) {
																																						if (!inFlowToFlow
																																								.equals(sequenceFlow)) {
																																							if (!inFlowToFlow
																																									.equals(useCase)) {
																																								if (!inFlowToFlow
																																										.equals(processToUseCase)) {
																																									if (!inFlowToFlow
																																											.equals(parallelStep)) {
																																										if (!inFlowToFlow
																																												.equals(parallelGatewayToParallelStep)) {
																																											if (!inFlowToFlow
																																													.equals(parallelFlow)) {
																																												if (!inFlowToFlow
																																														.equals(sequenceFlowToParallelFlow)) {
																																													if (!processToUseCase
																																															.equals(sequenceFlow)) {
																																														if (!processToUseCase
																																																.equals(useCase)) {
																																															if (!processToUseCase
																																																	.equals(sequenceFlowToParallelFlow)) {
																																																if (!parallelStep
																																																		.equals(process)) {
																																																	if (!parallelStep
																																																			.equals(sequenceFlow)) {
																																																		if (!parallelStep
																																																				.equals(useCase)) {
																																																			if (!parallelStep
																																																					.equals(processToUseCase)) {
																																																				if (!parallelStep
																																																						.equals(sequenceFlowToParallelFlow)) {
																																																					if (!parallelGatewayToParallelStep
																																																							.equals(process)) {
																																																						if (!parallelGatewayToParallelStep
																																																								.equals(sequenceFlow)) {
																																																							if (!parallelGatewayToParallelStep
																																																									.equals(useCase)) {
																																																								if (!parallelGatewayToParallelStep
																																																										.equals(processToUseCase)) {
																																																									if (!parallelGatewayToParallelStep
																																																											.equals(parallelStep)) {
																																																										if (!parallelGatewayToParallelStep
																																																												.equals(sequenceFlowToParallelFlow)) {
																																																											if (!parallelFlow
																																																													.equals(process)) {
																																																												if (!parallelFlow
																																																														.equals(parallelGateway)) {
																																																													if (!parallelFlow
																																																															.equals(sequenceFlow)) {
																																																														if (!parallelFlow
																																																																.equals(useCase)) {
																																																															if (!parallelFlow
																																																																	.equals(processToUseCase)) {
																																																																if (!parallelFlow
																																																																		.equals(parallelStep)) {
																																																																	if (!parallelFlow
																																																																			.equals(parallelGatewayToParallelStep)) {
																																																																		if (!parallelFlow
																																																																				.equals(sequenceFlowToParallelFlow)) {
																																																																			if (!sequenceFlowToParallelFlow
																																																																					.equals(useCase)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						process,
																																																																						parallelGateway,
																																																																						sequenceFlow,
																																																																						inFlow,
																																																																						flow,
																																																																						inFlowToFlow,
																																																																						useCase,
																																																																						processToUseCase,
																																																																						parallelStep,
																																																																						parallelGatewayToParallelStep,
																																																																						parallelFlow,
																																																																						sequenceFlowToParallelFlow };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_1_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject process,
			EObject parallelGateway, EObject sequenceFlow, EObject useCase,
			EObject parallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parallelFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__parallelFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToParallelFlow__sequenceFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToParallelFlow__parallelFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SeqFlowAfterPGToParallelFlowRule";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String sequenceFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__sequenceFlow____outgoing_name_prime = "outgoing";
		String useCase__parallelFlow____flows_name_prime = "flows";
		String parallelStep__parallelFlow____invokedFlows_name_prime = "invokedFlows";
		String sequenceFlowToParallelFlow__sequenceFlow____source_name_prime = "source";
		String sequenceFlowToParallelFlow__parallelFlow____target_name_prime = "target";
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		ruleresult.getTranslatedEdges().add(
				process__sequenceFlow____flowElements);
		sequenceFlow__parallelGateway____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		ruleresult.getTranslatedEdges().add(
				sequenceFlow__parallelGateway____sourceRef);
		parallelGateway__sequenceFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__sequenceFlow____outgoing.setTrg(sequenceFlow);
		ruleresult.getTranslatedEdges().add(
				parallelGateway__sequenceFlow____outgoing);
		useCase__parallelFlow____flows.setSrc(useCase);
		useCase__parallelFlow____flows.setTrg(parallelFlow);
		ruleresult.getCreatedEdges().add(useCase__parallelFlow____flows);
		parallelStep__parallelFlow____invokedFlows.setSrc(parallelStep);
		parallelStep__parallelFlow____invokedFlows.setTrg(parallelFlow);
		ruleresult.getCreatedEdges().add(
				parallelStep__parallelFlow____invokedFlows);
		sequenceFlowToParallelFlow__sequenceFlow____source
				.setSrc(sequenceFlowToParallelFlow);
		sequenceFlowToParallelFlow__sequenceFlow____source.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToParallelFlow__sequenceFlow____source);
		sequenceFlowToParallelFlow__parallelFlow____target
				.setSrc(sequenceFlowToParallelFlow);
		sequenceFlowToParallelFlow__parallelFlow____target.setTrg(parallelFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToParallelFlow__parallelFlow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		sequenceFlow__parallelGateway____sourceRef
				.setName(sequenceFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__sequenceFlow____outgoing
				.setName(parallelGateway__sequenceFlow____outgoing_name_prime);
		useCase__parallelFlow____flows
				.setName(useCase__parallelFlow____flows_name_prime);
		parallelStep__parallelFlow____invokedFlows
				.setName(parallelStep__parallelFlow____invokedFlows_name_prime);
		sequenceFlowToParallelFlow__sequenceFlow____source
				.setName(sequenceFlowToParallelFlow__sequenceFlow____source_name_prime);
		sequenceFlowToParallelFlow__parallelFlow____target
				.setName(sequenceFlowToParallelFlow__parallelFlow____target_name_prime);
		return new Object[] { ruleresult, process, parallelGateway,
				sequenceFlow, useCase, parallelStep, parallelFlow,
				sequenceFlowToParallelFlow,
				process__sequenceFlow____flowElements,
				sequenceFlow__parallelGateway____sourceRef,
				parallelGateway__sequenceFlow____outgoing,
				useCase__parallelFlow____flows,
				parallelStep__parallelFlow____invokedFlows,
				sequenceFlowToParallelFlow__sequenceFlow____source,
				sequenceFlowToParallelFlow__parallelFlow____target };
	}

	public static final void pattern_SeqFlowAfterPGToParallelFlowRule_1_5_expressionBBBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			PerformRuleResult ruleresult, EObject process,
			EObject parallelGateway, EObject sequenceFlow, EObject inFlow,
			EObject flow, EObject inFlowToFlow, EObject useCase,
			EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		_this.registerObjects_FWD(ruleresult, process, parallelGateway,
				sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, parallelStep, parallelGatewayToParallelStep,
				parallelFlow, sequenceFlowToParallelFlow);

	}

	public static final PerformRuleResult pattern_SeqFlowAfterPGToParallelFlowRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_1_blackFBB(
			EClass eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_2_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_2_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_2_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_2_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SeqFlowAfterPGToParallelFlowRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("parallelGateway");
		EObject _localVariable_2 = match.getObject("sequenceFlow");
		EObject _localVariable_3 = match.getObject("inFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpParallelGateway = _localVariable_1;
		EObject tmpSequenceFlow = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (tmpSequenceFlow instanceof SequenceFlow) {
					SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						return new Object[] { process, parallelGateway,
								sequenceFlow, inFlow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_2_2_blackBBBBFFFFFFB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(sequenceFlow)) {
			for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(inFlow,
							SequenceFlowToUCFlow.class, "source")) {
				Flow flow = inFlowToFlow.getTarget();
				if (flow != null) {
					for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(process,
									ProcessToUseCase.class, "source")) {
						UseCase useCase = processToUseCase.getTarget();
						if (useCase != null) {
							for (FlowNodeToStep parallelGatewayToParallelStep : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(parallelGateway,
											FlowNodeToStep.class, "source")) {
								Step tmpParallelStep = parallelGatewayToParallelStep
										.getTarget();
								if (tmpParallelStep instanceof ParallelStep) {
									ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
									_result.add(new Object[] { process,
											parallelGateway, sequenceFlow,
											inFlow, flow, inFlowToFlow,
											useCase, processToUseCase,
											parallelStep,
											parallelGatewayToParallelStep,
											match });
								}

							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_2_3_blackBBBBBBBBBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(sequenceFlow)) {
			if (process.getFlowElements().contains(parallelGateway)) {
				if (process.getFlowElements().contains(sequenceFlow)) {
					if (process.getFlowElements().contains(inFlow)) {
						if (parallelGateway.equals(sequenceFlow.getSourceRef())) {
							if (parallelGateway.equals(inFlow.getTargetRef())) {
								if (flow.getSteps().contains(parallelStep)) {
									if (inFlow.equals(inFlowToFlow.getSource())) {
										if (flow.equals(inFlowToFlow
												.getTarget())) {
											if (useCase.getFlows().contains(
													flow)) {
												if (process
														.equals(processToUseCase
																.getSource())) {
													if (useCase
															.equals(processToUseCase
																	.getTarget())) {
														if (parallelGateway
																.equals(parallelGatewayToParallelStep
																		.getSource())) {
															if (parallelStep
																	.equals(parallelGatewayToParallelStep
																			.getTarget())) {
																_result.add(new Object[] {
																		process,
																		parallelGateway,
																		sequenceFlow,
																		inFlow,
																		flow,
																		inFlowToFlow,
																		useCase,
																		processToUseCase,
																		parallelStep,
																		parallelGatewayToParallelStep });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String sequenceFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__sequenceFlow____outgoing_name_prime = "outgoing";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		String flow__parallelStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String parallelGatewayToParallelStep__parallelGateway____source_name_prime = "source";
		String parallelGatewayToParallelStep__parallelStep____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(parallelGateway);
		isApplicableMatch.getAllContextElements().add(sequenceFlow);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				parallelGatewayToParallelStep);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelGateway____flowElements);
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		isApplicableMatch.getAllContextElements().add(
				process__sequenceFlow____flowElements);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		sequenceFlow__parallelGateway____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				sequenceFlow__parallelGateway____sourceRef);
		parallelGateway__sequenceFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__sequenceFlow____outgoing.setTrg(sequenceFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__sequenceFlow____outgoing);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__inFlow____incoming);
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
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		parallelGatewayToParallelStep__parallelGateway____source
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelGateway____source
				.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				parallelGatewayToParallelStep__parallelGateway____source);
		parallelGatewayToParallelStep__parallelStep____target
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelStep____target
				.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				parallelGatewayToParallelStep__parallelStep____target);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		sequenceFlow__parallelGateway____sourceRef
				.setName(sequenceFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__sequenceFlow____outgoing
				.setName(parallelGateway__sequenceFlow____outgoing_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		parallelGatewayToParallelStep__parallelGateway____source
				.setName(parallelGatewayToParallelStep__parallelGateway____source_name_prime);
		parallelGatewayToParallelStep__parallelStep____target
				.setName(parallelGatewayToParallelStep__parallelStep____target_name_prime);
		return new Object[] { process, parallelGateway, sequenceFlow, inFlow,
				flow, inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, isApplicableMatch,
				process__parallelGateway____flowElements,
				process__sequenceFlow____flowElements,
				process__inFlow____flowElements,
				sequenceFlow__parallelGateway____sourceRef,
				parallelGateway__sequenceFlow____outgoing,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming,
				flow__parallelStep____steps, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, useCase__flow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target,
				parallelGatewayToParallelStep__parallelGateway____source,
				parallelGatewayToParallelStep__parallelStep____target };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_4_bindingFBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, parallelGateway, sequenceFlow,
				inFlow, flow, inFlowToFlow, useCase, processToUseCase,
				parallelStep, parallelGatewayToParallelStep);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					parallelGateway, sequenceFlow, inFlow, flow, inFlowToFlow,
					useCase, processToUseCase, parallelStep,
					parallelGatewayToParallelStep };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_4_bindingAndBlackFBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow sequenceFlow,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_2_4_binding = pattern_SeqFlowAfterPGToParallelFlowRule_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, process, parallelGateway,
				sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, parallelStep, parallelGatewayToParallelStep);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_2_4_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_2_4_black = pattern_SeqFlowAfterPGToParallelFlowRule_2_4_blackB(csp);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						parallelGateway, sequenceFlow, inFlow, flow,
						inFlowToFlow, useCase, processToUseCase, parallelStep,
						parallelGatewayToParallelStep };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_2_5_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SeqFlowAfterPGToParallelFlowRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SeqFlowAfterPGToParallelFlowRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_1_blackBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		if (!flow.equals(parallelFlow)) {
			return new Object[] { _this, match, flow, useCase, parallelStep,
					parallelFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_2_bindingFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow,
				useCase, parallelStep, parallelFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, useCase,
					parallelStep, parallelFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_2_bindingAndBlackFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_10_2_binding = pattern_SeqFlowAfterPGToParallelFlowRule_10_2_bindingFBBBBBB(
				_this, match, flow, useCase, parallelStep, parallelFlow);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_10_2_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_10_2_black = pattern_SeqFlowAfterPGToParallelFlowRule_10_2_blackB(csp);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, useCase,
						parallelStep, parallelFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_10_3_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_4_blackBBBBB(
			Match match, Flow flow, UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		if (!flow.equals(parallelFlow)) {
			return new Object[] { match, flow, useCase, parallelStep,
					parallelFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_4_greenBBBBFF(
			Match match, UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		EMoflonEdge useCase__parallelFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__parallelFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parallelFlow);
		String useCase__parallelFlow____flows_name_prime = "flows";
		String parallelStep__parallelFlow____invokedFlows_name_prime = "invokedFlows";
		useCase__parallelFlow____flows.setSrc(useCase);
		useCase__parallelFlow____flows.setTrg(parallelFlow);
		match.getToBeTranslatedEdges().add(useCase__parallelFlow____flows);
		parallelStep__parallelFlow____invokedFlows.setSrc(parallelStep);
		parallelStep__parallelFlow____invokedFlows.setTrg(parallelFlow);
		match.getToBeTranslatedEdges().add(
				parallelStep__parallelFlow____invokedFlows);
		useCase__parallelFlow____flows
				.setName(useCase__parallelFlow____flows_name_prime);
		parallelStep__parallelFlow____invokedFlows
				.setName(parallelStep__parallelFlow____invokedFlows_name_prime);
		return new Object[] { match, useCase, parallelStep, parallelFlow,
				useCase__parallelFlow____flows,
				parallelStep__parallelFlow____invokedFlows };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_5_blackBBBBB(
			Match match, Flow flow, UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		if (!flow.equals(parallelFlow)) {
			return new Object[] { match, flow, useCase, parallelStep,
					parallelFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_10_5_greenBBBBFF(
			Match match, Flow flow, UseCase useCase, ParallelStep parallelStep) {
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(parallelStep);
		String flow__parallelStep____steps_name_prime = "steps";
		String useCase__flow____flows_name_prime = "flows";
		flow__parallelStep____steps.setSrc(flow);
		flow__parallelStep____steps.setTrg(parallelStep);
		match.getContextEdges().add(flow__parallelStep____steps);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, flow, useCase, parallelStep,
				flow__parallelStep____steps, useCase__flow____flows };
	}

	public static final void pattern_SeqFlowAfterPGToParallelFlowRule_10_6_expressionBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		_this.registerObjectsToMatch_BWD(match, flow, useCase, parallelStep,
				parallelFlow);

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("parallelGateway");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("parallelStep");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("parallelGatewayToParallelStep");
		EObject _localVariable_9 = isApplicableMatch.getObject("parallelFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpParallelGateway = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpInFlowToFlow = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpProcessToUseCase = _localVariable_6;
		EObject tmpParallelStep = _localVariable_7;
		EObject tmpParallelGatewayToParallelStep = _localVariable_8;
		EObject tmpParallelFlow = _localVariable_9;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
							SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpProcessToUseCase instanceof ProcessToUseCase) {
									ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
									if (tmpParallelStep instanceof ParallelStep) {
										ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
										if (tmpParallelGatewayToParallelStep instanceof FlowNodeToStep) {
											FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) tmpParallelGatewayToParallelStep;
											if (tmpParallelFlow instanceof ParallelFlow) {
												ParallelFlow parallelFlow = (ParallelFlow) tmpParallelFlow;
												return new Object[] {
														process,
														parallelGateway,
														inFlow,
														flow,
														inFlowToFlow,
														useCase,
														processToUseCase,
														parallelStep,
														parallelGatewayToParallelStep,
														parallelFlow,
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_1_blackBBBBBBBBBBFBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow, SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!flow.equals(parallelFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, parallelGateway, inFlow,
							flow, inFlowToFlow, useCase, processToUseCase,
							parallelStep, parallelGatewayToParallelStep,
							parallelFlow, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_1_bindingAndBlackFFFFFFFFFFFBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_11_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[0];
			ParallelGateway parallelGateway = (ParallelGateway) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[1];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[2];
			Flow flow = (Flow) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[6];
			ParallelStep parallelStep = (ParallelStep) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[7];
			FlowNodeToStep parallelGatewayToParallelStep = (FlowNodeToStep) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[8];
			ParallelFlow parallelFlow = (ParallelFlow) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_binding[9];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_11_1_blackBBBBBBBBBBFBB(
					process, parallelGateway, inFlow, flow, inFlowToFlow,
					useCase, processToUseCase, parallelStep,
					parallelGatewayToParallelStep, parallelFlow, _this,
					isApplicableMatch);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_11_1_black[10];

				return new Object[] { process, parallelGateway, inFlow, flow,
						inFlowToFlow, useCase, processToUseCase, parallelStep,
						parallelGatewayToParallelStep, parallelFlow, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_1_greenBBFBFB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			ParallelFlow parallelFlow, CSP csp) {
		SequenceFlow sequenceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("sequenceFlow", "id");
		process.getFlowElements().add(sequenceFlow);
		sequenceFlow.setSourceRef(parallelGateway);
		sequenceFlowToParallelFlow.setSource(sequenceFlow);
		sequenceFlowToParallelFlow.setTarget(parallelFlow);
		String sequenceFlow_id_prime = (String) _localVariable_0;
		sequenceFlow.setId(sequenceFlow_id_prime);
		return new Object[] { process, parallelGateway, sequenceFlow,
				parallelFlow, sequenceFlowToParallelFlow, csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_2_blackBBB(
			SequenceFlow sequenceFlow, ParallelFlow parallelFlow,
			SequenceFlowToUCFlow sequenceFlowToParallelFlow) {
		return new Object[] { sequenceFlow, parallelFlow,
				sequenceFlowToParallelFlow };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_2_greenFBBB(
			SequenceFlow sequenceFlow, ParallelFlow parallelFlow,
			SequenceFlowToUCFlow sequenceFlowToParallelFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sequenceFlow);
		ruleresult.getTranslatedElements().add(parallelFlow);
		ruleresult.getCreatedLinkElements().add(sequenceFlowToParallelFlow);
		return new Object[] { ruleresult, sequenceFlow, parallelFlow,
				sequenceFlowToParallelFlow };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process,
			EObject parallelGateway, EObject sequenceFlow, EObject inFlow,
			EObject flow, EObject inFlowToFlow, EObject useCase,
			EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		if (!process.equals(sequenceFlow)) {
			if (!process.equals(useCase)) {
				if (!process.equals(processToUseCase)) {
					if (!process.equals(sequenceFlowToParallelFlow)) {
						if (!parallelGateway.equals(process)) {
							if (!parallelGateway.equals(sequenceFlow)) {
								if (!parallelGateway.equals(useCase)) {
									if (!parallelGateway
											.equals(processToUseCase)) {
										if (!parallelGateway
												.equals(parallelStep)) {
											if (!parallelGateway
													.equals(parallelGatewayToParallelStep)) {
												if (!parallelGateway
														.equals(sequenceFlowToParallelFlow)) {
													if (!sequenceFlow
															.equals(useCase)) {
														if (!sequenceFlow
																.equals(sequenceFlowToParallelFlow)) {
															if (!inFlow
																	.equals(process)) {
																if (!inFlow
																		.equals(parallelGateway)) {
																	if (!inFlow
																			.equals(sequenceFlow)) {
																		if (!inFlow
																				.equals(inFlowToFlow)) {
																			if (!inFlow
																					.equals(useCase)) {
																				if (!inFlow
																						.equals(processToUseCase)) {
																					if (!inFlow
																							.equals(parallelStep)) {
																						if (!inFlow
																								.equals(parallelGatewayToParallelStep)) {
																							if (!inFlow
																									.equals(parallelFlow)) {
																								if (!inFlow
																										.equals(sequenceFlowToParallelFlow)) {
																									if (!flow
																											.equals(process)) {
																										if (!flow
																												.equals(parallelGateway)) {
																											if (!flow
																													.equals(sequenceFlow)) {
																												if (!flow
																														.equals(inFlow)) {
																													if (!flow
																															.equals(inFlowToFlow)) {
																														if (!flow
																																.equals(useCase)) {
																															if (!flow
																																	.equals(processToUseCase)) {
																																if (!flow
																																		.equals(parallelStep)) {
																																	if (!flow
																																			.equals(parallelGatewayToParallelStep)) {
																																		if (!flow
																																				.equals(parallelFlow)) {
																																			if (!flow
																																					.equals(sequenceFlowToParallelFlow)) {
																																				if (!inFlowToFlow
																																						.equals(process)) {
																																					if (!inFlowToFlow
																																							.equals(parallelGateway)) {
																																						if (!inFlowToFlow
																																								.equals(sequenceFlow)) {
																																							if (!inFlowToFlow
																																									.equals(useCase)) {
																																								if (!inFlowToFlow
																																										.equals(processToUseCase)) {
																																									if (!inFlowToFlow
																																											.equals(parallelStep)) {
																																										if (!inFlowToFlow
																																												.equals(parallelGatewayToParallelStep)) {
																																											if (!inFlowToFlow
																																													.equals(parallelFlow)) {
																																												if (!inFlowToFlow
																																														.equals(sequenceFlowToParallelFlow)) {
																																													if (!processToUseCase
																																															.equals(sequenceFlow)) {
																																														if (!processToUseCase
																																																.equals(useCase)) {
																																															if (!processToUseCase
																																																	.equals(sequenceFlowToParallelFlow)) {
																																																if (!parallelStep
																																																		.equals(process)) {
																																																	if (!parallelStep
																																																			.equals(sequenceFlow)) {
																																																		if (!parallelStep
																																																				.equals(useCase)) {
																																																			if (!parallelStep
																																																					.equals(processToUseCase)) {
																																																				if (!parallelStep
																																																						.equals(sequenceFlowToParallelFlow)) {
																																																					if (!parallelGatewayToParallelStep
																																																							.equals(process)) {
																																																						if (!parallelGatewayToParallelStep
																																																								.equals(sequenceFlow)) {
																																																							if (!parallelGatewayToParallelStep
																																																									.equals(useCase)) {
																																																								if (!parallelGatewayToParallelStep
																																																										.equals(processToUseCase)) {
																																																									if (!parallelGatewayToParallelStep
																																																											.equals(parallelStep)) {
																																																										if (!parallelGatewayToParallelStep
																																																												.equals(sequenceFlowToParallelFlow)) {
																																																											if (!parallelFlow
																																																													.equals(process)) {
																																																												if (!parallelFlow
																																																														.equals(parallelGateway)) {
																																																													if (!parallelFlow
																																																															.equals(sequenceFlow)) {
																																																														if (!parallelFlow
																																																																.equals(useCase)) {
																																																															if (!parallelFlow
																																																																	.equals(processToUseCase)) {
																																																																if (!parallelFlow
																																																																		.equals(parallelStep)) {
																																																																	if (!parallelFlow
																																																																			.equals(parallelGatewayToParallelStep)) {
																																																																		if (!parallelFlow
																																																																				.equals(sequenceFlowToParallelFlow)) {
																																																																			if (!sequenceFlowToParallelFlow
																																																																					.equals(useCase)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						process,
																																																																						parallelGateway,
																																																																						sequenceFlow,
																																																																						inFlow,
																																																																						flow,
																																																																						inFlowToFlow,
																																																																						useCase,
																																																																						processToUseCase,
																																																																						parallelStep,
																																																																						parallelGatewayToParallelStep,
																																																																						parallelFlow,
																																																																						sequenceFlowToParallelFlow };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_11_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject process,
			EObject parallelGateway, EObject sequenceFlow, EObject useCase,
			EObject parallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parallelFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__parallelFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToParallelFlow__sequenceFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToParallelFlow__parallelFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SeqFlowAfterPGToParallelFlowRule";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String sequenceFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__sequenceFlow____outgoing_name_prime = "outgoing";
		String useCase__parallelFlow____flows_name_prime = "flows";
		String parallelStep__parallelFlow____invokedFlows_name_prime = "invokedFlows";
		String sequenceFlowToParallelFlow__sequenceFlow____source_name_prime = "source";
		String sequenceFlowToParallelFlow__parallelFlow____target_name_prime = "target";
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(process__sequenceFlow____flowElements);
		sequenceFlow__parallelGateway____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		ruleresult.getCreatedEdges().add(
				sequenceFlow__parallelGateway____sourceRef);
		parallelGateway__sequenceFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__sequenceFlow____outgoing.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(
				parallelGateway__sequenceFlow____outgoing);
		useCase__parallelFlow____flows.setSrc(useCase);
		useCase__parallelFlow____flows.setTrg(parallelFlow);
		ruleresult.getTranslatedEdges().add(useCase__parallelFlow____flows);
		parallelStep__parallelFlow____invokedFlows.setSrc(parallelStep);
		parallelStep__parallelFlow____invokedFlows.setTrg(parallelFlow);
		ruleresult.getTranslatedEdges().add(
				parallelStep__parallelFlow____invokedFlows);
		sequenceFlowToParallelFlow__sequenceFlow____source
				.setSrc(sequenceFlowToParallelFlow);
		sequenceFlowToParallelFlow__sequenceFlow____source.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToParallelFlow__sequenceFlow____source);
		sequenceFlowToParallelFlow__parallelFlow____target
				.setSrc(sequenceFlowToParallelFlow);
		sequenceFlowToParallelFlow__parallelFlow____target.setTrg(parallelFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToParallelFlow__parallelFlow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		sequenceFlow__parallelGateway____sourceRef
				.setName(sequenceFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__sequenceFlow____outgoing
				.setName(parallelGateway__sequenceFlow____outgoing_name_prime);
		useCase__parallelFlow____flows
				.setName(useCase__parallelFlow____flows_name_prime);
		parallelStep__parallelFlow____invokedFlows
				.setName(parallelStep__parallelFlow____invokedFlows_name_prime);
		sequenceFlowToParallelFlow__sequenceFlow____source
				.setName(sequenceFlowToParallelFlow__sequenceFlow____source_name_prime);
		sequenceFlowToParallelFlow__parallelFlow____target
				.setName(sequenceFlowToParallelFlow__parallelFlow____target_name_prime);
		return new Object[] { ruleresult, process, parallelGateway,
				sequenceFlow, useCase, parallelStep, parallelFlow,
				sequenceFlowToParallelFlow,
				process__sequenceFlow____flowElements,
				sequenceFlow__parallelGateway____sourceRef,
				parallelGateway__sequenceFlow____outgoing,
				useCase__parallelFlow____flows,
				parallelStep__parallelFlow____invokedFlows,
				sequenceFlowToParallelFlow__sequenceFlow____source,
				sequenceFlowToParallelFlow__parallelFlow____target };
	}

	public static final void pattern_SeqFlowAfterPGToParallelFlowRule_11_5_expressionBBBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			PerformRuleResult ruleresult, EObject process,
			EObject parallelGateway, EObject sequenceFlow, EObject inFlow,
			EObject flow, EObject inFlowToFlow, EObject useCase,
			EObject processToUseCase, EObject parallelStep,
			EObject parallelGatewayToParallelStep, EObject parallelFlow,
			EObject sequenceFlowToParallelFlow) {
		_this.registerObjects_BWD(ruleresult, process, parallelGateway,
				sequenceFlow, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, parallelStep, parallelGatewayToParallelStep,
				parallelFlow, sequenceFlowToParallelFlow);

	}

	public static final PerformRuleResult pattern_SeqFlowAfterPGToParallelFlowRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_1_blackFBB(
			EClass eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_12_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_12_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_12_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_12_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SeqFlowAfterPGToParallelFlowRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("flow");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("parallelStep");
		EObject _localVariable_3 = match.getObject("parallelFlow");
		EObject tmpFlow = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpParallelStep = _localVariable_2;
		EObject tmpParallelFlow = _localVariable_3;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpParallelStep instanceof ParallelStep) {
					ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
					if (tmpParallelFlow instanceof ParallelFlow) {
						ParallelFlow parallelFlow = (ParallelFlow) tmpParallelFlow;
						return new Object[] { flow, useCase, parallelStep,
								parallelFlow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_12_2_blackFFFBFBFBFBB(
			Flow flow, UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(parallelFlow)) {
			for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(flow,
							SequenceFlowToUCFlow.class, "target")) {
				SequenceFlow inFlow = inFlowToFlow.getSource();
				if (inFlow != null) {
					for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(useCase,
									ProcessToUseCase.class, "target")) {
						bpmn2.Process process = processToUseCase.getSource();
						if (process != null) {
							for (FlowNodeToStep parallelGatewayToParallelStep : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(parallelStep,
											FlowNodeToStep.class, "target")) {
								FlowNode tmpParallelGateway = parallelGatewayToParallelStep
										.getSource();
								if (tmpParallelGateway instanceof ParallelGateway) {
									ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
									_result.add(new Object[] { process,
											parallelGateway, inFlow, flow,
											inFlowToFlow, useCase,
											processToUseCase, parallelStep,
											parallelGatewayToParallelStep,
											parallelFlow, match });
								}

							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_12_3_blackBBBBBBBBBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(parallelFlow)) {
			if (process.getFlowElements().contains(parallelGateway)) {
				if (process.getFlowElements().contains(inFlow)) {
					if (parallelGateway.equals(inFlow.getTargetRef())) {
						if (flow.getSteps().contains(parallelStep)) {
							if (inFlow.equals(inFlowToFlow.getSource())) {
								if (flow.equals(inFlowToFlow.getTarget())) {
									if (useCase.getFlows().contains(flow)) {
										if (useCase.getFlows().contains(
												parallelFlow)) {
											if (process.equals(processToUseCase
													.getSource())) {
												if (useCase
														.equals(processToUseCase
																.getTarget())) {
													if (parallelStep
															.getInvokedFlows()
															.contains(
																	parallelFlow)) {
														if (parallelGateway
																.equals(parallelGatewayToParallelStep
																		.getSource())) {
															if (parallelStep
																	.equals(parallelGatewayToParallelStep
																			.getTarget())) {
																_result.add(new Object[] {
																		process,
																		parallelGateway,
																		inFlow,
																		flow,
																		inFlowToFlow,
																		useCase,
																		processToUseCase,
																		parallelStep,
																		parallelGatewayToParallelStep,
																		parallelFlow });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parallelFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__parallelFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGatewayToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelGateway____targetRef_name_prime = "targetRef";
		String parallelGateway__inFlow____incoming_name_prime = "incoming";
		String flow__parallelStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__parallelFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String parallelStep__parallelFlow____invokedFlows_name_prime = "invokedFlows";
		String parallelGatewayToParallelStep__parallelGateway____source_name_prime = "source";
		String parallelGatewayToParallelStep__parallelStep____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(parallelGateway);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				parallelGatewayToParallelStep);
		isApplicableMatch.getAllContextElements().add(parallelFlow);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelGateway____flowElements);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		inFlow__parallelGateway____targetRef.setSrc(inFlow);
		inFlow__parallelGateway____targetRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__parallelGateway____targetRef);
		parallelGateway__inFlow____incoming.setSrc(parallelGateway);
		parallelGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__inFlow____incoming);
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
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__parallelFlow____flows.setSrc(useCase);
		useCase__parallelFlow____flows.setTrg(parallelFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__parallelFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		parallelStep__parallelFlow____invokedFlows.setSrc(parallelStep);
		parallelStep__parallelFlow____invokedFlows.setTrg(parallelFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelStep__parallelFlow____invokedFlows);
		parallelGatewayToParallelStep__parallelGateway____source
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelGateway____source
				.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				parallelGatewayToParallelStep__parallelGateway____source);
		parallelGatewayToParallelStep__parallelStep____target
				.setSrc(parallelGatewayToParallelStep);
		parallelGatewayToParallelStep__parallelStep____target
				.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				parallelGatewayToParallelStep__parallelStep____target);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		inFlow__parallelGateway____targetRef
				.setName(inFlow__parallelGateway____targetRef_name_prime);
		parallelGateway__inFlow____incoming
				.setName(parallelGateway__inFlow____incoming_name_prime);
		flow__parallelStep____steps
				.setName(flow__parallelStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__parallelFlow____flows
				.setName(useCase__parallelFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		parallelStep__parallelFlow____invokedFlows
				.setName(parallelStep__parallelFlow____invokedFlows_name_prime);
		parallelGatewayToParallelStep__parallelGateway____source
				.setName(parallelGatewayToParallelStep__parallelGateway____source_name_prime);
		parallelGatewayToParallelStep__parallelStep____target
				.setName(parallelGatewayToParallelStep__parallelStep____target_name_prime);
		return new Object[] { process, parallelGateway, inFlow, flow,
				inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, parallelFlow, isApplicableMatch,
				process__parallelGateway____flowElements,
				process__inFlow____flowElements,
				inFlow__parallelGateway____targetRef,
				parallelGateway__inFlow____incoming,
				flow__parallelStep____steps, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, useCase__flow____flows,
				useCase__parallelFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target,
				parallelStep__parallelFlow____invokedFlows,
				parallelGatewayToParallelStep__parallelGateway____source,
				parallelGatewayToParallelStep__parallelStep____target };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_4_bindingFBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, process, parallelGateway, inFlow, flow,
				inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, parallelFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					parallelGateway, inFlow, flow, inFlowToFlow, useCase,
					processToUseCase, parallelStep,
					parallelGatewayToParallelStep, parallelFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_4_bindingAndBlackFBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ParallelFlow parallelFlow) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_12_4_binding = pattern_SeqFlowAfterPGToParallelFlowRule_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, process, parallelGateway, inFlow,
				flow, inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, parallelFlow);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_12_4_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_12_4_black = pattern_SeqFlowAfterPGToParallelFlowRule_12_4_blackB(csp);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						parallelGateway, inFlow, flow, inFlowToFlow, useCase,
						processToUseCase, parallelStep,
						parallelGatewayToParallelStep, parallelFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_12_5_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SeqFlowAfterPGToParallelFlowRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SeqFlowAfterPGToParallelFlowRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_1_blackFBB(
			EClass __eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_20_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_20_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_20_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_20_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_203163 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_20_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpSequenceFlow = _edge_flowElements.getTrg();
			if (tmpSequenceFlow instanceof SequenceFlow) {
				SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
				if (process.getFlowElements().contains(sequenceFlow)) {
					FlowNode tmpParallelGateway = sequenceFlow.getSourceRef();
					if (tmpParallelGateway instanceof ParallelGateway) {
						ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
						if (process.getFlowElements().contains(parallelGateway)) {
							if (pattern_SeqFlowAfterPGToParallelFlowRule_20_2_black_nac_0B(sequenceFlow) == null) {
								for (FlowElement tmpInFlow : process
										.getFlowElements()) {
									if (tmpInFlow instanceof SequenceFlow) {
										SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
										if (!inFlow.equals(sequenceFlow)) {
											if (parallelGateway.equals(inFlow
													.getTargetRef())) {
												_result.add(new Object[] {
														process,
														parallelGateway,
														sequenceFlow, inFlow,
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

		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_20_3_expressionFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				parallelGateway, sequenceFlow, inFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_20_4_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterPGToParallelFlowRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_1_blackFBB(
			EClass __eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_21_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_21_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_21_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_21_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_224244 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_21_2_blackFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSequenceFlow = _edge_sourceRef.getSrc();
		if (tmpSequenceFlow instanceof SequenceFlow) {
			SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
			EObject tmpParallelGateway = _edge_sourceRef.getTrg();
			if (tmpParallelGateway instanceof ParallelGateway) {
				ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
				if (parallelGateway.equals(sequenceFlow.getSourceRef())) {
					if (pattern_SeqFlowAfterPGToParallelFlowRule_21_2_black_nac_0B(sequenceFlow) == null) {
						for (SequenceFlow inFlow : parallelGateway
								.getIncoming()) {
							if (!inFlow.equals(sequenceFlow)) {
								for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												sequenceFlow,
												FlowElementsContainer.class,
												"flowElements")) {
									if (tmpProcess instanceof bpmn2.Process) {
										bpmn2.Process process = (bpmn2.Process) tmpProcess;
										if (process.getFlowElements().contains(
												parallelGateway)) {
											if (process.getFlowElements()
													.contains(inFlow)) {
												_result.add(new Object[] {
														process,
														parallelGateway,
														sequenceFlow, inFlow,
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

		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_21_3_expressionFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				parallelGateway, sequenceFlow, inFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_21_4_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterPGToParallelFlowRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_1_blackFBB(
			EClass __eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_22_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_22_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_22_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_22_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_772574 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_22_2_blackFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelGateway = _edge_outgoing.getSrc();
		if (tmpParallelGateway instanceof ParallelGateway) {
			ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
			EObject tmpSequenceFlow = _edge_outgoing.getTrg();
			if (tmpSequenceFlow instanceof SequenceFlow) {
				SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
				if (parallelGateway.equals(sequenceFlow.getSourceRef())) {
					if (pattern_SeqFlowAfterPGToParallelFlowRule_22_2_black_nac_0B(sequenceFlow) == null) {
						for (SequenceFlow inFlow : parallelGateway
								.getIncoming()) {
							if (!inFlow.equals(sequenceFlow)) {
								for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												parallelGateway,
												FlowElementsContainer.class,
												"flowElements")) {
									if (tmpProcess instanceof bpmn2.Process) {
										bpmn2.Process process = (bpmn2.Process) tmpProcess;
										if (process.getFlowElements().contains(
												sequenceFlow)) {
											if (process.getFlowElements()
													.contains(inFlow)) {
												_result.add(new Object[] {
														process,
														parallelGateway,
														sequenceFlow, inFlow,
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

		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_22_3_expressionFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match,
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow sequenceFlow, SequenceFlow inFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				parallelGateway, sequenceFlow, inFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_22_4_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterPGToParallelFlowRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_1_blackFBB(
			EClass __eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_23_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_23_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_23_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_23_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_2_black_nac_0BB(
			ParallelFlow parallelFlow, ParallelStep parallelStep) {
		for (ParallelStep __DEC_parallelFlow_invokedFlows_304448 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(parallelFlow, ParallelStep.class,
						"invokedFlows")) {
			if (!parallelStep.equals(__DEC_parallelFlow_invokedFlows_304448)) {
				return new Object[] { parallelFlow, parallelStep };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_23_2_blackFFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpParallelFlow = _edge_flows.getTrg();
			if (tmpParallelFlow instanceof ParallelFlow) {
				ParallelFlow parallelFlow = (ParallelFlow) tmpParallelFlow;
				if (useCase.getFlows().contains(parallelFlow)) {
					for (Flow flow : useCase.getFlows()) {
						if (!flow.equals(parallelFlow)) {
							for (Step tmpParallelStep : flow.getSteps()) {
								if (tmpParallelStep instanceof ParallelStep) {
									ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
									if (parallelStep.getInvokedFlows()
											.contains(parallelFlow)) {
										if (pattern_SeqFlowAfterPGToParallelFlowRule_23_2_black_nac_0BB(
												parallelFlow, parallelStep) == null) {
											_result.add(new Object[] { flow,
													useCase, parallelStep,
													parallelFlow, _edge_flows });
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_23_3_expressionFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow,
				useCase, parallelStep, parallelFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_23_4_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterPGToParallelFlowRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_1_bindingFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_1_blackFBB(
			EClass __eClass, SeqFlowAfterPGToParallelFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_1_bindingAndBlackFFB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_24_1_binding = pattern_SeqFlowAfterPGToParallelFlowRule_24_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterPGToParallelFlowRule_24_1_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_24_1_black = pattern_SeqFlowAfterPGToParallelFlowRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterPGToParallelFlowRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_2_black_nac_0BB(
			ParallelFlow parallelFlow, ParallelStep parallelStep) {
		for (ParallelStep __DEC_parallelFlow_invokedFlows_549189 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(parallelFlow, ParallelStep.class,
						"invokedFlows")) {
			if (!parallelStep.equals(__DEC_parallelFlow_invokedFlows_549189)) {
				return new Object[] { parallelFlow, parallelStep };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_24_2_blackFFFFB(
			EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelStep = _edge_invokedFlows.getSrc();
		if (tmpParallelStep instanceof ParallelStep) {
			ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
			EObject tmpParallelFlow = _edge_invokedFlows.getTrg();
			if (tmpParallelFlow instanceof ParallelFlow) {
				ParallelFlow parallelFlow = (ParallelFlow) tmpParallelFlow;
				if (parallelStep.getInvokedFlows().contains(parallelFlow)) {
					if (pattern_SeqFlowAfterPGToParallelFlowRule_24_2_black_nac_0BB(
							parallelFlow, parallelStep) == null) {
						for (Flow flow : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(parallelStep,
										Flow.class, "steps")) {
							if (!flow.equals(parallelFlow)) {
								for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												parallelFlow, UseCase.class,
												"flows")) {
									if (useCase.getFlows().contains(flow)) {
										_result.add(new Object[] { flow,
												useCase, parallelStep,
												parallelFlow,
												_edge_invokedFlows });
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

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_24_3_expressionFBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match, Flow flow,
			UseCase useCase, ParallelStep parallelStep,
			ParallelFlow parallelFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow,
				useCase, parallelStep, parallelFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_24_4_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterPGToParallelFlowRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_1_blackB(
			SeqFlowAfterPGToParallelFlowRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ParallelGateway parallelGateway) {
		if (ruleResult.getSourceObjects().contains(parallelGateway)) {
			return new Object[] { ruleResult, parallelGateway };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ParallelStep parallelStep) {
		if (ruleResult.getTargetObjects().contains(parallelStep)) {
			return new Object[] { ruleResult, parallelStep };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult,
			FlowNodeToStep parallelGatewayToParallelStep) {
		if (ruleResult.getCorrObjects().contains(parallelGatewayToParallelStep)) {
			return new Object[] { ruleResult, parallelGatewayToParallelStep };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterPGToParallelFlowRule_27_2_blackFFFFFFFFFFBB(
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
							FlowNode tmpParallelGateway = inFlow.getTargetRef();
							if (tmpParallelGateway instanceof ParallelGateway) {
								ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
								if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_3BB(
										ruleResult, inFlowToFlow) == null) {
									if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_2BB(
											ruleResult, inFlow) == null) {
										if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_4BB(
												ruleResult, flow) == null) {
											if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_1BB(
													ruleResult, parallelGateway) == null) {
												for (Step tmpParallelStep : flow
														.getSteps()) {
													if (tmpParallelStep instanceof ParallelStep) {
														ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
														if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_5BB(
																ruleResult,
																parallelStep) == null) {
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
																					parallelGateway)) {
																		if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_0BB(
																				ruleResult,
																				process) == null) {
																			for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							flow,
																							UseCase.class,
																							"flows")) {
																				if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_7BB(
																						ruleResult,
																						useCase) == null) {
																					for (FlowNodeToStep parallelGatewayToParallelStep : org.moflon.util.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									parallelGateway,
																									FlowNodeToStep.class,
																									"source")) {
																						if (parallelStep
																								.equals(parallelGatewayToParallelStep
																										.getTarget())) {
																							if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_6BB(
																									ruleResult,
																									parallelGatewayToParallelStep) == null) {
																								for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												process,
																												ProcessToUseCase.class,
																												"source")) {
																									if (useCase
																											.equals(processToUseCase
																													.getTarget())) {
																										if (pattern_SeqFlowAfterPGToParallelFlowRule_27_2_black_nac_8BB(
																												ruleResult,
																												processToUseCase) == null) {
																											_result.add(new Object[] {
																													inFlowToFlowList,
																													process,
																													parallelGateway,
																													inFlow,
																													inFlowToFlow,
																													flow,
																													parallelStep,
																													parallelGatewayToParallelStep,
																													useCase,
																													processToUseCase,
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
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_3_bindingFBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, parallelGateway, inFlow, flow,
				inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					parallelGateway, inFlow, flow, inFlowToFlow, useCase,
					processToUseCase, parallelStep,
					parallelGatewayToParallelStep, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_3_bindingAndBlackFBBBBBBBBBBBB(
			SeqFlowAfterPGToParallelFlowRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			ParallelGateway parallelGateway, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_27_3_binding = pattern_SeqFlowAfterPGToParallelFlowRule_27_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, process, parallelGateway, inFlow,
				flow, inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, ruleResult);
		if (result_pattern_SeqFlowAfterPGToParallelFlowRule_27_3_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterPGToParallelFlowRule_27_3_binding[0];

			Object[] result_pattern_SeqFlowAfterPGToParallelFlowRule_27_3_black = pattern_SeqFlowAfterPGToParallelFlowRule_27_3_blackB(csp);
			if (result_pattern_SeqFlowAfterPGToParallelFlowRule_27_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						parallelGateway, inFlow, flow, inFlowToFlow, useCase,
						processToUseCase, parallelStep,
						parallelGatewayToParallelStep, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterPGToParallelFlowRule_27_4_expressionFBB(
			SeqFlowAfterPGToParallelFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_5_blackBBBBBBBBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep) {
		return new Object[] { process, parallelGateway, inFlow, flow,
				inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_6_blackBBBBBBBBBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			SequenceFlow inFlow, Flow flow, SequenceFlowToUCFlow inFlowToFlow,
			UseCase useCase, ProcessToUseCase processToUseCase,
			ParallelStep parallelStep,
			FlowNodeToStep parallelGatewayToParallelStep,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, parallelGateway, inFlow, flow,
				inFlowToFlow, useCase, processToUseCase, parallelStep,
				parallelGatewayToParallelStep, ruleResult };
	}

	public static final Object[] pattern_SeqFlowAfterPGToParallelFlowRule_27_6_greenBBFBBFFBB(
			bpmn2.Process process, ParallelGateway parallelGateway,
			UseCase useCase, ParallelStep parallelStep,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		SequenceFlow sequenceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		ParallelFlow parallelFlow = UseCaseDSLFactory.eINSTANCE
				.createParallelFlow();
		SequenceFlowToUCFlow sequenceFlowToParallelFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("sequenceFlow", "id");
		Object _localVariable_1 = csp.getValue("parallelFlow", "name");
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		process.getFlowElements().add(sequenceFlow);
		sequenceFlow.setSourceRef(parallelGateway);
		ruleResult.getSourceObjects().add(sequenceFlow);
		useCase.getFlows().add(parallelFlow);
		parallelStep.getInvokedFlows().add(parallelFlow);
		ruleResult.getTargetObjects().add(parallelFlow);
		sequenceFlowToParallelFlow.setSource(sequenceFlow);
		sequenceFlowToParallelFlow.setTarget(parallelFlow);
		ruleResult.getCorrObjects().add(sequenceFlowToParallelFlow);
		String sequenceFlow_id_prime = (String) _localVariable_0;
		String parallelFlow_name_prime = (String) _localVariable_1;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		sequenceFlow.setId(sequenceFlow_id_prime);
		parallelFlow.setName(parallelFlow_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, parallelGateway, sequenceFlow, useCase,
				parallelStep, parallelFlow, sequenceFlowToParallelFlow,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SeqFlowAfterPGToParallelFlowRule_27_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SeqFlowAfterPGToParallelFlowRuleImpl
