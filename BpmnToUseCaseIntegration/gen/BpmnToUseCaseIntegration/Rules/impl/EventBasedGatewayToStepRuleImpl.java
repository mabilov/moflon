/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ProcessToActor;

import BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule;
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
import UseCaseDSL.Step;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.EventBasedGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
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
 * An implementation of the model object '<em><b>Event Based Gateway To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventBasedGatewayToStepRuleImpl extends AbstractRuleImpl implements
		EventBasedGatewayToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEventBasedGatewayToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_0_1_blackBBBBBBB(this,
						match, inFlow, process, eventBasedGateway, lane,
						laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_0_2_bindingAndBlackFBBBBBBB(
						this, match, inFlow, process, eventBasedGateway, lane,
						laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_4_blackBBBBBB(match,
							inFlow, process, eventBasedGateway, lane, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_4_greenBBBBBFFFF(
							match, inFlow, process, eventBasedGateway, lane);
			// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result4_green[7];
			// EMoflonEdge lane__eventBasedGateway____flowNodeRefs = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_5_blackBBBBBB(match,
							inFlow, process, eventBasedGateway, lane, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_5_greenBBBBBFFF(
							match, inFlow, process, lane, laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_6_expressionBBBBBBB(
							this, match, inFlow, process, eventBasedGateway,
							lane, laneSet);
			return EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_7_expressionF();
		} else {
			return EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step prevStep = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[3];
		EventBasedGateway eventBasedGateway = (EventBasedGateway) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[8];
		Lane lane = (Lane) result1_bindingAndBlack[9];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_1_greenBFBBBFB(prevStep,
						eventBasedGateway, actor, flow, csp);
		NormalStep normalStep = (NormalStep) result1_green[1];
		FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result1_green[5];

		// collect translated elements
		Object[] result2_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_2_blackBBB(normalStep,
						eventBasedGateway, ebgToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_2_greenFBBB(normalStep,
						eventBasedGateway, ebgToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_3_blackBBBBBBBBBBBBBB(
						ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, process, eventBasedGateway, actor,
						processToActor, flow, inFlowToFlow, ebgToNormalStep,
						lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_3_greenBBBBBBBBBBFFFFFFFFF(
						ruleresult, inFlow, prevStep, normalStep, process,
						eventBasedGateway, actor, flow, ebgToNormalStep, lane);
		// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[10];
		// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result3_green[12];
		// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result3_green[13];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[14];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[15];
		// EMoflonEdge ebgToNormalStep__eventBasedGateway____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge ebgToNormalStep__normalStep____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge lane__eventBasedGateway____flowNodeRefs = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_5_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, process, eventBasedGateway, actor,
						processToActor, flow, inFlowToFlow, ebgToNormalStep,
						lane, laneSet);
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result2_binding[0];
		bpmn2.Process process = (bpmn2.Process) result2_binding[1];
		EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_binding[2];
		Lane lane = (Lane) result2_binding[3];
		LaneSet laneSet = (LaneSet) result2_binding[4];
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_2_2_blackBFFBBFFFFBBB(
						inFlow, process, eventBasedGateway, lane, laneSet,
						match)) {
			Step prevStep = (Step) result2_black[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[2];
			Actor actor = (Actor) result2_black[5];
			ProcessToActor processToActor = (ProcessToActor) result2_black[6];
			Flow flow = (Flow) result2_black[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_2_3_blackBBBBBBBBBBB(
							inFlow, prevStep, inFlowToPrevStep, process,
							eventBasedGateway, actor, processToActor, flow,
							inFlowToFlow, lane, laneSet)) {
				Object[] result3_green = EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
								inFlow, prevStep, inFlowToPrevStep, process,
								eventBasedGateway, actor, processToActor, flow,
								inFlowToFlow, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge inFlowToPrevStep__inFlow____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlowToPrevStep__prevStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result3_green[18];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge lane__eventBasedGateway____flowNodeRefs = (EMoflonEdge) result3_green[23];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, prevStep,
								inFlowToPrevStep, process, eventBasedGateway,
								actor, processToActor, flow, inFlowToFlow,
								lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("eventBasedGateway", eventBasedGateway);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", true, csp);
		var_eventBasedGateway_id.setValue(eventBasedGateway.getId());
		var_eventBasedGateway_id.setType("String");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", true, csp);
		var_eventBasedGateway_name.setValue(eventBasedGateway.getName());
		var_eventBasedGateway_name.setType("String");

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
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
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
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("eventBasedGateway").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getEventBasedGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		// initial bindings
		Object[] result1_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_10_1_blackBBBBBB(this,
						match, prevStep, normalStep, actor, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_10_2_bindingAndBlackFBBBBBB(
						this, match, prevStep, normalStep, actor, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_4_blackBBBBB(match,
							prevStep, normalStep, actor, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_4_greenBBBBBFFF(
							match, prevStep, normalStep, actor, flow);
			// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result4_green[5];
			// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result4_green[6];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_5_blackBBBBB(match,
							prevStep, normalStep, actor, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_5_greenBBBB(match,
							prevStep, actor, flow);

			// register objects to match
			EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_6_expressionBBBBBB(
							this, match, prevStep, normalStep, actor, flow);
			return EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_7_expressionF();
		} else {
			return EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step prevStep = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[3];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[8];
		Lane lane = (Lane) result1_bindingAndBlack[9];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_1_greenBBBFFBB(inFlow,
						normalStep, process, lane, csp);
		EventBasedGateway eventBasedGateway = (EventBasedGateway) result1_green[3];
		FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result1_green[4];

		// collect translated elements
		Object[] result2_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_2_blackBBB(normalStep,
						eventBasedGateway, ebgToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_2_greenFBBB(normalStep,
						eventBasedGateway, ebgToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_3_blackBBBBBBBBBBBBBB(
						ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, process, eventBasedGateway, actor,
						processToActor, flow, inFlowToFlow, ebgToNormalStep,
						lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_3_greenBBBBBBBBBBFFFFFFFFF(
						ruleresult, inFlow, prevStep, normalStep, process,
						eventBasedGateway, actor, flow, ebgToNormalStep, lane);
		// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[10];
		// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result3_green[12];
		// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result3_green[13];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[14];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[15];
		// EMoflonEdge ebgToNormalStep__eventBasedGateway____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge ebgToNormalStep__normalStep____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge lane__eventBasedGateway____flowNodeRefs = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_5_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, process, eventBasedGateway, actor,
						processToActor, flow, inFlowToFlow, ebgToNormalStep,
						lane, laneSet);
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Step prevStep = (Step) result2_binding[0];
		NormalStep normalStep = (NormalStep) result2_binding[1];
		Actor actor = (Actor) result2_binding[2];
		Flow flow = (Flow) result2_binding[3];
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_12_2_blackFBFBFBFBFB(
						prevStep, normalStep, actor, flow, match)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[4];
			ProcessToActor processToActor = (ProcessToActor) result2_black[6];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_12_3_blackBBBBBBBBBFF(
							inFlow, prevStep, inFlowToPrevStep, normalStep,
							process, actor, processToActor, flow, inFlowToFlow)) {
				Lane lane = (Lane) result3_black[9];
				LaneSet laneSet = (LaneSet) result3_black[10];
				Object[] result3_green = EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
								inFlow, prevStep, inFlowToPrevStep, normalStep,
								process, actor, processToActor, flow,
								inFlowToFlow, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlowToPrevStep__inFlow____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlowToPrevStep__prevStep____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, prevStep,
								inFlowToPrevStep, normalStep, process, actor,
								processToActor, flow, inFlowToFlow, lane,
								laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("normalStep", normalStep);
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {// Create CSP
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {// Create CSP
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
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		var_eventBasedGateway_id.setType("String");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		var_eventBasedGateway_name.setType("String");
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);
		var_eventBasedGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
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
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_20_2_blackFFFFB(_edge_next)) {
			Step prevStep = (Step) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_20_3_expressionFBBBBBB(
							this, match, prevStep, normalStep, actor, flow)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_79(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_21_2_blackFFFFFB(_edge_flowElements)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_21_3_expressionFBBBBBBB(
							this, match, inFlow, process, eventBasedGateway,
							lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_80(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_22_2_blackFFFFFB(_edge_targetRef)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_22_3_expressionFBBBBBBB(
							this, match, inFlow, process, eventBasedGateway,
							lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_81(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_23_2_blackFFFFFB(_edge_incoming)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_23_3_expressionFBBBBBBB(
							this, match, inFlow, process, eventBasedGateway,
							lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_32(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_24_2_blackFFFFB(_edge_actor)) {
			Step prevStep = (Step) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_24_3_expressionFBBBBBB(
							this, match, prevStep, normalStep, actor, flow)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_33(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_25_2_blackFFFFB(_edge_steps)) {
			Step prevStep = (Step) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_25_3_expressionFBBBBBB(
							this, match, prevStep, normalStep, actor, flow)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_82(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_26_2_blackFFFFFB(_edge_flowNodeRefs)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_26_3_expressionFBBBBBBB(
							this, match, inFlow, process, eventBasedGateway,
							lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_26_6_expressionFB(__result);
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
			SequenceFlowToStep inFlowToPrevStepParameter) {
		// create result
		Object[] result1_black = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_29_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_29_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_29_2_blackFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToPrevStepList = (RuleEntryList) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[2];
			Step prevStep = (Step) result2_black[3];
			bpmn2.Process process = (bpmn2.Process) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Lane lane = (Lane) result2_black[6];
			ProcessToActor processToActor = (ProcessToActor) result2_black[7];
			Actor actor = (Actor) result2_black[8];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[9];
			Flow flow = (Flow) result2_black[10];

			// solve CSP
			Object[] result3_bindingAndBlack = EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_29_3_bindingAndBlackFBBBBBBBBBBBBB(
							this, isApplicableMatch, inFlow, prevStep,
							inFlowToPrevStep, process, actor, processToActor,
							flow, inFlowToFlow, lane, laneSet, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EventBasedGatewayToStepRuleImpl
					.pattern_EventBasedGatewayToStepRule_29_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = EventBasedGatewayToStepRuleImpl
						.pattern_EventBasedGatewayToStepRule_29_5_blackBBBBBBBBBB(
								inFlow, prevStep, inFlowToPrevStep, process,
								actor, processToActor, flow, inFlowToFlow,
								lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_29_6_blackBBBBBBBBBBB(
									inFlow, prevStep, inFlowToPrevStep,
									process, actor, processToActor, flow,
									inFlowToFlow, lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					EventBasedGatewayToStepRuleImpl
							.pattern_EventBasedGatewayToStepRule_29_6_greenBBFBFBBFBBB(
									inFlow, prevStep, process, actor, flow,
									lane, ruleResult, csp);
					// NormalStep normalStep = (NormalStep) result6_green[2];
					// EventBasedGateway eventBasedGateway = (EventBasedGateway) result6_green[4];
					// FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return EventBasedGatewayToStepRuleImpl
				.pattern_EventBasedGatewayToStepRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
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
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		var_eventBasedGateway_id.setType("String");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		var_eventBasedGateway_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);
		var_eventBasedGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
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
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(EventBasedGateway) arguments.get(5),
					(Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Lane) arguments.get(10), (LaneSet) arguments.get(11));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Lane) arguments.get(10), (LaneSet) arguments.get(11));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_79((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_80__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_80((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_81((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_33((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_82((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4), (Actor) arguments.get(5),
					(ProcessToActor) arguments.get(6), (Flow) arguments.get(7),
					(SequenceFlowToUCFlow) arguments.get(8),
					(Lane) arguments.get(9), (LaneSet) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_1_blackBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		return new Object[] { _this, match, inFlow, process, eventBasedGateway,
				lane, laneSet };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_2_bindingFBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, inFlow,
				process, eventBasedGateway, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, inFlow, process,
					eventBasedGateway, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_2_bindingAndBlackFBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_EventBasedGatewayToStepRule_0_2_binding = pattern_EventBasedGatewayToStepRule_0_2_bindingFBBBBBBB(
				_this, match, inFlow, process, eventBasedGateway, lane, laneSet);
		if (result_pattern_EventBasedGatewayToStepRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_0_2_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_0_2_black = pattern_EventBasedGatewayToStepRule_0_2_blackB(csp);
			if (result_pattern_EventBasedGatewayToStepRule_0_2_black != null) {

				return new Object[] { csp, _this, match, inFlow, process,
						eventBasedGateway, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_0_3_expressionFBB(
			EventBasedGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_4_blackBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		return new Object[] { match, inFlow, process, eventBasedGateway, lane,
				laneSet };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_4_greenBBBBBFFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane) {
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__eventBasedGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eventBasedGateway);
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String lane__eventBasedGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		match.getToBeTranslatedEdges().add(
				process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		match.getToBeTranslatedEdges().add(
				inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(
				eventBasedGateway__inFlow____incoming);
		lane__eventBasedGateway____flowNodeRefs.setSrc(lane);
		lane__eventBasedGateway____flowNodeRefs.setTrg(eventBasedGateway);
		match.getToBeTranslatedEdges().add(
				lane__eventBasedGateway____flowNodeRefs);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		lane__eventBasedGateway____flowNodeRefs
				.setName(lane__eventBasedGateway____flowNodeRefs_name_prime);
		return new Object[] { match, inFlow, process, eventBasedGateway, lane,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming,
				lane__eventBasedGateway____flowNodeRefs };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_5_blackBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		return new Object[] { match, inFlow, process, eventBasedGateway, lane,
				laneSet };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_0_5_greenBBBBBFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process, Lane lane,
			LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
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
		return new Object[] { match, inFlow, process, lane, laneSet,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes };
	}

	public static final void pattern_EventBasedGatewayToStepRule_0_6_expressionBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, inFlow, process,
				eventBasedGateway, lane, laneSet);

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("inFlowToPrevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("eventBasedGateway");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("lane");
		EObject _localVariable_10 = isApplicableMatch.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpInFlowToPrevStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpEventBasedGateway = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpProcessToActor = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpInFlowToFlow = _localVariable_8;
		EObject tmpLane = _localVariable_9;
		EObject tmpLaneSet = _localVariable_10;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpEventBasedGateway instanceof EventBasedGateway) {
							EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpProcessToActor instanceof ProcessToActor) {
									ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
											SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
											if (tmpLane instanceof Lane) {
												Lane lane = (Lane) tmpLane;
												if (tmpLaneSet instanceof LaneSet) {
													LaneSet laneSet = (LaneSet) tmpLaneSet;
													return new Object[] {
															inFlow, prevStep,
															inFlowToPrevStep,
															process,
															eventBasedGateway,
															actor,
															processToActor,
															flow, inFlowToFlow,
															lane, laneSet,
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

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_1_blackBBBBBBBBBBBFBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { inFlow, prevStep, inFlowToPrevStep,
						process, eventBasedGateway, actor, processToActor,
						flow, inFlowToFlow, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EventBasedGatewayToStepRule_1_1_binding = pattern_EventBasedGatewayToStepRule_1_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_EventBasedGatewayToStepRule_1_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EventBasedGatewayToStepRule_1_1_binding[0];
			Step prevStep = (Step) result_pattern_EventBasedGatewayToStepRule_1_1_binding[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result_pattern_EventBasedGatewayToStepRule_1_1_binding[2];
			bpmn2.Process process = (bpmn2.Process) result_pattern_EventBasedGatewayToStepRule_1_1_binding[3];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result_pattern_EventBasedGatewayToStepRule_1_1_binding[4];
			Actor actor = (Actor) result_pattern_EventBasedGatewayToStepRule_1_1_binding[5];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_EventBasedGatewayToStepRule_1_1_binding[6];
			Flow flow = (Flow) result_pattern_EventBasedGatewayToStepRule_1_1_binding[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_EventBasedGatewayToStepRule_1_1_binding[8];
			Lane lane = (Lane) result_pattern_EventBasedGatewayToStepRule_1_1_binding[9];
			LaneSet laneSet = (LaneSet) result_pattern_EventBasedGatewayToStepRule_1_1_binding[10];

			Object[] result_pattern_EventBasedGatewayToStepRule_1_1_black = pattern_EventBasedGatewayToStepRule_1_1_blackBBBBBBBBBBBFBB(
					inFlow, prevStep, inFlowToPrevStep, process,
					eventBasedGateway, actor, processToActor, flow,
					inFlowToFlow, lane, laneSet, _this, isApplicableMatch);
			if (result_pattern_EventBasedGatewayToStepRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_1_1_black[11];

				return new Object[] { inFlow, prevStep, inFlowToPrevStep,
						process, eventBasedGateway, actor, processToActor,
						flow, inFlowToFlow, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_1_greenBFBBBFB(
			Step prevStep, EventBasedGateway eventBasedGateway, Actor actor,
			Flow flow, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		FlowNodeToStep ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		prevStep.setNext(normalStep);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		ebgToNormalStep.setSource(eventBasedGateway);
		ebgToNormalStep.setTarget(normalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		return new Object[] { prevStep, normalStep, eventBasedGateway, actor,
				flow, ebgToNormalStep, csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_2_blackBBB(
			NormalStep normalStep, EventBasedGateway eventBasedGateway,
			FlowNodeToStep ebgToNormalStep) {
		return new Object[] { normalStep, eventBasedGateway, ebgToNormalStep };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_2_greenFBBB(
			NormalStep normalStep, EventBasedGateway eventBasedGateway,
			FlowNodeToStep ebgToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(normalStep);
		ruleresult.getTranslatedElements().add(eventBasedGateway);
		ruleresult.getCreatedLinkElements().add(ebgToNormalStep);
		return new Object[] { ruleresult, normalStep, eventBasedGateway,
				ebgToNormalStep };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject normalStep, EObject process,
			EObject eventBasedGateway, EObject actor, EObject processToActor,
			EObject flow, EObject inFlowToFlow, EObject ebgToNormalStep,
			EObject lane, EObject laneSet) {
		if (!inFlow.equals(prevStep)) {
			if (!inFlow.equals(inFlowToPrevStep)) {
				if (!inFlow.equals(normalStep)) {
					if (!inFlow.equals(process)) {
						if (!inFlow.equals(processToActor)) {
							if (!inFlow.equals(inFlowToFlow)) {
								if (!inFlow.equals(lane)) {
									if (!inFlow.equals(laneSet)) {
										if (!prevStep.equals(process)) {
											if (!prevStep
													.equals(processToActor)) {
												if (!inFlowToPrevStep
														.equals(prevStep)) {
													if (!inFlowToPrevStep
															.equals(normalStep)) {
														if (!inFlowToPrevStep
																.equals(process)) {
															if (!inFlowToPrevStep
																	.equals(processToActor)) {
																if (!inFlowToPrevStep
																		.equals(lane)) {
																	if (!inFlowToPrevStep
																			.equals(laneSet)) {
																		if (!normalStep
																				.equals(prevStep)) {
																			if (!normalStep
																					.equals(process)) {
																				if (!normalStep
																						.equals(processToActor)) {
																					if (!process
																							.equals(processToActor)) {
																						if (!eventBasedGateway
																								.equals(inFlow)) {
																							if (!eventBasedGateway
																									.equals(prevStep)) {
																								if (!eventBasedGateway
																										.equals(inFlowToPrevStep)) {
																									if (!eventBasedGateway
																											.equals(normalStep)) {
																										if (!eventBasedGateway
																												.equals(process)) {
																											if (!eventBasedGateway
																													.equals(processToActor)) {
																												if (!eventBasedGateway
																														.equals(flow)) {
																													if (!eventBasedGateway
																															.equals(inFlowToFlow)) {
																														if (!eventBasedGateway
																																.equals(lane)) {
																															if (!eventBasedGateway
																																	.equals(laneSet)) {
																																if (!actor
																																		.equals(inFlow)) {
																																	if (!actor
																																			.equals(prevStep)) {
																																		if (!actor
																																				.equals(inFlowToPrevStep)) {
																																			if (!actor
																																					.equals(normalStep)) {
																																				if (!actor
																																						.equals(process)) {
																																					if (!actor
																																							.equals(eventBasedGateway)) {
																																						if (!actor
																																								.equals(processToActor)) {
																																							if (!actor
																																									.equals(flow)) {
																																								if (!actor
																																										.equals(inFlowToFlow)) {
																																									if (!actor
																																											.equals(ebgToNormalStep)) {
																																										if (!actor
																																												.equals(lane)) {
																																											if (!actor
																																													.equals(laneSet)) {
																																												if (!flow
																																														.equals(inFlow)) {
																																													if (!flow
																																															.equals(prevStep)) {
																																														if (!flow
																																																.equals(inFlowToPrevStep)) {
																																															if (!flow
																																																	.equals(normalStep)) {
																																																if (!flow
																																																		.equals(process)) {
																																																	if (!flow
																																																			.equals(processToActor)) {
																																																		if (!flow
																																																				.equals(inFlowToFlow)) {
																																																			if (!flow
																																																					.equals(lane)) {
																																																				if (!flow
																																																						.equals(laneSet)) {
																																																					if (!inFlowToFlow
																																																							.equals(prevStep)) {
																																																						if (!inFlowToFlow
																																																								.equals(inFlowToPrevStep)) {
																																																							if (!inFlowToFlow
																																																									.equals(normalStep)) {
																																																								if (!inFlowToFlow
																																																										.equals(process)) {
																																																									if (!inFlowToFlow
																																																											.equals(processToActor)) {
																																																										if (!inFlowToFlow
																																																												.equals(lane)) {
																																																											if (!inFlowToFlow
																																																													.equals(laneSet)) {
																																																												if (!ebgToNormalStep
																																																														.equals(inFlow)) {
																																																													if (!ebgToNormalStep
																																																															.equals(prevStep)) {
																																																														if (!ebgToNormalStep
																																																																.equals(inFlowToPrevStep)) {
																																																															if (!ebgToNormalStep
																																																																	.equals(normalStep)) {
																																																																if (!ebgToNormalStep
																																																																		.equals(process)) {
																																																																	if (!ebgToNormalStep
																																																																			.equals(eventBasedGateway)) {
																																																																		if (!ebgToNormalStep
																																																																				.equals(processToActor)) {
																																																																			if (!ebgToNormalStep
																																																																					.equals(flow)) {
																																																																				if (!ebgToNormalStep
																																																																						.equals(inFlowToFlow)) {
																																																																					if (!ebgToNormalStep
																																																																							.equals(lane)) {
																																																																						if (!ebgToNormalStep
																																																																								.equals(laneSet)) {
																																																																							if (!lane
																																																																									.equals(prevStep)) {
																																																																								if (!lane
																																																																										.equals(normalStep)) {
																																																																									if (!lane
																																																																											.equals(process)) {
																																																																										if (!lane
																																																																												.equals(processToActor)) {
																																																																											if (!lane
																																																																													.equals(laneSet)) {
																																																																												if (!laneSet
																																																																														.equals(prevStep)) {
																																																																													if (!laneSet
																																																																															.equals(normalStep)) {
																																																																														if (!laneSet
																																																																																.equals(process)) {
																																																																															if (!laneSet
																																																																																	.equals(processToActor)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		inFlow,
																																																																																		prevStep,
																																																																																		inFlowToPrevStep,
																																																																																		normalStep,
																																																																																		process,
																																																																																		eventBasedGateway,
																																																																																		actor,
																																																																																		processToActor,
																																																																																		flow,
																																																																																		inFlowToFlow,
																																																																																		ebgToNormalStep,
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
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_1_3_greenBBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject flow, EObject ebgToNormalStep, EObject lane) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__eventBasedGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__eventBasedGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EventBasedGatewayToStepRule";
		String prevStep__normalStep____next_name_prime = "next";
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		String ebgToNormalStep__eventBasedGateway____source_name_prime = "source";
		String ebgToNormalStep__normalStep____target_name_prime = "target";
		String lane__eventBasedGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(prevStep__normalStep____next);
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		ruleresult.getTranslatedEdges().add(
				process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(
				eventBasedGateway__inFlow____incoming);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(flow__normalStep____steps);
		ebgToNormalStep__eventBasedGateway____source.setSrc(ebgToNormalStep);
		ebgToNormalStep__eventBasedGateway____source.setTrg(eventBasedGateway);
		ruleresult.getCreatedEdges().add(
				ebgToNormalStep__eventBasedGateway____source);
		ebgToNormalStep__normalStep____target.setSrc(ebgToNormalStep);
		ebgToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(ebgToNormalStep__normalStep____target);
		lane__eventBasedGateway____flowNodeRefs.setSrc(lane);
		lane__eventBasedGateway____flowNodeRefs.setTrg(eventBasedGateway);
		ruleresult.getTranslatedEdges().add(
				lane__eventBasedGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		ebgToNormalStep__eventBasedGateway____source
				.setName(ebgToNormalStep__eventBasedGateway____source_name_prime);
		ebgToNormalStep__normalStep____target
				.setName(ebgToNormalStep__normalStep____target_name_prime);
		lane__eventBasedGateway____flowNodeRefs
				.setName(lane__eventBasedGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, prevStep, normalStep,
				process, eventBasedGateway, actor, flow, ebgToNormalStep, lane,
				prevStep__normalStep____next,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming,
				normalStep__actor____actor, flow__normalStep____steps,
				ebgToNormalStep__eventBasedGateway____source,
				ebgToNormalStep__normalStep____target,
				lane__eventBasedGateway____flowNodeRefs };
	}

	public static final void pattern_EventBasedGatewayToStepRule_1_5_expressionBBBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this, PerformRuleResult ruleresult,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep, EObject lane,
			EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, eventBasedGateway,
				actor, processToActor, flow, inFlowToFlow, ebgToNormalStep,
				lane, laneSet);

	}

	public static final PerformRuleResult pattern_EventBasedGatewayToStepRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_1_blackFBB(
			EClass eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_2_1_binding = pattern_EventBasedGatewayToStepRule_2_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_2_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_2_1_black = pattern_EventBasedGatewayToStepRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EventBasedGatewayToStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("inFlow");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("eventBasedGateway");
		EObject _localVariable_3 = match.getObject("lane");
		EObject _localVariable_4 = match.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpEventBasedGateway = _localVariable_2;
		EObject tmpLane = _localVariable_3;
		EObject tmpLaneSet = _localVariable_4;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpEventBasedGateway instanceof EventBasedGateway) {
					EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
					if (tmpLane instanceof Lane) {
						Lane lane = (Lane) tmpLane;
						if (tmpLaneSet instanceof LaneSet) {
							LaneSet laneSet = (LaneSet) tmpLaneSet;
							return new Object[] { inFlow, process,
									eventBasedGateway, lane, laneSet, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_2_2_blackBFFBBFFFFBBB(
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SequenceFlowToStep inFlowToPrevStep : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SequenceFlowToStep.class,
						"source")) {
			Step prevStep = inFlowToPrevStep.getTarget();
			if (prevStep != null) {
				for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(process,
								ProcessToActor.class, "source")) {
					Actor actor = processToActor.getTarget();
					if (actor != null) {
						for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(inFlow,
										SequenceFlowToUCFlow.class, "source")) {
							Flow flow = inFlowToFlow.getTarget();
							if (flow != null) {
								_result.add(new Object[] { inFlow, prevStep,
										inFlowToPrevStep, process,
										eventBasedGateway, actor,
										processToActor, flow, inFlowToFlow,
										lane, laneSet, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_2_3_blackBBBBBBBBBBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (inFlow.equals(inFlowToPrevStep.getSource())) {
			if (prevStep.equals(inFlowToPrevStep.getTarget())) {
				if (process.getLaneSets().contains(laneSet)) {
					if (process.getFlowElements().contains(inFlow)) {
						if (process.getFlowElements().contains(
								eventBasedGateway)) {
							if (eventBasedGateway.equals(inFlow.getTargetRef())) {
								if (process.equals(processToActor.getSource())) {
									if (actor
											.equals(processToActor.getTarget())) {
										if (inFlow.equals(inFlowToFlow
												.getSource())) {
											if (flow.equals(inFlowToFlow
													.getTarget())) {
												if (lane.getFlowNodeRefs()
														.contains(
																eventBasedGateway)) {
													if (laneSet.getLanes()
															.contains(lane)) {
														_result.add(new Object[] {
																inFlow,
																prevStep,
																inFlowToPrevStep,
																process,
																eventBasedGateway,
																actor,
																processToActor,
																flow,
																inFlowToFlow,
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
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlowToPrevStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__eventBasedGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlowToPrevStep__inFlow____source_name_prime = "source";
		String inFlowToPrevStep__prevStep____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String lane__eventBasedGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToPrevStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		inFlowToPrevStep__inFlow____source.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__inFlow____source);
		inFlowToPrevStep__prevStep____target.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__prevStep____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				eventBasedGateway__inFlow____incoming);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		lane__eventBasedGateway____flowNodeRefs.setSrc(lane);
		lane__eventBasedGateway____flowNodeRefs.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__eventBasedGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlowToPrevStep__inFlow____source
				.setName(inFlowToPrevStep__inFlow____source_name_prime);
		inFlowToPrevStep__prevStep____target
				.setName(inFlowToPrevStep__prevStep____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		lane__eventBasedGateway____flowNodeRefs
				.setName(lane__eventBasedGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, process,
				eventBasedGateway, actor, processToActor, flow, inFlowToFlow,
				lane, laneSet, isApplicableMatch,
				inFlowToPrevStep__inFlow____source,
				inFlowToPrevStep__prevStep____target,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming,
				processToActor__process____source,
				processToActor__actor____target,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				lane__eventBasedGateway____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_4_bindingFBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, inFlow, prevStep, inFlowToPrevStep, process,
				eventBasedGateway, actor, processToActor, flow, inFlowToFlow,
				lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					prevStep, inFlowToPrevStep, process, eventBasedGateway,
					actor, processToActor, flow, inFlowToFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_EventBasedGatewayToStepRule_2_4_binding = pattern_EventBasedGatewayToStepRule_2_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				process, eventBasedGateway, actor, processToActor, flow,
				inFlowToFlow, lane, laneSet);
		if (result_pattern_EventBasedGatewayToStepRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_2_4_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_2_4_black = pattern_EventBasedGatewayToStepRule_2_4_blackB(csp);
			if (result_pattern_EventBasedGatewayToStepRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						prevStep, inFlowToPrevStep, process, eventBasedGateway,
						actor, processToActor, flow, inFlowToFlow, lane,
						laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_2_5_expressionFBB(
			EventBasedGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EventBasedGatewayToStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EventBasedGatewayToStepRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_1_blackBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { _this, match, prevStep, normalStep, actor,
					flow };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_2_bindingFBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				prevStep, normalStep, actor, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevStep, normalStep,
					actor, flow };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_2_bindingAndBlackFBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		Object[] result_pattern_EventBasedGatewayToStepRule_10_2_binding = pattern_EventBasedGatewayToStepRule_10_2_bindingFBBBBBB(
				_this, match, prevStep, normalStep, actor, flow);
		if (result_pattern_EventBasedGatewayToStepRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_10_2_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_10_2_black = pattern_EventBasedGatewayToStepRule_10_2_blackB(csp);
			if (result_pattern_EventBasedGatewayToStepRule_10_2_black != null) {

				return new Object[] { csp, _this, match, prevStep, normalStep,
						actor, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_10_3_expressionFBB(
			EventBasedGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_4_blackBBBBB(
			Match match, Step prevStep, NormalStep normalStep, Actor actor,
			Flow flow) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { match, prevStep, normalStep, actor, flow };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_4_greenBBBBBFFF(
			Match match, Step prevStep, NormalStep normalStep, Actor actor,
			Flow flow) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(normalStep);
		String prevStep__normalStep____next_name_prime = "next";
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		match.getToBeTranslatedEdges().add(prevStep__normalStep____next);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		match.getToBeTranslatedEdges().add(flow__normalStep____steps);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { match, prevStep, normalStep, actor, flow,
				prevStep__normalStep____next, normalStep__actor____actor,
				flow__normalStep____steps };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_5_blackBBBBB(
			Match match, Step prevStep, NormalStep normalStep, Actor actor,
			Flow flow) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { match, prevStep, normalStep, actor, flow };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_10_5_greenBBBB(
			Match match, Step prevStep, Actor actor, Flow flow) {
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		return new Object[] { match, prevStep, actor, flow };
	}

	public static final void pattern_EventBasedGatewayToStepRule_10_6_expressionBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, prevStep, normalStep, actor,
				flow);

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("inFlowToPrevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("lane");
		EObject _localVariable_10 = isApplicableMatch.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpInFlowToPrevStep = _localVariable_2;
		EObject tmpNormalStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpProcessToActor = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpInFlowToFlow = _localVariable_8;
		EObject tmpLane = _localVariable_9;
		EObject tmpLaneSet = _localVariable_10;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
					if (tmpNormalStep instanceof NormalStep) {
						NormalStep normalStep = (NormalStep) tmpNormalStep;
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpProcessToActor instanceof ProcessToActor) {
									ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
											SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
											if (tmpLane instanceof Lane) {
												Lane lane = (Lane) tmpLane;
												if (tmpLaneSet instanceof LaneSet) {
													LaneSet laneSet = (LaneSet) tmpLaneSet;
													return new Object[] {
															inFlow, prevStep,
															inFlowToPrevStep,
															normalStep,
															process, actor,
															processToActor,
															flow, inFlowToFlow,
															lane, laneSet,
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

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_1_blackBBBBBBBBBBBFBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet, EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!normalStep.equals(prevStep)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { inFlow, prevStep, inFlowToPrevStep,
							normalStep, process, actor, processToActor, flow,
							inFlowToFlow, lane, laneSet, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EventBasedGatewayToStepRule_11_1_binding = pattern_EventBasedGatewayToStepRule_11_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_EventBasedGatewayToStepRule_11_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EventBasedGatewayToStepRule_11_1_binding[0];
			Step prevStep = (Step) result_pattern_EventBasedGatewayToStepRule_11_1_binding[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result_pattern_EventBasedGatewayToStepRule_11_1_binding[2];
			NormalStep normalStep = (NormalStep) result_pattern_EventBasedGatewayToStepRule_11_1_binding[3];
			bpmn2.Process process = (bpmn2.Process) result_pattern_EventBasedGatewayToStepRule_11_1_binding[4];
			Actor actor = (Actor) result_pattern_EventBasedGatewayToStepRule_11_1_binding[5];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_EventBasedGatewayToStepRule_11_1_binding[6];
			Flow flow = (Flow) result_pattern_EventBasedGatewayToStepRule_11_1_binding[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_EventBasedGatewayToStepRule_11_1_binding[8];
			Lane lane = (Lane) result_pattern_EventBasedGatewayToStepRule_11_1_binding[9];
			LaneSet laneSet = (LaneSet) result_pattern_EventBasedGatewayToStepRule_11_1_binding[10];

			Object[] result_pattern_EventBasedGatewayToStepRule_11_1_black = pattern_EventBasedGatewayToStepRule_11_1_blackBBBBBBBBBBBFBB(
					inFlow, prevStep, inFlowToPrevStep, normalStep, process,
					actor, processToActor, flow, inFlowToFlow, lane, laneSet,
					_this, isApplicableMatch);
			if (result_pattern_EventBasedGatewayToStepRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_11_1_black[11];

				return new Object[] { inFlow, prevStep, inFlowToPrevStep,
						normalStep, process, actor, processToActor, flow,
						inFlowToFlow, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_1_greenBBBFFBB(
			SequenceFlow inFlow, NormalStep normalStep, bpmn2.Process process,
			Lane lane, CSP csp) {
		EventBasedGateway eventBasedGateway = Bpmn2Factory.eINSTANCE
				.createEventBasedGateway();
		FlowNodeToStep ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		Object _localVariable_0 = csp.getValue("eventBasedGateway", "id");
		Object _localVariable_1 = csp.getValue("eventBasedGateway", "name");
		Object _localVariable_2 = csp.getValue("eventBasedGateway",
				"gatewayDirection");
		process.getFlowElements().add(eventBasedGateway);
		inFlow.setTargetRef(eventBasedGateway);
		lane.getFlowNodeRefs().add(eventBasedGateway);
		ebgToNormalStep.setSource(eventBasedGateway);
		ebgToNormalStep.setTarget(normalStep);
		String eventBasedGateway_id_prime = (String) _localVariable_0;
		String eventBasedGateway_name_prime = (String) _localVariable_1;
		GatewayDirection eventBasedGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_2;
		eventBasedGateway.setId(eventBasedGateway_id_prime);
		eventBasedGateway.setName(eventBasedGateway_name_prime);
		eventBasedGateway
				.setGatewayDirection(eventBasedGateway_gatewayDirection_prime);
		return new Object[] { inFlow, normalStep, process, eventBasedGateway,
				ebgToNormalStep, lane, csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_2_blackBBB(
			NormalStep normalStep, EventBasedGateway eventBasedGateway,
			FlowNodeToStep ebgToNormalStep) {
		return new Object[] { normalStep, eventBasedGateway, ebgToNormalStep };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_2_greenFBBB(
			NormalStep normalStep, EventBasedGateway eventBasedGateway,
			FlowNodeToStep ebgToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(normalStep);
		ruleresult.getCreatedElements().add(eventBasedGateway);
		ruleresult.getCreatedLinkElements().add(ebgToNormalStep);
		return new Object[] { ruleresult, normalStep, eventBasedGateway,
				ebgToNormalStep };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject normalStep, EObject process,
			EObject eventBasedGateway, EObject actor, EObject processToActor,
			EObject flow, EObject inFlowToFlow, EObject ebgToNormalStep,
			EObject lane, EObject laneSet) {
		if (!inFlow.equals(prevStep)) {
			if (!inFlow.equals(inFlowToPrevStep)) {
				if (!inFlow.equals(normalStep)) {
					if (!inFlow.equals(process)) {
						if (!inFlow.equals(processToActor)) {
							if (!inFlow.equals(inFlowToFlow)) {
								if (!inFlow.equals(lane)) {
									if (!inFlow.equals(laneSet)) {
										if (!prevStep.equals(process)) {
											if (!prevStep
													.equals(processToActor)) {
												if (!inFlowToPrevStep
														.equals(prevStep)) {
													if (!inFlowToPrevStep
															.equals(normalStep)) {
														if (!inFlowToPrevStep
																.equals(process)) {
															if (!inFlowToPrevStep
																	.equals(processToActor)) {
																if (!inFlowToPrevStep
																		.equals(lane)) {
																	if (!inFlowToPrevStep
																			.equals(laneSet)) {
																		if (!normalStep
																				.equals(prevStep)) {
																			if (!normalStep
																					.equals(process)) {
																				if (!normalStep
																						.equals(processToActor)) {
																					if (!process
																							.equals(processToActor)) {
																						if (!eventBasedGateway
																								.equals(inFlow)) {
																							if (!eventBasedGateway
																									.equals(prevStep)) {
																								if (!eventBasedGateway
																										.equals(inFlowToPrevStep)) {
																									if (!eventBasedGateway
																											.equals(normalStep)) {
																										if (!eventBasedGateway
																												.equals(process)) {
																											if (!eventBasedGateway
																													.equals(processToActor)) {
																												if (!eventBasedGateway
																														.equals(flow)) {
																													if (!eventBasedGateway
																															.equals(inFlowToFlow)) {
																														if (!eventBasedGateway
																																.equals(lane)) {
																															if (!eventBasedGateway
																																	.equals(laneSet)) {
																																if (!actor
																																		.equals(inFlow)) {
																																	if (!actor
																																			.equals(prevStep)) {
																																		if (!actor
																																				.equals(inFlowToPrevStep)) {
																																			if (!actor
																																					.equals(normalStep)) {
																																				if (!actor
																																						.equals(process)) {
																																					if (!actor
																																							.equals(eventBasedGateway)) {
																																						if (!actor
																																								.equals(processToActor)) {
																																							if (!actor
																																									.equals(flow)) {
																																								if (!actor
																																										.equals(inFlowToFlow)) {
																																									if (!actor
																																											.equals(ebgToNormalStep)) {
																																										if (!actor
																																												.equals(lane)) {
																																											if (!actor
																																													.equals(laneSet)) {
																																												if (!flow
																																														.equals(inFlow)) {
																																													if (!flow
																																															.equals(prevStep)) {
																																														if (!flow
																																																.equals(inFlowToPrevStep)) {
																																															if (!flow
																																																	.equals(normalStep)) {
																																																if (!flow
																																																		.equals(process)) {
																																																	if (!flow
																																																			.equals(processToActor)) {
																																																		if (!flow
																																																				.equals(inFlowToFlow)) {
																																																			if (!flow
																																																					.equals(lane)) {
																																																				if (!flow
																																																						.equals(laneSet)) {
																																																					if (!inFlowToFlow
																																																							.equals(prevStep)) {
																																																						if (!inFlowToFlow
																																																								.equals(inFlowToPrevStep)) {
																																																							if (!inFlowToFlow
																																																									.equals(normalStep)) {
																																																								if (!inFlowToFlow
																																																										.equals(process)) {
																																																									if (!inFlowToFlow
																																																											.equals(processToActor)) {
																																																										if (!inFlowToFlow
																																																												.equals(lane)) {
																																																											if (!inFlowToFlow
																																																													.equals(laneSet)) {
																																																												if (!ebgToNormalStep
																																																														.equals(inFlow)) {
																																																													if (!ebgToNormalStep
																																																															.equals(prevStep)) {
																																																														if (!ebgToNormalStep
																																																																.equals(inFlowToPrevStep)) {
																																																															if (!ebgToNormalStep
																																																																	.equals(normalStep)) {
																																																																if (!ebgToNormalStep
																																																																		.equals(process)) {
																																																																	if (!ebgToNormalStep
																																																																			.equals(eventBasedGateway)) {
																																																																		if (!ebgToNormalStep
																																																																				.equals(processToActor)) {
																																																																			if (!ebgToNormalStep
																																																																					.equals(flow)) {
																																																																				if (!ebgToNormalStep
																																																																						.equals(inFlowToFlow)) {
																																																																					if (!ebgToNormalStep
																																																																							.equals(lane)) {
																																																																						if (!ebgToNormalStep
																																																																								.equals(laneSet)) {
																																																																							if (!lane
																																																																									.equals(prevStep)) {
																																																																								if (!lane
																																																																										.equals(normalStep)) {
																																																																									if (!lane
																																																																											.equals(process)) {
																																																																										if (!lane
																																																																												.equals(processToActor)) {
																																																																											if (!lane
																																																																													.equals(laneSet)) {
																																																																												if (!laneSet
																																																																														.equals(prevStep)) {
																																																																													if (!laneSet
																																																																															.equals(normalStep)) {
																																																																														if (!laneSet
																																																																																.equals(process)) {
																																																																															if (!laneSet
																																																																																	.equals(processToActor)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		inFlow,
																																																																																		prevStep,
																																																																																		inFlowToPrevStep,
																																																																																		normalStep,
																																																																																		process,
																																																																																		eventBasedGateway,
																																																																																		actor,
																																																																																		processToActor,
																																																																																		flow,
																																																																																		inFlowToFlow,
																																																																																		ebgToNormalStep,
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
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_11_3_greenBBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject flow, EObject ebgToNormalStep, EObject lane) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__eventBasedGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__eventBasedGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EventBasedGatewayToStepRule";
		String prevStep__normalStep____next_name_prime = "next";
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		String ebgToNormalStep__eventBasedGateway____source_name_prime = "source";
		String ebgToNormalStep__normalStep____target_name_prime = "target";
		String lane__eventBasedGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		ruleresult.getTranslatedEdges().add(prevStep__normalStep____next);
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		ruleresult.getCreatedEdges().add(
				process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		ruleresult.getCreatedEdges()
				.add(inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(eventBasedGateway__inFlow____incoming);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		ruleresult.getTranslatedEdges().add(flow__normalStep____steps);
		ebgToNormalStep__eventBasedGateway____source.setSrc(ebgToNormalStep);
		ebgToNormalStep__eventBasedGateway____source.setTrg(eventBasedGateway);
		ruleresult.getCreatedEdges().add(
				ebgToNormalStep__eventBasedGateway____source);
		ebgToNormalStep__normalStep____target.setSrc(ebgToNormalStep);
		ebgToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(ebgToNormalStep__normalStep____target);
		lane__eventBasedGateway____flowNodeRefs.setSrc(lane);
		lane__eventBasedGateway____flowNodeRefs.setTrg(eventBasedGateway);
		ruleresult.getCreatedEdges().add(
				lane__eventBasedGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		ebgToNormalStep__eventBasedGateway____source
				.setName(ebgToNormalStep__eventBasedGateway____source_name_prime);
		ebgToNormalStep__normalStep____target
				.setName(ebgToNormalStep__normalStep____target_name_prime);
		lane__eventBasedGateway____flowNodeRefs
				.setName(lane__eventBasedGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, prevStep, normalStep,
				process, eventBasedGateway, actor, flow, ebgToNormalStep, lane,
				prevStep__normalStep____next,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming,
				normalStep__actor____actor, flow__normalStep____steps,
				ebgToNormalStep__eventBasedGateway____source,
				ebgToNormalStep__normalStep____target,
				lane__eventBasedGateway____flowNodeRefs };
	}

	public static final void pattern_EventBasedGatewayToStepRule_11_5_expressionBBBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this, PerformRuleResult ruleresult,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep, EObject lane,
			EObject laneSet) {
		_this.registerObjects_BWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, eventBasedGateway,
				actor, processToActor, flow, inFlowToFlow, ebgToNormalStep,
				lane, laneSet);

	}

	public static final PerformRuleResult pattern_EventBasedGatewayToStepRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_1_blackFBB(
			EClass eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_12_1_binding = pattern_EventBasedGatewayToStepRule_12_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_12_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_12_1_black = pattern_EventBasedGatewayToStepRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EventBasedGatewayToStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("prevStep");
		EObject _localVariable_1 = match.getObject("normalStep");
		EObject _localVariable_2 = match.getObject("actor");
		EObject _localVariable_3 = match.getObject("flow");
		EObject tmpPrevStep = _localVariable_0;
		EObject tmpNormalStep = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						return new Object[] { prevStep, normalStep, actor,
								flow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_12_2_blackFBFBFBFBFB(
			Step prevStep, NormalStep normalStep, Actor actor, Flow flow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!normalStep.equals(prevStep)) {
			for (SequenceFlowToStep inFlowToPrevStep : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(prevStep,
							SequenceFlowToStep.class, "target")) {
				SequenceFlow inFlow = inFlowToPrevStep.getSource();
				if (inFlow != null) {
					for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(actor,
									ProcessToActor.class, "target")) {
						bpmn2.Process process = processToActor.getSource();
						if (process != null) {
							for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(flow,
											SequenceFlowToUCFlow.class,
											"target")) {
								if (inFlow.equals(inFlowToFlow.getSource())) {
									_result.add(new Object[] { inFlow,
											prevStep, inFlowToPrevStep,
											normalStep, process, actor,
											processToActor, flow, inFlowToFlow,
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

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_12_3_blackBBBBBBBBBFF(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!normalStep.equals(prevStep)) {
			if (normalStep.equals(prevStep.getNext())) {
				if (inFlow.equals(inFlowToPrevStep.getSource())) {
					if (prevStep.equals(inFlowToPrevStep.getTarget())) {
						if (process.getFlowElements().contains(inFlow)) {
							if (process.equals(processToActor.getSource())) {
								if (actor.equals(processToActor.getTarget())) {
									if (actor.equals(normalStep.getActor())) {
										if (flow.getSteps()
												.contains(normalStep)) {
											if (inFlow.equals(inFlowToFlow
													.getSource())) {
												if (flow.equals(inFlowToFlow
														.getTarget())) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (Lane lane : laneSet
																.getLanes()) {
															_result.add(new Object[] {
																	inFlow,
																	prevStep,
																	inFlowToPrevStep,
																	normalStep,
																	process,
																	actor,
																	processToActor,
																	flow,
																	inFlowToFlow,
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
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String prevStep__normalStep____next_name_prime = "next";
		String inFlowToPrevStep__inFlow____source_name_prime = "source";
		String inFlowToPrevStep__prevStep____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToPrevStep);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				prevStep__normalStep____next);
		inFlowToPrevStep__inFlow____source.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__inFlow____source);
		inFlowToPrevStep__prevStep____target.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__prevStep____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
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
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		inFlowToPrevStep__inFlow____source
				.setName(inFlowToPrevStep__inFlow____source_name_prime);
		inFlowToPrevStep__prevStep____target
				.setName(inFlowToPrevStep__prevStep____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, normalStep,
				process, actor, processToActor, flow, inFlowToFlow, lane,
				laneSet, isApplicableMatch, prevStep__normalStep____next,
				inFlowToPrevStep__inFlow____source,
				inFlowToPrevStep__prevStep____target,
				process__laneSet____laneSets, process__inFlow____flowElements,
				processToActor__process____source,
				processToActor__actor____target, normalStep__actor____actor,
				flow__normalStep____steps, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, laneSet__lane____lanes };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_4_bindingFBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			NormalStep normalStep, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				normalStep, process, actor, processToActor, flow, inFlowToFlow,
				lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					prevStep, inFlowToPrevStep, normalStep, process, actor,
					processToActor, flow, inFlowToFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			NormalStep normalStep, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_EventBasedGatewayToStepRule_12_4_binding = pattern_EventBasedGatewayToStepRule_12_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				normalStep, process, actor, processToActor, flow, inFlowToFlow,
				lane, laneSet);
		if (result_pattern_EventBasedGatewayToStepRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_12_4_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_12_4_black = pattern_EventBasedGatewayToStepRule_12_4_blackB(csp);
			if (result_pattern_EventBasedGatewayToStepRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						prevStep, inFlowToPrevStep, normalStep, process, actor,
						processToActor, flow, inFlowToFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_12_5_expressionFBB(
			EventBasedGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EventBasedGatewayToStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EventBasedGatewayToStepRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_20_1_binding = pattern_EventBasedGatewayToStepRule_20_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_20_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_20_1_black = pattern_EventBasedGatewayToStepRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_20_2_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpNormalStep = _edge_next.getTrg();
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (!normalStep.equals(prevStep)) {
					if (normalStep.equals(prevStep.getNext())) {
						Actor actor = normalStep.getActor();
						if (actor != null) {
							for (Flow flow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											Flow.class, "steps")) {
								_result.add(new Object[] { prevStep,
										normalStep, actor, flow, _edge_next });
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_20_3_expressionFBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				normalStep, actor, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_20_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_21_1_binding = pattern_EventBasedGatewayToStepRule_21_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_21_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_21_1_black = pattern_EventBasedGatewayToStepRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_21_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpEventBasedGateway = _edge_flowElements.getTrg();
			if (tmpEventBasedGateway instanceof EventBasedGateway) {
				EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
				if (process.getFlowElements().contains(eventBasedGateway)) {
					for (LaneSet laneSet : process.getLaneSets()) {
						for (FlowElement tmpInFlow : process.getFlowElements()) {
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (eventBasedGateway.equals(inFlow
										.getTargetRef())) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												eventBasedGateway)) {
											_result.add(new Object[] { inFlow,
													process, eventBasedGateway,
													lane, laneSet,
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

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_21_3_expressionFBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, eventBasedGateway, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_21_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_22_1_binding = pattern_EventBasedGatewayToStepRule_22_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_22_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_22_1_black = pattern_EventBasedGatewayToStepRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_22_2_blackFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEventBasedGateway = _edge_targetRef.getTrg();
			if (tmpEventBasedGateway instanceof EventBasedGateway) {
				EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
				if (eventBasedGateway.equals(inFlow.getTargetRef())) {
					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(inFlow,
									FlowElementsContainer.class, "flowElements")) {
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (process.getFlowElements().contains(
									eventBasedGateway)) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												eventBasedGateway)) {
											_result.add(new Object[] { inFlow,
													process, eventBasedGateway,
													lane, laneSet,
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

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_22_3_expressionFBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, eventBasedGateway, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_22_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_23_1_binding = pattern_EventBasedGatewayToStepRule_23_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_23_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_23_1_black = pattern_EventBasedGatewayToStepRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_23_2_blackFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEventBasedGateway = _edge_incoming.getSrc();
		if (tmpEventBasedGateway instanceof EventBasedGateway) {
			EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (eventBasedGateway.equals(inFlow.getTargetRef())) {
					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(eventBasedGateway,
									FlowElementsContainer.class, "flowElements")) {
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (process.getFlowElements().contains(inFlow)) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												eventBasedGateway)) {
											_result.add(new Object[] { inFlow,
													process, eventBasedGateway,
													lane, laneSet,
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

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_23_3_expressionFBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, eventBasedGateway, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_23_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_24_1_binding = pattern_EventBasedGatewayToStepRule_24_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_24_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_24_1_black = pattern_EventBasedGatewayToStepRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_24_2_blackFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_actor.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(normalStep.getActor())) {
					for (Step prevStep : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(normalStep, Step.class,
									"next")) {
						if (!normalStep.equals(prevStep)) {
							for (Flow flow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											Flow.class, "steps")) {
								_result.add(new Object[] { prevStep,
										normalStep, actor, flow, _edge_actor });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_24_3_expressionFBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				normalStep, actor, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_24_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_25_1_binding = pattern_EventBasedGatewayToStepRule_25_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_25_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_25_1_black = pattern_EventBasedGatewayToStepRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_25_2_blackFFFFB(
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
						for (Step prevStep : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(normalStep,
										Step.class, "next")) {
							if (!normalStep.equals(prevStep)) {
								_result.add(new Object[] { prevStep,
										normalStep, actor, flow, _edge_steps });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_25_3_expressionFBBBBBB(
			EventBasedGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				normalStep, actor, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_25_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_1_bindingFB(
			EventBasedGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_1_blackFBB(
			EClass __eClass, EventBasedGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_1_bindingAndBlackFFB(
			EventBasedGatewayToStepRule _this) {
		Object[] result_pattern_EventBasedGatewayToStepRule_26_1_binding = pattern_EventBasedGatewayToStepRule_26_1_bindingFB(_this);
		if (result_pattern_EventBasedGatewayToStepRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EventBasedGatewayToStepRule_26_1_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_26_1_black = pattern_EventBasedGatewayToStepRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EventBasedGatewayToStepRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EventBasedGatewayToStepRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_26_2_blackFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpEventBasedGateway = _edge_flowNodeRefs.getTrg();
			if (tmpEventBasedGateway instanceof EventBasedGateway) {
				EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
				if (lane.getFlowNodeRefs().contains(eventBasedGateway)) {
					for (SequenceFlow inFlow : eventBasedGateway.getIncoming()) {
						for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(lane, LaneSet.class,
										"lanes")) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(
											eventBasedGateway,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getLaneSets().contains(laneSet)) {
										if (process.getFlowElements().contains(
												inFlow)) {
											_result.add(new Object[] { inFlow,
													process, eventBasedGateway,
													lane, laneSet,
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

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EventBasedGatewayToStepRule_26_3_expressionFBBBBBBB(
			EventBasedGatewayToStepRule _this, Match match,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, eventBasedGateway, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_26_4_expressionFBB(
			EventBasedGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EventBasedGatewayToStepRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_1_blackB(
			EventBasedGatewayToStepRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToStep inFlowToPrevStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToPrevStep)) {
			return new Object[] { ruleResult, inFlowToPrevStep };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Step prevStep) {
		if (ruleResult.getTargetObjects().contains(prevStep)) {
			return new Object[] { ruleResult, prevStep };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ProcessToActor processToActor) {
		if (ruleResult.getCorrObjects().contains(processToActor)) {
			return new Object[] { ruleResult, processToActor };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getTargetObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EventBasedGatewayToStepRule_29_2_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlowToPrevStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlowToPrevStep : inFlowToPrevStepList
					.getEntryObjects()) {
				if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
					SequenceFlow inFlow = inFlowToPrevStep.getSource();
					if (inFlow != null) {
						Step prevStep = inFlowToPrevStep.getTarget();
						if (prevStep != null) {
							if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_1BB(
									ruleResult, inFlowToPrevStep) == null) {
								if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_0BB(
										ruleResult, inFlow) == null) {
									if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_2BB(
											ruleResult, prevStep) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_3BB(
														ruleResult, process) == null) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_4BB(
																ruleResult,
																laneSet) == null) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_5BB(
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
																			if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_8BB(
																					ruleResult,
																					inFlowToFlow) == null) {
																				if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_9BB(
																						ruleResult,
																						flow) == null) {
																					for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									process,
																									ProcessToActor.class,
																									"source")) {
																						Actor actor = processToActor
																								.getTarget();
																						if (actor != null) {
																							if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_6BB(
																									ruleResult,
																									processToActor) == null) {
																								if (pattern_EventBasedGatewayToStepRule_29_2_black_nac_7BB(
																										ruleResult,
																										actor) == null) {
																									_result.add(new Object[] {
																											inFlowToPrevStepList,
																											inFlow,
																											inFlowToPrevStep,
																											prevStep,
																											process,
																											laneSet,
																											lane,
																											processToActor,
																											actor,
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

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_3_bindingFBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, inFlow, prevStep, inFlowToPrevStep, process,
				actor, processToActor, flow, inFlowToFlow, lane, laneSet,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					prevStep, inFlowToPrevStep, process, actor, processToActor,
					flow, inFlowToFlow, lane, laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_3_bindingAndBlackFBBBBBBBBBBBBB(
			EventBasedGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EventBasedGatewayToStepRule_29_3_binding = pattern_EventBasedGatewayToStepRule_29_3_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				process, actor, processToActor, flow, inFlowToFlow, lane,
				laneSet, ruleResult);
		if (result_pattern_EventBasedGatewayToStepRule_29_3_binding != null) {
			CSP csp = (CSP) result_pattern_EventBasedGatewayToStepRule_29_3_binding[0];

			Object[] result_pattern_EventBasedGatewayToStepRule_29_3_black = pattern_EventBasedGatewayToStepRule_29_3_blackB(csp);
			if (result_pattern_EventBasedGatewayToStepRule_29_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						prevStep, inFlowToPrevStep, process, actor,
						processToActor, flow, inFlowToFlow, lane, laneSet,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EventBasedGatewayToStepRule_29_4_expressionFBB(
			EventBasedGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_5_blackBBBBBBBBBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, process,
				actor, processToActor, flow, inFlowToFlow, lane, laneSet };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_6_blackBBBBBBBBBBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, process,
				actor, processToActor, flow, inFlowToFlow, lane, laneSet,
				ruleResult };
	}

	public static final Object[] pattern_EventBasedGatewayToStepRule_29_6_greenBBFBFBBFBBB(
			SequenceFlow inFlow, Step prevStep, bpmn2.Process process,
			Actor actor, Flow flow, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		EventBasedGateway eventBasedGateway = Bpmn2Factory.eINSTANCE
				.createEventBasedGateway();
		FlowNodeToStep ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		Object _localVariable_2 = csp.getValue("eventBasedGateway", "id");
		Object _localVariable_3 = csp.getValue("eventBasedGateway", "name");
		Object _localVariable_4 = csp.getValue("eventBasedGateway",
				"gatewayDirection");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		prevStep.setNext(normalStep);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		ruleResult.getTargetObjects().add(normalStep);
		process.getFlowElements().add(eventBasedGateway);
		inFlow.setTargetRef(eventBasedGateway);
		lane.getFlowNodeRefs().add(eventBasedGateway);
		ruleResult.getSourceObjects().add(eventBasedGateway);
		ebgToNormalStep.setSource(eventBasedGateway);
		ebgToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(ebgToNormalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		String eventBasedGateway_id_prime = (String) _localVariable_2;
		String eventBasedGateway_name_prime = (String) _localVariable_3;
		GatewayDirection eventBasedGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		eventBasedGateway.setId(eventBasedGateway_id_prime);
		eventBasedGateway.setName(eventBasedGateway_name_prime);
		eventBasedGateway
				.setGatewayDirection(eventBasedGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { inFlow, prevStep, normalStep, process,
				eventBasedGateway, actor, flow, ebgToNormalStep, lane,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EventBasedGatewayToStepRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EventBasedGatewayToStepRuleImpl
