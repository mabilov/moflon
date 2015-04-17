/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.Rules.LaneStartEventRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

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

import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.Lane;
import bpmn2.LaneSet;
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
 * An implementation of the model object '<em><b>Lane Start Event Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaneStartEventRuleImpl extends AbstractRuleImpl implements
		LaneStartEventRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneStartEventRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLaneStartEventRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_0_1_blackBBBBBB(this, match, lane,
						flowNode, process, laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_0_2_bindingAndBlackFBBBBBB(this,
						match, lane, flowNode, process, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_0_4_blackBBBBB(match, lane,
							flowNode, process, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			LaneStartEventRuleImpl.pattern_LaneStartEventRule_0_4_greenBBBF(
					match, lane, flowNode);
			// EMoflonEdge lane__flowNode____flowNodeRefs = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_0_5_blackBBBBB(match, lane,
							flowNode, process, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_0_5_greenBBBBBFFF(match, lane,
							flowNode, process, laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__flowNode____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_0_6_expressionBBBBBB(this,
							match, lane, flowNode, process, laneSet);
			return LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_0_7_expressionF();
		} else {
			return LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Lane lane = (Lane) result1_bindingAndBlack[0];
		StartEvent flowNode = (StartEvent) result1_bindingAndBlack[1];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[2];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];

		// collect translated elements
		Object[] result2_green = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_1_3_blackBBBBB(ruleresult, lane,
						flowNode, process, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		LaneStartEventRuleImpl.pattern_LaneStartEventRule_1_3_greenBBBF(
				ruleresult, lane, flowNode);
		// EMoflonEdge lane__flowNode____flowNodeRefs = (EMoflonEdge) result3_green[3];

		// perform postprocessing story node is empty
		// register objects
		LaneStartEventRuleImpl.pattern_LaneStartEventRule_1_5_expressionBBBBBB(
				this, ruleresult, lane, flowNode, process, laneSet);
		return LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Lane lane = (Lane) result2_binding[0];
		StartEvent flowNode = (StartEvent) result2_binding[1];
		bpmn2.Process process = (bpmn2.Process) result2_binding[2];
		LaneSet laneSet = (LaneSet) result2_binding[3];
		for (Object[] result2_black : LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_2_2_blackBBBBB(lane, flowNode,
						process, laneSet, match)) {
			// ForEach find context
			for (Object[] result3_black : LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_2_3_blackBBBB(lane, flowNode,
							process, laneSet)) {
				Object[] result3_green = LaneStartEventRuleImpl
						.pattern_LaneStartEventRule_2_3_greenBBBBFFFFF(lane,
								flowNode, process, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge lane__flowNode____flowNodeRefs = (EMoflonEdge) result3_green[5];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[6];
				// EMoflonEdge process__flowNode____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[8];

				// solve CSP
				Object[] result4_bindingAndBlack = LaneStartEventRuleImpl
						.pattern_LaneStartEventRule_2_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, lane, flowNode,
								process, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LaneStartEventRuleImpl
						.pattern_LaneStartEventRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LaneStartEventRuleImpl
							.pattern_LaneStartEventRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					LaneStartEventRuleImpl
							.pattern_LaneStartEventRule_2_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		match.registerObject("lane", lane);
		match.registerObject("flowNode", flowNode);
		match.registerObject("process", process);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {// Create CSP
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
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("process", process);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject lane,
			EObject flowNode, EObject process, EObject laneSet) {
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_93(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_10_2_blackFFFFB(_edge_flowNodeRefs)) {
			Lane lane = (Lane) result2_black[0];
			StartEvent flowNode = (StartEvent) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			LaneSet laneSet = (LaneSet) result2_black[3];
			Object[] result2_green = LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_10_3_expressionFBBBBBB(this,
							match, lane, flowNode, process, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (LaneStartEventRuleImpl
						.pattern_LaneStartEventRule_10_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = LaneStartEventRuleImpl
							.pattern_LaneStartEventRule_10_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					LaneStartEventRuleImpl
							.pattern_LaneStartEventRule_10_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_10_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer, Lane laneParameter) {
		// create result
		Object[] result1_black = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_12_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_12_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_12_2_blackFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList laneList = (RuleEntryList) result2_black[0];
			Lane lane = (Lane) result2_black[1];
			LaneSet laneSet = (LaneSet) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			StartEvent flowNode = (StartEvent) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_12_3_bindingAndBlackFBBBBBBB(
							this, isApplicableMatch, lane, flowNode, process,
							laneSet, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LaneStartEventRuleImpl
					.pattern_LaneStartEventRule_12_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = LaneStartEventRuleImpl
						.pattern_LaneStartEventRule_12_5_blackBBBB(lane,
								flowNode, process, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LaneStartEventRuleImpl
							.pattern_LaneStartEventRule_12_6_blackBBBBB(lane,
									flowNode, process, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					LaneStartEventRuleImpl
							.pattern_LaneStartEventRule_12_6_greenBBB(lane,
									flowNode, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LaneStartEventRuleImpl
				.pattern_LaneStartEventRule_12_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("process", process);
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
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_FWD__MATCH_LANE_STARTEVENT_PROCESS_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
		case RulesPackage.LANE_START_EVENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LANE_STARTEVENT_PROCESS_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
			return null;
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LANE_STARTEVENT_PROCESS_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LANE_STARTEVENT_PROCESS_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.LANE_START_EVENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_93((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_LANE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(Lane) arguments.get(1));
		case RulesPackage.LANE_START_EVENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANE_STARTEVENT_PROCESS_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.LANE_START_EVENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LaneStartEventRule_0_1_blackBBBBBB(
			LaneStartEventRule _this, Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		return new Object[] { _this, match, lane, flowNode, process, laneSet };
	}

	public static final Object[] pattern_LaneStartEventRule_0_2_bindingFBBBBBB(
			LaneStartEventRule _this, Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, lane,
				flowNode, process, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, lane, flowNode, process,
					laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneStartEventRule_0_2_bindingAndBlackFBBBBBB(
			LaneStartEventRule _this, Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		Object[] result_pattern_LaneStartEventRule_0_2_binding = pattern_LaneStartEventRule_0_2_bindingFBBBBBB(
				_this, match, lane, flowNode, process, laneSet);
		if (result_pattern_LaneStartEventRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_LaneStartEventRule_0_2_binding[0];

			Object[] result_pattern_LaneStartEventRule_0_2_black = pattern_LaneStartEventRule_0_2_blackB(csp);
			if (result_pattern_LaneStartEventRule_0_2_black != null) {

				return new Object[] { csp, _this, match, lane, flowNode,
						process, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneStartEventRule_0_3_expressionFBB(
			LaneStartEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_0_4_blackBBBBB(
			Match match, Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		return new Object[] { match, lane, flowNode, process, laneSet };
	}

	public static final Object[] pattern_LaneStartEventRule_0_4_greenBBBF(
			Match match, Lane lane, StartEvent flowNode) {
		EMoflonEdge lane__flowNode____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String lane__flowNode____flowNodeRefs_name_prime = "flowNodeRefs";
		lane__flowNode____flowNodeRefs.setSrc(lane);
		lane__flowNode____flowNodeRefs.setTrg(flowNode);
		match.getToBeTranslatedEdges().add(lane__flowNode____flowNodeRefs);
		lane__flowNode____flowNodeRefs
				.setName(lane__flowNode____flowNodeRefs_name_prime);
		return new Object[] { match, lane, flowNode,
				lane__flowNode____flowNodeRefs };
	}

	public static final Object[] pattern_LaneStartEventRule_0_5_blackBBBBB(
			Match match, Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		return new Object[] { match, lane, flowNode, process, laneSet };
	}

	public static final Object[] pattern_LaneStartEventRule_0_5_greenBBBBBFFF(
			Match match, Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__flowNode____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(lane);
		match.getContextNodes().add(flowNode);
		match.getContextNodes().add(process);
		match.getContextNodes().add(laneSet);
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__flowNode____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__flowNode____flowElements.setSrc(process);
		process__flowNode____flowElements.setTrg(flowNode);
		match.getContextEdges().add(process__flowNode____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__flowNode____flowElements
				.setName(process__flowNode____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, lane, flowNode, process, laneSet,
				process__laneSet____laneSets,
				process__flowNode____flowElements, laneSet__lane____lanes };
	}

	public static final void pattern_LaneStartEventRule_0_6_expressionBBBBBB(
			LaneStartEventRule _this, Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, lane, flowNode, process,
				laneSet);

	}

	public static final boolean pattern_LaneStartEventRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LaneStartEventRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("lane");
		EObject _localVariable_1 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("laneSet");
		EObject tmpLane = _localVariable_0;
		EObject tmpFlowNode = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpLaneSet = _localVariable_3;
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			if (tmpFlowNode instanceof StartEvent) {
				StartEvent flowNode = (StartEvent) tmpFlowNode;
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (tmpLaneSet instanceof LaneSet) {
						LaneSet laneSet = (LaneSet) tmpLaneSet;
						return new Object[] { lane, flowNode, process, laneSet,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_1_1_blackBBBBFBB(
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet, LaneStartEventRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { lane, flowNode, process, laneSet, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_1_1_bindingAndBlackFFFFFBB(
			LaneStartEventRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LaneStartEventRule_1_1_binding = pattern_LaneStartEventRule_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_LaneStartEventRule_1_1_binding != null) {
			Lane lane = (Lane) result_pattern_LaneStartEventRule_1_1_binding[0];
			StartEvent flowNode = (StartEvent) result_pattern_LaneStartEventRule_1_1_binding[1];
			bpmn2.Process process = (bpmn2.Process) result_pattern_LaneStartEventRule_1_1_binding[2];
			LaneSet laneSet = (LaneSet) result_pattern_LaneStartEventRule_1_1_binding[3];

			Object[] result_pattern_LaneStartEventRule_1_1_black = pattern_LaneStartEventRule_1_1_blackBBBBFBB(
					lane, flowNode, process, laneSet, _this, isApplicableMatch);
			if (result_pattern_LaneStartEventRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_LaneStartEventRule_1_1_black[4];

				return new Object[] { lane, flowNode, process, laneSet, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LaneStartEventRule_1_3_blackBBBBB(
			PerformRuleResult ruleresult, EObject lane, EObject flowNode,
			EObject process, EObject laneSet) {
		if (!lane.equals(process)) {
			if (!lane.equals(laneSet)) {
				if (!flowNode.equals(lane)) {
					if (!flowNode.equals(process)) {
						if (!flowNode.equals(laneSet)) {
							if (!laneSet.equals(process)) {
								return new Object[] { ruleresult, lane,
										flowNode, process, laneSet };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_1_3_greenBBBF(
			PerformRuleResult ruleresult, EObject lane, EObject flowNode) {
		EMoflonEdge lane__flowNode____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LaneStartEventRule";
		String lane__flowNode____flowNodeRefs_name_prime = "flowNodeRefs";
		lane__flowNode____flowNodeRefs.setSrc(lane);
		lane__flowNode____flowNodeRefs.setTrg(flowNode);
		ruleresult.getTranslatedEdges().add(lane__flowNode____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		lane__flowNode____flowNodeRefs
				.setName(lane__flowNode____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, lane, flowNode,
				lane__flowNode____flowNodeRefs };
	}

	public static final void pattern_LaneStartEventRule_1_5_expressionBBBBBB(
			LaneStartEventRule _this, PerformRuleResult ruleresult,
			EObject lane, EObject flowNode, EObject process, EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, lane, flowNode, process, laneSet);

	}

	public static final PerformRuleResult pattern_LaneStartEventRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_2_1_bindingFB(
			LaneStartEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_2_1_blackFBB(
			EClass eClass, LaneStartEventRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_2_1_bindingAndBlackFFB(
			LaneStartEventRule _this) {
		Object[] result_pattern_LaneStartEventRule_2_1_binding = pattern_LaneStartEventRule_2_1_bindingFB(_this);
		if (result_pattern_LaneStartEventRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LaneStartEventRule_2_1_binding[0];

			Object[] result_pattern_LaneStartEventRule_2_1_black = pattern_LaneStartEventRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_LaneStartEventRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LaneStartEventRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LaneStartEventRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LaneStartEventRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("lane");
		EObject _localVariable_1 = match.getObject("flowNode");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("laneSet");
		EObject tmpLane = _localVariable_0;
		EObject tmpFlowNode = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpLaneSet = _localVariable_3;
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			if (tmpFlowNode instanceof StartEvent) {
				StartEvent flowNode = (StartEvent) tmpFlowNode;
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (tmpLaneSet instanceof LaneSet) {
						LaneSet laneSet = (LaneSet) tmpLaneSet;
						return new Object[] { lane, flowNode, process, laneSet,
								match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneStartEventRule_2_2_blackBBBBB(
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { lane, flowNode, process, laneSet, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_LaneStartEventRule_2_3_blackBBBB(
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (lane.getFlowNodeRefs().contains(flowNode)) {
			if (process.getLaneSets().contains(laneSet)) {
				if (process.getFlowElements().contains(flowNode)) {
					if (laneSet.getLanes().contains(lane)) {
						_result.add(new Object[] { lane, flowNode, process,
								laneSet });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_2_3_greenBBBBFFFFF(
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge lane__flowNode____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__flowNode____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String lane__flowNode____flowNodeRefs_name_prime = "flowNodeRefs";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__flowNode____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(flowNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(laneSet);
		lane__flowNode____flowNodeRefs.setSrc(lane);
		lane__flowNode____flowNodeRefs.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				lane__flowNode____flowNodeRefs);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__flowNode____flowElements.setSrc(process);
		process__flowNode____flowElements.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				process__flowNode____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		lane__flowNode____flowNodeRefs
				.setName(lane__flowNode____flowNodeRefs_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__flowNode____flowElements
				.setName(process__flowNode____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { lane, flowNode, process, laneSet,
				isApplicableMatch, lane__flowNode____flowNodeRefs,
				process__laneSet____laneSets,
				process__flowNode____flowElements, laneSet__lane____lanes };
	}

	public static final Object[] pattern_LaneStartEventRule_2_4_bindingFBBBBBB(
			LaneStartEventRule _this, IsApplicableMatch isApplicableMatch,
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, lane, flowNode, process, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, lane,
					flowNode, process, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneStartEventRule_2_4_bindingAndBlackFBBBBBB(
			LaneStartEventRule _this, IsApplicableMatch isApplicableMatch,
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		Object[] result_pattern_LaneStartEventRule_2_4_binding = pattern_LaneStartEventRule_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, lane, flowNode, process, laneSet);
		if (result_pattern_LaneStartEventRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_LaneStartEventRule_2_4_binding[0];

			Object[] result_pattern_LaneStartEventRule_2_4_black = pattern_LaneStartEventRule_2_4_blackB(csp);
			if (result_pattern_LaneStartEventRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, lane,
						flowNode, process, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneStartEventRule_2_5_expressionFBB(
			LaneStartEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LaneStartEventRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LaneStartEventRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LaneStartEventRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_10_1_bindingFB(
			LaneStartEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_10_1_blackFBB(
			EClass __eClass, LaneStartEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_10_1_bindingAndBlackFFB(
			LaneStartEventRule _this) {
		Object[] result_pattern_LaneStartEventRule_10_1_binding = pattern_LaneStartEventRule_10_1_bindingFB(_this);
		if (result_pattern_LaneStartEventRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LaneStartEventRule_10_1_binding[0];

			Object[] result_pattern_LaneStartEventRule_10_1_black = pattern_LaneStartEventRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_LaneStartEventRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LaneStartEventRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LaneStartEventRule_10_2_blackFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpFlowNode = _edge_flowNodeRefs.getTrg();
			if (tmpFlowNode instanceof StartEvent) {
				StartEvent flowNode = (StartEvent) tmpFlowNode;
				if (lane.getFlowNodeRefs().contains(flowNode)) {
					for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(lane, LaneSet.class,
									"lanes")) {
						for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(flowNode,
										FlowElementsContainer.class,
										"flowElements")) {
							if (tmpProcess instanceof bpmn2.Process) {
								bpmn2.Process process = (bpmn2.Process) tmpProcess;
								if (process.getLaneSets().contains(laneSet)) {
									_result.add(new Object[] { lane, flowNode,
											process, laneSet,
											_edge_flowNodeRefs });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LaneStartEventRule_10_3_expressionFBBBBBB(
			LaneStartEventRule _this, Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, lane,
				flowNode, process, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LaneStartEventRule_10_4_expressionFBB(
			LaneStartEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LaneStartEventRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LaneStartEventRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_12_1_blackB(
			LaneStartEventRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LaneStartEventRule_12_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LaneStartEventRule_12_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_12_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_12_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_12_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, StartEvent flowNode) {
		if (ruleResult.getSourceObjects().contains(flowNode)) {
			return new Object[] { ruleResult, flowNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneStartEventRule_12_2_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList laneList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpLane : laneList.getEntryObjects()) {
				if (tmpLane instanceof Lane) {
					Lane lane = (Lane) tmpLane;
					if (pattern_LaneStartEventRule_12_2_black_nac_0BB(
							ruleResult, lane) == null) {
						for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(lane, LaneSet.class,
										"lanes")) {
							if (pattern_LaneStartEventRule_12_2_black_nac_1BB(
									ruleResult, laneSet) == null) {
								for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(laneSet,
												FlowElementsContainer.class,
												"laneSets")) {
									if (tmpProcess instanceof bpmn2.Process) {
										bpmn2.Process process = (bpmn2.Process) tmpProcess;
										if (pattern_LaneStartEventRule_12_2_black_nac_2BB(
												ruleResult, process) == null) {
											for (FlowElement tmpFlowNode : process
													.getFlowElements()) {
												if (tmpFlowNode instanceof StartEvent) {
													StartEvent flowNode = (StartEvent) tmpFlowNode;
													if (pattern_LaneStartEventRule_12_2_black_nac_3BB(
															ruleResult,
															flowNode) == null) {
														_result.add(new Object[] {
																laneList,
																lane,
																laneSet,
																process,
																flowNode,
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
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_12_3_bindingFBBBBBBB(
			LaneStartEventRule _this, IsApplicableMatch isApplicableMatch,
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this
				.generateModel_solveCsp_BWD(isApplicableMatch, lane, flowNode,
						process, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, lane,
					flowNode, process, laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LaneStartEventRule_12_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneStartEventRule_12_3_bindingAndBlackFBBBBBBB(
			LaneStartEventRule _this, IsApplicableMatch isApplicableMatch,
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LaneStartEventRule_12_3_binding = pattern_LaneStartEventRule_12_3_bindingFBBBBBBB(
				_this, isApplicableMatch, lane, flowNode, process, laneSet,
				ruleResult);
		if (result_pattern_LaneStartEventRule_12_3_binding != null) {
			CSP csp = (CSP) result_pattern_LaneStartEventRule_12_3_binding[0];

			Object[] result_pattern_LaneStartEventRule_12_3_black = pattern_LaneStartEventRule_12_3_blackB(csp);
			if (result_pattern_LaneStartEventRule_12_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, lane,
						flowNode, process, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneStartEventRule_12_4_expressionFBB(
			LaneStartEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneStartEventRule_12_5_blackBBBB(
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		return new Object[] { lane, flowNode, process, laneSet };
	}

	public static final Object[] pattern_LaneStartEventRule_12_6_blackBBBBB(
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { lane, flowNode, process, laneSet, ruleResult };
	}

	public static final Object[] pattern_LaneStartEventRule_12_6_greenBBB(
			Lane lane, StartEvent flowNode, ModelgeneratorRuleResult ruleResult) {
		lane.getFlowNodeRefs().add(flowNode);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { lane, flowNode, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LaneStartEventRule_12_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LaneStartEventRuleImpl
