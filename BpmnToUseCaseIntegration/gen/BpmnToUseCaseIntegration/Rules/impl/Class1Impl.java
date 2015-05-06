/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.ProcessToBasicFlow;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.Class1;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToUCCondition;

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

import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.UCCondition;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.SequenceFlow;
import bpmn2.StartEvent;

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
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Class1Impl extends AbstractRuleImpl implements Class1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClass1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_0_1_blackBBBBB(this,
				match, process, startEvent, seqFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_0_2_bindingAndBlackFBBBBB(this, match, process,
						startEvent, seqFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_0_4_blackBBBB(
					match, process, startEvent, seqFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			Class1Impl.pattern_Class1_0_4_greenBBBBFFFF(match, process,
					startEvent, seqFlow);
			// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result4_green[4];
			// EMoflonEdge process__seqFlow____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge seqFlow__startEvent____sourceRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge startEvent__seqFlow____outgoing = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_0_5_blackBBBB(
					match, process, startEvent, seqFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			Class1Impl.pattern_Class1_0_5_greenBB(match, process);

			// register objects to match
			Class1Impl.pattern_Class1_0_6_expressionBBBBB(this, match, process,
					startEvent, seqFlow);
			return Class1Impl.pattern_Class1_0_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_1_1_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[2];
		StartEvent startEvent = (StartEvent) result1_bindingAndBlack[3];
		BasicFlow basicFlow = (BasicFlow) result1_bindingAndBlack[4];
		ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result1_bindingAndBlack[5];
		SequenceFlow seqFlow = (SequenceFlow) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = Class1Impl.pattern_Class1_1_1_greenBBFBFBFB(
				useCase, startEvent, basicFlow, seqFlow, csp);
		UCCondition precond = (UCCondition) result1_green[2];
		StartEventToUCCondition startEventToPrecond = (StartEventToUCCondition) result1_green[4];
		SequenceFlowToUCFlow seqFlowToBasicFlow = (SequenceFlowToUCFlow) result1_green[6];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_1_2_blackBBBBB(
				startEvent, precond, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_1_2_greenFBBBBB(
				startEvent, precond, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl
				.pattern_Class1_1_3_blackBBBBBBBBBBB(ruleresult, process,
						useCase, processToUseCase, startEvent, precond,
						basicFlow, processToBasicFlow, startEventToPrecond,
						seqFlow, seqFlowToBasicFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		Class1Impl.pattern_Class1_1_3_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				process, useCase, startEvent, precond, basicFlow,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow);
		// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result3_green[9];
		// EMoflonEdge process__seqFlow____flowElements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result3_green[11];
		// EMoflonEdge seqFlow__startEvent____sourceRef = (EMoflonEdge) result3_green[12];
		// EMoflonEdge startEvent__seqFlow____outgoing = (EMoflonEdge) result3_green[13];
		// EMoflonEdge startEventToPrecond__startEvent____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge startEventToPrecond__precond____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge seqFlowToBasicFlow__seqFlow____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge seqFlowToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[17];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_1_5_expressionBBBBBBBBBBBB(this, ruleresult,
				process, useCase, processToUseCase, startEvent, precond,
				basicFlow, processToBasicFlow, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);
		return Class1Impl.pattern_Class1_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl
				.pattern_Class1_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		StartEvent startEvent = (StartEvent) result2_binding[1];
		SequenceFlow seqFlow = (SequenceFlow) result2_binding[2];
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_2_2_blackBFFBFFBB(process, startEvent, seqFlow,
						match)) {
			UseCase useCase = (UseCase) result2_black[1];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[2];
			BasicFlow basicFlow = (BasicFlow) result2_black[4];
			ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_2_3_blackBBBBBBB(process, useCase,
							processToUseCase, startEvent, basicFlow,
							processToBasicFlow, seqFlow)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_2_3_greenBBBBBBBFFFFFFFFFF(process,
								useCase, processToUseCase, startEvent,
								basicFlow, processToBasicFlow, seqFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__seqFlow____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge seqFlow__startEvent____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge startEvent__seqFlow____outgoing = (EMoflonEdge) result3_green[14];
				// EMoflonEdge processToBasicFlow__process____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge processToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_2_4_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, process, useCase,
								processToUseCase, startEvent, basicFlow,
								processToBasicFlow, seqFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl
							.pattern_Class1_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		match.registerObject("process", process);
		match.registerObject("startEvent", startEvent);
		match.registerObject("seqFlow", seqFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {// Create CSP
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
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			SequenceFlow seqFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", true, csp);
		var_startEvent_name.setValue(startEvent.getName());
		var_startEvent_name.setType("String");

		// Create unbound variables
		Variable var_precond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"precond.name", csp);
		var_precond_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_startEvent_name, var_precond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("startEvent", startEvent);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
		isApplicableMatch.registerObject("processToBasicFlow",
				processToBasicFlow);
		isApplicableMatch.registerObject("seqFlow", seqFlow);
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
			EObject process, EObject useCase, EObject processToUseCase,
			EObject startEvent, EObject precond, EObject basicFlow,
			EObject processToBasicFlow, EObject startEventToPrecond,
			EObject seqFlow, EObject seqFlowToBasicFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("startEvent", startEvent);
		ruleresult.registerObject("precond", precond);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("processToBasicFlow", processToBasicFlow);
		ruleresult.registerObject("startEventToPrecond", startEventToPrecond);
		ruleresult.registerObject("seqFlow", seqFlow);
		ruleresult.registerObject("seqFlowToBasicFlow", seqFlowToBasicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("startEvent").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getStartEvent())
				&& match.getObject("seqFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase,
			UCCondition precond, BasicFlow basicFlow) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_10_1_blackBBBBB(
				this, match, useCase, precond, basicFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_10_2_bindingAndBlackFBBBBB(this, match,
						useCase, precond, basicFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_10_4_blackBBBB(
					match, useCase, precond, basicFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			Class1Impl.pattern_Class1_10_4_greenBBBF(match, useCase, precond);
			// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_10_5_blackBBBB(
					match, useCase, precond, basicFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			Class1Impl.pattern_Class1_10_5_greenBBBF(match, useCase, basicFlow);
			// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result5_green[3];

			// register objects to match
			Class1Impl.pattern_Class1_10_6_expressionBBBBB(this, match,
					useCase, precond, basicFlow);
			return Class1Impl.pattern_Class1_10_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_11_1_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[2];
		UCCondition precond = (UCCondition) result1_bindingAndBlack[3];
		BasicFlow basicFlow = (BasicFlow) result1_bindingAndBlack[4];
		ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = Class1Impl.pattern_Class1_11_1_greenBFBBFFFB(
				process, precond, basicFlow, csp);
		StartEvent startEvent = (StartEvent) result1_green[1];
		StartEventToUCCondition startEventToPrecond = (StartEventToUCCondition) result1_green[4];
		SequenceFlow seqFlow = (SequenceFlow) result1_green[5];
		SequenceFlowToUCFlow seqFlowToBasicFlow = (SequenceFlowToUCFlow) result1_green[6];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_11_2_blackBBBBB(
				startEvent, precond, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_11_2_greenFBBBBB(
				startEvent, precond, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl
				.pattern_Class1_11_3_blackBBBBBBBBBBB(ruleresult, process,
						useCase, processToUseCase, startEvent, precond,
						basicFlow, processToBasicFlow, startEventToPrecond,
						seqFlow, seqFlowToBasicFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		Class1Impl.pattern_Class1_11_3_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				process, useCase, startEvent, precond, basicFlow,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow);
		// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result3_green[9];
		// EMoflonEdge process__seqFlow____flowElements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result3_green[11];
		// EMoflonEdge seqFlow__startEvent____sourceRef = (EMoflonEdge) result3_green[12];
		// EMoflonEdge startEvent__seqFlow____outgoing = (EMoflonEdge) result3_green[13];
		// EMoflonEdge startEventToPrecond__startEvent____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge startEventToPrecond__precond____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge seqFlowToBasicFlow__seqFlow____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge seqFlowToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[17];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_11_5_expressionBBBBBBBBBBBB(this, ruleresult,
				process, useCase, processToUseCase, startEvent, precond,
				basicFlow, processToBasicFlow, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);
		return Class1Impl.pattern_Class1_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl
				.pattern_Class1_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		UCCondition precond = (UCCondition) result2_binding[1];
		BasicFlow basicFlow = (BasicFlow) result2_binding[2];
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_12_2_blackFBFBBFB(useCase, precond, basicFlow,
						match)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[2];
			ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_12_3_blackBBBBBB(process, useCase,
							processToUseCase, precond, basicFlow,
							processToBasicFlow)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_12_3_greenBBBBBBFFFFFFF(process,
								useCase, processToUseCase, precond, basicFlow,
								processToBasicFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge useCase__precond____preconditions = (EMoflonEdge) result3_green[7];
				// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[8];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge processToBasicFlow__process____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge processToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_12_4_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, process, useCase,
								processToUseCase, precond, basicFlow,
								processToBasicFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl
							.pattern_Class1_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase,
			UCCondition precond, BasicFlow basicFlow) {
		match.registerObject("useCase", useCase);
		match.registerObject("precond", precond);
		match.registerObject("basicFlow", basicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase,
			UCCondition precond, BasicFlow basicFlow) {// Create CSP
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
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition precond,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_precond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"precond.name", true, csp);
		var_precond_name.setValue(precond.getName());
		var_precond_name.setType("String");

		// Create unbound variables
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", csp);
		var_startEvent_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_startEvent_name, var_precond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("precond", precond);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
		isApplicableMatch.registerObject("processToBasicFlow",
				processToBasicFlow);
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
			EObject process, EObject useCase, EObject processToUseCase,
			EObject startEvent, EObject precond, EObject basicFlow,
			EObject processToBasicFlow, EObject startEventToPrecond,
			EObject seqFlow, EObject seqFlowToBasicFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("startEvent", startEvent);
		ruleresult.registerObject("precond", precond);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("processToBasicFlow", processToBasicFlow);
		ruleresult.registerObject("startEventToPrecond", startEventToPrecond);
		ruleresult.registerObject("seqFlow", seqFlow);
		ruleresult.registerObject("seqFlowToBasicFlow", seqFlowToBasicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("precond")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getUCCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_20_2_blackFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			StartEvent startEvent = (StartEvent) result2_black[1];
			SequenceFlow seqFlow = (SequenceFlow) result2_black[2];
			Object[] result2_green = Class1Impl
					.pattern_Class1_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_20_3_expressionFBBBBB(this, match,
					process, startEvent, seqFlow)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_21_2_blackFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			StartEvent startEvent = (StartEvent) result2_black[1];
			SequenceFlow seqFlow = (SequenceFlow) result2_black[2];
			Object[] result2_green = Class1Impl
					.pattern_Class1_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_21_3_expressionFBBBBB(this, match,
					process, startEvent, seqFlow)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(
			EMoflonEdge _edge_preconditions) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_22_2_blackFFFB(_edge_preconditions)) {
			UseCase useCase = (UseCase) result2_black[0];
			UCCondition precond = (UCCondition) result2_black[1];
			BasicFlow basicFlow = (BasicFlow) result2_black[2];
			Object[] result2_green = Class1Impl
					.pattern_Class1_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_22_3_expressionFBBBBB(this, match,
					useCase, precond, basicFlow)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_23_2_blackFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			StartEvent startEvent = (StartEvent) result2_black[1];
			SequenceFlow seqFlow = (SequenceFlow) result2_black[2];
			Object[] result2_green = Class1Impl
					.pattern_Class1_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_23_3_expressionFBBBBB(this, match,
					process, startEvent, seqFlow)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_24_2_blackFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			StartEvent startEvent = (StartEvent) result2_black[1];
			SequenceFlow seqFlow = (SequenceFlow) result2_black[2];
			Object[] result2_green = Class1Impl
					.pattern_Class1_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_24_3_expressionFBBBBB(this, match,
					process, startEvent, seqFlow)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_24_6_expressionFB(__result);
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
			ProcessToUseCase processToUseCaseParameter) {
		// create result
		Object[] result1_black = Class1Impl.pattern_Class1_27_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = Class1Impl.pattern_Class1_27_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_27_2_blackFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList processToUseCaseList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			BasicFlow basicFlow = (BasicFlow) result2_black[4];
			ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = Class1Impl
					.pattern_Class1_27_3_bindingAndBlackFBBBBBBBB(this,
							isApplicableMatch, process, useCase,
							processToUseCase, basicFlow, processToBasicFlow,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Class1Impl.pattern_Class1_27_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = Class1Impl
						.pattern_Class1_27_5_blackBBBBB(process, useCase,
								processToUseCase, basicFlow, processToBasicFlow);
				if (result5_black != null) {

					// perform
					Object[] result6_black = Class1Impl
							.pattern_Class1_27_6_blackBBBBBB(process, useCase,
									processToUseCase, basicFlow,
									processToBasicFlow, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					Class1Impl.pattern_Class1_27_6_greenBBFFBFFFBB(process,
							useCase, basicFlow, ruleResult, csp);
					// StartEvent startEvent = (StartEvent) result6_green[2];
					// UCCondition precond = (UCCondition) result6_green[3];
					// StartEventToUCCondition startEventToPrecond = (StartEventToUCCondition) result6_green[5];
					// SequenceFlow seqFlow = (SequenceFlow) result6_green[6];
					// SequenceFlowToUCFlow seqFlowToBasicFlow = (SequenceFlowToUCFlow) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_27_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, BasicFlow basicFlow,
			ProcessToBasicFlow processToBasicFlow,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", csp);
		var_startEvent_name.setType("String");
		Variable var_precond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"precond.name", csp);
		var_precond_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_startEvent_name, var_precond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
		isApplicableMatch.registerObject("processToBasicFlow",
				processToBasicFlow);
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
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(StartEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3));
		case RulesPackage.CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(StartEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(StartEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_PROCESSTOUSECASE_STARTEVENT_BASICFLOW_PROCESSTOBASICFLOW_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(UseCase) arguments.get(2),
					(ProcessToUseCase) arguments.get(3),
					(StartEvent) arguments.get(4),
					(BasicFlow) arguments.get(5),
					(ProcessToBasicFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD__MATCH_USECASE_UCCONDITION_BASICFLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (UCCondition) arguments.get(2),
					(BasicFlow) arguments.get(3));
		case RulesPackage.CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_UCCONDITION_BASICFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (UCCondition) arguments.get(2),
					(BasicFlow) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_UCCONDITION_BASICFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (UCCondition) arguments.get(2),
					(BasicFlow) arguments.get(3));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_PROCESSTOUSECASE_UCCONDITION_BASICFLOW_PROCESSTOBASICFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(UseCase) arguments.get(2),
					(ProcessToUseCase) arguments.get(3),
					(UCCondition) arguments.get(4),
					(BasicFlow) arguments.get(5),
					(ProcessToBasicFlow) arguments.get(6));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER_PROCESSTOUSECASE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(ProcessToUseCase) arguments.get(1));
		case RulesPackage.CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_PROCESSTOUSECASE_BASICFLOW_PROCESSTOBASICFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(UseCase) arguments.get(2),
					(ProcessToUseCase) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(ProcessToBasicFlow) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Class1_0_1_blackBBBBB(Class1 _this,
			Match match, bpmn2.Process process, StartEvent startEvent,
			SequenceFlow seqFlow) {
		return new Object[] { _this, match, process, startEvent, seqFlow };
	}

	public static final Object[] pattern_Class1_0_2_bindingFBBBBB(Class1 _this,
			Match match, bpmn2.Process process, StartEvent startEvent,
			SequenceFlow seqFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				startEvent, seqFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, startEvent,
					seqFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_0_2_bindingAndBlackFBBBBB(
			Class1 _this, Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		Object[] result_pattern_Class1_0_2_binding = pattern_Class1_0_2_bindingFBBBBB(
				_this, match, process, startEvent, seqFlow);
		if (result_pattern_Class1_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_0_2_binding[0];

			Object[] result_pattern_Class1_0_2_black = pattern_Class1_0_2_blackB(csp);
			if (result_pattern_Class1_0_2_black != null) {

				return new Object[] { csp, _this, match, process, startEvent,
						seqFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_0_3_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_0_4_blackBBBB(Match match,
			bpmn2.Process process, StartEvent startEvent, SequenceFlow seqFlow) {
		return new Object[] { match, process, startEvent, seqFlow };
	}

	public static final Object[] pattern_Class1_0_4_greenBBBBFFFF(Match match,
			bpmn2.Process process, StartEvent startEvent, SequenceFlow seqFlow) {
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__seqFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__seqFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(startEvent);
		match.getToBeTranslatedNodes().add(seqFlow);
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__seqFlow____flowElements_name_prime = "flowElements";
		String seqFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__seqFlow____outgoing_name_prime = "outgoing";
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		match.getToBeTranslatedEdges().add(process__startEvent____flowElements);
		process__seqFlow____flowElements.setSrc(process);
		process__seqFlow____flowElements.setTrg(seqFlow);
		match.getToBeTranslatedEdges().add(process__seqFlow____flowElements);
		seqFlow__startEvent____sourceRef.setSrc(seqFlow);
		seqFlow__startEvent____sourceRef.setTrg(startEvent);
		match.getToBeTranslatedEdges().add(seqFlow__startEvent____sourceRef);
		startEvent__seqFlow____outgoing.setSrc(startEvent);
		startEvent__seqFlow____outgoing.setTrg(seqFlow);
		match.getToBeTranslatedEdges().add(startEvent__seqFlow____outgoing);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__seqFlow____flowElements
				.setName(process__seqFlow____flowElements_name_prime);
		seqFlow__startEvent____sourceRef
				.setName(seqFlow__startEvent____sourceRef_name_prime);
		startEvent__seqFlow____outgoing
				.setName(startEvent__seqFlow____outgoing_name_prime);
		return new Object[] { match, process, startEvent, seqFlow,
				process__startEvent____flowElements,
				process__seqFlow____flowElements,
				seqFlow__startEvent____sourceRef,
				startEvent__seqFlow____outgoing };
	}

	public static final Object[] pattern_Class1_0_5_blackBBBB(Match match,
			bpmn2.Process process, StartEvent startEvent, SequenceFlow seqFlow) {
		return new Object[] { match, process, startEvent, seqFlow };
	}

	public static final Object[] pattern_Class1_0_5_greenBB(Match match,
			bpmn2.Process process) {
		match.getContextNodes().add(process);
		return new Object[] { match, process };
	}

	public static final void pattern_Class1_0_6_expressionBBBBB(Class1 _this,
			Match match, bpmn2.Process process, StartEvent startEvent,
			SequenceFlow seqFlow) {
		_this.registerObjectsToMatch_FWD(match, process, startEvent, seqFlow);

	}

	public static final boolean pattern_Class1_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_1_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("startEvent");
		EObject _localVariable_4 = isApplicableMatch.getObject("basicFlow");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("processToBasicFlow");
		EObject _localVariable_6 = isApplicableMatch.getObject("seqFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpProcessToUseCase = _localVariable_2;
		EObject tmpStartEvent = _localVariable_3;
		EObject tmpBasicFlow = _localVariable_4;
		EObject tmpProcessToBasicFlow = _localVariable_5;
		EObject tmpSeqFlow = _localVariable_6;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpProcessToUseCase instanceof ProcessToUseCase) {
					ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
					if (tmpStartEvent instanceof StartEvent) {
						StartEvent startEvent = (StartEvent) tmpStartEvent;
						if (tmpBasicFlow instanceof BasicFlow) {
							BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
							if (tmpProcessToBasicFlow instanceof ProcessToBasicFlow) {
								ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) tmpProcessToBasicFlow;
								if (tmpSeqFlow instanceof SequenceFlow) {
									SequenceFlow seqFlow = (SequenceFlow) tmpSeqFlow;
									return new Object[] { process, useCase,
											processToUseCase, startEvent,
											basicFlow, processToBasicFlow,
											seqFlow, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_blackBBBBBBBFBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			SequenceFlow seqFlow, Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, useCase, processToUseCase,
						startEvent, basicFlow, processToBasicFlow, seqFlow,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_bindingAndBlackFFFFFFFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_1_1_binding = pattern_Class1_1_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_Class1_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_Class1_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_Class1_1_1_binding[1];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_Class1_1_1_binding[2];
			StartEvent startEvent = (StartEvent) result_pattern_Class1_1_1_binding[3];
			BasicFlow basicFlow = (BasicFlow) result_pattern_Class1_1_1_binding[4];
			ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result_pattern_Class1_1_1_binding[5];
			SequenceFlow seqFlow = (SequenceFlow) result_pattern_Class1_1_1_binding[6];

			Object[] result_pattern_Class1_1_1_black = pattern_Class1_1_1_blackBBBBBBBFBB(
					process, useCase, processToUseCase, startEvent, basicFlow,
					processToBasicFlow, seqFlow, _this, isApplicableMatch);
			if (result_pattern_Class1_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_1_1_black[7];

				return new Object[] { process, useCase, processToUseCase,
						startEvent, basicFlow, processToBasicFlow, seqFlow,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_greenBBFBFBFB(
			UseCase useCase, StartEvent startEvent, BasicFlow basicFlow,
			SequenceFlow seqFlow, CSP csp) {
		UCCondition precond = UseCaseDSLFactory.eINSTANCE.createUCCondition();
		StartEventToUCCondition startEventToPrecond = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createStartEventToUCCondition();
		SequenceFlowToUCFlow seqFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("precond", "name");
		useCase.getPreconditions().add(precond);
		startEventToPrecond.setSource(startEvent);
		startEventToPrecond.setTarget(precond);
		seqFlowToBasicFlow.setSource(seqFlow);
		seqFlowToBasicFlow.setTarget(basicFlow);
		String precond_name_prime = (String) _localVariable_0;
		precond.setName(precond_name_prime);
		return new Object[] { useCase, startEvent, precond, basicFlow,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow, csp };
	}

	public static final Object[] pattern_Class1_1_2_blackBBBBB(
			StartEvent startEvent, UCCondition precond,
			StartEventToUCCondition startEventToPrecond, SequenceFlow seqFlow,
			SequenceFlowToUCFlow seqFlowToBasicFlow) {
		return new Object[] { startEvent, precond, startEventToPrecond,
				seqFlow, seqFlowToBasicFlow };
	}

	public static final Object[] pattern_Class1_1_2_greenFBBBBB(
			StartEvent startEvent, UCCondition precond,
			StartEventToUCCondition startEventToPrecond, SequenceFlow seqFlow,
			SequenceFlowToUCFlow seqFlowToBasicFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(startEvent);
		ruleresult.getCreatedElements().add(precond);
		ruleresult.getCreatedLinkElements().add(startEventToPrecond);
		ruleresult.getTranslatedElements().add(seqFlow);
		ruleresult.getCreatedLinkElements().add(seqFlowToBasicFlow);
		return new Object[] { ruleresult, startEvent, precond,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow };
	}

	public static final Object[] pattern_Class1_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject precond,
			EObject basicFlow, EObject processToBasicFlow,
			EObject startEventToPrecond, EObject seqFlow,
			EObject seqFlowToBasicFlow) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!process.equals(startEvent)) {
					if (!process.equals(processToBasicFlow)) {
						if (!process.equals(startEventToPrecond)) {
							if (!process.equals(seqFlow)) {
								if (!process.equals(seqFlowToBasicFlow)) {
									if (!processToUseCase.equals(useCase)) {
										if (!processToUseCase
												.equals(startEvent)) {
											if (!processToUseCase
													.equals(startEventToPrecond)) {
												if (!processToUseCase
														.equals(seqFlow)) {
													if (!processToUseCase
															.equals(seqFlowToBasicFlow)) {
														if (!startEvent
																.equals(useCase)) {
															if (!startEvent
																	.equals(startEventToPrecond)) {
																if (!precond
																		.equals(process)) {
																	if (!precond
																			.equals(useCase)) {
																		if (!precond
																				.equals(processToUseCase)) {
																			if (!precond
																					.equals(startEvent)) {
																				if (!precond
																						.equals(processToBasicFlow)) {
																					if (!precond
																							.equals(startEventToPrecond)) {
																						if (!precond
																								.equals(seqFlow)) {
																							if (!precond
																									.equals(seqFlowToBasicFlow)) {
																								if (!basicFlow
																										.equals(process)) {
																									if (!basicFlow
																											.equals(useCase)) {
																										if (!basicFlow
																												.equals(processToUseCase)) {
																											if (!basicFlow
																													.equals(startEvent)) {
																												if (!basicFlow
																														.equals(precond)) {
																													if (!basicFlow
																															.equals(processToBasicFlow)) {
																														if (!basicFlow
																																.equals(startEventToPrecond)) {
																															if (!basicFlow
																																	.equals(seqFlow)) {
																																if (!basicFlow
																																		.equals(seqFlowToBasicFlow)) {
																																	if (!processToBasicFlow
																																			.equals(useCase)) {
																																		if (!processToBasicFlow
																																				.equals(processToUseCase)) {
																																			if (!processToBasicFlow
																																					.equals(startEvent)) {
																																				if (!processToBasicFlow
																																						.equals(startEventToPrecond)) {
																																					if (!processToBasicFlow
																																							.equals(seqFlow)) {
																																						if (!processToBasicFlow
																																								.equals(seqFlowToBasicFlow)) {
																																							if (!startEventToPrecond
																																									.equals(useCase)) {
																																								if (!seqFlow
																																										.equals(useCase)) {
																																									if (!seqFlow
																																											.equals(startEvent)) {
																																										if (!seqFlow
																																												.equals(startEventToPrecond)) {
																																											if (!seqFlow
																																													.equals(seqFlowToBasicFlow)) {
																																												if (!seqFlowToBasicFlow
																																														.equals(useCase)) {
																																													if (!seqFlowToBasicFlow
																																															.equals(startEvent)) {
																																														if (!seqFlowToBasicFlow
																																																.equals(startEventToPrecond)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	process,
																																																	useCase,
																																																	processToUseCase,
																																																	startEvent,
																																																	precond,
																																																	basicFlow,
																																																	processToBasicFlow,
																																																	startEventToPrecond,
																																																	seqFlow,
																																																	seqFlowToBasicFlow };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Class1_1_3_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject useCase,
			EObject startEvent, EObject precond, EObject basicFlow,
			EObject startEventToPrecond, EObject seqFlow,
			EObject seqFlowToBasicFlow) {
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__seqFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__seqFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToPrecond__startEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToPrecond__precond____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlowToBasicFlow__seqFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlowToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__seqFlow____flowElements_name_prime = "flowElements";
		String useCase__precond____preconditions_name_prime = "preconditions";
		String seqFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__seqFlow____outgoing_name_prime = "outgoing";
		String startEventToPrecond__startEvent____source_name_prime = "source";
		String startEventToPrecond__precond____target_name_prime = "target";
		String seqFlowToBasicFlow__seqFlow____source_name_prime = "source";
		String seqFlowToBasicFlow__basicFlow____target_name_prime = "target";
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		ruleresult.getTranslatedEdges()
				.add(process__startEvent____flowElements);
		process__seqFlow____flowElements.setSrc(process);
		process__seqFlow____flowElements.setTrg(seqFlow);
		ruleresult.getTranslatedEdges().add(process__seqFlow____flowElements);
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		ruleresult.getCreatedEdges().add(useCase__precond____preconditions);
		seqFlow__startEvent____sourceRef.setSrc(seqFlow);
		seqFlow__startEvent____sourceRef.setTrg(startEvent);
		ruleresult.getTranslatedEdges().add(seqFlow__startEvent____sourceRef);
		startEvent__seqFlow____outgoing.setSrc(startEvent);
		startEvent__seqFlow____outgoing.setTrg(seqFlow);
		ruleresult.getTranslatedEdges().add(startEvent__seqFlow____outgoing);
		startEventToPrecond__startEvent____source.setSrc(startEventToPrecond);
		startEventToPrecond__startEvent____source.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(
				startEventToPrecond__startEvent____source);
		startEventToPrecond__precond____target.setSrc(startEventToPrecond);
		startEventToPrecond__precond____target.setTrg(precond);
		ruleresult.getCreatedEdges()
				.add(startEventToPrecond__precond____target);
		seqFlowToBasicFlow__seqFlow____source.setSrc(seqFlowToBasicFlow);
		seqFlowToBasicFlow__seqFlow____source.setTrg(seqFlow);
		ruleresult.getCreatedEdges().add(seqFlowToBasicFlow__seqFlow____source);
		seqFlowToBasicFlow__basicFlow____target.setSrc(seqFlowToBasicFlow);
		seqFlowToBasicFlow__basicFlow____target.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				seqFlowToBasicFlow__basicFlow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__seqFlow____flowElements
				.setName(process__seqFlow____flowElements_name_prime);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		seqFlow__startEvent____sourceRef
				.setName(seqFlow__startEvent____sourceRef_name_prime);
		startEvent__seqFlow____outgoing
				.setName(startEvent__seqFlow____outgoing_name_prime);
		startEventToPrecond__startEvent____source
				.setName(startEventToPrecond__startEvent____source_name_prime);
		startEventToPrecond__precond____target
				.setName(startEventToPrecond__precond____target_name_prime);
		seqFlowToBasicFlow__seqFlow____source
				.setName(seqFlowToBasicFlow__seqFlow____source_name_prime);
		seqFlowToBasicFlow__basicFlow____target
				.setName(seqFlowToBasicFlow__basicFlow____target_name_prime);
		return new Object[] { ruleresult, process, useCase, startEvent,
				precond, basicFlow, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow, process__startEvent____flowElements,
				process__seqFlow____flowElements,
				useCase__precond____preconditions,
				seqFlow__startEvent____sourceRef,
				startEvent__seqFlow____outgoing,
				startEventToPrecond__startEvent____source,
				startEventToPrecond__precond____target,
				seqFlowToBasicFlow__seqFlow____source,
				seqFlowToBasicFlow__basicFlow____target };
	}

	public static final void pattern_Class1_1_5_expressionBBBBBBBBBBBB(
			Class1 _this, PerformRuleResult ruleresult, EObject process,
			EObject useCase, EObject processToUseCase, EObject startEvent,
			EObject precond, EObject basicFlow, EObject processToBasicFlow,
			EObject startEventToPrecond, EObject seqFlow,
			EObject seqFlowToBasicFlow) {
		_this.registerObjects_FWD(ruleresult, process, useCase,
				processToUseCase, startEvent, precond, basicFlow,
				processToBasicFlow, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);

	}

	public static final PerformRuleResult pattern_Class1_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_2_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_blackFBB(EClass eClass,
			Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_2_1_binding = pattern_Class1_2_1_bindingFB(_this);
		if (result_pattern_Class1_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_2_1_binding[0];

			Object[] result_pattern_Class1_2_1_black = pattern_Class1_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Class1_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_2_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("startEvent");
		EObject _localVariable_2 = match.getObject("seqFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpStartEvent = _localVariable_1;
		EObject tmpSeqFlow = _localVariable_2;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpStartEvent instanceof StartEvent) {
				StartEvent startEvent = (StartEvent) tmpStartEvent;
				if (tmpSeqFlow instanceof SequenceFlow) {
					SequenceFlow seqFlow = (SequenceFlow) tmpSeqFlow;
					return new Object[] { process, startEvent, seqFlow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_2_2_blackBFFBFFBB(
			bpmn2.Process process, StartEvent startEvent, SequenceFlow seqFlow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(process, ProcessToUseCase.class,
						"source")) {
			UseCase useCase = processToUseCase.getTarget();
			if (useCase != null) {
				for (ProcessToBasicFlow processToBasicFlow : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(process,
								ProcessToBasicFlow.class, "source")) {
					BasicFlow basicFlow = processToBasicFlow.getTarget();
					if (basicFlow != null) {
						_result.add(new Object[] { process, useCase,
								processToUseCase, startEvent, basicFlow,
								processToBasicFlow, seqFlow, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_2_3_blackBBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			SequenceFlow seqFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(startEvent)) {
			if (process.getFlowElements().contains(seqFlow)) {
				if (useCase.getFlows().contains(basicFlow)) {
					if (process.equals(processToUseCase.getSource())) {
						if (useCase.equals(processToUseCase.getTarget())) {
							if (startEvent.equals(seqFlow.getSourceRef())) {
								if (process.equals(processToBasicFlow
										.getSource())) {
									if (basicFlow.equals(processToBasicFlow
											.getTarget())) {
										_result.add(new Object[] { process,
												useCase, processToUseCase,
												startEvent, basicFlow,
												processToBasicFlow, seqFlow });
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

	public static final Object[] pattern_Class1_2_3_greenBBBBBBBFFFFFFFFFF(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			SequenceFlow seqFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__seqFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__seqFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToBasicFlow__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__seqFlow____flowElements_name_prime = "flowElements";
		String useCase__basicFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String seqFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__seqFlow____outgoing_name_prime = "outgoing";
		String processToBasicFlow__process____source_name_prime = "source";
		String processToBasicFlow__basicFlow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(startEvent);
		isApplicableMatch.getAllContextElements().add(basicFlow);
		isApplicableMatch.getAllContextElements().add(processToBasicFlow);
		isApplicableMatch.getAllContextElements().add(seqFlow);
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		isApplicableMatch.getAllContextElements().add(
				process__startEvent____flowElements);
		process__seqFlow____flowElements.setSrc(process);
		process__seqFlow____flowElements.setTrg(seqFlow);
		isApplicableMatch.getAllContextElements().add(
				process__seqFlow____flowElements);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__basicFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		seqFlow__startEvent____sourceRef.setSrc(seqFlow);
		seqFlow__startEvent____sourceRef.setTrg(startEvent);
		isApplicableMatch.getAllContextElements().add(
				seqFlow__startEvent____sourceRef);
		startEvent__seqFlow____outgoing.setSrc(startEvent);
		startEvent__seqFlow____outgoing.setTrg(seqFlow);
		isApplicableMatch.getAllContextElements().add(
				startEvent__seqFlow____outgoing);
		processToBasicFlow__process____source.setSrc(processToBasicFlow);
		processToBasicFlow__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToBasicFlow__process____source);
		processToBasicFlow__basicFlow____target.setSrc(processToBasicFlow);
		processToBasicFlow__basicFlow____target.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				processToBasicFlow__basicFlow____target);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__seqFlow____flowElements
				.setName(process__seqFlow____flowElements_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		seqFlow__startEvent____sourceRef
				.setName(seqFlow__startEvent____sourceRef_name_prime);
		startEvent__seqFlow____outgoing
				.setName(startEvent__seqFlow____outgoing_name_prime);
		processToBasicFlow__process____source
				.setName(processToBasicFlow__process____source_name_prime);
		processToBasicFlow__basicFlow____target
				.setName(processToBasicFlow__basicFlow____target_name_prime);
		return new Object[] { process, useCase, processToUseCase, startEvent,
				basicFlow, processToBasicFlow, seqFlow, isApplicableMatch,
				process__startEvent____flowElements,
				process__seqFlow____flowElements, useCase__basicFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target,
				seqFlow__startEvent____sourceRef,
				startEvent__seqFlow____outgoing,
				processToBasicFlow__process____source,
				processToBasicFlow__basicFlow____target };
	}

	public static final Object[] pattern_Class1_2_4_bindingFBBBBBBBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			SequenceFlow seqFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, useCase, processToUseCase,
				startEvent, basicFlow, processToBasicFlow, seqFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					useCase, processToUseCase, startEvent, basicFlow,
					processToBasicFlow, seqFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_2_4_bindingAndBlackFBBBBBBBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			SequenceFlow seqFlow) {
		Object[] result_pattern_Class1_2_4_binding = pattern_Class1_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, processToUseCase,
				startEvent, basicFlow, processToBasicFlow, seqFlow);
		if (result_pattern_Class1_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_2_4_binding[0];

			Object[] result_pattern_Class1_2_4_black = pattern_Class1_2_4_blackB(csp);
			if (result_pattern_Class1_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						useCase, processToUseCase, startEvent, basicFlow,
						processToBasicFlow, seqFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_2_5_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_10_1_blackBBBBB(Class1 _this,
			Match match, UseCase useCase, UCCondition precond,
			BasicFlow basicFlow) {
		return new Object[] { _this, match, useCase, precond, basicFlow };
	}

	public static final Object[] pattern_Class1_10_2_bindingFBBBBB(
			Class1 _this, Match match, UseCase useCase, UCCondition precond,
			BasicFlow basicFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase,
				precond, basicFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, precond,
					basicFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_10_2_bindingAndBlackFBBBBB(
			Class1 _this, Match match, UseCase useCase, UCCondition precond,
			BasicFlow basicFlow) {
		Object[] result_pattern_Class1_10_2_binding = pattern_Class1_10_2_bindingFBBBBB(
				_this, match, useCase, precond, basicFlow);
		if (result_pattern_Class1_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_10_2_binding[0];

			Object[] result_pattern_Class1_10_2_black = pattern_Class1_10_2_blackB(csp);
			if (result_pattern_Class1_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, precond,
						basicFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_10_3_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_10_4_blackBBBB(Match match,
			UseCase useCase, UCCondition precond, BasicFlow basicFlow) {
		return new Object[] { match, useCase, precond, basicFlow };
	}

	public static final Object[] pattern_Class1_10_4_greenBBBF(Match match,
			UseCase useCase, UCCondition precond) {
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(precond);
		String useCase__precond____preconditions_name_prime = "preconditions";
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		match.getToBeTranslatedEdges().add(useCase__precond____preconditions);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		return new Object[] { match, useCase, precond,
				useCase__precond____preconditions };
	}

	public static final Object[] pattern_Class1_10_5_blackBBBB(Match match,
			UseCase useCase, UCCondition precond, BasicFlow basicFlow) {
		return new Object[] { match, useCase, precond, basicFlow };
	}

	public static final Object[] pattern_Class1_10_5_greenBBBF(Match match,
			UseCase useCase, BasicFlow basicFlow) {
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(basicFlow);
		String useCase__basicFlow____flows_name_prime = "flows";
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		match.getContextEdges().add(useCase__basicFlow____flows);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		return new Object[] { match, useCase, basicFlow,
				useCase__basicFlow____flows };
	}

	public static final void pattern_Class1_10_6_expressionBBBBB(Class1 _this,
			Match match, UseCase useCase, UCCondition precond,
			BasicFlow basicFlow) {
		_this.registerObjectsToMatch_BWD(match, useCase, precond, basicFlow);

	}

	public static final boolean pattern_Class1_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("precond");
		EObject _localVariable_4 = isApplicableMatch.getObject("basicFlow");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("processToBasicFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpProcessToUseCase = _localVariable_2;
		EObject tmpPrecond = _localVariable_3;
		EObject tmpBasicFlow = _localVariable_4;
		EObject tmpProcessToBasicFlow = _localVariable_5;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpProcessToUseCase instanceof ProcessToUseCase) {
					ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
					if (tmpPrecond instanceof UCCondition) {
						UCCondition precond = (UCCondition) tmpPrecond;
						if (tmpBasicFlow instanceof BasicFlow) {
							BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
							if (tmpProcessToBasicFlow instanceof ProcessToBasicFlow) {
								ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) tmpProcessToBasicFlow;
								return new Object[] { process, useCase,
										processToUseCase, precond, basicFlow,
										processToBasicFlow, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_blackBBBBBBFBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition precond,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow,
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, useCase, processToUseCase,
						precond, basicFlow, processToBasicFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_bindingAndBlackFFFFFFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_11_1_binding = pattern_Class1_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_Class1_11_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_Class1_11_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_Class1_11_1_binding[1];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_Class1_11_1_binding[2];
			UCCondition precond = (UCCondition) result_pattern_Class1_11_1_binding[3];
			BasicFlow basicFlow = (BasicFlow) result_pattern_Class1_11_1_binding[4];
			ProcessToBasicFlow processToBasicFlow = (ProcessToBasicFlow) result_pattern_Class1_11_1_binding[5];

			Object[] result_pattern_Class1_11_1_black = pattern_Class1_11_1_blackBBBBBBFBB(
					process, useCase, processToUseCase, precond, basicFlow,
					processToBasicFlow, _this, isApplicableMatch);
			if (result_pattern_Class1_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_11_1_black[6];

				return new Object[] { process, useCase, processToUseCase,
						precond, basicFlow, processToBasicFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_greenBFBBFFFB(
			bpmn2.Process process, UCCondition precond, BasicFlow basicFlow,
			CSP csp) {
		StartEvent startEvent = Bpmn2Factory.eINSTANCE.createStartEvent();
		StartEventToUCCondition startEventToPrecond = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createStartEventToUCCondition();
		SequenceFlow seqFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow seqFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("startEvent", "name");
		process.getFlowElements().add(startEvent);
		startEventToPrecond.setSource(startEvent);
		startEventToPrecond.setTarget(precond);
		process.getFlowElements().add(seqFlow);
		seqFlow.setSourceRef(startEvent);
		seqFlowToBasicFlow.setSource(seqFlow);
		seqFlowToBasicFlow.setTarget(basicFlow);
		String startEvent_name_prime = (String) _localVariable_0;
		startEvent.setName(startEvent_name_prime);
		return new Object[] { process, startEvent, precond, basicFlow,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow, csp };
	}

	public static final Object[] pattern_Class1_11_2_blackBBBBB(
			StartEvent startEvent, UCCondition precond,
			StartEventToUCCondition startEventToPrecond, SequenceFlow seqFlow,
			SequenceFlowToUCFlow seqFlowToBasicFlow) {
		return new Object[] { startEvent, precond, startEventToPrecond,
				seqFlow, seqFlowToBasicFlow };
	}

	public static final Object[] pattern_Class1_11_2_greenFBBBBB(
			StartEvent startEvent, UCCondition precond,
			StartEventToUCCondition startEventToPrecond, SequenceFlow seqFlow,
			SequenceFlowToUCFlow seqFlowToBasicFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(startEvent);
		ruleresult.getTranslatedElements().add(precond);
		ruleresult.getCreatedLinkElements().add(startEventToPrecond);
		ruleresult.getCreatedElements().add(seqFlow);
		ruleresult.getCreatedLinkElements().add(seqFlowToBasicFlow);
		return new Object[] { ruleresult, startEvent, precond,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow };
	}

	public static final Object[] pattern_Class1_11_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject precond,
			EObject basicFlow, EObject processToBasicFlow,
			EObject startEventToPrecond, EObject seqFlow,
			EObject seqFlowToBasicFlow) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!process.equals(startEvent)) {
					if (!process.equals(processToBasicFlow)) {
						if (!process.equals(startEventToPrecond)) {
							if (!process.equals(seqFlow)) {
								if (!process.equals(seqFlowToBasicFlow)) {
									if (!processToUseCase.equals(useCase)) {
										if (!processToUseCase
												.equals(startEvent)) {
											if (!processToUseCase
													.equals(startEventToPrecond)) {
												if (!processToUseCase
														.equals(seqFlow)) {
													if (!processToUseCase
															.equals(seqFlowToBasicFlow)) {
														if (!startEvent
																.equals(useCase)) {
															if (!startEvent
																	.equals(startEventToPrecond)) {
																if (!precond
																		.equals(process)) {
																	if (!precond
																			.equals(useCase)) {
																		if (!precond
																				.equals(processToUseCase)) {
																			if (!precond
																					.equals(startEvent)) {
																				if (!precond
																						.equals(processToBasicFlow)) {
																					if (!precond
																							.equals(startEventToPrecond)) {
																						if (!precond
																								.equals(seqFlow)) {
																							if (!precond
																									.equals(seqFlowToBasicFlow)) {
																								if (!basicFlow
																										.equals(process)) {
																									if (!basicFlow
																											.equals(useCase)) {
																										if (!basicFlow
																												.equals(processToUseCase)) {
																											if (!basicFlow
																													.equals(startEvent)) {
																												if (!basicFlow
																														.equals(precond)) {
																													if (!basicFlow
																															.equals(processToBasicFlow)) {
																														if (!basicFlow
																																.equals(startEventToPrecond)) {
																															if (!basicFlow
																																	.equals(seqFlow)) {
																																if (!basicFlow
																																		.equals(seqFlowToBasicFlow)) {
																																	if (!processToBasicFlow
																																			.equals(useCase)) {
																																		if (!processToBasicFlow
																																				.equals(processToUseCase)) {
																																			if (!processToBasicFlow
																																					.equals(startEvent)) {
																																				if (!processToBasicFlow
																																						.equals(startEventToPrecond)) {
																																					if (!processToBasicFlow
																																							.equals(seqFlow)) {
																																						if (!processToBasicFlow
																																								.equals(seqFlowToBasicFlow)) {
																																							if (!startEventToPrecond
																																									.equals(useCase)) {
																																								if (!seqFlow
																																										.equals(useCase)) {
																																									if (!seqFlow
																																											.equals(startEvent)) {
																																										if (!seqFlow
																																												.equals(startEventToPrecond)) {
																																											if (!seqFlow
																																													.equals(seqFlowToBasicFlow)) {
																																												if (!seqFlowToBasicFlow
																																														.equals(useCase)) {
																																													if (!seqFlowToBasicFlow
																																															.equals(startEvent)) {
																																														if (!seqFlowToBasicFlow
																																																.equals(startEventToPrecond)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	process,
																																																	useCase,
																																																	processToUseCase,
																																																	startEvent,
																																																	precond,
																																																	basicFlow,
																																																	processToBasicFlow,
																																																	startEventToPrecond,
																																																	seqFlow,
																																																	seqFlowToBasicFlow };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Class1_11_3_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject useCase,
			EObject startEvent, EObject precond, EObject basicFlow,
			EObject startEventToPrecond, EObject seqFlow,
			EObject seqFlowToBasicFlow) {
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__seqFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__seqFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToPrecond__startEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToPrecond__precond____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlowToBasicFlow__seqFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge seqFlowToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__seqFlow____flowElements_name_prime = "flowElements";
		String useCase__precond____preconditions_name_prime = "preconditions";
		String seqFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__seqFlow____outgoing_name_prime = "outgoing";
		String startEventToPrecond__startEvent____source_name_prime = "source";
		String startEventToPrecond__precond____target_name_prime = "target";
		String seqFlowToBasicFlow__seqFlow____source_name_prime = "source";
		String seqFlowToBasicFlow__basicFlow____target_name_prime = "target";
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(process__startEvent____flowElements);
		process__seqFlow____flowElements.setSrc(process);
		process__seqFlow____flowElements.setTrg(seqFlow);
		ruleresult.getCreatedEdges().add(process__seqFlow____flowElements);
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		ruleresult.getTranslatedEdges().add(useCase__precond____preconditions);
		seqFlow__startEvent____sourceRef.setSrc(seqFlow);
		seqFlow__startEvent____sourceRef.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(seqFlow__startEvent____sourceRef);
		startEvent__seqFlow____outgoing.setSrc(startEvent);
		startEvent__seqFlow____outgoing.setTrg(seqFlow);
		ruleresult.getCreatedEdges().add(startEvent__seqFlow____outgoing);
		startEventToPrecond__startEvent____source.setSrc(startEventToPrecond);
		startEventToPrecond__startEvent____source.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(
				startEventToPrecond__startEvent____source);
		startEventToPrecond__precond____target.setSrc(startEventToPrecond);
		startEventToPrecond__precond____target.setTrg(precond);
		ruleresult.getCreatedEdges()
				.add(startEventToPrecond__precond____target);
		seqFlowToBasicFlow__seqFlow____source.setSrc(seqFlowToBasicFlow);
		seqFlowToBasicFlow__seqFlow____source.setTrg(seqFlow);
		ruleresult.getCreatedEdges().add(seqFlowToBasicFlow__seqFlow____source);
		seqFlowToBasicFlow__basicFlow____target.setSrc(seqFlowToBasicFlow);
		seqFlowToBasicFlow__basicFlow____target.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				seqFlowToBasicFlow__basicFlow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__seqFlow____flowElements
				.setName(process__seqFlow____flowElements_name_prime);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		seqFlow__startEvent____sourceRef
				.setName(seqFlow__startEvent____sourceRef_name_prime);
		startEvent__seqFlow____outgoing
				.setName(startEvent__seqFlow____outgoing_name_prime);
		startEventToPrecond__startEvent____source
				.setName(startEventToPrecond__startEvent____source_name_prime);
		startEventToPrecond__precond____target
				.setName(startEventToPrecond__precond____target_name_prime);
		seqFlowToBasicFlow__seqFlow____source
				.setName(seqFlowToBasicFlow__seqFlow____source_name_prime);
		seqFlowToBasicFlow__basicFlow____target
				.setName(seqFlowToBasicFlow__basicFlow____target_name_prime);
		return new Object[] { ruleresult, process, useCase, startEvent,
				precond, basicFlow, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow, process__startEvent____flowElements,
				process__seqFlow____flowElements,
				useCase__precond____preconditions,
				seqFlow__startEvent____sourceRef,
				startEvent__seqFlow____outgoing,
				startEventToPrecond__startEvent____source,
				startEventToPrecond__precond____target,
				seqFlowToBasicFlow__seqFlow____source,
				seqFlowToBasicFlow__basicFlow____target };
	}

	public static final void pattern_Class1_11_5_expressionBBBBBBBBBBBB(
			Class1 _this, PerformRuleResult ruleresult, EObject process,
			EObject useCase, EObject processToUseCase, EObject startEvent,
			EObject precond, EObject basicFlow, EObject processToBasicFlow,
			EObject startEventToPrecond, EObject seqFlow,
			EObject seqFlowToBasicFlow) {
		_this.registerObjects_BWD(ruleresult, process, useCase,
				processToUseCase, startEvent, precond, basicFlow,
				processToBasicFlow, startEventToPrecond, seqFlow,
				seqFlowToBasicFlow);

	}

	public static final PerformRuleResult pattern_Class1_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_12_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_blackFBB(EClass eClass,
			Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_12_1_binding = pattern_Class1_12_1_bindingFB(_this);
		if (result_pattern_Class1_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_12_1_binding[0];

			Object[] result_pattern_Class1_12_1_black = pattern_Class1_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Class1_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("precond");
		EObject _localVariable_2 = match.getObject("basicFlow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpPrecond = _localVariable_1;
		EObject tmpBasicFlow = _localVariable_2;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpPrecond instanceof UCCondition) {
				UCCondition precond = (UCCondition) tmpPrecond;
				if (tmpBasicFlow instanceof BasicFlow) {
					BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
					return new Object[] { useCase, precond, basicFlow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_12_2_blackFBFBBFB(
			UseCase useCase, UCCondition precond, BasicFlow basicFlow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, ProcessToUseCase.class,
						"target")) {
			bpmn2.Process process = processToUseCase.getSource();
			if (process != null) {
				for (ProcessToBasicFlow processToBasicFlow : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(basicFlow,
								ProcessToBasicFlow.class, "target")) {
					if (process.equals(processToBasicFlow.getSource())) {
						_result.add(new Object[] { process, useCase,
								processToUseCase, precond, basicFlow,
								processToBasicFlow, match });
					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_12_3_blackBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition precond,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCase.getPreconditions().contains(precond)) {
			if (useCase.getFlows().contains(basicFlow)) {
				if (process.equals(processToUseCase.getSource())) {
					if (useCase.equals(processToUseCase.getTarget())) {
						if (process.equals(processToBasicFlow.getSource())) {
							if (basicFlow
									.equals(processToBasicFlow.getTarget())) {
								_result.add(new Object[] { process, useCase,
										processToUseCase, precond, basicFlow,
										processToBasicFlow });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Class1_12_3_greenBBBBBBFFFFFFF(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition precond,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCase__precond____preconditions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToBasicFlow__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCase__precond____preconditions_name_prime = "preconditions";
		String useCase__basicFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String processToBasicFlow__process____source_name_prime = "source";
		String processToBasicFlow__basicFlow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(precond);
		isApplicableMatch.getAllContextElements().add(basicFlow);
		isApplicableMatch.getAllContextElements().add(processToBasicFlow);
		useCase__precond____preconditions.setSrc(useCase);
		useCase__precond____preconditions.setTrg(precond);
		isApplicableMatch.getAllContextElements().add(
				useCase__precond____preconditions);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__basicFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
		processToBasicFlow__process____source.setSrc(processToBasicFlow);
		processToBasicFlow__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToBasicFlow__process____source);
		processToBasicFlow__basicFlow____target.setSrc(processToBasicFlow);
		processToBasicFlow__basicFlow____target.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				processToBasicFlow__basicFlow____target);
		useCase__precond____preconditions
				.setName(useCase__precond____preconditions_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		processToBasicFlow__process____source
				.setName(processToBasicFlow__process____source_name_prime);
		processToBasicFlow__basicFlow____target
				.setName(processToBasicFlow__basicFlow____target_name_prime);
		return new Object[] { process, useCase, processToUseCase, precond,
				basicFlow, processToBasicFlow, isApplicableMatch,
				useCase__precond____preconditions, useCase__basicFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target,
				processToBasicFlow__process____source,
				processToBasicFlow__basicFlow____target };
	}

	public static final Object[] pattern_Class1_12_4_bindingFBBBBBBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition precond,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, process, useCase, processToUseCase, precond,
				basicFlow, processToBasicFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					useCase, processToUseCase, precond, basicFlow,
					processToBasicFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_12_4_bindingAndBlackFBBBBBBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition precond,
			BasicFlow basicFlow, ProcessToBasicFlow processToBasicFlow) {
		Object[] result_pattern_Class1_12_4_binding = pattern_Class1_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, process, useCase, processToUseCase,
				precond, basicFlow, processToBasicFlow);
		if (result_pattern_Class1_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_12_4_binding[0];

			Object[] result_pattern_Class1_12_4_black = pattern_Class1_12_4_blackB(csp);
			if (result_pattern_Class1_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						useCase, processToUseCase, precond, basicFlow,
						processToBasicFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_12_5_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_20_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_20_1_binding = pattern_Class1_20_1_bindingFB(_this);
		if (result_pattern_Class1_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_20_1_binding[0];

			Object[] result_pattern_Class1_20_1_black = pattern_Class1_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_20_2_black_nac_0B(
			SequenceFlow seqFlow) {
		for (ExclusiveGateway __DEC_seqFlow_default_493203 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(seqFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { seqFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_2_black_nac_1BB(
			SequenceFlow seqFlow, StartEvent startEvent) {
		if (startEvent.equals(seqFlow.getTargetRef())) {
			return new Object[] { seqFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_20_2_blackFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpStartEvent = _edge_flowElements.getTrg();
			if (tmpStartEvent instanceof StartEvent) {
				StartEvent startEvent = (StartEvent) tmpStartEvent;
				if (process.getFlowElements().contains(startEvent)) {
					for (FlowElement tmpSeqFlow : process.getFlowElements()) {
						if (tmpSeqFlow instanceof SequenceFlow) {
							SequenceFlow seqFlow = (SequenceFlow) tmpSeqFlow;
							if (startEvent.equals(seqFlow.getSourceRef())) {
								if (pattern_Class1_20_2_black_nac_0B(seqFlow) == null) {
									if (pattern_Class1_20_2_black_nac_1BB(
											seqFlow, startEvent) == null) {
										_result.add(new Object[] { process,
												startEvent, seqFlow,
												_edge_flowElements });
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

	public static final Object[] pattern_Class1_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_20_3_expressionFBBBBB(
			Class1 _this, Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				startEvent, seqFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_20_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_21_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_21_1_binding = pattern_Class1_21_1_bindingFB(_this);
		if (result_pattern_Class1_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_21_1_binding[0];

			Object[] result_pattern_Class1_21_1_black = pattern_Class1_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_21_2_black_nac_0B(
			SequenceFlow seqFlow) {
		for (ExclusiveGateway __DEC_seqFlow_default_622567 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(seqFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { seqFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_2_black_nac_1BB(
			SequenceFlow seqFlow, StartEvent startEvent) {
		if (startEvent.equals(seqFlow.getTargetRef())) {
			return new Object[] { seqFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_21_2_blackFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpSeqFlow = _edge_flowElements.getTrg();
			if (tmpSeqFlow instanceof SequenceFlow) {
				SequenceFlow seqFlow = (SequenceFlow) tmpSeqFlow;
				if (process.getFlowElements().contains(seqFlow)) {
					FlowNode tmpStartEvent = seqFlow.getSourceRef();
					if (tmpStartEvent instanceof StartEvent) {
						StartEvent startEvent = (StartEvent) tmpStartEvent;
						if (process.getFlowElements().contains(startEvent)) {
							if (pattern_Class1_21_2_black_nac_0B(seqFlow) == null) {
								if (pattern_Class1_21_2_black_nac_1BB(seqFlow,
										startEvent) == null) {
									_result.add(new Object[] { process,
											startEvent, seqFlow,
											_edge_flowElements });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Class1_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_21_3_expressionFBBBBB(
			Class1 _this, Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				startEvent, seqFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_21_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_22_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_22_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_22_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_22_1_binding = pattern_Class1_22_1_bindingFB(_this);
		if (result_pattern_Class1_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_22_1_binding[0];

			Object[] result_pattern_Class1_22_1_black = pattern_Class1_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_22_2_black_nac_0BB(
			UCCondition precond, BasicFlow basicFlow) {
		for (Flow __DEC_precond_finalState_399543 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(precond, Flow.class, "finalState")) {
			if (!basicFlow.equals(__DEC_precond_finalState_399543)) {
				return new Object[] { precond, basicFlow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_22_2_black_nac_1BB(
			UCCondition precond, UseCase useCase) {
		for (UseCase __DEC_precond_preconditions_977855 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(precond, UseCase.class,
						"preconditions")) {
			if (!useCase.equals(__DEC_precond_preconditions_977855)) {
				return new Object[] { precond, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_22_2_black_nac_2BB(
			BasicFlow basicFlow, UCCondition precond) {
		if (precond.equals(basicFlow.getFinalState())) {
			return new Object[] { basicFlow, precond };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_22_2_blackFFFB(
			EMoflonEdge _edge_preconditions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_preconditions.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpPrecond = _edge_preconditions.getTrg();
			if (tmpPrecond instanceof UCCondition) {
				UCCondition precond = (UCCondition) tmpPrecond;
				if (useCase.getPreconditions().contains(precond)) {
					if (pattern_Class1_22_2_black_nac_1BB(precond, useCase) == null) {
						for (Flow tmpBasicFlow : useCase.getFlows()) {
							if (tmpBasicFlow instanceof BasicFlow) {
								BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
								if (pattern_Class1_22_2_black_nac_0BB(precond,
										basicFlow) == null) {
									if (pattern_Class1_22_2_black_nac_2BB(
											basicFlow, precond) == null) {
										_result.add(new Object[] { useCase,
												precond, basicFlow,
												_edge_preconditions });
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

	public static final Object[] pattern_Class1_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_22_3_expressionFBBBBB(
			Class1 _this, Match match, UseCase useCase, UCCondition precond,
			BasicFlow basicFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				precond, basicFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_22_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_23_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_23_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_23_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_23_1_binding = pattern_Class1_23_1_bindingFB(_this);
		if (result_pattern_Class1_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_23_1_binding[0];

			Object[] result_pattern_Class1_23_1_black = pattern_Class1_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_23_2_black_nac_0B(
			SequenceFlow seqFlow) {
		for (ExclusiveGateway __DEC_seqFlow_default_642927 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(seqFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { seqFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_23_2_black_nac_1BB(
			SequenceFlow seqFlow, StartEvent startEvent) {
		if (startEvent.equals(seqFlow.getTargetRef())) {
			return new Object[] { seqFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_23_2_blackFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSeqFlow = _edge_sourceRef.getSrc();
		if (tmpSeqFlow instanceof SequenceFlow) {
			SequenceFlow seqFlow = (SequenceFlow) tmpSeqFlow;
			EObject tmpStartEvent = _edge_sourceRef.getTrg();
			if (tmpStartEvent instanceof StartEvent) {
				StartEvent startEvent = (StartEvent) tmpStartEvent;
				if (startEvent.equals(seqFlow.getSourceRef())) {
					if (pattern_Class1_23_2_black_nac_0B(seqFlow) == null) {
						if (pattern_Class1_23_2_black_nac_1BB(seqFlow,
								startEvent) == null) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(seqFlow,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getFlowElements().contains(
											startEvent)) {
										_result.add(new Object[] { process,
												startEvent, seqFlow,
												_edge_sourceRef });
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

	public static final Object[] pattern_Class1_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_23_3_expressionFBBBBB(
			Class1 _this, Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				startEvent, seqFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_23_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_24_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_24_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_24_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_24_1_binding = pattern_Class1_24_1_bindingFB(_this);
		if (result_pattern_Class1_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_24_1_binding[0];

			Object[] result_pattern_Class1_24_1_black = pattern_Class1_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_24_2_black_nac_0B(
			SequenceFlow seqFlow) {
		for (ExclusiveGateway __DEC_seqFlow_default_560624 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(seqFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { seqFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_24_2_black_nac_1BB(
			SequenceFlow seqFlow, StartEvent startEvent) {
		if (startEvent.equals(seqFlow.getTargetRef())) {
			return new Object[] { seqFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_24_2_blackFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStartEvent = _edge_outgoing.getSrc();
		if (tmpStartEvent instanceof StartEvent) {
			StartEvent startEvent = (StartEvent) tmpStartEvent;
			EObject tmpSeqFlow = _edge_outgoing.getTrg();
			if (tmpSeqFlow instanceof SequenceFlow) {
				SequenceFlow seqFlow = (SequenceFlow) tmpSeqFlow;
				if (startEvent.equals(seqFlow.getSourceRef())) {
					if (pattern_Class1_24_2_black_nac_0B(seqFlow) == null) {
						if (pattern_Class1_24_2_black_nac_1BB(seqFlow,
								startEvent) == null) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(startEvent,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getFlowElements().contains(
											seqFlow)) {
										_result.add(new Object[] { process,
												startEvent, seqFlow,
												_edge_outgoing });
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

	public static final Object[] pattern_Class1_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_24_3_expressionFBBBBB(
			Class1 _this, Match match, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow seqFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				startEvent, seqFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_24_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_27_1_blackB(Class1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Class1_27_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Class1_27_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_Class1_27_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Object[] pattern_Class1_27_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_Class1_27_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow basicFlow) {
		if (ruleResult.getTargetObjects().contains(basicFlow)) {
			return new Object[] { ruleResult, basicFlow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_27_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToBasicFlow processToBasicFlow) {
		if (ruleResult.getCorrObjects().contains(processToBasicFlow)) {
			return new Object[] { ruleResult, processToBasicFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_27_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList processToUseCaseList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpProcessToUseCase : processToUseCaseList
					.getEntryObjects()) {
				if (tmpProcessToUseCase instanceof ProcessToUseCase) {
					ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
					bpmn2.Process process = processToUseCase.getSource();
					if (process != null) {
						UseCase useCase = processToUseCase.getTarget();
						if (useCase != null) {
							if (pattern_Class1_27_2_black_nac_1BB(ruleResult,
									processToUseCase) == null) {
								if (pattern_Class1_27_2_black_nac_0BB(
										ruleResult, process) == null) {
									if (pattern_Class1_27_2_black_nac_2BB(
											ruleResult, useCase) == null) {
										for (Flow tmpBasicFlow : useCase
												.getFlows()) {
											if (tmpBasicFlow instanceof BasicFlow) {
												BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
												if (pattern_Class1_27_2_black_nac_3BB(
														ruleResult, basicFlow) == null) {
													for (ProcessToBasicFlow processToBasicFlow : org.moflon.util.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	process,
																	ProcessToBasicFlow.class,
																	"source")) {
														if (basicFlow
																.equals(processToBasicFlow
																		.getTarget())) {
															if (pattern_Class1_27_2_black_nac_4BB(
																	ruleResult,
																	processToBasicFlow) == null) {
																_result.add(new Object[] {
																		processToUseCaseList,
																		process,
																		processToUseCase,
																		useCase,
																		basicFlow,
																		processToBasicFlow,
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
		return _result;
	}

	public static final Object[] pattern_Class1_27_3_bindingFBBBBBBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, BasicFlow basicFlow,
			ProcessToBasicFlow processToBasicFlow,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, useCase, processToUseCase,
				basicFlow, processToBasicFlow, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					useCase, processToUseCase, basicFlow, processToBasicFlow,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Class1_27_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_27_3_bindingAndBlackFBBBBBBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, BasicFlow basicFlow,
			ProcessToBasicFlow processToBasicFlow,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Class1_27_3_binding = pattern_Class1_27_3_bindingFBBBBBBBB(
				_this, isApplicableMatch, process, useCase, processToUseCase,
				basicFlow, processToBasicFlow, ruleResult);
		if (result_pattern_Class1_27_3_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_27_3_binding[0];

			Object[] result_pattern_Class1_27_3_black = pattern_Class1_27_3_blackB(csp);
			if (result_pattern_Class1_27_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						useCase, processToUseCase, basicFlow,
						processToBasicFlow, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_27_4_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_27_5_blackBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, BasicFlow basicFlow,
			ProcessToBasicFlow processToBasicFlow) {
		return new Object[] { process, useCase, processToUseCase, basicFlow,
				processToBasicFlow };
	}

	public static final Object[] pattern_Class1_27_6_blackBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, BasicFlow basicFlow,
			ProcessToBasicFlow processToBasicFlow,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, useCase, processToUseCase, basicFlow,
				processToBasicFlow, ruleResult };
	}

	public static final Object[] pattern_Class1_27_6_greenBBFFBFFFBB(
			bpmn2.Process process, UseCase useCase, BasicFlow basicFlow,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		StartEvent startEvent = Bpmn2Factory.eINSTANCE.createStartEvent();
		UCCondition precond = UseCaseDSLFactory.eINSTANCE.createUCCondition();
		StartEventToUCCondition startEventToPrecond = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createStartEventToUCCondition();
		SequenceFlow seqFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow seqFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("startEvent", "name");
		Object _localVariable_1 = csp.getValue("precond", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(startEvent);
		ruleResult.getSourceObjects().add(startEvent);
		useCase.getPreconditions().add(precond);
		ruleResult.getTargetObjects().add(precond);
		startEventToPrecond.setSource(startEvent);
		startEventToPrecond.setTarget(precond);
		ruleResult.getCorrObjects().add(startEventToPrecond);
		process.getFlowElements().add(seqFlow);
		seqFlow.setSourceRef(startEvent);
		ruleResult.getSourceObjects().add(seqFlow);
		seqFlowToBasicFlow.setSource(seqFlow);
		seqFlowToBasicFlow.setTarget(basicFlow);
		ruleResult.getCorrObjects().add(seqFlowToBasicFlow);
		String startEvent_name_prime = (String) _localVariable_0;
		String precond_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		startEvent.setName(startEvent_name_prime);
		precond.setName(precond_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, useCase, startEvent, precond, basicFlow,
				startEventToPrecond, seqFlow, seqFlowToBasicFlow, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_Class1_27_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Class1Impl
