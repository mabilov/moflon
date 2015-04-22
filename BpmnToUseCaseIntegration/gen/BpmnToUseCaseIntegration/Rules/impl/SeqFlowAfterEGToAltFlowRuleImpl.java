/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
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

import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
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
 * An implementation of the model object '<em><b>Seq Flow After EG To Alt Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeqFlowAfterEGToAltFlowRuleImpl extends AbstractRuleImpl implements
		SeqFlowAfterEGToAltFlowRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqFlowAfterEGToAltFlowRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSeqFlowAfterEGToAltFlowRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		// initial bindings
		Object[] result1_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_0_1_blackBBBBBB(this,
						match, defaultFlow, exclusiveGateway, process, outFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_0_2_bindingAndBlackFBBBBBB(
						this, match, defaultFlow, exclusiveGateway, process,
						outFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_4_blackBBBBB(match,
							defaultFlow, exclusiveGateway, process, outFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_4_greenBBBBFFF(
							match, exclusiveGateway, process, outFlow);
			// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result4_green[4];
			// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result4_green[5];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_5_blackBBBBB(match,
							defaultFlow, exclusiveGateway, process, outFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_5_greenBBBBFFFFF(
							match, defaultFlow, exclusiveGateway, process);
			// EMoflonEdge exclusiveGateway__defaultFlow____default = (EMoflonEdge) result5_green[4];
			// EMoflonEdge defaultFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result5_green[5];
			// EMoflonEdge exclusiveGateway__defaultFlow____outgoing = (EMoflonEdge) result5_green[6];
			// EMoflonEdge process__defaultFlow____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result5_green[8];

			// register objects to match
			SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_6_expressionBBBBBB(
							this, match, defaultFlow, exclusiveGateway,
							process, outFlow);
			return SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_7_expressionF();
		} else {
			return SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_1_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCase useCase = (UseCase) result1_bindingAndBlack[0];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[1];
		SequenceFlow defaultFlow = (SequenceFlow) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[4];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[5];
		FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result1_bindingAndBlack[6];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_bindingAndBlack[7];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[8];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_1_greenBBFFFFBB(useCase,
						normalStep, outFlow, csp);
		AlternativeFlow alternativeFlow = (AlternativeFlow) result1_green[2];
		SequenceFlowToUCFlow outFlowToAlternativeFlow = (SequenceFlowToUCFlow) result1_green[3];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_green[4];
		SeqFlowToAltFlowAlt outFlowToAlt = (SeqFlowToAltFlowAlt) result1_green[5];

		// collect translated elements
		Object[] result2_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_2_blackBBBBB(
						alternativeFlow, outFlowToAlternativeFlow, alt,
						outFlowToAlt, outFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_2_greenFBBBBB(
						alternativeFlow, outFlowToAlternativeFlow, alt,
						outFlowToAlt, outFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_3_blackBBBBBBBBBBBBBBB(
						ruleresult, useCase, processToUseCase, defaultFlow,
						flow, defaultFlowToFlow, normalStep,
						exclusiveGatewayToNormalStep, alternativeFlow,
						outFlowToAlternativeFlow, alt, outFlowToAlt,
						exclusiveGateway, process, outFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_3_greenBBBBBBBBBBFFFFFFFFFF(
						ruleresult, useCase, normalStep, alternativeFlow,
						outFlowToAlternativeFlow, alt, outFlowToAlt,
						exclusiveGateway, process, outFlow);
		// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result3_green[10];
		// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[11];
		// EMoflonEdge outFlowToAlternativeFlow__outFlow____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge outFlowToAlternativeFlow__alternativeFlow____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlowToAlt__outFlow____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge outFlowToAlt__alt____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_5_expressionBBBBBBBBBBBBBBBB(
						this, ruleresult, useCase, processToUseCase,
						defaultFlow, flow, defaultFlowToFlow, normalStep,
						exclusiveGatewayToNormalStep, alternativeFlow,
						outFlowToAlternativeFlow, alt, outFlowToAlt,
						exclusiveGateway, process, outFlow);
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		SequenceFlow defaultFlow = (SequenceFlow) result2_binding[0];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_binding[1];
		bpmn2.Process process = (bpmn2.Process) result2_binding[2];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[3];
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_2_2_blackFFBFFFFBBBB(
						defaultFlow, exclusiveGateway, process, outFlow, match)) {
			UseCase useCase = (UseCase) result2_black[0];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[1];
			Flow flow = (Flow) result2_black[3];
			SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			NormalStep normalStep = (NormalStep) result2_black[5];
			FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_2_3_blackBBBBBBBBBB(
							useCase, processToUseCase, defaultFlow, flow,
							defaultFlowToFlow, normalStep,
							exclusiveGatewayToNormalStep, exclusiveGateway,
							process, outFlow)) {
				Object[] result3_green = SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								useCase, processToUseCase, defaultFlow, flow,
								defaultFlowToFlow, normalStep,
								exclusiveGatewayToNormalStep, exclusiveGateway,
								process, outFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge defaultFlowToFlow__defaultFlow____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge defaultFlowToFlow__flow____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge exclusiveGateway__defaultFlow____default = (EMoflonEdge) result3_green[19];
				// EMoflonEdge defaultFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge exclusiveGateway__defaultFlow____outgoing = (EMoflonEdge) result3_green[21];
				// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__defaultFlow____flowElements = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_2_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, useCase,
								processToUseCase, defaultFlow, flow,
								defaultFlowToFlow, normalStep,
								exclusiveGatewayToNormalStep, exclusiveGateway,
								process, outFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		match.registerObject("defaultFlow", defaultFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("process", process);
		match.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {// Create CSP
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
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_outFlow_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.id", true, csp);
		var_outFlow_id.setValue(outFlow.getId());
		var_outFlow_id.setType("String");
		Variable var_outFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.name", true, csp);
		var_outFlow_name.setValue(outFlow.getName());
		var_outFlow_name.setType("String");

		// Create unbound variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		var_alternativeFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_outFlow_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_outFlow_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("outFlow", outFlow);
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
			EObject useCase, EObject processToUseCase, EObject defaultFlow,
			EObject flow, EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("outFlowToAlternativeFlow",
				outFlowToAlternativeFlow);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("outFlow").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, Flow flow,
			NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		// initial bindings
		Object[] result1_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_10_1_blackBBBBBBB(this,
						match, useCase, flow, normalStep, alternativeFlow, alt);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_10_2_bindingAndBlackFBBBBBBB(
						this, match, useCase, flow, normalStep,
						alternativeFlow, alt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_4_blackBBBBBB(
							match, useCase, flow, normalStep, alternativeFlow,
							alt);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_4_greenBBBBBFFF(
							match, useCase, normalStep, alternativeFlow, alt);
			// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result4_green[5];
			// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result4_green[6];
			// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_5_blackBBBBBB(
							match, useCase, flow, normalStep, alternativeFlow,
							alt);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_5_greenBBBBFF(
							match, useCase, flow, normalStep);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_6_expressionBBBBBBB(
							this, match, useCase, flow, normalStep,
							alternativeFlow, alt);
			return SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_7_expressionF();
		} else {
			return SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCase useCase = (UseCase) result1_bindingAndBlack[0];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[1];
		SequenceFlow defaultFlow = (SequenceFlow) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[4];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[5];
		FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result1_bindingAndBlack[6];
		AlternativeFlow alternativeFlow = (AlternativeFlow) result1_bindingAndBlack[7];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[8];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_bindingAndBlack[9];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_1_greenBFBFBBFB(
						alternativeFlow, alt, exclusiveGateway, process, csp);
		SequenceFlowToUCFlow outFlowToAlternativeFlow = (SequenceFlowToUCFlow) result1_green[1];
		SeqFlowToAltFlowAlt outFlowToAlt = (SeqFlowToAltFlowAlt) result1_green[3];
		SequenceFlow outFlow = (SequenceFlow) result1_green[6];

		// collect translated elements
		Object[] result2_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_2_blackBBBBB(
						alternativeFlow, outFlowToAlternativeFlow, alt,
						outFlowToAlt, outFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_2_greenFBBBBB(
						alternativeFlow, outFlowToAlternativeFlow, alt,
						outFlowToAlt, outFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_3_blackBBBBBBBBBBBBBBB(
						ruleresult, useCase, processToUseCase, defaultFlow,
						flow, defaultFlowToFlow, normalStep,
						exclusiveGatewayToNormalStep, alternativeFlow,
						outFlowToAlternativeFlow, alt, outFlowToAlt,
						exclusiveGateway, process, outFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_3_greenBBBBBBBBBBFFFFFFFFFF(
						ruleresult, useCase, normalStep, alternativeFlow,
						outFlowToAlternativeFlow, alt, outFlowToAlt,
						exclusiveGateway, process, outFlow);
		// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result3_green[10];
		// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[11];
		// EMoflonEdge outFlowToAlternativeFlow__outFlow____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge outFlowToAlternativeFlow__alternativeFlow____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlowToAlt__outFlow____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge outFlowToAlt__alt____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_5_expressionBBBBBBBBBBBBBBBB(
						this, ruleresult, useCase, processToUseCase,
						defaultFlow, flow, defaultFlowToFlow, normalStep,
						exclusiveGatewayToNormalStep, alternativeFlow,
						outFlowToAlternativeFlow, alt, outFlowToAlt,
						exclusiveGateway, process, outFlow);
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		NormalStep normalStep = (NormalStep) result2_binding[2];
		AlternativeFlow alternativeFlow = (AlternativeFlow) result2_binding[3];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[4];
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_12_2_blackBFFBFBFBBFFB(
						useCase, flow, normalStep, alternativeFlow, alt, match)) {
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result2_black[6];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[9];
			bpmn2.Process process = (bpmn2.Process) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_12_3_blackBBBBBBBBBBB(
							useCase, processToUseCase, defaultFlow, flow,
							defaultFlowToFlow, normalStep,
							exclusiveGatewayToNormalStep, alternativeFlow, alt,
							exclusiveGateway, process)) {
				Object[] result3_green = SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								useCase, processToUseCase, defaultFlow, flow,
								defaultFlowToFlow, normalStep,
								exclusiveGatewayToNormalStep, alternativeFlow,
								alt, exclusiveGateway, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[16];
				// EMoflonEdge defaultFlowToFlow__defaultFlow____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge defaultFlowToFlow__flow____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[19];
				// EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result3_green[22];
				// EMoflonEdge exclusiveGateway__defaultFlow____default = (EMoflonEdge) result3_green[23];
				// EMoflonEdge defaultFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[24];
				// EMoflonEdge exclusiveGateway__defaultFlow____outgoing = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__defaultFlow____flowElements = (EMoflonEdge) result3_green[26];
				// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[27];

				// solve CSP
				Object[] result4_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, useCase,
								processToUseCase, defaultFlow, flow,
								defaultFlowToFlow, normalStep,
								exclusiveGatewayToNormalStep, alternativeFlow,
								alt, exclusiveGateway, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("normalStep", normalStep);
		match.registerObject("alternativeFlow", alternativeFlow);
		match.registerObject("alt", alt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {// Create CSP
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
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", true, csp);
		var_alternativeFlow_name.setValue(alternativeFlow.getName());
		var_alternativeFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");

		// Create unbound variables
		Variable var_outFlow_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.id", csp);
		var_outFlow_id.setType("String");
		Variable var_outFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.name", csp);
		var_outFlow_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_outFlow_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_outFlow_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("alternativeFlow", alternativeFlow);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("process", process);
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
			EObject useCase, EObject processToUseCase, EObject defaultFlow,
			EObject flow, EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("outFlowToAlternativeFlow",
				outFlowToAlternativeFlow);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("alternativeFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlow())
				&& match.getObject("alt")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlowAlternative());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_21(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_20_2_blackFFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			NormalStep normalStep = (NormalStep) result2_black[2];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result2_black[3];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[4];
			Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_20_3_expressionFBBBBBBB(
							this, match, useCase, flow, normalStep,
							alternativeFlow, alt)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(
			EMoflonEdge _edge_stepAlternative) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_21_2_blackFFFFFB(_edge_stepAlternative)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			NormalStep normalStep = (NormalStep) result2_black[2];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result2_black[3];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[4];
			Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_21_3_expressionFBBBBBBB(
							this, match, useCase, flow, normalStep,
							alternativeFlow, alt)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_23(
			EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_22_2_blackFFFFFB(_edge_ref)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			NormalStep normalStep = (NormalStep) result2_black[2];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result2_black[3];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[4];
			Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_22_3_expressionFBBBBBBB(
							this, match, useCase, flow, normalStep,
							alternativeFlow, alt)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_63(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_23_2_blackFFFFB(_edge_sourceRef)) {
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_23_3_expressionFBBBBBB(
							this, match, defaultFlow, exclusiveGateway,
							process, outFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_64(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_24_2_blackFFFFB(_edge_outgoing)) {
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_24_3_expressionFBBBBBB(
							this, match, defaultFlow, exclusiveGateway,
							process, outFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_65(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_25_2_blackFFFFB(_edge_flowElements)) {
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_25_3_expressionFBBBBBB(
							this, match, defaultFlow, exclusiveGateway,
							process, outFlow)) {
				// Ensure that the correct types of elements are matched
				if (SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_25_6_expressionFB(__result);
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
			FlowNodeToStep exclusiveGatewayToNormalStepParameter) {
		// create result
		Object[] result1_black = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_28_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_28_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_28_2_blackFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList exclusiveGatewayToNormalStepList = (RuleEntryList) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			NormalStep normalStep = (NormalStep) result2_black[3];
			FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result2_black[4];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[6];
			SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result2_black[7];
			bpmn2.Process process = (bpmn2.Process) result2_black[8];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[9];

			// solve CSP
			Object[] result3_bindingAndBlack = SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_28_3_bindingAndBlackFBBBBBBBBBBBB(
							this, isApplicableMatch, useCase, processToUseCase,
							defaultFlow, flow, defaultFlowToFlow, normalStep,
							exclusiveGatewayToNormalStep, exclusiveGateway,
							process, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SeqFlowAfterEGToAltFlowRuleImpl
					.pattern_SeqFlowAfterEGToAltFlowRule_28_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = SeqFlowAfterEGToAltFlowRuleImpl
						.pattern_SeqFlowAfterEGToAltFlowRule_28_5_blackBBBBBBBBB(
								useCase, processToUseCase, defaultFlow, flow,
								defaultFlowToFlow, normalStep,
								exclusiveGatewayToNormalStep, exclusiveGateway,
								process);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_28_6_blackBBBBBBBBBB(
									useCase, processToUseCase, defaultFlow,
									flow, defaultFlowToFlow, normalStep,
									exclusiveGatewayToNormalStep,
									exclusiveGateway, process, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					SeqFlowAfterEGToAltFlowRuleImpl
							.pattern_SeqFlowAfterEGToAltFlowRule_28_6_greenBBFFFFBBFBB(
									useCase, normalStep, exclusiveGateway,
									process, ruleResult, csp);
					// AlternativeFlow alternativeFlow = (AlternativeFlow) result6_green[2];
					// SequenceFlowToUCFlow outFlowToAlternativeFlow = (SequenceFlowToUCFlow) result6_green[3];
					// AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result6_green[4];
					// SeqFlowToAltFlowAlt outFlowToAlt = (SeqFlowToAltFlowAlt) result6_green[5];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return SeqFlowAfterEGToAltFlowRuleImpl
				.pattern_SeqFlowAfterEGToAltFlowRule_28_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_outFlow_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.id", csp);
		var_outFlow_id.setType("String");
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		var_alternativeFlow_name.setType("String");
		Variable var_outFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"outFlow.name", csp);
		var_outFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_outFlow_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_outFlow_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("defaultFlowToFlow", defaultFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("process", process);
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
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(ProcessToUseCase) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(ExclusiveGateway) arguments.get(8),
					(bpmn2.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlow) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE_EXCLUSIVEGATEWAY_PROCESS:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(ProcessToUseCase) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(AlternativeFlow) arguments.get(8),
					(AlternativeFlowAlternative) arguments.get(9),
					(ExclusiveGateway) arguments.get(10),
					(bpmn2.Process) arguments.get(11));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_21((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_23((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_63__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_63((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_64__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_64((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_65__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_65((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowNodeToStep) arguments.get(1));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_EXCLUSIVEGATEWAY_PROCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1),
					(ProcessToUseCase) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(ExclusiveGateway) arguments.get(8),
					(bpmn2.Process) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_1_blackBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		if (!defaultFlow.equals(outFlow)) {
			return new Object[] { _this, match, defaultFlow, exclusiveGateway,
					process, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_2_bindingFBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				defaultFlow, exclusiveGateway, process, outFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, defaultFlow,
					exclusiveGateway, process, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_2_bindingAndBlackFBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_0_2_binding = pattern_SeqFlowAfterEGToAltFlowRule_0_2_bindingFBBBBBB(
				_this, match, defaultFlow, exclusiveGateway, process, outFlow);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_0_2_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_0_2_black = pattern_SeqFlowAfterEGToAltFlowRule_0_2_blackB(csp);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_0_2_black != null) {

				return new Object[] { csp, _this, match, defaultFlow,
						exclusiveGateway, process, outFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_0_3_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_4_blackBBBBB(
			Match match, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		if (!defaultFlow.equals(outFlow)) {
			return new Object[] { match, defaultFlow, exclusiveGateway,
					process, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_4_greenBBBBFFF(
			Match match, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(outFlow);
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String process__outFlow____flowElements_name_prime = "flowElements";
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				exclusiveGateway__outFlow____outgoing);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		return new Object[] { match, exclusiveGateway, process, outFlow,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				process__outFlow____flowElements };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_5_blackBBBBB(
			Match match, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		if (!defaultFlow.equals(outFlow)) {
			return new Object[] { match, defaultFlow, exclusiveGateway,
					process, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_0_5_greenBBBBFFFFF(
			Match match, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		EMoflonEdge exclusiveGateway__defaultFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__defaultFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(defaultFlow);
		match.getContextNodes().add(exclusiveGateway);
		match.getContextNodes().add(process);
		String exclusiveGateway__defaultFlow____default_name_prime = "default";
		String defaultFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__defaultFlow____outgoing_name_prime = "outgoing";
		String process__defaultFlow____flowElements_name_prime = "flowElements";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		exclusiveGateway__defaultFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____default.setTrg(defaultFlow);
		match.getContextEdges().add(exclusiveGateway__defaultFlow____default);
		defaultFlow__exclusiveGateway____sourceRef.setSrc(defaultFlow);
		defaultFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		match.getContextEdges().add(defaultFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__defaultFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____outgoing.setTrg(defaultFlow);
		match.getContextEdges().add(exclusiveGateway__defaultFlow____outgoing);
		process__defaultFlow____flowElements.setSrc(process);
		process__defaultFlow____flowElements.setTrg(defaultFlow);
		match.getContextEdges().add(process__defaultFlow____flowElements);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		match.getContextEdges().add(process__exclusiveGateway____flowElements);
		exclusiveGateway__defaultFlow____default
				.setName(exclusiveGateway__defaultFlow____default_name_prime);
		defaultFlow__exclusiveGateway____sourceRef
				.setName(defaultFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__defaultFlow____outgoing
				.setName(exclusiveGateway__defaultFlow____outgoing_name_prime);
		process__defaultFlow____flowElements
				.setName(process__defaultFlow____flowElements_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		return new Object[] { match, defaultFlow, exclusiveGateway, process,
				exclusiveGateway__defaultFlow____default,
				defaultFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__defaultFlow____outgoing,
				process__defaultFlow____flowElements,
				process__exclusiveGateway____flowElements };
	}

	public static final void pattern_SeqFlowAfterEGToAltFlowRule_0_6_expressionBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		_this.registerObjectsToMatch_FWD(match, defaultFlow, exclusiveGateway,
				process, outFlow);

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("defaultFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("defaultFlowToFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("exclusiveGatewayToNormalStep");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("exclusiveGateway");
		EObject _localVariable_8 = isApplicableMatch.getObject("process");
		EObject _localVariable_9 = isApplicableMatch.getObject("outFlow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpProcessToUseCase = _localVariable_1;
		EObject tmpDefaultFlow = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpDefaultFlowToFlow = _localVariable_4;
		EObject tmpNormalStep = _localVariable_5;
		EObject tmpExclusiveGatewayToNormalStep = _localVariable_6;
		EObject tmpExclusiveGateway = _localVariable_7;
		EObject tmpProcess = _localVariable_8;
		EObject tmpOutFlow = _localVariable_9;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpProcessToUseCase instanceof ProcessToUseCase) {
				ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
				if (tmpDefaultFlow instanceof SequenceFlow) {
					SequenceFlow defaultFlow = (SequenceFlow) tmpDefaultFlow;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpDefaultFlowToFlow instanceof SequenceFlowToUCFlow) {
							SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) tmpDefaultFlowToFlow;
							if (tmpNormalStep instanceof NormalStep) {
								NormalStep normalStep = (NormalStep) tmpNormalStep;
								if (tmpExclusiveGatewayToNormalStep instanceof FlowNodeToStep) {
									FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) tmpExclusiveGatewayToNormalStep;
									if (tmpExclusiveGateway instanceof ExclusiveGateway) {
										ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											if (tmpOutFlow instanceof SequenceFlow) {
												SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
												return new Object[] {
														useCase,
														processToUseCase,
														defaultFlow,
														flow,
														defaultFlowToFlow,
														normalStep,
														exclusiveGatewayToNormalStep,
														exclusiveGateway,
														process, outFlow,
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_1_blackBBBBBBBBBBFBB(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow, SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!defaultFlow.equals(outFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { useCase, processToUseCase,
							defaultFlow, flow, defaultFlowToFlow, normalStep,
							exclusiveGatewayToNormalStep, exclusiveGateway,
							process, outFlow, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_1_bindingAndBlackFFFFFFFFFFFBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_1_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding != null) {
			UseCase useCase = (UseCase) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[0];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[1];
			SequenceFlow defaultFlow = (SequenceFlow) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[2];
			Flow flow = (Flow) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[3];
			SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[4];
			NormalStep normalStep = (NormalStep) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[5];
			FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[6];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[7];
			bpmn2.Process process = (bpmn2.Process) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[8];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_binding[9];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_black = pattern_SeqFlowAfterEGToAltFlowRule_1_1_blackBBBBBBBBBBFBB(
					useCase, processToUseCase, defaultFlow, flow,
					defaultFlowToFlow, normalStep,
					exclusiveGatewayToNormalStep, exclusiveGateway, process,
					outFlow, _this, isApplicableMatch);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_1_1_black[10];

				return new Object[] { useCase, processToUseCase, defaultFlow,
						flow, defaultFlowToFlow, normalStep,
						exclusiveGatewayToNormalStep, exclusiveGateway,
						process, outFlow, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_1_greenBBFFFFBB(
			UseCase useCase, NormalStep normalStep, SequenceFlow outFlow,
			CSP csp) {
		AlternativeFlow alternativeFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		SequenceFlowToUCFlow outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		SeqFlowToAltFlowAlt outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSeqFlowToAltFlowAlt();
		Object _localVariable_0 = csp.getValue("alternativeFlow", "name");
		Object _localVariable_1 = csp.getValue("alt", "condition");
		useCase.getFlows().add(alternativeFlow);
		outFlowToAlternativeFlow.setSource(outFlow);
		outFlowToAlternativeFlow.setTarget(alternativeFlow);
		normalStep.getStepAlternative().add(alt);
		alt.setRef(alternativeFlow);
		outFlowToAlt.setSource(outFlow);
		outFlowToAlt.setTarget(alt);
		String alternativeFlow_name_prime = (String) _localVariable_0;
		String alt_condition_prime = (String) _localVariable_1;
		alternativeFlow.setName(alternativeFlow_name_prime);
		alt.setCondition(alt_condition_prime);
		return new Object[] { useCase, normalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, outFlow, csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_2_blackBBBBB(
			AlternativeFlow alternativeFlow,
			SequenceFlowToUCFlow outFlowToAlternativeFlow,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			SequenceFlow outFlow) {
		return new Object[] { alternativeFlow, outFlowToAlternativeFlow, alt,
				outFlowToAlt, outFlow };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_2_greenFBBBBB(
			AlternativeFlow alternativeFlow,
			SequenceFlowToUCFlow outFlowToAlternativeFlow,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			SequenceFlow outFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(alternativeFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToAlternativeFlow);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(outFlowToAlt);
		ruleresult.getTranslatedElements().add(outFlow);
		return new Object[] { ruleresult, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, outFlow };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_3_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject useCase,
			EObject processToUseCase, EObject defaultFlow, EObject flow,
			EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		if (!processToUseCase.equals(useCase)) {
			if (!defaultFlow.equals(useCase)) {
				if (!defaultFlow.equals(processToUseCase)) {
					if (!defaultFlow.equals(flow)) {
						if (!defaultFlow.equals(defaultFlowToFlow)) {
							if (!defaultFlow.equals(normalStep)) {
								if (!defaultFlow
										.equals(exclusiveGatewayToNormalStep)) {
									if (!defaultFlow
											.equals(outFlowToAlternativeFlow)) {
										if (!defaultFlow.equals(outFlowToAlt)) {
											if (!defaultFlow
													.equals(exclusiveGateway)) {
												if (!defaultFlow
														.equals(process)) {
													if (!defaultFlow
															.equals(outFlow)) {
														if (!flow
																.equals(useCase)) {
															if (!flow
																	.equals(processToUseCase)) {
																if (!flow
																		.equals(normalStep)) {
																	if (!flow
																			.equals(outFlowToAlternativeFlow)) {
																		if (!flow
																				.equals(outFlowToAlt)) {
																			if (!flow
																					.equals(process)) {
																				if (!flow
																						.equals(outFlow)) {
																					if (!defaultFlowToFlow
																							.equals(useCase)) {
																						if (!defaultFlowToFlow
																								.equals(processToUseCase)) {
																							if (!defaultFlowToFlow
																									.equals(flow)) {
																								if (!defaultFlowToFlow
																										.equals(normalStep)) {
																									if (!defaultFlowToFlow
																											.equals(exclusiveGatewayToNormalStep)) {
																										if (!defaultFlowToFlow
																												.equals(outFlowToAlternativeFlow)) {
																											if (!defaultFlowToFlow
																													.equals(outFlowToAlt)) {
																												if (!defaultFlowToFlow
																														.equals(exclusiveGateway)) {
																													if (!defaultFlowToFlow
																															.equals(process)) {
																														if (!defaultFlowToFlow
																																.equals(outFlow)) {
																															if (!normalStep
																																	.equals(useCase)) {
																																if (!normalStep
																																		.equals(processToUseCase)) {
																																	if (!normalStep
																																			.equals(outFlowToAlternativeFlow)) {
																																		if (!normalStep
																																				.equals(outFlowToAlt)) {
																																			if (!normalStep
																																					.equals(process)) {
																																				if (!normalStep
																																						.equals(outFlow)) {
																																					if (!exclusiveGatewayToNormalStep
																																							.equals(useCase)) {
																																						if (!exclusiveGatewayToNormalStep
																																								.equals(processToUseCase)) {
																																							if (!exclusiveGatewayToNormalStep
																																									.equals(flow)) {
																																								if (!exclusiveGatewayToNormalStep
																																										.equals(normalStep)) {
																																									if (!exclusiveGatewayToNormalStep
																																											.equals(outFlowToAlternativeFlow)) {
																																										if (!exclusiveGatewayToNormalStep
																																												.equals(outFlowToAlt)) {
																																											if (!exclusiveGatewayToNormalStep
																																													.equals(process)) {
																																												if (!exclusiveGatewayToNormalStep
																																														.equals(outFlow)) {
																																													if (!alternativeFlow
																																															.equals(useCase)) {
																																														if (!alternativeFlow
																																																.equals(processToUseCase)) {
																																															if (!alternativeFlow
																																																	.equals(defaultFlow)) {
																																																if (!alternativeFlow
																																																		.equals(flow)) {
																																																	if (!alternativeFlow
																																																			.equals(defaultFlowToFlow)) {
																																																		if (!alternativeFlow
																																																				.equals(normalStep)) {
																																																			if (!alternativeFlow
																																																					.equals(exclusiveGatewayToNormalStep)) {
																																																				if (!alternativeFlow
																																																						.equals(outFlowToAlternativeFlow)) {
																																																					if (!alternativeFlow
																																																							.equals(outFlowToAlt)) {
																																																						if (!alternativeFlow
																																																								.equals(exclusiveGateway)) {
																																																							if (!alternativeFlow
																																																									.equals(process)) {
																																																								if (!alternativeFlow
																																																										.equals(outFlow)) {
																																																									if (!outFlowToAlternativeFlow
																																																											.equals(useCase)) {
																																																										if (!outFlowToAlternativeFlow
																																																												.equals(processToUseCase)) {
																																																											if (!outFlowToAlternativeFlow
																																																													.equals(process)) {
																																																												if (!alt.equals(useCase)) {
																																																													if (!alt.equals(processToUseCase)) {
																																																														if (!alt.equals(defaultFlow)) {
																																																															if (!alt.equals(flow)) {
																																																																if (!alt.equals(defaultFlowToFlow)) {
																																																																	if (!alt.equals(normalStep)) {
																																																																		if (!alt.equals(exclusiveGatewayToNormalStep)) {
																																																																			if (!alt.equals(alternativeFlow)) {
																																																																				if (!alt.equals(outFlowToAlternativeFlow)) {
																																																																					if (!alt.equals(outFlowToAlt)) {
																																																																						if (!alt.equals(exclusiveGateway)) {
																																																																							if (!alt.equals(process)) {
																																																																								if (!alt.equals(outFlow)) {
																																																																									if (!outFlowToAlt
																																																																											.equals(useCase)) {
																																																																										if (!outFlowToAlt
																																																																												.equals(processToUseCase)) {
																																																																											if (!outFlowToAlt
																																																																													.equals(outFlowToAlternativeFlow)) {
																																																																												if (!outFlowToAlt
																																																																														.equals(process)) {
																																																																													if (!exclusiveGateway
																																																																															.equals(useCase)) {
																																																																														if (!exclusiveGateway
																																																																																.equals(processToUseCase)) {
																																																																															if (!exclusiveGateway
																																																																																	.equals(flow)) {
																																																																																if (!exclusiveGateway
																																																																																		.equals(normalStep)) {
																																																																																	if (!exclusiveGateway
																																																																																			.equals(exclusiveGatewayToNormalStep)) {
																																																																																		if (!exclusiveGateway
																																																																																				.equals(outFlowToAlternativeFlow)) {
																																																																																			if (!exclusiveGateway
																																																																																					.equals(outFlowToAlt)) {
																																																																																				if (!exclusiveGateway
																																																																																						.equals(process)) {
																																																																																					if (!exclusiveGateway
																																																																																							.equals(outFlow)) {
																																																																																						if (!process
																																																																																								.equals(useCase)) {
																																																																																							if (!process
																																																																																									.equals(processToUseCase)) {
																																																																																								if (!outFlow
																																																																																										.equals(useCase)) {
																																																																																									if (!outFlow
																																																																																											.equals(processToUseCase)) {
																																																																																										if (!outFlow
																																																																																												.equals(outFlowToAlternativeFlow)) {
																																																																																											if (!outFlow
																																																																																													.equals(outFlowToAlt)) {
																																																																																												if (!outFlow
																																																																																														.equals(process)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															useCase,
																																																																																															processToUseCase,
																																																																																															defaultFlow,
																																																																																															flow,
																																																																																															defaultFlowToFlow,
																																																																																															normalStep,
																																																																																															exclusiveGatewayToNormalStep,
																																																																																															alternativeFlow,
																																																																																															outFlowToAlternativeFlow,
																																																																																															alt,
																																																																																															outFlowToAlt,
																																																																																															exclusiveGateway,
																																																																																															process,
																																																																																															outFlow };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_1_3_greenBBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject useCase, EObject normalStep,
			EObject alternativeFlow, EObject outFlowToAlternativeFlow,
			EObject alt, EObject outFlowToAlt, EObject exclusiveGateway,
			EObject process, EObject outFlow) {
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlternativeFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlternativeFlow__alternativeFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__alt____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SeqFlowAfterEGToAltFlowRule";
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String outFlowToAlternativeFlow__outFlow____source_name_prime = "source";
		String outFlowToAlternativeFlow__alternativeFlow____target_name_prime = "target";
		String alt__alternativeFlow____ref_name_prime = "ref";
		String outFlowToAlt__outFlow____source_name_prime = "source";
		String outFlowToAlt__alt____target_name_prime = "target";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String process__outFlow____flowElements_name_prime = "flowElements";
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(useCase__alternativeFlow____flows);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		ruleresult.getCreatedEdges().add(normalStep__alt____stepAlternative);
		outFlowToAlternativeFlow__outFlow____source
				.setSrc(outFlowToAlternativeFlow);
		outFlowToAlternativeFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(
				outFlowToAlternativeFlow__outFlow____source);
		outFlowToAlternativeFlow__alternativeFlow____target
				.setSrc(outFlowToAlternativeFlow);
		outFlowToAlternativeFlow__alternativeFlow____target
				.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(
				outFlowToAlternativeFlow__alternativeFlow____target);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(alt__alternativeFlow____ref);
		outFlowToAlt__outFlow____source.setSrc(outFlowToAlt);
		outFlowToAlt__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToAlt__outFlow____source);
		outFlowToAlt__alt____target.setSrc(outFlowToAlt);
		outFlowToAlt__alt____target.setTrg(alt);
		ruleresult.getCreatedEdges().add(outFlowToAlt__alt____target);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__outFlow____outgoing);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		outFlowToAlternativeFlow__outFlow____source
				.setName(outFlowToAlternativeFlow__outFlow____source_name_prime);
		outFlowToAlternativeFlow__alternativeFlow____target
				.setName(outFlowToAlternativeFlow__alternativeFlow____target_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		outFlowToAlt__outFlow____source
				.setName(outFlowToAlt__outFlow____source_name_prime);
		outFlowToAlt__alt____target
				.setName(outFlowToAlt__alt____target_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		return new Object[] { ruleresult, useCase, normalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow, useCase__alternativeFlow____flows,
				normalStep__alt____stepAlternative,
				outFlowToAlternativeFlow__outFlow____source,
				outFlowToAlternativeFlow__alternativeFlow____target,
				alt__alternativeFlow____ref, outFlowToAlt__outFlow____source,
				outFlowToAlt__alt____target,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				process__outFlow____flowElements };
	}

	public static final void pattern_SeqFlowAfterEGToAltFlowRule_1_5_expressionBBBBBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, PerformRuleResult ruleresult,
			EObject useCase, EObject processToUseCase, EObject defaultFlow,
			EObject flow, EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		_this.registerObjects_FWD(ruleresult, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow);

	}

	public static final PerformRuleResult pattern_SeqFlowAfterEGToAltFlowRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_1_blackFBB(
			EClass eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_2_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_2_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_2_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_2_1_black = pattern_SeqFlowAfterEGToAltFlowRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SeqFlowAfterEGToAltFlowRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("defaultFlow");
		EObject _localVariable_1 = match.getObject("exclusiveGateway");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("outFlow");
		EObject tmpDefaultFlow = _localVariable_0;
		EObject tmpExclusiveGateway = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		if (tmpDefaultFlow instanceof SequenceFlow) {
			SequenceFlow defaultFlow = (SequenceFlow) tmpDefaultFlow;
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						return new Object[] { defaultFlow, exclusiveGateway,
								process, outFlow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_2_2_blackFFBFFFFBBBB(
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!defaultFlow.equals(outFlow)) {
			for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(process, ProcessToUseCase.class,
							"source")) {
				UseCase useCase = processToUseCase.getTarget();
				if (useCase != null) {
					for (SequenceFlowToUCFlow defaultFlowToFlow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(defaultFlow,
									SequenceFlowToUCFlow.class, "source")) {
						Flow flow = defaultFlowToFlow.getTarget();
						if (flow != null) {
							for (FlowNodeToStep exclusiveGatewayToNormalStep : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(
											exclusiveGateway,
											FlowNodeToStep.class, "source")) {
								Step tmpNormalStep = exclusiveGatewayToNormalStep
										.getTarget();
								if (tmpNormalStep instanceof NormalStep) {
									NormalStep normalStep = (NormalStep) tmpNormalStep;
									_result.add(new Object[] { useCase,
											processToUseCase, defaultFlow,
											flow, defaultFlowToFlow,
											normalStep,
											exclusiveGatewayToNormalStep,
											exclusiveGateway, process, outFlow,
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

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_2_3_blackBBBBBBBBBB(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!defaultFlow.equals(outFlow)) {
			if (useCase.getFlows().contains(flow)) {
				if (process.equals(processToUseCase.getSource())) {
					if (useCase.equals(processToUseCase.getTarget())) {
						if (flow.getSteps().contains(normalStep)) {
							if (defaultFlow.equals(defaultFlowToFlow
									.getSource())) {
								if (flow.equals(defaultFlowToFlow.getTarget())) {
									if (exclusiveGateway
											.equals(exclusiveGatewayToNormalStep
													.getSource())) {
										if (normalStep
												.equals(exclusiveGatewayToNormalStep
														.getTarget())) {
											if (defaultFlow
													.equals(exclusiveGateway
															.getDefault())) {
												if (exclusiveGateway
														.equals(defaultFlow
																.getSourceRef())) {
													if (exclusiveGateway
															.equals(outFlow
																	.getSourceRef())) {
														if (process
																.getFlowElements()
																.contains(
																		defaultFlow)) {
															if (process
																	.getFlowElements()
																	.contains(
																			exclusiveGateway)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	_result.add(new Object[] {
																			useCase,
																			processToUseCase,
																			defaultFlow,
																			flow,
																			defaultFlowToFlow,
																			normalStep,
																			exclusiveGatewayToNormalStep,
																			exclusiveGateway,
																			process,
																			outFlow });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlowToFlow__defaultFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__defaultFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCase__flow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String defaultFlowToFlow__defaultFlow____source_name_prime = "source";
		String defaultFlowToFlow__flow____target_name_prime = "target";
		String exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime = "source";
		String exclusiveGatewayToNormalStep__normalStep____target_name_prime = "target";
		String exclusiveGateway__defaultFlow____default_name_prime = "default";
		String defaultFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__defaultFlow____outgoing_name_prime = "outgoing";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String process__defaultFlow____flowElements_name_prime = "flowElements";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(defaultFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(defaultFlowToFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGatewayToNormalStep);
		isApplicableMatch.getAllContextElements().add(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(outFlow);
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
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
		defaultFlowToFlow__defaultFlow____source.setSrc(defaultFlowToFlow);
		defaultFlowToFlow__defaultFlow____source.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				defaultFlowToFlow__defaultFlow____source);
		defaultFlowToFlow__flow____target.setSrc(defaultFlowToFlow);
		defaultFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				defaultFlowToFlow__flow____target);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGatewayToNormalStep__exclusiveGateway____source);
		exclusiveGatewayToNormalStep__normalStep____target
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__normalStep____target.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGatewayToNormalStep__normalStep____target);
		exclusiveGateway__defaultFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____default.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__defaultFlow____default);
		defaultFlow__exclusiveGateway____sourceRef.setSrc(defaultFlow);
		defaultFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				defaultFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__defaultFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____outgoing.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__defaultFlow____outgoing);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__outFlow____outgoing);
		process__defaultFlow____flowElements.setSrc(process);
		process__defaultFlow____flowElements.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				process__defaultFlow____flowElements);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		defaultFlowToFlow__defaultFlow____source
				.setName(defaultFlowToFlow__defaultFlow____source_name_prime);
		defaultFlowToFlow__flow____target
				.setName(defaultFlowToFlow__flow____target_name_prime);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setName(exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime);
		exclusiveGatewayToNormalStep__normalStep____target
				.setName(exclusiveGatewayToNormalStep__normalStep____target_name_prime);
		exclusiveGateway__defaultFlow____default
				.setName(exclusiveGateway__defaultFlow____default_name_prime);
		defaultFlow__exclusiveGateway____sourceRef
				.setName(defaultFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__defaultFlow____outgoing
				.setName(exclusiveGateway__defaultFlow____outgoing_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		process__defaultFlow____flowElements
				.setName(process__defaultFlow____flowElements_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		return new Object[] { useCase, processToUseCase, defaultFlow, flow,
				defaultFlowToFlow, normalStep, exclusiveGatewayToNormalStep,
				exclusiveGateway, process, outFlow, isApplicableMatch,
				useCase__flow____flows, processToUseCase__process____source,
				processToUseCase__useCase____target, flow__normalStep____steps,
				defaultFlowToFlow__defaultFlow____source,
				defaultFlowToFlow__flow____target,
				exclusiveGatewayToNormalStep__exclusiveGateway____source,
				exclusiveGatewayToNormalStep__normalStep____target,
				exclusiveGateway__defaultFlow____default,
				defaultFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__defaultFlow____outgoing,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				process__defaultFlow____flowElements,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_4_bindingFBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			ProcessToUseCase processToUseCase, SequenceFlow defaultFlow,
			Flow flow, SequenceFlowToUCFlow defaultFlowToFlow,
			NormalStep normalStep, FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, useCase, processToUseCase, defaultFlow,
				flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, exclusiveGateway, process,
				outFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					processToUseCase, defaultFlow, flow, defaultFlowToFlow,
					normalStep, exclusiveGatewayToNormalStep, exclusiveGateway,
					process, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_4_bindingAndBlackFBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			ProcessToUseCase processToUseCase, SequenceFlow defaultFlow,
			Flow flow, SequenceFlowToUCFlow defaultFlowToFlow,
			NormalStep normalStep, FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SequenceFlow outFlow) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_2_4_binding = pattern_SeqFlowAfterEGToAltFlowRule_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, exclusiveGateway, process,
				outFlow);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_2_4_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_2_4_black = pattern_SeqFlowAfterEGToAltFlowRule_2_4_blackB(csp);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						processToUseCase, defaultFlow, flow, defaultFlowToFlow,
						normalStep, exclusiveGatewayToNormalStep,
						exclusiveGateway, process, outFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_2_5_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SeqFlowAfterEGToAltFlowRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SeqFlowAfterEGToAltFlowRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_1_blackBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		if (!alternativeFlow.equals(flow)) {
			return new Object[] { _this, match, useCase, flow, normalStep,
					alternativeFlow, alt };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_2_bindingFBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase,
				flow, normalStep, alternativeFlow, alt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, flow, normalStep,
					alternativeFlow, alt };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_2_bindingAndBlackFBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_10_2_binding = pattern_SeqFlowAfterEGToAltFlowRule_10_2_bindingFBBBBBBB(
				_this, match, useCase, flow, normalStep, alternativeFlow, alt);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_10_2_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_10_2_black = pattern_SeqFlowAfterEGToAltFlowRule_10_2_blackB(csp);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, flow,
						normalStep, alternativeFlow, alt };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_10_3_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_4_blackBBBBBB(
			Match match, UseCase useCase, Flow flow, NormalStep normalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt) {
		if (!alternativeFlow.equals(flow)) {
			return new Object[] { match, useCase, flow, normalStep,
					alternativeFlow, alt };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_4_greenBBBBBFFF(
			Match match, UseCase useCase, NormalStep normalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt) {
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(alternativeFlow);
		match.getToBeTranslatedNodes().add(alt);
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__alternativeFlow____ref_name_prime = "ref";
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		match.getToBeTranslatedEdges().add(useCase__alternativeFlow____flows);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		match.getToBeTranslatedEdges().add(normalStep__alt____stepAlternative);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		match.getToBeTranslatedEdges().add(alt__alternativeFlow____ref);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		return new Object[] { match, useCase, normalStep, alternativeFlow, alt,
				useCase__alternativeFlow____flows,
				normalStep__alt____stepAlternative, alt__alternativeFlow____ref };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_5_blackBBBBBB(
			Match match, UseCase useCase, Flow flow, NormalStep normalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt) {
		if (!alternativeFlow.equals(flow)) {
			return new Object[] { match, useCase, flow, normalStep,
					alternativeFlow, alt };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_10_5_greenBBBBFF(
			Match match, UseCase useCase, Flow flow, NormalStep normalStep) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(normalStep);
		String useCase__flow____flows_name_prime = "flows";
		String flow__normalStep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		match.getContextEdges().add(flow__normalStep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { match, useCase, flow, normalStep,
				useCase__flow____flows, flow__normalStep____steps };
	}

	public static final void pattern_SeqFlowAfterEGToAltFlowRule_10_6_expressionBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		_this.registerObjectsToMatch_BWD(match, useCase, flow, normalStep,
				alternativeFlow, alt);

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("defaultFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("defaultFlowToFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("exclusiveGatewayToNormalStep");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("alternativeFlow");
		EObject _localVariable_8 = isApplicableMatch.getObject("alt");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("exclusiveGateway");
		EObject _localVariable_10 = isApplicableMatch.getObject("process");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpProcessToUseCase = _localVariable_1;
		EObject tmpDefaultFlow = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpDefaultFlowToFlow = _localVariable_4;
		EObject tmpNormalStep = _localVariable_5;
		EObject tmpExclusiveGatewayToNormalStep = _localVariable_6;
		EObject tmpAlternativeFlow = _localVariable_7;
		EObject tmpAlt = _localVariable_8;
		EObject tmpExclusiveGateway = _localVariable_9;
		EObject tmpProcess = _localVariable_10;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpProcessToUseCase instanceof ProcessToUseCase) {
				ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
				if (tmpDefaultFlow instanceof SequenceFlow) {
					SequenceFlow defaultFlow = (SequenceFlow) tmpDefaultFlow;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpDefaultFlowToFlow instanceof SequenceFlowToUCFlow) {
							SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) tmpDefaultFlowToFlow;
							if (tmpNormalStep instanceof NormalStep) {
								NormalStep normalStep = (NormalStep) tmpNormalStep;
								if (tmpExclusiveGatewayToNormalStep instanceof FlowNodeToStep) {
									FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) tmpExclusiveGatewayToNormalStep;
									if (tmpAlternativeFlow instanceof AlternativeFlow) {
										AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
										if (tmpAlt instanceof AlternativeFlowAlternative) {
											AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
											if (tmpExclusiveGateway instanceof ExclusiveGateway) {
												ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
												if (tmpProcess instanceof bpmn2.Process) {
													bpmn2.Process process = (bpmn2.Process) tmpProcess;
													return new Object[] {
															useCase,
															processToUseCase,
															defaultFlow,
															flow,
															defaultFlowToFlow,
															normalStep,
															exclusiveGatewayToNormalStep,
															alternativeFlow,
															alt,
															exclusiveGateway,
															process,
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_1_blackBBBBBBBBBBBFBB(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!alternativeFlow.equals(flow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { useCase, processToUseCase,
							defaultFlow, flow, defaultFlowToFlow, normalStep,
							exclusiveGatewayToNormalStep, alternativeFlow, alt,
							exclusiveGateway, process, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_11_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding != null) {
			UseCase useCase = (UseCase) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[0];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[1];
			SequenceFlow defaultFlow = (SequenceFlow) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[2];
			Flow flow = (Flow) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[3];
			SequenceFlowToUCFlow defaultFlowToFlow = (SequenceFlowToUCFlow) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[4];
			NormalStep normalStep = (NormalStep) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[5];
			FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[6];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[7];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[8];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[9];
			bpmn2.Process process = (bpmn2.Process) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_binding[10];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_black = pattern_SeqFlowAfterEGToAltFlowRule_11_1_blackBBBBBBBBBBBFBB(
					useCase, processToUseCase, defaultFlow, flow,
					defaultFlowToFlow, normalStep,
					exclusiveGatewayToNormalStep, alternativeFlow, alt,
					exclusiveGateway, process, _this, isApplicableMatch);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_11_1_black[11];

				return new Object[] { useCase, processToUseCase, defaultFlow,
						flow, defaultFlowToFlow, normalStep,
						exclusiveGatewayToNormalStep, alternativeFlow, alt,
						exclusiveGateway, process, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_1_greenBFBFBBFB(
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process, CSP csp) {
		SequenceFlowToUCFlow outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SeqFlowToAltFlowAlt outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSeqFlowToAltFlowAlt();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		Object _localVariable_0 = csp.getValue("outFlow", "id");
		Object _localVariable_1 = csp.getValue("outFlow", "name");
		outFlowToAlternativeFlow.setTarget(alternativeFlow);
		outFlowToAlt.setTarget(alt);
		outFlowToAlternativeFlow.setSource(outFlow);
		outFlowToAlt.setSource(outFlow);
		outFlow.setSourceRef(exclusiveGateway);
		process.getFlowElements().add(outFlow);
		String outFlow_id_prime = (String) _localVariable_0;
		String outFlow_name_prime = (String) _localVariable_1;
		outFlow.setId(outFlow_id_prime);
		outFlow.setName(outFlow_name_prime);
		return new Object[] { alternativeFlow, outFlowToAlternativeFlow, alt,
				outFlowToAlt, exclusiveGateway, process, outFlow, csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_2_blackBBBBB(
			AlternativeFlow alternativeFlow,
			SequenceFlowToUCFlow outFlowToAlternativeFlow,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			SequenceFlow outFlow) {
		return new Object[] { alternativeFlow, outFlowToAlternativeFlow, alt,
				outFlowToAlt, outFlow };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_2_greenFBBBBB(
			AlternativeFlow alternativeFlow,
			SequenceFlowToUCFlow outFlowToAlternativeFlow,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			SequenceFlow outFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(alternativeFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToAlternativeFlow);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(outFlowToAlt);
		ruleresult.getCreatedElements().add(outFlow);
		return new Object[] { ruleresult, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, outFlow };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_3_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject useCase,
			EObject processToUseCase, EObject defaultFlow, EObject flow,
			EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		if (!processToUseCase.equals(useCase)) {
			if (!defaultFlow.equals(useCase)) {
				if (!defaultFlow.equals(processToUseCase)) {
					if (!defaultFlow.equals(flow)) {
						if (!defaultFlow.equals(defaultFlowToFlow)) {
							if (!defaultFlow.equals(normalStep)) {
								if (!defaultFlow
										.equals(exclusiveGatewayToNormalStep)) {
									if (!defaultFlow
											.equals(outFlowToAlternativeFlow)) {
										if (!defaultFlow.equals(outFlowToAlt)) {
											if (!defaultFlow
													.equals(exclusiveGateway)) {
												if (!defaultFlow
														.equals(process)) {
													if (!defaultFlow
															.equals(outFlow)) {
														if (!flow
																.equals(useCase)) {
															if (!flow
																	.equals(processToUseCase)) {
																if (!flow
																		.equals(normalStep)) {
																	if (!flow
																			.equals(outFlowToAlternativeFlow)) {
																		if (!flow
																				.equals(outFlowToAlt)) {
																			if (!flow
																					.equals(process)) {
																				if (!flow
																						.equals(outFlow)) {
																					if (!defaultFlowToFlow
																							.equals(useCase)) {
																						if (!defaultFlowToFlow
																								.equals(processToUseCase)) {
																							if (!defaultFlowToFlow
																									.equals(flow)) {
																								if (!defaultFlowToFlow
																										.equals(normalStep)) {
																									if (!defaultFlowToFlow
																											.equals(exclusiveGatewayToNormalStep)) {
																										if (!defaultFlowToFlow
																												.equals(outFlowToAlternativeFlow)) {
																											if (!defaultFlowToFlow
																													.equals(outFlowToAlt)) {
																												if (!defaultFlowToFlow
																														.equals(exclusiveGateway)) {
																													if (!defaultFlowToFlow
																															.equals(process)) {
																														if (!defaultFlowToFlow
																																.equals(outFlow)) {
																															if (!normalStep
																																	.equals(useCase)) {
																																if (!normalStep
																																		.equals(processToUseCase)) {
																																	if (!normalStep
																																			.equals(outFlowToAlternativeFlow)) {
																																		if (!normalStep
																																				.equals(outFlowToAlt)) {
																																			if (!normalStep
																																					.equals(process)) {
																																				if (!normalStep
																																						.equals(outFlow)) {
																																					if (!exclusiveGatewayToNormalStep
																																							.equals(useCase)) {
																																						if (!exclusiveGatewayToNormalStep
																																								.equals(processToUseCase)) {
																																							if (!exclusiveGatewayToNormalStep
																																									.equals(flow)) {
																																								if (!exclusiveGatewayToNormalStep
																																										.equals(normalStep)) {
																																									if (!exclusiveGatewayToNormalStep
																																											.equals(outFlowToAlternativeFlow)) {
																																										if (!exclusiveGatewayToNormalStep
																																												.equals(outFlowToAlt)) {
																																											if (!exclusiveGatewayToNormalStep
																																													.equals(process)) {
																																												if (!exclusiveGatewayToNormalStep
																																														.equals(outFlow)) {
																																													if (!alternativeFlow
																																															.equals(useCase)) {
																																														if (!alternativeFlow
																																																.equals(processToUseCase)) {
																																															if (!alternativeFlow
																																																	.equals(defaultFlow)) {
																																																if (!alternativeFlow
																																																		.equals(flow)) {
																																																	if (!alternativeFlow
																																																			.equals(defaultFlowToFlow)) {
																																																		if (!alternativeFlow
																																																				.equals(normalStep)) {
																																																			if (!alternativeFlow
																																																					.equals(exclusiveGatewayToNormalStep)) {
																																																				if (!alternativeFlow
																																																						.equals(outFlowToAlternativeFlow)) {
																																																					if (!alternativeFlow
																																																							.equals(outFlowToAlt)) {
																																																						if (!alternativeFlow
																																																								.equals(exclusiveGateway)) {
																																																							if (!alternativeFlow
																																																									.equals(process)) {
																																																								if (!alternativeFlow
																																																										.equals(outFlow)) {
																																																									if (!outFlowToAlternativeFlow
																																																											.equals(useCase)) {
																																																										if (!outFlowToAlternativeFlow
																																																												.equals(processToUseCase)) {
																																																											if (!outFlowToAlternativeFlow
																																																													.equals(process)) {
																																																												if (!alt.equals(useCase)) {
																																																													if (!alt.equals(processToUseCase)) {
																																																														if (!alt.equals(defaultFlow)) {
																																																															if (!alt.equals(flow)) {
																																																																if (!alt.equals(defaultFlowToFlow)) {
																																																																	if (!alt.equals(normalStep)) {
																																																																		if (!alt.equals(exclusiveGatewayToNormalStep)) {
																																																																			if (!alt.equals(alternativeFlow)) {
																																																																				if (!alt.equals(outFlowToAlternativeFlow)) {
																																																																					if (!alt.equals(outFlowToAlt)) {
																																																																						if (!alt.equals(exclusiveGateway)) {
																																																																							if (!alt.equals(process)) {
																																																																								if (!alt.equals(outFlow)) {
																																																																									if (!outFlowToAlt
																																																																											.equals(useCase)) {
																																																																										if (!outFlowToAlt
																																																																												.equals(processToUseCase)) {
																																																																											if (!outFlowToAlt
																																																																													.equals(outFlowToAlternativeFlow)) {
																																																																												if (!outFlowToAlt
																																																																														.equals(process)) {
																																																																													if (!exclusiveGateway
																																																																															.equals(useCase)) {
																																																																														if (!exclusiveGateway
																																																																																.equals(processToUseCase)) {
																																																																															if (!exclusiveGateway
																																																																																	.equals(flow)) {
																																																																																if (!exclusiveGateway
																																																																																		.equals(normalStep)) {
																																																																																	if (!exclusiveGateway
																																																																																			.equals(exclusiveGatewayToNormalStep)) {
																																																																																		if (!exclusiveGateway
																																																																																				.equals(outFlowToAlternativeFlow)) {
																																																																																			if (!exclusiveGateway
																																																																																					.equals(outFlowToAlt)) {
																																																																																				if (!exclusiveGateway
																																																																																						.equals(process)) {
																																																																																					if (!exclusiveGateway
																																																																																							.equals(outFlow)) {
																																																																																						if (!process
																																																																																								.equals(useCase)) {
																																																																																							if (!process
																																																																																									.equals(processToUseCase)) {
																																																																																								if (!outFlow
																																																																																										.equals(useCase)) {
																																																																																									if (!outFlow
																																																																																											.equals(processToUseCase)) {
																																																																																										if (!outFlow
																																																																																												.equals(outFlowToAlternativeFlow)) {
																																																																																											if (!outFlow
																																																																																													.equals(outFlowToAlt)) {
																																																																																												if (!outFlow
																																																																																														.equals(process)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															useCase,
																																																																																															processToUseCase,
																																																																																															defaultFlow,
																																																																																															flow,
																																																																																															defaultFlowToFlow,
																																																																																															normalStep,
																																																																																															exclusiveGatewayToNormalStep,
																																																																																															alternativeFlow,
																																																																																															outFlowToAlternativeFlow,
																																																																																															alt,
																																																																																															outFlowToAlt,
																																																																																															exclusiveGateway,
																																																																																															process,
																																																																																															outFlow };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_11_3_greenBBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject useCase, EObject normalStep,
			EObject alternativeFlow, EObject outFlowToAlternativeFlow,
			EObject alt, EObject outFlowToAlt, EObject exclusiveGateway,
			EObject process, EObject outFlow) {
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlternativeFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlternativeFlow__alternativeFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__alt____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SeqFlowAfterEGToAltFlowRule";
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String outFlowToAlternativeFlow__outFlow____source_name_prime = "source";
		String outFlowToAlternativeFlow__alternativeFlow____target_name_prime = "target";
		String alt__alternativeFlow____ref_name_prime = "ref";
		String outFlowToAlt__outFlow____source_name_prime = "source";
		String outFlowToAlt__alt____target_name_prime = "target";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String process__outFlow____flowElements_name_prime = "flowElements";
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		ruleresult.getTranslatedEdges().add(useCase__alternativeFlow____flows);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		ruleresult.getTranslatedEdges().add(normalStep__alt____stepAlternative);
		outFlowToAlternativeFlow__outFlow____source
				.setSrc(outFlowToAlternativeFlow);
		outFlowToAlternativeFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(
				outFlowToAlternativeFlow__outFlow____source);
		outFlowToAlternativeFlow__alternativeFlow____target
				.setSrc(outFlowToAlternativeFlow);
		outFlowToAlternativeFlow__alternativeFlow____target
				.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(
				outFlowToAlternativeFlow__alternativeFlow____target);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		ruleresult.getTranslatedEdges().add(alt__alternativeFlow____ref);
		outFlowToAlt__outFlow____source.setSrc(outFlowToAlt);
		outFlowToAlt__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToAlt__outFlow____source);
		outFlowToAlt__alt____target.setSrc(outFlowToAlt);
		outFlowToAlt__alt____target.setTrg(alt);
		ruleresult.getCreatedEdges().add(outFlowToAlt__alt____target);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges()
				.add(outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__outFlow____outgoing);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(process__outFlow____flowElements);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		outFlowToAlternativeFlow__outFlow____source
				.setName(outFlowToAlternativeFlow__outFlow____source_name_prime);
		outFlowToAlternativeFlow__alternativeFlow____target
				.setName(outFlowToAlternativeFlow__alternativeFlow____target_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		outFlowToAlt__outFlow____source
				.setName(outFlowToAlt__outFlow____source_name_prime);
		outFlowToAlt__alt____target
				.setName(outFlowToAlt__alt____target_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		return new Object[] { ruleresult, useCase, normalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow, useCase__alternativeFlow____flows,
				normalStep__alt____stepAlternative,
				outFlowToAlternativeFlow__outFlow____source,
				outFlowToAlternativeFlow__alternativeFlow____target,
				alt__alternativeFlow____ref, outFlowToAlt__outFlow____source,
				outFlowToAlt__alt____target,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				process__outFlow____flowElements };
	}

	public static final void pattern_SeqFlowAfterEGToAltFlowRule_11_5_expressionBBBBBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, PerformRuleResult ruleresult,
			EObject useCase, EObject processToUseCase, EObject defaultFlow,
			EObject flow, EObject defaultFlowToFlow, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alternativeFlow,
			EObject outFlowToAlternativeFlow, EObject alt,
			EObject outFlowToAlt, EObject exclusiveGateway, EObject process,
			EObject outFlow) {
		_this.registerObjects_BWD(ruleresult, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow);

	}

	public static final PerformRuleResult pattern_SeqFlowAfterEGToAltFlowRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_1_blackFBB(
			EClass eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_12_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_12_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_12_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_12_1_black = pattern_SeqFlowAfterEGToAltFlowRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SeqFlowAfterEGToAltFlowRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("normalStep");
		EObject _localVariable_3 = match.getObject("alternativeFlow");
		EObject _localVariable_4 = match.getObject("alt");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpNormalStep = _localVariable_2;
		EObject tmpAlternativeFlow = _localVariable_3;
		EObject tmpAlt = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpNormalStep instanceof NormalStep) {
					NormalStep normalStep = (NormalStep) tmpNormalStep;
					if (tmpAlternativeFlow instanceof AlternativeFlow) {
						AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
						if (tmpAlt instanceof AlternativeFlowAlternative) {
							AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
							return new Object[] { useCase, flow, normalStep,
									alternativeFlow, alt, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_12_2_blackBFFBFBFBBFFB(
			UseCase useCase, Flow flow, NormalStep normalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!alternativeFlow.equals(flow)) {
			for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(useCase, ProcessToUseCase.class,
							"target")) {
				bpmn2.Process process = processToUseCase.getSource();
				if (process != null) {
					for (SequenceFlowToUCFlow defaultFlowToFlow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									SequenceFlowToUCFlow.class, "target")) {
						SequenceFlow defaultFlow = defaultFlowToFlow
								.getSource();
						if (defaultFlow != null) {
							for (FlowNodeToStep exclusiveGatewayToNormalStep : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											FlowNodeToStep.class, "target")) {
								FlowNode tmpExclusiveGateway = exclusiveGatewayToNormalStep
										.getSource();
								if (tmpExclusiveGateway instanceof ExclusiveGateway) {
									ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
									_result.add(new Object[] { useCase,
											processToUseCase, defaultFlow,
											flow, defaultFlowToFlow,
											normalStep,
											exclusiveGatewayToNormalStep,
											alternativeFlow, alt,
											exclusiveGateway, process, match });
								}

							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_12_3_blackBBBBBBBBBBB(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!alternativeFlow.equals(flow)) {
			if (useCase.getFlows().contains(flow)) {
				if (useCase.getFlows().contains(alternativeFlow)) {
					if (process.equals(processToUseCase.getSource())) {
						if (useCase.equals(processToUseCase.getTarget())) {
							if (flow.getSteps().contains(normalStep)) {
								if (defaultFlow.equals(defaultFlowToFlow
										.getSource())) {
									if (flow.equals(defaultFlowToFlow
											.getTarget())) {
										if (normalStep.getStepAlternative()
												.contains(alt)) {
											if (exclusiveGateway
													.equals(exclusiveGatewayToNormalStep
															.getSource())) {
												if (normalStep
														.equals(exclusiveGatewayToNormalStep
																.getTarget())) {
													if (alternativeFlow
															.equals(alt
																	.getRef())) {
														if (defaultFlow
																.equals(exclusiveGateway
																		.getDefault())) {
															if (exclusiveGateway
																	.equals(defaultFlow
																			.getSourceRef())) {
																if (process
																		.getFlowElements()
																		.contains(
																				defaultFlow)) {
																	if (process
																			.getFlowElements()
																			.contains(
																					exclusiveGateway)) {
																		_result.add(new Object[] {
																				useCase,
																				processToUseCase,
																				defaultFlow,
																				flow,
																				defaultFlowToFlow,
																				normalStep,
																				exclusiveGatewayToNormalStep,
																				alternativeFlow,
																				alt,
																				exclusiveGateway,
																				process });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlowToFlow__defaultFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__defaultFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCase__flow____flows_name_prime = "flows";
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String defaultFlowToFlow__defaultFlow____source_name_prime = "source";
		String defaultFlowToFlow__flow____target_name_prime = "target";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime = "source";
		String exclusiveGatewayToNormalStep__normalStep____target_name_prime = "target";
		String alt__alternativeFlow____ref_name_prime = "ref";
		String exclusiveGateway__defaultFlow____default_name_prime = "default";
		String defaultFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__defaultFlow____outgoing_name_prime = "outgoing";
		String process__defaultFlow____flowElements_name_prime = "flowElements";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(defaultFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(defaultFlowToFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGatewayToNormalStep);
		isApplicableMatch.getAllContextElements().add(alternativeFlow);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(process);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__alternativeFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
		defaultFlowToFlow__defaultFlow____source.setSrc(defaultFlowToFlow);
		defaultFlowToFlow__defaultFlow____source.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				defaultFlowToFlow__defaultFlow____source);
		defaultFlowToFlow__flow____target.setSrc(defaultFlowToFlow);
		defaultFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				defaultFlowToFlow__flow____target);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				normalStep__alt____stepAlternative);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGatewayToNormalStep__exclusiveGateway____source);
		exclusiveGatewayToNormalStep__normalStep____target
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__normalStep____target.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGatewayToNormalStep__normalStep____target);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		isApplicableMatch.getAllContextElements().add(
				alt__alternativeFlow____ref);
		exclusiveGateway__defaultFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____default.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__defaultFlow____default);
		defaultFlow__exclusiveGateway____sourceRef.setSrc(defaultFlow);
		defaultFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				defaultFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__defaultFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____outgoing.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__defaultFlow____outgoing);
		process__defaultFlow____flowElements.setSrc(process);
		process__defaultFlow____flowElements.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				process__defaultFlow____flowElements);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exclusiveGateway____flowElements);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		defaultFlowToFlow__defaultFlow____source
				.setName(defaultFlowToFlow__defaultFlow____source_name_prime);
		defaultFlowToFlow__flow____target
				.setName(defaultFlowToFlow__flow____target_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setName(exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime);
		exclusiveGatewayToNormalStep__normalStep____target
				.setName(exclusiveGatewayToNormalStep__normalStep____target_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		exclusiveGateway__defaultFlow____default
				.setName(exclusiveGateway__defaultFlow____default_name_prime);
		defaultFlow__exclusiveGateway____sourceRef
				.setName(defaultFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__defaultFlow____outgoing
				.setName(exclusiveGateway__defaultFlow____outgoing_name_prime);
		process__defaultFlow____flowElements
				.setName(process__defaultFlow____flowElements_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		return new Object[] { useCase, processToUseCase, defaultFlow, flow,
				defaultFlowToFlow, normalStep, exclusiveGatewayToNormalStep,
				alternativeFlow, alt, exclusiveGateway, process,
				isApplicableMatch, useCase__flow____flows,
				useCase__alternativeFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target, flow__normalStep____steps,
				defaultFlowToFlow__defaultFlow____source,
				defaultFlowToFlow__flow____target,
				normalStep__alt____stepAlternative,
				exclusiveGatewayToNormalStep__exclusiveGateway____source,
				exclusiveGatewayToNormalStep__normalStep____target,
				alt__alternativeFlow____ref,
				exclusiveGateway__defaultFlow____default,
				defaultFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__defaultFlow____outgoing,
				process__defaultFlow____flowElements,
				process__exclusiveGateway____flowElements };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_4_bindingFBBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			ProcessToUseCase processToUseCase, SequenceFlow defaultFlow,
			Flow flow, SequenceFlowToUCFlow defaultFlowToFlow,
			NormalStep normalStep, FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, useCase, processToUseCase, defaultFlow,
				flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, alternativeFlow, alt,
				exclusiveGateway, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					processToUseCase, defaultFlow, flow, defaultFlowToFlow,
					normalStep, exclusiveGatewayToNormalStep, alternativeFlow,
					alt, exclusiveGateway, process };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			ProcessToUseCase processToUseCase, SequenceFlow defaultFlow,
			Flow flow, SequenceFlowToUCFlow defaultFlowToFlow,
			NormalStep normalStep, FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlow alternativeFlow, AlternativeFlowAlternative alt,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_12_4_binding = pattern_SeqFlowAfterEGToAltFlowRule_12_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, alternativeFlow, alt,
				exclusiveGateway, process);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_12_4_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_12_4_black = pattern_SeqFlowAfterEGToAltFlowRule_12_4_blackB(csp);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						processToUseCase, defaultFlow, flow, defaultFlowToFlow,
						normalStep, exclusiveGatewayToNormalStep,
						alternativeFlow, alt, exclusiveGateway, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_12_5_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SeqFlowAfterEGToAltFlowRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SeqFlowAfterEGToAltFlowRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_1_blackFBB(
			EClass __eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_20_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_20_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_20_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_20_1_black = pattern_SeqFlowAfterEGToAltFlowRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_20_2_blackFFFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpAlternativeFlow = _edge_flows.getTrg();
			if (tmpAlternativeFlow instanceof AlternativeFlow) {
				AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
				if (useCase.getFlows().contains(alternativeFlow)) {
					for (Flow flow : useCase.getFlows()) {
						if (!alternativeFlow.equals(flow)) {
							for (Step tmpNormalStep : flow.getSteps()) {
								if (tmpNormalStep instanceof NormalStep) {
									NormalStep normalStep = (NormalStep) tmpNormalStep;
									for (StepAlternative tmpAlt : normalStep
											.getStepAlternative()) {
										if (tmpAlt instanceof AlternativeFlowAlternative) {
											AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
											if (alternativeFlow.equals(alt
													.getRef())) {
												_result.add(new Object[] {
														useCase, flow,
														normalStep,
														alternativeFlow, alt,
														_edge_flows });
											}
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_20_3_expressionFBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				flow, normalStep, alternativeFlow, alt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_20_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterEGToAltFlowRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_1_blackFBB(
			EClass __eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_21_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_21_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_21_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_21_1_black = pattern_SeqFlowAfterEGToAltFlowRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_21_2_blackFFFFFB(
			EMoflonEdge _edge_stepAlternative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_stepAlternative.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpAlt = _edge_stepAlternative.getTrg();
			if (tmpAlt instanceof AlternativeFlowAlternative) {
				AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
				if (normalStep.getStepAlternative().contains(alt)) {
					NamedFlow tmpAlternativeFlow = alt.getRef();
					if (tmpAlternativeFlow instanceof AlternativeFlow) {
						AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
						for (Flow flow : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(normalStep,
										Flow.class, "steps")) {
							if (!alternativeFlow.equals(flow)) {
								for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												alternativeFlow, UseCase.class,
												"flows")) {
									if (useCase.getFlows().contains(flow)) {
										_result.add(new Object[] { useCase,
												flow, normalStep,
												alternativeFlow, alt,
												_edge_stepAlternative });
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_21_3_expressionFBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				flow, normalStep, alternativeFlow, alt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_21_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterEGToAltFlowRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_1_blackFBB(
			EClass __eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_22_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_22_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_22_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_22_1_black = pattern_SeqFlowAfterEGToAltFlowRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_22_2_blackFFFFFB(
			EMoflonEdge _edge_ref) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_ref.getSrc();
		if (tmpAlt instanceof AlternativeFlowAlternative) {
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
			EObject tmpAlternativeFlow = _edge_ref.getTrg();
			if (tmpAlternativeFlow instanceof AlternativeFlow) {
				AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
				if (alternativeFlow.equals(alt.getRef())) {
					for (NormalStep normalStep : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(alt, NormalStep.class,
									"stepAlternative")) {
						for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(alternativeFlow,
										UseCase.class, "flows")) {
							for (Flow flow : useCase.getFlows()) {
								if (!alternativeFlow.equals(flow)) {
									if (flow.getSteps().contains(normalStep)) {
										_result.add(new Object[] { useCase,
												flow, normalStep,
												alternativeFlow, alt, _edge_ref });
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_22_3_expressionFBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlow alternativeFlow,
			AlternativeFlowAlternative alt) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				flow, normalStep, alternativeFlow, alt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_22_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterEGToAltFlowRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_1_blackFBB(
			EClass __eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_23_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_23_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_23_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_23_1_black = pattern_SeqFlowAfterEGToAltFlowRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_115070 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_115070)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_2_black_nac_1BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_23_2_blackFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpExclusiveGateway = _edge_sourceRef.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					SequenceFlow defaultFlow = exclusiveGateway.getDefault();
					if (defaultFlow != null) {
						if (!defaultFlow.equals(outFlow)) {
							if (exclusiveGateway.equals(defaultFlow
									.getSourceRef())) {
								if (pattern_SeqFlowAfterEGToAltFlowRule_23_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_SeqFlowAfterEGToAltFlowRule_23_2_black_nac_1BB(
											exclusiveGateway, outFlow) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														outFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(defaultFlow)) {
													if (process
															.getFlowElements()
															.contains(
																	exclusiveGateway)) {
														_result.add(new Object[] {
																defaultFlow,
																exclusiveGateway,
																process,
																outFlow,
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

		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_23_3_expressionFBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defaultFlow,
				exclusiveGateway, process, outFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_23_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterEGToAltFlowRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_1_blackFBB(
			EClass __eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_24_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_24_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_24_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_24_1_black = pattern_SeqFlowAfterEGToAltFlowRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_745722 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_745722)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_2_black_nac_1BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_24_2_blackFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_outgoing.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					SequenceFlow defaultFlow = exclusiveGateway.getDefault();
					if (defaultFlow != null) {
						if (!defaultFlow.equals(outFlow)) {
							if (exclusiveGateway.equals(defaultFlow
									.getSourceRef())) {
								if (pattern_SeqFlowAfterEGToAltFlowRule_24_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_SeqFlowAfterEGToAltFlowRule_24_2_black_nac_1BB(
											exclusiveGateway, outFlow) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(defaultFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														_result.add(new Object[] {
																defaultFlow,
																exclusiveGateway,
																process,
																outFlow,
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

		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_24_3_expressionFBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defaultFlow,
				exclusiveGateway, process, outFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_24_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterEGToAltFlowRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_1_bindingFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_1_blackFBB(
			EClass __eClass, SeqFlowAfterEGToAltFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_1_bindingAndBlackFFB(
			SeqFlowAfterEGToAltFlowRule _this) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_25_1_binding = pattern_SeqFlowAfterEGToAltFlowRule_25_1_bindingFB(_this);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SeqFlowAfterEGToAltFlowRule_25_1_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_25_1_black = pattern_SeqFlowAfterEGToAltFlowRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SeqFlowAfterEGToAltFlowRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_443087 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_443087)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_2_black_nac_1BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_25_2_blackFFFFB(
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
							SequenceFlow defaultFlow = exclusiveGateway
									.getDefault();
							if (defaultFlow != null) {
								if (!defaultFlow.equals(outFlow)) {
									if (exclusiveGateway.equals(defaultFlow
											.getSourceRef())) {
										if (process.getFlowElements().contains(
												defaultFlow)) {
											if (pattern_SeqFlowAfterEGToAltFlowRule_25_2_black_nac_0BB(
													outFlow, exclusiveGateway) == null) {
												if (pattern_SeqFlowAfterEGToAltFlowRule_25_2_black_nac_1BB(
														exclusiveGateway,
														outFlow) == null) {
													_result.add(new Object[] {
															defaultFlow,
															exclusiveGateway,
															process, outFlow,
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

		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_25_3_expressionFBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			bpmn2.Process process, SequenceFlow outFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defaultFlow,
				exclusiveGateway, process, outFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_25_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SeqFlowAfterEGToAltFlowRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_1_blackB(
			SeqFlowAfterEGToAltFlowRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, NormalStep normalStep) {
		if (ruleResult.getTargetObjects().contains(normalStep)) {
			return new Object[] { ruleResult, normalStep };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult,
			FlowNodeToStep exclusiveGatewayToNormalStep) {
		if (ruleResult.getCorrObjects().contains(exclusiveGatewayToNormalStep)) {
			return new Object[] { ruleResult, exclusiveGatewayToNormalStep };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			ExclusiveGateway exclusiveGateway) {
		if (ruleResult.getSourceObjects().contains(exclusiveGateway)) {
			return new Object[] { ruleResult, exclusiveGateway };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow defaultFlow) {
		if (ruleResult.getSourceObjects().contains(defaultFlow)) {
			return new Object[] { ruleResult, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow defaultFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(defaultFlowToFlow)) {
			return new Object[] { ruleResult, defaultFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SeqFlowAfterEGToAltFlowRule_28_2_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList exclusiveGatewayToNormalStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpExclusiveGatewayToNormalStep : exclusiveGatewayToNormalStepList
					.getEntryObjects()) {
				if (tmpExclusiveGatewayToNormalStep instanceof FlowNodeToStep) {
					FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) tmpExclusiveGatewayToNormalStep;
					Step tmpNormalStep = exclusiveGatewayToNormalStep
							.getTarget();
					if (tmpNormalStep instanceof NormalStep) {
						NormalStep normalStep = (NormalStep) tmpNormalStep;
						FlowNode tmpExclusiveGateway = exclusiveGatewayToNormalStep
								.getSource();
						if (tmpExclusiveGateway instanceof ExclusiveGateway) {
							ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
							SequenceFlow defaultFlow = exclusiveGateway
									.getDefault();
							if (defaultFlow != null) {
								if (exclusiveGateway.equals(defaultFlow
										.getSourceRef())) {
									if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_3BB(
											ruleResult,
											exclusiveGatewayToNormalStep) == null) {
										if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_2BB(
												ruleResult, normalStep) == null) {
											if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_4BB(
													ruleResult,
													exclusiveGateway) == null) {
												if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_5BB(
														ruleResult, defaultFlow) == null) {
													for (Flow flow : org.moflon.util.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	normalStep,
																	Flow.class,
																	"steps")) {
														if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_1BB(
																ruleResult,
																flow) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			exclusiveGateway,
																			FlowElementsContainer.class,
																			"flowElements")) {
																if (tmpProcess instanceof bpmn2.Process) {
																	bpmn2.Process process = (bpmn2.Process) tmpProcess;
																	if (process
																			.getFlowElements()
																			.contains(
																					defaultFlow)) {
																		if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_7BB(
																				ruleResult,
																				process) == null) {
																			for (SequenceFlowToUCFlow defaultFlowToFlow : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							defaultFlow,
																							SequenceFlowToUCFlow.class,
																							"source")) {
																				if (flow.equals(defaultFlowToFlow
																						.getTarget())) {
																					if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_6BB(
																							ruleResult,
																							defaultFlowToFlow) == null) {
																						for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										flow,
																										UseCase.class,
																										"flows")) {
																							if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_0BB(
																									ruleResult,
																									useCase) == null) {
																								for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												process,
																												ProcessToUseCase.class,
																												"source")) {
																									if (useCase
																											.equals(processToUseCase
																													.getTarget())) {
																										if (pattern_SeqFlowAfterEGToAltFlowRule_28_2_black_nac_8BB(
																												ruleResult,
																												processToUseCase) == null) {
																											_result.add(new Object[] {
																													exclusiveGatewayToNormalStepList,
																													useCase,
																													flow,
																													normalStep,
																													exclusiveGatewayToNormalStep,
																													exclusiveGateway,
																													defaultFlow,
																													defaultFlowToFlow,
																													process,
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

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_3_bindingFBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			ProcessToUseCase processToUseCase, SequenceFlow defaultFlow,
			Flow flow, SequenceFlowToUCFlow defaultFlowToFlow,
			NormalStep normalStep, FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, useCase, processToUseCase, defaultFlow,
				flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, exclusiveGateway, process,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					processToUseCase, defaultFlow, flow, defaultFlowToFlow,
					normalStep, exclusiveGatewayToNormalStep, exclusiveGateway,
					process, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_3_bindingAndBlackFBBBBBBBBBBBB(
			SeqFlowAfterEGToAltFlowRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			ProcessToUseCase processToUseCase, SequenceFlow defaultFlow,
			Flow flow, SequenceFlowToUCFlow defaultFlowToFlow,
			NormalStep normalStep, FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_28_3_binding = pattern_SeqFlowAfterEGToAltFlowRule_28_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, useCase, processToUseCase,
				defaultFlow, flow, defaultFlowToFlow, normalStep,
				exclusiveGatewayToNormalStep, exclusiveGateway, process,
				ruleResult);
		if (result_pattern_SeqFlowAfterEGToAltFlowRule_28_3_binding != null) {
			CSP csp = (CSP) result_pattern_SeqFlowAfterEGToAltFlowRule_28_3_binding[0];

			Object[] result_pattern_SeqFlowAfterEGToAltFlowRule_28_3_black = pattern_SeqFlowAfterEGToAltFlowRule_28_3_blackB(csp);
			if (result_pattern_SeqFlowAfterEGToAltFlowRule_28_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						processToUseCase, defaultFlow, flow, defaultFlowToFlow,
						normalStep, exclusiveGatewayToNormalStep,
						exclusiveGateway, process, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SeqFlowAfterEGToAltFlowRule_28_4_expressionFBB(
			SeqFlowAfterEGToAltFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_5_blackBBBBBBBBB(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process) {
		return new Object[] { useCase, processToUseCase, defaultFlow, flow,
				defaultFlowToFlow, normalStep, exclusiveGatewayToNormalStep,
				exclusiveGateway, process };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_6_blackBBBBBBBBBB(
			UseCase useCase, ProcessToUseCase processToUseCase,
			SequenceFlow defaultFlow, Flow flow,
			SequenceFlowToUCFlow defaultFlowToFlow, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { useCase, processToUseCase, defaultFlow, flow,
				defaultFlowToFlow, normalStep, exclusiveGatewayToNormalStep,
				exclusiveGateway, process, ruleResult };
	}

	public static final Object[] pattern_SeqFlowAfterEGToAltFlowRule_28_6_greenBBFFFFBBFBB(
			UseCase useCase, NormalStep normalStep,
			ExclusiveGateway exclusiveGateway, bpmn2.Process process,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		AlternativeFlow alternativeFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		SequenceFlowToUCFlow outFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		SeqFlowToAltFlowAlt outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSeqFlowToAltFlowAlt();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		Object _localVariable_0 = csp.getValue("alternativeFlow", "name");
		Object _localVariable_1 = csp.getValue("alt", "condition");
		Object _localVariable_2 = csp.getValue("outFlow", "id");
		Object _localVariable_3 = csp.getValue("outFlow", "name");
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		useCase.getFlows().add(alternativeFlow);
		ruleResult.getTargetObjects().add(alternativeFlow);
		outFlowToAlternativeFlow.setTarget(alternativeFlow);
		ruleResult.getCorrObjects().add(outFlowToAlternativeFlow);
		normalStep.getStepAlternative().add(alt);
		alt.setRef(alternativeFlow);
		ruleResult.getTargetObjects().add(alt);
		outFlowToAlt.setTarget(alt);
		ruleResult.getCorrObjects().add(outFlowToAlt);
		outFlowToAlternativeFlow.setSource(outFlow);
		outFlowToAlt.setSource(outFlow);
		outFlow.setSourceRef(exclusiveGateway);
		process.getFlowElements().add(outFlow);
		ruleResult.getSourceObjects().add(outFlow);
		String alternativeFlow_name_prime = (String) _localVariable_0;
		String alt_condition_prime = (String) _localVariable_1;
		String outFlow_id_prime = (String) _localVariable_2;
		String outFlow_name_prime = (String) _localVariable_3;
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		alternativeFlow.setName(alternativeFlow_name_prime);
		alt.setCondition(alt_condition_prime);
		outFlow.setId(outFlow_id_prime);
		outFlow.setName(outFlow_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { useCase, normalStep, alternativeFlow,
				outFlowToAlternativeFlow, alt, outFlowToAlt, exclusiveGateway,
				process, outFlow, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SeqFlowAfterEGToAltFlowRule_28_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SeqFlowAfterEGToAltFlowRuleImpl
