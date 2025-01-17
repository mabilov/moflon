/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

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

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
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
 * An implementation of the model object '<em><b>Process To Use Case Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcessToUseCaseRuleImpl extends AbstractRuleImpl implements
		ProcessToUseCaseRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessToUseCaseRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getProcessToUseCaseRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		// initial bindings
		Object[] result1_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_0_1_blackBBBBBB(this, match,
						definitions, process, startEvent, sequenceFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_0_2_bindingAndBlackFBBBBBB(this,
						match, definitions, process, startEvent, sequenceFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_0_4_blackBBBBB(match,
							definitions, process, startEvent, sequenceFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_0_4_greenBBBBBFFFFF(match,
							definitions, process, startEvent, sequenceFlow);
			// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge sequenceFlow__startEvent____sourceRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge startEvent__sequenceFlow____outgoing = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_0_5_blackBBBBB(match,
							definitions, process, startEvent, sequenceFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ProcessToUseCaseRuleImpl.pattern_ProcessToUseCaseRule_0_5_greenBB(
					match, definitions);

			// register objects to match
			ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_0_6_expressionBBBBBB(this,
							match, definitions, process, startEvent,
							sequenceFlow);
			return ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_0_7_expressionF();
		} else {
			return ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Definitions definitions = (Definitions) result1_bindingAndBlack[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[1];
		DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result1_bindingAndBlack[2];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[3];
		StartEvent startEvent = (StartEvent) result1_bindingAndBlack[4];
		SequenceFlow sequenceFlow = (SequenceFlow) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_1_greenBBFFBFFBFFFB(
						packageDeclaration, process, startEvent, sequenceFlow,
						csp);
		UseCase useCase = (UseCase) result1_green[2];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_green[3];
		BasicFlow basicFlow = (BasicFlow) result1_green[5];
		StartEventToBasicFlow startEventToBasicFlow = (StartEventToBasicFlow) result1_green[6];
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = (SequenceFlowToUCFlow) result1_green[8];
		Actor actor = (Actor) result1_green[9];
		ProcessToActor processToActor = (ProcessToActor) result1_green[10];

		// collect translated elements
		Object[] result2_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_2_blackBBBBBBBBBB(process,
						useCase, processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_2_greenFBBBBBBBBBB(process,
						useCase, processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_3_blackBBBBBBBBBBBBBB(
						ruleresult, definitions, packageDeclaration,
						definitionsToPackage, process, useCase,
						processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, definitions, packageDeclaration, process,
						useCase, processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result3_green[13];
		// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[14];
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result3_green[17];
		// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[18];
		// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge sequenceFlow__startEvent____sourceRef = (EMoflonEdge) result3_green[21];
		// EMoflonEdge startEvent__sequenceFlow____outgoing = (EMoflonEdge) result3_green[22];
		// EMoflonEdge startEventToBasicFlow__startEvent____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge startEventToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[24];
		// EMoflonEdge sequenceFlowToBasicFlow__sequenceFlow____source = (EMoflonEdge) result3_green[25];
		// EMoflonEdge sequenceFlowToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[26];
		// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[27];
		// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[28];

		// perform postprocessing story node is empty
		// register objects
		ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_5_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, definitions, packageDeclaration,
						definitionsToPackage, process, useCase,
						processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Definitions definitions = (Definitions) result2_binding[0];
		bpmn2.Process process = (bpmn2.Process) result2_binding[1];
		StartEvent startEvent = (StartEvent) result2_binding[2];
		SequenceFlow sequenceFlow = (SequenceFlow) result2_binding[3];
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_2_2_blackBFFBBBB(definitions,
						process, startEvent, sequenceFlow, match)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_2_3_blackBBBBBB(definitions,
							packageDeclaration, definitionsToPackage, process,
							startEvent, sequenceFlow)) {
				Object[] result3_green = ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_2_3_greenBBBBBBFFFFFFFF(
								definitions, packageDeclaration,
								definitionsToPackage, process, startEvent,
								sequenceFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge definitionsToPackage__definitions____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge definitionsToPackage__packageDeclaration____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sequenceFlow__startEvent____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge startEvent__sequenceFlow____outgoing = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, definitions,
								packageDeclaration, definitionsToPackage,
								process, startEvent, sequenceFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			Definitions definitions, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		match.registerObject("definitions", definitions);
		match.registerObject("process", process);
		match.registerObject("startEvent", startEvent);
		match.registerObject("sequenceFlow", sequenceFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {// Create CSP
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
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("sys");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("SYSTEM");
		literal1.setType("");

		// Create attribute variables
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.id", true, csp);
		var_process_id.setValue(process.getId());
		var_process_id.setType("String");
		Variable var_process_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.name", true, csp);
		var_process_name.setValue(process.getName());
		var_process_name.setType("String");
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", true, csp);
		var_startEvent_name.setValue(startEvent.getName());
		var_startEvent_name.setType("String");

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("String");
		Variable var_useCase_description = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.description", csp);
		var_useCase_description.setType("String");
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", csp);
		var_useCase_preConditions.setType("String");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);
		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_process_id, var_useCase_name);
		eq_0.setRuleName("");
		eq_0.solve(var_process_name, var_useCase_description);
		eq_1.setRuleName("");
		eq_1.solve(var_startEvent_name, var_useCase_preConditions);
		eq_2.setRuleName("");
		eq_2.solve(var_actor_name, literal0);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("startEvent", startEvent);
		isApplicableMatch.registerObject("sequenceFlow", sequenceFlow);
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
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("startEvent", startEvent);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("startEventToBasicFlow",
				startEventToBasicFlow);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("sequenceFlowToBasicFlow",
				sequenceFlowToBasicFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("process").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getProcess())
				&& match.getObject("startEvent").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getStartEvent())
				&& match.getObject("sequenceFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		// initial bindings
		Object[] result1_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_10_1_blackBBBBBB(this, match,
						packageDeclaration, useCase, basicFlow, actor);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_10_2_bindingAndBlackFBBBBBB(this,
						match, packageDeclaration, useCase, basicFlow, actor);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_10_4_blackBBBBB(match,
							packageDeclaration, useCase, basicFlow, actor);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_10_4_greenBBBBBFFF(match,
							packageDeclaration, useCase, basicFlow, actor);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result4_green[5];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result4_green[6];
			// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_10_5_blackBBBBB(match,
							packageDeclaration, useCase, basicFlow, actor);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ProcessToUseCaseRuleImpl.pattern_ProcessToUseCaseRule_10_5_greenBB(
					match, packageDeclaration);

			// register objects to match
			ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_10_6_expressionBBBBBB(this,
							match, packageDeclaration, useCase, basicFlow,
							actor);
			return ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_10_7_expressionF();
		} else {
			return ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Definitions definitions = (Definitions) result1_bindingAndBlack[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[1];
		DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		BasicFlow basicFlow = (BasicFlow) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_1_greenBFBFFBFFFBFB(
						definitions, useCase, basicFlow, actor, csp);
		bpmn2.Process process = (bpmn2.Process) result1_green[1];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_green[3];
		StartEvent startEvent = (StartEvent) result1_green[4];
		StartEventToBasicFlow startEventToBasicFlow = (StartEventToBasicFlow) result1_green[6];
		SequenceFlow sequenceFlow = (SequenceFlow) result1_green[7];
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = (SequenceFlowToUCFlow) result1_green[8];
		ProcessToActor processToActor = (ProcessToActor) result1_green[10];

		// collect translated elements
		Object[] result2_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_2_blackBBBBBBBBBB(process,
						useCase, processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_2_greenFBBBBBBBBBB(process,
						useCase, processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_3_blackBBBBBBBBBBBBBB(
						ruleresult, definitions, packageDeclaration,
						definitionsToPackage, process, useCase,
						processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, definitions, packageDeclaration, process,
						useCase, processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		// EMoflonEdge definitions__process____rootElements = (EMoflonEdge) result3_green[13];
		// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[14];
		// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__startEvent____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge process__sequenceFlow____flowElements = (EMoflonEdge) result3_green[17];
		// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[18];
		// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge sequenceFlow__startEvent____sourceRef = (EMoflonEdge) result3_green[21];
		// EMoflonEdge startEvent__sequenceFlow____outgoing = (EMoflonEdge) result3_green[22];
		// EMoflonEdge startEventToBasicFlow__startEvent____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge startEventToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[24];
		// EMoflonEdge sequenceFlowToBasicFlow__sequenceFlow____source = (EMoflonEdge) result3_green[25];
		// EMoflonEdge sequenceFlowToBasicFlow__basicFlow____target = (EMoflonEdge) result3_green[26];
		// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[27];
		// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[28];

		// perform postprocessing story node is empty
		// register objects
		ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_5_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, definitions, packageDeclaration,
						definitionsToPackage, process, useCase,
						processToUseCase, startEvent, basicFlow,
						startEventToBasicFlow, sequenceFlow,
						sequenceFlowToBasicFlow, actor, processToActor);
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		BasicFlow basicFlow = (BasicFlow) result2_binding[2];
		Actor actor = (Actor) result2_binding[3];
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_12_2_blackFBFBBBB(
						packageDeclaration, useCase, basicFlow, actor, match)) {
			Definitions definitions = (Definitions) result2_black[0];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_12_3_blackBBBBBB(definitions,
							packageDeclaration, definitionsToPackage, useCase,
							basicFlow, actor)) {
				Object[] result3_green = ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_12_3_greenBBBBBBFFFFFF(
								definitions, packageDeclaration,
								definitionsToPackage, useCase, basicFlow, actor);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[7];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[8];
				// EMoflonEdge definitionsToPackage__definitions____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge definitionsToPackage__packageDeclaration____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__basicFlow____flows = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_12_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, definitions,
								packageDeclaration, definitionsToPackage,
								useCase, basicFlow, actor);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);
		match.registerObject("basicFlow", basicFlow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("sys");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("SYSTEM");
		literal1.setType("");

		// Create attribute variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_actor_name, literal0);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal1);
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
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("String");
		Variable var_useCase_description = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.description", true, csp);
		var_useCase_description.setValue(useCase.getDescription());
		var_useCase_description.setType("String");
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", true, csp);
		var_useCase_preConditions.setValue(useCase.getPreConditions());
		var_useCase_preConditions.setType("String");

		// Create unbound variables
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.id", csp);
		var_process_id.setType("String");
		Variable var_process_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.name", csp);
		var_process_name.setType("String");
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", csp);
		var_startEvent_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_process_id, var_useCase_name);
		eq_0.setRuleName("");
		eq_0.solve(var_process_name, var_useCase_description);
		eq_1.setRuleName("");
		eq_1.solve(var_startEvent_name, var_useCase_preConditions);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
		isApplicableMatch.registerObject("actor", actor);
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
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("startEvent", startEvent);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("startEventToBasicFlow",
				startEventToBasicFlow);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("sequenceFlowToBasicFlow",
				sequenceFlowToBasicFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("useCase")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getUseCase())
				&& match.getObject("basicFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getBasicFlow())
				&& match.getObject("actor")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getActor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_rootElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_20_2_blackFFFFB(_edge_rootElements)) {
			Definitions definitions = (Definitions) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			StartEvent startEvent = (StartEvent) result2_black[2];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_20_3_expressionFBBBBBB(this,
							match, definitions, process, startEvent,
							sequenceFlow)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(
			EMoflonEdge _edge_useCases) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_21_2_blackFFFFB(_edge_useCases)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			BasicFlow basicFlow = (BasicFlow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_21_3_expressionFBBBBBB(this,
							match, packageDeclaration, useCase, basicFlow,
							actor)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(
			EMoflonEdge _edge_actors) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_22_2_blackFFFFB(_edge_actors)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			BasicFlow basicFlow = (BasicFlow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_22_3_expressionFBBBBBB(this,
							match, packageDeclaration, useCase, basicFlow,
							actor)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_23_2_blackFFFFB(_edge_flowElements)) {
			Definitions definitions = (Definitions) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			StartEvent startEvent = (StartEvent) result2_black[2];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_23_3_expressionFBBBBBB(this,
							match, definitions, process, startEvent,
							sequenceFlow)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_24_2_blackFFFFB(_edge_flowElements)) {
			Definitions definitions = (Definitions) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			StartEvent startEvent = (StartEvent) result2_black[2];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_24_3_expressionFBBBBBB(this,
							match, definitions, process, startEvent,
							sequenceFlow)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_24_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_24_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_25_2_blackFFFFB(_edge_flows)) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			BasicFlow basicFlow = (BasicFlow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_25_3_expressionFBBBBBB(this,
							match, packageDeclaration, useCase, basicFlow,
							actor)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_25_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_25_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_26_2_blackFFFFB(_edge_sourceRef)) {
			Definitions definitions = (Definitions) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			StartEvent startEvent = (StartEvent) result2_black[2];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_26_3_expressionFBBBBBB(this,
							match, definitions, process, startEvent,
							sequenceFlow)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_26_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_26_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_26_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_27_2_blackFFFFB(_edge_outgoing)) {
			Definitions definitions = (Definitions) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			StartEvent startEvent = (StartEvent) result2_black[2];
			SequenceFlow sequenceFlow = (SequenceFlow) result2_black[3];
			Object[] result2_green = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_27_3_expressionFBBBBBB(this,
							match, definitions, process, startEvent,
							sequenceFlow)) {
				// Ensure that the correct types of elements are matched
				if (ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_27_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_27_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_27_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_27_6_expressionFB(__result);
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
			DefinitionsToPackage definitionsToPackageParameter) {
		// create result
		Object[] result1_black = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_30_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_30_2_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList definitionsToPackageList = (RuleEntryList) result2_black[0];
			Definitions definitions = (Definitions) result2_black[1];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_30_3_bindingAndBlackFBBBBBB(
							this, isApplicableMatch, definitions,
							packageDeclaration, definitionsToPackage,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ProcessToUseCaseRuleImpl
					.pattern_ProcessToUseCaseRule_30_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ProcessToUseCaseRuleImpl
						.pattern_ProcessToUseCaseRule_30_5_blackBBB(
								definitions, packageDeclaration,
								definitionsToPackage);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_30_6_blackBBBB(
									definitions, packageDeclaration,
									definitionsToPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ProcessToUseCaseRuleImpl
							.pattern_ProcessToUseCaseRule_30_6_greenBBFFFFFFFFFFBB(
									definitions, packageDeclaration,
									ruleResult, csp);
					// bpmn2.Process process = (bpmn2.Process) result6_green[2];
					// UseCase useCase = (UseCase) result6_green[3];
					// ProcessToUseCase processToUseCase = (ProcessToUseCase) result6_green[4];
					// StartEvent startEvent = (StartEvent) result6_green[5];
					// BasicFlow basicFlow = (BasicFlow) result6_green[6];
					// StartEventToBasicFlow startEventToBasicFlow = (StartEventToBasicFlow) result6_green[7];
					// SequenceFlow sequenceFlow = (SequenceFlow) result6_green[8];
					// SequenceFlowToUCFlow sequenceFlowToBasicFlow = (SequenceFlowToUCFlow) result6_green[9];
					// Actor actor = (Actor) result6_green[10];
					// ProcessToActor processToActor = (ProcessToActor) result6_green[11];

				} else {
				}

			} else {
			}

		}
		return ProcessToUseCaseRuleImpl
				.pattern_ProcessToUseCaseRule_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("sys");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("SYSTEM");
		literal1.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.id", csp);
		var_process_id.setType("String");
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("String");
		Variable var_process_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.name", csp);
		var_process_name.setType("String");
		Variable var_useCase_description = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.description", csp);
		var_useCase_description.setType("String");
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", csp);
		var_startEvent_name.setType("String");
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", csp);
		var_useCase_preConditions.setType("String");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("String");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create constraints
		Eq eq = new Eq();
		EqActorType eqActorType = new EqActorType();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_actor_name, literal0);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal1);
		eq_0.setRuleName("");
		eq_0.solve(var_process_id, var_useCase_name);
		eq_1.setRuleName("");
		eq_1.solve(var_process_name, var_useCase_description);
		eq_2.setRuleName("");
		eq_2.solve(var_startEvent_name, var_useCase_preConditions);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
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
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(StartEvent) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(StartEvent) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(StartEvent) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(DefinitionsToPackage) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(StartEvent) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(Actor) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(Actor) arguments.get(4));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(Actor) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_USECASE_BASICFLOW_ACTOR:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(DefinitionsToPackage) arguments.get(3),
					(UseCase) arguments.get(4), (BasicFlow) arguments.get(5),
					(Actor) arguments.get(6));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DEFINITIONSTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(DefinitionsToPackage) arguments.get(1));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(DefinitionsToPackage) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_1_blackBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		return new Object[] { _this, match, definitions, process, startEvent,
				sequenceFlow };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_2_bindingFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				definitions, process, startEvent, sequenceFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, definitions, process,
					startEvent, sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_2_bindingAndBlackFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		Object[] result_pattern_ProcessToUseCaseRule_0_2_binding = pattern_ProcessToUseCaseRule_0_2_bindingFBBBBBB(
				_this, match, definitions, process, startEvent, sequenceFlow);
		if (result_pattern_ProcessToUseCaseRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_0_2_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_0_2_black = pattern_ProcessToUseCaseRule_0_2_blackB(csp);
			if (result_pattern_ProcessToUseCaseRule_0_2_black != null) {

				return new Object[] { csp, _this, match, definitions, process,
						startEvent, sequenceFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_ProcessToUseCaseRule_0_3_expressionFBB(
			ProcessToUseCaseRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_4_blackBBBBB(
			Match match, Definitions definitions, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		return new Object[] { match, definitions, process, startEvent,
				sequenceFlow };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_4_greenBBBBBFFFFF(
			Match match, Definitions definitions, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(process);
		match.getToBeTranslatedNodes().add(startEvent);
		match.getToBeTranslatedNodes().add(sequenceFlow);
		String definitions__process____rootElements_name_prime = "rootElements";
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String sequenceFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__sequenceFlow____outgoing_name_prime = "outgoing";
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		match.getToBeTranslatedEdges()
				.add(definitions__process____rootElements);
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		match.getToBeTranslatedEdges().add(process__startEvent____flowElements);
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		match.getToBeTranslatedEdges().add(
				process__sequenceFlow____flowElements);
		sequenceFlow__startEvent____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__startEvent____sourceRef.setTrg(startEvent);
		match.getToBeTranslatedEdges().add(
				sequenceFlow__startEvent____sourceRef);
		startEvent__sequenceFlow____outgoing.setSrc(startEvent);
		startEvent__sequenceFlow____outgoing.setTrg(sequenceFlow);
		match.getToBeTranslatedEdges()
				.add(startEvent__sequenceFlow____outgoing);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		sequenceFlow__startEvent____sourceRef
				.setName(sequenceFlow__startEvent____sourceRef_name_prime);
		startEvent__sequenceFlow____outgoing
				.setName(startEvent__sequenceFlow____outgoing_name_prime);
		return new Object[] { match, definitions, process, startEvent,
				sequenceFlow, definitions__process____rootElements,
				process__startEvent____flowElements,
				process__sequenceFlow____flowElements,
				sequenceFlow__startEvent____sourceRef,
				startEvent__sequenceFlow____outgoing };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_5_blackBBBBB(
			Match match, Definitions definitions, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		return new Object[] { match, definitions, process, startEvent,
				sequenceFlow };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_0_5_greenBB(
			Match match, Definitions definitions) {
		match.getContextNodes().add(definitions);
		return new Object[] { match, definitions };
	}

	public static final void pattern_ProcessToUseCaseRule_0_6_expressionBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		_this.registerObjectsToMatch_FWD(match, definitions, process,
				startEvent, sequenceFlow);

	}

	public static final boolean pattern_ProcessToUseCaseRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("definitions");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("definitionsToPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("startEvent");
		EObject _localVariable_5 = isApplicableMatch.getObject("sequenceFlow");
		EObject tmpDefinitions = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		EObject tmpDefinitionsToPackage = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpStartEvent = _localVariable_4;
		EObject tmpSequenceFlow = _localVariable_5;
		if (tmpDefinitions instanceof Definitions) {
			Definitions definitions = (Definitions) tmpDefinitions;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (tmpDefinitionsToPackage instanceof DefinitionsToPackage) {
					DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) tmpDefinitionsToPackage;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpStartEvent instanceof StartEvent) {
							StartEvent startEvent = (StartEvent) tmpStartEvent;
							if (tmpSequenceFlow instanceof SequenceFlow) {
								SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
								return new Object[] { definitions,
										packageDeclaration,
										definitionsToPackage, process,
										startEvent, sequenceFlow,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_1_blackBBBBBBFBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow,
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { definitions, packageDeclaration,
						definitionsToPackage, process, startEvent,
						sequenceFlow, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_1_bindingAndBlackFFFFFFFBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ProcessToUseCaseRule_1_1_binding = pattern_ProcessToUseCaseRule_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ProcessToUseCaseRule_1_1_binding != null) {
			Definitions definitions = (Definitions) result_pattern_ProcessToUseCaseRule_1_1_binding[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_ProcessToUseCaseRule_1_1_binding[1];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result_pattern_ProcessToUseCaseRule_1_1_binding[2];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ProcessToUseCaseRule_1_1_binding[3];
			StartEvent startEvent = (StartEvent) result_pattern_ProcessToUseCaseRule_1_1_binding[4];
			SequenceFlow sequenceFlow = (SequenceFlow) result_pattern_ProcessToUseCaseRule_1_1_binding[5];

			Object[] result_pattern_ProcessToUseCaseRule_1_1_black = pattern_ProcessToUseCaseRule_1_1_blackBBBBBBFBB(
					definitions, packageDeclaration, definitionsToPackage,
					process, startEvent, sequenceFlow, _this, isApplicableMatch);
			if (result_pattern_ProcessToUseCaseRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_1_1_black[6];

				return new Object[] { definitions, packageDeclaration,
						definitionsToPackage, process, startEvent,
						sequenceFlow, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_1_greenBBFFBFFBFFFB(
			PackageDeclaration packageDeclaration, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow, CSP csp) {
		UseCase useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();
		ProcessToUseCase processToUseCase = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createProcessToUseCase();
		BasicFlow basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();
		StartEventToBasicFlow startEventToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createStartEventToBasicFlow();
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		ProcessToActor processToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createProcessToActor();
		Object _localVariable_0 = csp.getValue("useCase", "name");
		Object _localVariable_1 = csp.getValue("useCase", "description");
		Object _localVariable_2 = csp.getValue("useCase", "preConditions");
		Object _localVariable_3 = csp.getValue("actor", "name");
		Object _localVariable_4 = csp.getValue("actor", "type");
		packageDeclaration.getUseCases().add(useCase);
		processToUseCase.setSource(process);
		processToUseCase.setTarget(useCase);
		useCase.getFlows().add(basicFlow);
		startEventToBasicFlow.setSource(startEvent);
		startEventToBasicFlow.setTarget(basicFlow);
		sequenceFlowToBasicFlow.setSource(sequenceFlow);
		sequenceFlowToBasicFlow.setTarget(basicFlow);
		packageDeclaration.getActors().add(actor);
		processToActor.setSource(process);
		processToActor.setTarget(actor);
		String useCase_name_prime = (String) _localVariable_0;
		String useCase_description_prime = (String) _localVariable_1;
		String useCase_preConditions_prime = (String) _localVariable_2;
		String actor_name_prime = (String) _localVariable_3;
		ActorType actor_type_prime = (ActorType) _localVariable_4;
		useCase.setName(useCase_name_prime);
		useCase.setDescription(useCase_description_prime);
		useCase.setPreConditions(useCase_preConditions_prime);
		actor.setName(actor_name_prime);
		actor.setType(actor_type_prime);
		return new Object[] { packageDeclaration, process, useCase,
				processToUseCase, startEvent, basicFlow, startEventToBasicFlow,
				sequenceFlow, sequenceFlowToBasicFlow, actor, processToActor,
				csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_2_blackBBBBBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, StartEventToBasicFlow startEventToBasicFlow,
			SequenceFlow sequenceFlow,
			SequenceFlowToUCFlow sequenceFlowToBasicFlow, Actor actor,
			ProcessToActor processToActor) {
		return new Object[] { process, useCase, processToUseCase, startEvent,
				basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_2_greenFBBBBBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, StartEventToBasicFlow startEventToBasicFlow,
			SequenceFlow sequenceFlow,
			SequenceFlowToUCFlow sequenceFlowToBasicFlow, Actor actor,
			ProcessToActor processToActor) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(process);
		ruleresult.getCreatedElements().add(useCase);
		ruleresult.getCreatedLinkElements().add(processToUseCase);
		ruleresult.getTranslatedElements().add(startEvent);
		ruleresult.getCreatedElements().add(basicFlow);
		ruleresult.getCreatedLinkElements().add(startEventToBasicFlow);
		ruleresult.getTranslatedElements().add(sequenceFlow);
		ruleresult.getCreatedLinkElements().add(sequenceFlowToBasicFlow);
		ruleresult.getCreatedElements().add(actor);
		ruleresult.getCreatedLinkElements().add(processToActor);
		return new Object[] { ruleresult, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_1_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject process, EObject useCase, EObject processToUseCase,
			EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		if (!definitions.equals(packageDeclaration)) {
			if (!definitions.equals(definitionsToPackage)) {
				if (!definitions.equals(process)) {
					if (!definitions.equals(useCase)) {
						if (!definitions.equals(processToUseCase)) {
							if (!definitions.equals(startEvent)) {
								if (!definitions.equals(startEventToBasicFlow)) {
									if (!definitions.equals(sequenceFlow)) {
										if (!definitions
												.equals(sequenceFlowToBasicFlow)) {
											if (!definitions
													.equals(processToActor)) {
												if (!packageDeclaration
														.equals(process)) {
													if (!packageDeclaration
															.equals(useCase)) {
														if (!packageDeclaration
																.equals(processToUseCase)) {
															if (!packageDeclaration
																	.equals(startEvent)) {
																if (!packageDeclaration
																		.equals(startEventToBasicFlow)) {
																	if (!packageDeclaration
																			.equals(sequenceFlow)) {
																		if (!packageDeclaration
																				.equals(sequenceFlowToBasicFlow)) {
																			if (!packageDeclaration
																					.equals(processToActor)) {
																				if (!definitionsToPackage
																						.equals(packageDeclaration)) {
																					if (!definitionsToPackage
																							.equals(process)) {
																						if (!definitionsToPackage
																								.equals(useCase)) {
																							if (!definitionsToPackage
																									.equals(processToUseCase)) {
																								if (!definitionsToPackage
																										.equals(startEvent)) {
																									if (!definitionsToPackage
																											.equals(startEventToBasicFlow)) {
																										if (!definitionsToPackage
																												.equals(sequenceFlow)) {
																											if (!definitionsToPackage
																													.equals(sequenceFlowToBasicFlow)) {
																												if (!definitionsToPackage
																														.equals(processToActor)) {
																													if (!process
																															.equals(useCase)) {
																														if (!process
																																.equals(processToUseCase)) {
																															if (!process
																																	.equals(startEvent)) {
																																if (!process
																																		.equals(startEventToBasicFlow)) {
																																	if (!process
																																			.equals(sequenceFlow)) {
																																		if (!process
																																				.equals(sequenceFlowToBasicFlow)) {
																																			if (!process
																																					.equals(processToActor)) {
																																				if (!processToUseCase
																																						.equals(useCase)) {
																																					if (!processToUseCase
																																							.equals(startEvent)) {
																																						if (!processToUseCase
																																								.equals(startEventToBasicFlow)) {
																																							if (!processToUseCase
																																									.equals(sequenceFlow)) {
																																								if (!processToUseCase
																																										.equals(sequenceFlowToBasicFlow)) {
																																									if (!startEvent
																																											.equals(useCase)) {
																																										if (!startEvent
																																												.equals(startEventToBasicFlow)) {
																																											if (!basicFlow
																																													.equals(definitions)) {
																																												if (!basicFlow
																																														.equals(packageDeclaration)) {
																																													if (!basicFlow
																																															.equals(definitionsToPackage)) {
																																														if (!basicFlow
																																																.equals(process)) {
																																															if (!basicFlow
																																																	.equals(useCase)) {
																																																if (!basicFlow
																																																		.equals(processToUseCase)) {
																																																	if (!basicFlow
																																																			.equals(startEvent)) {
																																																		if (!basicFlow
																																																				.equals(startEventToBasicFlow)) {
																																																			if (!basicFlow
																																																					.equals(sequenceFlow)) {
																																																				if (!basicFlow
																																																						.equals(sequenceFlowToBasicFlow)) {
																																																					if (!basicFlow
																																																							.equals(processToActor)) {
																																																						if (!startEventToBasicFlow
																																																								.equals(useCase)) {
																																																							if (!sequenceFlow
																																																									.equals(useCase)) {
																																																								if (!sequenceFlow
																																																										.equals(startEvent)) {
																																																									if (!sequenceFlow
																																																											.equals(startEventToBasicFlow)) {
																																																										if (!sequenceFlow
																																																												.equals(sequenceFlowToBasicFlow)) {
																																																											if (!sequenceFlowToBasicFlow
																																																													.equals(useCase)) {
																																																												if (!sequenceFlowToBasicFlow
																																																														.equals(startEvent)) {
																																																													if (!sequenceFlowToBasicFlow
																																																															.equals(startEventToBasicFlow)) {
																																																														if (!actor
																																																																.equals(definitions)) {
																																																															if (!actor
																																																																	.equals(packageDeclaration)) {
																																																																if (!actor
																																																																		.equals(definitionsToPackage)) {
																																																																	if (!actor
																																																																			.equals(process)) {
																																																																		if (!actor
																																																																				.equals(useCase)) {
																																																																			if (!actor
																																																																					.equals(processToUseCase)) {
																																																																				if (!actor
																																																																						.equals(startEvent)) {
																																																																					if (!actor
																																																																							.equals(basicFlow)) {
																																																																						if (!actor
																																																																								.equals(startEventToBasicFlow)) {
																																																																							if (!actor
																																																																									.equals(sequenceFlow)) {
																																																																								if (!actor
																																																																										.equals(sequenceFlowToBasicFlow)) {
																																																																									if (!actor
																																																																											.equals(processToActor)) {
																																																																										if (!processToActor
																																																																												.equals(useCase)) {
																																																																											if (!processToActor
																																																																													.equals(processToUseCase)) {
																																																																												if (!processToActor
																																																																														.equals(startEvent)) {
																																																																													if (!processToActor
																																																																															.equals(startEventToBasicFlow)) {
																																																																														if (!processToActor
																																																																																.equals(sequenceFlow)) {
																																																																															if (!processToActor
																																																																																	.equals(sequenceFlowToBasicFlow)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		definitions,
																																																																																		packageDeclaration,
																																																																																		definitionsToPackage,
																																																																																		process,
																																																																																		useCase,
																																																																																		processToUseCase,
																																																																																		startEvent,
																																																																																		basicFlow,
																																																																																		startEventToBasicFlow,
																																																																																		sequenceFlow,
																																																																																		sequenceFlowToBasicFlow,
																																																																																		actor,
																																																																																		processToActor };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ProcessToUseCaseRule_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToBasicFlow__startEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToBasicFlow__sequenceFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ProcessToUseCaseRule";
		String definitions__process____rootElements_name_prime = "rootElements";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String useCase__basicFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String sequenceFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__sequenceFlow____outgoing_name_prime = "outgoing";
		String startEventToBasicFlow__startEvent____source_name_prime = "source";
		String startEventToBasicFlow__basicFlow____target_name_prime = "target";
		String sequenceFlowToBasicFlow__sequenceFlow____source_name_prime = "source";
		String sequenceFlowToBasicFlow__basicFlow____target_name_prime = "target";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		ruleresult.getTranslatedEdges().add(
				definitions__process____rootElements);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		ruleresult.getCreatedEdges().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getCreatedEdges().add(packageDeclaration__actor____actors);
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		ruleresult.getTranslatedEdges()
				.add(process__startEvent____flowElements);
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		ruleresult.getTranslatedEdges().add(
				process__sequenceFlow____flowElements);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(useCase__basicFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		ruleresult.getCreatedEdges().add(processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		ruleresult.getCreatedEdges().add(processToUseCase__useCase____target);
		sequenceFlow__startEvent____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__startEvent____sourceRef.setTrg(startEvent);
		ruleresult.getTranslatedEdges().add(
				sequenceFlow__startEvent____sourceRef);
		startEvent__sequenceFlow____outgoing.setSrc(startEvent);
		startEvent__sequenceFlow____outgoing.setTrg(sequenceFlow);
		ruleresult.getTranslatedEdges().add(
				startEvent__sequenceFlow____outgoing);
		startEventToBasicFlow__startEvent____source
				.setSrc(startEventToBasicFlow);
		startEventToBasicFlow__startEvent____source.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(
				startEventToBasicFlow__startEvent____source);
		startEventToBasicFlow__basicFlow____target
				.setSrc(startEventToBasicFlow);
		startEventToBasicFlow__basicFlow____target.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				startEventToBasicFlow__basicFlow____target);
		sequenceFlowToBasicFlow__sequenceFlow____source
				.setSrc(sequenceFlowToBasicFlow);
		sequenceFlowToBasicFlow__sequenceFlow____source.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToBasicFlow__sequenceFlow____source);
		sequenceFlowToBasicFlow__basicFlow____target
				.setSrc(sequenceFlowToBasicFlow);
		sequenceFlowToBasicFlow__basicFlow____target.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToBasicFlow__basicFlow____target);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		ruleresult.getCreatedEdges().add(processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		ruleresult.getCreatedEdges().add(processToActor__actor____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		sequenceFlow__startEvent____sourceRef
				.setName(sequenceFlow__startEvent____sourceRef_name_prime);
		startEvent__sequenceFlow____outgoing
				.setName(startEvent__sequenceFlow____outgoing_name_prime);
		startEventToBasicFlow__startEvent____source
				.setName(startEventToBasicFlow__startEvent____source_name_prime);
		startEventToBasicFlow__basicFlow____target
				.setName(startEventToBasicFlow__basicFlow____target_name_prime);
		sequenceFlowToBasicFlow__sequenceFlow____source
				.setName(sequenceFlowToBasicFlow__sequenceFlow____source_name_prime);
		sequenceFlowToBasicFlow__basicFlow____target
				.setName(sequenceFlowToBasicFlow__basicFlow____target_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		return new Object[] { ruleresult, definitions, packageDeclaration,
				process, useCase, processToUseCase, startEvent, basicFlow,
				startEventToBasicFlow, sequenceFlow, sequenceFlowToBasicFlow,
				actor, processToActor, definitions__process____rootElements,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				process__startEvent____flowElements,
				process__sequenceFlow____flowElements,
				useCase__basicFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target,
				sequenceFlow__startEvent____sourceRef,
				startEvent__sequenceFlow____outgoing,
				startEventToBasicFlow__startEvent____source,
				startEventToBasicFlow__basicFlow____target,
				sequenceFlowToBasicFlow__sequenceFlow____source,
				sequenceFlowToBasicFlow__basicFlow____target,
				processToActor__process____source,
				processToActor__actor____target };
	}

	public static final void pattern_ProcessToUseCaseRule_1_5_expressionBBBBBBBBBBBBBBB(
			ProcessToUseCaseRule _this, PerformRuleResult ruleresult,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		_this.registerObjects_FWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor);

	}

	public static final PerformRuleResult pattern_ProcessToUseCaseRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_1_blackFBB(
			EClass eClass, ProcessToUseCaseRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_2_1_binding = pattern_ProcessToUseCaseRule_2_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ProcessToUseCaseRule_2_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_2_1_black = pattern_ProcessToUseCaseRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ProcessToUseCaseRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("definitions");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("startEvent");
		EObject _localVariable_3 = match.getObject("sequenceFlow");
		EObject tmpDefinitions = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpStartEvent = _localVariable_2;
		EObject tmpSequenceFlow = _localVariable_3;
		if (tmpDefinitions instanceof Definitions) {
			Definitions definitions = (Definitions) tmpDefinitions;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpStartEvent instanceof StartEvent) {
					StartEvent startEvent = (StartEvent) tmpStartEvent;
					if (tmpSequenceFlow instanceof SequenceFlow) {
						SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
						return new Object[] { definitions, process, startEvent,
								sequenceFlow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_2_2_blackBFFBBBB(
			Definitions definitions, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DefinitionsToPackage definitionsToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(definitions,
						DefinitionsToPackage.class, "source")) {
			PackageDeclaration packageDeclaration = definitionsToPackage
					.getTarget();
			if (packageDeclaration != null) {
				_result.add(new Object[] { definitions, packageDeclaration,
						definitionsToPackage, process, startEvent,
						sequenceFlow, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_2_3_blackBBBBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (definitions.getRootElements().contains(process)) {
			if (definitions.equals(definitionsToPackage.getSource())) {
				if (packageDeclaration.equals(definitionsToPackage.getTarget())) {
					if (process.getFlowElements().contains(startEvent)) {
						if (process.getFlowElements().contains(sequenceFlow)) {
							if (startEvent.equals(sequenceFlow.getSourceRef())) {
								_result.add(new Object[] { definitions,
										packageDeclaration,
										definitionsToPackage, process,
										startEvent, sequenceFlow });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_3_greenBBBBBBFFFFFFFF(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__definitions____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__packageDeclaration____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String definitions__process____rootElements_name_prime = "rootElements";
		String definitionsToPackage__definitions____source_name_prime = "source";
		String definitionsToPackage__packageDeclaration____target_name_prime = "target";
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String sequenceFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__sequenceFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(definitions);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(definitionsToPackage);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(startEvent);
		isApplicableMatch.getAllContextElements().add(sequenceFlow);
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				definitions__process____rootElements);
		definitionsToPackage__definitions____source
				.setSrc(definitionsToPackage);
		definitionsToPackage__definitions____source.setTrg(definitions);
		isApplicableMatch.getAllContextElements().add(
				definitionsToPackage__definitions____source);
		definitionsToPackage__packageDeclaration____target
				.setSrc(definitionsToPackage);
		definitionsToPackage__packageDeclaration____target
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				definitionsToPackage__packageDeclaration____target);
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		isApplicableMatch.getAllContextElements().add(
				process__startEvent____flowElements);
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		isApplicableMatch.getAllContextElements().add(
				process__sequenceFlow____flowElements);
		sequenceFlow__startEvent____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__startEvent____sourceRef.setTrg(startEvent);
		isApplicableMatch.getAllContextElements().add(
				sequenceFlow__startEvent____sourceRef);
		startEvent__sequenceFlow____outgoing.setSrc(startEvent);
		startEvent__sequenceFlow____outgoing.setTrg(sequenceFlow);
		isApplicableMatch.getAllContextElements().add(
				startEvent__sequenceFlow____outgoing);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		definitionsToPackage__definitions____source
				.setName(definitionsToPackage__definitions____source_name_prime);
		definitionsToPackage__packageDeclaration____target
				.setName(definitionsToPackage__packageDeclaration____target_name_prime);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		sequenceFlow__startEvent____sourceRef
				.setName(sequenceFlow__startEvent____sourceRef_name_prime);
		startEvent__sequenceFlow____outgoing
				.setName(startEvent__sequenceFlow____outgoing_name_prime);
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage, process, startEvent, sequenceFlow,
				isApplicableMatch, definitions__process____rootElements,
				definitionsToPackage__definitions____source,
				definitionsToPackage__packageDeclaration____target,
				process__startEvent____flowElements,
				process__sequenceFlow____flowElements,
				sequenceFlow__startEvent____sourceRef,
				startEvent__sequenceFlow____outgoing };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_4_bindingFBBBBBBBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, definitions, packageDeclaration,
				definitionsToPackage, process, startEvent, sequenceFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, definitions,
					packageDeclaration, definitionsToPackage, process,
					startEvent, sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_4_bindingAndBlackFBBBBBBBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		Object[] result_pattern_ProcessToUseCaseRule_2_4_binding = pattern_ProcessToUseCaseRule_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, definitions, packageDeclaration,
				definitionsToPackage, process, startEvent, sequenceFlow);
		if (result_pattern_ProcessToUseCaseRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_2_4_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_2_4_black = pattern_ProcessToUseCaseRule_2_4_blackB(csp);
			if (result_pattern_ProcessToUseCaseRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						definitions, packageDeclaration, definitionsToPackage,
						process, startEvent, sequenceFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_ProcessToUseCaseRule_2_5_expressionFBB(
			ProcessToUseCaseRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ProcessToUseCaseRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ProcessToUseCaseRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_1_blackBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		return new Object[] { _this, match, packageDeclaration, useCase,
				basicFlow, actor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_2_bindingFBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				packageDeclaration, useCase, basicFlow, actor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, packageDeclaration,
					useCase, basicFlow, actor };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_2_bindingAndBlackFBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		Object[] result_pattern_ProcessToUseCaseRule_10_2_binding = pattern_ProcessToUseCaseRule_10_2_bindingFBBBBBB(
				_this, match, packageDeclaration, useCase, basicFlow, actor);
		if (result_pattern_ProcessToUseCaseRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_10_2_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_10_2_black = pattern_ProcessToUseCaseRule_10_2_blackB(csp);
			if (result_pattern_ProcessToUseCaseRule_10_2_black != null) {

				return new Object[] { csp, _this, match, packageDeclaration,
						useCase, basicFlow, actor };
			}
		}
		return null;
	}

	public static final boolean pattern_ProcessToUseCaseRule_10_3_expressionFBB(
			ProcessToUseCaseRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_4_blackBBBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, BasicFlow basicFlow, Actor actor) {
		return new Object[] { match, packageDeclaration, useCase, basicFlow,
				actor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_4_greenBBBBBFFF(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, BasicFlow basicFlow, Actor actor) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(useCase);
		match.getToBeTranslatedNodes().add(basicFlow);
		match.getToBeTranslatedNodes().add(actor);
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
		return new Object[] { match, packageDeclaration, useCase, basicFlow,
				actor, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				useCase__basicFlow____flows };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_5_blackBBBBB(
			Match match, PackageDeclaration packageDeclaration,
			UseCase useCase, BasicFlow basicFlow, Actor actor) {
		return new Object[] { match, packageDeclaration, useCase, basicFlow,
				actor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_10_5_greenBB(
			Match match, PackageDeclaration packageDeclaration) {
		match.getContextNodes().add(packageDeclaration);
		return new Object[] { match, packageDeclaration };
	}

	public static final void pattern_ProcessToUseCaseRule_10_6_expressionBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		_this.registerObjectsToMatch_BWD(match, packageDeclaration, useCase,
				basicFlow, actor);

	}

	public static final boolean pattern_ProcessToUseCaseRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("definitions");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("definitionsToPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch.getObject("basicFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject tmpDefinitions = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		EObject tmpDefinitionsToPackage = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpBasicFlow = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		if (tmpDefinitions instanceof Definitions) {
			Definitions definitions = (Definitions) tmpDefinitions;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (tmpDefinitionsToPackage instanceof DefinitionsToPackage) {
					DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) tmpDefinitionsToPackage;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpBasicFlow instanceof BasicFlow) {
							BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								return new Object[] { definitions,
										packageDeclaration,
										definitionsToPackage, useCase,
										basicFlow, actor, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_1_blackBBBBBBFBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor, ProcessToUseCaseRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { definitions, packageDeclaration,
						definitionsToPackage, useCase, basicFlow, actor, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_1_bindingAndBlackFFFFFFFBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ProcessToUseCaseRule_11_1_binding = pattern_ProcessToUseCaseRule_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ProcessToUseCaseRule_11_1_binding != null) {
			Definitions definitions = (Definitions) result_pattern_ProcessToUseCaseRule_11_1_binding[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_ProcessToUseCaseRule_11_1_binding[1];
			DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) result_pattern_ProcessToUseCaseRule_11_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_ProcessToUseCaseRule_11_1_binding[3];
			BasicFlow basicFlow = (BasicFlow) result_pattern_ProcessToUseCaseRule_11_1_binding[4];
			Actor actor = (Actor) result_pattern_ProcessToUseCaseRule_11_1_binding[5];

			Object[] result_pattern_ProcessToUseCaseRule_11_1_black = pattern_ProcessToUseCaseRule_11_1_blackBBBBBBFBB(
					definitions, packageDeclaration, definitionsToPackage,
					useCase, basicFlow, actor, _this, isApplicableMatch);
			if (result_pattern_ProcessToUseCaseRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_11_1_black[6];

				return new Object[] { definitions, packageDeclaration,
						definitionsToPackage, useCase, basicFlow, actor, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_1_greenBFBFFBFFFBFB(
			Definitions definitions, UseCase useCase, BasicFlow basicFlow,
			Actor actor, CSP csp) {
		bpmn2.Process process = Bpmn2Factory.eINSTANCE.createProcess();
		ProcessToUseCase processToUseCase = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createProcessToUseCase();
		StartEvent startEvent = Bpmn2Factory.eINSTANCE.createStartEvent();
		StartEventToBasicFlow startEventToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createStartEventToBasicFlow();
		SequenceFlow sequenceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		ProcessToActor processToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createProcessToActor();
		Object _localVariable_0 = csp.getValue("process", "id");
		Object _localVariable_1 = csp.getValue("process", "name");
		Object _localVariable_2 = csp.getValue("startEvent", "name");
		definitions.getRootElements().add(process);
		processToUseCase.setSource(process);
		processToUseCase.setTarget(useCase);
		process.getFlowElements().add(startEvent);
		startEventToBasicFlow.setSource(startEvent);
		startEventToBasicFlow.setTarget(basicFlow);
		process.getFlowElements().add(sequenceFlow);
		sequenceFlow.setSourceRef(startEvent);
		sequenceFlowToBasicFlow.setSource(sequenceFlow);
		sequenceFlowToBasicFlow.setTarget(basicFlow);
		processToActor.setSource(process);
		processToActor.setTarget(actor);
		String process_id_prime = (String) _localVariable_0;
		String process_name_prime = (String) _localVariable_1;
		String startEvent_name_prime = (String) _localVariable_2;
		process.setId(process_id_prime);
		process.setName(process_name_prime);
		startEvent.setName(startEvent_name_prime);
		return new Object[] { definitions, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor, csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_2_blackBBBBBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, StartEventToBasicFlow startEventToBasicFlow,
			SequenceFlow sequenceFlow,
			SequenceFlowToUCFlow sequenceFlowToBasicFlow, Actor actor,
			ProcessToActor processToActor) {
		return new Object[] { process, useCase, processToUseCase, startEvent,
				basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_2_greenFBBBBBBBBBB(
			bpmn2.Process process, UseCase useCase,
			ProcessToUseCase processToUseCase, StartEvent startEvent,
			BasicFlow basicFlow, StartEventToBasicFlow startEventToBasicFlow,
			SequenceFlow sequenceFlow,
			SequenceFlowToUCFlow sequenceFlowToBasicFlow, Actor actor,
			ProcessToActor processToActor) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(process);
		ruleresult.getTranslatedElements().add(useCase);
		ruleresult.getCreatedLinkElements().add(processToUseCase);
		ruleresult.getCreatedElements().add(startEvent);
		ruleresult.getTranslatedElements().add(basicFlow);
		ruleresult.getCreatedLinkElements().add(startEventToBasicFlow);
		ruleresult.getCreatedElements().add(sequenceFlow);
		ruleresult.getCreatedLinkElements().add(sequenceFlowToBasicFlow);
		ruleresult.getTranslatedElements().add(actor);
		ruleresult.getCreatedLinkElements().add(processToActor);
		return new Object[] { ruleresult, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_11_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject definitionsToPackage,
			EObject process, EObject useCase, EObject processToUseCase,
			EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		if (!definitions.equals(packageDeclaration)) {
			if (!definitions.equals(definitionsToPackage)) {
				if (!definitions.equals(process)) {
					if (!definitions.equals(useCase)) {
						if (!definitions.equals(processToUseCase)) {
							if (!definitions.equals(startEvent)) {
								if (!definitions.equals(startEventToBasicFlow)) {
									if (!definitions.equals(sequenceFlow)) {
										if (!definitions
												.equals(sequenceFlowToBasicFlow)) {
											if (!definitions
													.equals(processToActor)) {
												if (!packageDeclaration
														.equals(process)) {
													if (!packageDeclaration
															.equals(useCase)) {
														if (!packageDeclaration
																.equals(processToUseCase)) {
															if (!packageDeclaration
																	.equals(startEvent)) {
																if (!packageDeclaration
																		.equals(startEventToBasicFlow)) {
																	if (!packageDeclaration
																			.equals(sequenceFlow)) {
																		if (!packageDeclaration
																				.equals(sequenceFlowToBasicFlow)) {
																			if (!packageDeclaration
																					.equals(processToActor)) {
																				if (!definitionsToPackage
																						.equals(packageDeclaration)) {
																					if (!definitionsToPackage
																							.equals(process)) {
																						if (!definitionsToPackage
																								.equals(useCase)) {
																							if (!definitionsToPackage
																									.equals(processToUseCase)) {
																								if (!definitionsToPackage
																										.equals(startEvent)) {
																									if (!definitionsToPackage
																											.equals(startEventToBasicFlow)) {
																										if (!definitionsToPackage
																												.equals(sequenceFlow)) {
																											if (!definitionsToPackage
																													.equals(sequenceFlowToBasicFlow)) {
																												if (!definitionsToPackage
																														.equals(processToActor)) {
																													if (!process
																															.equals(useCase)) {
																														if (!process
																																.equals(processToUseCase)) {
																															if (!process
																																	.equals(startEvent)) {
																																if (!process
																																		.equals(startEventToBasicFlow)) {
																																	if (!process
																																			.equals(sequenceFlow)) {
																																		if (!process
																																				.equals(sequenceFlowToBasicFlow)) {
																																			if (!process
																																					.equals(processToActor)) {
																																				if (!processToUseCase
																																						.equals(useCase)) {
																																					if (!processToUseCase
																																							.equals(startEvent)) {
																																						if (!processToUseCase
																																								.equals(startEventToBasicFlow)) {
																																							if (!processToUseCase
																																									.equals(sequenceFlow)) {
																																								if (!processToUseCase
																																										.equals(sequenceFlowToBasicFlow)) {
																																									if (!startEvent
																																											.equals(useCase)) {
																																										if (!startEvent
																																												.equals(startEventToBasicFlow)) {
																																											if (!basicFlow
																																													.equals(definitions)) {
																																												if (!basicFlow
																																														.equals(packageDeclaration)) {
																																													if (!basicFlow
																																															.equals(definitionsToPackage)) {
																																														if (!basicFlow
																																																.equals(process)) {
																																															if (!basicFlow
																																																	.equals(useCase)) {
																																																if (!basicFlow
																																																		.equals(processToUseCase)) {
																																																	if (!basicFlow
																																																			.equals(startEvent)) {
																																																		if (!basicFlow
																																																				.equals(startEventToBasicFlow)) {
																																																			if (!basicFlow
																																																					.equals(sequenceFlow)) {
																																																				if (!basicFlow
																																																						.equals(sequenceFlowToBasicFlow)) {
																																																					if (!basicFlow
																																																							.equals(processToActor)) {
																																																						if (!startEventToBasicFlow
																																																								.equals(useCase)) {
																																																							if (!sequenceFlow
																																																									.equals(useCase)) {
																																																								if (!sequenceFlow
																																																										.equals(startEvent)) {
																																																									if (!sequenceFlow
																																																											.equals(startEventToBasicFlow)) {
																																																										if (!sequenceFlow
																																																												.equals(sequenceFlowToBasicFlow)) {
																																																											if (!sequenceFlowToBasicFlow
																																																													.equals(useCase)) {
																																																												if (!sequenceFlowToBasicFlow
																																																														.equals(startEvent)) {
																																																													if (!sequenceFlowToBasicFlow
																																																															.equals(startEventToBasicFlow)) {
																																																														if (!actor
																																																																.equals(definitions)) {
																																																															if (!actor
																																																																	.equals(packageDeclaration)) {
																																																																if (!actor
																																																																		.equals(definitionsToPackage)) {
																																																																	if (!actor
																																																																			.equals(process)) {
																																																																		if (!actor
																																																																				.equals(useCase)) {
																																																																			if (!actor
																																																																					.equals(processToUseCase)) {
																																																																				if (!actor
																																																																						.equals(startEvent)) {
																																																																					if (!actor
																																																																							.equals(basicFlow)) {
																																																																						if (!actor
																																																																								.equals(startEventToBasicFlow)) {
																																																																							if (!actor
																																																																									.equals(sequenceFlow)) {
																																																																								if (!actor
																																																																										.equals(sequenceFlowToBasicFlow)) {
																																																																									if (!actor
																																																																											.equals(processToActor)) {
																																																																										if (!processToActor
																																																																												.equals(useCase)) {
																																																																											if (!processToActor
																																																																													.equals(processToUseCase)) {
																																																																												if (!processToActor
																																																																														.equals(startEvent)) {
																																																																													if (!processToActor
																																																																															.equals(startEventToBasicFlow)) {
																																																																														if (!processToActor
																																																																																.equals(sequenceFlow)) {
																																																																															if (!processToActor
																																																																																	.equals(sequenceFlowToBasicFlow)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		definitions,
																																																																																		packageDeclaration,
																																																																																		definitionsToPackage,
																																																																																		process,
																																																																																		useCase,
																																																																																		processToUseCase,
																																																																																		startEvent,
																																																																																		basicFlow,
																																																																																		startEventToBasicFlow,
																																																																																		sequenceFlow,
																																																																																		sequenceFlowToBasicFlow,
																																																																																		actor,
																																																																																		processToActor };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ProcessToUseCaseRule_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject definitions,
			EObject packageDeclaration, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		EMoflonEdge definitions__process____rootElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__startEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sequenceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlow__startEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEvent__sequenceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToBasicFlow__startEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge startEventToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToBasicFlow__sequenceFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sequenceFlowToBasicFlow__basicFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ProcessToUseCaseRule";
		String definitions__process____rootElements_name_prime = "rootElements";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String process__startEvent____flowElements_name_prime = "flowElements";
		String process__sequenceFlow____flowElements_name_prime = "flowElements";
		String useCase__basicFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String sequenceFlow__startEvent____sourceRef_name_prime = "sourceRef";
		String startEvent__sequenceFlow____outgoing_name_prime = "outgoing";
		String startEventToBasicFlow__startEvent____source_name_prime = "source";
		String startEventToBasicFlow__basicFlow____target_name_prime = "target";
		String sequenceFlowToBasicFlow__sequenceFlow____source_name_prime = "source";
		String sequenceFlowToBasicFlow__basicFlow____target_name_prime = "target";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		definitions__process____rootElements.setSrc(definitions);
		definitions__process____rootElements.setTrg(process);
		ruleresult.getCreatedEdges().add(definitions__process____rootElements);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		ruleresult.getTranslatedEdges().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		ruleresult.getTranslatedEdges()
				.add(packageDeclaration__actor____actors);
		process__startEvent____flowElements.setSrc(process);
		process__startEvent____flowElements.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(process__startEvent____flowElements);
		process__sequenceFlow____flowElements.setSrc(process);
		process__sequenceFlow____flowElements.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(process__sequenceFlow____flowElements);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		ruleresult.getTranslatedEdges().add(useCase__basicFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		ruleresult.getCreatedEdges().add(processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		ruleresult.getCreatedEdges().add(processToUseCase__useCase____target);
		sequenceFlow__startEvent____sourceRef.setSrc(sequenceFlow);
		sequenceFlow__startEvent____sourceRef.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(sequenceFlow__startEvent____sourceRef);
		startEvent__sequenceFlow____outgoing.setSrc(startEvent);
		startEvent__sequenceFlow____outgoing.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(startEvent__sequenceFlow____outgoing);
		startEventToBasicFlow__startEvent____source
				.setSrc(startEventToBasicFlow);
		startEventToBasicFlow__startEvent____source.setTrg(startEvent);
		ruleresult.getCreatedEdges().add(
				startEventToBasicFlow__startEvent____source);
		startEventToBasicFlow__basicFlow____target
				.setSrc(startEventToBasicFlow);
		startEventToBasicFlow__basicFlow____target.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				startEventToBasicFlow__basicFlow____target);
		sequenceFlowToBasicFlow__sequenceFlow____source
				.setSrc(sequenceFlowToBasicFlow);
		sequenceFlowToBasicFlow__sequenceFlow____source.setTrg(sequenceFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToBasicFlow__sequenceFlow____source);
		sequenceFlowToBasicFlow__basicFlow____target
				.setSrc(sequenceFlowToBasicFlow);
		sequenceFlowToBasicFlow__basicFlow____target.setTrg(basicFlow);
		ruleresult.getCreatedEdges().add(
				sequenceFlowToBasicFlow__basicFlow____target);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		ruleresult.getCreatedEdges().add(processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		ruleresult.getCreatedEdges().add(processToActor__actor____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		definitions__process____rootElements
				.setName(definitions__process____rootElements_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		process__startEvent____flowElements
				.setName(process__startEvent____flowElements_name_prime);
		process__sequenceFlow____flowElements
				.setName(process__sequenceFlow____flowElements_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		sequenceFlow__startEvent____sourceRef
				.setName(sequenceFlow__startEvent____sourceRef_name_prime);
		startEvent__sequenceFlow____outgoing
				.setName(startEvent__sequenceFlow____outgoing_name_prime);
		startEventToBasicFlow__startEvent____source
				.setName(startEventToBasicFlow__startEvent____source_name_prime);
		startEventToBasicFlow__basicFlow____target
				.setName(startEventToBasicFlow__basicFlow____target_name_prime);
		sequenceFlowToBasicFlow__sequenceFlow____source
				.setName(sequenceFlowToBasicFlow__sequenceFlow____source_name_prime);
		sequenceFlowToBasicFlow__basicFlow____target
				.setName(sequenceFlowToBasicFlow__basicFlow____target_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		return new Object[] { ruleresult, definitions, packageDeclaration,
				process, useCase, processToUseCase, startEvent, basicFlow,
				startEventToBasicFlow, sequenceFlow, sequenceFlowToBasicFlow,
				actor, processToActor, definitions__process____rootElements,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				process__startEvent____flowElements,
				process__sequenceFlow____flowElements,
				useCase__basicFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target,
				sequenceFlow__startEvent____sourceRef,
				startEvent__sequenceFlow____outgoing,
				startEventToBasicFlow__startEvent____source,
				startEventToBasicFlow__basicFlow____target,
				sequenceFlowToBasicFlow__sequenceFlow____source,
				sequenceFlowToBasicFlow__basicFlow____target,
				processToActor__process____source,
				processToActor__actor____target };
	}

	public static final void pattern_ProcessToUseCaseRule_11_5_expressionBBBBBBBBBBBBBBB(
			ProcessToUseCaseRule _this, PerformRuleResult ruleresult,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		_this.registerObjects_BWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor);

	}

	public static final PerformRuleResult pattern_ProcessToUseCaseRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_1_blackFBB(
			EClass eClass, ProcessToUseCaseRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_12_1_binding = pattern_ProcessToUseCaseRule_12_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ProcessToUseCaseRule_12_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_12_1_black = pattern_ProcessToUseCaseRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ProcessToUseCaseRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("packageDeclaration");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("basicFlow");
		EObject _localVariable_3 = match.getObject("actor");
		EObject tmpPackageDeclaration = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpBasicFlow = _localVariable_2;
		EObject tmpActor = _localVariable_3;
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpBasicFlow instanceof BasicFlow) {
					BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
					if (tmpActor instanceof Actor) {
						Actor actor = (Actor) tmpActor;
						return new Object[] { packageDeclaration, useCase,
								basicFlow, actor, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_12_2_blackFBFBBBB(
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DefinitionsToPackage definitionsToPackage : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(packageDeclaration,
						DefinitionsToPackage.class, "target")) {
			Definitions definitions = definitionsToPackage.getSource();
			if (definitions != null) {
				_result.add(new Object[] { definitions, packageDeclaration,
						definitionsToPackage, useCase, basicFlow, actor, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_12_3_blackBBBBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (packageDeclaration.getUseCases().contains(useCase)) {
			if (packageDeclaration.getActors().contains(actor)) {
				if (definitions.equals(definitionsToPackage.getSource())) {
					if (packageDeclaration.equals(definitionsToPackage
							.getTarget())) {
						if (useCase.getFlows().contains(basicFlow)) {
							_result.add(new Object[] { definitions,
									packageDeclaration, definitionsToPackage,
									useCase, basicFlow, actor });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_3_greenBBBBBBFFFFFF(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__definitions____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge definitionsToPackage__packageDeclaration____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__basicFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String definitionsToPackage__definitions____source_name_prime = "source";
		String definitionsToPackage__packageDeclaration____target_name_prime = "target";
		String useCase__basicFlow____flows_name_prime = "flows";
		isApplicableMatch.getAllContextElements().add(definitions);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(definitionsToPackage);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(basicFlow);
		isApplicableMatch.getAllContextElements().add(actor);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		definitionsToPackage__definitions____source
				.setSrc(definitionsToPackage);
		definitionsToPackage__definitions____source.setTrg(definitions);
		isApplicableMatch.getAllContextElements().add(
				definitionsToPackage__definitions____source);
		definitionsToPackage__packageDeclaration____target
				.setSrc(definitionsToPackage);
		definitionsToPackage__packageDeclaration____target
				.setTrg(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(
				definitionsToPackage__packageDeclaration____target);
		useCase__basicFlow____flows.setSrc(useCase);
		useCase__basicFlow____flows.setTrg(basicFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__basicFlow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		definitionsToPackage__definitions____source
				.setName(definitionsToPackage__definitions____source_name_prime);
		definitionsToPackage__packageDeclaration____target
				.setName(definitionsToPackage__packageDeclaration____target_name_prime);
		useCase__basicFlow____flows
				.setName(useCase__basicFlow____flows_name_prime);
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage, useCase, basicFlow, actor,
				isApplicableMatch, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				definitionsToPackage__definitions____source,
				definitionsToPackage__packageDeclaration____target,
				useCase__basicFlow____flows };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_4_bindingFBBBBBBBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, definitions, packageDeclaration,
				definitionsToPackage, useCase, basicFlow, actor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, definitions,
					packageDeclaration, definitionsToPackage, useCase,
					basicFlow, actor };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_4_bindingAndBlackFBBBBBBBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		Object[] result_pattern_ProcessToUseCaseRule_12_4_binding = pattern_ProcessToUseCaseRule_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, definitions, packageDeclaration,
				definitionsToPackage, useCase, basicFlow, actor);
		if (result_pattern_ProcessToUseCaseRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_12_4_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_12_4_black = pattern_ProcessToUseCaseRule_12_4_blackB(csp);
			if (result_pattern_ProcessToUseCaseRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						definitions, packageDeclaration, definitionsToPackage,
						useCase, basicFlow, actor };
			}
		}
		return null;
	}

	public static final boolean pattern_ProcessToUseCaseRule_12_5_expressionFBB(
			ProcessToUseCaseRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ProcessToUseCaseRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ProcessToUseCaseRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_20_1_binding = pattern_ProcessToUseCaseRule_20_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_20_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_20_1_black = pattern_ProcessToUseCaseRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_273906 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_2_black_nac_1BB(
			SequenceFlow sequenceFlow, StartEvent startEvent) {
		if (startEvent.equals(sequenceFlow.getTargetRef())) {
			return new Object[] { sequenceFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_20_2_blackFFFFB(
			EMoflonEdge _edge_rootElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpDefinitions = _edge_rootElements.getSrc();
		if (tmpDefinitions instanceof Definitions) {
			Definitions definitions = (Definitions) tmpDefinitions;
			EObject tmpProcess = _edge_rootElements.getTrg();
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (definitions.getRootElements().contains(process)) {
					for (FlowElement tmpStartEvent : process.getFlowElements()) {
						if (tmpStartEvent instanceof StartEvent) {
							StartEvent startEvent = (StartEvent) tmpStartEvent;
							for (FlowElement tmpSequenceFlow : process
									.getFlowElements()) {
								if (tmpSequenceFlow instanceof SequenceFlow) {
									SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
									if (startEvent.equals(sequenceFlow
											.getSourceRef())) {
										if (pattern_ProcessToUseCaseRule_20_2_black_nac_0B(sequenceFlow) == null) {
											if (pattern_ProcessToUseCaseRule_20_2_black_nac_1BB(
													sequenceFlow, startEvent) == null) {
												_result.add(new Object[] {
														definitions, process,
														startEvent,
														sequenceFlow,
														_edge_rootElements });
											}
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

	public static final Object[] pattern_ProcessToUseCaseRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_20_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, definitions,
				process, startEvent, sequenceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_20_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_21_1_binding = pattern_ProcessToUseCaseRule_21_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_21_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_21_1_black = pattern_ProcessToUseCaseRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_313206 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_313206)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_2_black_nac_1BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_780412 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_780412)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_21_2_blackFFFFB(
			EMoflonEdge _edge_useCases) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_useCases.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpUseCase = _edge_useCases.getTrg();
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (packageDeclaration.getUseCases().contains(useCase)) {
					if (pattern_ProcessToUseCaseRule_21_2_black_nac_0BB(
							useCase, packageDeclaration) == null) {
						for (Actor actor : packageDeclaration.getActors()) {
							if (pattern_ProcessToUseCaseRule_21_2_black_nac_1BB(
									actor, packageDeclaration) == null) {
								for (Flow tmpBasicFlow : useCase.getFlows()) {
									if (tmpBasicFlow instanceof BasicFlow) {
										BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
										_result.add(new Object[] {
												packageDeclaration, useCase,
												basicFlow, actor,
												_edge_useCases });
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

	public static final Object[] pattern_ProcessToUseCaseRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_21_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				packageDeclaration, useCase, basicFlow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_21_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_22_1_binding = pattern_ProcessToUseCaseRule_22_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_22_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_22_1_black = pattern_ProcessToUseCaseRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_313184 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_313184)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_2_black_nac_1BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_277901 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_277901)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_22_2_blackFFFFB(
			EMoflonEdge _edge_actors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPackageDeclaration = _edge_actors.getSrc();
		if (tmpPackageDeclaration instanceof PackageDeclaration) {
			PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
			EObject tmpActor = _edge_actors.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (packageDeclaration.getActors().contains(actor)) {
					if (pattern_ProcessToUseCaseRule_22_2_black_nac_1BB(actor,
							packageDeclaration) == null) {
						for (UseCase useCase : packageDeclaration.getUseCases()) {
							if (pattern_ProcessToUseCaseRule_22_2_black_nac_0BB(
									useCase, packageDeclaration) == null) {
								for (Flow tmpBasicFlow : useCase.getFlows()) {
									if (tmpBasicFlow instanceof BasicFlow) {
										BasicFlow basicFlow = (BasicFlow) tmpBasicFlow;
										_result.add(new Object[] {
												packageDeclaration, useCase,
												basicFlow, actor, _edge_actors });
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

	public static final Object[] pattern_ProcessToUseCaseRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_22_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				packageDeclaration, useCase, basicFlow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_22_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_23_1_binding = pattern_ProcessToUseCaseRule_23_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_23_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_23_1_black = pattern_ProcessToUseCaseRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_151466 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_2_black_nac_1BB(
			SequenceFlow sequenceFlow, StartEvent startEvent) {
		if (startEvent.equals(sequenceFlow.getTargetRef())) {
			return new Object[] { sequenceFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_23_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpStartEvent = _edge_flowElements.getTrg();
			if (tmpStartEvent instanceof StartEvent) {
				StartEvent startEvent = (StartEvent) tmpStartEvent;
				if (process.getFlowElements().contains(startEvent)) {
					for (FlowElement tmpSequenceFlow : process
							.getFlowElements()) {
						if (tmpSequenceFlow instanceof SequenceFlow) {
							SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
							if (startEvent.equals(sequenceFlow.getSourceRef())) {
								if (pattern_ProcessToUseCaseRule_23_2_black_nac_0B(sequenceFlow) == null) {
									if (pattern_ProcessToUseCaseRule_23_2_black_nac_1BB(
											sequenceFlow, startEvent) == null) {
										for (Definitions definitions : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														process,
														Definitions.class,
														"rootElements")) {
											_result.add(new Object[] {
													definitions, process,
													startEvent, sequenceFlow,
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

	public static final Object[] pattern_ProcessToUseCaseRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_23_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, definitions,
				process, startEvent, sequenceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_23_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_24_1_binding = pattern_ProcessToUseCaseRule_24_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_24_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_24_1_black = pattern_ProcessToUseCaseRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_126673 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_2_black_nac_1BB(
			SequenceFlow sequenceFlow, StartEvent startEvent) {
		if (startEvent.equals(sequenceFlow.getTargetRef())) {
			return new Object[] { sequenceFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_24_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpSequenceFlow = _edge_flowElements.getTrg();
			if (tmpSequenceFlow instanceof SequenceFlow) {
				SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
				if (process.getFlowElements().contains(sequenceFlow)) {
					FlowNode tmpStartEvent = sequenceFlow.getSourceRef();
					if (tmpStartEvent instanceof StartEvent) {
						StartEvent startEvent = (StartEvent) tmpStartEvent;
						if (process.getFlowElements().contains(startEvent)) {
							if (pattern_ProcessToUseCaseRule_24_2_black_nac_0B(sequenceFlow) == null) {
								if (pattern_ProcessToUseCaseRule_24_2_black_nac_1BB(
										sequenceFlow, startEvent) == null) {
									for (Definitions definitions : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(process,
													Definitions.class,
													"rootElements")) {
										_result.add(new Object[] { definitions,
												process, startEvent,
												sequenceFlow,
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

	public static final Object[] pattern_ProcessToUseCaseRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_24_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, definitions,
				process, startEvent, sequenceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_24_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_25_1_binding = pattern_ProcessToUseCaseRule_25_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_25_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_25_1_black = pattern_ProcessToUseCaseRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_2_black_nac_0BB(
			UseCase useCase, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_useCase_useCases_738394 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, PackageDeclaration.class,
						"useCases")) {
			if (!packageDeclaration.equals(__DEC_useCase_useCases_738394)) {
				return new Object[] { useCase, packageDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_2_black_nac_1BB(
			Actor actor, PackageDeclaration packageDeclaration) {
		for (PackageDeclaration __DEC_actor_actors_7884 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, PackageDeclaration.class,
						"actors")) {
			if (!packageDeclaration.equals(__DEC_actor_actors_7884)) {
				return new Object[] { actor, packageDeclaration };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_25_2_blackFFFFB(
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
						if (pattern_ProcessToUseCaseRule_25_2_black_nac_0BB(
								useCase, packageDeclaration) == null) {
							for (Actor actor : packageDeclaration.getActors()) {
								if (pattern_ProcessToUseCaseRule_25_2_black_nac_1BB(
										actor, packageDeclaration) == null) {
									_result.add(new Object[] {
											packageDeclaration, useCase,
											basicFlow, actor, _edge_flows });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_25_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				packageDeclaration, useCase, basicFlow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_25_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_26_1_binding = pattern_ProcessToUseCaseRule_26_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_26_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_26_1_black = pattern_ProcessToUseCaseRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_289869 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_2_black_nac_1BB(
			SequenceFlow sequenceFlow, StartEvent startEvent) {
		if (startEvent.equals(sequenceFlow.getTargetRef())) {
			return new Object[] { sequenceFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_26_2_blackFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSequenceFlow = _edge_sourceRef.getSrc();
		if (tmpSequenceFlow instanceof SequenceFlow) {
			SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
			EObject tmpStartEvent = _edge_sourceRef.getTrg();
			if (tmpStartEvent instanceof StartEvent) {
				StartEvent startEvent = (StartEvent) tmpStartEvent;
				if (startEvent.equals(sequenceFlow.getSourceRef())) {
					if (pattern_ProcessToUseCaseRule_26_2_black_nac_0B(sequenceFlow) == null) {
						if (pattern_ProcessToUseCaseRule_26_2_black_nac_1BB(
								sequenceFlow, startEvent) == null) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(sequenceFlow,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getFlowElements().contains(
											startEvent)) {
										for (Definitions definitions : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														process,
														Definitions.class,
														"rootElements")) {
											_result.add(new Object[] {
													definitions, process,
													startEvent, sequenceFlow,
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

		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_26_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, definitions,
				process, startEvent, sequenceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_26_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_1_bindingFB(
			ProcessToUseCaseRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_1_blackFBB(
			EClass __eClass, ProcessToUseCaseRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_1_bindingAndBlackFFB(
			ProcessToUseCaseRule _this) {
		Object[] result_pattern_ProcessToUseCaseRule_27_1_binding = pattern_ProcessToUseCaseRule_27_1_bindingFB(_this);
		if (result_pattern_ProcessToUseCaseRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProcessToUseCaseRule_27_1_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_27_1_black = pattern_ProcessToUseCaseRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProcessToUseCaseRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProcessToUseCaseRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_2_black_nac_0B(
			SequenceFlow sequenceFlow) {
		for (ExclusiveGateway __DEC_sequenceFlow_default_845803 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(sequenceFlow,
						ExclusiveGateway.class, "default")) {
			return new Object[] { sequenceFlow };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_2_black_nac_1BB(
			SequenceFlow sequenceFlow, StartEvent startEvent) {
		if (startEvent.equals(sequenceFlow.getTargetRef())) {
			return new Object[] { sequenceFlow, startEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_27_2_blackFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStartEvent = _edge_outgoing.getSrc();
		if (tmpStartEvent instanceof StartEvent) {
			StartEvent startEvent = (StartEvent) tmpStartEvent;
			EObject tmpSequenceFlow = _edge_outgoing.getTrg();
			if (tmpSequenceFlow instanceof SequenceFlow) {
				SequenceFlow sequenceFlow = (SequenceFlow) tmpSequenceFlow;
				if (startEvent.equals(sequenceFlow.getSourceRef())) {
					if (pattern_ProcessToUseCaseRule_27_2_black_nac_0B(sequenceFlow) == null) {
						if (pattern_ProcessToUseCaseRule_27_2_black_nac_1BB(
								sequenceFlow, startEvent) == null) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(startEvent,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getFlowElements().contains(
											sequenceFlow)) {
										for (Definitions definitions : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														process,
														Definitions.class,
														"rootElements")) {
											_result.add(new Object[] {
													definitions, process,
													startEvent, sequenceFlow,
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

		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProcessToUseCaseRule_27_3_expressionFBBBBBB(
			ProcessToUseCaseRule _this, Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, definitions,
				process, startEvent, sequenceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProcessToUseCaseRule_27_4_expressionFBB(
			ProcessToUseCaseRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProcessToUseCaseRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_1_blackB(
			ProcessToUseCaseRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Definitions definitions) {
		if (ruleResult.getSourceObjects().contains(definitions)) {
			return new Object[] { ruleResult, definitions };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			DefinitionsToPackage definitionsToPackage) {
		if (ruleResult.getCorrObjects().contains(definitionsToPackage)) {
			return new Object[] { ruleResult, definitionsToPackage };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getTargetObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProcessToUseCaseRule_30_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList definitionsToPackageList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpDefinitionsToPackage : definitionsToPackageList
					.getEntryObjects()) {
				if (tmpDefinitionsToPackage instanceof DefinitionsToPackage) {
					DefinitionsToPackage definitionsToPackage = (DefinitionsToPackage) tmpDefinitionsToPackage;
					Definitions definitions = definitionsToPackage.getSource();
					if (definitions != null) {
						PackageDeclaration packageDeclaration = definitionsToPackage
								.getTarget();
						if (packageDeclaration != null) {
							if (pattern_ProcessToUseCaseRule_30_2_black_nac_1BB(
									ruleResult, definitionsToPackage) == null) {
								if (pattern_ProcessToUseCaseRule_30_2_black_nac_0BB(
										ruleResult, definitions) == null) {
									if (pattern_ProcessToUseCaseRule_30_2_black_nac_2BB(
											ruleResult, packageDeclaration) == null) {
										_result.add(new Object[] {
												definitionsToPackageList,
												definitions,
												definitionsToPackage,
												packageDeclaration,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_ProcessToUseCaseRule_30_3_bindingFBBBBBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, definitions, packageDeclaration,
				definitionsToPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, definitions,
					packageDeclaration, definitionsToPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_3_bindingAndBlackFBBBBBB(
			ProcessToUseCaseRule _this, IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ProcessToUseCaseRule_30_3_binding = pattern_ProcessToUseCaseRule_30_3_bindingFBBBBBB(
				_this, isApplicableMatch, definitions, packageDeclaration,
				definitionsToPackage, ruleResult);
		if (result_pattern_ProcessToUseCaseRule_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_ProcessToUseCaseRule_30_3_binding[0];

			Object[] result_pattern_ProcessToUseCaseRule_30_3_black = pattern_ProcessToUseCaseRule_30_3_blackB(csp);
			if (result_pattern_ProcessToUseCaseRule_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						definitions, packageDeclaration, definitionsToPackage,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ProcessToUseCaseRule_30_4_expressionFBB(
			ProcessToUseCaseRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_5_blackBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage) {
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_6_blackBBBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { definitions, packageDeclaration,
				definitionsToPackage, ruleResult };
	}

	public static final Object[] pattern_ProcessToUseCaseRule_30_6_greenBBFFFFFFFFFFBB(
			Definitions definitions, PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		bpmn2.Process process = Bpmn2Factory.eINSTANCE.createProcess();
		UseCase useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();
		ProcessToUseCase processToUseCase = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createProcessToUseCase();
		StartEvent startEvent = Bpmn2Factory.eINSTANCE.createStartEvent();
		BasicFlow basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();
		StartEventToBasicFlow startEventToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createStartEventToBasicFlow();
		SequenceFlow sequenceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Actor actor = UseCaseDSLFactory.eINSTANCE.createActor();
		ProcessToActor processToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createProcessToActor();
		Object _localVariable_0 = csp.getValue("process", "id");
		Object _localVariable_1 = csp.getValue("process", "name");
		Object _localVariable_2 = csp.getValue("useCase", "name");
		Object _localVariable_3 = csp.getValue("useCase", "description");
		Object _localVariable_4 = csp.getValue("useCase", "preConditions");
		Object _localVariable_5 = csp.getValue("startEvent", "name");
		Object _localVariable_6 = csp.getValue("actor", "name");
		Object _localVariable_7 = csp.getValue("actor", "type");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_8 = ruleResult.getIncrementedPerformCount();
		definitions.getRootElements().add(process);
		ruleResult.getSourceObjects().add(process);
		packageDeclaration.getUseCases().add(useCase);
		ruleResult.getTargetObjects().add(useCase);
		processToUseCase.setSource(process);
		processToUseCase.setTarget(useCase);
		ruleResult.getCorrObjects().add(processToUseCase);
		process.getFlowElements().add(startEvent);
		ruleResult.getSourceObjects().add(startEvent);
		useCase.getFlows().add(basicFlow);
		ruleResult.getTargetObjects().add(basicFlow);
		startEventToBasicFlow.setSource(startEvent);
		startEventToBasicFlow.setTarget(basicFlow);
		ruleResult.getCorrObjects().add(startEventToBasicFlow);
		process.getFlowElements().add(sequenceFlow);
		sequenceFlow.setSourceRef(startEvent);
		ruleResult.getSourceObjects().add(sequenceFlow);
		sequenceFlowToBasicFlow.setSource(sequenceFlow);
		sequenceFlowToBasicFlow.setTarget(basicFlow);
		ruleResult.getCorrObjects().add(sequenceFlowToBasicFlow);
		packageDeclaration.getActors().add(actor);
		ruleResult.getTargetObjects().add(actor);
		processToActor.setSource(process);
		processToActor.setTarget(actor);
		ruleResult.getCorrObjects().add(processToActor);
		String process_id_prime = (String) _localVariable_0;
		String process_name_prime = (String) _localVariable_1;
		String useCase_name_prime = (String) _localVariable_2;
		String useCase_description_prime = (String) _localVariable_3;
		String useCase_preConditions_prime = (String) _localVariable_4;
		String startEvent_name_prime = (String) _localVariable_5;
		String actor_name_prime = (String) _localVariable_6;
		ActorType actor_type_prime = (ActorType) _localVariable_7;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_8);
		process.setId(process_id_prime);
		process.setName(process_name_prime);
		useCase.setName(useCase_name_prime);
		useCase.setDescription(useCase_description_prime);
		useCase.setPreConditions(useCase_preConditions_prime);
		startEvent.setName(startEvent_name_prime);
		actor.setName(actor_name_prime);
		actor.setType(actor_type_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { definitions, packageDeclaration, process,
				useCase, processToUseCase, startEvent, basicFlow,
				startEventToBasicFlow, sequenceFlow, sequenceFlowToBasicFlow,
				actor, processToActor, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ProcessToUseCaseRule_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProcessToUseCaseRuleImpl
