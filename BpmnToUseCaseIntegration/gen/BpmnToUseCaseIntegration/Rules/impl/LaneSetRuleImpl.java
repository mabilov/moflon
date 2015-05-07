/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.Rules.LaneSetRule;
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

import bpmn2.Bpmn2Factory;
import bpmn2.FlowElementsContainer;
import bpmn2.LaneSet;

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
 * An implementation of the model object '<em><b>Lane Set Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaneSetRuleImpl extends AbstractRuleImpl implements LaneSetRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneSetRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLaneSetRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = LaneSetRuleImpl
				.pattern_LaneSetRule_0_1_blackBBBB(this, match, process,
						laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LaneSetRuleImpl
				.pattern_LaneSetRule_0_2_bindingAndBlackFBBBB(this, match,
						process, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LaneSetRuleImpl.pattern_LaneSetRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LaneSetRuleImpl
					.pattern_LaneSetRule_0_4_blackBBB(match, process, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			LaneSetRuleImpl.pattern_LaneSetRule_0_4_greenBBBF(match, process,
					laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LaneSetRuleImpl
					.pattern_LaneSetRule_0_5_blackBBB(match, process, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			LaneSetRuleImpl.pattern_LaneSetRule_0_5_greenBB(match, process);

			// register objects to match
			LaneSetRuleImpl.pattern_LaneSetRule_0_6_expressionBBBB(this, match,
					process, laneSet);
			return LaneSetRuleImpl.pattern_LaneSetRule_0_7_expressionF();
		} else {
			return LaneSetRuleImpl.pattern_LaneSetRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LaneSetRuleImpl
				.pattern_LaneSetRule_1_1_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[1];
		// CSP csp = (CSP) result1_bindingAndBlack[2];

		// collect translated elements
		Object[] result2_black = LaneSetRuleImpl
				.pattern_LaneSetRule_1_2_blackB(laneSet);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = LaneSetRuleImpl
				.pattern_LaneSetRule_1_2_greenFB(laneSet);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LaneSetRuleImpl
				.pattern_LaneSetRule_1_3_blackBBB(ruleresult, process, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		LaneSetRuleImpl.pattern_LaneSetRule_1_3_greenBBBF(ruleresult, process,
				laneSet);
		// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[3];

		// perform postprocessing story node is empty
		// register objects
		LaneSetRuleImpl.pattern_LaneSetRule_1_5_expressionBBBB(this,
				ruleresult, process, laneSet);
		return LaneSetRuleImpl.pattern_LaneSetRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneSetRuleImpl
				.pattern_LaneSetRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneSetRuleImpl
				.pattern_LaneSetRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LaneSetRuleImpl
				.pattern_LaneSetRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		LaneSet laneSet = (LaneSet) result2_binding[1];
		for (Object[] result2_black : LaneSetRuleImpl
				.pattern_LaneSetRule_2_2_blackBBB(process, laneSet, match)) {
			// ForEach find context
			for (Object[] result3_black : LaneSetRuleImpl
					.pattern_LaneSetRule_2_3_blackBB(process, laneSet)) {
				Object[] result3_green = LaneSetRuleImpl
						.pattern_LaneSetRule_2_3_greenBBFF(process, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[3];

				// solve CSP
				Object[] result4_bindingAndBlack = LaneSetRuleImpl
						.pattern_LaneSetRule_2_4_bindingAndBlackFBBBB(this,
								isApplicableMatch, process, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LaneSetRuleImpl.pattern_LaneSetRule_2_5_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = LaneSetRuleImpl
							.pattern_LaneSetRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					LaneSetRuleImpl.pattern_LaneSetRule_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LaneSetRuleImpl.pattern_LaneSetRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			LaneSet laneSet) {// Create CSP
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
			bpmn2.Process process, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject process, EObject laneSet) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("laneSet").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getLaneSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_230(
			EMoflonEdge _edge_laneSets) {
		// prepare return value
		Object[] result1_bindingAndBlack = LaneSetRuleImpl
				.pattern_LaneSetRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LaneSetRuleImpl
				.pattern_LaneSetRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LaneSetRuleImpl
				.pattern_LaneSetRule_10_2_blackFFB(_edge_laneSets)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			LaneSet laneSet = (LaneSet) result2_black[1];
			Object[] result2_green = LaneSetRuleImpl
					.pattern_LaneSetRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LaneSetRuleImpl.pattern_LaneSetRule_10_3_expressionFBBBB(this,
					match, process, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (LaneSetRuleImpl.pattern_LaneSetRule_10_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = LaneSetRuleImpl
							.pattern_LaneSetRule_10_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					LaneSetRuleImpl.pattern_LaneSetRule_10_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LaneSetRuleImpl.pattern_LaneSetRule_10_6_expressionFB(__result);
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
			bpmn2.Process processParameter) {
		// create result
		Object[] result1_black = LaneSetRuleImpl
				.pattern_LaneSetRule_12_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = LaneSetRuleImpl
				.pattern_LaneSetRule_12_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LaneSetRuleImpl
				.pattern_LaneSetRule_12_2_blackFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList processList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];

			// solve CSP
			Object[] result3_bindingAndBlack = LaneSetRuleImpl
					.pattern_LaneSetRule_12_3_bindingAndBlackFBBBB(this,
							isApplicableMatch, process, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LaneSetRuleImpl.pattern_LaneSetRule_12_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = LaneSetRuleImpl
						.pattern_LaneSetRule_12_5_blackB(process);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LaneSetRuleImpl
							.pattern_LaneSetRule_12_6_blackBB(process,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					LaneSetRuleImpl.pattern_LaneSetRule_12_6_greenBFB(process,
							ruleResult);
					// LaneSet laneSet = (LaneSet) result6_green[1];

				} else {
				}

			} else {
			}

		}
		return LaneSetRuleImpl
				.pattern_LaneSetRule_12_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.LANE_SET_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(LaneSet) arguments.get(2));
		case RulesPackage.LANE_SET_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_SET_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_SET_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(LaneSet) arguments.get(2));
			return null;
		case RulesPackage.LANE_SET_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(LaneSet) arguments.get(2));
		case RulesPackage.LANE_SET_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_SET_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(LaneSet) arguments.get(2));
		case RulesPackage.LANE_SET_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_SET_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2));
			return null;
		case RulesPackage.LANE_SET_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_SET_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_230__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_230((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_SET_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LANE_SET_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PROCESS:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(bpmn2.Process) arguments.get(1));
		case RulesPackage.LANE_SET_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(ModelgeneratorRuleResult) arguments.get(2));
		case RulesPackage.LANE_SET_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LaneSetRule_0_1_blackBBBB(
			LaneSetRule _this, Match match, bpmn2.Process process,
			LaneSet laneSet) {
		return new Object[] { _this, match, process, laneSet };
	}

	public static final Object[] pattern_LaneSetRule_0_2_bindingFBBBB(
			LaneSetRule _this, Match match, bpmn2.Process process,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneSetRule_0_2_bindingAndBlackFBBBB(
			LaneSetRule _this, Match match, bpmn2.Process process,
			LaneSet laneSet) {
		Object[] result_pattern_LaneSetRule_0_2_binding = pattern_LaneSetRule_0_2_bindingFBBBB(
				_this, match, process, laneSet);
		if (result_pattern_LaneSetRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_LaneSetRule_0_2_binding[0];

			Object[] result_pattern_LaneSetRule_0_2_black = pattern_LaneSetRule_0_2_blackB(csp);
			if (result_pattern_LaneSetRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneSetRule_0_3_expressionFBB(
			LaneSetRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_0_4_blackBBB(Match match,
			bpmn2.Process process, LaneSet laneSet) {
		return new Object[] { match, process, laneSet };
	}

	public static final Object[] pattern_LaneSetRule_0_4_greenBBBF(Match match,
			bpmn2.Process process, LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(laneSet);
		String process__laneSet____laneSets_name_prime = "laneSets";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getToBeTranslatedEdges().add(process__laneSet____laneSets);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		return new Object[] { match, process, laneSet,
				process__laneSet____laneSets };
	}

	public static final Object[] pattern_LaneSetRule_0_5_blackBBB(Match match,
			bpmn2.Process process, LaneSet laneSet) {
		return new Object[] { match, process, laneSet };
	}

	public static final Object[] pattern_LaneSetRule_0_5_greenBB(Match match,
			bpmn2.Process process) {
		match.getContextNodes().add(process);
		return new Object[] { match, process };
	}

	public static final void pattern_LaneSetRule_0_6_expressionBBBB(
			LaneSetRule _this, Match match, bpmn2.Process process,
			LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, process, laneSet);

	}

	public static final boolean pattern_LaneSetRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LaneSetRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_1_1_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("laneSet");
		EObject tmpProcess = _localVariable_0;
		EObject tmpLaneSet = _localVariable_1;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpLaneSet instanceof LaneSet) {
				LaneSet laneSet = (LaneSet) tmpLaneSet;
				return new Object[] { process, laneSet, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_1_1_blackBBFBB(
			bpmn2.Process process, LaneSet laneSet, LaneSetRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_1_1_bindingAndBlackFFFBB(
			LaneSetRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LaneSetRule_1_1_binding = pattern_LaneSetRule_1_1_bindingFFB(isApplicableMatch);
		if (result_pattern_LaneSetRule_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_LaneSetRule_1_1_binding[0];
			LaneSet laneSet = (LaneSet) result_pattern_LaneSetRule_1_1_binding[1];

			Object[] result_pattern_LaneSetRule_1_1_black = pattern_LaneSetRule_1_1_blackBBFBB(
					process, laneSet, _this, isApplicableMatch);
			if (result_pattern_LaneSetRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_LaneSetRule_1_1_black[2];

				return new Object[] { process, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_1_2_blackB(LaneSet laneSet) {
		return new Object[] { laneSet };
	}

	public static final Object[] pattern_LaneSetRule_1_2_greenFB(LaneSet laneSet) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(laneSet);
		return new Object[] { ruleresult, laneSet };
	}

	public static final Object[] pattern_LaneSetRule_1_3_blackBBB(
			PerformRuleResult ruleresult, EObject process, EObject laneSet) {
		if (!laneSet.equals(process)) {
			return new Object[] { ruleresult, process, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_1_3_greenBBBF(
			PerformRuleResult ruleresult, EObject process, EObject laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LaneSetRule";
		String process__laneSet____laneSets_name_prime = "laneSets";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		ruleresult.getTranslatedEdges().add(process__laneSet____laneSets);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		return new Object[] { ruleresult, process, laneSet,
				process__laneSet____laneSets };
	}

	public static final void pattern_LaneSetRule_1_5_expressionBBBB(
			LaneSetRule _this, PerformRuleResult ruleresult, EObject process,
			EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, process, laneSet);

	}

	public static final PerformRuleResult pattern_LaneSetRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_2_1_bindingFB(
			LaneSetRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_2_1_blackFBB(
			EClass eClass, LaneSetRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_2_1_bindingAndBlackFFB(
			LaneSetRule _this) {
		Object[] result_pattern_LaneSetRule_2_1_binding = pattern_LaneSetRule_2_1_bindingFB(_this);
		if (result_pattern_LaneSetRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LaneSetRule_2_1_binding[0];

			Object[] result_pattern_LaneSetRule_2_1_black = pattern_LaneSetRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_LaneSetRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LaneSetRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LaneSetRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LaneSetRule_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("laneSet");
		EObject tmpProcess = _localVariable_0;
		EObject tmpLaneSet = _localVariable_1;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpLaneSet instanceof LaneSet) {
				LaneSet laneSet = (LaneSet) tmpLaneSet;
				return new Object[] { process, laneSet, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneSetRule_2_2_blackBBB(
			bpmn2.Process process, LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { process, laneSet, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_LaneSetRule_2_3_blackBB(
			bpmn2.Process process, LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getLaneSets().contains(laneSet)) {
			_result.add(new Object[] { process, laneSet });
		}
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_2_3_greenBBFF(
			bpmn2.Process process, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__laneSet____laneSets_name_prime = "laneSets";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(laneSet);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		return new Object[] { process, laneSet, isApplicableMatch,
				process__laneSet____laneSets };
	}

	public static final Object[] pattern_LaneSetRule_2_4_bindingFBBBB(
			LaneSetRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					laneSet };
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneSetRule_2_4_bindingAndBlackFBBBB(
			LaneSetRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, LaneSet laneSet) {
		Object[] result_pattern_LaneSetRule_2_4_binding = pattern_LaneSetRule_2_4_bindingFBBBB(
				_this, isApplicableMatch, process, laneSet);
		if (result_pattern_LaneSetRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_LaneSetRule_2_4_binding[0];

			Object[] result_pattern_LaneSetRule_2_4_black = pattern_LaneSetRule_2_4_blackB(csp);
			if (result_pattern_LaneSetRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneSetRule_2_5_expressionFBB(
			LaneSetRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LaneSetRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LaneSetRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LaneSetRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_10_1_bindingFB(
			LaneSetRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_10_1_blackFBB(
			EClass __eClass, LaneSetRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_10_1_bindingAndBlackFFB(
			LaneSetRule _this) {
		Object[] result_pattern_LaneSetRule_10_1_binding = pattern_LaneSetRule_10_1_bindingFB(_this);
		if (result_pattern_LaneSetRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LaneSetRule_10_1_binding[0];

			Object[] result_pattern_LaneSetRule_10_1_black = pattern_LaneSetRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_LaneSetRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LaneSetRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LaneSetRule_10_2_black_nac_0BB(
			LaneSet laneSet, bpmn2.Process process) {
		for (FlowElementsContainer __DEC_laneSet_laneSets_974591 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(laneSet,
						FlowElementsContainer.class, "laneSets")) {
			if (!process.equals(__DEC_laneSet_laneSets_974591)) {
				return new Object[] { laneSet, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneSetRule_10_2_blackFFB(
			EMoflonEdge _edge_laneSets) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_laneSets.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpLaneSet = _edge_laneSets.getTrg();
			if (tmpLaneSet instanceof LaneSet) {
				LaneSet laneSet = (LaneSet) tmpLaneSet;
				if (process.getLaneSets().contains(laneSet)) {
					if (pattern_LaneSetRule_10_2_black_nac_0BB(laneSet, process) == null) {
						_result.add(new Object[] { process, laneSet,
								_edge_laneSets });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LaneSetRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LaneSetRule_10_3_expressionFBBBB(
			LaneSetRule _this, Match match, bpmn2.Process process,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LaneSetRule_10_4_expressionFBB(
			LaneSetRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_10_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LaneSetRule_10_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LaneSetRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_12_1_blackB(
			LaneSetRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LaneSetRule_12_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LaneSetRule_12_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LaneSetRule_12_2_blackFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList processList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpProcess : processList.getEntryObjects()) {
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (pattern_LaneSetRule_12_2_black_nac_0BB(ruleResult,
							process) == null) {
						_result.add(new Object[] { processList, process,
								ruleEntryContainer, ruleResult });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_12_3_bindingFBBBB(
			LaneSetRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LaneSetRule_12_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LaneSetRule_12_3_bindingAndBlackFBBBB(
			LaneSetRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LaneSetRule_12_3_binding = pattern_LaneSetRule_12_3_bindingFBBBB(
				_this, isApplicableMatch, process, ruleResult);
		if (result_pattern_LaneSetRule_12_3_binding != null) {
			CSP csp = (CSP) result_pattern_LaneSetRule_12_3_binding[0];

			Object[] result_pattern_LaneSetRule_12_3_black = pattern_LaneSetRule_12_3_blackB(csp);
			if (result_pattern_LaneSetRule_12_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LaneSetRule_12_4_expressionFBB(
			LaneSetRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LaneSetRule_12_5_blackB(
			bpmn2.Process process) {
		return new Object[] { process };
	}

	public static final Object[] pattern_LaneSetRule_12_6_blackBB(
			bpmn2.Process process, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, ruleResult };
	}

	public static final Object[] pattern_LaneSetRule_12_6_greenBFB(
			bpmn2.Process process, ModelgeneratorRuleResult ruleResult) {
		LaneSet laneSet = Bpmn2Factory.eINSTANCE.createLaneSet();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		process.getLaneSets().add(laneSet);
		ruleResult.getSourceObjects().add(laneSet);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, laneSet, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LaneSetRule_12_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LaneSetRuleImpl
